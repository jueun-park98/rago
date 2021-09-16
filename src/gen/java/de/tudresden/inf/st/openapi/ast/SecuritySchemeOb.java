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
import org.openapi4j.core.exception.DecodeException;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:126
 * @astdecl SecuritySchemeOb : ASTNode;
 * @production SecuritySchemeOb : {@link ASTNode};

 */
public abstract class SecuritySchemeOb extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:749
   */
  public static SecurityScheme composeSecurityScheme (SecuritySchemeObject securitySchemeObject, Map<Object, ASTNode> map){
        SecurityScheme securityScheme = new SecurityScheme();

        if( !securitySchemeObject.getType().isEmpty() )
        securityScheme.setType(securitySchemeObject.getType());
        if( !securitySchemeObject.getName().isEmpty() )
        securityScheme.setName(securitySchemeObject.getName());
        if( !securitySchemeObject.getIn().isEmpty() )
        securityScheme.setIn(securitySchemeObject.getIn());
        if( !securitySchemeObject.getScheme().isEmpty() )
        securityScheme.setScheme(securitySchemeObject.getScheme());
        if( !securitySchemeObject.getOpenIdConnectUrl().isEmpty() )
        securityScheme.setOpenIdConnectUrl(securitySchemeObject.getOpenIdConnectUrl());
        if( securitySchemeObject.getOAuthFlowsObject() != null )
        securityScheme.setFlows(OAuthFlowsObject.composeOAuthFlows(securitySchemeObject.getOAuthFlowsObject()));
        if( !securitySchemeObject.getDescription().isEmpty() )
        securityScheme.setDescription( securitySchemeObject.getDescription() );
        if( !securitySchemeObject.getBearerFormat().isEmpty() )
        securityScheme.setBearerFormat( securitySchemeObject.getBearerFormat() );
        if( securitySchemeObject.getNumExtension() != 0 ){
        Map<String, Object> extensionMap = new HashMap<>();
        for( Extension e : securitySchemeObject.getExtensions() )
        extensionMap.put(e.getKey(), e.getValue());
        securityScheme.setExtensions(extensionMap);
        }

        return securityScheme;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:931
   */
  public static SecuritySchemeOb parseSecurityScheme(SecurityScheme securityScheme, OAIContext context, Map<Object, ASTNode> map){
        SecuritySchemeObject securitySchemeObject = new SecuritySchemeObject();

        if( securityScheme.getType() != null )
        securitySchemeObject.setType(securityScheme.getType());
        if( securityScheme.getName() != null )
        securitySchemeObject.setName(securityScheme.getName());
        if( securityScheme.getIn() != null )
        securitySchemeObject.setIn(securityScheme.getIn());
        if( securityScheme.getScheme() != null )
        securitySchemeObject.setScheme(securityScheme.getScheme());
        if( securityScheme.getOpenIdConnectUrl() != null )
        securitySchemeObject.setOpenIdConnectUrl(securityScheme.getOpenIdConnectUrl());
        if( securityScheme.getFlows() != null )
        securitySchemeObject.setOAuthFlowsObject( OAuthFlowsObject.parseOAuthFlows(securityScheme.getFlows(), map) );
        if( securityScheme.getDescription() != null )
        securitySchemeObject.setDescription( securityScheme.getDescription() );
        if( securityScheme.getBearerFormat() != null )
        securitySchemeObject.setBearerFormat( securityScheme.getBearerFormat() );
        if( securityScheme.getExtensions() != null ){
        for( String key : securityScheme.getExtensions().keySet() )
        securitySchemeObject.addExtension(new Extension(key, securityScheme.getExtensions().get(key)));
        }

        map.put(securityScheme, securitySchemeObject);
        return securitySchemeObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public SecuritySchemeOb() {
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
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:19
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:23
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public SecuritySchemeOb clone() throws CloneNotSupportedException {
    SecuritySchemeOb node = (SecuritySchemeOb) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:42
   */
  @Deprecated
  public abstract SecuritySchemeOb fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  public abstract SecuritySchemeOb treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:58
   */
  public abstract SecuritySchemeOb treeCopy();
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
