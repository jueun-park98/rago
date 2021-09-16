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
import javax.net.ssl.HttpsURLConnection;
import java.util.Random;
import java.util.stream.IntStream;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:133
 * @astdecl OAuthFlowsObject : ASTNode ::= [Implicit] [Password] [ClientCredentials] [AuthorizationCode] Extension*;
 * @production OAuthFlowsObject : {@link ASTNode} ::= <span class="component">[{@link Implicit}]</span> <span class="component">[{@link Password}]</span> <span class="component">[{@link ClientCredentials}]</span> <span class="component">[{@link AuthorizationCode}]</span> <span class="component">{@link Extension}*</span>;

 */
public class OAuthFlowsObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:808
   */
  public static OAuthFlows composeOAuthFlows (OAuthFlowsObject oAuthFlowsObject){
        OAuthFlows oAuthFlows = new OAuthFlows();

        if( oAuthFlowsObject.hasImplicit() )
        oAuthFlows.setImplicit( OAuthFlowObject.composeOAuthFlow(oAuthFlowsObject.getImplicit().getOAuthFlowObject()) );
        if( oAuthFlowsObject.hasPassword() ){
        //System.out.println("Password eingegangen : " + oAuthFlowsObject.getPassword().getOAuthFlowObject().getAuthorizationUrl() );
        System.out.println("Password eingegangen : " + oAuthFlowsObject.getPassword().getOAuthFlowObject().getConfiguration() );
        System.out.println("Password eingegangen : " + oAuthFlowsObject.getPassword().getOAuthFlowObject().getTokenUrl() );
        System.out.println("Password eingegangen : " + oAuthFlowsObject.getPassword().getOAuthFlowObject().getRefreshUrl() );
        oAuthFlows.setPassword( OAuthFlowObject.composeOAuthFlow(oAuthFlowsObject.getPassword().getOAuthFlowObject()) );
        }
        if( oAuthFlowsObject.hasClientCredentials() )
        oAuthFlows.setClientCredentials( OAuthFlowObject.composeOAuthFlow(oAuthFlowsObject.getClientCredentials().getOAuthFlowObject()) );
        if( oAuthFlowsObject.hasAuthorizationCode() )
        oAuthFlows.setAuthorizationCode( OAuthFlowObject.composeOAuthFlow(oAuthFlowsObject.getAuthorizationCode().getOAuthFlowObject()) );

        return oAuthFlows;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:818
   */
  public static OAuthFlowsObject parseOAuthFlows(OAuthFlows oAuthFlows){
        OAuthFlowsObject oAuthFlowsObject = new OAuthFlowsObject();
        Implicit implicit = new Implicit();
        Password password = new Password();
        ClientCredentials clientCredentials = new ClientCredentials();
        AuthorizationCode authorizationCode = new AuthorizationCode();

        if( oAuthFlows.getImplicit() != null ){
        implicit.setOAuthFlowObject( OAuthFlowObject.parseOAuthFlow(oAuthFlows.getImplicit()) );
        oAuthFlowsObject.setImplicit(implicit);
        }
        if( oAuthFlows.getPassword() != null ){
            password.setOAuthFlowObject(OAuthFlowObject.parseOAuthFlow(oAuthFlows.getPassword()));
            oAuthFlowsObject.setPassword(password);
        }
        if( oAuthFlows.getClientCredentials() != null ){
        clientCredentials.setOAuthFlowObject(OAuthFlowObject.parseOAuthFlow(oAuthFlows.getClientCredentials()));
        oAuthFlowsObject.setClientCredentials(clientCredentials);
        }
        if( oAuthFlows.getAuthorizationCode() != null ){
        authorizationCode.setOAuthFlowObject(OAuthFlowObject.parseOAuthFlow(oAuthFlows.getAuthorizationCode()));
        oAuthFlowsObject.setAuthorizationCode(authorizationCode);
        }

        return oAuthFlowsObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public OAuthFlowsObject() {
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
    children = new ASTNode[5];
    setChild(new Opt(), 0);
    setChild(new Opt(), 1);
    setChild(new Opt(), 2);
    setChild(new Opt(), 3);
    setChild(new JastAddList(), 4);
  }
  /**
   * @declaredat ASTNode:18
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Implicit", "Password", "ClientCredentials", "AuthorizationCode", "Extension"},
    type = {"Opt<Implicit>", "Opt<Password>", "Opt<ClientCredentials>", "Opt<AuthorizationCode>", "JastAddList<Extension>"},
    kind = {"Opt", "Opt", "Opt", "Opt", "List"}
  )
  public OAuthFlowsObject(Opt<Implicit> p0, Opt<Password> p1, Opt<ClientCredentials> p2, Opt<AuthorizationCode> p3, JastAddList<Extension> p4) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
    setChild(p4, 4);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:31
   */
  protected int numChildren() {
    return 5;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:37
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:49
   */
  public OAuthFlowsObject clone() throws CloneNotSupportedException {
    OAuthFlowsObject node = (OAuthFlowsObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:54
   */
  public OAuthFlowsObject copy() {
    try {
      OAuthFlowsObject node = (OAuthFlowsObject) clone();
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
   * @declaredat ASTNode:73
   */
  @Deprecated
  public OAuthFlowsObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:83
   */
  public OAuthFlowsObject treeCopyNoTransform() {
    OAuthFlowsObject tree = (OAuthFlowsObject) copy();
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
   * @declaredat ASTNode:103
   */
  public OAuthFlowsObject treeCopy() {
    OAuthFlowsObject tree = (OAuthFlowsObject) copy();
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
   * @declaredat ASTNode:117
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the optional node for the Implicit child. This is the <code>Opt</code>
   * node containing the child Implicit, not the actual child!
   * @param opt The new node to be used as the optional node for the Implicit child.
   * @apilevel low-level
   */
  public void setImplicitOpt(Opt<Implicit> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) Implicit child.
   * @param node The new node to be used as the Implicit child.
   * @apilevel high-level
   */
  public void setImplicit(Implicit node) {
    getImplicitOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Implicit child exists.
   * @return {@code true} if the optional Implicit child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasImplicit() {
    return getImplicitOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Implicit child.
   * @return The Implicit child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Implicit getImplicit() {
    return (Implicit) getImplicitOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Implicit child. This is the <code>Opt</code> node containing the child Implicit, not the actual child!
   * @return The optional node for child the Implicit child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Implicit")
  public Opt<Implicit> getImplicitOpt() {
    return (Opt<Implicit>) getChild(0);
  }
  /**
   * Retrieves the optional node for child Implicit. This is the <code>Opt</code> node containing the child Implicit, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Implicit.
   * @apilevel low-level
   */
  public Opt<Implicit> getImplicitOptNoTransform() {
    return (Opt<Implicit>) getChildNoTransform(0);
  }
  /**
   * Replaces the optional node for the Password child. This is the <code>Opt</code>
   * node containing the child Password, not the actual child!
   * @param opt The new node to be used as the optional node for the Password child.
   * @apilevel low-level
   */
  public void setPasswordOpt(Opt<Password> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) Password child.
   * @param node The new node to be used as the Password child.
   * @apilevel high-level
   */
  public void setPassword(Password node) {
    getPasswordOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Password child exists.
   * @return {@code true} if the optional Password child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasPassword() {
    return getPasswordOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Password child.
   * @return The Password child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Password getPassword() {
    return (Password) getPasswordOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Password child. This is the <code>Opt</code> node containing the child Password, not the actual child!
   * @return The optional node for child the Password child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Password")
  public Opt<Password> getPasswordOpt() {
    return (Opt<Password>) getChild(1);
  }
  /**
   * Retrieves the optional node for child Password. This is the <code>Opt</code> node containing the child Password, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Password.
   * @apilevel low-level
   */
  public Opt<Password> getPasswordOptNoTransform() {
    return (Opt<Password>) getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the ClientCredentials child. This is the <code>Opt</code>
   * node containing the child ClientCredentials, not the actual child!
   * @param opt The new node to be used as the optional node for the ClientCredentials child.
   * @apilevel low-level
   */
  public void setClientCredentialsOpt(Opt<ClientCredentials> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) ClientCredentials child.
   * @param node The new node to be used as the ClientCredentials child.
   * @apilevel high-level
   */
  public void setClientCredentials(ClientCredentials node) {
    getClientCredentialsOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ClientCredentials child exists.
   * @return {@code true} if the optional ClientCredentials child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasClientCredentials() {
    return getClientCredentialsOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ClientCredentials child.
   * @return The ClientCredentials child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ClientCredentials getClientCredentials() {
    return (ClientCredentials) getClientCredentialsOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ClientCredentials child. This is the <code>Opt</code> node containing the child ClientCredentials, not the actual child!
   * @return The optional node for child the ClientCredentials child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ClientCredentials")
  public Opt<ClientCredentials> getClientCredentialsOpt() {
    return (Opt<ClientCredentials>) getChild(2);
  }
  /**
   * Retrieves the optional node for child ClientCredentials. This is the <code>Opt</code> node containing the child ClientCredentials, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ClientCredentials.
   * @apilevel low-level
   */
  public Opt<ClientCredentials> getClientCredentialsOptNoTransform() {
    return (Opt<ClientCredentials>) getChildNoTransform(2);
  }
  /**
   * Replaces the optional node for the AuthorizationCode child. This is the <code>Opt</code>
   * node containing the child AuthorizationCode, not the actual child!
   * @param opt The new node to be used as the optional node for the AuthorizationCode child.
   * @apilevel low-level
   */
  public void setAuthorizationCodeOpt(Opt<AuthorizationCode> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) AuthorizationCode child.
   * @param node The new node to be used as the AuthorizationCode child.
   * @apilevel high-level
   */
  public void setAuthorizationCode(AuthorizationCode node) {
    getAuthorizationCodeOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional AuthorizationCode child exists.
   * @return {@code true} if the optional AuthorizationCode child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasAuthorizationCode() {
    return getAuthorizationCodeOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) AuthorizationCode child.
   * @return The AuthorizationCode child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public AuthorizationCode getAuthorizationCode() {
    return (AuthorizationCode) getAuthorizationCodeOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the AuthorizationCode child. This is the <code>Opt</code> node containing the child AuthorizationCode, not the actual child!
   * @return The optional node for child the AuthorizationCode child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="AuthorizationCode")
  public Opt<AuthorizationCode> getAuthorizationCodeOpt() {
    return (Opt<AuthorizationCode>) getChild(3);
  }
  /**
   * Retrieves the optional node for child AuthorizationCode. This is the <code>Opt</code> node containing the child AuthorizationCode, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child AuthorizationCode.
   * @apilevel low-level
   */
  public Opt<AuthorizationCode> getAuthorizationCodeOptNoTransform() {
    return (Opt<AuthorizationCode>) getChildNoTransform(3);
  }
  /**
   * Replaces the Extension list.
   * @param list The new list node to be used as the Extension list.
   * @apilevel high-level
   */
  public void setExtensionList(JastAddList<Extension> list) {
    setChild(list, 4);
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
    JastAddList<Extension> list = (JastAddList<Extension>) getChild(4);
    return list;
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionListNoTransform() {
    return (JastAddList<Extension>) getChildNoTransform(4);
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
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
