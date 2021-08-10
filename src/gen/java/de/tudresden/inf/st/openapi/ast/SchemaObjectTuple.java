/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:31
 * @astdecl SchemaObjectTuple : SchemasTuple ::= <Name:String> SchemaObject;
 * @production SchemaObjectTuple : {@link SchemasTuple} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">{@link SchemaObject}</span>;

 */
public class SchemaObjectTuple extends SchemasTuple implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public SchemaObjectTuple() {
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
    name = {"Name", "SchemaObject"},
    type = {"String", "SchemaObject"},
    kind = {"Token", "Child"}
  )
  public SchemaObjectTuple(String p0, SchemaObject p1) {
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
  public SchemaObjectTuple clone() throws CloneNotSupportedException {
    SchemaObjectTuple node = (SchemaObjectTuple) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public SchemaObjectTuple copy() {
    try {
      SchemaObjectTuple node = (SchemaObjectTuple) clone();
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
  public SchemaObjectTuple fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public SchemaObjectTuple treeCopyNoTransform() {
    SchemaObjectTuple tree = (SchemaObjectTuple) copy();
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
  public SchemaObjectTuple treeCopy() {
    SchemaObjectTuple tree = (SchemaObjectTuple) copy();
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
    return super.is$Equal(node) && (tokenString_Name == ((SchemaObjectTuple) node).tokenString_Name);    
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
   * Replaces the SchemaObject child.
   * @param node The new node to replace the SchemaObject child.
   * @apilevel high-level
   */
  public void setSchemaObject(SchemaObject node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the SchemaObject child.
   * @return The current node used as the SchemaObject child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="SchemaObject")
  public SchemaObject getSchemaObject() {
    return (SchemaObject) getChild(0);
  }
  /**
   * Retrieves the SchemaObject child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the SchemaObject child.
   * @apilevel low-level
   */
  public SchemaObject getSchemaObjectNoTransform() {
    return (SchemaObject) getChildNoTransform(0);
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
