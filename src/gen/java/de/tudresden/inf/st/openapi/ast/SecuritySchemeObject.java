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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:127
 * @astdecl SecuritySchemeObject : SecuritySchemeOb ::= <Type:String> <Description:String> <Name:String> <In:String> <Scheme:String> <BearerFormat:String> [OAuthFlowsObject] <OpenIdConnectUrl:String> Extension*;
 * @production SecuritySchemeObject : {@link SecuritySchemeOb} ::= <span class="component">&lt;Type:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;Name:String&gt;</span> <span class="component">&lt;In:String&gt;</span> <span class="component">&lt;Scheme:String&gt;</span> <span class="component">&lt;BearerFormat:String&gt;</span> <span class="component">[{@link OAuthFlowsObject}]</span> <span class="component">&lt;OpenIdConnectUrl:String&gt;</span> <span class="component">{@link Extension}*</span>;

 */
public class SecuritySchemeObject extends SecuritySchemeOb implements Cloneable {
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
    children = new ASTNode[2];
    setChild(new Opt(), 0);
    setChild(new JastAddList(), 1);
  }
  /**
   * @declaredat ASTNode:15
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Type", "Description", "Name", "In", "Scheme", "BearerFormat", "OAuthFlowsObject", "OpenIdConnectUrl", "Extension"},
    type = {"String", "String", "String", "String", "String", "String", "Opt<OAuthFlowsObject>", "String", "JastAddList<Extension>"},
    kind = {"Token", "Token", "Token", "Token", "Token", "Token", "Opt", "Token", "List"}
  )
  public SecuritySchemeObject(String p0, String p1, String p2, String p3, String p4, String p5, Opt<OAuthFlowsObject> p6, String p7, JastAddList<Extension> p8) {
    setType(p0);
    setDescription(p1);
    setName(p2);
    setIn(p3);
    setScheme(p4);
    setBearerFormat(p5);
    setChild(p6, 0);
    setOpenIdConnectUrl(p7);
    setChild(p8, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:32
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:38
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:50
   */
  public SecuritySchemeObject clone() throws CloneNotSupportedException {
    SecuritySchemeObject node = (SecuritySchemeObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:55
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
   * @declaredat ASTNode:74
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
   * @declaredat ASTNode:84
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
   * @declaredat ASTNode:104
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
   * @declaredat ASTNode:118
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Type == ((SecuritySchemeObject) node).tokenString_Type) && (tokenString_Description == ((SecuritySchemeObject) node).tokenString_Description) && (tokenString_Name == ((SecuritySchemeObject) node).tokenString_Name) && (tokenString_In == ((SecuritySchemeObject) node).tokenString_In) && (tokenString_Scheme == ((SecuritySchemeObject) node).tokenString_Scheme) && (tokenString_BearerFormat == ((SecuritySchemeObject) node).tokenString_BearerFormat) && (tokenString_OpenIdConnectUrl == ((SecuritySchemeObject) node).tokenString_OpenIdConnectUrl);    
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
   * Replaces the optional node for the OAuthFlowsObject child. This is the <code>Opt</code>
   * node containing the child OAuthFlowsObject, not the actual child!
   * @param opt The new node to be used as the optional node for the OAuthFlowsObject child.
   * @apilevel low-level
   */
  public void setOAuthFlowsObjectOpt(Opt<OAuthFlowsObject> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) OAuthFlowsObject child.
   * @param node The new node to be used as the OAuthFlowsObject child.
   * @apilevel high-level
   */
  public void setOAuthFlowsObject(OAuthFlowsObject node) {
    getOAuthFlowsObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional OAuthFlowsObject child exists.
   * @return {@code true} if the optional OAuthFlowsObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasOAuthFlowsObject() {
    return getOAuthFlowsObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) OAuthFlowsObject child.
   * @return The OAuthFlowsObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public OAuthFlowsObject getOAuthFlowsObject() {
    return (OAuthFlowsObject) getOAuthFlowsObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the OAuthFlowsObject child. This is the <code>Opt</code> node containing the child OAuthFlowsObject, not the actual child!
   * @return The optional node for child the OAuthFlowsObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="OAuthFlowsObject")
  public Opt<OAuthFlowsObject> getOAuthFlowsObjectOpt() {
    return (Opt<OAuthFlowsObject>) getChild(0);
  }
  /**
   * Retrieves the optional node for child OAuthFlowsObject. This is the <code>Opt</code> node containing the child OAuthFlowsObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child OAuthFlowsObject.
   * @apilevel low-level
   */
  public Opt<OAuthFlowsObject> getOAuthFlowsObjectOptNoTransform() {
    return (Opt<OAuthFlowsObject>) getChildNoTransform(0);
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
protected java.util.Set composeSecurityScheme_SecuritySchemeOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:862
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:862")
  public SecurityScheme composeSecurityScheme(SecuritySchemeOb securitySchemeOb, Map<Object, ASTNode> map) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(securitySchemeOb);
    _parameters.add(map);
    if (composeSecurityScheme_SecuritySchemeOb_Map_Object__ASTNode__visited == null) composeSecurityScheme_SecuritySchemeOb_Map_Object__ASTNode__visited = new java.util.HashSet(4);
    if (composeSecurityScheme_SecuritySchemeOb_Map_Object__ASTNode__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute SecuritySchemeOb.composeSecurityScheme(SecuritySchemeOb,Map_Object__ASTNode_).");
    }
    composeSecurityScheme_SecuritySchemeOb_Map_Object__ASTNode__visited.add(_parameters);
    try {
            SecurityScheme securityScheme = new SecurityScheme();
            SecuritySchemeObject s = (SecuritySchemeObject) securitySchemeOb;
    
            if( !s.getType().isEmpty() )
            securityScheme.setType(s.getType());
            if( !s.getName().isEmpty() )
            securityScheme.setName(s.getName());
            if( !s.getIn().isEmpty() )
            securityScheme.setIn(s.getIn());
            if( !s.getScheme().isEmpty() )
            securityScheme.setScheme(s.getScheme());
            if( !s.getOpenIdConnectUrl().isEmpty() )
            securityScheme.setOpenIdConnectUrl(s.getOpenIdConnectUrl());
            if( s.getOAuthFlowsObject() != null )
            securityScheme.setFlows(OAuthFlowsObject.composeOAuthFlows(s.getOAuthFlowsObject(), map));
            if( !s.getDescription().isEmpty() )
            securityScheme.setDescription( s.getDescription() );
            if( !s.getBearerFormat().isEmpty() )
            securityScheme.setBearerFormat( s.getBearerFormat() );
            if( s.getNumExtension() != 0 ){
            Map<String, Object> extensionMap = new HashMap<>();
            for( Extension e : s.getExtensions() )
            extensionMap.put(e.getKey(), e.getValue());
            securityScheme.setExtensions(extensionMap);
            }
    
            return securityScheme;
            }
    finally {
      composeSecurityScheme_SecuritySchemeOb_Map_Object__ASTNode__visited.remove(_parameters);
    }
  }
/** @apilevel internal */
protected boolean securitySchemeObject_visited = false;
  /**
   * @attribute syn
   * @aspect Reference
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Reference.jrag:74
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Reference", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Reference.jrag:73")
  public SecuritySchemeObject securitySchemeObject() {
    if (securitySchemeObject_visited) {
      throw new RuntimeException("Circular definition of attribute SecuritySchemeOb.securitySchemeObject().");
    }
    securitySchemeObject_visited = true;
    SecuritySchemeObject securitySchemeObject_value = this;
    securitySchemeObject_visited = false;
    return securitySchemeObject_value;
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
