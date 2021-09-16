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
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.util.Random;
import java.util.stream.IntStream;
/**
 * @ast node
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:35
 * @astdecl PathsObject : ASTNode ::= <Ref:String> PathItem;
 * @production PathsObject : {@link ASTNode} ::= <span class="component">&lt;Ref:String&gt;</span> <span class="component">{@link PathItem}</span>;

 */
public class PathsObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect RandomRequestGenerator
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/RandomRequestGenerator.jadd:40
   */
  public void sendRandomRequests(String baseUrl) throws Exception {
        if( this.getPathItem().hasGet() ){
        IntStream.range(0, 1).forEach( i -> {
        try {
        this.getPathItem().getGet().getOperationObject().sendRandomGET(baseUrl+this.getRef());
        } catch (Exception e) {
        e.printStackTrace();
        }
        });
        }
        if( this.getPathItem().hasPost() ){
        IntStream.range(0, 1).forEach( i -> {
        try {
        this.getPathItem().getPost().getOperationObject().sendRandomPOST(baseUrl+this.getRef());
        } catch (Exception e) {
        e.printStackTrace();
        }
        });}
    }
  /**
   * @declaredat ASTNode:1
   */
  public PathsObject() {
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
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Ref", "PathItem"},
    type = {"String", "PathItem"},
    kind = {"Token", "Child"}
  )
  public PathsObject(String p0, PathItem p1) {
    setRef(p0);
    setChild(p1, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:29
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public PathsObject clone() throws CloneNotSupportedException {
    PathsObject node = (PathsObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public PathsObject copy() {
    try {
      PathsObject node = (PathsObject) clone();
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
   * @declaredat ASTNode:65
   */
  @Deprecated
  public PathsObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public PathsObject treeCopyNoTransform() {
    PathsObject tree = (PathsObject) copy();
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
   * @declaredat ASTNode:95
   */
  public PathsObject treeCopy() {
    PathsObject tree = (PathsObject) copy();
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
   * @declaredat ASTNode:109
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Ref == ((PathsObject) node).tokenString_Ref);    
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
   * Replaces the PathItem child.
   * @param node The new node to replace the PathItem child.
   * @apilevel high-level
   */
  public void setPathItem(PathItem node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the PathItem child.
   * @return The current node used as the PathItem child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="PathItem")
  public PathItem getPathItem() {
    return (PathItem) getChild(0);
  }
  /**
   * Retrieves the PathItem child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the PathItem child.
   * @apilevel low-level
   */
  public PathItem getPathItemNoTransform() {
    return (PathItem) getChildNoTransform(0);
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
