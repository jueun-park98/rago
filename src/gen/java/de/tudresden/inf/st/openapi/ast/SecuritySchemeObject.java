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
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:110
 * @astdecl SecuritySchemeObject : ASTNode ::= <Type:String> <Description:String> <Name:String> <In:String> <Scheme:String> <BearerFormat:String> OAuthFlowsObject <OpenIdConnectUrl:String> <Ref:String>;
 * @production SecuritySchemeObject : {@link ASTNode} ::= <span class="component">&lt;Type:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;Name:String&gt;</span> <span class="component">&lt;In:String&gt;</span> <span class="component">&lt;Scheme:String&gt;</span> <span class="component">&lt;BearerFormat:String&gt;</span> <span class="component">{@link OAuthFlowsObject}</span> <span class="component">&lt;OpenIdConnectUrl:String&gt;</span> <span class="component">&lt;Ref:String&gt;</span>;

 */
public class SecuritySchemeObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:718
   */
  public static SecurityScheme composeSecurityScheme (SecuritySchemeObject securitySchemeObject){
        SecurityScheme securityScheme = new SecurityScheme();

        securityScheme.setType( securitySchemeObject.getType() );
        securityScheme.setName( securitySchemeObject.getName() );
        securityScheme.setIn( securitySchemeObject.getIn() );
        securityScheme.setScheme( securitySchemeObject.getScheme() );
        securityScheme.setOpenIdConnectUrl( securitySchemeObject.getOpenIdConnectUrl() );
        securityScheme.setFlows( OAuthFlowsObject.composeOAuthFlows( securitySchemeObject.getOAuthFlowsObject() ) );

        if( !securitySchemeObject.getDescription().isEmpty() )
        securityScheme.setDescription( securitySchemeObject.getDescription() );
        if( securitySchemeObject.getBearerFormat() != null )
        securityScheme.setBearerFormat( securitySchemeObject.getBearerFormat() );

        return securityScheme;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:750
   */
  public static SecuritySchemeObject parseSecurityScheme(SecurityScheme securityScheme){
        SecuritySchemeObject securitySchemeObject = new SecuritySchemeObject();

        securitySchemeObject.setType( securityScheme.getType() );
        securitySchemeObject.setName( securityScheme.getName() );
        securitySchemeObject.setIn( securityScheme.getIn() );
        securitySchemeObject.setScheme( securityScheme.getScheme() );
        securitySchemeObject.setOpenIdConnectUrl( securityScheme.getOpenIdConnectUrl() );
        securitySchemeObject.setOAuthFlowsObject( OAuthFlowsObject.parseOAuthFlows(securityScheme.getFlows()) );

        if( securityScheme.getDescription() != null )
        securitySchemeObject.setDescription( securityScheme.getDescription() );
        if( securityScheme.getBearerFormat() != null )
        securitySchemeObject.setBearerFormat( securityScheme.getBearerFormat() );

        return securitySchemeObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public SecuritySchemeObject() {
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
    name = {"Type", "Description", "Name", "In", "Scheme", "BearerFormat", "OAuthFlowsObject", "OpenIdConnectUrl", "Ref"},
    type = {"String", "String", "String", "String", "String", "String", "OAuthFlowsObject", "String", "String"},
    kind = {"Token", "Token", "Token", "Token", "Token", "Token", "Child", "Token", "Token"}
  )
  public SecuritySchemeObject(String p0, String p1, String p2, String p3, String p4, String p5, OAuthFlowsObject p6, String p7, String p8) {
    setType(p0);
    setDescription(p1);
    setName(p2);
    setIn(p3);
    setScheme(p4);
    setBearerFormat(p5);
    setChild(p6, 0);
    setOpenIdConnectUrl(p7);
    setRef(p8);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:30
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:36
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public SecuritySchemeObject clone() throws CloneNotSupportedException {
    SecuritySchemeObject node = (SecuritySchemeObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public SecuritySchemeObject copy() {
    try {
      SecuritySchemeObject node = (SecuritySchemeObject) clone();
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
   * @declaredat ASTNode:72
   */
  @Deprecated
  public SecuritySchemeObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:82
   */
  public SecuritySchemeObject treeCopyNoTransform() {
    SecuritySchemeObject tree = (SecuritySchemeObject) copy();
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
   * @declaredat ASTNode:102
   */
  public SecuritySchemeObject treeCopy() {
    SecuritySchemeObject tree = (SecuritySchemeObject) copy();
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
   * @declaredat ASTNode:116
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Type == ((SecuritySchemeObject) node).tokenString_Type) && (tokenString_Description == ((SecuritySchemeObject) node).tokenString_Description) && (tokenString_Name == ((SecuritySchemeObject) node).tokenString_Name) && (tokenString_In == ((SecuritySchemeObject) node).tokenString_In) && (tokenString_Scheme == ((SecuritySchemeObject) node).tokenString_Scheme) && (tokenString_BearerFormat == ((SecuritySchemeObject) node).tokenString_BearerFormat) && (tokenString_OpenIdConnectUrl == ((SecuritySchemeObject) node).tokenString_OpenIdConnectUrl) && (tokenString_Ref == ((SecuritySchemeObject) node).tokenString_Ref);    
  }
  /**
   * Replaces the lexeme Type.
   * @param value The new value for the lexeme Type.
   * @apilevel high-level
   */
  public void setType(String value) {
    tokenString_Type = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Type;
  /**
   * Retrieves the value for the lexeme Type.
   * @return The value for the lexeme Type.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Type")
  public String getType() {
    return tokenString_Type != null ? tokenString_Type : "";
  }
  /**
   * Replaces the lexeme Description.
   * @param value The new value for the lexeme Description.
   * @apilevel high-level
   */
  public void setDescription(String value) {
    tokenString_Description = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Description;
  /**
   * Retrieves the value for the lexeme Description.
   * @return The value for the lexeme Description.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Description")
  public String getDescription() {
    return tokenString_Description != null ? tokenString_Description : "";
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
   * Replaces the lexeme In.
   * @param value The new value for the lexeme In.
   * @apilevel high-level
   */
  public void setIn(String value) {
    tokenString_In = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_In;
  /**
   * Retrieves the value for the lexeme In.
   * @return The value for the lexeme In.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="In")
  public String getIn() {
    return tokenString_In != null ? tokenString_In : "";
  }
  /**
   * Replaces the lexeme Scheme.
   * @param value The new value for the lexeme Scheme.
   * @apilevel high-level
   */
  public void setScheme(String value) {
    tokenString_Scheme = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Scheme;
  /**
   * Retrieves the value for the lexeme Scheme.
   * @return The value for the lexeme Scheme.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Scheme")
  public String getScheme() {
    return tokenString_Scheme != null ? tokenString_Scheme : "";
  }
  /**
   * Replaces the lexeme BearerFormat.
   * @param value The new value for the lexeme BearerFormat.
   * @apilevel high-level
   */
  public void setBearerFormat(String value) {
    tokenString_BearerFormat = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_BearerFormat;
  /**
   * Retrieves the value for the lexeme BearerFormat.
   * @return The value for the lexeme BearerFormat.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="BearerFormat")
  public String getBearerFormat() {
    return tokenString_BearerFormat != null ? tokenString_BearerFormat : "";
  }
  /**
   * Replaces the OAuthFlowsObject child.
   * @param node The new node to replace the OAuthFlowsObject child.
   * @apilevel high-level
   */
  public void setOAuthFlowsObject(OAuthFlowsObject node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the OAuthFlowsObject child.
   * @return The current node used as the OAuthFlowsObject child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="OAuthFlowsObject")
  public OAuthFlowsObject getOAuthFlowsObject() {
    return (OAuthFlowsObject) getChild(0);
  }
  /**
   * Retrieves the OAuthFlowsObject child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the OAuthFlowsObject child.
   * @apilevel low-level
   */
  public OAuthFlowsObject getOAuthFlowsObjectNoTransform() {
    return (OAuthFlowsObject) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme OpenIdConnectUrl.
   * @param value The new value for the lexeme OpenIdConnectUrl.
   * @apilevel high-level
   */
  public void setOpenIdConnectUrl(String value) {
    tokenString_OpenIdConnectUrl = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_OpenIdConnectUrl;
  /**
   * Retrieves the value for the lexeme OpenIdConnectUrl.
   * @return The value for the lexeme OpenIdConnectUrl.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="OpenIdConnectUrl")
  public String getOpenIdConnectUrl() {
    return tokenString_OpenIdConnectUrl != null ? tokenString_OpenIdConnectUrl : "";
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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
