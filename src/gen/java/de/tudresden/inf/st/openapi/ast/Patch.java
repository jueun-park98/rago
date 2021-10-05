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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:51
 * @astdecl Patch : OperationOb ::= <OperationObject:OperationObject>;
 * @production Patch : {@link OperationOb} ::= <span class="component">&lt;OperationObject:OperationObject&gt;</span>;

 */
public class Patch extends OperationOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Patch() {
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
  public Patch(OperationObject p0) {
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
  public Patch clone() throws CloneNotSupportedException {
    Patch node = (Patch) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public Patch copy() {
    try {
      Patch node = (Patch) clone();
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
  public Patch fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public Patch treeCopyNoTransform() {
    Patch tree = (Patch) copy();
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
  public Patch treeCopy() {
    Patch tree = (Patch) copy();
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
    return super.is$Equal(node) && (tokenOperationObject_OperationObject == ((Patch) node).tokenOperationObject_OperationObject);    
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
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:119
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="RandomRequestGenerator", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:119")
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
            return "";
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
