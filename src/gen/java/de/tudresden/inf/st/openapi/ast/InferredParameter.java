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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
/**
 * @ast node
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:3
 * @astdecl InferredParameter : ASTNode ::= <Parameter:String>;
 * @production InferredParameter : {@link ASTNode} ::= <span class="component">&lt;Parameter:String&gt;</span>;

 */
public class InferredParameter extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public InferredParameter() {
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
    name = {"Parameter"},
    type = {"String"},
    kind = {"Token"}
  )
  public InferredParameter(String p0) {
    setParameter(p0);
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
  public InferredParameter clone() throws CloneNotSupportedException {
    InferredParameter node = (InferredParameter) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public InferredParameter copy() {
    try {
      InferredParameter node = (InferredParameter) clone();
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
  public InferredParameter fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public InferredParameter treeCopyNoTransform() {
    InferredParameter tree = (InferredParameter) copy();
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
  public InferredParameter treeCopy() {
    InferredParameter tree = (InferredParameter) copy();
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
    return super.is$Equal(node) && (tokenString_Parameter == ((InferredParameter) node).tokenString_Parameter);    
  }
  /**
   * Replaces the lexeme Parameter.
   * @param value The new value for the lexeme Parameter.
   * @apilevel high-level
   */
  public void setParameter(String value) {
    tokenString_Parameter = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Parameter;
  /**
   * Retrieves the value for the lexeme Parameter.
   * @return The value for the lexeme Parameter.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Parameter")
  public String getParameter() {
    return tokenString_Parameter != null ? tokenString_Parameter : "";
  }
/** @apilevel internal */
protected boolean name_visited = false;
  /**
   * @attribute syn
   * @aspect InferParameter
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:13
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="InferParameter", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:13")
  public String name() {
    if (name_visited) {
      throw new RuntimeException("Circular definition of attribute InferredParameter.name().");
    }
    name_visited = true;
    String name_value = getParameter().substring(0,getParameter().indexOf("?"));
    name_visited = false;
    return name_value;
  }
/** @apilevel internal */
protected boolean value_visited = false;
  /**
   * @attribute syn
   * @aspect InferParameter
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:14
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="InferParameter", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:14")
  public String value() {
    if (value_visited) {
      throw new RuntimeException("Circular definition of attribute InferredParameter.value().");
    }
    value_visited = true;
    String value_value = getParameter().substring(getParameter().indexOf("?")+1);
    value_visited = false;
    return value_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
  /** @apilevel internal */
  protected void collect_contributors_OpenAPIObject_collectInferredParameters(OpenAPIObject _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:11
    {
      java.util.Set<ASTNode> contributors = _map.get(_root);
      if (contributors == null) {
        contributors = new java.util.LinkedHashSet<ASTNode>();
        _map.put((ASTNode) _root, contributors);
      }
      contributors.add(this);
    }
    super.collect_contributors_OpenAPIObject_collectInferredParameters(_root, _map);
  }
  /** @apilevel internal */
  protected void contributeTo_OpenAPIObject_collectInferredParameters(Set<InferredParameter> collection) {
    super.contributeTo_OpenAPIObject_collectInferredParameters(collection);
    collection.add(this);
  }
}
