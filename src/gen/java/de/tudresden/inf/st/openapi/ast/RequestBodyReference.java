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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:66
 * @astdecl RequestBodyReference : RequestBodyOb ::= <Ref:String> <RequestBodyOb:RequestBodyOb>;
 * @production RequestBodyReference : {@link RequestBodyOb} ::= <span class="component">&lt;Ref:String&gt;</span> <span class="component">&lt;RequestBodyOb:RequestBodyOb&gt;</span>;

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
    name = {"Ref", "RequestBodyOb"},
    type = {"String", "RequestBodyOb"},
    kind = {"Token", "Token"}
  )
  public RequestBodyReference(String p0, RequestBodyOb p1) {
    setRef(p0);
    setRequestBodyOb(p1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public RequestBodyReference clone() throws CloneNotSupportedException {
    RequestBodyReference node = (RequestBodyReference) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
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
   * @declaredat ASTNode:64
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
   * @declaredat ASTNode:74
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
   * @declaredat ASTNode:94
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
   * @declaredat ASTNode:108
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Ref == ((RequestBodyReference) node).tokenString_Ref) && (tokenRequestBodyOb_RequestBodyOb == ((RequestBodyReference) node).tokenRequestBodyOb_RequestBodyOb);    
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
  /**
   * Replaces the lexeme RequestBodyOb.
   * @param value The new value for the lexeme RequestBodyOb.
   * @apilevel high-level
   */
  public void setRequestBodyOb(RequestBodyOb value) {
    tokenRequestBodyOb_RequestBodyOb = value;
  }
  /** @apilevel internal 
   */
  protected RequestBodyOb tokenRequestBodyOb_RequestBodyOb;
  /**
   * Retrieves the value for the lexeme RequestBodyOb.
   * @return The value for the lexeme RequestBodyOb.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="RequestBodyOb")
  public RequestBodyOb getRequestBodyOb() {
    return tokenRequestBodyOb_RequestBodyOb;
  }
/** @apilevel internal */
protected java.util.Set composeRequestBody_RequestBodyOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:440
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:440")
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
   * @aspect RefGet
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RefGet.jrag:30
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="RefGet", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RefGet.jrag:30")
  public RequestBodyObject requestBodyObject() {
    if (requestBodyObject_visited) {
      throw new RuntimeException("Circular definition of attribute RequestBodyOb.requestBodyObject().");
    }
    requestBodyObject_visited = true;
    try {
        if( getRequestBodyOb() instanceof RequestBodyObject )
        return (RequestBodyObject) getRequestBodyOb();
        else
        return getRequestBodyOb().requestBodyObject();
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
