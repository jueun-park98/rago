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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:64
 * @astdecl RequestBodyReference : RequestBodyOb ::= <Ref:String>;
 * @production RequestBodyReference : {@link RequestBodyOb} ::= <span class="component">&lt;Ref:String&gt;</span>;

 */
public class RequestBodyReference extends RequestBodyOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public RequestBodyReference() {
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
    name = {"Ref"},
    type = {"String"},
    kind = {"Token"}
  )
  public RequestBodyReference(String p0) {
    setRef(p0);
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
  public RequestBodyReference clone() throws CloneNotSupportedException {
    RequestBodyReference node = (RequestBodyReference) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public RequestBodyReference copy() {
    try {
      RequestBodyReference node = (RequestBodyReference) clone();
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
  public RequestBodyReference fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public RequestBodyReference treeCopyNoTransform() {
    RequestBodyReference tree = (RequestBodyReference) copy();
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
  public RequestBodyReference treeCopy() {
    RequestBodyReference tree = (RequestBodyReference) copy();
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
    return super.is$Equal(node) && (tokenString_Ref == ((RequestBodyReference) node).tokenString_Ref);    
  }
  /**
   * Replaces the lexeme Ref.
   * @param value The new value for the lexeme Ref.
   * @apilevel high-level
   */
  public void setRef(String value) {
    tokenString_Ref = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Ref;
  /**
   * Retrieves the value for the lexeme Ref.
   * @return The value for the lexeme Ref.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Ref")
  public String getRef() {
    return tokenString_Ref != null ? tokenString_Ref : "";
  }
/** @apilevel internal */
protected java.util.Set composeRequestBody_RequestBodyOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:430
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:430")
  public RequestBody composeRequestBody(RequestBodyOb requestBodyOb, Map<Object, ASTNode> map) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(requestBodyOb);
    _parameters.add(map);
    if (composeRequestBody_RequestBodyOb_Map_Object__ASTNode__visited == null) composeRequestBody_RequestBodyOb_Map_Object__ASTNode__visited = new java.util.HashSet(4);
    if (composeRequestBody_RequestBodyOb_Map_Object__ASTNode__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute RequestBodyOb.composeRequestBody(RequestBodyOb,Map_Object__ASTNode_).");
    }
    composeRequestBody_RequestBodyOb_Map_Object__ASTNode__visited.add(_parameters);
    try {
            RequestBody requestBody = new RequestBody();
            RequestBodyReference r = (RequestBodyReference) requestBodyOb;
    
            if( !r.getRef().isEmpty() )
            requestBody.setRef(r.getRef());
    
            return requestBody;
            }
    finally {
      composeRequestBody_RequestBodyOb_Map_Object__ASTNode__visited.remove(_parameters);
    }
  }
/** @apilevel internal */
protected boolean requestBodyObject_visited = false;
  /**
   * @attribute syn
   * @aspect Reference
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Reference.jrag:23
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Reference", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Reference.jrag:23")
  public RequestBodyObject requestBodyObject() {
    if (requestBodyObject_visited) {
      throw new RuntimeException("Circular definition of attribute RequestBodyOb.requestBodyObject().");
    }
    requestBodyObject_visited = true;
    try {
            for( RequestBodyTuple t : root().requestBodyTuples() ){
            if( t.getKey().equals(getRef().substring(getRef().lastIndexOf("/")+1, getRef().length())) )
            return t.getRequestBodyOb().requestBodyObject();
            }
            return new RequestBodyObject();
        }
    finally {
      requestBodyObject_visited = false;
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
