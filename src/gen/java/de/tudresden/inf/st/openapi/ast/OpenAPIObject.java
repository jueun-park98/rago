/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.core.model.reference.Reference;
import org.openapi4j.core.model.OAIContext;
import java.io.IOException;
import java.util.*;
import java.net.URL;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.openapi4j.core.exception.DecodeException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.util.Random;
import java.util.stream.IntStream;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:2
 * @astdecl OpenAPIObject : ASTNode ::= <OpenAPI:String> [InfoObject] ServerObject* PathsObject* [ComponentsObject] SecurityRequirementObject* TagObject* [ExternalDocObject] <Context:OAIContext> Extension* InferredParameter*;
 * @production OpenAPIObject : {@link ASTNode} ::= <span class="component">&lt;OpenAPI:String&gt;</span> <span class="component">[{@link InfoObject}]</span> <span class="component">{@link ServerObject}*</span> <span class="component">{@link PathsObject}*</span> <span class="component">[{@link ComponentsObject}]</span> <span class="component">{@link SecurityRequirementObject}*</span> <span class="component">{@link TagObject}*</span> <span class="component">[{@link ExternalDocObject}]</span> <span class="component">&lt;Context:OAIContext&gt;</span> <span class="component">{@link Extension}*</span> <span class="component">{@link InferredParameter}*</span>;

 */
