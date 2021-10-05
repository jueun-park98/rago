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
 * @astdecl OpenAPIObject : ASTNode ::= <OpenAPI:String> [InfoObject] ServerObject* PathsObject* [ComponentsObject] SecurityRequirementObject* TagObject* [ExternalDocObject] <Context:OAIContext> Extension*;
 * @production OpenAPIObject : {@link ASTNode} ::= <span class="component">&lt;OpenAPI:String&gt;</span> <span class="component">[{@link InfoObject}]</span> <span class="component">{@link ServerObject}*</span> <span class="component">{@link PathsObject}*</span> <span class="component">[{@link ComponentsObject}]</span> <span class="component">{@link SecurityRequirementObject}*</span> <span class="component">{@link TagObject}*</span> <span class="component">[{@link ExternalDocObject}]</span> <span class="component">&lt;Context:OAIContext&gt;</span> <span class="component">{@link Extension}*</span>;

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
        paths.put( p.getRef(), p.getPathItemOb().composePath(p.getPathItemOb(), map) );
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
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:5
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
        openapi.addPathsObject(new PathsObject( key, PathItemOb.parsePath(api.getPath(key), api.getContext(), map)));
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
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:20
   */
  public String generateRequests() throws Exception {
        Set<String> urls = new HashSet<>();

        for( PathsObject p : this.getPathsObjects() )
        p.generateUrl(urls);

        for( String path : urls ){
        if( path.endsWith("GET") ){
        System.out.println(this.getServerObject(0).getUrl() + path.substring(0, path.length()-3));

        /* */
        URL url = new URL(this.getServerObject(0).getUrl() + path.substring(0, path.length()-3));
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET"); // HTTP GET
        con.setDoOutput(true); // GET

        int responseCode = con.getResponseCode();
        System.out.println("HTTP status code (GET) : " + responseCode);
        if( responseCode < 300 ){
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
        }
        in.close();

        System.out.println("HTTP body : " + response.toString());
        }/* */
        } else if( path.endsWith("POST") ) {
        System.out.println(this.getServerObject(0).getUrl() + path.substring(0, path.length()-4));

        /* */
        URL url = new URL(this.getServerObject(0).getUrl() + path.substring(0, path.length()-4));
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("POST"); // HTTP POST
        con.setDoOutput(true); // POST

        int responseCode = con.getResponseCode();
        System.out.println("HTTP status code (POST) : " + responseCode);

        if( responseCode < 300 ){
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
        }
        in.close();


        System.out.println("HTTP body : " + response.toString());
        }/* */
        }

        }

        return "";
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
    children = new ASTNode[8];
    setChild(new Opt(), 0);
    setChild(new JastAddList(), 1);
    setChild(new JastAddList(), 2);
    setChild(new Opt(), 3);
    setChild(new JastAddList(), 4);
    setChild(new JastAddList(), 5);
    setChild(new Opt(), 6);
    setChild(new JastAddList(), 7);
  }
  /**
   * @declaredat ASTNode:21
   */
  @ASTNodeAnnotation.Constructor(
    name = {"OpenAPI", "InfoObject", "ServerObject", "PathsObject", "ComponentsObject", "SecurityRequirementObject", "TagObject", "ExternalDocObject", "Context", "Extension"},
    type = {"String", "Opt<InfoObject>", "JastAddList<ServerObject>", "JastAddList<PathsObject>", "Opt<ComponentsObject>", "JastAddList<SecurityRequirementObject>", "JastAddList<TagObject>", "Opt<ExternalDocObject>", "OAIContext", "JastAddList<Extension>"},
    kind = {"Token", "Opt", "List", "List", "Opt", "List", "List", "Opt", "Token", "List"}
  )
  public OpenAPIObject(String p0, Opt<InfoObject> p1, JastAddList<ServerObject> p2, JastAddList<PathsObject> p3, Opt<ComponentsObject> p4, JastAddList<SecurityRequirementObject> p5, JastAddList<TagObject> p6, Opt<ExternalDocObject> p7, OAIContext p8, JastAddList<Extension> p9) {
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
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:39
   */
  protected int numChildren() {
    return 8;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:49
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:57
   */
  public OpenAPIObject clone() throws CloneNotSupportedException {
    OpenAPIObject node = (OpenAPIObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:62
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
   * @declaredat ASTNode:81
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
   * @declaredat ASTNode:91
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
   * @declaredat ASTNode:111
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
   * @declaredat ASTNode:125
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
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:84
   * @apilevel internal
   */
  public Set<String> Define_generateUrl(ASTNode _callerNode, ASTNode _childNode, Set<String> urls) {
    if (_callerNode == getPathsObjectListNoTransform()) {
      // @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:85
      int i = _callerNode.getIndexOfChild(_childNode);
      {
              PathItemObject p = ((PathsObject) _childNode).getPathItemOb().pathItemObject();
              if( p.hasGet() )
              urls.add(p.getGet().generateRandomUrl(((PathsObject) _childNode).getRef(), p.getGet().getOperationObject()));
              else if( p.hasPost() )
              urls.add(p.getPost().generateRandomUrl(((PathsObject) _childNode).getRef(), p.getPost().getOperationObject()));
      
              return urls;
              }
    }
    else {
      return getParent().Define_generateUrl(this, _callerNode, urls);
    }
  }
  /**
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:84
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute generateUrl
   */
  protected boolean canDefine_generateUrl(ASTNode _callerNode, ASTNode _childNode, Set<String> urls) {
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
}
