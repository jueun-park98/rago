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
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:60
 * @astdecl ParameterReference : ParameterOb ::= <Ref:String> <ParameterOb:ParameterOb>;
 * @production ParameterReference : {@link ParameterOb} ::= <span class="component">&lt;Ref:String&gt;</span> <span class="component">&lt;ParameterOb:ParameterOb&gt;</span>;

 */
public class ParameterReference extends ParameterOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ParameterReference() {
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
    name = {"Ref", "ParameterOb"},
    type = {"String", "ParameterOb"},
    kind = {"Token", "Token"}
  )
  public ParameterReference(String p0, ParameterOb p1) {
    setRef(p0);
    setParameterOb(p1);
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
  public ParameterReference clone() throws CloneNotSupportedException {
    ParameterReference node = (ParameterReference) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public ParameterReference copy() {
    try {
      ParameterReference node = (ParameterReference) clone();
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
  public ParameterReference fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public ParameterReference treeCopyNoTransform() {
    ParameterReference tree = (ParameterReference) copy();
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
  public ParameterReference treeCopy() {
    ParameterReference tree = (ParameterReference) copy();
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
    return super.is$Equal(node) && (tokenString_Ref == ((ParameterReference) node).tokenString_Ref) && (tokenParameterOb_ParameterOb == ((ParameterReference) node).tokenParameterOb_ParameterOb);    
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
   * Replaces the lexeme ParameterOb.
   * @param value The new value for the lexeme ParameterOb.
   * @apilevel high-level
   */
  public void setParameterOb(ParameterOb value) {
    tokenParameterOb_ParameterOb = value;
  }
  /** @apilevel internal 
   */
  protected ParameterOb tokenParameterOb_ParameterOb;
  /**
   * Retrieves the value for the lexeme ParameterOb.
   * @return The value for the lexeme ParameterOb.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ParameterOb")
  public ParameterOb getParameterOb() {
    return tokenParameterOb_ParameterOb;
  }
/** @apilevel internal */
protected boolean parameterObject_visited = false;
  /**
   * @attribute syn
   * @aspect ReferenceGet
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/ReferenceGet.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ReferenceGet", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/ReferenceGet.jrag:3")
  public ParameterObject parameterObject() {
    if (parameterObject_visited) {
      throw new RuntimeException("Circular definition of attribute ParameterOb.parameterObject().");
    }
    parameterObject_visited = true;
    try {
            if( getParameterOb() instanceof ParameterObject )
            return (ParameterObject) getParameterOb();
            else
            return getParameterOb().parameterObject();
        }
    finally {
      parameterObject_visited = false;
    }
  }
/** @apilevel internal */
protected java.util.Set composeParameter_ParameterOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:382
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:382")
  public Parameter composeParameter(ParameterOb parameterOb, Map<Object, ASTNode> map) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(parameterOb);
    _parameters.add(map);
    if (composeParameter_ParameterOb_Map_Object__ASTNode__visited == null) composeParameter_ParameterOb_Map_Object__ASTNode__visited = new java.util.HashSet(4);
    if (composeParameter_ParameterOb_Map_Object__ASTNode__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute ParameterOb.composeParameter(ParameterOb,Map_Object__ASTNode_).");
    }
    composeParameter_ParameterOb_Map_Object__ASTNode__visited.add(_parameters);
    try {
            Parameter parameter = new Parameter();
            ParameterReference p = (ParameterReference) parameterOb;
    
            if( !p.getRef().isEmpty() )
            parameter.setRef(p.getRef());
    
            return parameter;
            }
    finally {
      composeParameter_ParameterOb_Map_Object__ASTNode__visited.remove(_parameters);
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