public class OpenAPIObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:13
   */
  public static OpenApi3 composeOpenAPI (OpenAPIObject openapi){
        OpenApi3 api3 = new OpenApi3();
        Map<Object, ASTNode> map = new HashMap<>();

        if( !openapi.getOpenAPI().isEmpty() )
        api3.setOpenapi(openapi.getOpenAPI());
        if( openapi.hasInfoObject() )
        api3.setInfo(InfoObject.composeInfo(openapi.getInfoObject(), map));
        if( openapi.getNumServerObject() != 0 ){
        List<org.openapi4j.parser.model.v3.Server> servers = new ArrayList<>();
        for( ServerObject s : openapi.getServerObjects() )
        servers.add(ServerObject.composeServer(s, map));
        api3.setServers(servers);
        }
        if( openapi.getNumPathsObject() != 0 ){
        Map<String, Path> paths = new HashMap<>();
        for( PathsObject p : openapi.getPathsObjects() )
        paths.put( p.getRef(), PathItemObject.composePath(p.getPathItemObject(), map) );
        api3.setPaths(paths);
        }
        if( openapi.hasComponentsObject() )
        api3.setComponents( ComponentsObject.composeComponents(openapi.getComponentsObject(), map) );
        if( openapi.getNumSecurityRequirementObject() != 0 ){
        List<SecurityRequirement> securityRequirements = new ArrayList<>();
        for( SecurityRequirementObject s : openapi.getSecurityRequirementObjects() )
        securityRequirements.add( SecurityRequirementObject.composeSecurityRequirement(s, map) );
        api3.setSecurityRequirements(securityRequirements);
        }
        if( openapi.getNumTagObject() != 0 ){
        List<org.openapi4j.parser.model.v3.Tag> tags = new ArrayList<>();
        for( TagObject t : openapi.getTagObjects() )
        tags.add( TagObject.composeTag(t, map) );
        api3.setTags( tags );
        }
        if( openapi.hasExternalDocObject() )
        api3.setExternalDocs(ExternalDocObject.composeExternalDocs(openapi.getExternalDocObject(), map));
        if( openapi.getContext() != null )
        api3.setContext(openapi.getContext());
        if( openapi.getNumExtension() != 0 ){
        Map<String, Object> extensionMap = new HashMap<>();
        for( Extension e : openapi.getExtensions() )
        extensionMap.put(e.getKey(), e.getValue());
        api3.setExtensions(extensionMap);
        }

        return api3;
        }
  /**
   * @aspect InferParameter
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:16
   */
  public void generateRequestsWithInferredParameters()throws Exception{
        Set<String> urls=new HashSet<>();

        generateRequests();

        for(PathsObject p:getPathsObjects())
        p.inferUrl(urls);
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:40
   */
  public static OpenAPIObject parseOpenAPI(OpenApi3 api) throws IOException, ResolutionException, ValidationException, DecodeException {
        OpenAPIObject openapi = new OpenAPIObject();
        Map<Object, ASTNode> map = new HashMap<>();

        if( api.getContext() != null )
        openapi.setContext(api.getContext());
        if( api.getOpenapi() != null )
        openapi.setOpenAPI(api.getOpenapi());
        if( api.getInfo() != null )
        openapi.setInfoObject(InfoObject.parseInfo(api.getInfo(), map));
        if( api.getPaths() != null ){
        for( String key : api.getPaths().keySet() )
        openapi.addPathsObject(new PathsObject( key, PathItemObject.parsePath(api.getPath(key), api.getContext(), map)));
        }
        if( api.getServers() != null ){
        for( Server s : api.getServers() )
        openapi.addServerObject(ServerObject.parseServer(s, map));
        }
        if( api.getComponents() != null )
        openapi.setComponentsObject(ComponentsObject.parseComponents(api.getComponents(), api.getContext(), map));
        if( api.getSecurityRequirements() != null ){
        for( SecurityRequirement s : api.getSecurityRequirements() )
        openapi.addSecurityRequirementObject(SecurityRequirementObject.parseSecurityRequirement(s, map));
        }
        if( api.getTags() != null ){
        for( org.openapi4j.parser.model.v3.Tag t : api.getTags() )
        openapi.addTagObject(TagObject.parseTag(t, map));
        }
        if( api.getExternalDocs() != null )
        openapi.setExternalDocObject(ExternalDocObject.parseExternalDocs(api.getExternalDocs(), map));
        if( api.getExtensions() != null ){
        for( String key : api.getExtensions().keySet() )
        openapi.addExtension(new Extension(key, api.getExtensions().get(key)));
        }

        map.put(api, openapi);
        return openapi;
        }
  /**
   * @aspect RandomRequestGenerator
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:12
   */
  public Map<ResponseObject, String> generateRequests() throws Exception {
        Set<String> urls = new HashSet<>();
        Map<ResponseObject, String> responses = new HashMap<>();

        for( PathsObject p : getPathsObjects() )
            p.generateUrl(responses);

        //System.out.println(responses.size());
        /*
        for( String path : urls ){
        if( path.endsWith("GET") ){
        System.out.println(this.getServerObject(0).getUrl() + path.substring(0, path.length()-3));


        URL url = new URL(this.getServerObject(0).getUrl() + path.substring(0, path.length()-3));
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET"); // HTTP GET
        con.setDoOutput(true); // GET

        int responseCode = con.getResponseCode();
        //System.out.println("HTTP status code (GET) : " + responseCode);
        if( responseCode < 300 && responseCode >= 200 ){
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
        }
        in.close();

        //System.out.println("HTTP body : " + response.toString());
        responses.add(response.toString());
        }
        } else if( path.endsWith("POST") ) {
        //System.out.println(this.getServerObject(0).getUrl() + path.substring(0, path.length()-4));


        URL url = new URL(this.getServerObject(0).getUrl() + path.substring(0, path.length()-4));
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("POST"); // HTTP POST
        con.setDoOutput(true); // POST

        int responseCode = con.getResponseCode();
        //System.out.println("HTTP status code (POST) : " + responseCode);

        if( responseCode < 300 && responseCode >= 200 ){
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
        }
        in.close();


        //System.out.println("HTTP body : " + response.toString());
        responses.add(response.toString());
        }
        }

        }*/

        //for( String s : responses )
        //    System.out.println("Response : " + s.toString());
        return responses;
    }
  /**
   * @declaredat ASTNode:1
   */
  public OpenAPIObject() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[9];
    setChild(new Opt(), 0);
    setChild(new JastAddList(), 1);
    setChild(new JastAddList(), 2);
    setChild(new Opt(), 3);
    setChild(new JastAddList(), 4);
    setChild(new JastAddList(), 5);
    setChild(new Opt(), 6);
    setChild(new JastAddList(), 7);
    setChild(new JastAddList(), 8);
  }
  /**
   * @declaredat ASTNode:22
   */
  @ASTNodeAnnotation.Constructor(
    name = {"OpenAPI", "InfoObject", "ServerObject", "PathsObject", "ComponentsObject", "SecurityRequirementObject", "TagObject", "ExternalDocObject", "Context", "Extension", "InferredParameter"},
    type = {"String", "Opt<InfoObject>", "JastAddList<ServerObject>", "JastAddList<PathsObject>", "Opt<ComponentsObject>", "JastAddList<SecurityRequirementObject>", "JastAddList<TagObject>", "Opt<ExternalDocObject>", "OAIContext", "JastAddList<Extension>", "JastAddList<InferredParameter>"},
    kind = {"Token", "Opt", "List", "List", "Opt", "List", "List", "Opt", "Token", "List", "List"}
  )
  public OpenAPIObject(String p0, Opt<InfoObject> p1, JastAddList<ServerObject> p2, JastAddList<PathsObject> p3, Opt<ComponentsObject> p4, JastAddList<SecurityRequirementObject> p5, JastAddList<TagObject> p6, Opt<ExternalDocObject> p7, OAIContext p8, JastAddList<Extension> p9, JastAddList<InferredParameter> p10) {
    setOpenAPI(p0);
    setChild(p1, 0);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
    setChild(p5, 4);
    setChild(p6, 5);
    setChild(p7, 6);
    setContext(p8);
    setChild(p9, 7);
    setChild(p10, 8);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:41
   */
  protected int numChildren() {
    return 9;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:47
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:55
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    OpenAPIObject_collectInferredParameters_visited = false;
    OpenAPIObject_collectInferredParameters_computed = null;
    OpenAPIObject_collectInferredParameters_value = null;
    OpenAPIObject_schemaTuples_visited = false;
    OpenAPIObject_schemaTuples_computed = null;
    OpenAPIObject_schemaTuples_value = null;
    OpenAPIObject_responseTuples_visited = false;
    OpenAPIObject_responseTuples_computed = null;
    OpenAPIObject_responseTuples_value = null;
    OpenAPIObject_parameterTuples_visited = false;
    OpenAPIObject_parameterTuples_computed = null;
    OpenAPIObject_parameterTuples_value = null;
    OpenAPIObject_requestBodyTuples_visited = false;
    OpenAPIObject_requestBodyTuples_computed = null;
    OpenAPIObject_requestBodyTuples_value = null;
    OpenAPIObject_headerTuples_visited = false;
    OpenAPIObject_headerTuples_computed = null;
    OpenAPIObject_headerTuples_value = null;
    OpenAPIObject_securitySchemeTuples_visited = false;
    OpenAPIObject_securitySchemeTuples_computed = null;
    OpenAPIObject_securitySchemeTuples_value = null;
    OpenAPIObject_linkTuples_visited = false;
    OpenAPIObject_linkTuples_computed = null;
    OpenAPIObject_linkTuples_value = null;
    OpenAPIObject_callbackTuples_visited = false;
    OpenAPIObject_callbackTuples_computed = null;
    OpenAPIObject_callbackTuples_value = null;
    contributorMap_OpenAPIObject_collectInferredParameters = null;
    contributorMap_OpenAPIObject_schemaTuples = null;
    contributorMap_OpenAPIObject_responseTuples = null;
    contributorMap_OpenAPIObject_parameterTuples = null;
    contributorMap_OpenAPIObject_requestBodyTuples = null;
    contributorMap_OpenAPIObject_headerTuples = null;
    contributorMap_OpenAPIObject_securitySchemeTuples = null;
    contributorMap_OpenAPIObject_linkTuples = null;
    contributorMap_OpenAPIObject_callbackTuples = null;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:95
   */
  public OpenAPIObject clone() throws CloneNotSupportedException {
    OpenAPIObject node = (OpenAPIObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:100
   */
  public OpenAPIObject copy() {
    try {
      OpenAPIObject node = (OpenAPIObject) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:119
   */
  @Deprecated
  public OpenAPIObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:129
   */
  public OpenAPIObject treeCopyNoTransform() {
    OpenAPIObject tree = (OpenAPIObject) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:149
   */
  public OpenAPIObject treeCopy() {
    OpenAPIObject tree = (OpenAPIObject) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:163
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_OpenAPI == ((OpenAPIObject) node).tokenString_OpenAPI) && (tokenOAIContext_Context == ((OpenAPIObject) node).tokenOAIContext_Context);    
  }
  /**
   * Replaces the lexeme OpenAPI.
   * @param value The new value for the lexeme OpenAPI.
   * @apilevel high-level
   */
  public void setOpenAPI(String value) {
    tokenString_OpenAPI = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_OpenAPI;
  /**
   * Retrieves the value for the lexeme OpenAPI.
   * @return The value for the lexeme OpenAPI.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="OpenAPI")
  public String getOpenAPI() {
    return tokenString_OpenAPI != null ? tokenString_OpenAPI : "";
  }
  /**
   * Replaces the optional node for the InfoObject child. This is the <code>Opt</code>
   * node containing the child InfoObject, not the actual child!
   * @param opt The new node to be used as the optional node for the InfoObject child.
   * @apilevel low-level
   */
  public void setInfoObjectOpt(Opt<InfoObject> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) InfoObject child.
   * @param node The new node to be used as the InfoObject child.
   * @apilevel high-level
   */
  public void setInfoObject(InfoObject node) {
    getInfoObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional InfoObject child exists.
   * @return {@code true} if the optional InfoObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasInfoObject() {
    return getInfoObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) InfoObject child.
   * @return The InfoObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public InfoObject getInfoObject() {
    return (InfoObject) getInfoObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the InfoObject child. This is the <code>Opt</code> node containing the child InfoObject, not the actual child!
   * @return The optional node for child the InfoObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="InfoObject")
  public Opt<InfoObject> getInfoObjectOpt() {
    return (Opt<InfoObject>) getChild(0);
  }
  /**
   * Retrieves the optional node for child InfoObject. This is the <code>Opt</code> node containing the child InfoObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child InfoObject.
   * @apilevel low-level
   */
  public Opt<InfoObject> getInfoObjectOptNoTransform() {
    return (Opt<InfoObject>) getChildNoTransform(0);
  }
  /**
   * Replaces the ServerObject list.
   * @param list The new list node to be used as the ServerObject list.
   * @apilevel high-level
   */
  public void setServerObjectList(JastAddList<ServerObject> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the ServerObject list.
   * @return Number of children in the ServerObject list.
   * @apilevel high-level
   */
  public int getNumServerObject() {
    return getServerObjectList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ServerObject list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ServerObject list.
   * @apilevel low-level
   */
  public int getNumServerObjectNoTransform() {
    return getServerObjectListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ServerObject list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ServerObject list.
   * @apilevel high-level
   */
  public ServerObject getServerObject(int i) {
    return (ServerObject) getServerObjectList().getChild(i);
  }
  /**
   * Check whether the ServerObject list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasServerObject() {
    return getServerObjectList().getNumChild() != 0;
  }
  /**
   * Append an element to the ServerObject list.
   * @param node The element to append to the ServerObject list.
   * @apilevel high-level
   */
  public void addServerObject(ServerObject node) {
    JastAddList<ServerObject> list = (parent == null) ? getServerObjectListNoTransform() : getServerObjectList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addServerObjectNoTransform(ServerObject node) {
    JastAddList<ServerObject> list = getServerObjectListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ServerObject list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setServerObject(ServerObject node, int i) {
    JastAddList<ServerObject> list = getServerObjectList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ServerObject list.
   * @return The node representing the ServerObject list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ServerObject")
  public JastAddList<ServerObject> getServerObjectList() {
    JastAddList<ServerObject> list = (JastAddList<ServerObject>) getChild(1);
    return list;
  }
  /**
   * Retrieves the ServerObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerObject list.
   * @apilevel low-level
   */
  public JastAddList<ServerObject> getServerObjectListNoTransform() {
    return (JastAddList<ServerObject>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the ServerObject list without
   * triggering rewrites.
   */
  public ServerObject getServerObjectNoTransform(int i) {
    return (ServerObject) getServerObjectListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ServerObject list.
   * @return The node representing the ServerObject list.
   * @apilevel high-level
   */
  public JastAddList<ServerObject> getServerObjects() {
    return getServerObjectList();
  }
  /**
   * Retrieves the ServerObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerObject list.
   * @apilevel low-level
   */
  public JastAddList<ServerObject> getServerObjectsNoTransform() {
    return getServerObjectListNoTransform();
  }
  /**
   * Replaces the PathsObject list.
   * @param list The new list node to be used as the PathsObject list.
   * @apilevel high-level
   */
  public void setPathsObjectList(JastAddList<PathsObject> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the PathsObject list.
   * @return Number of children in the PathsObject list.
   * @apilevel high-level
   */
  public int getNumPathsObject() {
    return getPathsObjectList().getNumChild();
  }
  /**
   * Retrieves the number of children in the PathsObject list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the PathsObject list.
   * @apilevel low-level
   */
  public int getNumPathsObjectNoTransform() {
    return getPathsObjectListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the PathsObject list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the PathsObject list.
   * @apilevel high-level
   */
  public PathsObject getPathsObject(int i) {
    return (PathsObject) getPathsObjectList().getChild(i);
  }
  /**
   * Check whether the PathsObject list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasPathsObject() {
    return getPathsObjectList().getNumChild() != 0;
  }
  /**
   * Append an element to the PathsObject list.
   * @param node The element to append to the PathsObject list.
   * @apilevel high-level
   */
  public void addPathsObject(PathsObject node) {
    JastAddList<PathsObject> list = (parent == null) ? getPathsObjectListNoTransform() : getPathsObjectList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addPathsObjectNoTransform(PathsObject node) {
    JastAddList<PathsObject> list = getPathsObjectListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the PathsObject list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setPathsObject(PathsObject node, int i) {
    JastAddList<PathsObject> list = getPathsObjectList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the PathsObject list.
   * @return The node representing the PathsObject list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="PathsObject")
  public JastAddList<PathsObject> getPathsObjectList() {
    JastAddList<PathsObject> list = (JastAddList<PathsObject>) getChild(2);
    return list;
  }
  /**
   * Retrieves the PathsObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the PathsObject list.
   * @apilevel low-level
   */
  public JastAddList<PathsObject> getPathsObjectListNoTransform() {
    return (JastAddList<PathsObject>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the PathsObject list without
   * triggering rewrites.
   */
  public PathsObject getPathsObjectNoTransform(int i) {
    return (PathsObject) getPathsObjectListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the PathsObject list.
   * @return The node representing the PathsObject list.
   * @apilevel high-level
   */
  public JastAddList<PathsObject> getPathsObjects() {
    return getPathsObjectList();
  }
  /**
   * Retrieves the PathsObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the PathsObject list.
   * @apilevel low-level
   */
  public JastAddList<PathsObject> getPathsObjectsNoTransform() {
    return getPathsObjectListNoTransform();
  }
  /**
   * Replaces the optional node for the ComponentsObject child. This is the <code>Opt</code>
   * node containing the child ComponentsObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ComponentsObject child.
   * @apilevel low-level
   */
  public void setComponentsObjectOpt(Opt<ComponentsObject> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) ComponentsObject child.
   * @param node The new node to be used as the ComponentsObject child.
   * @apilevel high-level
   */
  public void setComponentsObject(ComponentsObject node) {
    getComponentsObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ComponentsObject child exists.
   * @return {@code true} if the optional ComponentsObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasComponentsObject() {
    return getComponentsObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ComponentsObject child.
   * @return The ComponentsObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ComponentsObject getComponentsObject() {
    return (ComponentsObject) getComponentsObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ComponentsObject child. This is the <code>Opt</code> node containing the child ComponentsObject, not the actual child!
   * @return The optional node for child the ComponentsObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ComponentsObject")
  public Opt<ComponentsObject> getComponentsObjectOpt() {
    return (Opt<ComponentsObject>) getChild(3);
  }
  /**
   * Retrieves the optional node for child ComponentsObject. This is the <code>Opt</code> node containing the child ComponentsObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ComponentsObject.
   * @apilevel low-level
   */
  public Opt<ComponentsObject> getComponentsObjectOptNoTransform() {
    return (Opt<ComponentsObject>) getChildNoTransform(3);
  }
  /**
   * Replaces the SecurityRequirementObject list.
   * @param list The new list node to be used as the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public void setSecurityRequirementObjectList(JastAddList<SecurityRequirementObject> list) {
    setChild(list, 4);
  }
  /**
   * Retrieves the number of children in the SecurityRequirementObject list.
   * @return Number of children in the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public int getNumSecurityRequirementObject() {
    return getSecurityRequirementObjectList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SecurityRequirementObject list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SecurityRequirementObject list.
   * @apilevel low-level
   */
  public int getNumSecurityRequirementObjectNoTransform() {
    return getSecurityRequirementObjectListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SecurityRequirementObject list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public SecurityRequirementObject getSecurityRequirementObject(int i) {
    return (SecurityRequirementObject) getSecurityRequirementObjectList().getChild(i);
  }
  /**
   * Check whether the SecurityRequirementObject list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSecurityRequirementObject() {
    return getSecurityRequirementObjectList().getNumChild() != 0;
  }
  /**
   * Append an element to the SecurityRequirementObject list.
   * @param node The element to append to the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public void addSecurityRequirementObject(SecurityRequirementObject node) {
    JastAddList<SecurityRequirementObject> list = (parent == null) ? getSecurityRequirementObjectListNoTransform() : getSecurityRequirementObjectList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSecurityRequirementObjectNoTransform(SecurityRequirementObject node) {
    JastAddList<SecurityRequirementObject> list = getSecurityRequirementObjectListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SecurityRequirementObject list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSecurityRequirementObject(SecurityRequirementObject node, int i) {
    JastAddList<SecurityRequirementObject> list = getSecurityRequirementObjectList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SecurityRequirementObject list.
   * @return The node representing the SecurityRequirementObject list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SecurityRequirementObject")
  public JastAddList<SecurityRequirementObject> getSecurityRequirementObjectList() {
    JastAddList<SecurityRequirementObject> list = (JastAddList<SecurityRequirementObject>) getChild(4);
    return list;
  }
  /**
   * Retrieves the SecurityRequirementObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecurityRequirementObject list.
   * @apilevel low-level
   */
  public JastAddList<SecurityRequirementObject> getSecurityRequirementObjectListNoTransform() {
    return (JastAddList<SecurityRequirementObject>) getChildNoTransform(4);
  }
  /**
   * @return the element at index {@code i} in the SecurityRequirementObject list without
   * triggering rewrites.
   */
  public SecurityRequirementObject getSecurityRequirementObjectNoTransform(int i) {
    return (SecurityRequirementObject) getSecurityRequirementObjectListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the SecurityRequirementObject list.
   * @return The node representing the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public JastAddList<SecurityRequirementObject> getSecurityRequirementObjects() {
    return getSecurityRequirementObjectList();
  }
  /**
   * Retrieves the SecurityRequirementObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecurityRequirementObject list.
   * @apilevel low-level
   */
  public JastAddList<SecurityRequirementObject> getSecurityRequirementObjectsNoTransform() {
    return getSecurityRequirementObjectListNoTransform();
  }
  /**
   * Replaces the TagObject list.
   * @param list The new list node to be used as the TagObject list.
   * @apilevel high-level
   */
  public void setTagObjectList(JastAddList<TagObject> list) {
    setChild(list, 5);
  }
  /**
   * Retrieves the number of children in the TagObject list.
   * @return Number of children in the TagObject list.
   * @apilevel high-level
   */
  public int getNumTagObject() {
    return getTagObjectList().getNumChild();
  }
  /**
   * Retrieves the number of children in the TagObject list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the TagObject list.
   * @apilevel low-level
   */
  public int getNumTagObjectNoTransform() {
    return getTagObjectListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the TagObject list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the TagObject list.
   * @apilevel high-level
   */
  public TagObject getTagObject(int i) {
    return (TagObject) getTagObjectList().getChild(i);
  }
  /**
   * Check whether the TagObject list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasTagObject() {
    return getTagObjectList().getNumChild() != 0;
  }
  /**
   * Append an element to the TagObject list.
   * @param node The element to append to the TagObject list.
   * @apilevel high-level
   */
  public void addTagObject(TagObject node) {
    JastAddList<TagObject> list = (parent == null) ? getTagObjectListNoTransform() : getTagObjectList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addTagObjectNoTransform(TagObject node) {
    JastAddList<TagObject> list = getTagObjectListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the TagObject list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setTagObject(TagObject node, int i) {
    JastAddList<TagObject> list = getTagObjectList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the TagObject list.
   * @return The node representing the TagObject list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="TagObject")
  public JastAddList<TagObject> getTagObjectList() {
    JastAddList<TagObject> list = (JastAddList<TagObject>) getChild(5);
    return list;
  }
  /**
   * Retrieves the TagObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TagObject list.
   * @apilevel low-level
   */
  public JastAddList<TagObject> getTagObjectListNoTransform() {
    return (JastAddList<TagObject>) getChildNoTransform(5);
  }
  /**
   * @return the element at index {@code i} in the TagObject list without
   * triggering rewrites.
   */
  public TagObject getTagObjectNoTransform(int i) {
    return (TagObject) getTagObjectListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the TagObject list.
   * @return The node representing the TagObject list.
   * @apilevel high-level
   */
  public JastAddList<TagObject> getTagObjects() {
    return getTagObjectList();
  }
  /**
   * Retrieves the TagObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TagObject list.
   * @apilevel low-level
   */
  public JastAddList<TagObject> getTagObjectsNoTransform() {
    return getTagObjectListNoTransform();
  }
  /**
   * Replaces the optional node for the ExternalDocObject child. This is the <code>Opt</code>
   * node containing the child ExternalDocObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ExternalDocObject child.
   * @apilevel low-level
   */
  public void setExternalDocObjectOpt(Opt<ExternalDocObject> opt) {
    setChild(opt, 6);
  }
  /**
   * Replaces the (optional) ExternalDocObject child.
   * @param node The new node to be used as the ExternalDocObject child.
   * @apilevel high-level
   */
  public void setExternalDocObject(ExternalDocObject node) {
    getExternalDocObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ExternalDocObject child exists.
   * @return {@code true} if the optional ExternalDocObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasExternalDocObject() {
    return getExternalDocObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ExternalDocObject child.
   * @return The ExternalDocObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ExternalDocObject getExternalDocObject() {
    return (ExternalDocObject) getExternalDocObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ExternalDocObject child. This is the <code>Opt</code> node containing the child ExternalDocObject, not the actual child!
   * @return The optional node for child the ExternalDocObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ExternalDocObject")
  public Opt<ExternalDocObject> getExternalDocObjectOpt() {
    return (Opt<ExternalDocObject>) getChild(6);
  }
  /**
   * Retrieves the optional node for child ExternalDocObject. This is the <code>Opt</code> node containing the child ExternalDocObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ExternalDocObject.
   * @apilevel low-level
   */
  public Opt<ExternalDocObject> getExternalDocObjectOptNoTransform() {
    return (Opt<ExternalDocObject>) getChildNoTransform(6);
  }
  /**
   * Replaces the lexeme Context.
   * @param value The new value for the lexeme Context.
   * @apilevel high-level
   */
  public void setContext(OAIContext value) {
    tokenOAIContext_Context = value;
  }
  /** @apilevel internal 
   */
  protected OAIContext tokenOAIContext_Context;
  /**
   * Retrieves the value for the lexeme Context.
   * @return The value for the lexeme Context.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Context")
  public OAIContext getContext() {
    return tokenOAIContext_Context;
  }
  /**
   * Replaces the Extension list.
   * @param list The new list node to be used as the Extension list.
   * @apilevel high-level
   */
  public void setExtensionList(JastAddList<Extension> list) {
    setChild(list, 7);
  }
  /**
   * Retrieves the number of children in the Extension list.
   * @return Number of children in the Extension list.
   * @apilevel high-level
   */
  public int getNumExtension() {
    return getExtensionList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Extension list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Extension list.
   * @apilevel low-level
   */
  public int getNumExtensionNoTransform() {
    return getExtensionListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Extension list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Extension list.
   * @apilevel high-level
   */
  public Extension getExtension(int i) {
    return (Extension) getExtensionList().getChild(i);
  }
  /**
   * Check whether the Extension list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExtension() {
    return getExtensionList().getNumChild() != 0;
  }
  /**
   * Append an element to the Extension list.
   * @param node The element to append to the Extension list.
   * @apilevel high-level
   */
  public void addExtension(Extension node) {
    JastAddList<Extension> list = (parent == null) ? getExtensionListNoTransform() : getExtensionList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addExtensionNoTransform(Extension node) {
    JastAddList<Extension> list = getExtensionListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Extension list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExtension(Extension node, int i) {
    JastAddList<Extension> list = getExtensionList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Extension list.
   * @return The node representing the Extension list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Extension")
  public JastAddList<Extension> getExtensionList() {
    JastAddList<Extension> list = (JastAddList<Extension>) getChild(7);
    return list;
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionListNoTransform() {
    return (JastAddList<Extension>) getChildNoTransform(7);
  }
  /**
   * @return the element at index {@code i} in the Extension list without
   * triggering rewrites.
   */
  public Extension getExtensionNoTransform(int i) {
    return (Extension) getExtensionListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Extension list.
   * @return The node representing the Extension list.
   * @apilevel high-level
   */
  public JastAddList<Extension> getExtensions() {
    return getExtensionList();
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionsNoTransform() {
    return getExtensionListNoTransform();
  }
  /**
   * Replaces the InferredParameter list.
   * @param list The new list node to be used as the InferredParameter list.
   * @apilevel high-level
   */
  public void setInferredParameterList(JastAddList<InferredParameter> list) {
    setChild(list, 8);
  }
  /**
   * Retrieves the number of children in the InferredParameter list.
   * @return Number of children in the InferredParameter list.
   * @apilevel high-level
   */
  public int getNumInferredParameter() {
    return getInferredParameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the InferredParameter list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the InferredParameter list.
   * @apilevel low-level
   */
  public int getNumInferredParameterNoTransform() {
    return getInferredParameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the InferredParameter list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the InferredParameter list.
   * @apilevel high-level
   */
  public InferredParameter getInferredParameter(int i) {
    return (InferredParameter) getInferredParameterList().getChild(i);
  }
  /**
   * Check whether the InferredParameter list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasInferredParameter() {
    return getInferredParameterList().getNumChild() != 0;
  }
  /**
   * Append an element to the InferredParameter list.
   * @param node The element to append to the InferredParameter list.
   * @apilevel high-level
   */
  public void addInferredParameter(InferredParameter node) {
    JastAddList<InferredParameter> list = (parent == null) ? getInferredParameterListNoTransform() : getInferredParameterList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addInferredParameterNoTransform(InferredParameter node) {
    JastAddList<InferredParameter> list = getInferredParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the InferredParameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setInferredParameter(InferredParameter node, int i) {
    JastAddList<InferredParameter> list = getInferredParameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the InferredParameter list.
   * @return The node representing the InferredParameter list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="InferredParameter")
  public JastAddList<InferredParameter> getInferredParameterList() {
    JastAddList<InferredParameter> list = (JastAddList<InferredParameter>) getChild(8);
    return list;
  }
  /**
   * Retrieves the InferredParameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the InferredParameter list.
   * @apilevel low-level
   */
  public JastAddList<InferredParameter> getInferredParameterListNoTransform() {
    return (JastAddList<InferredParameter>) getChildNoTransform(8);
  }
  /**
   * @return the element at index {@code i} in the InferredParameter list without
   * triggering rewrites.
   */
  public InferredParameter getInferredParameterNoTransform(int i) {
    return (InferredParameter) getInferredParameterListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the InferredParameter list.
   * @return The node representing the InferredParameter list.
   * @apilevel high-level
   */
  public JastAddList<InferredParameter> getInferredParameters() {
    return getInferredParameterList();
  }
  /**
   * Retrieves the InferredParameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the InferredParameter list.
   * @apilevel low-level
   */
  public JastAddList<InferredParameter> getInferredParametersNoTransform() {
    return getInferredParameterListNoTransform();
  }
  /**
   * @aspect <NoAspect>
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:10
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_OpenAPIObject_collectInferredParameters = null;

  /** @apilevel internal */
  protected void survey_OpenAPIObject_collectInferredParameters() {
    if (contributorMap_OpenAPIObject_collectInferredParameters == null) {
      contributorMap_OpenAPIObject_collectInferredParameters = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_OpenAPIObject_collectInferredParameters(this, contributorMap_OpenAPIObject_collectInferredParameters);
    }
  }

  /**
   * @aspect <NoAspect>
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:8
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_OpenAPIObject_schemaTuples = null;

  /** @apilevel internal */
  protected void survey_OpenAPIObject_schemaTuples() {
    if (contributorMap_OpenAPIObject_schemaTuples == null) {
      contributorMap_OpenAPIObject_schemaTuples = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_OpenAPIObject_schemaTuples(this, contributorMap_OpenAPIObject_schemaTuples);
    }
  }

  /**
   * @aspect <NoAspect>
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:12
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_OpenAPIObject_responseTuples = null;

  /** @apilevel internal */
  protected void survey_OpenAPIObject_responseTuples() {
    if (contributorMap_OpenAPIObject_responseTuples == null) {
      contributorMap_OpenAPIObject_responseTuples = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_OpenAPIObject_responseTuples(this, contributorMap_OpenAPIObject_responseTuples);
    }
  }

  /**
   * @aspect <NoAspect>
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:16
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_OpenAPIObject_parameterTuples = null;

  /** @apilevel internal */
  protected void survey_OpenAPIObject_parameterTuples() {
    if (contributorMap_OpenAPIObject_parameterTuples == null) {
      contributorMap_OpenAPIObject_parameterTuples = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_OpenAPIObject_parameterTuples(this, contributorMap_OpenAPIObject_parameterTuples);
    }
  }

  /**
   * @aspect <NoAspect>
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:20
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_OpenAPIObject_requestBodyTuples = null;

  /** @apilevel internal */
  protected void survey_OpenAPIObject_requestBodyTuples() {
    if (contributorMap_OpenAPIObject_requestBodyTuples == null) {
      contributorMap_OpenAPIObject_requestBodyTuples = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_OpenAPIObject_requestBodyTuples(this, contributorMap_OpenAPIObject_requestBodyTuples);
    }
  }

  /**
   * @aspect <NoAspect>
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:24
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_OpenAPIObject_headerTuples = null;

  /** @apilevel internal */
  protected void survey_OpenAPIObject_headerTuples() {
    if (contributorMap_OpenAPIObject_headerTuples == null) {
      contributorMap_OpenAPIObject_headerTuples = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_OpenAPIObject_headerTuples(this, contributorMap_OpenAPIObject_headerTuples);
    }
  }

  /**
   * @aspect <NoAspect>
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:28
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_OpenAPIObject_securitySchemeTuples = null;

  /** @apilevel internal */
  protected void survey_OpenAPIObject_securitySchemeTuples() {
    if (contributorMap_OpenAPIObject_securitySchemeTuples == null) {
      contributorMap_OpenAPIObject_securitySchemeTuples = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_OpenAPIObject_securitySchemeTuples(this, contributorMap_OpenAPIObject_securitySchemeTuples);
    }
  }

  /**
   * @aspect <NoAspect>
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:32
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_OpenAPIObject_linkTuples = null;

  /** @apilevel internal */
  protected void survey_OpenAPIObject_linkTuples() {
    if (contributorMap_OpenAPIObject_linkTuples == null) {
      contributorMap_OpenAPIObject_linkTuples = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_OpenAPIObject_linkTuples(this, contributorMap_OpenAPIObject_linkTuples);
    }
  }

  /**
   * @aspect <NoAspect>
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:36
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_OpenAPIObject_callbackTuples = null;

  /** @apilevel internal */
  protected void survey_OpenAPIObject_callbackTuples() {
    if (contributorMap_OpenAPIObject_callbackTuples == null) {
      contributorMap_OpenAPIObject_callbackTuples = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_OpenAPIObject_callbackTuples(this, contributorMap_OpenAPIObject_callbackTuples);
    }
  }

  /**
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:25
   * @apilevel internal
   */
  public Set<String> Define_inferUrl(ASTNode _callerNode, ASTNode _childNode, Set<String> urls) {
    if (_callerNode == getPathsObjectListNoTransform()) {
      // @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:26
      int i = _callerNode.getIndexOfChild(_childNode);
      {
              PathItemObject p=((PathsObject)_childNode).getPathItemObject();
              String path=getServerObject(0).getUrl();
      
              if(p.hasGet())
              urls.add(p.getGet().inferRandomUrl(path+((PathsObject)_childNode).getRef(),p.getGet().getOperationObject()));
              else if(p.hasPost())
              urls.add(p.getPost().inferRandomUrl(path+((PathsObject)_childNode).getRef(),p.getPost().getOperationObject()));
      
              return urls;
              }
    }
    else {
      return getParent().Define_inferUrl(this, _callerNode, urls);
    }
  }
  /**
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:25
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute inferUrl
   */
  protected boolean canDefine_inferUrl(ASTNode _callerNode, ASTNode _childNode, Set<String> urls) {
    return true;
  }
  /**
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:5
   * @apilevel internal
   */
  public OpenAPIObject Define_root(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return this;
  }
  /**
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:5
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute root
   */
  protected boolean canDefine_root(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:83
   * @apilevel internal
   */
  public Map<ResponseObject, String> Define_generateUrl(ASTNode _callerNode, ASTNode _childNode, Map<ResponseObject, String> responses) {
    if (_callerNode == getPathsObjectListNoTransform()) {
      // @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:84
      int i = _callerNode.getIndexOfChild(_childNode);
      {
              PathItemObject p = ((PathsObject) _childNode).getPathItemObject();
              String path = getServerObject(0).getUrl();
      
              if( p.hasGet() )
              p.getGet().generateRandomUrl(path + ((PathsObject) _childNode).getRef(), p.getGet().getOperationObject(), responses);
              //urls.add(p.getGet().generateRandomUrl(((PathsObject) _childNode).getRef(), p.getGet().getOperationObject()));
              else if( p.hasPost() )
              p.getPost().generateRandomUrl(path + ((PathsObject) _childNode).getRef(), p.getPost().getOperationObject(), responses);
              //urls.add(p.getPost().generateRandomUrl(((PathsObject) _childNode).getRef(), p.getPost().getOperationObject()));
      
              return responses;
              }
    }
    else {
      return getParent().Define_generateUrl(this, _callerNode, responses);
    }
  }
  /**
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:83
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute generateUrl
   */
  protected boolean canDefine_generateUrl(ASTNode _callerNode, ASTNode _childNode, Map<ResponseObject, String> responses) {
    return true;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
/** @apilevel internal */
protected boolean OpenAPIObject_collectInferredParameters_visited = false;
  /**
   * @attribute coll
   * @aspect InferParameter
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:10
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="InferParameter", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:10")
  public Set<InferredParameter> collectInferredParameters() {
    ASTState state = state();
    if (OpenAPIObject_collectInferredParameters_computed == ASTState.NON_CYCLE || OpenAPIObject_collectInferredParameters_computed == state().cycle()) {
      return OpenAPIObject_collectInferredParameters_value;
    }
    if (OpenAPIObject_collectInferredParameters_visited) {
      throw new RuntimeException("Circular definition of attribute OpenAPIObject.collectInferredParameters().");
    }
    OpenAPIObject_collectInferredParameters_visited = true;
    OpenAPIObject_collectInferredParameters_value = collectInferredParameters_compute();
    if (state().inCircle()) {
      OpenAPIObject_collectInferredParameters_computed = state().cycle();
    
    } else {
      OpenAPIObject_collectInferredParameters_computed = ASTState.NON_CYCLE;
    
    }
    OpenAPIObject_collectInferredParameters_visited = false;
    return OpenAPIObject_collectInferredParameters_value;
  }
  /** @apilevel internal */
  private Set<InferredParameter> collectInferredParameters_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof OpenAPIObject)) {
      node = node.getParent();
    }
    OpenAPIObject root = (OpenAPIObject) node;
    root.survey_OpenAPIObject_collectInferredParameters();
    Set<InferredParameter> _computedValue = new HashSet<InferredParameter>();
    if (root.contributorMap_OpenAPIObject_collectInferredParameters.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_OpenAPIObject_collectInferredParameters.get(this)) {
        contributor.contributeTo_OpenAPIObject_collectInferredParameters(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle OpenAPIObject_collectInferredParameters_computed = null;

  /** @apilevel internal */
  protected Set<InferredParameter> OpenAPIObject_collectInferredParameters_value;

/** @apilevel internal */
protected boolean OpenAPIObject_schemaTuples_visited = false;
  /**
   * @attribute coll
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:8
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Parser", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:8")
  public List<SchemaTuple> schemaTuples() {
    ASTState state = state();
    if (OpenAPIObject_schemaTuples_computed == ASTState.NON_CYCLE || OpenAPIObject_schemaTuples_computed == state().cycle()) {
      return OpenAPIObject_schemaTuples_value;
    }
    if (OpenAPIObject_schemaTuples_visited) {
      throw new RuntimeException("Circular definition of attribute OpenAPIObject.schemaTuples().");
    }
    OpenAPIObject_schemaTuples_visited = true;
    OpenAPIObject_schemaTuples_value = schemaTuples_compute();
    if (state().inCircle()) {
      OpenAPIObject_schemaTuples_computed = state().cycle();
    
    } else {
      OpenAPIObject_schemaTuples_computed = ASTState.NON_CYCLE;
    
    }
    OpenAPIObject_schemaTuples_visited = false;
    return OpenAPIObject_schemaTuples_value;
  }
  /** @apilevel internal */
  private List<SchemaTuple> schemaTuples_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof OpenAPIObject)) {
      node = node.getParent();
    }
    OpenAPIObject root = (OpenAPIObject) node;
    root.survey_OpenAPIObject_schemaTuples();
    List<SchemaTuple> _computedValue = new ArrayList<>();
    if (root.contributorMap_OpenAPIObject_schemaTuples.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_OpenAPIObject_schemaTuples.get(this)) {
        contributor.contributeTo_OpenAPIObject_schemaTuples(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle OpenAPIObject_schemaTuples_computed = null;

  /** @apilevel internal */
  protected List<SchemaTuple> OpenAPIObject_schemaTuples_value;

/** @apilevel internal */
protected boolean OpenAPIObject_responseTuples_visited = false;
  /**
   * @attribute coll
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:12
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Parser", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:12")
  public List<ResponseTuple> responseTuples() {
    ASTState state = state();
    if (OpenAPIObject_responseTuples_computed == ASTState.NON_CYCLE || OpenAPIObject_responseTuples_computed == state().cycle()) {
      return OpenAPIObject_responseTuples_value;
    }
    if (OpenAPIObject_responseTuples_visited) {
      throw new RuntimeException("Circular definition of attribute OpenAPIObject.responseTuples().");
    }
    OpenAPIObject_responseTuples_visited = true;
    OpenAPIObject_responseTuples_value = responseTuples_compute();
    if (state().inCircle()) {
      OpenAPIObject_responseTuples_computed = state().cycle();
    
    } else {
      OpenAPIObject_responseTuples_computed = ASTState.NON_CYCLE;
    
    }
    OpenAPIObject_responseTuples_visited = false;
    return OpenAPIObject_responseTuples_value;
  }
  /** @apilevel internal */
  private List<ResponseTuple> responseTuples_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof OpenAPIObject)) {
      node = node.getParent();
    }
    OpenAPIObject root = (OpenAPIObject) node;
    root.survey_OpenAPIObject_responseTuples();
    List<ResponseTuple> _computedValue = new ArrayList<>();
    if (root.contributorMap_OpenAPIObject_responseTuples.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_OpenAPIObject_responseTuples.get(this)) {
        contributor.contributeTo_OpenAPIObject_responseTuples(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle OpenAPIObject_responseTuples_computed = null;

  /** @apilevel internal */
  protected List<ResponseTuple> OpenAPIObject_responseTuples_value;

/** @apilevel internal */
protected boolean OpenAPIObject_parameterTuples_visited = false;
  /**
   * @attribute coll
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:16
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Parser", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:16")
  public List<ParameterTuple> parameterTuples() {
    ASTState state = state();
    if (OpenAPIObject_parameterTuples_computed == ASTState.NON_CYCLE || OpenAPIObject_parameterTuples_computed == state().cycle()) {
      return OpenAPIObject_parameterTuples_value;
    }
    if (OpenAPIObject_parameterTuples_visited) {
      throw new RuntimeException("Circular definition of attribute OpenAPIObject.parameterTuples().");
    }
    OpenAPIObject_parameterTuples_visited = true;
    OpenAPIObject_parameterTuples_value = parameterTuples_compute();
    if (state().inCircle()) {
      OpenAPIObject_parameterTuples_computed = state().cycle();
    
    } else {
      OpenAPIObject_parameterTuples_computed = ASTState.NON_CYCLE;
    
    }
    OpenAPIObject_parameterTuples_visited = false;
    return OpenAPIObject_parameterTuples_value;
  }
  /** @apilevel internal */
  private List<ParameterTuple> parameterTuples_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof OpenAPIObject)) {
      node = node.getParent();
    }
    OpenAPIObject root = (OpenAPIObject) node;
    root.survey_OpenAPIObject_parameterTuples();
    List<ParameterTuple> _computedValue = new ArrayList<>();
    if (root.contributorMap_OpenAPIObject_parameterTuples.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_OpenAPIObject_parameterTuples.get(this)) {
        contributor.contributeTo_OpenAPIObject_parameterTuples(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle OpenAPIObject_parameterTuples_computed = null;

  /** @apilevel internal */
  protected List<ParameterTuple> OpenAPIObject_parameterTuples_value;

/** @apilevel internal */
protected boolean OpenAPIObject_requestBodyTuples_visited = false;
  /**
   * @attribute coll
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:20
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Parser", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:20")
  public List<RequestBodyTuple> requestBodyTuples() {
    ASTState state = state();
    if (OpenAPIObject_requestBodyTuples_computed == ASTState.NON_CYCLE || OpenAPIObject_requestBodyTuples_computed == state().cycle()) {
      return OpenAPIObject_requestBodyTuples_value;
    }
    if (OpenAPIObject_requestBodyTuples_visited) {
      throw new RuntimeException("Circular definition of attribute OpenAPIObject.requestBodyTuples().");
    }
    OpenAPIObject_requestBodyTuples_visited = true;
    OpenAPIObject_requestBodyTuples_value = requestBodyTuples_compute();
    if (state().inCircle()) {
      OpenAPIObject_requestBodyTuples_computed = state().cycle();
    
    } else {
      OpenAPIObject_requestBodyTuples_computed = ASTState.NON_CYCLE;
    
    }
    OpenAPIObject_requestBodyTuples_visited = false;
    return OpenAPIObject_requestBodyTuples_value;
  }
  /** @apilevel internal */
  private List<RequestBodyTuple> requestBodyTuples_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof OpenAPIObject)) {
      node = node.getParent();
    }
    OpenAPIObject root = (OpenAPIObject) node;
    root.survey_OpenAPIObject_requestBodyTuples();
    List<RequestBodyTuple> _computedValue = new ArrayList<>();
    if (root.contributorMap_OpenAPIObject_requestBodyTuples.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_OpenAPIObject_requestBodyTuples.get(this)) {
        contributor.contributeTo_OpenAPIObject_requestBodyTuples(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle OpenAPIObject_requestBodyTuples_computed = null;

  /** @apilevel internal */
  protected List<RequestBodyTuple> OpenAPIObject_requestBodyTuples_value;

/** @apilevel internal */
protected boolean OpenAPIObject_headerTuples_visited = false;
  /**
   * @attribute coll
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:24
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Parser", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:24")
  public List<HeaderTuple> headerTuples() {
    ASTState state = state();
    if (OpenAPIObject_headerTuples_computed == ASTState.NON_CYCLE || OpenAPIObject_headerTuples_computed == state().cycle()) {
      return OpenAPIObject_headerTuples_value;
    }
    if (OpenAPIObject_headerTuples_visited) {
      throw new RuntimeException("Circular definition of attribute OpenAPIObject.headerTuples().");
    }
    OpenAPIObject_headerTuples_visited = true;
    OpenAPIObject_headerTuples_value = headerTuples_compute();
    if (state().inCircle()) {
      OpenAPIObject_headerTuples_computed = state().cycle();
    
    } else {
      OpenAPIObject_headerTuples_computed = ASTState.NON_CYCLE;
    
    }
    OpenAPIObject_headerTuples_visited = false;
    return OpenAPIObject_headerTuples_value;
  }
  /** @apilevel internal */
  private List<HeaderTuple> headerTuples_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof OpenAPIObject)) {
      node = node.getParent();
    }
    OpenAPIObject root = (OpenAPIObject) node;
    root.survey_OpenAPIObject_headerTuples();
    List<HeaderTuple> _computedValue = new ArrayList<>();
    if (root.contributorMap_OpenAPIObject_headerTuples.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_OpenAPIObject_headerTuples.get(this)) {
        contributor.contributeTo_OpenAPIObject_headerTuples(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle OpenAPIObject_headerTuples_computed = null;

  /** @apilevel internal */
  protected List<HeaderTuple> OpenAPIObject_headerTuples_value;

/** @apilevel internal */
protected boolean OpenAPIObject_securitySchemeTuples_visited = false;
  /**
   * @attribute coll
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:28
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Parser", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:28")
  public List<SecuritySchemeTuple> securitySchemeTuples() {
    ASTState state = state();
    if (OpenAPIObject_securitySchemeTuples_computed == ASTState.NON_CYCLE || OpenAPIObject_securitySchemeTuples_computed == state().cycle()) {
      return OpenAPIObject_securitySchemeTuples_value;
    }
    if (OpenAPIObject_securitySchemeTuples_visited) {
      throw new RuntimeException("Circular definition of attribute OpenAPIObject.securitySchemeTuples().");
    }
    OpenAPIObject_securitySchemeTuples_visited = true;
    OpenAPIObject_securitySchemeTuples_value = securitySchemeTuples_compute();
    if (state().inCircle()) {
      OpenAPIObject_securitySchemeTuples_computed = state().cycle();
    
    } else {
      OpenAPIObject_securitySchemeTuples_computed = ASTState.NON_CYCLE;
    
    }
    OpenAPIObject_securitySchemeTuples_visited = false;
    return OpenAPIObject_securitySchemeTuples_value;
  }
  /** @apilevel internal */
  private List<SecuritySchemeTuple> securitySchemeTuples_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof OpenAPIObject)) {
      node = node.getParent();
    }
    OpenAPIObject root = (OpenAPIObject) node;
    root.survey_OpenAPIObject_securitySchemeTuples();
    List<SecuritySchemeTuple> _computedValue = new ArrayList<>();
    if (root.contributorMap_OpenAPIObject_securitySchemeTuples.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_OpenAPIObject_securitySchemeTuples.get(this)) {
        contributor.contributeTo_OpenAPIObject_securitySchemeTuples(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle OpenAPIObject_securitySchemeTuples_computed = null;

  /** @apilevel internal */
  protected List<SecuritySchemeTuple> OpenAPIObject_securitySchemeTuples_value;

/** @apilevel internal */
protected boolean OpenAPIObject_linkTuples_visited = false;
  /**
   * @attribute coll
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:32
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Parser", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:32")
  public List<LinkTuple> linkTuples() {
    ASTState state = state();
    if (OpenAPIObject_linkTuples_computed == ASTState.NON_CYCLE || OpenAPIObject_linkTuples_computed == state().cycle()) {
      return OpenAPIObject_linkTuples_value;
    }
    if (OpenAPIObject_linkTuples_visited) {
      throw new RuntimeException("Circular definition of attribute OpenAPIObject.linkTuples().");
    }
    OpenAPIObject_linkTuples_visited = true;
    OpenAPIObject_linkTuples_value = linkTuples_compute();
    if (state().inCircle()) {
      OpenAPIObject_linkTuples_computed = state().cycle();
    
    } else {
      OpenAPIObject_linkTuples_computed = ASTState.NON_CYCLE;
    
    }
    OpenAPIObject_linkTuples_visited = false;
    return OpenAPIObject_linkTuples_value;
  }
  /** @apilevel internal */
  private List<LinkTuple> linkTuples_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof OpenAPIObject)) {
      node = node.getParent();
    }
    OpenAPIObject root = (OpenAPIObject) node;
    root.survey_OpenAPIObject_linkTuples();
    List<LinkTuple> _computedValue = new ArrayList<>();
    if (root.contributorMap_OpenAPIObject_linkTuples.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_OpenAPIObject_linkTuples.get(this)) {
        contributor.contributeTo_OpenAPIObject_linkTuples(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle OpenAPIObject_linkTuples_computed = null;

  /** @apilevel internal */
  protected List<LinkTuple> OpenAPIObject_linkTuples_value;

/** @apilevel internal */
protected boolean OpenAPIObject_callbackTuples_visited = false;
  /**
   * @attribute coll
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:36
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="Parser", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:36")
  public List<CallbackTuple> callbackTuples() {
    ASTState state = state();
    if (OpenAPIObject_callbackTuples_computed == ASTState.NON_CYCLE || OpenAPIObject_callbackTuples_computed == state().cycle()) {
      return OpenAPIObject_callbackTuples_value;
    }
    if (OpenAPIObject_callbackTuples_visited) {
      throw new RuntimeException("Circular definition of attribute OpenAPIObject.callbackTuples().");
    }
    OpenAPIObject_callbackTuples_visited = true;
    OpenAPIObject_callbackTuples_value = callbackTuples_compute();
    if (state().inCircle()) {
      OpenAPIObject_callbackTuples_computed = state().cycle();
    
    } else {
      OpenAPIObject_callbackTuples_computed = ASTState.NON_CYCLE;
    
    }
    OpenAPIObject_callbackTuples_visited = false;
    return OpenAPIObject_callbackTuples_value;
  }
  /** @apilevel internal */
  private List<CallbackTuple> callbackTuples_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof OpenAPIObject)) {
      node = node.getParent();
    }
    OpenAPIObject root = (OpenAPIObject) node;
    root.survey_OpenAPIObject_callbackTuples();
    List<CallbackTuple> _computedValue = new ArrayList<>();
    if (root.contributorMap_OpenAPIObject_callbackTuples.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_OpenAPIObject_callbackTuples.get(this)) {
        contributor.contributeTo_OpenAPIObject_callbackTuples(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected ASTState.Cycle OpenAPIObject_callbackTuples_computed = null;

  /** @apilevel internal */
  protected List<CallbackTuple> OpenAPIObject_callbackTuples_value;

}
