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
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:29
 * @astdecl SecuritySchemeTuple : ASTNode ::= <Key:String> SecuritySchemeOb;
 * @production SecuritySchemeTuple : {@link ASTNode} ::= <span class="component">&lt;Key:String&gt;</span> <span class="component">{@link SecuritySchemeOb}</span>;

 */
public class SecuritySchemeTuple extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public SecuritySchemeTuple() {
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
    name = {"Key", "SecuritySchemeOb"},
    type = {"String", "SecuritySchemeOb"},
    kind = {"Token", "Child"}
  )
  public SecuritySchemeTuple(String p0, SecuritySchemeOb p1) {
    setKey(p0);
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
  public SecuritySchemeTuple clone() throws CloneNotSupportedException {
    SecuritySchemeTuple node = (SecuritySchemeTuple) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public SecuritySchemeTuple copy() {
    try {
      SecuritySchemeTuple node = (SecuritySchemeTuple) clone();
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
  public SecuritySchemeTuple fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public SecuritySchemeTuple treeCopyNoTransform() {
    SecuritySchemeTuple tree = (SecuritySchemeTuple) copy();
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
  public SecuritySchemeTuple treeCopy() {
    SecuritySchemeTuple tree = (SecuritySchemeTuple) copy();
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
    return super.is$Equal(node) && (tokenString_Key == ((SecuritySchemeTuple) node).tokenString_Key);    
  }
  /**
   * Replaces the lexeme Key.
   * @param value The new value for the lexeme Key.
   * @apilevel high-level
   */
  public void setKey(String value) {
    tokenString_Key = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Key;
  /**
   * Retrieves the value for the lexeme Key.
   * @return The value for the lexeme Key.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Key")
  public String getKey() {
    return tokenString_Key != null ? tokenString_Key : "";
  }
  /**
   * Replaces the SecuritySchemeOb child.
   * @param node The new node to replace the SecuritySchemeOb child.
   * @apilevel high-level
   */
  public void setSecuritySchemeOb(SecuritySchemeOb node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the SecuritySchemeOb child.
   * @return The current node used as the SecuritySchemeOb child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="SecuritySchemeOb")
  public SecuritySchemeOb getSecuritySchemeOb() {
    return (SecuritySchemeOb) getChild(0);
  }
  /**
   * Retrieves the SecuritySchemeOb child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the SecuritySchemeOb child.
   * @apilevel low-level
   */
  public SecuritySchemeOb getSecuritySchemeObNoTransform() {
    return (SecuritySchemeOb) getChildNoTransform(0);
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
