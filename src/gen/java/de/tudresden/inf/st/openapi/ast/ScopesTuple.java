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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:138
 * @astdecl ScopesTuple : ASTNode ::= <ScopesKey:String> <ScopesValue:String>;
 * @production ScopesTuple : {@link ASTNode} ::= <span class="component">&lt;ScopesKey:String&gt;</span> <span class="component">&lt;ScopesValue:String&gt;</span>;

 */
public class ScopesTuple extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ScopesTuple() {
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
    name = {"ScopesKey", "ScopesValue"},
    type = {"String", "String"},
    kind = {"Token", "Token"}
  )
  public ScopesTuple(String p0, String p1) {
    setScopesKey(p0);
    setScopesValue(p1);
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
  public ScopesTuple clone() throws CloneNotSupportedException {
    ScopesTuple node = (ScopesTuple) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public ScopesTuple copy() {
    try {
      ScopesTuple node = (ScopesTuple) clone();
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
  public ScopesTuple fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public ScopesTuple treeCopyNoTransform() {
    ScopesTuple tree = (ScopesTuple) copy();
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
  public ScopesTuple treeCopy() {
    ScopesTuple tree = (ScopesTuple) copy();
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
    return super.is$Equal(node) && (tokenString_ScopesKey == ((ScopesTuple) node).tokenString_ScopesKey) && (tokenString_ScopesValue == ((ScopesTuple) node).tokenString_ScopesValue);    
  }
  /**
   * Replaces the lexeme ScopesKey.
   * @param value The new value for the lexeme ScopesKey.
   * @apilevel high-level
   */
  public void setScopesKey(String value) {
    tokenString_ScopesKey = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ScopesKey;
  /**
   * Retrieves the value for the lexeme ScopesKey.
   * @return The value for the lexeme ScopesKey.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ScopesKey")
  public String getScopesKey() {
    return tokenString_ScopesKey != null ? tokenString_ScopesKey : "";
  }
  /**
   * Replaces the lexeme ScopesValue.
   * @param value The new value for the lexeme ScopesValue.
   * @apilevel high-level
   */
  public void setScopesValue(String value) {
    tokenString_ScopesValue = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ScopesValue;
  /**
   * Retrieves the value for the lexeme ScopesValue.
   * @return The value for the lexeme ScopesValue.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ScopesValue")
  public String getScopesValue() {
    return tokenString_ScopesValue != null ? tokenString_ScopesValue : "";
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
