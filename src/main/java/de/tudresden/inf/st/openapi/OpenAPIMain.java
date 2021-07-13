package de.tudresden.inf.st.openapi;

import de.tudresden.inf.st.openapi.ast.*;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.OpenApi3Parser;
import org.openapi4j.parser.model.v3.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class OpenAPIMain {

    /** saving json-file with the openapi4j-parser in OpenAPIObject from RAG **/
    public static OpenAPIObject parseJSON(String fileName) throws IOException, ResolutionException, ValidationException {
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
        OpenApi3 api = new OpenApi3Parser().parse(expUrl, new ArrayList<>(), false);
        OpenAPIObject openapi = new OpenAPIObject();

        /** OpenAPI Object **/
        openapi.setOpenAPI(api.getOpenapi());

        /** Contact Object **/
        /*
        ContactObject contact = new ContactObject();
        if( api.getInfo().getContact().getName() != null )
            contact.setName( api.getInfo().getContact().getName() );
        if( api.getInfo().getContact().getUrl() != null )
            contact.setUrl( api.getInfo().getContact().getUrl() );
        if( api.getInfo().getContact().getEmail() != null )
            contact.setEmail( api.getInfo().getContact().getEmail() );*/

        /** License Object **/
        /*
        LicenseObject license = new LicenseObject();
        if( api.getInfo().getLicense().getName() != null )
            license.setName( api.getInfo().getLicense().getName() );
        if( api.getInfo().getLicense().getUrl() != null )
            license.setUrl( api.getInfo().getLicense().getUrl() );*/

        /*
        LicenseObject license = new LicenseObject(  api.getInfo().getLicense().getName(),
                                                    api.getInfo().getLicense().getUrl());*/

        /** Info Object **/
        InfoObject info = new InfoObject();
        info.setTitle( api.getInfo().getTitle() );
        info.setVersion( api.getInfo().getVersion() );
        openapi.setInfoObject( info );
        /*
        openapi.setInfoObject( new InfoObject(  api.getInfo().getTitle(),
                                                api.getInfo().getDescription(),
                                                api.getInfo().getTermsOfService(),
                                                new Opt<>(contact),
                                                new Opt<>(license),
                                                api.getInfo().getVersion()));*/

        /** Server Object **/

        /** Server Variable Object **/

        /** Components Object **/

        /** Paths Object **/
        System.out.println( api.getPaths().get("/").getGet().getOperationId() );
        PathsObject pathsObject = new PathsObject();
        Iterator<String> pathKeys = api.getPaths().keySet().iterator();
        while( pathKeys.hasNext() ){
            String key = pathKeys.next();

        }


        /** Path Item Object **/

        /** Operation Object **/

        /** External Documentation Object **/

        /** Parameter Object **/

        /** Request Body Object **/

        /** Media Type Object **/

        /** Encoding Object **/

        /** Responses Object**/

        /** Response Object **/

        /** Callback Object **/

        /** Example Object **/

        /** Link Object **/

        /** Header Object**/

        /** Tag Object **/

        /** Reference Object **/

        /** Schema Object **/

        /** Discriminator Object **/

        /** XML Object **/

        /** Security Scheme Object **/

        /** OAuth Flows Object **/
        /*
        OAuthFlowsObject oAuthFlows;
        oAuthFlows.setImplicitOpt(new Opt<>(new Implicit(api)));
        oAuthFlows.setPasswordOpt();
        oAuthFlows.setClientCredentialsOpt();
        oAuthFlows.setAuthorizationCodeOpt();*/

        /** OAuth Flow Object **/

        /** Security Requirement Object **/
        /*
        for( SecurityRequirement s : api.getSecurityRequirements() ){
            openapi.addSecurityRequirementObject(new SecurityRequirementObject(s., s));
            for( s.getRequirements(). )
            openapi.addSecurityRequirementObject(new SecurityRequirementObject(s.getRequirements().));
        } */

        return openapi;
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
        //openApi = parseJSON(fileName);
        //System.out.println(openApi.print());

        if (args.length > 0) {
            fileName = args[0];
        }

    }

}