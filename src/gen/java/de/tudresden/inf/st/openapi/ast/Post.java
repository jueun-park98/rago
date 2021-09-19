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
/**
 * @ast node
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:47
 * @astdecl Post : OperationOb ::= <OperationObject:OperationObject>;
 * @production Post : {@link OperationOb} ::= <span class="component">&lt;OperationObject:OperationObject&gt;</span>;

 */
public class Post extends OperationOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Post() {
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
  public Post(OperationObject p0) {
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
  public Post clone() throws CloneNotSupportedException {
    Post node = (Post) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public Post copy() {
    try {
      Post node = (Post) clone();
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
  public Post fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public Post treeCopyNoTransform() {
    Post tree = (Post) copy();
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
  public Post treeCopy() {
    Post tree = (Post) copy();
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
    return super.is$Equal(node) && (tokenOperationObject_OperationObject == ((Post) node).tokenOperationObject_OperationObject);    
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
protected java.util.Set generateRandomUrl_String_OperationObject_visited;
  /**
   * @attribute syn
   * @aspect RandomRequestGenerator
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/RandomRequestGenerator.jrag:56
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="RandomRequestGenerator", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/RandomRequestGenerator.jrag:56")
  public String generateRandomUrl(String pathRef, OperationObject operationObject) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(pathRef);
    _parameters.add(operationObject);
    if (generateRandomUrl_String_OperationObject_visited == null) generateRandomUrl_String_OperationObject_visited = new java.util.HashSet(4);
    if (generateRandomUrl_String_OperationObject_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute OperationOb.generateRandomUrl(String,OperationObject).");
    }
    generateRandomUrl_String_OperationObject_visited.add(_parameters);
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
            pathRef = pathRef.replaceFirst("&", "?");
            System.out.println(pathRef);
    
                /*
                URL url = new URL(pathRef);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
    
                con.setRequestMethod("POST"); // HTTP POST
                con.setDoOutput(true); // POST
    
                int responseCode = con.getResponseCode();
    
                // print result
                System.out.println("HTTP status code (POST) : " + responseCode);*/
            return pathRef;
            }
    finally {
      generateRandomUrl_String_OperationObject_visited.remove(_parameters);
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
