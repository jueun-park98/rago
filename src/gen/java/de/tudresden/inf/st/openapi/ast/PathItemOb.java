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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:38
 * @astdecl PathItemOb : ASTNode;
 * @production PathItemOb : {@link ASTNode};

 */
public abstract class PathItemOb extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:272
   */
  public static Path composePath (PathItem pathItem){
        Path path = new Path();

        if( !pathItem.getRef().isEmpty() )
        path.setRef(pathItem.getRef());
        if( !pathItem.getSummary().isEmpty())
        path.setSummary(pathItem.getSummary());
        if( !pathItem.getDescription().isEmpty() )
        path.setDescription(pathItem.getDescription());
        if( pathItem.hasGet() )
        path.setGet( OperationObject.composeOperation(pathItem.getGet().getOperationObject()) );
        if( pathItem.hasPut() )
        path.setPut( OperationObject.composeOperation(pathItem.getPut().getOperationObject()) );
        if( pathItem.hasPost() )
        path.setPost( OperationObject.composeOperation(pathItem.getPost().getOperationObject()) );
        if( pathItem.hasDelete() )
        path.setDelete( OperationObject.composeOperation(pathItem.getDelete().getOperationObject()) );
        if( pathItem.hasOptions() )
        path.setOptions( OperationObject.composeOperation(pathItem.getOptions().getOperationObject()) );
        if( pathItem.hasHead() )
        path.setHead( OperationObject.composeOperation(pathItem.getHead().getOperationObject()) );
        if( pathItem.hasPatch() )
        path.setPatch( OperationObject.composeOperation(pathItem.getPatch().getOperationObject()) );
        if( pathItem.getNumServerObject() != 0 ){
        for( ServerObject s : pathItem.getServerObjects() )
        path.addServer( ServerObject.composeServer(s) );
        }
        if( pathItem.getNumParameterObject() != 0 ){
        for( ParameterObject p : pathItem.getParameterObjects() )
        path.addParameter( ParameterObject.composeParameter(p) );
        }
        if( pathItem.getNumExtension() != 0 ){
        Map<String, Object> extensionMap = new HashMap<>();
        for( Extension e : pathItem.getExtensions() )
        extensionMap.put(e.getKey(), e.getValue());
        path.setExtensions(extensionMap);
        }

        return path;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:277
   */
  public static PathItem parsePath(Path path){
        PathItem pathItem = new PathItem();

        if( path.getRef() != null )
        pathItem.setRef(path.getRef());
        if( path.getSummary() != null )
        pathItem.setSummary(path.getSummary());
        if( path.getDescription() != null )
        pathItem.setDescription(path.getDescription());
        if( path.getGet() != null ){
        Get get = new Get();
        get.setOperationObject( OperationObject.parseOperation( path.getGet() ) );
        pathItem.setGet(get);
        }
        if( path.getPut() != null ){
        Put put = new Put();
        put.setOperationObject( OperationObject.parseOperation( path.getPut() ) );
        pathItem.setPut(put);
        }
        if( path.getPost() != null ){
        Post post = new Post();
        post.setOperationObject( OperationObject.parseOperation( path.getPost() ) );
        pathItem.setPost(post);
        }
        if( path.getDelete() != null ){
        Delete delete = new Delete();
        delete.setOperationObject( OperationObject.parseOperation( path.getDelete() ) );
        pathItem.setDelete(delete);
        }
        if( path.getOptions() != null ){
        Options options = new Options();
        options.setOperationObject( OperationObject.parseOperation( path.getOptions() ) );
        pathItem.setOptions(options);
        }
        if( path.getHead() != null ){
        Head head = new Head();
        head.setOperationObject( OperationObject.parseOperation( path.getHead() ) );
        pathItem.setHead(head);
        }
        if( path.getPatch() != null ){
        Patch patch = new Patch();
        patch.setOperationObject( OperationObject.parseOperation( path.getPatch() ) );
        pathItem.setPatch(patch);
        }
        if( path.getTrace() != null ){
        Trace trace = new Trace();
        trace.setOperationObject( OperationObject.parseOperation( path.getTrace() ) );
        pathItem.setTrace(trace);
        }
        if( path.getServers() != null ){
        for(Server s : path.getServers())
        pathItem.addServerObject( ServerObject.parseServer(s));
        }
        if( path.getParameters() != null ){
        for(Parameter p : path.getParameters()){
        if( p.isRef() ) {
        ParameterObject parameterObject = new ParameterObject();
        parameterObject.setRef(p.getRef());
        pathItem.addParameterObject(parameterObject);
        }
        else
        pathItem.addParameterObject(ParameterObject.parseParameter(p));
        }
        }
        if( path.getExtensions() != null ){
        for( String key : path.getExtensions().keySet() )
        pathItem.addExtension(new Extension(key, path.getExtensions().get(key)));
        }

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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
