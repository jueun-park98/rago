package de.tudresden.inf.st.openapi;

import de.tudresden.inf.st.openapi.ast.*;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.OpenApi3Parser;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.parser.model.v3.Tag;

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
        ContactObject contact = new ContactObject();
        /*
        if( api.getInfo().getContact().getName() != null && !api.getInfo().getContact().getName().isEmpty() )
            contact.setName( api.getInfo().getContact().getName() );
        if( api.getInfo().getContact().getUrl() != null && !api.getInfo().getContact().getUrl().isEmpty() )
            contact.setUrl( api.getInfo().getContact().getUrl() );
        if( api.getInfo().getContact().getEmail() != null && !api.getInfo().getContact().getEmail().isEmpty() )
            contact.setEmail( api.getInfo().getContact().getEmail() );

        System.out.println(contact.getName() + " " + contact.getEmail() + " " + contact.getUrl());*/

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

        /** Paths Object with usage of Path Item Object **/
        Iterator<String> pathKeys = api.getPaths().keySet().iterator();
        while( pathKeys.hasNext() ){
            PathItemObject pathItem = new PathItemObject();
            String key = pathKeys.next();
            openapi.addPathsObject(new PathsObject(key, new PathItemObject()));
        }

        /** Operation Object **/

        /** External Documentation Object **/
        if( api.getExternalDocs() != null ){
            ExternalDocumentationObject externalDoc = new ExternalDocumentationObject();
            if ( api.getExternalDocs().getDescription() != null )
                externalDoc.setDescription( api.getExternalDocs().getDescription() );
            externalDoc.setUrl( api.getExternalDocs().getUrl() );
            openapi.setExternalDocumentationObject( externalDoc );
        }

        /** Parameter Object **/

        /** Request Body Object **/

        /** Media Type Object **/

        /** Encoding Object **/

        /** Responses Object**/

        /** Response Object **/

        /** Callback Object with usage of Path Item Object **/

        /** Example Object **/

        /** Link Object **/

        /** Header Object**/

        /** Tag Object **/
        if ( !api.getTags().isEmpty() ){
            List<TagObject> tags = new ArrayList<>();
            for( Tag t : api.getTags() ){
                TagObject tag = new TagObject();
                tag.setName( t.getName() );
                if( t.getDescription() != null )
                    tag.setDescription( t.getDescription() );
                if( t.getExternalDocs() != null ){
                    ExternalDocumentationObject externalDoc = new ExternalDocumentationObject();
                    if ( t.getExternalDocs().getDescription() != null )
                        externalDoc.setDescription( api.getExternalDocs().getDescription() );
                    externalDoc.setUrl( api.getExternalDocs().getUrl() );
                    tag.setExternalDocumentationObject( externalDoc );
                }
                tags.add(tag);
            }
        }

        /** Reference Object **/

        /** Schema Object (skipped) **/

        /** Discriminator Object (skipped because it is the part of Schema Object) **/

        /** XML Object (skipped because it is the part of Schema Object) **/

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
        if( api.getSecurityRequirements() != null){
            List<SecurityRequirement> securityRequirements = api.getSecurityRequirements();
            for( SecurityRequirement s : securityRequirements ){
                s.
            }
        }*/
        /*
        Iterator<String> pathKeys = api.getPaths().keySet().iterator();
        while( pathKeys.hasNext() ){
            String key = pathKeys.next();
            openapi.addPathsObject(new PathsObject(key, new PathItemObject()));
        }*/

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
        openApi = parseJSON(fileName);
        System.out.println(openApi.print());

        if (args.length > 0) {
            fileName = args[0];
        }

    }

}