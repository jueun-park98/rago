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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:45
 * @astdecl Get : OperationOb ::= <OperationObject:OperationObject>;
 * @production Get : {@link OperationOb} ::= <span class="component">&lt;OperationObject:OperationObject&gt;</span>;

 */
public class Get extends OperationOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Get() {
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
  }
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"OperationObject"},
    type = {"OperationObject"},
    kind = {"Token"}
  )
  public Get(OperationObject p0) {
    setOperationObject(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public Get clone() throws CloneNotSupportedException {
    Get node = (Get) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public Get copy() {
    try {
      Get node = (Get) clone();
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
   * @declaredat ASTNode:63
   */
  @Deprecated
  public Get fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public Get treeCopyNoTransform() {
    Get tree = (Get) copy();
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
   * @declaredat ASTNode:93
   */
  public Get treeCopy() {
    Get tree = (Get) copy();
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
   * @declaredat ASTNode:107
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenOperationObject_OperationObject == ((Get) node).tokenOperationObject_OperationObject);    
  }
  /**
   * Replaces the lexeme OperationObject.
   * @param value The new value for the lexeme OperationObject.
   * @apilevel high-level
   */
  public void setOperationObject(OperationObject value) {
    tokenOperationObject_OperationObject = value;
  }
  /** @apilevel internal 
   */
  protected OperationObject tokenOperationObject_OperationObject;
  /**
   * Retrieves the value for the lexeme OperationObject.
   * @return The value for the lexeme OperationObject.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="OperationObject")
  public OperationObject getOperationObject() {
    return tokenOperationObject_OperationObject;
  }
/** @apilevel internal */
protected java.util.Set inferRandomUrl_String_OperationObject_visited;
  /**
   * @attribute syn
   * @aspect InfSchema
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InfSchema.jrag:33
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="InfSchema", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InfSchema.jrag:33")
  public String inferRandomUrl(String pathRef, OperationObject operationObject) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(pathRef);
    _parameters.add(operationObject);
    if (inferRandomUrl_String_OperationObject_visited == null) inferRandomUrl_String_OperationObject_visited = new java.util.HashSet(4);
    if (inferRandomUrl_String_OperationObject_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute OperationOb.inferRandomUrl(String,OperationObject).");
    }
    inferRandomUrl_String_OperationObject_visited.add(_parameters);
    try {
    
            return "";
        }
    finally {
      inferRandomUrl_String_OperationObject_visited.remove(_parameters);
    }
  }
/** @apilevel internal */
protected java.util.Set generateRandomUrl_String_OperationObject_Map_ResponseObject__String__visited;
  /**
   * @attribute syn
   * @aspect RandomRequestGenerator
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:97
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="RandomRequestGenerator", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:97")
  public String generateRandomUrl(String pathRef, OperationObject operationObject, Map<ResponseObject, String> responses) {
    java.util.List _parameters = new java.util.ArrayList(3);
    _parameters.add(pathRef);
    _parameters.add(operationObject);
    _parameters.add(responses);
    if (generateRandomUrl_String_OperationObject_Map_ResponseObject__String__visited == null) generateRandomUrl_String_OperationObject_Map_ResponseObject__String__visited = new java.util.HashSet(4);
    if (generateRandomUrl_String_OperationObject_Map_ResponseObject__String__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute OperationOb.generateRandomUrl(String,OperationObject,Map_ResponseObject__String_).");
    }
    generateRandomUrl_String_OperationObject_Map_ResponseObject__String__visited.add(_parameters);
    try {
            try {
            Random rand = new Random();
    
            for( ParameterOb o : operationObject.getParameterObs() ){
            ParameterObject p = o.parameterObject();
            SchemaObject s = p.getSchemaOb().schemaObject();
            if( p.getIn().equals("path") ){
            String pathPart = pathRef.substring(pathRef.indexOf("{") ,pathRef.indexOf("}") + 1);
    
            if( s.getType().equals("string") )
            pathRef = pathRef.replace(pathPart, operationObject.generateRandomString(rand, s.getEnumObjs()));
            else if( s.getType().equals("integer") )
            pathRef = pathRef.replace(pathPart, operationObject.generateRandomInt( rand,
            -1, // s.getMinimum() != null ? s.getMinimum().intValue() : -1,
            10 // s.getMaximum() != null ? s.getMaximum().intValue() : -1
            ));
            }
            else if( p.getIn().equals("query") ){
    
            if( s.getType().equals("string") )
            pathRef = pathRef + "&" + p.getName() + "=" + operationObject.generateRandomString(rand, s.getEnumObjs());
            else if( s.getType().equals("integer") )
            pathRef = pathRef + "&" + p.getName() + "=" + operationObject.generateRandomInt(  rand,
            -1, // s.getMinimum() != null ? s.getMinimum().intValue() : -1,
            10); // s.getMaximum() != null ? s.getMaximum().intValue() : -1
            else if( s.getType().equals("array") ){
            if( s.getItemsSchema().getSchemaOb().schemaObject().getType().equals("string") ){
            for( EnumObj e : s.getItemsSchema().getSchemaOb().schemaObject().getEnumObjs() )
            pathRef=rand.nextDouble()< 0.5?pathRef+"&"+p.getName()+"="+e.getEnumOb():pathRef;
            }
            else if( s.getItemsSchema().getSchemaOb().schemaObject().getType().equals("integer") ){
            for( int i = 0 ; i < 5 ; i++ )
            pathRef = pathRef + "&" + p.getName() + "=" + operationObject.generateRandomInt(  rand,
            -1, // s.getMinimum() != null ? s.getMinimum().intValue() : -1,
            10); // s.getMaximum() != null ? s.getMaximum().intValue() : -1
            }
    
            }
            }
            }
            pathRef = pathRef.replaceFirst("&", "?") ;
            System.out.println("Generated path : " + pathRef);
    
            URL url = new URL(pathRef);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
    
            con.setRequestMethod("GET"); // optional default is GET
    
            int responseCode = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
    
            while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
            }
            in.close();
    
            // print result
            System.out.println("HTTP status code (GET) : " + responseCode);
            for( ResponseTuple t : operationObject.getResponseTuples() ){
            if( t.getKey().equals("200") && responseCode == 200 ) {
            System.out.println("Response successfully saved!");
            responses.put(t.getResponseOb().responseObject(), response.toString());
            }
            }
            return pathRef;
            }catch (Exception e) {
            return "";
            }
            }
    finally {
      generateRandomUrl_String_OperationObject_Map_ResponseObject__String__visited.remove(_parameters);
    }
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
