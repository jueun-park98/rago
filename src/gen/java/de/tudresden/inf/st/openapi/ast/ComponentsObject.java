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
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:22
 * @astdecl ComponentsObject : ASTNode ::= SchemaTuple* ResponseTuple* ParameterTuple* ExampleTuple* RequestBodyTuple* HeaderTuple* SecuritySchemeTuple* LinkTuple* CallbackTuple* Extension*;
 * @production ComponentsObject : {@link ASTNode} ::= <span class="component">{@link SchemaTuple}*</span> <span class="component">{@link ResponseTuple}*</span> <span class="component">{@link ParameterTuple}*</span> <span class="component">{@link ExampleTuple}*</span> <span class="component">{@link RequestBodyTuple}*</span> <span class="component">{@link HeaderTuple}*</span> <span class="component">{@link SecuritySchemeTuple}*</span> <span class="component">{@link LinkTuple}*</span> <span class="component">{@link CallbackTuple}*</span> <span class="component">{@link Extension}*</span>;

 */
public class ComponentsObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:149
   */
  public static Components composeComponents (ComponentsObject componentsObject){
        Components components = new Components();

        if( componentsObject.getNumSchemaTuple() != 0 ){
        Map<String, org.openapi4j.parser.model.v3.Schema> schemaMap = new HashMap<>();
        for( SchemaTuple t : componentsObject.getSchemaTuples() ){
        if(!t.getSchemaObject().getRef().isEmpty()){
        org.openapi4j.parser.model.v3.Schema schema=new org.openapi4j.parser.model.v3.Schema();
        schema.setRef(t.getSchemaObject().getRef());
        schemaMap.put(t.getKey(),schema);
        }
        else
        schemaMap.put(t.getKey(),SchemaObject.composeSchema(t.getSchemaObject()));
        }
        components.setSchemas(schemaMap);
        }
        if( componentsObject.getNumResponseTuple() != 0 ){
        Map<String, Response> responseMap = new HashMap<>();
        for( ResponseTuple t : componentsObject.getResponseTuples() ){
        if( !t.getResponseObject().getRef().isEmpty() ){
        Response response = new Response();
        response.setRef(t.getResponseObject().getRef());
        responseMap.put(t.getKey(), response);
        }
        else
        responseMap.put(t.getKey(), ResponseObject.composeResponse(t.getResponseObject()));
        }
        components.setResponses(responseMap);
        }
        if( componentsObject.getNumParameterTuple() != 0 ){
        Map<String, Parameter> parameterMap = new HashMap<>();
        for( ParameterTuple t : componentsObject.getParameterTuples() ){
        if( !t.getParameterObject().getRef().isEmpty() ){
        Parameter parameter = new Parameter();
        parameter.setRef(t.getParameterObject().getRef());
        parameterMap.put(t.getKey(), parameter);
        }
        else
        parameterMap.put(t.getKey(), ParameterObject.composeParameter(t.getParameterObject()));
        }
        components.setParameters(parameterMap);
        }
        if( componentsObject.getNumExampleTuple() != 0 ){
        Map<String, Example> exampleMap = new HashMap<>();
        for( ExampleTuple t : componentsObject.getExampleTuples() )
        exampleMap.put(t.getKey(), ExampleObject.composeExample(t.getExampleObject()));
        components.setExamples(exampleMap);
        }
        if( componentsObject.getNumRequestBodyTuple() != 0 ){
        Map<String, RequestBody> requestBodyMap = new HashMap<>();
        for( RequestBodyTuple t : componentsObject.getRequestBodyTuples() ){
        if( !t.getRequestBodyObject().getRef().isEmpty() ){
        RequestBody requestBody = new RequestBody();
        requestBody.setRef(t.getRequestBodyObject().getRef());
        requestBodyMap.put(t.getKey(), requestBody);
        }
        else
        requestBodyMap.put(t.getKey(), RequestBodyObject.composeRequestBody(t.getRequestBodyObject()));
        }
        components.setRequestBodies(requestBodyMap);
        }
        if( componentsObject.getNumHeaderTuple() != 0 ){
        Map<String, Header> headerMap = new HashMap<>();
        for( HeaderTuple t : componentsObject.getHeaderTuples() ){
        if( !t.getHeaderObject().getRef().isEmpty() ){
        Header header = new Header();
        header.setRef(t.getHeaderObject().getRef());
        headerMap.put(t.getKey(), header);
        }
        else
        headerMap.put(t.getKey(), HeaderObject.composeHeader(t.getHeaderObject()));
        }
        components.setHeaders(headerMap);
        }
        if( componentsObject.getNumSecuritySchemeTuple() != 0 ){
        Map<String, SecurityScheme> securitySchemeMap = new HashMap<>();
        for( SecuritySchemeTuple t : componentsObject.getSecuritySchemeTuples() ){
        if( !t.getSecuritySchemeObject().getRef().isEmpty() ){
        SecurityScheme securityScheme = new SecurityScheme();
        securityScheme.setRef(t.getSecuritySchemeObject().getRef());
        securitySchemeMap.put(t.getKey(), securityScheme);
        }
        else
        securitySchemeMap.put(t.getKey(), SecuritySchemeObject.composeSecurityScheme(t.getSecuritySchemeObject()));
        }
        components.setSecuritySchemes(securitySchemeMap);
        }
        if( componentsObject.getNumLinkTuple() != 0 ){
        Map<String, Link> linkMap = new HashMap<>();
        for( LinkTuple t : componentsObject.getLinkTuples() ){
        if( !t.getLinkObject().getRef().isEmpty() ){
        Link link = new Link();
        link.setRef(t.getLinkObject().getRef());
        linkMap.put(t.getKey(), link);
        }
        else
        linkMap.put(t.getKey(), LinkObject.composeLink(t.getLinkObject()));
        }
        components.setLinks(linkMap);
        }
        if( componentsObject.getNumCallbackTuple() != 0 ){
        Map<String, Callback> callbackMap = new HashMap<>();
        for( CallbackTuple t : componentsObject.getCallbackTuples() ){
        if( !t.getCallbackObject().getRef().isEmpty() ){
        Callback callback = new Callback();
        callback.setRef(t.getCallbackObject().getRef());
        callbackMap.put(t.getKey(), callback);
        }
        else
        callbackMap.put(t.getKey(), CallbackObject.composeCallback(t.getCallbackObject()));
        }
        components.setCallbacks(callbackMap);
        }
        if( componentsObject.getNumExtension() != 0 ){
        Map<String, Object> extensions = new HashMap<>();
        for( Extension e : componentsObject.getExtensions() )
        extensions.put(e.getKey(), e.getValue());
        components.setExtensions(extensions);
        }

        return components;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:121
   */
  public static ComponentsObject parseComponents(Components components){
        ComponentsObject componentsObject = new ComponentsObject();

        if( components.getSchemas() != null ){
        for( String key : components.getSchemas().keySet() ){
        SchemaTuple schemaTuple = new SchemaTuple();
        if( components.getSchema(key).isRef() ){
        SchemaObject schemaObject = new SchemaObject();
        schemaObject.setRef(components.getSchema(key).getRef());
        schemaTuple.setKey(key);
        schemaTuple.setSchemaObject(schemaObject);
        componentsObject.addSchemaTuple(schemaTuple);
        }
        else{
        schemaTuple.setKey(key);
        schemaTuple.setSchemaObject(SchemaObject.parseSchema(components.getSchema(key)));
        componentsObject.addSchemaTuple(schemaTuple);
        }
        }
        }
        if( components.getResponses() != null ){
        for( String key : components.getResponses().keySet() ){
        ResponseTuple responseTuple = new ResponseTuple();
        if( components.getResponse(key).isRef() ){
        ResponseObject responseObject = new ResponseObject();
        responseObject.setRef(components.getResponse(key).getRef());
        responseTuple.setKey(key);
        responseTuple.setResponseObject(responseObject);
        componentsObject.addResponseTuple(responseTuple);
        }
        else{
        responseTuple.setKey(key);
        responseTuple.setResponseObject(ResponseObject.parseResponse(components.getResponse(key)));
        componentsObject.addResponseTuple(responseTuple);
        }
        }
        }
        if( components.getParameters() != null ){
        for( String key : components.getParameters().keySet() ){
        ParameterTuple parameterTuple = new ParameterTuple();
        if( components.getParameter(key).isRef() ){
        ParameterObject parameterObject = new ParameterObject();
        parameterObject.setRef(components.getParameter(key).getRef());
        parameterTuple.setKey(key);
        parameterTuple.setParameterObject(parameterObject);
        componentsObject.addParameterTuple(parameterTuple);
        }
        else{
        parameterTuple.setKey(key);
        parameterTuple.setParameterObject(ParameterObject.parseParameter(components.getParameter(key)));
        componentsObject.addParameterTuple(parameterTuple);
        }
        }
        }
        if( components.getExamples() != null ){
        for( String key : components.getExamples().keySet() ){
        ExampleTuple exampleTuple = new ExampleTuple();
        ExampleObject exampleObject = new ExampleObject();
        exampleTuple.setKey(key);
        exampleTuple.setExampleObject(ExampleObject.parseExample(components.getExample(key)));
        componentsObject.addExampleTuple(exampleTuple);
        }
        }
        if( components.getRequestBodies() != null ){
        for( String key : components.getRequestBodies().keySet() ){
        RequestBodyTuple requestBodyTuple = new RequestBodyTuple();
        if( components.getRequestBody(key).isRef() ){
        RequestBodyObject requestBodyObject = new RequestBodyObject();
        requestBodyObject.setRef(components.getRequestBody(key).getRef());
        requestBodyTuple.setKey(key);
        requestBodyTuple.setRequestBodyObject(requestBodyObject);
        componentsObject.addRequestBodyTuple(requestBodyTuple);
        }
        else{
        requestBodyTuple.setKey(key);
        requestBodyTuple.setRequestBodyObject(RequestBodyObject.parseRequestBody(components.getRequestBody(key)));
        componentsObject.addRequestBodyTuple(requestBodyTuple);
        }
        }
        }
        if( components.getHeaders() != null ){
        for( String key : components.getHeaders().keySet() ){
        HeaderTuple headerTuple = new HeaderTuple();
        if( components.getHeader(key).isRef() ){
        HeaderObject headerObject = new HeaderObject();
        headerObject.setRef(components.getHeader(key).getRef());
        headerTuple.setKey(key);
        headerTuple.setHeaderObject(headerObject);
        componentsObject.addHeaderTuple(headerTuple);
        }
        else{
        headerTuple.setKey(key);
        headerTuple.setHeaderObject(HeaderObject.parseHeader(components.getHeader(key)));
        componentsObject.addHeaderTuple(headerTuple);
        }
        }
        }
        if( components.getSecuritySchemes() != null ){
        for( String key : components.getSecuritySchemes().keySet() ){
        SecuritySchemeTuple securitySchemeTuple = new SecuritySchemeTuple();
        if( components.getSecurityScheme(key).isRef() ){
        SecuritySchemeObject securitySchemeObject = new SecuritySchemeObject();
        securitySchemeObject.setRef(components.getSecurityScheme(key).getRef());
        securitySchemeTuple.setKey(key);
        securitySchemeTuple.setSecuritySchemeObject(securitySchemeObject);
        componentsObject.addSecuritySchemeTuple(securitySchemeTuple);
        }
        else{
        securitySchemeTuple.setKey(key);
        securitySchemeTuple.setSecuritySchemeObject(SecuritySchemeObject.parseSecurityScheme(components.getSecurityScheme(key)));
        componentsObject.addSecuritySchemeTuple(securitySchemeTuple);
        }
        }
        }
        if( components.getLinks() != null ){
        for( String key : components.getLinks().keySet() ){
        LinkTuple linkTuple = new LinkTuple();
        if( components.getLink(key).isRef() ){
        LinkObject linkObject = new LinkObject();
        linkObject.setRef(components.getLink(key).getRef());
        linkTuple.setKey(key);
        linkTuple.setLinkObject(linkObject);
        componentsObject.addLinkTuple(linkTuple);
        }
        else{
        linkTuple.setKey(key);
        linkTuple.setLinkObject(LinkObject.parseLink(components.getLink(key)));
        componentsObject.addLinkTuple(linkTuple);
        }
        }
        }
        if( components.getCallbacks() != null ){
        for( String key : components.getCallbacks().keySet() ){
        CallbackTuple callbackTuple = new CallbackTuple();
        if( components.getCallback(key).isRef() ){
        CallbackObject callbackObject = new CallbackObject();
        callbackObject.setRef(components.getCallback(key).getRef());
        callbackTuple.setKey(key);
        callbackTuple.setCallbackObject(callbackObject);
        componentsObject.addCallbackTuple(callbackTuple);
        }
        else{
        callbackTuple.setKey(key);
        callbackTuple.setCallbackObject(CallbackObject.parseCallback(components.getCallback(key)));
        componentsObject.addCallbackTuple(callbackTuple);
        }
        }
        }
        if( components.getExtensions() != null ){
        for( String key : components.getExtensions().keySet() )
        componentsObject.addExtension(new Extension(key, components.getExtensions().get(key)));
        }

        return componentsObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public ComponentsObject() {
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
    children = new ASTNode[10];
    setChild(new JastAddList(), 0);
    setChild(new JastAddList(), 1);
    setChild(new JastAddList(), 2);
    setChild(new JastAddList(), 3);
    setChild(new JastAddList(), 4);
    setChild(new JastAddList(), 5);
    setChild(new JastAddList(), 6);
    setChild(new JastAddList(), 7);
    setChild(new JastAddList(), 8);
    setChild(new JastAddList(), 9);
  }
  /**
   * @declaredat ASTNode:23
   */
  @ASTNodeAnnotation.Constructor(
    name = {"SchemaTuple", "ResponseTuple", "ParameterTuple", "ExampleTuple", "RequestBodyTuple", "HeaderTuple", "SecuritySchemeTuple", "LinkTuple", "CallbackTuple", "Extension"},
    type = {"JastAddList<SchemaTuple>", "JastAddList<ResponseTuple>", "JastAddList<ParameterTuple>", "JastAddList<ExampleTuple>", "JastAddList<RequestBodyTuple>", "JastAddList<HeaderTuple>", "JastAddList<SecuritySchemeTuple>", "JastAddList<LinkTuple>", "JastAddList<CallbackTuple>", "JastAddList<Extension>"},
    kind = {"List", "List", "List", "List", "List", "List", "List", "List", "List", "List"}
  )
  public ComponentsObject(JastAddList<SchemaTuple> p0, JastAddList<ResponseTuple> p1, JastAddList<ParameterTuple> p2, JastAddList<ExampleTuple> p3, JastAddList<RequestBodyTuple> p4, JastAddList<HeaderTuple> p5, JastAddList<SecuritySchemeTuple> p6, JastAddList<LinkTuple> p7, JastAddList<CallbackTuple> p8, JastAddList<Extension> p9) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
    setChild(p4, 4);
    setChild(p5, 5);
    setChild(p6, 6);
    setChild(p7, 7);
    setChild(p8, 8);
    setChild(p9, 9);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:41
   */
  protected int numChildren() {
    return 10;
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
  }
  /** @apilevel internal 
   * @declaredat ASTNode:59
   */
  public ComponentsObject clone() throws CloneNotSupportedException {
    ComponentsObject node = (ComponentsObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:64
   */
  public ComponentsObject copy() {
    try {
      ComponentsObject node = (ComponentsObject) clone();
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
   * @declaredat ASTNode:83
   */
  @Deprecated
  public ComponentsObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:93
   */
  public ComponentsObject treeCopyNoTransform() {
    ComponentsObject tree = (ComponentsObject) copy();
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
   * @declaredat ASTNode:113
   */
  public ComponentsObject treeCopy() {
    ComponentsObject tree = (ComponentsObject) copy();
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
   * @declaredat ASTNode:127
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the SchemaTuple list.
   * @param list The new list node to be used as the SchemaTuple list.
   * @apilevel high-level
   */
  public void setSchemaTupleList(JastAddList<SchemaTuple> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the SchemaTuple list.
   * @return Number of children in the SchemaTuple list.
   * @apilevel high-level
   */
  public int getNumSchemaTuple() {
    return getSchemaTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SchemaTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SchemaTuple list.
   * @apilevel low-level
   */
  public int getNumSchemaTupleNoTransform() {
    return getSchemaTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SchemaTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SchemaTuple list.
   * @apilevel high-level
   */
  public SchemaTuple getSchemaTuple(int i) {
    return (SchemaTuple) getSchemaTupleList().getChild(i);
  }
  /**
   * Check whether the SchemaTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSchemaTuple() {
    return getSchemaTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the SchemaTuple list.
   * @param node The element to append to the SchemaTuple list.
   * @apilevel high-level
   */
  public void addSchemaTuple(SchemaTuple node) {
    JastAddList<SchemaTuple> list = (parent == null) ? getSchemaTupleListNoTransform() : getSchemaTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSchemaTupleNoTransform(SchemaTuple node) {
    JastAddList<SchemaTuple> list = getSchemaTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SchemaTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSchemaTuple(SchemaTuple node, int i) {
    JastAddList<SchemaTuple> list = getSchemaTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SchemaTuple list.
   * @return The node representing the SchemaTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SchemaTuple")
  public JastAddList<SchemaTuple> getSchemaTupleList() {
    JastAddList<SchemaTuple> list = (JastAddList<SchemaTuple>) getChild(0);
    return list;
  }
  /**
   * Retrieves the SchemaTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SchemaTuple list.
   * @apilevel low-level
   */
  public JastAddList<SchemaTuple> getSchemaTupleListNoTransform() {
    return (JastAddList<SchemaTuple>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the SchemaTuple list without
   * triggering rewrites.
   */
  public SchemaTuple getSchemaTupleNoTransform(int i) {
    return (SchemaTuple) getSchemaTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the SchemaTuple list.
   * @return The node representing the SchemaTuple list.
   * @apilevel high-level
   */
  public JastAddList<SchemaTuple> getSchemaTuples() {
    return getSchemaTupleList();
  }
  /**
   * Retrieves the SchemaTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SchemaTuple list.
   * @apilevel low-level
   */
  public JastAddList<SchemaTuple> getSchemaTuplesNoTransform() {
    return getSchemaTupleListNoTransform();
  }
  /**
   * Replaces the ResponseTuple list.
   * @param list The new list node to be used as the ResponseTuple list.
   * @apilevel high-level
   */
  public void setResponseTupleList(JastAddList<ResponseTuple> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the ResponseTuple list.
   * @return Number of children in the ResponseTuple list.
   * @apilevel high-level
   */
  public int getNumResponseTuple() {
    return getResponseTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ResponseTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ResponseTuple list.
   * @apilevel low-level
   */
  public int getNumResponseTupleNoTransform() {
    return getResponseTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ResponseTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ResponseTuple list.
   * @apilevel high-level
   */
  public ResponseTuple getResponseTuple(int i) {
    return (ResponseTuple) getResponseTupleList().getChild(i);
  }
  /**
   * Check whether the ResponseTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasResponseTuple() {
    return getResponseTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ResponseTuple list.
   * @param node The element to append to the ResponseTuple list.
   * @apilevel high-level
   */
  public void addResponseTuple(ResponseTuple node) {
    JastAddList<ResponseTuple> list = (parent == null) ? getResponseTupleListNoTransform() : getResponseTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addResponseTupleNoTransform(ResponseTuple node) {
    JastAddList<ResponseTuple> list = getResponseTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ResponseTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setResponseTuple(ResponseTuple node, int i) {
    JastAddList<ResponseTuple> list = getResponseTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ResponseTuple list.
   * @return The node representing the ResponseTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ResponseTuple")
  public JastAddList<ResponseTuple> getResponseTupleList() {
    JastAddList<ResponseTuple> list = (JastAddList<ResponseTuple>) getChild(1);
    return list;
  }
  /**
   * Retrieves the ResponseTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResponseTuple list.
   * @apilevel low-level
   */
  public JastAddList<ResponseTuple> getResponseTupleListNoTransform() {
    return (JastAddList<ResponseTuple>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the ResponseTuple list without
   * triggering rewrites.
   */
  public ResponseTuple getResponseTupleNoTransform(int i) {
    return (ResponseTuple) getResponseTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ResponseTuple list.
   * @return The node representing the ResponseTuple list.
   * @apilevel high-level
   */
  public JastAddList<ResponseTuple> getResponseTuples() {
    return getResponseTupleList();
  }
  /**
   * Retrieves the ResponseTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResponseTuple list.
   * @apilevel low-level
   */
  public JastAddList<ResponseTuple> getResponseTuplesNoTransform() {
    return getResponseTupleListNoTransform();
  }
  /**
   * Replaces the ParameterTuple list.
   * @param list The new list node to be used as the ParameterTuple list.
   * @apilevel high-level
   */
  public void setParameterTupleList(JastAddList<ParameterTuple> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the ParameterTuple list.
   * @return Number of children in the ParameterTuple list.
   * @apilevel high-level
   */
  public int getNumParameterTuple() {
    return getParameterTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ParameterTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ParameterTuple list.
   * @apilevel low-level
   */
  public int getNumParameterTupleNoTransform() {
    return getParameterTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ParameterTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ParameterTuple list.
   * @apilevel high-level
   */
  public ParameterTuple getParameterTuple(int i) {
    return (ParameterTuple) getParameterTupleList().getChild(i);
  }
  /**
   * Check whether the ParameterTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParameterTuple() {
    return getParameterTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ParameterTuple list.
   * @param node The element to append to the ParameterTuple list.
   * @apilevel high-level
   */
  public void addParameterTuple(ParameterTuple node) {
    JastAddList<ParameterTuple> list = (parent == null) ? getParameterTupleListNoTransform() : getParameterTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addParameterTupleNoTransform(ParameterTuple node) {
    JastAddList<ParameterTuple> list = getParameterTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ParameterTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParameterTuple(ParameterTuple node, int i) {
    JastAddList<ParameterTuple> list = getParameterTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ParameterTuple list.
   * @return The node representing the ParameterTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ParameterTuple")
  public JastAddList<ParameterTuple> getParameterTupleList() {
    JastAddList<ParameterTuple> list = (JastAddList<ParameterTuple>) getChild(2);
    return list;
  }
  /**
   * Retrieves the ParameterTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParameterTuple list.
   * @apilevel low-level
   */
  public JastAddList<ParameterTuple> getParameterTupleListNoTransform() {
    return (JastAddList<ParameterTuple>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the ParameterTuple list without
   * triggering rewrites.
   */
  public ParameterTuple getParameterTupleNoTransform(int i) {
    return (ParameterTuple) getParameterTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ParameterTuple list.
   * @return The node representing the ParameterTuple list.
   * @apilevel high-level
   */
  public JastAddList<ParameterTuple> getParameterTuples() {
    return getParameterTupleList();
  }
  /**
   * Retrieves the ParameterTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParameterTuple list.
   * @apilevel low-level
   */
  public JastAddList<ParameterTuple> getParameterTuplesNoTransform() {
    return getParameterTupleListNoTransform();
  }
  /**
   * Replaces the ExampleTuple list.
   * @param list The new list node to be used as the ExampleTuple list.
   * @apilevel high-level
   */
  public void setExampleTupleList(JastAddList<ExampleTuple> list) {
    setChild(list, 3);
  }
  /**
   * Retrieves the number of children in the ExampleTuple list.
   * @return Number of children in the ExampleTuple list.
   * @apilevel high-level
   */
  public int getNumExampleTuple() {
    return getExampleTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ExampleTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ExampleTuple list.
   * @apilevel low-level
   */
  public int getNumExampleTupleNoTransform() {
    return getExampleTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ExampleTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ExampleTuple list.
   * @apilevel high-level
   */
  public ExampleTuple getExampleTuple(int i) {
    return (ExampleTuple) getExampleTupleList().getChild(i);
  }
  /**
   * Check whether the ExampleTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExampleTuple() {
    return getExampleTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ExampleTuple list.
   * @param node The element to append to the ExampleTuple list.
   * @apilevel high-level
   */
  public void addExampleTuple(ExampleTuple node) {
    JastAddList<ExampleTuple> list = (parent == null) ? getExampleTupleListNoTransform() : getExampleTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addExampleTupleNoTransform(ExampleTuple node) {
    JastAddList<ExampleTuple> list = getExampleTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ExampleTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExampleTuple(ExampleTuple node, int i) {
    JastAddList<ExampleTuple> list = getExampleTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ExampleTuple list.
   * @return The node representing the ExampleTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ExampleTuple")
  public JastAddList<ExampleTuple> getExampleTupleList() {
    JastAddList<ExampleTuple> list = (JastAddList<ExampleTuple>) getChild(3);
    return list;
  }
  /**
   * Retrieves the ExampleTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ExampleTuple list.
   * @apilevel low-level
   */
  public JastAddList<ExampleTuple> getExampleTupleListNoTransform() {
    return (JastAddList<ExampleTuple>) getChildNoTransform(3);
  }
  /**
   * @return the element at index {@code i} in the ExampleTuple list without
   * triggering rewrites.
   */
  public ExampleTuple getExampleTupleNoTransform(int i) {
    return (ExampleTuple) getExampleTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ExampleTuple list.
   * @return The node representing the ExampleTuple list.
   * @apilevel high-level
   */
  public JastAddList<ExampleTuple> getExampleTuples() {
    return getExampleTupleList();
  }
  /**
   * Retrieves the ExampleTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ExampleTuple list.
   * @apilevel low-level
   */
  public JastAddList<ExampleTuple> getExampleTuplesNoTransform() {
    return getExampleTupleListNoTransform();
  }
  /**
   * Replaces the RequestBodyTuple list.
   * @param list The new list node to be used as the RequestBodyTuple list.
   * @apilevel high-level
   */
  public void setRequestBodyTupleList(JastAddList<RequestBodyTuple> list) {
    setChild(list, 4);
  }
  /**
   * Retrieves the number of children in the RequestBodyTuple list.
   * @return Number of children in the RequestBodyTuple list.
   * @apilevel high-level
   */
  public int getNumRequestBodyTuple() {
    return getRequestBodyTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the RequestBodyTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the RequestBodyTuple list.
   * @apilevel low-level
   */
  public int getNumRequestBodyTupleNoTransform() {
    return getRequestBodyTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the RequestBodyTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the RequestBodyTuple list.
   * @apilevel high-level
   */
  public RequestBodyTuple getRequestBodyTuple(int i) {
    return (RequestBodyTuple) getRequestBodyTupleList().getChild(i);
  }
  /**
   * Check whether the RequestBodyTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasRequestBodyTuple() {
    return getRequestBodyTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the RequestBodyTuple list.
   * @param node The element to append to the RequestBodyTuple list.
   * @apilevel high-level
   */
  public void addRequestBodyTuple(RequestBodyTuple node) {
    JastAddList<RequestBodyTuple> list = (parent == null) ? getRequestBodyTupleListNoTransform() : getRequestBodyTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addRequestBodyTupleNoTransform(RequestBodyTuple node) {
    JastAddList<RequestBodyTuple> list = getRequestBodyTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the RequestBodyTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setRequestBodyTuple(RequestBodyTuple node, int i) {
    JastAddList<RequestBodyTuple> list = getRequestBodyTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the RequestBodyTuple list.
   * @return The node representing the RequestBodyTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="RequestBodyTuple")
  public JastAddList<RequestBodyTuple> getRequestBodyTupleList() {
    JastAddList<RequestBodyTuple> list = (JastAddList<RequestBodyTuple>) getChild(4);
    return list;
  }
  /**
   * Retrieves the RequestBodyTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the RequestBodyTuple list.
   * @apilevel low-level
   */
  public JastAddList<RequestBodyTuple> getRequestBodyTupleListNoTransform() {
    return (JastAddList<RequestBodyTuple>) getChildNoTransform(4);
  }
  /**
   * @return the element at index {@code i} in the RequestBodyTuple list without
   * triggering rewrites.
   */
  public RequestBodyTuple getRequestBodyTupleNoTransform(int i) {
    return (RequestBodyTuple) getRequestBodyTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the RequestBodyTuple list.
   * @return The node representing the RequestBodyTuple list.
   * @apilevel high-level
   */
  public JastAddList<RequestBodyTuple> getRequestBodyTuples() {
    return getRequestBodyTupleList();
  }
  /**
   * Retrieves the RequestBodyTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the RequestBodyTuple list.
   * @apilevel low-level
   */
  public JastAddList<RequestBodyTuple> getRequestBodyTuplesNoTransform() {
    return getRequestBodyTupleListNoTransform();
  }
  /**
   * Replaces the HeaderTuple list.
   * @param list The new list node to be used as the HeaderTuple list.
   * @apilevel high-level
   */
  public void setHeaderTupleList(JastAddList<HeaderTuple> list) {
    setChild(list, 5);
  }
  /**
   * Retrieves the number of children in the HeaderTuple list.
   * @return Number of children in the HeaderTuple list.
   * @apilevel high-level
   */
  public int getNumHeaderTuple() {
    return getHeaderTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the HeaderTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the HeaderTuple list.
   * @apilevel low-level
   */
  public int getNumHeaderTupleNoTransform() {
    return getHeaderTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the HeaderTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the HeaderTuple list.
   * @apilevel high-level
   */
  public HeaderTuple getHeaderTuple(int i) {
    return (HeaderTuple) getHeaderTupleList().getChild(i);
  }
  /**
   * Check whether the HeaderTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasHeaderTuple() {
    return getHeaderTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the HeaderTuple list.
   * @param node The element to append to the HeaderTuple list.
   * @apilevel high-level
   */
  public void addHeaderTuple(HeaderTuple node) {
    JastAddList<HeaderTuple> list = (parent == null) ? getHeaderTupleListNoTransform() : getHeaderTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addHeaderTupleNoTransform(HeaderTuple node) {
    JastAddList<HeaderTuple> list = getHeaderTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the HeaderTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setHeaderTuple(HeaderTuple node, int i) {
    JastAddList<HeaderTuple> list = getHeaderTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the HeaderTuple list.
   * @return The node representing the HeaderTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="HeaderTuple")
  public JastAddList<HeaderTuple> getHeaderTupleList() {
    JastAddList<HeaderTuple> list = (JastAddList<HeaderTuple>) getChild(5);
    return list;
  }
  /**
   * Retrieves the HeaderTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HeaderTuple list.
   * @apilevel low-level
   */
  public JastAddList<HeaderTuple> getHeaderTupleListNoTransform() {
    return (JastAddList<HeaderTuple>) getChildNoTransform(5);
  }
  /**
   * @return the element at index {@code i} in the HeaderTuple list without
   * triggering rewrites.
   */
  public HeaderTuple getHeaderTupleNoTransform(int i) {
    return (HeaderTuple) getHeaderTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the HeaderTuple list.
   * @return The node representing the HeaderTuple list.
   * @apilevel high-level
   */
  public JastAddList<HeaderTuple> getHeaderTuples() {
    return getHeaderTupleList();
  }
  /**
   * Retrieves the HeaderTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HeaderTuple list.
   * @apilevel low-level
   */
  public JastAddList<HeaderTuple> getHeaderTuplesNoTransform() {
    return getHeaderTupleListNoTransform();
  }
  /**
   * Replaces the SecuritySchemeTuple list.
   * @param list The new list node to be used as the SecuritySchemeTuple list.
   * @apilevel high-level
   */
  public void setSecuritySchemeTupleList(JastAddList<SecuritySchemeTuple> list) {
    setChild(list, 6);
  }
  /**
   * Retrieves the number of children in the SecuritySchemeTuple list.
   * @return Number of children in the SecuritySchemeTuple list.
   * @apilevel high-level
   */
  public int getNumSecuritySchemeTuple() {
    return getSecuritySchemeTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SecuritySchemeTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SecuritySchemeTuple list.
   * @apilevel low-level
   */
  public int getNumSecuritySchemeTupleNoTransform() {
    return getSecuritySchemeTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SecuritySchemeTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SecuritySchemeTuple list.
   * @apilevel high-level
   */
  public SecuritySchemeTuple getSecuritySchemeTuple(int i) {
    return (SecuritySchemeTuple) getSecuritySchemeTupleList().getChild(i);
  }
  /**
   * Check whether the SecuritySchemeTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSecuritySchemeTuple() {
    return getSecuritySchemeTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the SecuritySchemeTuple list.
   * @param node The element to append to the SecuritySchemeTuple list.
   * @apilevel high-level
   */
  public void addSecuritySchemeTuple(SecuritySchemeTuple node) {
    JastAddList<SecuritySchemeTuple> list = (parent == null) ? getSecuritySchemeTupleListNoTransform() : getSecuritySchemeTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSecuritySchemeTupleNoTransform(SecuritySchemeTuple node) {
    JastAddList<SecuritySchemeTuple> list = getSecuritySchemeTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SecuritySchemeTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSecuritySchemeTuple(SecuritySchemeTuple node, int i) {
    JastAddList<SecuritySchemeTuple> list = getSecuritySchemeTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SecuritySchemeTuple list.
   * @return The node representing the SecuritySchemeTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SecuritySchemeTuple")
  public JastAddList<SecuritySchemeTuple> getSecuritySchemeTupleList() {
    JastAddList<SecuritySchemeTuple> list = (JastAddList<SecuritySchemeTuple>) getChild(6);
    return list;
  }
  /**
   * Retrieves the SecuritySchemeTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecuritySchemeTuple list.
   * @apilevel low-level
   */
  public JastAddList<SecuritySchemeTuple> getSecuritySchemeTupleListNoTransform() {
    return (JastAddList<SecuritySchemeTuple>) getChildNoTransform(6);
  }
  /**
   * @return the element at index {@code i} in the SecuritySchemeTuple list without
   * triggering rewrites.
   */
  public SecuritySchemeTuple getSecuritySchemeTupleNoTransform(int i) {
    return (SecuritySchemeTuple) getSecuritySchemeTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the SecuritySchemeTuple list.
   * @return The node representing the SecuritySchemeTuple list.
   * @apilevel high-level
   */
  public JastAddList<SecuritySchemeTuple> getSecuritySchemeTuples() {
    return getSecuritySchemeTupleList();
  }
  /**
   * Retrieves the SecuritySchemeTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecuritySchemeTuple list.
   * @apilevel low-level
   */
  public JastAddList<SecuritySchemeTuple> getSecuritySchemeTuplesNoTransform() {
    return getSecuritySchemeTupleListNoTransform();
  }
  /**
   * Replaces the LinkTuple list.
   * @param list The new list node to be used as the LinkTuple list.
   * @apilevel high-level
   */
  public void setLinkTupleList(JastAddList<LinkTuple> list) {
    setChild(list, 7);
  }
  /**
   * Retrieves the number of children in the LinkTuple list.
   * @return Number of children in the LinkTuple list.
   * @apilevel high-level
   */
  public int getNumLinkTuple() {
    return getLinkTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the LinkTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the LinkTuple list.
   * @apilevel low-level
   */
  public int getNumLinkTupleNoTransform() {
    return getLinkTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the LinkTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the LinkTuple list.
   * @apilevel high-level
   */
  public LinkTuple getLinkTuple(int i) {
    return (LinkTuple) getLinkTupleList().getChild(i);
  }
  /**
   * Check whether the LinkTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasLinkTuple() {
    return getLinkTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the LinkTuple list.
   * @param node The element to append to the LinkTuple list.
   * @apilevel high-level
   */
  public void addLinkTuple(LinkTuple node) {
    JastAddList<LinkTuple> list = (parent == null) ? getLinkTupleListNoTransform() : getLinkTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addLinkTupleNoTransform(LinkTuple node) {
    JastAddList<LinkTuple> list = getLinkTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the LinkTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setLinkTuple(LinkTuple node, int i) {
    JastAddList<LinkTuple> list = getLinkTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the LinkTuple list.
   * @return The node representing the LinkTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="LinkTuple")
  public JastAddList<LinkTuple> getLinkTupleList() {
    JastAddList<LinkTuple> list = (JastAddList<LinkTuple>) getChild(7);
    return list;
  }
  /**
   * Retrieves the LinkTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the LinkTuple list.
   * @apilevel low-level
   */
  public JastAddList<LinkTuple> getLinkTupleListNoTransform() {
    return (JastAddList<LinkTuple>) getChildNoTransform(7);
  }
  /**
   * @return the element at index {@code i} in the LinkTuple list without
   * triggering rewrites.
   */
  public LinkTuple getLinkTupleNoTransform(int i) {
    return (LinkTuple) getLinkTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the LinkTuple list.
   * @return The node representing the LinkTuple list.
   * @apilevel high-level
   */
  public JastAddList<LinkTuple> getLinkTuples() {
    return getLinkTupleList();
  }
  /**
   * Retrieves the LinkTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the LinkTuple list.
   * @apilevel low-level
   */
  public JastAddList<LinkTuple> getLinkTuplesNoTransform() {
    return getLinkTupleListNoTransform();
  }
  /**
   * Replaces the CallbackTuple list.
   * @param list The new list node to be used as the CallbackTuple list.
   * @apilevel high-level
   */
  public void setCallbackTupleList(JastAddList<CallbackTuple> list) {
    setChild(list, 8);
  }
  /**
   * Retrieves the number of children in the CallbackTuple list.
   * @return Number of children in the CallbackTuple list.
   * @apilevel high-level
   */
  public int getNumCallbackTuple() {
    return getCallbackTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the CallbackTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the CallbackTuple list.
   * @apilevel low-level
   */
  public int getNumCallbackTupleNoTransform() {
    return getCallbackTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the CallbackTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the CallbackTuple list.
   * @apilevel high-level
   */
  public CallbackTuple getCallbackTuple(int i) {
    return (CallbackTuple) getCallbackTupleList().getChild(i);
  }
  /**
   * Check whether the CallbackTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasCallbackTuple() {
    return getCallbackTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the CallbackTuple list.
   * @param node The element to append to the CallbackTuple list.
   * @apilevel high-level
   */
  public void addCallbackTuple(CallbackTuple node) {
    JastAddList<CallbackTuple> list = (parent == null) ? getCallbackTupleListNoTransform() : getCallbackTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addCallbackTupleNoTransform(CallbackTuple node) {
    JastAddList<CallbackTuple> list = getCallbackTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the CallbackTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setCallbackTuple(CallbackTuple node, int i) {
    JastAddList<CallbackTuple> list = getCallbackTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the CallbackTuple list.
   * @return The node representing the CallbackTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="CallbackTuple")
  public JastAddList<CallbackTuple> getCallbackTupleList() {
    JastAddList<CallbackTuple> list = (JastAddList<CallbackTuple>) getChild(8);
    return list;
  }
  /**
   * Retrieves the CallbackTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CallbackTuple list.
   * @apilevel low-level
   */
  public JastAddList<CallbackTuple> getCallbackTupleListNoTransform() {
    return (JastAddList<CallbackTuple>) getChildNoTransform(8);
  }
  /**
   * @return the element at index {@code i} in the CallbackTuple list without
   * triggering rewrites.
   */
  public CallbackTuple getCallbackTupleNoTransform(int i) {
    return (CallbackTuple) getCallbackTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the CallbackTuple list.
   * @return The node representing the CallbackTuple list.
   * @apilevel high-level
   */
  public JastAddList<CallbackTuple> getCallbackTuples() {
    return getCallbackTupleList();
  }
  /**
   * Retrieves the CallbackTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CallbackTuple list.
   * @apilevel low-level
   */
  public JastAddList<CallbackTuple> getCallbackTuplesNoTransform() {
    return getCallbackTupleListNoTransform();
  }
  /**
   * Replaces the Extension list.
   * @param list The new list node to be used as the Extension list.
   * @apilevel high-level
   */
  public void setExtensionList(JastAddList<Extension> list) {
    setChild(list, 9);
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
    JastAddList<Extension> list = (JastAddList<Extension>) getChild(9);
    return list;
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionListNoTransform() {
    return (JastAddList<Extension>) getChildNoTransform(9);
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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
