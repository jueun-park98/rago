/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:26
 * @astdecl Enum : ASTNode ::= <EnumValue:String>;
 * @production Enum : {@link ASTNode} ::= <span class="component">&lt;EnumValue:String&gt;</span>;

 */
public class Enum extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Enum() {
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
    name = {"EnumValue"},
    type = {"String"},
    kind = {"Token"}
  )
  public Enum(String p0) {
    setEnumValue(p0);
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
  public Enum clone() throws CloneNotSupportedException {
    Enum node = (Enum) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public Enum copy() {
    try {
      Enum node = (Enum) clone();
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
  public Enum fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public Enum treeCopyNoTransform() {
    Enum tree = (Enum) copy();
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
  public Enum treeCopy() {
    Enum tree = (Enum) copy();
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
    return super.is$Equal(node) && (tokenString_EnumValue == ((Enum) node).tokenString_EnumValue);    
  }
  /**
   * Replaces the lexeme EnumValue.
   * @param value The new value for the lexeme EnumValue.
   * @apilevel high-level
   */
  public void setEnumValue(String value) {
    tokenString_EnumValue = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_EnumValue;
  /**
   * Retrieves the value for the lexeme EnumValue.
   * @return The value for the lexeme EnumValue.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="EnumValue")
  public String getEnumValue() {
    return tokenString_EnumValue != null ? tokenString_EnumValue : "";
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
