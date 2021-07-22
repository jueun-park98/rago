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
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.*;

public class OpenAPIMain {

    /** Result of Print.jrag in String will be saved in json-format **/
    public static void save(OpenAPIObject openAPIObject) throws IOException, ResolutionException, ValidationException {

    }

    /** main-method, calls the set of methods to test the OpenAPI-Generator with JastAdd **/
    public static void main(String[] args) throws IOException, ResolutionException, ValidationException {
        OpenAPIObject openApi;
        String fileName = "api-with-examples.json";

        openApi = parseOpenAPI(fileName);
        System.out.println(openApi.print());

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

    /** saving json-file with the openapi4j-parser in OpenAPIObject from RAG **/
    public static OpenAPIObject parseOpenAPI(String fileName) throws IOException, ResolutionException, ValidationException {
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

        openapi.setOpenAPI(api.getOpenapi());
        openapi.setInfoObject( parseInfo(api.getInfo()) );
        for( String key : api.getPaths().keySet() )
            openapi.addPathsObject( new PathsObject( key, parsePathItem(api.getPath(key))) );

        if( api.getServers() != null ) {
            for( Server s : api.getServers() )
                openapi.addServerObject( parseServer(s) );
        }
        if( api.getComponents() != null )
            openapi.setComponentsObject( parseComponents(api.getComponents()) );
        if( api.getSecurityRequirements() != null ){
            for( SecurityRequirement s : api.getSecurityRequirements() )
                openapi.addSecurityRequirementObject( parseSecurityRequirement(s) );
        }
        if( api.getTags() != null ){
            for( Tag t : api.getTags() )
                openapi.addTagObject( parseTag(t) );
        }
        if( api.getExternalDocs() != null )
            openapi.setExternalDocumentationObject( parseExternalDocs(api.getExternalDocs()) );

        return openapi;
    }

    public static OpenApi3 composeOpenAPI (OpenAPIObject openAPIObject){
        OpenApi3 api3 = new OpenApi3();
        Map<String, Path> paths = new HashMap<>();

        api3.setOpenapi( openAPIObject.getOpenAPI() );
        api3.setInfo( composeInfo( openAPIObject.getInfoObject() ) );

        for( PathsObject p : openAPIObject.getPathsObjects() ){
            paths.put( p.getRef(), composePath(p.getPathItemObject()) );
        }

        api3.setPaths(paths);

        if( openAPIObject.hasComponentsObject() )
            api3.setComponents( composeComponents(openAPIObject.getComponentsObject()) );
        if( openAPIObject.getNumSecurityRequirementObject() != 0 ){
            List<SecurityRequirement> securityRequirements = new ArrayList<>();
            for( SecurityRequirementObject s : openAPIObject.getSecurityRequirementObjects() )
                securityRequirements.add( composeSecurityRequiremnet( s ) );
            api3.setSecurityRequirements(securityRequirements);
        }
        if( openAPIObject.getNumTagObject() != 0 ){
            List<Tag> tags = new ArrayList<>();
            for( TagObject t : openAPIObject.getTagObjects() )
                tags.add( composeTag(t) );
            api3.setTags( tags );
        }
        if( openAPIObject.hasExternalDocumentationObject() )
            api3.setExternalDocs( composeExternalDocs(openAPIObject.getExternalDocumentationObject()) );

        return api3;
    }

    public static InfoObject parseInfo(Info info) {
        InfoObject infoObject = new InfoObject();

        infoObject.setTitle( info.getTitle() );
        infoObject.setVersion( info.getVersion() );

        if( info.getDescription() != null )
            infoObject.setDescription( info.getDescription() );
        if( info.getTermsOfService() != null )
            infoObject.setDescription( info.getTermsOfService() );
        if( info.getContact() != null )
            infoObject.setContactObject( parseContact(info.getContact()) );
        if( info.getLicense() != null )
            infoObject.setLicenseObject( parseLicense(info.getLicense()) );

        return infoObject;
    }

    public static Info composeInfo (InfoObject infoObject){
        Info info = new Info();

        info.setTitle( infoObject.getTitle() );
        info.setVersion( infoObject.getVersion() );

        if( infoObject.getDescription() != null )
            info.setDescription( infoObject.getDescription() );
        if( infoObject.getTermsOfService() != null )
            info.setTermsOfService( infoObject.getTermsOfService() );
        if( infoObject.hasContactObject() )
            info.setContact( composeContact(infoObject.getContactObject()) );
        if( infoObject.hasLicenseObject() )
            info.setLicense( composeLicense(infoObject.getLicenseObject()) );

        return info;
    }

    public static ContactObject parseContact(Contact contact){
        ContactObject contactObject = new ContactObject();

        if( contact.getName() != null )
            contactObject.setName( contact.getName() );
        if( contact.getUrl() != null )
            contactObject.setUrl( contact.getUrl() );
        if( contact.getEmail() != null )
            contactObject.setEmail( contact.getEmail() );

        return contactObject;
    }

    public static Contact composeContact (ContactObject contactObject){
        Contact contact = new Contact();

        if( contactObject.getName() != null )
            contact.setName( contactObject.getName() );
        if( contactObject.getUrl() != null )
            contact.setUrl( contactObject.getUrl() );
        if( contactObject.getEmail() != null )
            contact.setEmail( contactObject.getEmail() );

        return contact;
    }

    public static LicenseObject parseLicense(License license){
        LicenseObject licenseObject = new LicenseObject();

        if( license.getName() != null )
            licenseObject.setName( license.getName() );
        if( license.getUrl() != null )
            licenseObject.setUrl( license.getUrl() );

        return licenseObject;
    }

    public static License composeLicense (LicenseObject licenseObject){
        License license = new License();

        license.setName( licenseObject.getName() );

        if( licenseObject.getUrl() != null )
            license.setUrl( licenseObject.getUrl() );

        return license;
    }

    public static ServerObject parseServer(Server server){
        ServerObject serverObject = new ServerObject();

        serverObject.setUrl( server.getUrl() );

        if( server.getDescription() != null )
            serverObject.setDescription( server.getDescription() );
        if( server.getVariables() != null ){
            for (String key : server.getVariables().keySet())
                serverObject.addServerVariablesTuple(new ServerVariablesTuple(key, parseServerVariable(server.getVariable(key))));
        }

        return serverObject;
    }

    public static Server composeServer (ServerObject serverObject){
        Server server = new Server();

        server.setUrl( serverObject.getUrl() );

        if( serverObject.getDescription() != null )
            server.setDescription( serverObject.getDescription() );
        if( serverObject.hasServerVariablesTuple() ){
            Map<String, ServerVariable> serverVariables = new HashMap<>();
            for( ServerVariablesTuple s : serverObject.getServerVariablesTuples() )
                serverVariables.put( s.getName(), composeServerVariable(s.getServerVariableObject()) );
            server.setVariables(serverVariables);
        }

        return server;
    }

    public static ServerVariableObject parseServerVariable(ServerVariable serverVariable){
        ServerVariableObject serverVariableObject = new ServerVariableObject();

        serverVariableObject.setDefault( serverVariable.getDefault() );

        if( serverVariable.getDescription() != null )
            serverVariableObject.setDescription( serverVariable.getDescription() );
        if( serverVariable.getEnums() != null ){
            for( String e : serverVariable.getEnums() )
                serverVariableObject.addEnum(new Enum(e));
        }

        return serverVariableObject;
    }

    public static ServerVariable composeServerVariable (ServerVariableObject serverVariableObject){
        ServerVariable serverVariable = new ServerVariable();

        serverVariable.setDefault( serverVariableObject.getDefault() );

        if( serverVariableObject.getDescription() != null )
            serverVariable.setDescription( serverVariableObject.getDescription() );
        if( serverVariableObject.getNumEnum() != 0 ){
            List<String> enums = new ArrayList<>();
            for( Enum e : serverVariableObject.getEnums() )
                enums.add( e.getEnumValue() );
            serverVariable.setEnums( enums );
        }

        return serverVariable;
    }

    public static ComponentsObject parseComponents(Components components){
        ComponentsObject componentsObject = new ComponentsObject();

        if( components.getSchemas() != null ){
            JastAddList<SchemasTuple> schemasTuples = new JastAddList<>();
            for( String key : components.getSchemas().keySet() ){
                SchemaObjectTuple schemaObjectTuple = new SchemaObjectTuple();
                schemaObjectTuple.setName( key );
                schemaObjectTuple.setSchemaObject( new SchemaObject() );
                schemasTuples.add(schemaObjectTuple);
            }
            componentsObject.setSchemasTupleList(schemasTuples);
        }
        if( components.getResponses() != null ){
            JastAddList<ResponsesTuple> responsesTuples = new JastAddList<>();
            for( String key : components.getResponses().keySet() ){
                ResponseObjectTuple responseObjectTuple = new ResponseObjectTuple();
                responseObjectTuple.setName( key );
                responseObjectTuple.setResponseObject( parseResponse(components.getResponse(key)) );
                responsesTuples.add(responseObjectTuple);
            }
            componentsObject.setResponsesTupleList(responsesTuples);
        }
        if( components.getParameters() != null ){
            JastAddList<ParameterTuple> parameterTuples = new JastAddList<>();
            for( String key : components.getParameters().keySet() ){
                ParameterObjectTuple parameterObjectTuple = new ParameterObjectTuple();
                parameterObjectTuple.setName( key );
                parameterObjectTuple.setParameterObject( parseParameter(components.getParameter(key)) );
                parameterTuples.add(parameterObjectTuple);
            }
            componentsObject.setParameterTupleList(parameterTuples);
        }
        if( components.getExamples() != null ){
            JastAddList<ExamplesTuple> examplesTuples = new JastAddList<>();
            for( String key : components.getExamples().keySet() ){
                ExampleObjectTuple exampleObjectTuple = new ExampleObjectTuple();
                exampleObjectTuple.setName( key );
                exampleObjectTuple.setExampleObject( parseExample(components.getExample(key)) );
                examplesTuples.add(exampleObjectTuple);
            }
            componentsObject.setExamplesTupleList(examplesTuples);
        }
        if( components.getRequestBodies() != null ){
            JastAddList<RequestBodiesTuple> requestBodiesTuples = new JastAddList<>();
            for( String key : components.getRequestBodies().keySet() ){
                RequestBodyObjectTuple requestBodyObjectTuple = new RequestBodyObjectTuple();
                requestBodyObjectTuple.setName( key );
                requestBodyObjectTuple.setRequestBodyObject( parseRequestBody(components.getRequestBody(key)) );
                requestBodiesTuples.add(requestBodyObjectTuple);
            }
            componentsObject.setRequestBodiesTupleList(requestBodiesTuples);
        }
        if( components.getHeaders() != null ){
            JastAddList<HeadersTuple> headersTuples = new JastAddList<>();
            for( String key : components.getHeaders().keySet() ){
                HeaderObjectTuple headerObjectTuple = new HeaderObjectTuple();
                headerObjectTuple.setName( key );
                headerObjectTuple.setHeaderObject( parseHeader(components.getHeader(key)) );
                headersTuples.add(headerObjectTuple);
            }
            componentsObject.setHeadersTupleList(headersTuples);
        }
        if( components.getSecuritySchemes() != null ){
            JastAddList<SecuritySchemesTuple> securitySchemesTuples = new JastAddList<>();
            for( String key : components.getSecuritySchemes().keySet() ){
                SecuritySchemeObjectTuple securitySchemeObjectTuple = new SecuritySchemeObjectTuple();
                securitySchemeObjectTuple.setName( key );
                securitySchemeObjectTuple.setSecuritySchemeObject( parseSecurityScheme(components.getSecurityScheme(key)) );
                securitySchemesTuples.add(securitySchemeObjectTuple);
            }
            componentsObject.setSecuritySchemesTupleList(securitySchemesTuples);
        }
        if( components.getLinks() != null ){
            JastAddList<LinksTuple> linksTuples = new JastAddList<>();
            for( String key : components.getLinks().keySet() ){
                LinkObjectTuple linkObjectTuple = new LinkObjectTuple();
                linkObjectTuple.setName( key );
                linkObjectTuple.setLinkObject( parseLink(components.getLink(key)) );
                linksTuples.add(linkObjectTuple);
            }
            componentsObject.setLinksTupleList(linksTuples);
        }
        if( components.getCallbacks() != null ){
            JastAddList<CallbacksTuple> callbacksTuples = new JastAddList<>();
            for( String key : components.getCallbacks().keySet() ){
                CallbackObjectTuple callbackObjectTuple = new CallbackObjectTuple();
                callbackObjectTuple.setName( key );
                callbackObjectTuple.setCallbackObject( parseCallback(components.getCallback(key)) );
                callbacksTuples.add(callbackObjectTuple);
            }
            componentsObject.setCallbacksTupleList(callbacksTuples);
        }

        return componentsObject;
    }

    public static Components composeComponents (ComponentsObject componentsObject){
        Components components = new Components();

        return components;
    }

    public static PathsObject parsePaths(OpenApi3 api3){
        PathsObject pathsObject = new PathsObject();

        for ( String key : api3.getPaths().keySet() ){
            pathsObject.setRef( key );
            pathsObject.setPathItemObject( parsePathItem(api3.getPath(key)) );
        }

        return pathsObject;
    }

    public static PathItemObject parsePathItem(Path path){
        PathItemObject pathItemObject = new PathItemObject();

        if( path.getRef() != null )
            pathItemObject.setRef( path.getRef() );
        if( path.getSummary() != null )
            pathItemObject.setSummary( path.getSummary() );
        if( path.getDescription() != null )
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
        if( path.getServers() != null ){
            for(Server s : path.getServers())
                pathItemObject.addServerObject(parseServer(s));
        }
        if( path.getParameters() != null ){
            for(Parameter p : path.getParameters())
                pathItemObject.addParam(parseParameter(p));
        }

        return pathItemObject;
    }

    public static Path composePath (PathItemObject pathItemObject){
        Path path = new Path();



        return path;
    }

    public static OperationObject parseOperation(Operation operation){
        OperationObject operationObject = new OperationObject();
        DeprecatedBoolean deprecatedBoolean = new DeprecatedBoolean();

        deprecatedBoolean.setDeprecatedBoolean(operation.getDeprecated());
        operationObject.setDeprecatedBoolean(deprecatedBoolean);

        if( operation.getTags() != null ){
            for(String t : operation.getTags()) {
                de.tudresden.inf.st.openapi.ast.Tag tag = new de.tudresden.inf.st.openapi.ast.Tag();
                tag.setTag(t);
                operationObject.addTag(tag);
            }
        }
        if( operation.getSummary() != null )
            operationObject.setSummary(operation.getSummary());
        if( operation.getDescription() != null )
            operationObject.setDescription( operation.getDescription() );
        if( operation.getExternalDocs() != null )
            operationObject.setExternalDocumentationObject( parseExternalDocs(operation.getExternalDocs()) );
        if( operation.getOperationId() != null )
            operationObject.setOperationID( operation.getOperationId() );
        if( operation.getParameters() != null ){
            for( Parameter p : operation.getParameters() )
                operationObject.addParam(parseParameter(p));
        }
        if( operation.getRequestBody() != null )
            operationObject.setRequestBody( parseRequestBody( operation.getRequestBody() ) );
        if( operation.getResponses() != null ){
            ResponsesObject responsesObject = new ResponsesObject();
            for( String key : operation.getResponses().keySet()){
                ResponseObject responseObject;
                responseObject = parseResponse(operation.getResponse(key));
                responseObject.setName(key);
                responsesObject.addHTTPStatusCode(responseObject);
            }
            operationObject.setResponsesObject(responsesObject);
        }
        if( operation.getCallbacks() != null ){
            CallbackObjectTuple callbackObjectTuple = new CallbackObjectTuple();
            for( String key : operation.getCallbacks().keySet() ){
                callbackObjectTuple.setName(key);
                callbackObjectTuple.setCallbackObject(parseCallback(operation.getCallback(key)));
                operationObject.addCallbacksTuple(callbackObjectTuple);
            }
        }

        if( operation.getSecurityRequirements() != null ){
            for( SecurityRequirement sr : operation.getSecurityRequirements() )
                operationObject.addSecurityRequirementObject(parseSecurityRequirement(sr));
        }
        if( operation.getServers() != null ){
            for( Server s : operation.getServers() )
                operationObject.addServerObject(parseServer(s));
        }

        return operationObject;
    }

    public static Operation composeOperation (OperationObject operationObject){
        Operation operation = new Operation();

        return operation;
    }

    public static ExternalDocumentationObject parseExternalDocs(ExternalDocs externalDocs){
        ExternalDocumentationObject externalDocumentationObject = new ExternalDocumentationObject();

        if( externalDocs.getDescription() != null )
            externalDocumentationObject.setDescription( externalDocs.getDescription() );
        externalDocumentationObject.setUrl( externalDocs.getUrl() );

        return externalDocumentationObject;
    }

    public static ExternalDocs composeExternalDocs (ExternalDocumentationObject externalDocumentationObject){
        ExternalDocs externalDocs = new ExternalDocs();

        return externalDocs;
    }

    public static ParameterObject parseParameter(Parameter parameter){
        ParameterObject parameterObject = new ParameterObject();

        parameterObject.setName(parameter.getName());
        parameterObject.setIn(parameter.getIn());
        parameterObject.setRequired(parameter.getRequired());

        if( parameter.getDescription() != null )
            parameterObject.setDescription( parameter.getDescription() );
        if( parameter.getDeprecated() != null )
            parameterObject.setDeprecatedBoolean( parameter.getDeprecated() );
        if( parameter.getStyle() != null )
            parameterObject.setStyle( parameter.getStyle() );
        if( parameter.getExplode() != null )
            parameterObject.setExplode( parameter.getExplode() );
        if( parameter.getAllowReserved() != null )
            parameterObject.setExplode( parameter.getAllowReserved() );
        if( parameter.getExample() != null )
            parameterObject.setExample( parameter.getExample() );
        if( parameter.getExamples() != null ){
            for( String key : parameter.getExamples().keySet() )
                parameterObject.addExamplesTuple(new ExampleObjectTuple(key, parseExample(parameter.getExample(key))));
        }
        if( parameter.getContentMediaTypes() != null ){
            for( String key : parameter.getContentMediaTypes().keySet() )
                parameterObject.addContentTuple(new ContentObjectTuple(key, parseMediaType(parameter.getContentMediaType(key))));
        }

        return parameterObject;
    }

    public static Parameter composeParameter (ParameterObject parameterObject){
        Parameter parameter = new Parameter();

        return parameter;
    }

    public static RequestBodyObject parseRequestBody(RequestBody requestBody){
        RequestBodyObject requestBodyObject = new RequestBodyObject();

        for( String key : requestBody.getContentMediaTypes().keySet() )
            requestBodyObject.addContentTuple(new ContentObjectTuple(key, parseMediaType(requestBody.getContentMediaType(key))));
        if( requestBody.getDescription() != null )
            requestBodyObject.setDescription(requestBody.getDescription());
        if( requestBody.getRequired() != null )
            requestBodyObject.setRequired( requestBody.getRequired() );

        return requestBodyObject;
    }

    public static RequestBody composeRequestBody (RequestBodyObject requestBodyObject){
        RequestBody requestBody = new RequestBody();

        return requestBody;
    }

    public static MediaTypeObject parseMediaType(MediaType mediaType){
        MediaTypeObject mediaTypeObject = new MediaTypeObject();

        if( mediaType.getExample() != null )
            mediaTypeObject.setExample( mediaType.getExample() );
        if( mediaType.getExamples() != null ){
            for( String key : mediaType.getExamples().keySet() )
                mediaTypeObject.addExamplesTuple(new ExampleObjectTuple(key, parseExample(mediaType.getExample(key))));
        }
        if( mediaType.getEncodings() != null ){
            for( String key : mediaType.getEncodings().keySet() )
                mediaTypeObject.addEncodingTuple(new EncodingObjectTuple(key, parseEncoding(mediaType.getEncoding(key))));
        }

        return mediaTypeObject;
    }

    public static MediaType composeMediaType (MediaTypeObject mediaTypeObject){
        MediaType mediaType = new MediaType();

        return mediaType;
    }

    public static EncodingObject parseEncoding(EncodingProperty encodingProperty){
        EncodingObject encodingObject = new EncodingObject();

        if( encodingProperty.getContentType() != null )
            encodingObject.setContentType( encodingProperty.getContentType() );
        if( encodingProperty.getHeaders() != null ){
            for( String key : encodingProperty.getHeaders().keySet() )
                encodingObject.addHeadersTuple(new HeaderObjectTuple(key, parseHeader(encodingProperty.getHeader(key))));
        }
        if( encodingProperty.getStyle() != null )
            encodingObject.setStyle( encodingProperty.getStyle() );
        if( encodingProperty.getExplode() != null )
            encodingObject.setExplode( encodingProperty.getExplode() );
        // if( encodingProperty.getAllowReserved() != null ) /** parser for allowReserved non-existent **/

        return encodingObject;
    }

    public static EncodingProperty composeEncodingProperty (EncodingObject encodingObject){
        EncodingProperty encodingProperty = new EncodingProperty();

        return encodingProperty;
    }

    public static ResponseObject parseResponse(Response response){
        ResponseObject responseObject = new ResponseObject();

        responseObject.setDescription( response.getDescription() );

        if( response.getHeaders() != null ){
            for( String key : response.getHeaders().keySet() )
                responseObject.addHeadersTuple( new HeaderObjectTuple(key, parseHeader(response.getHeader(key))) );
        }
        if( response.getContentMediaTypes() != null ){
            for( String key : response.getContentMediaTypes().keySet() )
                responseObject.addContentTuple( new ContentObjectTuple(key, parseMediaType(response.getContentMediaType(key))) );
        }
        if( response.getLinks() != null ){
            for( String key : response.getLinks().keySet() )
                responseObject.addLinksTuple( new LinkObjectTuple(key, parseLink(response.getLink(key))) );
        }

        return responseObject;
    }

    public static Response composeResponse (ResponseObject responseObject){
        Response response = new Response();

        return response;
    }

    public static CallbackObject parseCallback(Callback callback){
        CallbackObject callbackObject = new CallbackObject();

        if( callback.getCallbackPaths() != null ){
            for( String key : callback.getCallbackPaths().keySet() )
                callbackObject.addExpression(new Expression(key, parsePathItem(callback.getCallbackPath(key))));
        }

        return callbackObject;
    }

    public static Callback composeCallback (CallbackObject callbackObject){
        Callback callback = new Callback();

        return callback;
    }

    public static ExampleObject parseExample(Example example){
        ExampleObject exampleObject = new ExampleObject();

        if( example.getSummary() != null )
            exampleObject.setSummary( example.getSummary() );
        if( example.getDescription() != null )
            exampleObject.setDescription( example.getDescription() );
        if( example.getValue() != null )
            exampleObject.setValue( example.getValue() );
        if( example.getExternalValue() != null )
            exampleObject.setExternalValue( example.getExternalValue() );

        return exampleObject;
    }

    public static Example composeExample (ExampleObject exampleObject){
        Example example = new Example();

        return example;
    }

    public static LinkObject parseLink(Link link){
        LinkObject linkObject = new LinkObject();

        if( link.getOperationRef() != null )
            linkObject.setOperationRef( link.getOperationRef() );
        if( link.getOperationId() != null )
            linkObject.setOperationID( link.getOperationId() );
        if( link.getParameters() != null ){
            for( String key : link.getParameters().keySet() )
                linkObject.addLinkParameterTuple(new LinkParameterTuple(key, link.getParameter(key)));
        }
        if( link.getDescription() != null )
            linkObject.setDescription( link.getDescription() );
        if( link.getServer() != null )
            linkObject.setServerObject( parseServer(link.getServer()) );

        return linkObject;
    }

    public static Link composeLink (LinkObject linkObject){
        Link link = new Link();

        return link;
    }

    public static HeaderObject parseHeader(Header header){
        HeaderObject headerObject = new HeaderObject();

        if( header.getRequired() != null )
            headerObject.setRequired( header.getRequired() );
        if( header.getDescription() != null )
            headerObject.setDescription( header.getDescription() );
        if( header.getDeprecated() != null )
            headerObject.setDeprecatedBoolean( header.getDeprecated() );
        if( header.getStyle() != null )
            headerObject.setStyle( header.getStyle() );
        if( header.getExplode() != null )
            headerObject.setExplode( header.getExplode() );
        if( header.getAllowReserved() != null )
            headerObject.setExplode( header.getAllowReserved() );
        if( header.getExample() != null )
            headerObject.setExample( header.getExample() );
        if( header.getExamples() != null ){
            for( String key : header.getExamples().keySet() )
                headerObject.addExamplesTuple(new ExampleObjectTuple(key, parseExample(header.getExample(key))));
        }
        if( header.getContentMediaTypes() != null ){
            for( String key : header.getContentMediaTypes().keySet() )
                headerObject.addContentTuple(new ContentObjectTuple(key, parseMediaType(header.getContentMediaType(key))));
        }

        return headerObject;
    }

    public static Header header (HeaderObject headerObject){
        Header header = new Header();

        return header;
    }

    public static TagObject parseTag(Tag tag){
        TagObject tagObject = new TagObject();

        tagObject.setName( tag.getName() );

        if( tag.getDescription() != null )
            tagObject.setDescription( tag.getDescription() );
        if( tag.getExternalDocs() != null )
            tagObject.setExternalDocumentationObject( parseExternalDocs(tag.getExternalDocs()) );

        return tagObject;
    }

    public static Tag composeTag (TagObject tagObject){
        Tag tag = new Tag();

        return tag;
    }

    public static SecuritySchemeObject parseSecurityScheme(SecurityScheme securityScheme){
        SecuritySchemeObject securitySchemeObject = new SecuritySchemeObject();
        Flows flows = new Flows();

        securitySchemeObject.setType( securityScheme.getType() );
        securitySchemeObject.setName( securityScheme.getName() );
        securitySchemeObject.setIn( securityScheme.getIn() );
        securitySchemeObject.setScheme( securityScheme.getScheme() );
        securitySchemeObject.setOpenIdConnectUrl( securityScheme.getOpenIdConnectUrl() );
        flows.setOAuthFlowsObject( parseOAuthFlows(securityScheme.getFlows()) );
        securitySchemeObject.setFlows( flows );

        if( securityScheme.getDescription() != null )
            securitySchemeObject.setDescription( securityScheme.getDescription() );
        if( securityScheme.getBearerFormat() != null )
            securitySchemeObject.setBearerFormat( securityScheme.getBearerFormat() );

        return securitySchemeObject;
    }

    public static SecurityScheme composeSecurityScheme (SecuritySchemeObject securitySchemeObject){
        SecurityScheme securityScheme = new SecurityScheme();

        return securityScheme;
    }

    public static OAuthFlowsObject parseOAuthFlows(OAuthFlows oAuthFlows){
        OAuthFlowsObject oAuthFlowsObject = new OAuthFlowsObject();
        Implicit implicit = new Implicit();
        Password password = new Password();
        ClientCredentials clientCredentials = new ClientCredentials();
        AuthorizationCode authorizationCode = new AuthorizationCode();

        if( oAuthFlows.getImplicit() != null )
            implicit.setOAuthFlowObject( parseOAuthFlow(oAuthFlows.getImplicit()) );
        if( oAuthFlows.getPassword() != null )
            password.setOAuthFlowObject( parseOAuthFlow(oAuthFlows.getPassword()) );
        if( oAuthFlows.getClientCredentials() != null )
            clientCredentials.setOAuthFlowObject( parseOAuthFlow(oAuthFlows.getClientCredentials()) );
        if( oAuthFlows.getAuthorizationCode() != null )
            authorizationCode.setOAuthFlowObject( parseOAuthFlow(oAuthFlows.getAuthorizationCode()) );

        oAuthFlowsObject.setImplicit(implicit);
        oAuthFlowsObject.setPassword(password);
        oAuthFlowsObject.setClientCredentials(clientCredentials);
        oAuthFlowsObject.setAuthorizationCode(authorizationCode);

        return oAuthFlowsObject;
    }

    public static OAuthFlows composeOAuthFlows (OAuthFlowsObject oAuthFlowsObject){
        OAuthFlows oAuthFlows = new OAuthFlows();

        return oAuthFlows;
    }

    public static OAuthFlowObject parseOAuthFlow(OAuthFlow oAuthFlow){
        OAuthFlowObject oAuthFlowObject = new OAuthFlowObject();

        oAuthFlowObject.setAuthorizationUrl( oAuthFlow.getAuthorizationUrl() );
        oAuthFlowObject.setTokenUrl( oAuthFlow.getTokenUrl() );
        for( String key : oAuthFlow.getScopes().keySet() )
            oAuthFlowObject.addScopesTuple( new ScopesTuple(key, oAuthFlow.getScope(key)) );

        if( oAuthFlow.getRefreshUrl() != null )
            oAuthFlowObject.setRefreshUrl( oAuthFlow.getRefreshUrl() );

        return oAuthFlowObject;
    }

    public static OAuthFlow composeOAuthFlow (OAuthFlowObject oAuthFlowObject){
        OAuthFlow oAuthFlow = new OAuthFlow();

        return oAuthFlow;
    }

    public static SecurityRequirementObject parseSecurityRequirement(SecurityRequirement securityRequirement){
        SecurityRequirementObject securityRequirementObject = new SecurityRequirementObject();


        if( securityRequirement.getRequirements() != null ){
            for( String key : securityRequirement.getRequirements().keySet() ){
                JastAddList<SecurityRequirementTuple> tuples = new JastAddList<>();
                for( String v : securityRequirement.getRequirement(key) ) {
                    JastAddList<SecurityRequirementValue> values = new JastAddList<>();
                }

            }
        }

        return securityRequirementObject;
    }

    public static SecurityRequirement composeSecurityRequiremnet (SecurityRequirementObject securityRequirementObject){
        SecurityRequirement securityRequirement = new SecurityRequirement();

        return securityRequirement;
    }
}