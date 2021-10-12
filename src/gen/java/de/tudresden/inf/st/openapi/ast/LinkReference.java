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
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:91
 * @astdecl LinkReference : LinkOb ::= <Ref:String>;
 * @production LinkReference : {@link LinkOb} ::= <span class="component">&lt;Ref:String&gt;</span>;

 */
public class LinkReference extends LinkOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public LinkReference() {
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
    name = {"Ref"},
    type = {"String"},
    kind = {"Token"}
  )
  public LinkReference(String p0) {
    setRef(p0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public LinkReference clone() throws CloneNotSupportedException {
    LinkReference node = (LinkReference) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public LinkReference copy() {
    try {
      LinkReference node = (LinkReference) clone();
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
   * @declaredat ASTNode:63
   */
  @Deprecated
  public LinkReference fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public LinkReference treeCopyNoTransform() {
    LinkReference tree = (LinkReference) copy();
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
   * @declaredat ASTNode:93
   */
  public LinkReference treeCopy() {
    LinkReference tree = (LinkReference) copy();
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
   * @declaredat ASTNode:107
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Ref == ((LinkReference) node).tokenString_Ref);    
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
/** @apilevel internal */
protected boolean linkObject_visited = false;
  /**
   * @attribute syn
   * @aspect Reference
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Reference.jrag:53
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Reference", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Reference.jrag:53")
  public LinkObject linkObject() {
    if (linkObject_visited) {
      throw new RuntimeException("Circular definition of attribute LinkOb.linkObject().");
    }
    linkObject_visited = true;
    try {
            for( LinkTuple t : root().linkTuples() ){
            if( t.getKey().equals(getRef().substring(getRef().lastIndexOf("/")+1, getRef().length())) )
            return t.getLinkOb().linkObject();
            }
            return new LinkObject();
        }
    finally {
      linkObject_visited = false;
    }
  }
/** @apilevel internal */
protected java.util.Set composeLink_LinkOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:596
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:596")
  public Link composeLink(LinkOb linkOb, Map<Object, ASTNode> map) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(linkOb);
    _parameters.add(map);
    if (composeLink_LinkOb_Map_Object__ASTNode__visited == null) composeLink_LinkOb_Map_Object__ASTNode__visited = new java.util.HashSet(4);
    if (composeLink_LinkOb_Map_Object__ASTNode__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute LinkOb.composeLink(LinkOb,Map_Object__ASTNode_).");
    }
    composeLink_LinkOb_Map_Object__ASTNode__visited.add(_parameters);
    try {
            Link link = new Link();
            LinkReference l = (LinkReference) linkOb;
    
            if( !l.getRef().isEmpty() )
            link.setRef(l.getRef());
    
            return link;
            }
    finally {
      composeLink_LinkOb_Map_Object__ASTNode__visited.remove(_parameters);
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
