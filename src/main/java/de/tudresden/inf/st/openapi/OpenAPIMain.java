package de.tudresden.inf.st.openapi;

import de.tudresden.inf.st.openapi.ast.OpenAPIObject;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.OpenApi3Parser;
import org.openapi4j.parser.model.v3.OpenApi3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class OpenAPIMain {

    /** saving json-file with the openapi4j-parser in OpenAPIObject from RAG **/
    public static OpenAPIObject setJSONinOpenAPIObj(String fileName) throws IOException, ResolutionException, ValidationException {
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
        FileReader reader = new FileReader(file);
        OpenApi3 api = new OpenApi3Parser().parse(expUrl, new ArrayList<>(), false);
        System.out.println(api.toString());
        return (OpenAPIObject) null; // ToDo
    }

    /** Result of Print.jrag in String will be saved in json-format **/
    public void save(OpenAPIObject openAPIObject) throws IOException, ResolutionException, ValidationException {

    }

    /** main-method, calls the set of methods to test the OpenAPI-Generator with JastAdd **/
    public static void main(String[] args) throws IOException, ResolutionException, ValidationException {
        OpenAPIObject openApi;
        String fileName = "api-with-examples.json";
        /*
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
        FileReader reader = new FileReader(file);
        OpenApi3 api = new OpenApi3Parser().parse(expUrl, new ArrayList<>(), true);
        System.out.println(api.toString());
        */
        //String fileName = "api-with-examples.json";

        if (args.length > 0) {
            fileName = args[0];
        }

    }

}