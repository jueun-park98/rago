/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:118
 * @astdecl CallbackObject : ASTNode ::= Expression*;
 * @production CallbackObject : {@link ASTNode} ::= <span class="component">{@link Expression}*</span>;

 */
public class CallbackObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/Composer.jadd:389
   */
  public static Callback composeCallback (CallbackObject callbackObject){
        Callback callback = new Callback();

        if( callbackObject.getNumExpression() != 0 ){
        Map<String, Path> paths = new HashMap<>();
        for( Expression e : callbackObject.getExpressions() )
        paths.put( e.getName(), PathItemObject.composePath( e.getPathItemObject() ));
        callback.setCallbackPaths(paths);
        }

        return callback;
        }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:444
   */
  public static CallbackObject parseCallback(Callback callback){
        CallbackObject callbackObject = new CallbackObject();

        if( callback.getCallbackPaths() != null ){
        for( String key : callback.getCallbackPaths().keySet() )
        callbackObject.addExpression(new Expression(key, PathItemObject.parsePath(callback.getCallbackPath(key))));
        }

        return callbackObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public CallbackObject() {
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
    name = {"Expression"},
    type = {"JastAddList<Expression>"},
    kind = {"List"}
  )
  public CallbackObject(JastAddList<Expression> p0) {
    setChild(p0, 0);
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
  public CallbackObject clone() throws CloneNotSupportedException {
    CallbackObject node = (CallbackObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public CallbackObject copy() {
    try {
      CallbackObject node = (CallbackObject) clone();
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
  public CallbackObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public CallbackObject treeCopyNoTransform() {
    CallbackObject tree = (CallbackObject) copy();
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
  public CallbackObject treeCopy() {
    CallbackObject tree = (CallbackObject) copy();
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
    return super.is$Equal(node);    
  }
  /**
   * Replaces the Expression list.
   * @param list The new list node to be used as the Expression list.
   * @apilevel high-level
   */
  public void setExpressionList(JastAddList<Expression> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Expression list.
   * @return Number of children in the Expression list.
   * @apilevel high-level
   */
  public int getNumExpression() {
    return getExpressionList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Expression list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Expression list.
   * @apilevel low-level
   */
  public int getNumExpressionNoTransform() {
    return getExpressionListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Expression list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Expression list.
   * @apilevel high-level
   */
  public Expression getExpression(int i) {
    return (Expression) getExpressionList().getChild(i);
  }
  /**
   * Check whether the Expression list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExpression() {
    return getExpressionList().getNumChild() != 0;
  }
  /**
   * Append an element to the Expression list.
   * @param node The element to append to the Expression list.
   * @apilevel high-level
   */
  public void addExpression(Expression node) {
    JastAddList<Expression> list = (parent == null) ? getExpressionListNoTransform() : getExpressionList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addExpressionNoTransform(Expression node) {
    JastAddList<Expression> list = getExpressionListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Expression list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExpression(Expression node, int i) {
    JastAddList<Expression> list = getExpressionList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Expression list.
   * @return The node representing the Expression list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Expression")
  public JastAddList<Expression> getExpressionList() {
    JastAddList<Expression> list = (JastAddList<Expression>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Expression list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Expression list.
   * @apilevel low-level
   */
  public JastAddList<Expression> getExpressionListNoTransform() {
    return (JastAddList<Expression>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Expression list without
   * triggering rewrites.
   */
  public Expression getExpressionNoTransform(int i) {
    return (Expression) getExpressionListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Expression list.
   * @return The node representing the Expression list.
   * @apilevel high-level
   */
  public JastAddList<Expression> getExpressions() {
    return getExpressionList();
  }
  /**
   * Retrieves the Expression list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Expression list.
   * @apilevel low-level
   */
  public JastAddList<Expression> getExpressionsNoTransform() {
    return getExpressionListNoTransform();
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
