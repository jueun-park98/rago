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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:39
 * @astdecl PathItemReference : PathItemOb ::= <Ref:String> <PathItemOb:PathItemOb>;
 * @production PathItemReference : {@link PathItemOb} ::= <span class="component">&lt;Ref:String&gt;</span> <span class="component">&lt;PathItemOb:PathItemOb&gt;</span>;

 */
public class PathItemReference extends PathItemOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public PathItemReference() {
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
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Ref", "PathItemOb"},
    type = {"String", "PathItemOb"},
    kind = {"Token", "Token"}
  )
  public PathItemReference(String p0, PathItemOb p1) {
    setRef(p0);
    setPathItemOb(p1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public PathItemReference clone() throws CloneNotSupportedException {
    PathItemReference node = (PathItemReference) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public PathItemReference copy() {
    try {
      PathItemReference node = (PathItemReference) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public PathItemReference fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public PathItemReference treeCopyNoTransform() {
    PathItemReference tree = (PathItemReference) copy();
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
   * @declaredat ASTNode:94
   */
  public PathItemReference treeCopy() {
    PathItemReference tree = (PathItemReference) copy();
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
   * @declaredat ASTNode:108
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Ref == ((PathItemReference) node).tokenString_Ref) && (tokenPathItemOb_PathItemOb == ((PathItemReference) node).tokenPathItemOb_PathItemOb);    
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
  /**
   * Replaces the lexeme PathItemOb.
   * @param value The new value for the lexeme PathItemOb.
   * @apilevel high-level
   */
  public void setPathItemOb(PathItemOb value) {
    tokenPathItemOb_PathItemOb = value;
  }
  /** @apilevel internal 
   */
  protected PathItemOb tokenPathItemOb_PathItemOb;
  /**
   * Retrieves the value for the lexeme PathItemOb.
   * @return The value for the lexeme PathItemOb.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="PathItemOb")
  public PathItemOb getPathItemOb() {
    return tokenPathItemOb_PathItemOb;
  }
/** @apilevel internal */
protected java.util.Set composePath_PathItemOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:262
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:262")
  public Path composePath(PathItemOb pathItem, Map<Object, ASTNode> map) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(pathItem);
    _parameters.add(map);
    if (composePath_PathItemOb_Map_Object__ASTNode__visited == null) composePath_PathItemOb_Map_Object__ASTNode__visited = new java.util.HashSet(4);
    if (composePath_PathItemOb_Map_Object__ASTNode__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute PathItemOb.composePath(PathItemOb,Map_Object__ASTNode_).");
    }
    composePath_PathItemOb_Map_Object__ASTNode__visited.add(_parameters);
    try {
                Path path = new Path();
            PathItemReference p = (PathItemReference) pathItem;
    
            if( !p.getRef().isEmpty() )
            path.setRef(p.getRef());
    
            return path;
            }
    finally {
      composePath_PathItemOb_Map_Object__ASTNode__visited.remove(_parameters);
    }
  }
/** @apilevel internal */
protected boolean pathItemObject_visited = false;
  /**
   * @attribute syn
   * @aspect ReferenceGet
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\ReferenceGet.jrag:21
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ReferenceGet", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\ReferenceGet.jrag:21")
  public PathItemObject pathItemObject() {
    if (pathItemObject_visited) {
      throw new RuntimeException("Circular definition of attribute PathItemOb.pathItemObject().");
    }
    pathItemObject_visited = true;
    try {
            if( getPathItemOb() instanceof PathItemObject )
                return (PathItemObject) getPathItemOb();
            else
                return getPathItemOb().pathItemObject();
        }
    finally {
      pathItemObject_visited = false;
    }
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
