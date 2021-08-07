/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:34
 * @astdecl ResponseObjectTuple : ResponsesTuple ::= <Name:String> ResponseObject;
 * @production ResponseObjectTuple : {@link ResponsesTuple} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">{@link ResponseObject}</span>;

 */
public class ResponseObjectTuple extends ResponsesTuple implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ResponseObjectTuple() {
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
    name = {"Name", "ResponseObject"},
    type = {"String", "ResponseObject"},
    kind = {"Token", "Child"}
  )
  public ResponseObjectTuple(String p0, ResponseObject p1) {
    setName(p0);
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
  public ResponseObjectTuple clone() throws CloneNotSupportedException {
    ResponseObjectTuple node = (ResponseObjectTuple) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public ResponseObjectTuple copy() {
    try {
      ResponseObjectTuple node = (ResponseObjectTuple) clone();
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
  public ResponseObjectTuple fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public ResponseObjectTuple treeCopyNoTransform() {
    ResponseObjectTuple tree = (ResponseObjectTuple) copy();
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
  public ResponseObjectTuple treeCopy() {
    ResponseObjectTuple tree = (ResponseObjectTuple) copy();
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
    return super.is$Equal(node) && (tokenString_Name == ((ResponseObjectTuple) node).tokenString_Name);    
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
   * Replaces the ResponseObject child.
   * @param node The new node to replace the ResponseObject child.
   * @apilevel high-level
   */
  public void setResponseObject(ResponseObject node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the ResponseObject child.
   * @return The current node used as the ResponseObject child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="ResponseObject")
  public ResponseObject getResponseObject() {
    return (ResponseObject) getChild(0);
  }
  /**
   * Retrieves the ResponseObject child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ResponseObject child.
   * @apilevel low-level
   */
  public ResponseObject getResponseObjectNoTransform() {
    return (ResponseObject) getChildNoTransform(0);
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
