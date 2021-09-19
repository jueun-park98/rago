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
/**
 * @ast node
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:107
 * @astdecl SchemaReference : SchemaOb ::= <Ref:String> <SchemaOb:SchemaOb>;
 * @production SchemaReference : {@link SchemaOb} ::= <span class="component">&lt;Ref:String&gt;</span> <span class="component">&lt;SchemaOb:SchemaOb&gt;</span>;

 */
public class SchemaReference extends SchemaOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public SchemaReference() {
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
    name = {"Ref", "SchemaOb"},
    type = {"String", "SchemaOb"},
    kind = {"Token", "Token"}
  )
  public SchemaReference(String p0, SchemaOb p1) {
    setRef(p0);
    setSchemaOb(p1);
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
  public SchemaReference clone() throws CloneNotSupportedException {
    SchemaReference node = (SchemaReference) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public SchemaReference copy() {
    try {
      SchemaReference node = (SchemaReference) clone();
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
  public SchemaReference fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public SchemaReference treeCopyNoTransform() {
    SchemaReference tree = (SchemaReference) copy();
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
  public SchemaReference treeCopy() {
    SchemaReference tree = (SchemaReference) copy();
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
    return super.is$Equal(node) && (tokenString_Ref == ((SchemaReference) node).tokenString_Ref) && (tokenSchemaOb_SchemaOb == ((SchemaReference) node).tokenSchemaOb_SchemaOb);    
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
   * Replaces the lexeme SchemaOb.
   * @param value The new value for the lexeme SchemaOb.
   * @apilevel high-level
   */
  public void setSchemaOb(SchemaOb value) {
    tokenSchemaOb_SchemaOb = value;
  }
  /** @apilevel internal 
   */
  protected SchemaOb tokenSchemaOb_SchemaOb;
  /**
   * Retrieves the value for the lexeme SchemaOb.
   * @return The value for the lexeme SchemaOb.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="SchemaOb")
  public SchemaOb getSchemaOb() {
    return tokenSchemaOb_SchemaOb;
  }
/** @apilevel internal */
protected boolean schemaObject_visited = false;
  /**
   * @attribute syn
   * @aspect ReferenceGet
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/ReferenceGet.jrag:12
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ReferenceGet", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/ReferenceGet.jrag:12")
  public SchemaObject schemaObject() {
    if (schemaObject_visited) {
      throw new RuntimeException("Circular definition of attribute SchemaOb.schemaObject().");
    }
    schemaObject_visited = true;
    try {
        if( getSchemaOb() instanceof SchemaObject )
            return (SchemaObject) getSchemaOb();
        else
            return getSchemaOb().schemaObject();
        }
    finally {
      schemaObject_visited = false;
    }
  }
/** @apilevel internal */
protected java.util.Set composeSchema_SchemaOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:701
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:701")
  public org.openapi4j.parser.model.v3.Schema composeSchema(SchemaOb schemaOb, Map<Object, ASTNode> map) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(schemaOb);
    _parameters.add(map);
    if (composeSchema_SchemaOb_Map_Object__ASTNode__visited == null) composeSchema_SchemaOb_Map_Object__ASTNode__visited = new java.util.HashSet(4);
    if (composeSchema_SchemaOb_Map_Object__ASTNode__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute SchemaOb.composeSchema(SchemaOb,Map_Object__ASTNode_).");
    }
    composeSchema_SchemaOb_Map_Object__ASTNode__visited.add(_parameters);
    try {
            org.openapi4j.parser.model.v3.Schema schema = new org.openapi4j.parser.model.v3.Schema();
            SchemaReference s = (SchemaReference) schemaOb;
    
            if( !s.getRef().isEmpty() )
            schema.setRef(s.getRef());
    
            return schema;
            }
    finally {
      composeSchema_SchemaOb_Map_Object__ASTNode__visited.remove(_parameters);
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
