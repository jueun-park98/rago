/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:77
 * @astdecl OperationObject : ASTNode ::= Tag* <Summary:String> <Description:String> [ExternalDocumentationObject] <OperationID:String> Param* [RequestBody] ResponsesObject CallbacksTuple* [DeprecatedBoolean] SecurityRequirementObject* ServerObject*;
 * @production OperationObject : {@link ASTNode} ::= <span class="component">{@link Tag}*</span> <span class="component">&lt;Summary:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">[{@link ExternalDocumentationObject}]</span> <span class="component">&lt;OperationID:String&gt;</span> <span class="component">{@link Param}*</span> <span class="component">[{@link RequestBody}]</span> <span class="component">{@link ResponsesObject}</span> <span class="component">{@link CallbacksTuple}*</span> <span class="component">[{@link DeprecatedBoolean}]</span> <span class="component">{@link SecurityRequirementObject}*</span> <span class="component">{@link ServerObject}*</span>;

 */
public class OperationObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/Composer.jadd:214
   */
  public static Operation composeOperation (OperationObject operationObject){
        Operation operation = new Operation();

        if( operationObject.getNumTag() != 0 ){
        for( de.tudresden.inf.st.openapi.ast.Tag t : operationObject.getTags() )
        operation.addTag(t.getTag());
        }
        if( !operationObject.getSummary().isEmpty() )
        operation.setSummary( operationObject.getSummary() );
        if( !operationObject.getDescription().isEmpty() )
        operation.setDescription( operationObject.getDescription() );
        if( operationObject.hasExternalDocumentationObject() )
        operation.setExternalDocs( ExternalDocumentationObject.composeExternalDocs(operationObject.getExternalDocumentationObject()) );
        if( !operationObject.getOperationID().isEmpty() )
        operation.setOperationId( operationObject.getOperationID() );
        if( operationObject.getNumParam() != 0 ){
        for( Param p : operationObject.getParams() )
        operation.addParameter( ParameterObject.composeParameter( ((ParameterObject) p) ) );
        }
        if( operationObject.hasRequestBody() )
        operation.setRequestBody( RequestBodyObject.composeRequestBody( ((RequestBodyObject) operationObject.getRequestBody())) );
        if( operationObject.getResponsesObject().getNumHTTPStatusCode() != 0){
        Map<String, Response> responses = new HashMap<>();
        for( HTTPStatusCode h : operationObject.getResponsesObject().getHTTPStatusCodes() )
        responses.put( ((ResponseObject)h).getName(), ResponseObject.composeResponse( ((ResponseObject) h)) );
        operation.setResponses(responses);
        }
        if( operationObject.getNumCallbacksTuple() != 0 ){
        Map<String, Callback> callbacks = new HashMap<>();
        for( CallbacksTuple t : operationObject.getCallbacksTuples() )
        callbacks.put( ((CallbackObjectTuple)t).getName(), CallbackObject.composeCallback( ((CallbackObjectTuple) t).getCallbackObject()) );
        operation.setCallbacks(callbacks);
        }
        //if( operationObject.getDeprecatedBoolean() != null )
        //    operation.setDeprecated( (boolean) operationObject.getDeprecatedBoolean().getDeprecatedBoolean() );
        if( operationObject.getNumSecurityRequirementObject() != 0 ){
        for( SecurityRequirementObject s : operationObject.getSecurityRequirementObjects() )
        operation.addSecurityRequirement( SecurityRequirementObject.composeSecurityRequiremnet(s) );
        }
        if( operationObject.getNumServerObject() != 0 ){
        for( ServerObject s : operationObject.getServerObjects() )
        operation.addServer( ServerObject.composeServer(s) );
        }

        return operation;
        }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:272
   */
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
        operationObject.setExternalDocumentationObject( ExternalDocumentationObject.parseExternalDocs(operation.getExternalDocs()) );
        if( operation.getOperationId() != null )
        operationObject.setOperationID( operation.getOperationId() );
        if( operation.getParameters() != null ){
        for( Parameter p : operation.getParameters() )
        operationObject.addParam(ParameterObject.parseParameter(p));
        }
        if( operation.getRequestBody() != null )
        operationObject.setRequestBody( RequestBodyObject.parseRequestBody( operation.getRequestBody() ) );
        if( operation.getResponses() != null ){
        ResponsesObject responsesObject = new ResponsesObject();
        for( String key : operation.getResponses().keySet()){
        ResponseObject responseObject;
        responseObject = ResponseObject.parseResponse(operation.getResponse(key));
        responseObject.setName(key);
        responsesObject.addHTTPStatusCode(responseObject);
        }
        operationObject.setResponsesObject(responsesObject);
        }
        if( operation.getCallbacks() != null ){
        CallbackObjectTuple callbackObjectTuple = new CallbackObjectTuple();
        for( String key : operation.getCallbacks().keySet() ){
        callbackObjectTuple.setName(key);
        callbackObjectTuple.setCallbackObject(CallbackObject.parseCallback(operation.getCallback(key)));
        operationObject.addCallbacksTuple(callbackObjectTuple);
        }
        }

        if( operation.getSecurityRequirements() != null ){
        for( SecurityRequirement sr : operation.getSecurityRequirements() )
        operationObject.addSecurityRequirementObject(SecurityRequirementObject.parseSecurityRequirement(sr));
        }
        if( operation.getServers() != null ){
        for( Server s : operation.getServers() )
        operationObject.addServerObject(ServerObject.parseServer(s));
        }

        return operationObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public OperationObject() {
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
    setChild(new JastAddList(), 0);
    setChild(new Opt(), 1);
    setChild(new JastAddList(), 2);
    setChild(new Opt(), 3);
    setChild(new JastAddList(), 5);
    setChild(new Opt(), 6);
    setChild(new JastAddList(), 7);
    setChild(new JastAddList(), 8);
  }
  /**
   * @declaredat ASTNode:21
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Tag", "Summary", "Description", "ExternalDocumentationObject", "OperationID", "Param", "RequestBody", "ResponsesObject", "CallbacksTuple", "DeprecatedBoolean", "SecurityRequirementObject", "ServerObject"},
    type = {"JastAddList<Tag>", "String", "String", "Opt<ExternalDocumentationObject>", "String", "JastAddList<Param>", "Opt<RequestBody>", "ResponsesObject", "JastAddList<CallbacksTuple>", "Opt<DeprecatedBoolean>", "JastAddList<SecurityRequirementObject>", "JastAddList<ServerObject>"},
    kind = {"List", "Token", "Token", "Opt", "Token", "List", "Opt", "Child", "List", "Opt", "List", "List"}
  )
  public OperationObject(JastAddList<Tag> p0, String p1, String p2, Opt<ExternalDocumentationObject> p3, String p4, JastAddList<Param> p5, Opt<RequestBody> p6, ResponsesObject p7, JastAddList<CallbacksTuple> p8, Opt<DeprecatedBoolean> p9, JastAddList<SecurityRequirementObject> p10, JastAddList<ServerObject> p11) {
    setChild(p0, 0);
    setSummary(p1);
    setDescription(p2);
    setChild(p3, 1);
    setOperationID(p4);
    setChild(p5, 2);
    setChild(p6, 3);
    setChild(p7, 4);
    setChild(p8, 5);
    setChild(p9, 6);
    setChild(p10, 7);
    setChild(p11, 8);
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
  }
  /** @apilevel internal 
   * @declaredat ASTNode:59
   */
  public OperationObject clone() throws CloneNotSupportedException {
    OperationObject node = (OperationObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:64
   */
  public OperationObject copy() {
    try {
      OperationObject node = (OperationObject) clone();
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
  public OperationObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:93
   */
  public OperationObject treeCopyNoTransform() {
    OperationObject tree = (OperationObject) copy();
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
  public OperationObject treeCopy() {
    OperationObject tree = (OperationObject) copy();
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
    return super.is$Equal(node) && (tokenString_Summary == ((OperationObject) node).tokenString_Summary) && (tokenString_Description == ((OperationObject) node).tokenString_Description) && (tokenString_OperationID == ((OperationObject) node).tokenString_OperationID);    
  }
  /**
   * Replaces the Tag list.
   * @param list The new list node to be used as the Tag list.
   * @apilevel high-level
   */
  public void setTagList(JastAddList<Tag> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Tag list.
   * @return Number of children in the Tag list.
   * @apilevel high-level
   */
  public int getNumTag() {
    return getTagList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Tag list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Tag list.
   * @apilevel low-level
   */
  public int getNumTagNoTransform() {
    return getTagListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Tag list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Tag list.
   * @apilevel high-level
   */
  public Tag getTag(int i) {
    return (Tag) getTagList().getChild(i);
  }
  /**
   * Check whether the Tag list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasTag() {
    return getTagList().getNumChild() != 0;
  }
  /**
   * Append an element to the Tag list.
   * @param node The element to append to the Tag list.
   * @apilevel high-level
   */
  public void addTag(Tag node) {
    JastAddList<Tag> list = (parent == null) ? getTagListNoTransform() : getTagList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addTagNoTransform(Tag node) {
    JastAddList<Tag> list = getTagListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Tag list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setTag(Tag node, int i) {
    JastAddList<Tag> list = getTagList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Tag list.
   * @return The node representing the Tag list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Tag")
  public JastAddList<Tag> getTagList() {
    JastAddList<Tag> list = (JastAddList<Tag>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Tag list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Tag list.
   * @apilevel low-level
   */
  public JastAddList<Tag> getTagListNoTransform() {
    return (JastAddList<Tag>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Tag list without
   * triggering rewrites.
   */
  public Tag getTagNoTransform(int i) {
    return (Tag) getTagListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Tag list.
   * @return The node representing the Tag list.
   * @apilevel high-level
   */
  public JastAddList<Tag> getTags() {
    return getTagList();
  }
  /**
   * Retrieves the Tag list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Tag list.
   * @apilevel low-level
   */
  public JastAddList<Tag> getTagsNoTransform() {
    return getTagListNoTransform();
  }
  /**
   * Replaces the lexeme Summary.
   * @param value The new value for the lexeme Summary.
   * @apilevel high-level
   */
  public void setSummary(String value) {
    tokenString_Summary = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Summary;
  /**
   * Retrieves the value for the lexeme Summary.
   * @return The value for the lexeme Summary.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Summary")
  public String getSummary() {
    return tokenString_Summary != null ? tokenString_Summary : "";
  }
  /**
   * Replaces the lexeme Description.
   * @param value The new value for the lexeme Description.
   * @apilevel high-level
   */
  public void setDescription(String value) {
    tokenString_Description = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Description;
  /**
   * Retrieves the value for the lexeme Description.
   * @return The value for the lexeme Description.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Description")
  public String getDescription() {
    return tokenString_Description != null ? tokenString_Description : "";
  }
  /**
   * Replaces the optional node for the ExternalDocumentationObject child. This is the <code>Opt</code>
   * node containing the child ExternalDocumentationObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ExternalDocumentationObject child.
   * @apilevel low-level
   */
  public void setExternalDocumentationObjectOpt(Opt<ExternalDocumentationObject> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) ExternalDocumentationObject child.
   * @param node The new node to be used as the ExternalDocumentationObject child.
   * @apilevel high-level
   */
  public void setExternalDocumentationObject(ExternalDocumentationObject node) {
    getExternalDocumentationObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ExternalDocumentationObject child exists.
   * @return {@code true} if the optional ExternalDocumentationObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasExternalDocumentationObject() {
    return getExternalDocumentationObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ExternalDocumentationObject child.
   * @return The ExternalDocumentationObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ExternalDocumentationObject getExternalDocumentationObject() {
    return (ExternalDocumentationObject) getExternalDocumentationObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ExternalDocumentationObject child. This is the <code>Opt</code> node containing the child ExternalDocumentationObject, not the actual child!
   * @return The optional node for child the ExternalDocumentationObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ExternalDocumentationObject")
  public Opt<ExternalDocumentationObject> getExternalDocumentationObjectOpt() {
    return (Opt<ExternalDocumentationObject>) getChild(1);
  }
  /**
   * Retrieves the optional node for child ExternalDocumentationObject. This is the <code>Opt</code> node containing the child ExternalDocumentationObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ExternalDocumentationObject.
   * @apilevel low-level
   */
  public Opt<ExternalDocumentationObject> getExternalDocumentationObjectOptNoTransform() {
    return (Opt<ExternalDocumentationObject>) getChildNoTransform(1);
  }
  /**
   * Replaces the lexeme OperationID.
   * @param value The new value for the lexeme OperationID.
   * @apilevel high-level
   */
  public void setOperationID(String value) {
    tokenString_OperationID = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_OperationID;
  /**
   * Retrieves the value for the lexeme OperationID.
   * @return The value for the lexeme OperationID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="OperationID")
  public String getOperationID() {
    return tokenString_OperationID != null ? tokenString_OperationID : "";
  }
  /**
   * Replaces the Param list.
   * @param list The new list node to be used as the Param list.
   * @apilevel high-level
   */
  public void setParamList(JastAddList<Param> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Param list.
   * @return Number of children in the Param list.
   * @apilevel high-level
   */
  public int getNumParam() {
    return getParamList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Param list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Param list.
   * @apilevel low-level
   */
  public int getNumParamNoTransform() {
    return getParamListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Param list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Param list.
   * @apilevel high-level
   */
  public Param getParam(int i) {
    return (Param) getParamList().getChild(i);
  }
  /**
   * Check whether the Param list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParam() {
    return getParamList().getNumChild() != 0;
  }
  /**
   * Append an element to the Param list.
   * @param node The element to append to the Param list.
   * @apilevel high-level
   */
  public void addParam(Param node) {
    JastAddList<Param> list = (parent == null) ? getParamListNoTransform() : getParamList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addParamNoTransform(Param node) {
    JastAddList<Param> list = getParamListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Param list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParam(Param node, int i) {
    JastAddList<Param> list = getParamList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Param list.
   * @return The node representing the Param list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Param")
  public JastAddList<Param> getParamList() {
    JastAddList<Param> list = (JastAddList<Param>) getChild(2);
    return list;
  }
  /**
   * Retrieves the Param list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Param list.
   * @apilevel low-level
   */
  public JastAddList<Param> getParamListNoTransform() {
    return (JastAddList<Param>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the Param list without
   * triggering rewrites.
   */
  public Param getParamNoTransform(int i) {
    return (Param) getParamListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Param list.
   * @return The node representing the Param list.
   * @apilevel high-level
   */
  public JastAddList<Param> getParams() {
    return getParamList();
  }
  /**
   * Retrieves the Param list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Param list.
   * @apilevel low-level
   */
  public JastAddList<Param> getParamsNoTransform() {
    return getParamListNoTransform();
  }
  /**
   * Replaces the optional node for the RequestBody child. This is the <code>Opt</code>
   * node containing the child RequestBody, not the actual child!
   * @param opt The new node to be used as the optional node for the RequestBody child.
   * @apilevel low-level
   */
  public void setRequestBodyOpt(Opt<RequestBody> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) RequestBody child.
   * @param node The new node to be used as the RequestBody child.
   * @apilevel high-level
   */
  public void setRequestBody(RequestBody node) {
    getRequestBodyOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional RequestBody child exists.
   * @return {@code true} if the optional RequestBody child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasRequestBody() {
    return getRequestBodyOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) RequestBody child.
   * @return The RequestBody child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public RequestBody getRequestBody() {
    return (RequestBody) getRequestBodyOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the RequestBody child. This is the <code>Opt</code> node containing the child RequestBody, not the actual child!
   * @return The optional node for child the RequestBody child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="RequestBody")
  public Opt<RequestBody> getRequestBodyOpt() {
    return (Opt<RequestBody>) getChild(3);
  }
  /**
   * Retrieves the optional node for child RequestBody. This is the <code>Opt</code> node containing the child RequestBody, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child RequestBody.
   * @apilevel low-level
   */
  public Opt<RequestBody> getRequestBodyOptNoTransform() {
    return (Opt<RequestBody>) getChildNoTransform(3);
  }
  /**
   * Replaces the ResponsesObject child.
   * @param node The new node to replace the ResponsesObject child.
   * @apilevel high-level
   */
  public void setResponsesObject(ResponsesObject node) {
    setChild(node, 4);
  }
  /**
   * Retrieves the ResponsesObject child.
   * @return The current node used as the ResponsesObject child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="ResponsesObject")
  public ResponsesObject getResponsesObject() {
    return (ResponsesObject) getChild(4);
  }
  /**
   * Retrieves the ResponsesObject child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ResponsesObject child.
   * @apilevel low-level
   */
  public ResponsesObject getResponsesObjectNoTransform() {
    return (ResponsesObject) getChildNoTransform(4);
  }
  /**
   * Replaces the CallbacksTuple list.
   * @param list The new list node to be used as the CallbacksTuple list.
   * @apilevel high-level
   */
  public void setCallbacksTupleList(JastAddList<CallbacksTuple> list) {
    setChild(list, 5);
  }
  /**
   * Retrieves the number of children in the CallbacksTuple list.
   * @return Number of children in the CallbacksTuple list.
   * @apilevel high-level
   */
  public int getNumCallbacksTuple() {
    return getCallbacksTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the CallbacksTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the CallbacksTuple list.
   * @apilevel low-level
   */
  public int getNumCallbacksTupleNoTransform() {
    return getCallbacksTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the CallbacksTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the CallbacksTuple list.
   * @apilevel high-level
   */
  public CallbacksTuple getCallbacksTuple(int i) {
    return (CallbacksTuple) getCallbacksTupleList().getChild(i);
  }
  /**
   * Check whether the CallbacksTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasCallbacksTuple() {
    return getCallbacksTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the CallbacksTuple list.
   * @param node The element to append to the CallbacksTuple list.
   * @apilevel high-level
   */
  public void addCallbacksTuple(CallbacksTuple node) {
    JastAddList<CallbacksTuple> list = (parent == null) ? getCallbacksTupleListNoTransform() : getCallbacksTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addCallbacksTupleNoTransform(CallbacksTuple node) {
    JastAddList<CallbacksTuple> list = getCallbacksTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the CallbacksTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setCallbacksTuple(CallbacksTuple node, int i) {
    JastAddList<CallbacksTuple> list = getCallbacksTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the CallbacksTuple list.
   * @return The node representing the CallbacksTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="CallbacksTuple")
  public JastAddList<CallbacksTuple> getCallbacksTupleList() {
    JastAddList<CallbacksTuple> list = (JastAddList<CallbacksTuple>) getChild(5);
    return list;
  }
  /**
   * Retrieves the CallbacksTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CallbacksTuple list.
   * @apilevel low-level
   */
  public JastAddList<CallbacksTuple> getCallbacksTupleListNoTransform() {
    return (JastAddList<CallbacksTuple>) getChildNoTransform(5);
  }
  /**
   * @return the element at index {@code i} in the CallbacksTuple list without
   * triggering rewrites.
   */
  public CallbacksTuple getCallbacksTupleNoTransform(int i) {
    return (CallbacksTuple) getCallbacksTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the CallbacksTuple list.
   * @return The node representing the CallbacksTuple list.
   * @apilevel high-level
   */
  public JastAddList<CallbacksTuple> getCallbacksTuples() {
    return getCallbacksTupleList();
  }
  /**
   * Retrieves the CallbacksTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CallbacksTuple list.
   * @apilevel low-level
   */
  public JastAddList<CallbacksTuple> getCallbacksTuplesNoTransform() {
    return getCallbacksTupleListNoTransform();
  }
  /**
   * Replaces the optional node for the DeprecatedBoolean child. This is the <code>Opt</code>
   * node containing the child DeprecatedBoolean, not the actual child!
   * @param opt The new node to be used as the optional node for the DeprecatedBoolean child.
   * @apilevel low-level
   */
  public void setDeprecatedBooleanOpt(Opt<DeprecatedBoolean> opt) {
    setChild(opt, 6);
  }
  /**
   * Replaces the (optional) DeprecatedBoolean child.
   * @param node The new node to be used as the DeprecatedBoolean child.
   * @apilevel high-level
   */
  public void setDeprecatedBoolean(DeprecatedBoolean node) {
    getDeprecatedBooleanOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional DeprecatedBoolean child exists.
   * @return {@code true} if the optional DeprecatedBoolean child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasDeprecatedBoolean() {
    return getDeprecatedBooleanOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) DeprecatedBoolean child.
   * @return The DeprecatedBoolean child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public DeprecatedBoolean getDeprecatedBoolean() {
    return (DeprecatedBoolean) getDeprecatedBooleanOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the DeprecatedBoolean child. This is the <code>Opt</code> node containing the child DeprecatedBoolean, not the actual child!
   * @return The optional node for child the DeprecatedBoolean child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="DeprecatedBoolean")
  public Opt<DeprecatedBoolean> getDeprecatedBooleanOpt() {
    return (Opt<DeprecatedBoolean>) getChild(6);
  }
  /**
   * Retrieves the optional node for child DeprecatedBoolean. This is the <code>Opt</code> node containing the child DeprecatedBoolean, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child DeprecatedBoolean.
   * @apilevel low-level
   */
  public Opt<DeprecatedBoolean> getDeprecatedBooleanOptNoTransform() {
    return (Opt<DeprecatedBoolean>) getChildNoTransform(6);
  }
  /**
   * Replaces the SecurityRequirementObject list.
   * @param list The new list node to be used as the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public void setSecurityRequirementObjectList(JastAddList<SecurityRequirementObject> list) {
    setChild(list, 7);
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
    JastAddList<SecurityRequirementObject> list = (JastAddList<SecurityRequirementObject>) getChild(7);
    return list;
  }
  /**
   * Retrieves the SecurityRequirementObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecurityRequirementObject list.
   * @apilevel low-level
   */
  public JastAddList<SecurityRequirementObject> getSecurityRequirementObjectListNoTransform() {
    return (JastAddList<SecurityRequirementObject>) getChildNoTransform(7);
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
   * Replaces the ServerObject list.
   * @param list The new list node to be used as the ServerObject list.
   * @apilevel high-level
   */
  public void setServerObjectList(JastAddList<ServerObject> list) {
    setChild(list, 8);
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
    JastAddList<ServerObject> list = (JastAddList<ServerObject>) getChild(8);
    return list;
  }
  /**
   * Retrieves the ServerObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerObject list.
   * @apilevel low-level
   */
  public JastAddList<ServerObject> getServerObjectListNoTransform() {
    return (JastAddList<ServerObject>) getChildNoTransform(8);
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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
