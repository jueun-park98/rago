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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:76
 * @astdecl ResponseOb : ASTNode;
 * @production ResponseOb : {@link ASTNode};

 */
public abstract class ResponseOb extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:475
   */
  public static Response composeResponse (ResponseObject responseObject, Map<Object, ASTNode> map){
        Response response = new Response();

        if( !responseObject.getRef().isEmpty() )
        response.setRef(responseObject.getRef());
        if( !responseObject.getDescription().isEmpty() )
        response.setDescription(responseObject.getDescription());
        if( responseObject.getNumHeaderTuple() != 0 ){
        Map<String, Header> headers = new HashMap<>();
        for( HeaderTuple t : responseObject.getHeaderTuples() )
        headers.put(t.getKey(), HeaderObject.composeHeader(t.getHeaderObject()));
        response.setHeaders(headers);
        }
        if( responseObject.getNumContentTuple() != 0 ){
        Map<String, MediaType> contents = new HashMap<>();
        for( ContentTuple t : responseObject.getContentTuples() )
        contents.put(t.getKey(), MediaTypeObject.composeMediaType(t.getMediaTypeObject()));
        response.setContentMediaTypes(contents);
        }
        if( responseObject.getNumLinkTuple() != 0 ){
        Map<String, Link> links = new HashMap<>();
        for( LinkTuple t : responseObject.getLinkTuples() )
        links.put(t.getKey(), LinkObject.composeLink(t.getLinkObject()));
        response.setLinks(links);
        }

        return response;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:476
   */
  public static ResponseOb parseResponse(Response response, OAIContext context, Map<Object, ASTNode> map) throws DecodeException {
        ResponseObject responseObject = new ResponseObject();

        if( response.isRef() ){
        ResponseReference r = new ResponseReference();
        r.setRef(response.getRef());
        r.setResponseOb(parseResponse(response.getReference(context).getMappedContent(Response.class), context, map));
        return r;
        } else {
        if( response.getDescription() != null )
        responseObject.setDescription(response.getDescription());
        if( response.getHeaders() != null ){
        for( String key : response.getHeaders().keySet() )
        responseObject.addHeaderTuple( new HeaderTuple(key, HeaderObject.parseHeader(response.getHeader(key), context, map)) );
        }
        if( response.getContentMediaTypes() != null ){
        for( String key : response.getContentMediaTypes().keySet() )
        responseObject.addContentTuple( new ContentTuple(key, MediaTypeObject.parseMediaType(response.getContentMediaType(key), context, map)) );
        }
        if( response.getLinks() != null ){
        for( String key : response.getLinks().keySet() )
        responseObject.addLinkTuple( new LinkTuple(key, LinkOb.parseLink(response.getLink(key), context, map)) );
        }
        if( response.getExtensions() != null ){
        for( String key : response.getExtensions().keySet() )
        responseObject.addExtension(new Extension(key, response.getExtensions().get(key)));
        }
        }

        map.put(response, responseObject);
        return responseObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public ResponseOb() {
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
  public ResponseOb clone() throws CloneNotSupportedException {
    ResponseOb node = (ResponseOb) super.clone();
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
  public abstract ResponseOb fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  public abstract ResponseOb treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:58
   */
  public abstract ResponseOb treeCopy();
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
