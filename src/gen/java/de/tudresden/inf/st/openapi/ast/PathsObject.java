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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:36
 * @astdecl PathsObject : ASTNode ::= <Ref:String> PathItemObject;
 * @production PathsObject : {@link ASTNode} ::= <span class="component">&lt;Ref:String&gt;</span> <span class="component">{@link PathItemObject}</span>;

 */
public class PathsObject extends ASTNode<ASTNode> implements Cloneable {
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
    name = {"Ref", "PathItemObject"},
    type = {"String", "PathItemObject"},
    kind = {"Token", "Child"}
  )
  public PathsObject(String p0, PathItemObject p1) {
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
   * Replaces the PathItemObject child.
   * @param node The new node to replace the PathItemObject child.
   * @apilevel high-level
   */
  public void setPathItemObject(PathItemObject node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the PathItemObject child.
   * @return The current node used as the PathItemObject child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="PathItemObject")
  public PathItemObject getPathItemObject() {
    return (PathItemObject) getChild(0);
  }
  /**
   * Retrieves the PathItemObject child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the PathItemObject child.
   * @apilevel low-level
   */
  public PathItemObject getPathItemObjectNoTransform() {
    return (PathItemObject) getChildNoTransform(0);
  }
  /**
   * @attribute inh
   * @aspect InferParameter
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:25
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="InferParameter", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:25")
  public Set<String> inferUrl(Set<String> urls) {
    Object _parameters = urls;
    if (inferUrl_Set_String__visited == null) inferUrl_Set_String__visited = new java.util.HashSet(4);
    if (inferUrl_Set_String__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute PathsObject.inferUrl(Set_String_).");
    }
    inferUrl_Set_String__visited.add(_parameters);
    Set<String> inferUrl_Set_String__value = getParent().Define_inferUrl(this, null, urls);
    inferUrl_Set_String__visited.remove(_parameters);
    return inferUrl_Set_String__value;
  }
/** @apilevel internal */
protected java.util.Set inferUrl_Set_String__visited;
  /**
   * @attribute inh
   * @aspect RandomRequestGenerator
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:58
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="RandomRequestGenerator", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:58")
  public boolean generateUrl() {
    if (generateUrl_visited) {
      throw new RuntimeException("Circular definition of attribute PathsObject.generateUrl().");
    }
    generateUrl_visited = true;
    boolean generateUrl_value = getParent().Define_generateUrl(this, null);
    generateUrl_visited = false;
    return generateUrl_value;
  }
/** @apilevel internal */
protected boolean generateUrl_visited = false;
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
