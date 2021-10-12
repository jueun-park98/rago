/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.util.Random;
import java.util.stream.IntStream;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.core.model.reference.Reference;
import org.openapi4j.core.model.OAIContext;
import java.io.IOException;
import java.util.*;
import org.openapi4j.core.exception.DecodeException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
/**
 * @ast node
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:42
 * @astdecl OperationObject : ASTNode ::= Tag* <Summary:String> <Description:String> [ExternalDocObject] <OperationID:String> ParameterOb* [RequestBodyOb] ResponseTuple* CallbackTuple* <DeprecatedBoolean:Boolean> SecurityRequirementObject* ServerObject* <Required:Boolean> Extension*;
 * @production OperationObject : {@link ASTNode} ::= <span class="component">{@link Tag}*</span> <span class="component">&lt;Summary:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">[{@link ExternalDocObject}]</span> <span class="component">&lt;OperationID:String&gt;</span> <span class="component">{@link ParameterOb}*</span> <span class="component">[{@link RequestBodyOb}]</span> <span class="component">{@link ResponseTuple}*</span> <span class="component">{@link CallbackTuple}*</span> <span class="component">&lt;DeprecatedBoolean:Boolean&gt;</span> <span class="component">{@link SecurityRequirementObject}*</span> <span class="component">{@link ServerObject}*</span> <span class="component">&lt;Required:Boolean&gt;</span> <span class="component">{@link Extension}*</span>;

 */
