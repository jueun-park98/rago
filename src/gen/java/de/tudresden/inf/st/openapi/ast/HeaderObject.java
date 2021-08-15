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
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:85
 * @astdecl HeaderObject : ASTNode ::= <Description:String> <Required:Boolean> <DeprecatedBoolean:Boolean> <AllowEmptyValue:Boolean> <Style:String> <Explode:Boolean> <AllowReserved:Boolean> [SchemaObject] <Example:Object> ExampleTuple* ContentTuple* <Ref:String>;
 * @production HeaderObject : {@link ASTNode} ::= <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;Required:Boolean&gt;</span> <span class="component">&lt;DeprecatedBoolean:Boolean&gt;</span> <span class="component">&lt;AllowEmptyValue:Boolean&gt;</span> <span class="component">&lt;Style:String&gt;</span> <span class="component">&lt;Explode:Boolean&gt;</span> <span class="component">&lt;AllowReserved:Boolean&gt;</span> <span class="component">[{@link SchemaObject}]</span> <span class="component">&lt;Example:Object&gt;</span> <span class="component">{@link ExampleTuple}*</span> <span class="component">{@link ContentTuple}*</span> <span class="component">&lt;Ref:String&gt;</span>;

 */
public class HeaderObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:557
   */
  public static Header composeHeader (HeaderObject headerObject){
        Header header = new Header();

        header.setRequired( headerObject.getRequired() );

        if( !headerObject.getDescription().isEmpty() )
        header.setDescription( headerObject.getDescription() );
        if( !headerObject.getStyle().isEmpty() )
        header.setStyle(headerObject.getStyle());
        if( headerObject.getExplode() != null )
        header.setExplode(headerObject.getExplode());
        if( headerObject.getAllowReserved() != null )
        header.setAllowReserved(headerObject.getAllowReserved());
        if( headerObject.getExample() != null )
        header.setExample(headerObject.getExample());
        if( headerObject.getNumExampleTuple() != 0 ){
        Map<String, Example> examples = new HashMap<>();
        for( ExampleTuple t : headerObject.getExampleTuples() )
        examples.put(t.getKey(), ExampleObject.composeExample(t.getExampleObject()));
        header.setExample(examples);
        }
        if( headerObject.getNumContentTuple() != 0 ){
        Map<String, MediaType> contents = new HashMap<>();
        for( ContentTuple t : headerObject.getContentTuples() )
        contents.put(t.getKey(), MediaTypeObject.composeMediaType(t.getMediaTypeObject()));
        header.setContentMediaTypes(contents);
        }
        if( headerObject.hasSchemaObject() )
            header.setSchema(SchemaObject.composeSchema(headerObject.getSchemaObject()));

        return header;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:564
   */
  public static HeaderObject parseHeader(Header header){
        HeaderObject headerObject = new HeaderObject();

        if( header.getRequired() != null )
        headerObject.setRequired( header.getRequired() );
        if( header.getDescription() != null )
        headerObject.setDescription( header.getDescription() );
        if( header.getDeprecated() != null )
        headerObject.setDeprecatedBoolean( header.getDeprecated() );
        if( header.getStyle() != null )
        headerObject.setStyle( header.getStyle() );
        if( header.getExplode() != null )
        headerObject.setExplode( header.getExplode() );
        if( header.getAllowReserved() != null )
        headerObject.setExplode( header.getAllowReserved() );
        if( header.getExample() != null )
        headerObject.setExample( header.getExample() );
        if( header.getExamples() != null ){
        for( String key : header.getExamples().keySet() )
        headerObject.addExampleTuple(new ExampleTuple(key, ExampleObject.parseExample(header.getExample(key))));
        }
        if( header.getContentMediaTypes() != null ){
        for( String key : header.getContentMediaTypes().keySet() )
        headerObject.addContentTuple(new ContentTuple(key, MediaTypeObject.parseMediaType(header.getContentMediaType(key))));
        }
        if( header.getSchema() != null )
            headerObject.setSchemaObject(SchemaObject.parseSchema(header.getSchema()));

        return headerObject;
        }
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
    children = new ASTNode[3];
    setChild(new Opt(), 0);
    setChild(new JastAddList(), 1);
    setChild(new JastAddList(), 2);
  }
  /**
   * @declaredat ASTNode:16
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Description", "Required", "DeprecatedBoolean", "AllowEmptyValue", "Style", "Explode", "AllowReserved", "SchemaObject", "Example", "ExampleTuple", "ContentTuple", "Ref"},
    type = {"String", "Boolean", "Boolean", "Boolean", "String", "Boolean", "Boolean", "Opt<SchemaObject>", "Object", "JastAddList<ExampleTuple>", "JastAddList<ContentTuple>", "String"},
    kind = {"Token", "Token", "Token", "Token", "Token", "Token", "Token", "Opt", "Token", "List", "List", "Token"}
  )
  public HeaderObject(String p0, Boolean p1, Boolean p2, Boolean p3, String p4, Boolean p5, Boolean p6, Opt<SchemaObject> p7, Object p8, JastAddList<ExampleTuple> p9, JastAddList<ContentTuple> p10, String p11) {
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
    setRef(p11);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:36
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:42
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:50
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:54
   */
  public HeaderObject clone() throws CloneNotSupportedException {
    HeaderObject node = (HeaderObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:59
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
   * @declaredat ASTNode:78
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
   * @declaredat ASTNode:88
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
   * @declaredat ASTNode:108
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
   * @declaredat ASTNode:122
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Description == ((HeaderObject) node).tokenString_Description) && (tokenBoolean_Required == ((HeaderObject) node).tokenBoolean_Required) && (tokenBoolean_DeprecatedBoolean == ((HeaderObject) node).tokenBoolean_DeprecatedBoolean) && (tokenBoolean_AllowEmptyValue == ((HeaderObject) node).tokenBoolean_AllowEmptyValue) && (tokenString_Style == ((HeaderObject) node).tokenString_Style) && (tokenBoolean_Explode == ((HeaderObject) node).tokenBoolean_Explode) && (tokenBoolean_AllowReserved == ((HeaderObject) node).tokenBoolean_AllowReserved) && (tokenObject_Example == ((HeaderObject) node).tokenObject_Example) && (tokenString_Ref == ((HeaderObject) node).tokenString_Ref);    
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
   * Replaces the optional node for the SchemaObject child. This is the <code>Opt</code>
   * node containing the child SchemaObject, not the actual child!
   * @param opt The new node to be used as the optional node for the SchemaObject child.
   * @apilevel low-level
   */
  public void setSchemaObjectOpt(Opt<SchemaObject> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) SchemaObject child.
   * @param node The new node to be used as the SchemaObject child.
   * @apilevel high-level
   */
  public void setSchemaObject(SchemaObject node) {
    getSchemaObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional SchemaObject child exists.
   * @return {@code true} if the optional SchemaObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasSchemaObject() {
    return getSchemaObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) SchemaObject child.
   * @return The SchemaObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public SchemaObject getSchemaObject() {
    return (SchemaObject) getSchemaObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the SchemaObject child. This is the <code>Opt</code> node containing the child SchemaObject, not the actual child!
   * @return The optional node for child the SchemaObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="SchemaObject")
  public Opt<SchemaObject> getSchemaObjectOpt() {
    return (Opt<SchemaObject>) getChild(0);
  }
  /**
   * Retrieves the optional node for child SchemaObject. This is the <code>Opt</code> node containing the child SchemaObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child SchemaObject.
   * @apilevel low-level
   */
  public Opt<SchemaObject> getSchemaObjectOptNoTransform() {
    return (Opt<SchemaObject>) getChildNoTransform(0);
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
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
