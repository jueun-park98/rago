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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:82
 * @astdecl CallbackObject : CallbackOb ::= Expression* Extension*;
 * @production CallbackObject : {@link CallbackOb} ::= <span class="component">{@link Expression}*</span> <span class="component">{@link Extension}*</span>;

 */
public class CallbackObject extends CallbackOb implements Cloneable {
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
    children = new ASTNode[2];
    setChild(new JastAddList(), 0);
    setChild(new JastAddList(), 1);
  }
  /**
   * @declaredat ASTNode:15
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Expression", "Extension"},
    type = {"JastAddList<Expression>", "JastAddList<Extension>"},
    kind = {"List", "List"}
  )
  public CallbackObject(JastAddList<Expression> p0, JastAddList<Extension> p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:31
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public CallbackObject clone() throws CloneNotSupportedException {
    CallbackObject node = (CallbackObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
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
   * @declaredat ASTNode:67
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
   * @declaredat ASTNode:77
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
   * @declaredat ASTNode:97
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
   * @declaredat ASTNode:111
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
  /**
   * Replaces the Extension list.
   * @param list The new list node to be used as the Extension list.
   * @apilevel high-level
   */
  public void setExtensionList(JastAddList<Extension> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Extension list.
   * @return Number of children in the Extension list.
   * @apilevel high-level
   */
  public int getNumExtension() {
    return getExtensionList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Extension list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Extension list.
   * @apilevel low-level
   */
  public int getNumExtensionNoTransform() {
    return getExtensionListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Extension list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Extension list.
   * @apilevel high-level
   */
  public Extension getExtension(int i) {
    return (Extension) getExtensionList().getChild(i);
  }
  /**
   * Check whether the Extension list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExtension() {
    return getExtensionList().getNumChild() != 0;
  }
  /**
   * Append an element to the Extension list.
   * @param node The element to append to the Extension list.
   * @apilevel high-level
   */
  public void addExtension(Extension node) {
    JastAddList<Extension> list = (parent == null) ? getExtensionListNoTransform() : getExtensionList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addExtensionNoTransform(Extension node) {
    JastAddList<Extension> list = getExtensionListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Extension list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExtension(Extension node, int i) {
    JastAddList<Extension> list = getExtensionList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Extension list.
   * @return The node representing the Extension list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Extension")
  public JastAddList<Extension> getExtensionList() {
    JastAddList<Extension> list = (JastAddList<Extension>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionListNoTransform() {
    return (JastAddList<Extension>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Extension list without
   * triggering rewrites.
   */
  public Extension getExtensionNoTransform(int i) {
    return (Extension) getExtensionListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Extension list.
   * @return The node representing the Extension list.
   * @apilevel high-level
   */
  public JastAddList<Extension> getExtensions() {
    return getExtensionList();
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionsNoTransform() {
    return getExtensionListNoTransform();
  }
/** @apilevel internal */
protected java.util.Set composeCallback_CallbackOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:548
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:548")
  public Callback composeCallback(CallbackOb callbackOb, Map<Object, ASTNode> map) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(callbackOb);
    _parameters.add(map);
    if (composeCallback_CallbackOb_Map_Object__ASTNode__visited == null) composeCallback_CallbackOb_Map_Object__ASTNode__visited = new java.util.HashSet(4);
    if (composeCallback_CallbackOb_Map_Object__ASTNode__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute CallbackOb.composeCallback(CallbackOb,Map_Object__ASTNode_).");
    }
    composeCallback_CallbackOb_Map_Object__ASTNode__visited.add(_parameters);
    try {
            Callback callback = new Callback();
            CallbackObject c = (CallbackObject) callbackOb;
    
            if( c.getNumExpression() != 0 ){
            Map<String, Path> paths = new HashMap<>();
            PathItemObject p;
            for( Expression e : c.getExpressions() ) {
            p = e.getPathItemObject();
            paths.put(e.getName(), p.composePath(p, map));
            }
            callback.setCallbackPaths(paths);
            }
    
            return callback;
            }
    finally {
      composeCallback_CallbackOb_Map_Object__ASTNode__visited.remove(_parameters);
    }
  }
/** @apilevel internal */
protected boolean callbackObject_visited = false;
  /**
   * @attribute syn
   * @aspect Reference
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Reference.jrag:44
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Reference", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Reference.jrag:43")
  public CallbackObject callbackObject() {
    if (callbackObject_visited) {
      throw new RuntimeException("Circular definition of attribute CallbackOb.callbackObject().");
    }
    callbackObject_visited = true;
    CallbackObject callbackObject_value = this;
    callbackObject_visited = false;
    return callbackObject_value;
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
