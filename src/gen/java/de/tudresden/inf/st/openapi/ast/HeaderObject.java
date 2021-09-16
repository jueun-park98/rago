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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:101
 * @astdecl HeaderObject : HeaderOb ::= <Description:String> <Required:Boolean> <DeprecatedBoolean:Boolean> <AllowEmptyValue:Boolean> <Style:String> <Explode:Boolean> <AllowReserved:Boolean> [SchemaOb] <Example:Object> ExampleTuple* ContentTuple* Extension*;
 * @production HeaderObject : {@link HeaderOb} ::= <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;Required:Boolean&gt;</span> <span class="component">&lt;DeprecatedBoolean:Boolean&gt;</span> <span class="component">&lt;AllowEmptyValue:Boolean&gt;</span> <span class="component">&lt;Style:String&gt;</span> <span class="component">&lt;Explode:Boolean&gt;</span> <span class="component">&lt;AllowReserved:Boolean&gt;</span> <span class="component">[{@link SchemaOb}]</span> <span class="component">&lt;Example:Object&gt;</span> <span class="component">{@link ExampleTuple}*</span> <span class="component">{@link ContentTuple}*</span> <span class="component">{@link Extension}*</span>;

 */
public class HeaderObject extends HeaderOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public HeaderObject() {
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
    children = new ASTNode[4];
    setChild(new Opt(), 0);
    setChild(new JastAddList(), 1);
    setChild(new JastAddList(), 2);
    setChild(new JastAddList(), 3);
  }
  /**
   * @declaredat ASTNode:17
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Description", "Required", "DeprecatedBoolean", "AllowEmptyValue", "Style", "Explode", "AllowReserved", "SchemaOb", "Example", "ExampleTuple", "ContentTuple", "Extension"},
    type = {"String", "Boolean", "Boolean", "Boolean", "String", "Boolean", "Boolean", "Opt<SchemaOb>", "Object", "JastAddList<ExampleTuple>", "JastAddList<ContentTuple>", "JastAddList<Extension>"},
    kind = {"Token", "Token", "Token", "Token", "Token", "Token", "Token", "Opt", "Token", "List", "List", "List"}
  )
  public HeaderObject(String p0, Boolean p1, Boolean p2, Boolean p3, String p4, Boolean p5, Boolean p6, Opt<SchemaOb> p7, Object p8, JastAddList<ExampleTuple> p9, JastAddList<ContentTuple> p10, JastAddList<Extension> p11) {
    setDescription(p0);
    setRequired(p1);
    setDeprecatedBoolean(p2);
    setAllowEmptyValue(p3);
    setStyle(p4);
    setExplode(p5);
    setAllowReserved(p6);
    setChild(p7, 0);
    setExample(p8);
    setChild(p9, 1);
    setChild(p10, 2);
    setChild(p11, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:37
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:43
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:55
   */
  public HeaderObject clone() throws CloneNotSupportedException {
    HeaderObject node = (HeaderObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:60
   */
  public HeaderObject copy() {
    try {
      HeaderObject node = (HeaderObject) clone();
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
   * @declaredat ASTNode:79
   */
  @Deprecated
  public HeaderObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:89
   */
  public HeaderObject treeCopyNoTransform() {
    HeaderObject tree = (HeaderObject) copy();
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
   * @declaredat ASTNode:109
   */
  public HeaderObject treeCopy() {
    HeaderObject tree = (HeaderObject) copy();
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
   * @declaredat ASTNode:123
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Description == ((HeaderObject) node).tokenString_Description) && (tokenBoolean_Required == ((HeaderObject) node).tokenBoolean_Required) && (tokenBoolean_DeprecatedBoolean == ((HeaderObject) node).tokenBoolean_DeprecatedBoolean) && (tokenBoolean_AllowEmptyValue == ((HeaderObject) node).tokenBoolean_AllowEmptyValue) && (tokenString_Style == ((HeaderObject) node).tokenString_Style) && (tokenBoolean_Explode == ((HeaderObject) node).tokenBoolean_Explode) && (tokenBoolean_AllowReserved == ((HeaderObject) node).tokenBoolean_AllowReserved) && (tokenObject_Example == ((HeaderObject) node).tokenObject_Example);    
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
   * Replaces the lexeme Required.
   * @param value The new value for the lexeme Required.
   * @apilevel high-level
   */
  public void setRequired(Boolean value) {
    tokenBoolean_Required = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_Required;
  /**
   * Retrieves the value for the lexeme Required.
   * @return The value for the lexeme Required.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Required")
  public Boolean getRequired() {
    return tokenBoolean_Required;
  }
  /**
   * Replaces the lexeme DeprecatedBoolean.
   * @param value The new value for the lexeme DeprecatedBoolean.
   * @apilevel high-level
   */
  public void setDeprecatedBoolean(Boolean value) {
    tokenBoolean_DeprecatedBoolean = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_DeprecatedBoolean;
  /**
   * Retrieves the value for the lexeme DeprecatedBoolean.
   * @return The value for the lexeme DeprecatedBoolean.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="DeprecatedBoolean")
  public Boolean getDeprecatedBoolean() {
    return tokenBoolean_DeprecatedBoolean;
  }
  /**
   * Replaces the lexeme AllowEmptyValue.
   * @param value The new value for the lexeme AllowEmptyValue.
   * @apilevel high-level
   */
  public void setAllowEmptyValue(Boolean value) {
    tokenBoolean_AllowEmptyValue = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_AllowEmptyValue;
  /**
   * Retrieves the value for the lexeme AllowEmptyValue.
   * @return The value for the lexeme AllowEmptyValue.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="AllowEmptyValue")
  public Boolean getAllowEmptyValue() {
    return tokenBoolean_AllowEmptyValue;
  }
  /**
   * Replaces the lexeme Style.
   * @param value The new value for the lexeme Style.
   * @apilevel high-level
   */
  public void setStyle(String value) {
    tokenString_Style = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Style;
  /**
   * Retrieves the value for the lexeme Style.
   * @return The value for the lexeme Style.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Style")
  public String getStyle() {
    return tokenString_Style != null ? tokenString_Style : "";
  }
  /**
   * Replaces the lexeme Explode.
   * @param value The new value for the lexeme Explode.
   * @apilevel high-level
   */
  public void setExplode(Boolean value) {
    tokenBoolean_Explode = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_Explode;
  /**
   * Retrieves the value for the lexeme Explode.
   * @return The value for the lexeme Explode.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Explode")
  public Boolean getExplode() {
    return tokenBoolean_Explode;
  }
  /**
   * Replaces the lexeme AllowReserved.
   * @param value The new value for the lexeme AllowReserved.
   * @apilevel high-level
   */
  public void setAllowReserved(Boolean value) {
    tokenBoolean_AllowReserved = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_AllowReserved;
  /**
   * Retrieves the value for the lexeme AllowReserved.
   * @return The value for the lexeme AllowReserved.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="AllowReserved")
  public Boolean getAllowReserved() {
    return tokenBoolean_AllowReserved;
  }
  /**
   * Replaces the optional node for the SchemaOb child. This is the <code>Opt</code>
   * node containing the child SchemaOb, not the actual child!
   * @param opt The new node to be used as the optional node for the SchemaOb child.
   * @apilevel low-level
   */
  public void setSchemaObOpt(Opt<SchemaOb> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) SchemaOb child.
   * @param node The new node to be used as the SchemaOb child.
   * @apilevel high-level
   */
  public void setSchemaOb(SchemaOb node) {
    getSchemaObOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional SchemaOb child exists.
   * @return {@code true} if the optional SchemaOb child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasSchemaOb() {
    return getSchemaObOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) SchemaOb child.
   * @return The SchemaOb child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public SchemaOb getSchemaOb() {
    return (SchemaOb) getSchemaObOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the SchemaOb child. This is the <code>Opt</code> node containing the child SchemaOb, not the actual child!
   * @return The optional node for child the SchemaOb child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="SchemaOb")
  public Opt<SchemaOb> getSchemaObOpt() {
    return (Opt<SchemaOb>) getChild(0);
  }
  /**
   * Retrieves the optional node for child SchemaOb. This is the <code>Opt</code> node containing the child SchemaOb, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child SchemaOb.
   * @apilevel low-level
   */
  public Opt<SchemaOb> getSchemaObOptNoTransform() {
    return (Opt<SchemaOb>) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme Example.
   * @param value The new value for the lexeme Example.
   * @apilevel high-level
   */
  public void setExample(Object value) {
    tokenObject_Example = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_Example;
  /**
   * Retrieves the value for the lexeme Example.
   * @return The value for the lexeme Example.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Example")
  public Object getExample() {
    return tokenObject_Example;
  }
  /**
   * Replaces the ExampleTuple list.
   * @param list The new list node to be used as the ExampleTuple list.
   * @apilevel high-level
   */
  public void setExampleTupleList(JastAddList<ExampleTuple> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the ExampleTuple list.
   * @return Number of children in the ExampleTuple list.
   * @apilevel high-level
   */
  public int getNumExampleTuple() {
    return getExampleTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ExampleTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ExampleTuple list.
   * @apilevel low-level
   */
  public int getNumExampleTupleNoTransform() {
    return getExampleTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ExampleTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ExampleTuple list.
   * @apilevel high-level
   */
  public ExampleTuple getExampleTuple(int i) {
    return (ExampleTuple) getExampleTupleList().getChild(i);
  }
  /**
   * Check whether the ExampleTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExampleTuple() {
    return getExampleTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ExampleTuple list.
   * @param node The element to append to the ExampleTuple list.
   * @apilevel high-level
   */
  public void addExampleTuple(ExampleTuple node) {
    JastAddList<ExampleTuple> list = (parent == null) ? getExampleTupleListNoTransform() : getExampleTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addExampleTupleNoTransform(ExampleTuple node) {
    JastAddList<ExampleTuple> list = getExampleTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ExampleTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExampleTuple(ExampleTuple node, int i) {
    JastAddList<ExampleTuple> list = getExampleTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ExampleTuple list.
   * @return The node representing the ExampleTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ExampleTuple")
  public JastAddList<ExampleTuple> getExampleTupleList() {
    JastAddList<ExampleTuple> list = (JastAddList<ExampleTuple>) getChild(1);
    return list;
  }
  /**
   * Retrieves the ExampleTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ExampleTuple list.
   * @apilevel low-level
   */
  public JastAddList<ExampleTuple> getExampleTupleListNoTransform() {
    return (JastAddList<ExampleTuple>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the ExampleTuple list without
   * triggering rewrites.
   */
  public ExampleTuple getExampleTupleNoTransform(int i) {
    return (ExampleTuple) getExampleTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ExampleTuple list.
   * @return The node representing the ExampleTuple list.
   * @apilevel high-level
   */
  public JastAddList<ExampleTuple> getExampleTuples() {
    return getExampleTupleList();
  }
  /**
   * Retrieves the ExampleTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ExampleTuple list.
   * @apilevel low-level
   */
  public JastAddList<ExampleTuple> getExampleTuplesNoTransform() {
    return getExampleTupleListNoTransform();
  }
  /**
   * Replaces the ContentTuple list.
   * @param list The new list node to be used as the ContentTuple list.
   * @apilevel high-level
   */
  public void setContentTupleList(JastAddList<ContentTuple> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the ContentTuple list.
   * @return Number of children in the ContentTuple list.
   * @apilevel high-level
   */
  public int getNumContentTuple() {
    return getContentTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ContentTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ContentTuple list.
   * @apilevel low-level
   */
  public int getNumContentTupleNoTransform() {
    return getContentTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ContentTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ContentTuple list.
   * @apilevel high-level
   */
  public ContentTuple getContentTuple(int i) {
    return (ContentTuple) getContentTupleList().getChild(i);
  }
  /**
   * Check whether the ContentTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasContentTuple() {
    return getContentTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ContentTuple list.
   * @param node The element to append to the ContentTuple list.
   * @apilevel high-level
   */
  public void addContentTuple(ContentTuple node) {
    JastAddList<ContentTuple> list = (parent == null) ? getContentTupleListNoTransform() : getContentTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addContentTupleNoTransform(ContentTuple node) {
    JastAddList<ContentTuple> list = getContentTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ContentTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setContentTuple(ContentTuple node, int i) {
    JastAddList<ContentTuple> list = getContentTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ContentTuple list.
   * @return The node representing the ContentTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ContentTuple")
  public JastAddList<ContentTuple> getContentTupleList() {
    JastAddList<ContentTuple> list = (JastAddList<ContentTuple>) getChild(2);
    return list;
  }
  /**
   * Retrieves the ContentTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ContentTuple list.
   * @apilevel low-level
   */
  public JastAddList<ContentTuple> getContentTupleListNoTransform() {
    return (JastAddList<ContentTuple>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the ContentTuple list without
   * triggering rewrites.
   */
  public ContentTuple getContentTupleNoTransform(int i) {
    return (ContentTuple) getContentTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ContentTuple list.
   * @return The node representing the ContentTuple list.
   * @apilevel high-level
   */
  public JastAddList<ContentTuple> getContentTuples() {
    return getContentTupleList();
  }
  /**
   * Retrieves the ContentTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ContentTuple list.
   * @apilevel low-level
   */
  public JastAddList<ContentTuple> getContentTuplesNoTransform() {
    return getContentTupleListNoTransform();
  }
  /**
   * Replaces the Extension list.
   * @param list The new list node to be used as the Extension list.
   * @apilevel high-level
   */
  public void setExtensionList(JastAddList<Extension> list) {
    setChild(list, 3);
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
    JastAddList<Extension> list = (JastAddList<Extension>) getChild(3);
    return list;
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionListNoTransform() {
    return (JastAddList<Extension>) getChildNoTransform(3);
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