public class OperationObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect RandomRequestGenerator
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/RandomRequestGenerator.jrag:191
   */
  public String generateRandomString(Random rand,JastAddList<EnumObj> objs){
        if(objs.getNumChild()!=0)
        return objs.getChild(rand.nextInt(objs.getNumChild())).getEnumOb().toString();

        return rand
        .ints(97,123)
        .limit(10)
        .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append)
        .toString();
        }
  /**
   * @aspect RandomRequestGenerator
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/RandomRequestGenerator.jrag:202
   */
  public String generateRandomInt(Random rand,int minimum,int maximum){
        if(minimum>-1&&maximum>0)
        return String.valueOf(rand.nextInt(minimum+maximum)-minimum);
        else if(minimum>-1)
        return String.valueOf(rand.nextInt()+minimum);
        else if(maximum>0)
        return String.valueOf(rand.nextInt(maximum));
        return String.valueOf(rand.nextInt());
        }
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:302
   */
  public static Operation composeOperation (OperationObject operationObject, Map<Object, ASTNode> map){
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
        operation.setExternalDocs( ExternalDocObject.composeExternalDocs(operationObject.getExternalDocObject(), map) );
        if( !operationObject.getOperationID().isEmpty() )
        operation.setOperationId( operationObject.getOperationID() );
        if( operationObject.getNumParameterOb() != 0 ){
        for( ParameterOb p : operationObject.getParameterObs() )
        operation.addParameter(p.composeParameter(p, map));
        }
        if( operationObject.hasRequestBodyOb() )
        operation.setRequestBody(operationObject.getRequestBodyOb().composeRequestBody(operationObject.getRequestBodyOb(), map));
        if( operationObject.getNumResponseTuple() != 0){
        Map<String, Response> responseMap = new HashMap<>();
        for( ResponseTuple t : operationObject.getResponseTuples() )
        responseMap.put(t.getKey(), t.getResponseOb().composeResponse(t.getResponseOb(), map));
        operation.setResponses(responseMap);
        }
        if( operationObject.getNumCallbackTuple() != 0 ){
        Map<String, Callback> callbacks = new HashMap<>();
        for( CallbackTuple t : operationObject.getCallbackTuples() )
        callbacks.put(t.getKey(), t.getCallbackOb().composeCallback(t.getCallbackOb(), map));
        operation.setCallbacks(callbacks);
        }
        if( operationObject.getDeprecatedBoolean() != null )
        operation.setDeprecated(operationObject.getDeprecatedBoolean());
        if( operationObject.getSecurityRequirementObjects() != null ){
        for( SecurityRequirementObject s : operationObject.getSecurityRequirementObjects() )
        operation.addSecurityRequirement( SecurityRequirementObject.composeSecurityRequirement(s, map) );
        }
        if( operationObject.getNumServerObject() != 0 ){
        for( ServerObject s : operationObject.getServerObjects() )
        operation.addServer( ServerObject.composeServer(s, map) );
        }
        if( operationObject.getNumExtension() != 0 ){
        Map<String, Object> extensionMap = new HashMap<>();
        for( Extension e : operationObject.getExtensions() )
        extensionMap.put(e.getKey(), e.getValue());
        operation.setExtensions(extensionMap);
        }

        return operation;
        }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:289
   */
  public static OperationObject parseOperation(Operation operation, OAIContext context, Map<Object, ASTNode> map) throws DecodeException{
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
        operationObject.setExternalDocObject(ExternalDocObject.parseExternalDocs(operation.getExternalDocs(), map));
        if( operation.getOperationId() != null )
        operationObject.setOperationID( operation.getOperationId() );
        if( operation.getParameters() != null ){
        for( Parameter p : operation.getParameters() )
        operationObject.addParameterOb(ParameterOb.parseParameter(p, context, map));
        }
        if( operation.getRequestBody() != null )
        operationObject.setRequestBodyOb( RequestBodyOb.parseRequestBody( operation.getRequestBody(), context, map) );
        if( operation.getResponses() != null ){
        for( String key : operation.getResponses().keySet())
        operationObject.addResponseTuple(new ResponseTuple(key, ResponseObject.parseResponse(operation.getResponse(key), context, map)));
        }
        if( operation.getCallbacks() != null ){
        for( String key : operation.getCallbacks().keySet() )
        operationObject.addCallbackTuple(new CallbackTuple(key, CallbackObject.parseCallback(operation.getCallback(key), context, map)));
        }
        if( operation.getSecurityRequirements() != null ){
        for( SecurityRequirement s : operation.getSecurityRequirements() )
        operationObject.addSecurityRequirementObject(SecurityRequirementObject.parseSecurityRequirement(s, map));
        }
        if( operation.getServers() != null ){
        for( Server s : operation.getServers() )
        operationObject.addServerObject(ServerObject.parseServer(s, map));
        }
        if( operation.getExtensions() != null ) {
        for( String key : operation.getExtensions().keySet() )
        operationObject.addExtension(new Extension(key, operation.getExtensions().get(key)));
        }

        map.put(operation, operationObject);
        return operationObject;
        }
  /**
   * @aspect InferParameter
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:126
   */
  public void writeDictionary(SchemaOb schema,String resp)throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        JsonNode respNode = mapper.readTree(resp);
        String value;

        if (schema instanceof SchemaReference) {
        for (PropertyItem p : schema.schemaObject().getPropertyItems()) {
        String infName = p.writePropertyName(schema, p);
        value = p.writePropertyValue(respNode, p);

        root().addInferredParameter(new InferredParameter(infName + "?" + value));
        root().addInferredParameter(new InferredParameter(p.getName() + "?" + value));
        }
        } else {
        for (PropertyItem p : schema.schemaObject().getPropertyItems()) {
        value = p.writePropertyValue(respNode, p);

        root().addInferredParameter(new InferredParameter(p.getName() + "?" + respNode.get(p.getName()).textValue()));
        }
        }

        }
  /**
   * @aspect InferParameter
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:149
   */
  public void writeDictionaryWithArray(SchemaOb schema,String resp)throws Exception{
        ObjectMapper mapper=new ObjectMapper();
        ArrayNode respNode=((ArrayNode)mapper.readTree(resp));
        Iterator<JsonNode> props=respNode.elements();

        while(props.hasNext())
        writeDictionary(schema.schemaObject().getItemsSchema().getSchemaOb(),props.next().toString());

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
    setChild(new JastAddList(), 4);
    setChild(new JastAddList(), 5);
    setChild(new JastAddList(), 6);
    setChild(new JastAddList(), 7);
    setChild(new JastAddList(), 8);
  }
  /**
   * @declaredat ASTNode:22
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Tag", "Summary", "Description", "ExternalDocObject", "OperationID", "ParameterOb", "RequestBodyOb", "ResponseTuple", "CallbackTuple", "DeprecatedBoolean", "SecurityRequirementObject", "ServerObject", "Required", "Extension"},
    type = {"JastAddList<Tag>", "String", "String", "Opt<ExternalDocObject>", "String", "JastAddList<ParameterOb>", "Opt<RequestBodyOb>", "JastAddList<ResponseTuple>", "JastAddList<CallbackTuple>", "Boolean", "JastAddList<SecurityRequirementObject>", "JastAddList<ServerObject>", "Boolean", "JastAddList<Extension>"},
    kind = {"List", "Token", "Token", "Opt", "Token", "List", "Opt", "List", "List", "Token", "List", "List", "Token", "List"}
  )
  public OperationObject(JastAddList<Tag> p0, String p1, String p2, Opt<ExternalDocObject> p3, String p4, JastAddList<ParameterOb> p5, Opt<RequestBodyOb> p6, JastAddList<ResponseTuple> p7, JastAddList<CallbackTuple> p8, Boolean p9, JastAddList<SecurityRequirementObject> p10, JastAddList<ServerObject> p11, Boolean p12, JastAddList<Extension> p13) {
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
    setChild(p13, 8);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:44
   */
  protected int numChildren() {
    return 9;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:50
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:54
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:58
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:62
   */
  public OperationObject clone() throws CloneNotSupportedException {
    OperationObject node = (OperationObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:67
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
   * @declaredat ASTNode:86
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
   * @declaredat ASTNode:96
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
   * @declaredat ASTNode:116
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
   * @declaredat ASTNode:130
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
   * Replaces the ParameterOb list.
   * @param list The new list node to be used as the ParameterOb list.
   * @apilevel high-level
   */
  public void setParameterObList(JastAddList<ParameterOb> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the ParameterOb list.
   * @return Number of children in the ParameterOb list.
   * @apilevel high-level
   */
  public int getNumParameterOb() {
    return getParameterObList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ParameterOb list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ParameterOb list.
   * @apilevel low-level
   */
  public int getNumParameterObNoTransform() {
    return getParameterObListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ParameterOb list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ParameterOb list.
   * @apilevel high-level
   */
  public ParameterOb getParameterOb(int i) {
    return (ParameterOb) getParameterObList().getChild(i);
  }
  /**
   * Check whether the ParameterOb list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParameterOb() {
    return getParameterObList().getNumChild() != 0;
  }
  /**
   * Append an element to the ParameterOb list.
   * @param node The element to append to the ParameterOb list.
   * @apilevel high-level
   */
  public void addParameterOb(ParameterOb node) {
    JastAddList<ParameterOb> list = (parent == null) ? getParameterObListNoTransform() : getParameterObList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addParameterObNoTransform(ParameterOb node) {
    JastAddList<ParameterOb> list = getParameterObListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ParameterOb list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParameterOb(ParameterOb node, int i) {
    JastAddList<ParameterOb> list = getParameterObList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ParameterOb list.
   * @return The node representing the ParameterOb list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ParameterOb")
  public JastAddList<ParameterOb> getParameterObList() {
    JastAddList<ParameterOb> list = (JastAddList<ParameterOb>) getChild(2);
    return list;
  }
  /**
   * Retrieves the ParameterOb list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParameterOb list.
   * @apilevel low-level
   */
  public JastAddList<ParameterOb> getParameterObListNoTransform() {
    return (JastAddList<ParameterOb>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the ParameterOb list without
   * triggering rewrites.
   */
  public ParameterOb getParameterObNoTransform(int i) {
    return (ParameterOb) getParameterObListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ParameterOb list.
   * @return The node representing the ParameterOb list.
   * @apilevel high-level
   */
  public JastAddList<ParameterOb> getParameterObs() {
    return getParameterObList();
  }
  /**
   * Retrieves the ParameterOb list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParameterOb list.
   * @apilevel low-level
   */
  public JastAddList<ParameterOb> getParameterObsNoTransform() {
    return getParameterObListNoTransform();
  }
  /**
   * Replaces the optional node for the RequestBodyOb child. This is the <code>Opt</code>
   * node containing the child RequestBodyOb, not the actual child!
   * @param opt The new node to be used as the optional node for the RequestBodyOb child.
   * @apilevel low-level
   */
  public void setRequestBodyObOpt(Opt<RequestBodyOb> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) RequestBodyOb child.
   * @param node The new node to be used as the RequestBodyOb child.
   * @apilevel high-level
   */
  public void setRequestBodyOb(RequestBodyOb node) {
    getRequestBodyObOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional RequestBodyOb child exists.
   * @return {@code true} if the optional RequestBodyOb child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasRequestBodyOb() {
    return getRequestBodyObOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) RequestBodyOb child.
   * @return The RequestBodyOb child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public RequestBodyOb getRequestBodyOb() {
    return (RequestBodyOb) getRequestBodyObOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the RequestBodyOb child. This is the <code>Opt</code> node containing the child RequestBodyOb, not the actual child!
   * @return The optional node for child the RequestBodyOb child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="RequestBodyOb")
  public Opt<RequestBodyOb> getRequestBodyObOpt() {
    return (Opt<RequestBodyOb>) getChild(3);
  }
  /**
   * Retrieves the optional node for child RequestBodyOb. This is the <code>Opt</code> node containing the child RequestBodyOb, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child RequestBodyOb.
   * @apilevel low-level
   */
  public Opt<RequestBodyOb> getRequestBodyObOptNoTransform() {
    return (Opt<RequestBodyOb>) getChildNoTransform(3);
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
  /**
   * Replaces the Extension list.
   * @param list The new list node to be used as the Extension list.
   * @apilevel high-level
   */
  public void setExtensionList(JastAddList<Extension> list) {
    setChild(list, 8);
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
    JastAddList<Extension> list = (JastAddList<Extension>) getChild(8);
    return list;
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionListNoTransform() {
    return (JastAddList<Extension>) getChildNoTransform(8);
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
