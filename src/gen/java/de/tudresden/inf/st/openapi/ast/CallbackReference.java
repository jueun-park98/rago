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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:83
 * @astdecl CallbackReference : CallbackOb ::= <Ref:String> <CallbackOb:CallbackOb>;
 * @production CallbackReference : {@link CallbackOb} ::= <span class="component">&lt;Ref:String&gt;</span> <span class="component">&lt;CallbackOb:CallbackOb&gt;</span>;

 */
public class CallbackReference extends CallbackOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public CallbackReference() {
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
    name = {"Ref", "CallbackOb"},
    type = {"String", "CallbackOb"},
    kind = {"Token", "Token"}
  )
  public CallbackReference(String p0, CallbackOb p1) {
    setRef(p0);
    setCallbackOb(p1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public CallbackReference clone() throws CloneNotSupportedException {
    CallbackReference node = (CallbackReference) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public CallbackReference copy() {
    try {
      CallbackReference node = (CallbackReference) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public CallbackReference fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public CallbackReference treeCopyNoTransform() {
    CallbackReference tree = (CallbackReference) copy();
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
   * @declaredat ASTNode:94
   */
  public CallbackReference treeCopy() {
    CallbackReference tree = (CallbackReference) copy();
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
   * @declaredat ASTNode:108
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Ref == ((CallbackReference) node).tokenString_Ref) && (tokenCallbackOb_CallbackOb == ((CallbackReference) node).tokenCallbackOb_CallbackOb);    
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
   * Replaces the lexeme CallbackOb.
   * @param value The new value for the lexeme CallbackOb.
   * @apilevel high-level
   */
  public void setCallbackOb(CallbackOb value) {
    tokenCallbackOb_CallbackOb = value;
  }
  /** @apilevel internal 
   */
  protected CallbackOb tokenCallbackOb_CallbackOb;
  /**
   * Retrieves the value for the lexeme CallbackOb.
   * @return The value for the lexeme CallbackOb.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="CallbackOb")
  public CallbackOb getCallbackOb() {
    return tokenCallbackOb_CallbackOb;
  }
/** @apilevel internal */
protected java.util.Set composeCallback_CallbackOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:558
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:558")
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
            CallbackReference c = (CallbackReference) callbackOb;
    
            if( !c.getRef().isEmpty() )
            callback.setRef(c.getRef());
    
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
   * @aspect RefGet
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RefGet.jrag:48
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="RefGet", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RefGet.jrag:48")
  public CallbackObject callbackObject() {
    if (callbackObject_visited) {
      throw new RuntimeException("Circular definition of attribute CallbackOb.callbackObject().");
    }
    callbackObject_visited = true;
    try {
            if( getCallbackOb() instanceof CallbackObject )
                return (CallbackObject) getCallbackOb();
            else
                return getCallbackOb().callbackObject();
        }
    finally {
      callbackObject_visited = false;
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
