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
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:111
 * @astdecl PropertyItem : ASTNode ::= <Name:String> SchemaOb;
 * @production PropertyItem : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">{@link SchemaOb}</span>;

 */
public class PropertyItem extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public PropertyItem() {
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
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Name", "SchemaOb"},
    type = {"String", "SchemaOb"},
    kind = {"Token", "Child"}
  )
  public PropertyItem(String p0, SchemaOb p1) {
    setName(p0);
    setChild(p1, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:29
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public PropertyItem clone() throws CloneNotSupportedException {
    PropertyItem node = (PropertyItem) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public PropertyItem copy() {
    try {
      PropertyItem node = (PropertyItem) clone();
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
   * @declaredat ASTNode:65
   */
  @Deprecated
  public PropertyItem fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public PropertyItem treeCopyNoTransform() {
    PropertyItem tree = (PropertyItem) copy();
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
   * @declaredat ASTNode:95
   */
  public PropertyItem treeCopy() {
    PropertyItem tree = (PropertyItem) copy();
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
   * @declaredat ASTNode:109
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((PropertyItem) node).tokenString_Name);    
  }
  /**
   * Replaces the lexeme Name.
   * @param value The new value for the lexeme Name.
   * @apilevel high-level
   */
  public void setName(String value) {
    tokenString_Name = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Name;
  /**
   * Retrieves the value for the lexeme Name.
   * @return The value for the lexeme Name.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Name")
  public String getName() {
    return tokenString_Name != null ? tokenString_Name : "";
  }
  /**
   * Replaces the SchemaOb child.
   * @param node The new node to replace the SchemaOb child.
   * @apilevel high-level
   */
  public void setSchemaOb(SchemaOb node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the SchemaOb child.
   * @return The current node used as the SchemaOb child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="SchemaOb")
  public SchemaOb getSchemaOb() {
    return (SchemaOb) getChild(0);
  }
  /**
   * Retrieves the SchemaOb child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the SchemaOb child.
   * @apilevel low-level
   */
  public SchemaOb getSchemaObNoTransform() {
    return (SchemaOb) getChildNoTransform(0);
  }
/** @apilevel internal */
protected java.util.Set writePropertyName_SchemaOb_PropertyItem_visited;
  /**
   * @attribute syn
   * @aspect InferParameter
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:6
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="InferParameter", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:6")
  public String writePropertyName(SchemaOb schema, PropertyItem p) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(schema);
    _parameters.add(p);
    if (writePropertyName_SchemaOb_PropertyItem_visited == null) writePropertyName_SchemaOb_PropertyItem_visited = new java.util.HashSet(4);
    if (writePropertyName_SchemaOb_PropertyItem_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute PropertyItem.writePropertyName(SchemaOb,PropertyItem).");
    }
    writePropertyName_SchemaOb_PropertyItem_visited.add(_parameters);
    String writePropertyName_SchemaOb_PropertyItem_value = ((SchemaReference) schema).getRef().substring(((SchemaReference) schema).getRef().lastIndexOf("/") + 1) + p.getName();
    writePropertyName_SchemaOb_PropertyItem_visited.remove(_parameters);
    return writePropertyName_SchemaOb_PropertyItem_value;
  }
/** @apilevel internal */
protected java.util.Set writePropertyValue_JsonNode_PropertyItem_visited;
  /**
   * @attribute syn
   * @aspect InferParameter
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:8
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="InferParameter", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/InferParameter.jrag:8")
  public String writePropertyValue(JsonNode node, PropertyItem p) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(node);
    _parameters.add(p);
    if (writePropertyValue_JsonNode_PropertyItem_visited == null) writePropertyValue_JsonNode_PropertyItem_visited = new java.util.HashSet(4);
    if (writePropertyValue_JsonNode_PropertyItem_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute PropertyItem.writePropertyValue(JsonNode,PropertyItem).");
    }
    writePropertyValue_JsonNode_PropertyItem_visited.add(_parameters);
    String writePropertyValue_JsonNode_PropertyItem_value = node.get(p.getName()).toString().startsWith("\"") && node.get(p.getName()).toString().endsWith("\"") ? node.get(p.getName()).toString().substring(1, node.get(p.getName()).toString().length() - 1) : node.get(p.getName()).toString();
    writePropertyValue_JsonNode_PropertyItem_visited.remove(_parameters);
    return writePropertyValue_JsonNode_PropertyItem_value;
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
