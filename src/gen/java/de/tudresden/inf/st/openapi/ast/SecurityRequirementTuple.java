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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:125
 * @astdecl SecurityRequirementTuple : ASTNode ::= <Name:String> SecurityRequirementValue*;
 * @production SecurityRequirementTuple : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">{@link SecurityRequirementValue}*</span>;

 */
public class SecurityRequirementTuple extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public SecurityRequirementTuple() {
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
    setChild(new JastAddList(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Name", "SecurityRequirementValue"},
    type = {"String", "JastAddList<SecurityRequirementValue>"},
    kind = {"Token", "List"}
  )
  public SecurityRequirementTuple(String p0, JastAddList<SecurityRequirementValue> p1) {
    setName(p0);
    setChild(p1, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:30
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public SecurityRequirementTuple clone() throws CloneNotSupportedException {
    SecurityRequirementTuple node = (SecurityRequirementTuple) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public SecurityRequirementTuple copy() {
    try {
      SecurityRequirementTuple node = (SecurityRequirementTuple) clone();
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
   * @declaredat ASTNode:66
   */
  @Deprecated
  public SecurityRequirementTuple fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public SecurityRequirementTuple treeCopyNoTransform() {
    SecurityRequirementTuple tree = (SecurityRequirementTuple) copy();
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
   * @declaredat ASTNode:96
   */
  public SecurityRequirementTuple treeCopy() {
    SecurityRequirementTuple tree = (SecurityRequirementTuple) copy();
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
   * @declaredat ASTNode:110
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((SecurityRequirementTuple) node).tokenString_Name);    
  }
  /**
   * Replaces the lexeme Name.
   * @param value The new value for the lexeme Name.
   * @apilevel high-level
   */
  public void setName(String value) {
    tokenString_Name = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Name;
  /**
   * Retrieves the value for the lexeme Name.
   * @return The value for the lexeme Name.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Name")
  public String getName() {
    return tokenString_Name != null ? tokenString_Name : "";
  }
  /**
   * Replaces the SecurityRequirementValue list.
   * @param list The new list node to be used as the SecurityRequirementValue list.
   * @apilevel high-level
   */
  public void setSecurityRequirementValueList(JastAddList<SecurityRequirementValue> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the SecurityRequirementValue list.
   * @return Number of children in the SecurityRequirementValue list.
   * @apilevel high-level
   */
  public int getNumSecurityRequirementValue() {
    return getSecurityRequirementValueList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SecurityRequirementValue list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SecurityRequirementValue list.
   * @apilevel low-level
   */
  public int getNumSecurityRequirementValueNoTransform() {
    return getSecurityRequirementValueListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SecurityRequirementValue list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SecurityRequirementValue list.
   * @apilevel high-level
   */
  public SecurityRequirementValue getSecurityRequirementValue(int i) {
    return (SecurityRequirementValue) getSecurityRequirementValueList().getChild(i);
  }
  /**
   * Check whether the SecurityRequirementValue list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSecurityRequirementValue() {
    return getSecurityRequirementValueList().getNumChild() != 0;
  }
  /**
   * Append an element to the SecurityRequirementValue list.
   * @param node The element to append to the SecurityRequirementValue list.
   * @apilevel high-level
   */
  public void addSecurityRequirementValue(SecurityRequirementValue node) {
    JastAddList<SecurityRequirementValue> list = (parent == null) ? getSecurityRequirementValueListNoTransform() : getSecurityRequirementValueList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSecurityRequirementValueNoTransform(SecurityRequirementValue node) {
    JastAddList<SecurityRequirementValue> list = getSecurityRequirementValueListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SecurityRequirementValue list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSecurityRequirementValue(SecurityRequirementValue node, int i) {
    JastAddList<SecurityRequirementValue> list = getSecurityRequirementValueList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SecurityRequirementValue list.
   * @return The node representing the SecurityRequirementValue list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SecurityRequirementValue")
  public JastAddList<SecurityRequirementValue> getSecurityRequirementValueList() {
    JastAddList<SecurityRequirementValue> list = (JastAddList<SecurityRequirementValue>) getChild(0);
    return list;
  }
  /**
   * Retrieves the SecurityRequirementValue list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecurityRequirementValue list.
   * @apilevel low-level
   */
  public JastAddList<SecurityRequirementValue> getSecurityRequirementValueListNoTransform() {
    return (JastAddList<SecurityRequirementValue>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the SecurityRequirementValue list without
   * triggering rewrites.
   */
  public SecurityRequirementValue getSecurityRequirementValueNoTransform(int i) {
    return (SecurityRequirementValue) getSecurityRequirementValueListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the SecurityRequirementValue list.
   * @return The node representing the SecurityRequirementValue list.
   * @apilevel high-level
   */
  public JastAddList<SecurityRequirementValue> getSecurityRequirementValues() {
    return getSecurityRequirementValueList();
  }
  /**
   * Retrieves the SecurityRequirementValue list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecurityRequirementValue list.
   * @apilevel low-level
   */
  public JastAddList<SecurityRequirementValue> getSecurityRequirementValuesNoTransform() {
    return getSecurityRequirementValueListNoTransform();
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
