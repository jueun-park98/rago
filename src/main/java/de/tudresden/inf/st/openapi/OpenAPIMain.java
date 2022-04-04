package de.tudresden.inf.st.openapi;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.tudresden.inf.st.openapi.ast.*;
import io.swagger.models.reader.SwaggerParser;
import io.swagger.parser.OpenAPIParser;
import io.swagger.report.MessageBuilder;
import io.swagger.util.Yaml;
import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.parser.OpenAPIV3Parser;
import io.swagger.v3.parser.core.models.ParseOptions;
import io.swagger.v3.parser.core.models.SwaggerParseResult;
import io.swagger.v3.parser.util.OpenAPIDeserializer;
import io.swagger.validate.ApiDeclarationJsonValidator;
import io.swagger.validate.SwaggerSchemaValidator;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OpenAPIMain {
    static List<String> successfulUrls = new ArrayList<>();

    /**
     * main-method, calls the set of methods to test the OpenAPI-Generator with JastAdd
     **/
    public static void main(String[] args) throws Exception {
        String fileName = "./src/main/resources/3.0/petstore.yaml";
        OpenAPIObject jastAddObject;
        SwaggerParseResult result = new OpenAPIParser().readLocation(fileName, null, null);
        OpenAPI openAPI = result.getOpenAPI();
        List<String> generatedURLs, dictionary;
        List<String> inferredURLs = new ArrayList<>();

        jastAddObject = OpenAPIObject.parseOpenAPI(openAPI);

        generatedURLs = jastAddObject.generateRequests();
        dictionary = sendRandomRequests(jastAddObject, generatedURLs);

        for ( PathsObject p : jastAddObject.getPList() )
            inferredURLs.addAll(p.inferUrl(dictionary));
        sendInferredRequests(jastAddObject, inferredURLs);
        System.out.println("Requests generated by Parameter Inference are :");
        for ( String url : successfulUrls )
            System.out.println("--> " + url);

        URL expUrl = OpenAPIMain.class.getClassLoader().getResource(fileName);
        File file = null;
        if (expUrl != null) {
            file = new File(expUrl.getFile());
        } else {
            file = new File(fileName);
        }
        if (file == null) {
            throw new FileNotFoundException("Could not load JSON file " + fileName);
        }

        System.out.println("Loading expression DSL file '" + fileName + "'.");

        if (args.length > 0) {
            fileName = args[0];
        }
    }

    public static List<String> sendRandomRequests(OpenAPIObject api, List<String> urls) {
        List<String> dict = new ArrayList<>();
        if( api.getNumP() != 0 ){
            for( PathsObject p : api.getPList() ){
                PathItemObject item = p.getP().pathItemObject();
                String url = api.getURLFromGeneratedURLs(urls, p.getRef());
                if( item.hasG() )
                    dict = connectGET(item.getG().getO(), url, dict);
                if( item.hasPostOb() )
                    dict = connectPOST(item.getPostOb().getO(), url, dict);
            }
        }
        return dict;
    }

    public static void sendInferredRequests(OpenAPIObject api, List<String> inferredURLs) {
        if( api.getNumP() != 0 ){
            for( PathsObject p : api.getPList() ){
                connectInferredURLs(p, inferredURLs);
            }
        }
    }

    public static List<String> connectGET(OperationObject op, String path,List<String> dict){
        try {
            URL url = new URL(path);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0"); // request header
            con.setRequestMethod("GET"); // optional default is GET

            int responseCode = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            //System.out.println("connected path : " + path);
            //System.out.println("HTTP status code (GET) : " + con.getResponseCode());
            successfulUrls.add(path);
            for (ResponseTuple t : op.getR().getRList()) {
                if (t.getKey().equals("200") && responseCode == 200) {
                    SchemaOb respSchema = t.getO().responseObject().getC(0).getM().getS();
                    if (respSchema.schemaObject().getType().equals("array"))
                        dict.addAll(op.writeDictionaryWithArray(respSchema, response.toString(), dict));
                    else
                        dict.addAll(op.writeDictionary(respSchema, response.toString(), dict));
                }
            }
        } catch (Exception e) {
            //System.out.println(e.toString());
        }
        return dict;
    }

    public static List<String> connectPOST(OperationObject op, String path, List<String> dict) {
        try {
            URL url = new URL(path);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

            con.setRequestMethod("POST"); // HTTP POST
            con.setRequestProperty("User-Agent", "Mozilla/5.0"); // request header
            con.setDoOutput(true); // POST

            int responseCode = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            //System.out.println("connected path : " + path);
            //System.out.println("HTTP status code (POST) : " + responseCode);
            successfulUrls.add(path);
            for (ResponseTuple t : op.getR().getRList()) {
                if (t.getKey().equals("200") && responseCode == 200) {
                    SchemaOb respSchema = t.getO().responseObject().getC(0).getM().getS();
                    if (respSchema.schemaObject().getType().equals("array"))
                        dict.addAll(op.writeDictionaryWithArray(respSchema, response.toString(), dict));
                    else
                        dict.addAll(op.writeDictionary(respSchema, response.toString(), dict));
                }
            }
        } catch (Exception e) {
            //System.out.println(e.toString());
        }
        return dict;
    }

    public static void connectInferredURLs(PathsObject p, List<String> urls){
        PathItemObject item = p.getP().pathItemObject();
        System.out.println("Connect with inferred URLs is running...");
        for ( String url : urls ){
            if( url.contains(p.getRef()) ){
                if( item.hasG() )
                    connectGET(item.getG().getO(), url, new ArrayList<>());
                if( item.hasPostOb() )
                    connectPOST(item.getPostOb().getO(), url, new ArrayList<>());
            }
        }
    }
}