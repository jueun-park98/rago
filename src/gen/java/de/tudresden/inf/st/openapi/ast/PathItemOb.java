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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:38
 * @astdecl PathItemOb : ASTNode;
 * @production PathItemOb : {@link ASTNode};

 */
public abstract class PathItemOb extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:190
   */
  public static PathItemOb parsePath(Path path, OAIContext context, Map<Object, ASTNode> map) throws DecodeException {
        PathItemObject pathItem = new PathItemObject();

        if( path.isRef() ){
        PathItemReference p = new PathItemReference();
        p.setRef(path.getRef());
        p.setPathItemOb((PathItemObject) parsePath(path.getReference(context).getMappedContent(Path.class), context, map));
        return p;
        } else {
        if( path.getSummary() != null )
        pathItem.setSummary(path.getSummary());
        if( path.getDescription() != null )
        pathItem.setDescription(path.getDescription());
        if( path.getGet() != null ){
        Get get = new Get();
        get.setOperationObject( OperationObject.parseOperation( path.getGet(), context, map ) );
        pathItem.setGet(get);
        }
        if( path.getPut() != null ){
        Put put = new Put();
        put.setOperationObject( OperationObject.parseOperation( path.getPut(), context, map ) );
        pathItem.setPut(put);
        }
        if( path.getPost() != null ){
        Post post = new Post();
        post.setOperationObject( OperationObject.parseOperation( path.getPost(), context, map ) );
        pathItem.setPost(post);
        }
        if( path.getDelete() != null ){
        Delete delete = new Delete();
        delete.setOperationObject( OperationObject.parseOperation( path.getDelete(), context, map ) );
        pathItem.setDelete(delete);
        }
        if( path.getOptions() != null ){
        Options options = new Options();
        options.setOperationObject( OperationObject.parseOperation( path.getOptions(), context, map ) );
        pathItem.setOptions(options);
        }
        if( path.getHead() != null ){
        Head head = new Head();
        head.setOperationObject( OperationObject.parseOperation( path.getHead(), context, map ) );
        pathItem.setHead(head);
        }
        if( path.getPatch() != null ){
        Patch patch = new Patch();
        patch.setOperationObject( OperationObject.parseOperation( path.getPatch(), context, map ) );
        pathItem.setPatch(patch);
        }
        if( path.getTrace() != null ){
        Trace trace = new Trace();
        trace.setOperationObject( OperationObject.parseOperation( path.getTrace(), context, map ) );
        pathItem.setTrace(trace);
        }
        if( path.getServers() != null ){
        for(Server s : path.getServers())
        pathItem.addServerObject( ServerObject.parseServer(s, map));
        }
        if( path.getParameters() != null ){
        for(Parameter p : path.getParameters())
        pathItem.addParameterOb(ParameterOb.parseParameter(p, context, map));
        }
        if( path.getExtensions() != null ){
        for( String key : path.getExtensions().keySet() )
        pathItem.addExtension(new Extension(key, path.getExtensions().get(key)));
        }
        }

        map.put(path, pathItem);
        return pathItem;
        }
  /**
   * @declaredat ASTNode:1
   */
  public PathItemOb() {
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
  public PathItemOb clone() throws CloneNotSupportedException {
    PathItemOb node = (PathItemOb) super.clone();
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
  public abstract PathItemOb fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  public abstract PathItemOb treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:58
   */
  public abstract PathItemOb treeCopy();
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:262
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:262")
  public abstract Path composePath(PathItemOb pathItem, Map<Object, ASTNode> map);
  /**
   * @attribute syn
   * @aspect RefGet
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RefGet.jrag:21
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="RefGet", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RefGet.jrag:21")
  public abstract PathItemObject pathItemObject();
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
