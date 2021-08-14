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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:49
 * @astdecl OperationObject : ASTNode ::= Tag* <Summary:String> <Description:String> [ExternalDocObject] <OperationID:String> ParameterObject* [RequestBodyObject] ResponseTuple* CallbackTuple* <DeprecatedBoolean:Boolean> SecurityRequirementObject* ServerObject* <Required:Boolean>;
 * @production OperationObject : {@link ASTNode} ::= <span class="component">{@link Tag}*</span> <span class="component">&lt;Summary:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">[{@link ExternalDocObject}]</span> <span class="component">&lt;OperationID:String&gt;</span> <span class="component">{@link ParameterObject}*</span> <span class="component">[{@link RequestBodyObject}]</span> <span class="component">{@link ResponseTuple}*</span> <span class="component">{@link CallbackTuple}*</span> <span class="component">&lt;DeprecatedBoolean:Boolean&gt;</span> <span class="component">{@link SecurityRequirementObject}*</span> <span class="component">{@link ServerObject}*</span> <span class="component">&lt;Required:Boolean&gt;</span>;

 */
public class OperationObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:284
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
        if( operationObject.hasExternalDocObject() )
        operation.setExternalDocs( ExternalDocObject.composeExternalDocs(operationObject.getExternalDocObject()) );
        if( !operationObject.getOperationID().isEmpty() )
        operation.setOperationId( operationObject.getOperationID() );
        if( operationObject.getNumParameterObject() != 0 ){
        for( ParameterObject p : operationObject.getParameterObjects() )
        operation.addParameter( ParameterObject.composeParameter(p) );
        }
        if( operationObject.hasRequestBodyObject() )
        operation.setRequestBody( RequestBodyObject.composeRequestBody(operationObject.getRequestBodyObject()));
        if( operationObject.getNumResponseTuple() != 0){
        Map<String, Response> responseMap = new HashMap<>();
        for( ResponseTuple t : operationObject.getResponseTuples() )
        responseMap.put(t.getKey(), ResponseObject.composeResponse(t.getResponseObject()));
        operation.setResponses(responseMap);
        }
        if( operationObject.getNumCallbackTuple() != 0 ){
        Map<String, Callback> callbacks = new HashMap<>();
        for( CallbackTuple t : operationObject.getCallbackTuples() ) {
        if( !t.getCallbackObject().getRef().isEmpty() ){
        Callback callback = new Callback();
        callback.setRef(t.getCallbackObject().getRef());
        callbacks.put(t.getKey(), callback);
        }
        else
        callbacks.put(t.getKey(), CallbackObject.composeCallback(t.getCallbackObject()));
        operation.setCallbacks(callbacks);
        }
        }
        if( operationObject.getDeprecatedBoolean() != null )
        operation.setDeprecated(operationObject.getDeprecatedBoolean());
        if( operationObject.getNumSecurityRequirementObject() != 0 ){
        for( SecurityRequirementObject s : operationObject.getSecurityRequirementObjects() )
        operation.addSecurityRequirement( SecurityRequirementObject.composeSecurityRequirement(s) );
        }
        if( operationObject.getNumServerObject() != 0 ){
        for( ServerObject s : operationObject.getServerObjects() )
        operation.addServer( ServerObject.composeServer(s) );
        }

        return operation;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:330
   */
  public static OperationObject parseOperation(Operation operation){
        OperationObject operationObject = new OperationObject();

        if( operation.getDeprecated() != null )
        operationObject.setDeprecatedBoolean(operation.getDeprecated());
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
        operationObject.setExternalDocObject(ExternalDocObject.parseExternalDocs(operation.getExternalDocs()));
        if( operation.getOperationId() != null )
        operationObject.setOperationID( operation.getOperationId() );
        if( operation.getParameters() != null ){
        for( Parameter p : operation.getParameters() )
        operationObject.addParameterObject(ParameterObject.parseParameter(p));
        }
        if( operation.getRequestBody() != null )
        operationObject.setRequestBodyObject( RequestBodyObject.parseRequestBody( operation.getRequestBody() ) );
        if( operation.getResponses() != null ){
        for( String key : operation.getResponses().keySet())
        operationObject.addResponseTuple(new ResponseTuple(key, ResponseObject.parseResponse(operation.getResponse(key))));
        }
        if( operation.getCallbacks() != null ){
        for( String key : operation.getCallbacks().keySet() )
        operationObject.addCallbackTuple(new CallbackTuple(key, CallbackObject.parseCallback(operation.getCallback(key))));
        }
        if( operation.getSecurityRequirements() != null ){
        for( SecurityRequirement s : operation.getSecurityRequirements() )
        operationObject.addSecurityRequirementObject(SecurityRequirementObject.parseSecurityRequirement(s));
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
    children = new ASTNode[8];
    setChild(new JastAddList(), 0);
    setChild(new Opt(), 1);
    setChild(new JastAddList(), 2);
    setChild(new Opt(), 3);
    setChild(new JastAddList(), 4);
    setChild(new JastAddList(), 5);
    setChild(new JastAddList(), 6);
    setChild(new JastAddList(), 7);
  }
  /**
   * @declaredat ASTNode:21
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Tag", "Summary", "Description", "ExternalDocObject", "OperationID", "ParameterObject", "RequestBodyObject", "ResponseTuple", "CallbackTuple", "DeprecatedBoolean", "SecurityRequirementObject", "ServerObject", "Required"},
    type = {"JastAddList<Tag>", "String", "String", "Opt<ExternalDocObject>", "String", "JastAddList<ParameterObject>", "Opt<RequestBodyObject>", "JastAddList<ResponseTuple>", "JastAddList<CallbackTuple>", "Boolean", "JastAddList<SecurityRequirementObject>", "JastAddList<ServerObject>", "Boolean"},
    kind = {"List", "Token", "Token", "Opt", "Token", "List", "Opt", "List", "List", "Token", "List", "List", "Token"}
  )
  public OperationObject(JastAddList<Tag> p0, String p1, String p2, Opt<ExternalDocObject> p3, String p4, JastAddList<ParameterObject> p5, Opt<RequestBodyObject> p6, JastAddList<ResponseTuple> p7, JastAddList<CallbackTuple> p8, Boolean p9, JastAddList<SecurityRequirementObject> p10, JastAddList<ServerObject> p11, Boolean p12) {
    setChild(p0, 0);
    setSummary(p1);
    setDescription(p2);
    setChild(p3, 1);
    setOperationID(p4);
    setChild(p5, 2);
    setChild(p6, 3);
    setChild(p7, 4);
    setChild(p8, 5);
    setDeprecatedBoolean(p9);
    setChild(p10, 6);
    setChild(p11, 7);
    setRequired(p12);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:42
   */
  protected int numChildren() {
    return 8;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:48
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:56
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:60
   */
  public OperationObject clone() throws CloneNotSupportedException {
    OperationObject node = (OperationObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:65
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
   * @declaredat ASTNode:84
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
   * @declaredat ASTNode:94
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
   * @declaredat ASTNode:114
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
   * @declaredat ASTNode:128
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Summary == ((OperationObject) node).tokenString_Summary) && (tokenString_Description == ((OperationObject) node).tokenString_Description) && (tokenString_OperationID == ((OperationObject) node).tokenString_OperationID) && (tokenBoolean_DeprecatedBoolean == ((OperationObject) node).tokenBoolean_DeprecatedBoolean) && (tokenBoolean_Required == ((OperationObject) node).tokenBoolean_Required);    
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
   * Replaces the optional node for the ExternalDocObject child. This is the <code>Opt</code>
   * node containing the child ExternalDocObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ExternalDocObject child.
   * @apilevel low-level
   */
  public void setExternalDocObjectOpt(Opt<ExternalDocObject> opt) {
    setChild(opt, 1);
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
    return (Opt<ExternalDocObject>) getChild(1);
  }
  /**
   * Retrieves the optional node for child ExternalDocObject. This is the <code>Opt</code> node containing the child ExternalDocObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ExternalDocObject.
   * @apilevel low-level
   */
  public Opt<ExternalDocObject> getExternalDocObjectOptNoTransform() {
    return (Opt<ExternalDocObject>) getChildNoTransform(1);
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
   * Replaces the ParameterObject list.
   * @param list The new list node to be used as the ParameterObject list.
   * @apilevel high-level
   */
  public void setParameterObjectList(JastAddList<ParameterObject> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the ParameterObject list.
   * @return Number of children in the ParameterObject list.
   * @apilevel high-level
   */
  public int getNumParameterObject() {
    return getParameterObjectList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ParameterObject list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ParameterObject list.
   * @apilevel low-level
   */
  public int getNumParameterObjectNoTransform() {
    return getParameterObjectListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ParameterObject list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ParameterObject list.
   * @apilevel high-level
   */
  public ParameterObject getParameterObject(int i) {
    return (ParameterObject) getParameterObjectList().getChild(i);
  }
  /**
   * Check whether the ParameterObject list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParameterObject() {
    return getParameterObjectList().getNumChild() != 0;
  }
  /**
   * Append an element to the ParameterObject list.
   * @param node The element to append to the ParameterObject list.
   * @apilevel high-level
   */
  public void addParameterObject(ParameterObject node) {
    JastAddList<ParameterObject> list = (parent == null) ? getParameterObjectListNoTransform() : getParameterObjectList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addParameterObjectNoTransform(ParameterObject node) {
    JastAddList<ParameterObject> list = getParameterObjectListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ParameterObject list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParameterObject(ParameterObject node, int i) {
    JastAddList<ParameterObject> list = getParameterObjectList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ParameterObject list.
   * @return The node representing the ParameterObject list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ParameterObject")
  public JastAddList<ParameterObject> getParameterObjectList() {
    JastAddList<ParameterObject> list = (JastAddList<ParameterObject>) getChild(2);
    return list;
  }
  /**
   * Retrieves the ParameterObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParameterObject list.
   * @apilevel low-level
   */
  public JastAddList<ParameterObject> getParameterObjectListNoTransform() {
    return (JastAddList<ParameterObject>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the ParameterObject list without
   * triggering rewrites.
   */
  public ParameterObject getParameterObjectNoTransform(int i) {
    return (ParameterObject) getParameterObjectListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ParameterObject list.
   * @return The node representing the ParameterObject list.
   * @apilevel high-level
   */
  public JastAddList<ParameterObject> getParameterObjects() {
    return getParameterObjectList();
  }
  /**
   * Retrieves the ParameterObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParameterObject list.
   * @apilevel low-level
   */
  public JastAddList<ParameterObject> getParameterObjectsNoTransform() {
    return getParameterObjectListNoTransform();
  }
  /**
   * Replaces the optional node for the RequestBodyObject child. This is the <code>Opt</code>
   * node containing the child RequestBodyObject, not the actual child!
   * @param opt The new node to be used as the optional node for the RequestBodyObject child.
   * @apilevel low-level
   */
  public void setRequestBodyObjectOpt(Opt<RequestBodyObject> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) RequestBodyObject child.
   * @param node The new node to be used as the RequestBodyObject child.
   * @apilevel high-level
   */
  public void setRequestBodyObject(RequestBodyObject node) {
    getRequestBodyObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional RequestBodyObject child exists.
   * @return {@code true} if the optional RequestBodyObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasRequestBodyObject() {
    return getRequestBodyObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) RequestBodyObject child.
   * @return The RequestBodyObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public RequestBodyObject getRequestBodyObject() {
    return (RequestBodyObject) getRequestBodyObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the RequestBodyObject child. This is the <code>Opt</code> node containing the child RequestBodyObject, not the actual child!
   * @return The optional node for child the RequestBodyObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="RequestBodyObject")
  public Opt<RequestBodyObject> getRequestBodyObjectOpt() {
    return (Opt<RequestBodyObject>) getChild(3);
  }
  /**
   * Retrieves the optional node for child RequestBodyObject. This is the <code>Opt</code> node containing the child RequestBodyObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child RequestBodyObject.
   * @apilevel low-level
   */
  public Opt<RequestBodyObject> getRequestBodyObjectOptNoTransform() {
    return (Opt<RequestBodyObject>) getChildNoTransform(3);
  }
  /**
   * Replaces the ResponseTuple list.
   * @param list The new list node to be used as the ResponseTuple list.
   * @apilevel high-level
   */
  public void setResponseTupleList(JastAddList<ResponseTuple> list) {
    setChild(list, 4);
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
    JastAddList<ResponseTuple> list = (JastAddList<ResponseTuple>) getChild(4);
    return list;
  }
  /**
   * Retrieves the ResponseTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResponseTuple list.
   * @apilevel low-level
   */
  public JastAddList<ResponseTuple> getResponseTupleListNoTransform() {
    return (JastAddList<ResponseTuple>) getChildNoTransform(4);
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
   * Replaces the CallbackTuple list.
   * @param list The new list node to be used as the CallbackTuple list.
   * @apilevel high-level
   */
  public void setCallbackTupleList(JastAddList<CallbackTuple> list) {
    setChild(list, 5);
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
    JastAddList<CallbackTuple> list = (JastAddList<CallbackTuple>) getChild(5);
    return list;
  }
  /**
   * Retrieves the CallbackTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CallbackTuple list.
   * @apilevel low-level
   */
  public JastAddList<CallbackTuple> getCallbackTupleListNoTransform() {
    return (JastAddList<CallbackTuple>) getChildNoTransform(5);
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
   * Replaces the lexeme DeprecatedBoolean.
   * @param value The new value for the lexeme DeprecatedBoolean.
   * @apilevel high-level
   */
  public void setDeprecatedBoolean(Boolean value) {
    tokenBoolean_DeprecatedBoolean = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_DeprecatedBoolean;
  /**
   * Retrieves the value for the lexeme DeprecatedBoolean.
   * @return The value for the lexeme DeprecatedBoolean.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="DeprecatedBoolean")
  public Boolean getDeprecatedBoolean() {
    return tokenBoolean_DeprecatedBoolean;
  }
  /**
   * Replaces the SecurityRequirementObject list.
   * @param list The new list node to be used as the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public void setSecurityRequirementObjectList(JastAddList<SecurityRequirementObject> list) {
    setChild(list, 6);
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
    JastAddList<SecurityRequirementObject> list = (JastAddList<SecurityRequirementObject>) getChild(6);
    return list;
  }
  /**
   * Retrieves the SecurityRequirementObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecurityRequirementObject list.
   * @apilevel low-level
   */
  public JastAddList<SecurityRequirementObject> getSecurityRequirementObjectListNoTransform() {
    return (JastAddList<SecurityRequirementObject>) getChildNoTransform(6);
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
    setChild(list, 7);
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
    JastAddList<ServerObject> list = (JastAddList<ServerObject>) getChild(7);
    return list;
  }
  /**
   * Retrieves the ServerObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerObject list.
   * @apilevel low-level
   */
  public JastAddList<ServerObject> getServerObjectListNoTransform() {
    return (JastAddList<ServerObject>) getChildNoTransform(7);
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
   * Replaces the lexeme Required.
   * @param value The new value for the lexeme Required.
   * @apilevel high-level
   */
  public void setRequired(Boolean value) {
    tokenBoolean_Required = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_Required;
  /**
   * Retrieves the value for the lexeme Required.
   * @return The value for the lexeme Required.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Required")
  public Boolean getRequired() {
    return tokenBoolean_Required;
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
