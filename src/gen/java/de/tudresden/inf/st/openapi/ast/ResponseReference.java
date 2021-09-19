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
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:78
 * @astdecl ResponseReference : ResponseOb ::= <Ref:String> <ResponseOb:ResponseOb>;
 * @production ResponseReference : {@link ResponseOb} ::= <span class="component">&lt;Ref:String&gt;</span> <span class="component">&lt;ResponseOb:ResponseOb&gt;</span>;

 */
public class ResponseReference extends ResponseOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ResponseReference() {
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
    name = {"Ref", "ResponseOb"},
    type = {"String", "ResponseOb"},
    kind = {"Token", "Token"}
  )
  public ResponseReference(String p0, ResponseOb p1) {
    setRef(p0);
    setResponseOb(p1);
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
  public ResponseReference clone() throws CloneNotSupportedException {
    ResponseReference node = (ResponseReference) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public ResponseReference copy() {
    try {
      ResponseReference node = (ResponseReference) clone();
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
  public ResponseReference fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public ResponseReference treeCopyNoTransform() {
    ResponseReference tree = (ResponseReference) copy();
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
  public ResponseReference treeCopy() {
    ResponseReference tree = (ResponseReference) copy();
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
    return super.is$Equal(node) && (tokenString_Ref == ((ResponseReference) node).tokenString_Ref) && (tokenResponseOb_ResponseOb == ((ResponseReference) node).tokenResponseOb_ResponseOb);    
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
   * Replaces the lexeme ResponseOb.
   * @param value The new value for the lexeme ResponseOb.
   * @apilevel high-level
   */
  public void setResponseOb(ResponseOb value) {
    tokenResponseOb_ResponseOb = value;
  }
  /** @apilevel internal 
   */
  protected ResponseOb tokenResponseOb_ResponseOb;
  /**
   * Retrieves the value for the lexeme ResponseOb.
   * @return The value for the lexeme ResponseOb.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ResponseOb")
  public ResponseOb getResponseOb() {
    return tokenResponseOb_ResponseOb;
  }
/** @apilevel internal */
protected java.util.Set composeResponse_ResponseOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:520
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:520")
  public Response composeResponse(ResponseOb responseOb, Map<Object, ASTNode> map) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(responseOb);
    _parameters.add(map);
    if (composeResponse_ResponseOb_Map_Object__ASTNode__visited == null) composeResponse_ResponseOb_Map_Object__ASTNode__visited = new java.util.HashSet(4);
    if (composeResponse_ResponseOb_Map_Object__ASTNode__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute ResponseOb.composeResponse(ResponseOb,Map_Object__ASTNode_).");
    }
    composeResponse_ResponseOb_Map_Object__ASTNode__visited.add(_parameters);
    try {
            Response response = new Response();
            ResponseReference r = (ResponseReference) responseOb;
    
            if( !r.getRef().isEmpty() )
            response.setRef(r.getRef());
    
            return response;
            }
    finally {
      composeResponse_ResponseOb_Map_Object__ASTNode__visited.remove(_parameters);
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
