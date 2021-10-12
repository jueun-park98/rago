/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.util.Random;
import java.util.stream.IntStream;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.core.model.reference.Reference;
import org.openapi4j.core.model.OAIContext;
import java.io.IOException;
import java.util.*;
import org.openapi4j.core.exception.DecodeException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
/**
 * @ast node
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:39
 * @astdecl PathItemObject : ASTNode ::= <Summary:String> <Description:String> [Get] [Put] [Post] [Delete] [Options] [Head] [Patch] [Trace] ServerObject* ParameterOb* Extension*;
 * @production PathItemObject : {@link ASTNode} ::= <span class="component">&lt;Summary:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">[{@link Get}]</span> <span class="component">[{@link Put}]</span> <span class="component">[{@link Post}]</span> <span class="component">[{@link Delete}]</span> <span class="component">[{@link Options}]</span> <span class="component">[{@link Head}]</span> <span class="component">[{@link Patch}]</span> <span class="component">[{@link Trace}]</span> <span class="component">{@link ServerObject}*</span> <span class="component">{@link ParameterOb}*</span> <span class="component">{@link Extension}*</span>;

 */
public class PathItemObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:262
   */
  public static Path composePath (PathItemObject pathItem, Map<Object, ASTNode> map){
        Path path = new Path();
        PathItemObject p = (PathItemObject) pathItem;

        if( !p.getSummary().isEmpty())
        path.setSummary(p.getSummary());
        if( !p.getDescription().isEmpty() )
        path.setDescription(p.getDescription());
        if( p.hasGet() )
        path.setGet( OperationObject.composeOperation(p.getGet().getOperationObject(), map) );
        if( p.hasPut() )
        path.setPut( OperationObject.composeOperation(p.getPut().getOperationObject(), map) );
        if( p.hasPost() )
        path.setPost( OperationObject.composeOperation(p.getPost().getOperationObject(), map) );
        if( p.hasDelete() )
        path.setDelete( OperationObject.composeOperation(p.getDelete().getOperationObject(), map) );
        if( p.hasOptions() )
        path.setOptions( OperationObject.composeOperation(p.getOptions().getOperationObject(), map) );
        if( p.hasHead() )
        path.setHead( OperationObject.composeOperation(p.getHead().getOperationObject(), map) );
        if( p.hasPatch() )
        path.setPatch( OperationObject.composeOperation(p.getPatch().getOperationObject(), map) );
        if( p.getNumServerObject() != 0 ){
        for( ServerObject s : p.getServerObjects() )
        path.addServer( ServerObject.composeServer(s, map) );
        }
        if( p.getNumParameterOb() != 0 ){
        for( ParameterOb e : p.getParameterObs() )
        path.addParameter( e.composeParameter(e, map) );
        }
        if( p.getNumExtension() != 0 ){
        Map<String, Object> extensionMap = new HashMap<>();
        for( Extension e : p.getExtensions() )
        extensionMap.put(e.getKey(), e.getValue());
        path.setExtensions(extensionMap);
        }

        return path;
    }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:225
   */
  public static PathItemObject parsePath(Path path, OAIContext context, Map<Object, ASTNode> map) throws DecodeException {
        PathItemObject pathItem = new PathItemObject();

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

        map.put(path, pathItem);
        return pathItem;
        }
  /**
   * @declaredat ASTNode:1
   */
  public PathItemObject() {
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
    children = new ASTNode[11];
    setChild(new Opt(), 0);
    setChild(new Opt(), 1);
    setChild(new Opt(), 2);
    setChild(new Opt(), 3);
    setChild(new Opt(), 4);
    setChild(new Opt(), 5);
    setChild(new Opt(), 6);
    setChild(new Opt(), 7);
    setChild(new JastAddList(), 8);
    setChild(new JastAddList(), 9);
    setChild(new JastAddList(), 10);
  }
  /**
   * @declaredat ASTNode:24
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Summary", "Description", "Get", "Put", "Post", "Delete", "Options", "Head", "Patch", "Trace", "ServerObject", "ParameterOb", "Extension"},
    type = {"String", "String", "Opt<Get>", "Opt<Put>", "Opt<Post>", "Opt<Delete>", "Opt<Options>", "Opt<Head>", "Opt<Patch>", "Opt<Trace>", "JastAddList<ServerObject>", "JastAddList<ParameterOb>", "JastAddList<Extension>"},
    kind = {"Token", "Token", "Opt", "Opt", "Opt", "Opt", "Opt", "Opt", "Opt", "Opt", "List", "List", "List"}
  )
  public PathItemObject(String p0, String p1, Opt<Get> p2, Opt<Put> p3, Opt<Post> p4, Opt<Delete> p5, Opt<Options> p6, Opt<Head> p7, Opt<Patch> p8, Opt<Trace> p9, JastAddList<ServerObject> p10, JastAddList<ParameterOb> p11, JastAddList<Extension> p12) {
    setSummary(p0);
    setDescription(p1);
    setChild(p2, 0);
    setChild(p3, 1);
    setChild(p4, 2);
    setChild(p5, 3);
    setChild(p6, 4);
    setChild(p7, 5);
    setChild(p8, 6);
    setChild(p9, 7);
    setChild(p10, 8);
    setChild(p11, 9);
    setChild(p12, 10);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:45
   */
  protected int numChildren() {
    return 11;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:51
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:55
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:59
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:63
   */
  public PathItemObject clone() throws CloneNotSupportedException {
    PathItemObject node = (PathItemObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:68
   */
  public PathItemObject copy() {
    try {
      PathItemObject node = (PathItemObject) clone();
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
   * @declaredat ASTNode:87
   */
  @Deprecated
  public PathItemObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:97
   */
  public PathItemObject treeCopyNoTransform() {
    PathItemObject tree = (PathItemObject) copy();
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
   * @declaredat ASTNode:117
   */
  public PathItemObject treeCopy() {
    PathItemObject tree = (PathItemObject) copy();
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
   * @declaredat ASTNode:131
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Summary == ((PathItemObject) node).tokenString_Summary) && (tokenString_Description == ((PathItemObject) node).tokenString_Description);    
  }
  /**
   * Replaces the lexeme Summary.
   * @param value The new value for the lexeme Summary.
   * @apilevel high-level
   */
  public void setSummary(String value) {
    tokenString_Summary = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Summary;
  /**
   * Retrieves the value for the lexeme Summary.
   * @return The value for the lexeme Summary.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Summary")
  public String getSummary() {
    return tokenString_Summary != null ? tokenString_Summary : "";
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
   * Replaces the optional node for the Get child. This is the <code>Opt</code>
   * node containing the child Get, not the actual child!
   * @param opt The new node to be used as the optional node for the Get child.
   * @apilevel low-level
   */
  public void setGetOpt(Opt<Get> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) Get child.
   * @param node The new node to be used as the Get child.
   * @apilevel high-level
   */
  public void setGet(Get node) {
    getGetOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Get child exists.
   * @return {@code true} if the optional Get child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasGet() {
    return getGetOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Get child.
   * @return The Get child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Get getGet() {
    return (Get) getGetOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Get child. This is the <code>Opt</code> node containing the child Get, not the actual child!
   * @return The optional node for child the Get child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Get")
  public Opt<Get> getGetOpt() {
    return (Opt<Get>) getChild(0);
  }
  /**
   * Retrieves the optional node for child Get. This is the <code>Opt</code> node containing the child Get, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Get.
   * @apilevel low-level
   */
  public Opt<Get> getGetOptNoTransform() {
    return (Opt<Get>) getChildNoTransform(0);
  }
  /**
   * Replaces the optional node for the Put child. This is the <code>Opt</code>
   * node containing the child Put, not the actual child!
   * @param opt The new node to be used as the optional node for the Put child.
   * @apilevel low-level
   */
  public void setPutOpt(Opt<Put> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) Put child.
   * @param node The new node to be used as the Put child.
   * @apilevel high-level
   */
  public void setPut(Put node) {
    getPutOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Put child exists.
   * @return {@code true} if the optional Put child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasPut() {
    return getPutOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Put child.
   * @return The Put child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Put getPut() {
    return (Put) getPutOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Put child. This is the <code>Opt</code> node containing the child Put, not the actual child!
   * @return The optional node for child the Put child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Put")
  public Opt<Put> getPutOpt() {
    return (Opt<Put>) getChild(1);
  }
  /**
   * Retrieves the optional node for child Put. This is the <code>Opt</code> node containing the child Put, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Put.
   * @apilevel low-level
   */
  public Opt<Put> getPutOptNoTransform() {
    return (Opt<Put>) getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the Post child. This is the <code>Opt</code>
   * node containing the child Post, not the actual child!
   * @param opt The new node to be used as the optional node for the Post child.
   * @apilevel low-level
   */
  public void setPostOpt(Opt<Post> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) Post child.
   * @param node The new node to be used as the Post child.
   * @apilevel high-level
   */
  public void setPost(Post node) {
    getPostOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Post child exists.
   * @return {@code true} if the optional Post child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasPost() {
    return getPostOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Post child.
   * @return The Post child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Post getPost() {
    return (Post) getPostOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Post child. This is the <code>Opt</code> node containing the child Post, not the actual child!
   * @return The optional node for child the Post child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Post")
  public Opt<Post> getPostOpt() {
    return (Opt<Post>) getChild(2);
  }
  /**
   * Retrieves the optional node for child Post. This is the <code>Opt</code> node containing the child Post, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Post.
   * @apilevel low-level
   */
  public Opt<Post> getPostOptNoTransform() {
    return (Opt<Post>) getChildNoTransform(2);
  }
  /**
   * Replaces the optional node for the Delete child. This is the <code>Opt</code>
   * node containing the child Delete, not the actual child!
   * @param opt The new node to be used as the optional node for the Delete child.
   * @apilevel low-level
   */
  public void setDeleteOpt(Opt<Delete> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) Delete child.
   * @param node The new node to be used as the Delete child.
   * @apilevel high-level
   */
  public void setDelete(Delete node) {
    getDeleteOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Delete child exists.
   * @return {@code true} if the optional Delete child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasDelete() {
    return getDeleteOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Delete child.
   * @return The Delete child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Delete getDelete() {
    return (Delete) getDeleteOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Delete child. This is the <code>Opt</code> node containing the child Delete, not the actual child!
   * @return The optional node for child the Delete child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Delete")
  public Opt<Delete> getDeleteOpt() {
    return (Opt<Delete>) getChild(3);
  }
  /**
   * Retrieves the optional node for child Delete. This is the <code>Opt</code> node containing the child Delete, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Delete.
   * @apilevel low-level
   */
  public Opt<Delete> getDeleteOptNoTransform() {
    return (Opt<Delete>) getChildNoTransform(3);
  }
  /**
   * Replaces the optional node for the Options child. This is the <code>Opt</code>
   * node containing the child Options, not the actual child!
   * @param opt The new node to be used as the optional node for the Options child.
   * @apilevel low-level
   */
  public void setOptionsOpt(Opt<Options> opt) {
    setChild(opt, 4);
  }
  /**
   * Replaces the (optional) Options child.
   * @param node The new node to be used as the Options child.
   * @apilevel high-level
   */
  public void setOptions(Options node) {
    getOptionsOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Options child exists.
   * @return {@code true} if the optional Options child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasOptions() {
    return getOptionsOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Options child.
   * @return The Options child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Options getOptions() {
    return (Options) getOptionsOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Options child. This is the <code>Opt</code> node containing the child Options, not the actual child!
   * @return The optional node for child the Options child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Options")
  public Opt<Options> getOptionsOpt() {
    return (Opt<Options>) getChild(4);
  }
  /**
   * Retrieves the optional node for child Options. This is the <code>Opt</code> node containing the child Options, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Options.
   * @apilevel low-level
   */
  public Opt<Options> getOptionsOptNoTransform() {
    return (Opt<Options>) getChildNoTransform(4);
  }
  /**
   * Replaces the optional node for the Head child. This is the <code>Opt</code>
   * node containing the child Head, not the actual child!
   * @param opt The new node to be used as the optional node for the Head child.
   * @apilevel low-level
   */
  public void setHeadOpt(Opt<Head> opt) {
    setChild(opt, 5);
  }
  /**
   * Replaces the (optional) Head child.
   * @param node The new node to be used as the Head child.
   * @apilevel high-level
   */
  public void setHead(Head node) {
    getHeadOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Head child exists.
   * @return {@code true} if the optional Head child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasHead() {
    return getHeadOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Head child.
   * @return The Head child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Head getHead() {
    return (Head) getHeadOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Head child. This is the <code>Opt</code> node containing the child Head, not the actual child!
   * @return The optional node for child the Head child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Head")
  public Opt<Head> getHeadOpt() {
    return (Opt<Head>) getChild(5);
  }
  /**
   * Retrieves the optional node for child Head. This is the <code>Opt</code> node containing the child Head, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Head.
   * @apilevel low-level
   */
  public Opt<Head> getHeadOptNoTransform() {
    return (Opt<Head>) getChildNoTransform(5);
  }
  /**
   * Replaces the optional node for the Patch child. This is the <code>Opt</code>
   * node containing the child Patch, not the actual child!
   * @param opt The new node to be used as the optional node for the Patch child.
   * @apilevel low-level
   */
  public void setPatchOpt(Opt<Patch> opt) {
    setChild(opt, 6);
  }
  /**
   * Replaces the (optional) Patch child.
   * @param node The new node to be used as the Patch child.
   * @apilevel high-level
   */
  public void setPatch(Patch node) {
    getPatchOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Patch child exists.
   * @return {@code true} if the optional Patch child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasPatch() {
    return getPatchOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Patch child.
   * @return The Patch child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Patch getPatch() {
    return (Patch) getPatchOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Patch child. This is the <code>Opt</code> node containing the child Patch, not the actual child!
   * @return The optional node for child the Patch child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Patch")
  public Opt<Patch> getPatchOpt() {
    return (Opt<Patch>) getChild(6);
  }
  /**
   * Retrieves the optional node for child Patch. This is the <code>Opt</code> node containing the child Patch, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Patch.
   * @apilevel low-level
   */
  public Opt<Patch> getPatchOptNoTransform() {
    return (Opt<Patch>) getChildNoTransform(6);
  }
  /**
   * Replaces the optional node for the Trace child. This is the <code>Opt</code>
   * node containing the child Trace, not the actual child!
   * @param opt The new node to be used as the optional node for the Trace child.
   * @apilevel low-level
   */
  public void setTraceOpt(Opt<Trace> opt) {
    setChild(opt, 7);
  }
  /**
   * Replaces the (optional) Trace child.
   * @param node The new node to be used as the Trace child.
   * @apilevel high-level
   */
  public void setTrace(Trace node) {
    getTraceOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Trace child exists.
   * @return {@code true} if the optional Trace child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasTrace() {
    return getTraceOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Trace child.
   * @return The Trace child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Trace getTrace() {
    return (Trace) getTraceOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Trace child. This is the <code>Opt</code> node containing the child Trace, not the actual child!
   * @return The optional node for child the Trace child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Trace")
  public Opt<Trace> getTraceOpt() {
    return (Opt<Trace>) getChild(7);
  }
  /**
   * Retrieves the optional node for child Trace. This is the <code>Opt</code> node containing the child Trace, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Trace.
   * @apilevel low-level
   */
  public Opt<Trace> getTraceOptNoTransform() {
    return (Opt<Trace>) getChildNoTransform(7);
  }
  /**
   * Replaces the ServerObject list.
   * @param list The new list node to be used as the ServerObject list.
   * @apilevel high-level
   */
  public void setServerObjectList(JastAddList<ServerObject> list) {
    setChild(list, 8);
  }
  /**
   * Retrieves the number of children in the ServerObject list.
   * @return Number of children in the ServerObject list.
   * @apilevel high-level
   */
  public int getNumServerObject() {
    return getServerObjectList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ServerObject list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ServerObject list.
   * @apilevel low-level
   */
  public int getNumServerObjectNoTransform() {
    return getServerObjectListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ServerObject list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ServerObject list.
   * @apilevel high-level
   */
  public ServerObject getServerObject(int i) {
    return (ServerObject) getServerObjectList().getChild(i);
  }
  /**
   * Check whether the ServerObject list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasServerObject() {
    return getServerObjectList().getNumChild() != 0;
  }
  /**
   * Append an element to the ServerObject list.
   * @param node The element to append to the ServerObject list.
   * @apilevel high-level
   */
  public void addServerObject(ServerObject node) {
    JastAddList<ServerObject> list = (parent == null) ? getServerObjectListNoTransform() : getServerObjectList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addServerObjectNoTransform(ServerObject node) {
    JastAddList<ServerObject> list = getServerObjectListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ServerObject list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setServerObject(ServerObject node, int i) {
    JastAddList<ServerObject> list = getServerObjectList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ServerObject list.
   * @return The node representing the ServerObject list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ServerObject")
  public JastAddList<ServerObject> getServerObjectList() {
    JastAddList<ServerObject> list = (JastAddList<ServerObject>) getChild(8);
    return list;
  }
  /**
   * Retrieves the ServerObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerObject list.
   * @apilevel low-level
   */
  public JastAddList<ServerObject> getServerObjectListNoTransform() {
    return (JastAddList<ServerObject>) getChildNoTransform(8);
  }
  /**
   * @return the element at index {@code i} in the ServerObject list without
   * triggering rewrites.
   */
  public ServerObject getServerObjectNoTransform(int i) {
    return (ServerObject) getServerObjectListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ServerObject list.
   * @return The node representing the ServerObject list.
   * @apilevel high-level
   */
  public JastAddList<ServerObject> getServerObjects() {
    return getServerObjectList();
  }
  /**
   * Retrieves the ServerObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerObject list.
   * @apilevel low-level
   */
  public JastAddList<ServerObject> getServerObjectsNoTransform() {
    return getServerObjectListNoTransform();
  }
  /**
   * Replaces the ParameterOb list.
   * @param list The new list node to be used as the ParameterOb list.
   * @apilevel high-level
   */
  public void setParameterObList(JastAddList<ParameterOb> list) {
    setChild(list, 9);
  }
  /**
   * Retrieves the number of children in the ParameterOb list.
   * @return Number of children in the ParameterOb list.
   * @apilevel high-level
   */
  public int getNumParameterOb() {
    return getParameterObList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ParameterOb list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ParameterOb list.
   * @apilevel low-level
   */
  public int getNumParameterObNoTransform() {
    return getParameterObListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ParameterOb list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ParameterOb list.
   * @apilevel high-level
   */
  public ParameterOb getParameterOb(int i) {
    return (ParameterOb) getParameterObList().getChild(i);
  }
  /**
   * Check whether the ParameterOb list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParameterOb() {
    return getParameterObList().getNumChild() != 0;
  }
  /**
   * Append an element to the ParameterOb list.
   * @param node The element to append to the ParameterOb list.
   * @apilevel high-level
   */
  public void addParameterOb(ParameterOb node) {
    JastAddList<ParameterOb> list = (parent == null) ? getParameterObListNoTransform() : getParameterObList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addParameterObNoTransform(ParameterOb node) {
    JastAddList<ParameterOb> list = getParameterObListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ParameterOb list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParameterOb(ParameterOb node, int i) {
    JastAddList<ParameterOb> list = getParameterObList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ParameterOb list.
   * @return The node representing the ParameterOb list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ParameterOb")
  public JastAddList<ParameterOb> getParameterObList() {
    JastAddList<ParameterOb> list = (JastAddList<ParameterOb>) getChild(9);
    return list;
  }
  /**
   * Retrieves the ParameterOb list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParameterOb list.
   * @apilevel low-level
   */
  public JastAddList<ParameterOb> getParameterObListNoTransform() {
    return (JastAddList<ParameterOb>) getChildNoTransform(9);
  }
  /**
   * @return the element at index {@code i} in the ParameterOb list without
   * triggering rewrites.
   */
  public ParameterOb getParameterObNoTransform(int i) {
    return (ParameterOb) getParameterObListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ParameterOb list.
   * @return The node representing the ParameterOb list.
   * @apilevel high-level
   */
  public JastAddList<ParameterOb> getParameterObs() {
    return getParameterObList();
  }
  /**
   * Retrieves the ParameterOb list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParameterOb list.
   * @apilevel low-level
   */
  public JastAddList<ParameterOb> getParameterObsNoTransform() {
    return getParameterObListNoTransform();
  }
  /**
   * Replaces the Extension list.
   * @param list The new list node to be used as the Extension list.
   * @apilevel high-level
   */
  public void setExtensionList(JastAddList<Extension> list) {
    setChild(list, 10);
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
    JastAddList<Extension> list = (JastAddList<Extension>) getChild(10);
    return list;
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionListNoTransform() {
    return (JastAddList<Extension>) getChildNoTransform(10);
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
