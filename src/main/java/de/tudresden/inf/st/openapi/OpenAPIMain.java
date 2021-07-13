package de.tudresden.inf.st.openapi;

import de.tudresden.inf.st.openapi.ast.*;
import de.tudresden.inf.st.openapi.ast.Enum;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.OpenApi3Parser;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.parser.model.v3.Parameter;
import org.openapi4j.parser.model.v3.RequestBody;
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
        for (String s : api.getPaths().keySet()) {
            PathItemObject pathItem = new PathItemObject();
            String key = s;
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

    public InfoObject parseInfo(Info info) {
        InfoObject infoObject = new InfoObject();
        infoObject.setTitle( info.getTitle() );
        infoObject.setVersion( info.getVersion() );
        if( !info.getDescription().isEmpty() )
            infoObject.setDescription( info.getDescription() );
        if( !info.getTermsOfService().isEmpty() )
            infoObject.setDescription( info.getTermsOfService() );
        if( info.getContact() != null )
            infoObject.setContactObject( this.parseContact(info.getContact()) );
        if( info.getLicense() != null )
            infoObject.setLicenseObject( this.parseLicense(info.getLicense()) );

        return infoObject;
    }

    public ContactObject parseContact(Contact contact){
        ContactObject contactObject = new ContactObject();
        if( !contact.getName().isEmpty() )
            contactObject.setName( contact.getName() );
        if( !contact.getUrl().isEmpty() )
            contactObject.setUrl( contact.getUrl() );
        if( !contact.getEmail().isEmpty() )
            contactObject.setEmail( contact.getEmail() );

        return contactObject;
    }

    public LicenseObject parseLicense(License license){
        LicenseObject licenseObject = new LicenseObject();
        if( !license.getName().isEmpty() )
            licenseObject.setName( license.getName() );
        if( !license.getUrl().isEmpty() )
            licenseObject.setUrl( license.getUrl() );

        return licenseObject;
    }

    public ServerObject parseServer(Server server){
        ServerObject serverObject = new ServerObject();
        serverObject.setUrl( server.getUrl() );
        if( !server.getDescription().isEmpty() )
            serverObject.setDescription( server.getDescription() );
        if( !server.getVariables().isEmpty() ){
            for (String key : server.getVariables().keySet())
                serverObject.addServerVariablesTuple(new ServerVariablesTuple(key, this.parseServerVariable(server.getVariable(key))));
        }

        return serverObject;
    }

    public ServerVariableObject parseServerVariable(ServerVariable serverVariable){
        ServerVariableObject serverVariableObject = new ServerVariableObject();
        serverVariableObject.setDefault( serverVariable.getDefault() );
        if( !serverVariable.getDescription().isEmpty() )
            serverVariableObject.setDescription( serverVariable.getDescription() );
        if( !serverVariable.getEnums().isEmpty() ){
            for( String e : serverVariable.getEnums() )
                serverVariableObject.addEnum(new Enum(e));
        }

        return serverVariableObject;
    }

    public ComponentsObject parseComponents(Components components){
        ComponentsObject componentsObject = new ComponentsObject();

        return componentsObject;
    }

    public PathsObject parsePaths(OpenApi3 api3){
        PathsObject pathsObject = new PathsObject();
        for ( String key : api3.getPaths().keySet() ){
            pathsObject.setRef( key );
            pathsObject.setPathItemObject( this.parsePathItem(api3.getPath(key)) );
        }

        return pathsObject;
    }

    public PathItemObject parsePathItem(Path path){
        PathItemObject pathItemObject = new PathItemObject();
        if( !path.getRef().isEmpty() )
            pathItemObject.setRef( path.getRef() );
        if( !path.getSummary().isEmpty() )
            pathItemObject.setSummary( path.getSummary() );
        if( !path.getDescription().isEmpty() )
            pathItemObject.setDescription( path.getDescription() );
        if( path.getGet() != null ){
            Get get = new Get();
            get.setOperationObject( parseOperation( path.getGet() ) );
            pathItemObject.setGet(get);
        }
        if( path.getPut() != null ){
            Put put = new Put();
            put.setOperationObject( parseOperation( path.getPut() ) );
            pathItemObject.setPut(put);
        }
        if( path.getPost() != null ){
            Post post = new Post();
            post.setOperationObject( parseOperation( path.getPost() ) );
            pathItemObject.setPost(post);
        }
        if( path.getDelete() != null ){
            Delete delete = new Delete();
            delete.setOperationObject( parseOperation( path.getDelete() ) );
            pathItemObject.setDelete(delete);
        }
        if( path.getOptions() != null ){
            Options options = new Options();
            options.setOperationObject( parseOperation( path.getOptions() ) );
            pathItemObject.setOptions(options);
        }
        if( path.getHead() != null ){
            Head head = new Head();
            head.setOperationObject( parseOperation( path.getHead() ) );
            pathItemObject.setHead(head);
        }
        if( path.getPatch() != null ){
            Patch patch = new Patch();
            patch.setOperationObject( parseOperation( path.getPatch() ) );
            pathItemObject.setPatch(patch);
        }
        if( path.getTrace() != null ){
            Trace trace = new Trace();
            trace.setOperationObject( parseOperation( path.getTrace() ) );
            pathItemObject.setTrace(trace);
        }
        if( !path.getServers().isEmpty() ){
            for(Server s : path.getServers())
                pathItemObject.addServerObject(parseServer(s));
        }
        if( !path.getParameters().isEmpty() ){
            for(Parameter p : path.getParameters())
                pathItemObject.addParam(parseParameter(p));
        }

        return pathItemObject;
    }

    public OperationObject parseOperation(Operation operation){
        OperationObject operationObject = new OperationObject();

        return operationObject;
    }

    public ExternalDocumentationObject parseExternalDocs(ExternalDocs externalDocs){
        ExternalDocumentationObject externalDocumentationObject = new ExternalDocumentationObject();

        return externalDocumentationObject;
    }

    public ParameterObject parseParameter(Parameter parameter){
        ParameterObject parameterObject = new ParameterObject();

        return parameterObject;
    }

    public RequestBodyObject parseRequestBody(RequestBody requestBody){
        RequestBodyObject requestBodyObject = new RequestBodyObject();

        return requestBodyObject;
    }

    public MediaTypeObject parseMediaType(MediaType mediaType){
        MediaTypeObject mediaTypeObject = new MediaTypeObject();

        return mediaTypeObject;
    }

    public EncodingObject parseEncoding(EncodingProperty encodingProperty){
        EncodingObject encodingObject = new EncodingObject();

        return encodingObject;
    }

    public ResponseObject parseResponse(Response response){
        ResponseObject responseObject = new ResponseObject();

        return responseObject;
    }

    public CallbackObject parseCallback(Callback callback){
        CallbackObject callbackObject = new CallbackObject();

        return callbackObject;
    }

    public ExampleObject parseExample(Example example){
        ExampleObject exampleObject = new ExampleObject();

        return exampleObject;
    }

    public LinkObject parseLink(Link link){
        LinkObject linkObject = new LinkObject();

        return linkObject;
    }

    public HeaderObject parseHeader(Header header){
        HeaderObject headerObject = new HeaderObject();

        return headerObject;
    }

    public TagObject parseTag(Tag tag){
        TagObject tagObject = new TagObject();

        return tagObject;
    }

    public SecuritySchemeObject parseSecurityScheme(SecurityScheme securityScheme){
        SecuritySchemeObject securitySchemeObject = new SecuritySchemeObject();

        return securitySchemeObject;
    }

    public OAuthFlowsObject parseOAuthFlows(OAuthFlows oAuthFlows){
        OAuthFlowsObject oAuthFlowsObject = new OAuthFlowsObject();

        return oAuthFlowsObject;
    }

    public OAuthFlowObject parseOAuthFlow(OAuthFlow oAuthFlow){
        OAuthFlowObject oAuthFlowObject = new OAuthFlowObject();

        return oAuthFlowObject;
    }

    public SecurityRequirementObject parseSecurityRequirement(SecurityRequirement securityRequirement){
        SecurityRequirementObject securityRequirementObject = new SecurityRequirementObject();

        return securityRequirementObject;
    }
}