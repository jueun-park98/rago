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
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:120
 * @astdecl OAuthFlowObject : ASTNode ::= <AuthorizationUrl:String> <TokenUrl:String> <RefreshUrl:String> ScopesTuple* <Configuration:String>;
 * @production OAuthFlowObject : {@link ASTNode} ::= <span class="component">&lt;AuthorizationUrl:String&gt;</span> <span class="component">&lt;TokenUrl:String&gt;</span> <span class="component">&lt;RefreshUrl:String&gt;</span> <span class="component">{@link ScopesTuple}*</span> <span class="component">&lt;Configuration:String&gt;</span>;

 */
public class OAuthFlowObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:829
   */
  public static OAuthFlow composeOAuthFlow (OAuthFlowObject oAuthFlowObject){
        OAuthFlow oAuthFlow = new OAuthFlow();
        Map<String, String> scopes = new HashMap<>();

        if( oAuthFlowObject.getAuthorizationUrl() != null )
        oAuthFlow.setAuthorizationUrl( oAuthFlowObject.getAuthorizationUrl() );
        if( oAuthFlowObject.getTokenUrl() != null )
        oAuthFlow.setTokenUrl( oAuthFlowObject.getTokenUrl() );
        for( ScopesTuple t : oAuthFlowObject.getScopesTuples() )
        scopes.put(t.getScopesKey(), t.getScopesValue());
        oAuthFlow.setScopes(scopes);

        if( oAuthFlowObject.getRefreshUrl() != null )
        oAuthFlow.setRefreshUrl(oAuthFlowObject.getRefreshUrl());

        return oAuthFlow;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:846
   */
  public static OAuthFlowObject parseOAuthFlow(OAuthFlow oAuthFlow){
        OAuthFlowObject oAuthFlowObject = new OAuthFlowObject();

        if( oAuthFlow.getAuthorizationUrl() != null )
        oAuthFlowObject.setAuthorizationUrl( oAuthFlow.getAuthorizationUrl() );
        if( oAuthFlow.getTokenUrl() != null )
        oAuthFlowObject.setTokenUrl( oAuthFlow.getTokenUrl() );
        for( String key : oAuthFlow.getScopes().keySet() )
        oAuthFlowObject.addScopesTuple( new ScopesTuple(key, oAuthFlow.getScope(key)) );

        if( oAuthFlow.getRefreshUrl() != null )
        oAuthFlowObject.setRefreshUrl( oAuthFlow.getRefreshUrl() );

        return oAuthFlowObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public OAuthFlowObject() {
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
    name = {"AuthorizationUrl", "TokenUrl", "RefreshUrl", "ScopesTuple", "Configuration"},
    type = {"String", "String", "String", "JastAddList<ScopesTuple>", "String"},
    kind = {"Token", "Token", "Token", "List", "Token"}
  )
  public OAuthFlowObject(String p0, String p1, String p2, JastAddList<ScopesTuple> p3, String p4) {
    setAuthorizationUrl(p0);
    setTokenUrl(p1);
    setRefreshUrl(p2);
    setChild(p3, 0);
    setConfiguration(p4);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:27
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:33
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public OAuthFlowObject clone() throws CloneNotSupportedException {
    OAuthFlowObject node = (OAuthFlowObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:50
   */
  public OAuthFlowObject copy() {
    try {
      OAuthFlowObject node = (OAuthFlowObject) clone();
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
   * @declaredat ASTNode:69
   */
  @Deprecated
  public OAuthFlowObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:79
   */
  public OAuthFlowObject treeCopyNoTransform() {
    OAuthFlowObject tree = (OAuthFlowObject) copy();
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
   * @declaredat ASTNode:99
   */
  public OAuthFlowObject treeCopy() {
    OAuthFlowObject tree = (OAuthFlowObject) copy();
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
   * @declaredat ASTNode:113
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_AuthorizationUrl == ((OAuthFlowObject) node).tokenString_AuthorizationUrl) && (tokenString_TokenUrl == ((OAuthFlowObject) node).tokenString_TokenUrl) && (tokenString_RefreshUrl == ((OAuthFlowObject) node).tokenString_RefreshUrl) && (tokenString_Configuration == ((OAuthFlowObject) node).tokenString_Configuration);    
  }
  /**
   * Replaces the lexeme AuthorizationUrl.
   * @param value The new value for the lexeme AuthorizationUrl.
   * @apilevel high-level
   */
  public void setAuthorizationUrl(String value) {
    tokenString_AuthorizationUrl = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_AuthorizationUrl;
  /**
   * Retrieves the value for the lexeme AuthorizationUrl.
   * @return The value for the lexeme AuthorizationUrl.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="AuthorizationUrl")
  public String getAuthorizationUrl() {
    return tokenString_AuthorizationUrl != null ? tokenString_AuthorizationUrl : "";
  }
  /**
   * Replaces the lexeme TokenUrl.
   * @param value The new value for the lexeme TokenUrl.
   * @apilevel high-level
   */
  public void setTokenUrl(String value) {
    tokenString_TokenUrl = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_TokenUrl;
  /**
   * Retrieves the value for the lexeme TokenUrl.
   * @return The value for the lexeme TokenUrl.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="TokenUrl")
  public String getTokenUrl() {
    return tokenString_TokenUrl != null ? tokenString_TokenUrl : "";
  }
  /**
   * Replaces the lexeme RefreshUrl.
   * @param value The new value for the lexeme RefreshUrl.
   * @apilevel high-level
   */
  public void setRefreshUrl(String value) {
    tokenString_RefreshUrl = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_RefreshUrl;
  /**
   * Retrieves the value for the lexeme RefreshUrl.
   * @return The value for the lexeme RefreshUrl.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="RefreshUrl")
  public String getRefreshUrl() {
    return tokenString_RefreshUrl != null ? tokenString_RefreshUrl : "";
  }
  /**
   * Replaces the ScopesTuple list.
   * @param list The new list node to be used as the ScopesTuple list.
   * @apilevel high-level
   */
  public void setScopesTupleList(JastAddList<ScopesTuple> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the ScopesTuple list.
   * @return Number of children in the ScopesTuple list.
   * @apilevel high-level
   */
  public int getNumScopesTuple() {
    return getScopesTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ScopesTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ScopesTuple list.
   * @apilevel low-level
   */
  public int getNumScopesTupleNoTransform() {
    return getScopesTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ScopesTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ScopesTuple list.
   * @apilevel high-level
   */
  public ScopesTuple getScopesTuple(int i) {
    return (ScopesTuple) getScopesTupleList().getChild(i);
  }
  /**
   * Check whether the ScopesTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasScopesTuple() {
    return getScopesTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ScopesTuple list.
   * @param node The element to append to the ScopesTuple list.
   * @apilevel high-level
   */
  public void addScopesTuple(ScopesTuple node) {
    JastAddList<ScopesTuple> list = (parent == null) ? getScopesTupleListNoTransform() : getScopesTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addScopesTupleNoTransform(ScopesTuple node) {
    JastAddList<ScopesTuple> list = getScopesTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ScopesTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setScopesTuple(ScopesTuple node, int i) {
    JastAddList<ScopesTuple> list = getScopesTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ScopesTuple list.
   * @return The node representing the ScopesTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ScopesTuple")
  public JastAddList<ScopesTuple> getScopesTupleList() {
    JastAddList<ScopesTuple> list = (JastAddList<ScopesTuple>) getChild(0);
    return list;
  }
  /**
   * Retrieves the ScopesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ScopesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ScopesTuple> getScopesTupleListNoTransform() {
    return (JastAddList<ScopesTuple>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the ScopesTuple list without
   * triggering rewrites.
   */
  public ScopesTuple getScopesTupleNoTransform(int i) {
    return (ScopesTuple) getScopesTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ScopesTuple list.
   * @return The node representing the ScopesTuple list.
   * @apilevel high-level
   */
  public JastAddList<ScopesTuple> getScopesTuples() {
    return getScopesTupleList();
  }
  /**
   * Retrieves the ScopesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ScopesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ScopesTuple> getScopesTuplesNoTransform() {
    return getScopesTupleListNoTransform();
  }
  /**
   * Replaces the lexeme Configuration.
   * @param value The new value for the lexeme Configuration.
   * @apilevel high-level
   */
  public void setConfiguration(String value) {
    tokenString_Configuration = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Configuration;
  /**
   * Retrieves the value for the lexeme Configuration.
   * @return The value for the lexeme Configuration.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Configuration")
  public String getConfiguration() {
    return tokenString_Configuration != null ? tokenString_Configuration : "";
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
