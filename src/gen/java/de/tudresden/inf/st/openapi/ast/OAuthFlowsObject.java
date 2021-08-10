/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:158
 * @astdecl OAuthFlowsObject : ASTNode ::= [Implicit] [Password] [ClientCredentials] [AuthorizationCode];
 * @production OAuthFlowsObject : {@link ASTNode} ::= <span class="component">[{@link Implicit}]</span> <span class="component">[{@link Password}]</span> <span class="component">[{@link ClientCredentials}]</span> <span class="component">[{@link AuthorizationCode}]</span>;

 */
public class OAuthFlowsObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:629
   */
  public static OAuthFlows composeOAuthFlows (OAuthFlowsObject oAuthFlowsObject){
        OAuthFlows oAuthFlows = new OAuthFlows();

        if( oAuthFlowsObject.hasImplicit() )
        oAuthFlows.setImplicit( OAuthFlowObject.composeOAuthFlow(oAuthFlowsObject.getImplicit().getOAuthFlowObject()) );
        if( oAuthFlowsObject.hasPassword() )
        oAuthFlows.setPassword( OAuthFlowObject.composeOAuthFlow(oAuthFlowsObject.getPassword().getOAuthFlowObject()) );
        if( oAuthFlowsObject.hasClientCredentials() )
        oAuthFlows.setClientCredentials( OAuthFlowObject.composeOAuthFlow(oAuthFlowsObject.getClientCredentials().getOAuthFlowObject()) );
        if( oAuthFlowsObject.hasAuthorizationCode() )
        oAuthFlows.setAuthorizationCode( OAuthFlowObject.composeOAuthFlow(oAuthFlowsObject.getAuthorizationCode().getOAuthFlowObject()) );

        return oAuthFlows;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:707
   */
  public static OAuthFlowsObject parseOAuthFlows(OAuthFlows oAuthFlows){
        OAuthFlowsObject oAuthFlowsObject = new OAuthFlowsObject();
        Implicit implicit = new Implicit();
        Password password = new Password();
        ClientCredentials clientCredentials = new ClientCredentials();
        AuthorizationCode authorizationCode = new AuthorizationCode();

        if( oAuthFlows.getImplicit() != null )
        implicit.setOAuthFlowObject( OAuthFlowObject.parseOAuthFlow(oAuthFlows.getImplicit()) );
        if( oAuthFlows.getPassword() != null )
        password.setOAuthFlowObject( OAuthFlowObject.parseOAuthFlow(oAuthFlows.getPassword()) );
        if( oAuthFlows.getClientCredentials() != null )
        clientCredentials.setOAuthFlowObject( OAuthFlowObject.parseOAuthFlow(oAuthFlows.getClientCredentials()) );
        if( oAuthFlows.getAuthorizationCode() != null )
        authorizationCode.setOAuthFlowObject( OAuthFlowObject.parseOAuthFlow(oAuthFlows.getAuthorizationCode()) );

        oAuthFlowsObject.setImplicit(implicit);
        oAuthFlowsObject.setPassword(password);
        oAuthFlowsObject.setClientCredentials(clientCredentials);
        oAuthFlowsObject.setAuthorizationCode(authorizationCode);

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
    children = new ASTNode[4];
    setChild(new Opt(), 0);
    setChild(new Opt(), 1);
    setChild(new Opt(), 2);
    setChild(new Opt(), 3);
  }
  /**
   * @declaredat ASTNode:17
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Implicit", "Password", "ClientCredentials", "AuthorizationCode"},
    type = {"Opt<Implicit>", "Opt<Password>", "Opt<ClientCredentials>", "Opt<AuthorizationCode>"},
    kind = {"Opt", "Opt", "Opt", "Opt"}
  )
  public OAuthFlowsObject(Opt<Implicit> p0, Opt<Password> p1, Opt<ClientCredentials> p2, Opt<AuthorizationCode> p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:29
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:35
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public OAuthFlowsObject clone() throws CloneNotSupportedException {
    OAuthFlowsObject node = (OAuthFlowsObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
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
   * @declaredat ASTNode:71
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
   * @declaredat ASTNode:81
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
   * @declaredat ASTNode:101
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
   * @declaredat ASTNode:115
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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
