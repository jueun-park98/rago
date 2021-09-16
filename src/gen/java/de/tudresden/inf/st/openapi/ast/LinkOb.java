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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:93
 * @astdecl LinkOb : ASTNode;
 * @production LinkOb : {@link ASTNode};

 */
public abstract class LinkOb extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:569
   */
  public static Link composeLink (LinkObject linkObject){
        Link link = new Link();

        if( !linkObject.getRef().isEmpty() )
        link.setRef(linkObject.getRef());
        if( !linkObject.getOperationRef().isEmpty() )
        link.setOperationRef( linkObject.getOperationRef() );
        if( !linkObject.getOperationID().isEmpty() )
        link.setOperationId( linkObject.getOperationID() );
        if( linkObject.getNumLinkParameterTuple() != 0 ){
        Map<String, String> parameters = new HashMap<>();
        for( LinkParameterTuple t : linkObject.getLinkParameterTuples() )
        parameters.put( t.getLinkParameterKey(), t.getLinkParameterValue() );
        link.setParameters(parameters);
        }
        if( !linkObject.getDescription().isEmpty() )
        link.setDescription( linkObject.getDescription() );
        if( linkObject.hasServerObject() )
        link.setServer( ServerObject.composeServer(linkObject.getServerObject()) );

        return link;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:566
   */
  public static LinkObject parseLink(Link link){
        LinkObject linkObject = new LinkObject();

        if( link.isRef() )
        linkObject.setRef(link.getRef());
        if( link.getOperationRef() != null )
        linkObject.setOperationRef( link.getOperationRef() );
        if( link.getOperationId() != null )
        linkObject.setOperationID( link.getOperationId() );
        if( link.getParameters() != null ){
        for( String key : link.getParameters().keySet() )
        linkObject.addLinkParameterTuple(new LinkParameterTuple(key, link.getParameter(key)));
        }
        if( link.getDescription() != null )
        linkObject.setDescription( link.getDescription() );
        if( link.getServer() != null )
        linkObject.setServerObject( ServerObject.parseServer(link.getServer()) );

        return linkObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public LinkOb() {
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
  public LinkOb clone() throws CloneNotSupportedException {
    LinkOb node = (LinkOb) super.clone();
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
  public abstract LinkOb fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  public abstract LinkOb treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:58
   */
  public abstract LinkOb treeCopy();
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
