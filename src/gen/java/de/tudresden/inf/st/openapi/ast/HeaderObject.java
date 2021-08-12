/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:129
 * @astdecl HeaderObject : ASTNode ::= <Description:String> <Required:boolean> <DeprecatedBoolean:Object> <AllowEmptyValue:Object> <Style:String> <Explode:Object> <AllowReserved:Object> [Schema] <Example:Object> ExamplesTuple* ContentTuple*;
 * @production HeaderObject : {@link ASTNode} ::= <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;Required:boolean&gt;</span> <span class="component">&lt;DeprecatedBoolean:Object&gt;</span> <span class="component">&lt;AllowEmptyValue:Object&gt;</span> <span class="component">&lt;Style:String&gt;</span> <span class="component">&lt;Explode:Object&gt;</span> <span class="component">&lt;AllowReserved:Object&gt;</span> <span class="component">[{@link Schema}]</span> <span class="component">&lt;Example:Object&gt;</span> <span class="component">{@link ExamplesTuple}*</span> <span class="component">{@link ContentTuple}*</span>;

 */
public class HeaderObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:446
   */
  public static Header composeHeader (HeaderObject headerObject){
        Header header = new Header();

        header.setRequired( headerObject.getRequired() );

        if( !headerObject.getDescription().isEmpty() )
        header.setDescription( headerObject.getDescription() );
        if( headerObject.getStyle() != null )
        header.setStyle(headerObject.getStyle());
        if( headerObject.getExplode() != null )
        header.setExplode((boolean)headerObject.getExplode());
        if( headerObject.getAllowReserved() != null )
        header.setAllowReserved((boolean)headerObject.getAllowReserved());
        if( headerObject.getExample() != null )
        header.setExample(headerObject.getExample());
        if( headerObject.getNumExamplesTuple() != 0 ){
        Map<String, Example> examples = new HashMap<>();
        for( ExamplesTuple t : headerObject.getExamplesTuples() )
        examples.put( ((ExampleObjectTuple)t).getName(), ExampleObject.composeExample( ((ExampleObjectTuple)t).getExampleObject() ) );
        header.setExample(examples);
        }
        if( headerObject.getNumContentTuple() != 0 ){
        Map<String, MediaType> contents = new HashMap<>();
        for( ContentTuple t : headerObject.getContentTuples() )
        contents.put( ((ContentObjectTuple)t).getName(), MediaTypeObject.composeMediaType( ((ContentObjectTuple)t).getMediaTypeObject() ) );
        header.setContentMediaTypes(contents);
        }

        return header;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:559
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
        headerObject.addExamplesTuple(new ExampleObjectTuple(key, ExampleObject.parseExample(header.getExample(key))));
        }
        if( header.getContentMediaTypes() != null ){
        for( String key : header.getContentMediaTypes().keySet() )
        headerObject.addContentTuple(new ContentObjectTuple(key, MediaTypeObject.parseMediaType(header.getContentMediaType(key))));
        }

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
    name = {"Description", "Required", "DeprecatedBoolean", "AllowEmptyValue", "Style", "Explode", "AllowReserved", "Schema", "Example", "ExamplesTuple", "ContentTuple"},
    type = {"String", "boolean", "Object", "Object", "String", "Object", "Object", "Opt<Schema>", "Object", "JastAddList<ExamplesTuple>", "JastAddList<ContentTuple>"},
    kind = {"Token", "Token", "Token", "Token", "Token", "Token", "Token", "Opt", "Token", "List", "List"}
  )
  public HeaderObject(String p0, boolean p1, Object p2, Object p3, String p4, Object p5, Object p6, Opt<Schema> p7, Object p8, JastAddList<ExamplesTuple> p9, JastAddList<ContentTuple> p10) {
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
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:35
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:41
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:49
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public HeaderObject clone() throws CloneNotSupportedException {
    HeaderObject node = (HeaderObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:58
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
   * @declaredat ASTNode:77
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
   * @declaredat ASTNode:87
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
   * @declaredat ASTNode:107
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
   * @declaredat ASTNode:121
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Description == ((HeaderObject) node).tokenString_Description) && (tokenboolean_Required == ((HeaderObject) node).tokenboolean_Required) && (tokenObject_DeprecatedBoolean == ((HeaderObject) node).tokenObject_DeprecatedBoolean) && (tokenObject_AllowEmptyValue == ((HeaderObject) node).tokenObject_AllowEmptyValue) && (tokenString_Style == ((HeaderObject) node).tokenString_Style) && (tokenObject_Explode == ((HeaderObject) node).tokenObject_Explode) && (tokenObject_AllowReserved == ((HeaderObject) node).tokenObject_AllowReserved) && (tokenObject_Example == ((HeaderObject) node).tokenObject_Example);    
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
  public void setRequired(boolean value) {
    tokenboolean_Required = value;
  }
  /** @apilevel internal 
   */
  protected boolean tokenboolean_Required;
  /**
   * Retrieves the value for the lexeme Required.
   * @return The value for the lexeme Required.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Required")
  public boolean getRequired() {
    return tokenboolean_Required;
  }
  /**
   * Replaces the lexeme DeprecatedBoolean.
   * @param value The new value for the lexeme DeprecatedBoolean.
   * @apilevel high-level
   */
  public void setDeprecatedBoolean(Object value) {
    tokenObject_DeprecatedBoolean = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_DeprecatedBoolean;
  /**
   * Retrieves the value for the lexeme DeprecatedBoolean.
   * @return The value for the lexeme DeprecatedBoolean.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="DeprecatedBoolean")
  public Object getDeprecatedBoolean() {
    return tokenObject_DeprecatedBoolean;
  }
  /**
   * Replaces the lexeme AllowEmptyValue.
   * @param value The new value for the lexeme AllowEmptyValue.
   * @apilevel high-level
   */
  public void setAllowEmptyValue(Object value) {
    tokenObject_AllowEmptyValue = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_AllowEmptyValue;
  /**
   * Retrieves the value for the lexeme AllowEmptyValue.
   * @return The value for the lexeme AllowEmptyValue.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="AllowEmptyValue")
  public Object getAllowEmptyValue() {
    return tokenObject_AllowEmptyValue;
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
  public void setExplode(Object value) {
    tokenObject_Explode = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_Explode;
  /**
   * Retrieves the value for the lexeme Explode.
   * @return The value for the lexeme Explode.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Explode")
  public Object getExplode() {
    return tokenObject_Explode;
  }
  /**
   * Replaces the lexeme AllowReserved.
   * @param value The new value for the lexeme AllowReserved.
   * @apilevel high-level
   */
  public void setAllowReserved(Object value) {
    tokenObject_AllowReserved = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_AllowReserved;
  /**
   * Retrieves the value for the lexeme AllowReserved.
   * @return The value for the lexeme AllowReserved.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="AllowReserved")
  public Object getAllowReserved() {
    return tokenObject_AllowReserved;
  }
  /**
   * Replaces the optional node for the Schema child. This is the <code>Opt</code>
   * node containing the child Schema, not the actual child!
   * @param opt The new node to be used as the optional node for the Schema child.
   * @apilevel low-level
   */
  public void setSchemaOpt(Opt<Schema> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) Schema child.
   * @param node The new node to be used as the Schema child.
   * @apilevel high-level
   */
  public void setSchema(Schema node) {
    getSchemaOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Schema child exists.
   * @return {@code true} if the optional Schema child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasSchema() {
    return getSchemaOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Schema child.
   * @return The Schema child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Schema getSchema() {
    return (Schema) getSchemaOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Schema child. This is the <code>Opt</code> node containing the child Schema, not the actual child!
   * @return The optional node for child the Schema child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Schema")
  public Opt<Schema> getSchemaOpt() {
    return (Opt<Schema>) getChild(0);
  }
  /**
   * Retrieves the optional node for child Schema. This is the <code>Opt</code> node containing the child Schema, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Schema.
   * @apilevel low-level
   */
  public Opt<Schema> getSchemaOptNoTransform() {
    return (Opt<Schema>) getChildNoTransform(0);
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
   * Replaces the ExamplesTuple list.
   * @param list The new list node to be used as the ExamplesTuple list.
   * @apilevel high-level
   */
  public void setExamplesTupleList(JastAddList<ExamplesTuple> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the ExamplesTuple list.
   * @return Number of children in the ExamplesTuple list.
   * @apilevel high-level
   */
  public int getNumExamplesTuple() {
    return getExamplesTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ExamplesTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ExamplesTuple list.
   * @apilevel low-level
   */
  public int getNumExamplesTupleNoTransform() {
    return getExamplesTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ExamplesTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ExamplesTuple list.
   * @apilevel high-level
   */
  public ExamplesTuple getExamplesTuple(int i) {
    return (ExamplesTuple) getExamplesTupleList().getChild(i);
  }
  /**
   * Check whether the ExamplesTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExamplesTuple() {
    return getExamplesTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ExamplesTuple list.
   * @param node The element to append to the ExamplesTuple list.
   * @apilevel high-level
   */
  public void addExamplesTuple(ExamplesTuple node) {
    JastAddList<ExamplesTuple> list = (parent == null) ? getExamplesTupleListNoTransform() : getExamplesTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addExamplesTupleNoTransform(ExamplesTuple node) {
    JastAddList<ExamplesTuple> list = getExamplesTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ExamplesTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExamplesTuple(ExamplesTuple node, int i) {
    JastAddList<ExamplesTuple> list = getExamplesTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ExamplesTuple list.
   * @return The node representing the ExamplesTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ExamplesTuple")
  public JastAddList<ExamplesTuple> getExamplesTupleList() {
    JastAddList<ExamplesTuple> list = (JastAddList<ExamplesTuple>) getChild(1);
    return list;
  }
  /**
   * Retrieves the ExamplesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ExamplesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ExamplesTuple> getExamplesTupleListNoTransform() {
    return (JastAddList<ExamplesTuple>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the ExamplesTuple list without
   * triggering rewrites.
   */
  public ExamplesTuple getExamplesTupleNoTransform(int i) {
    return (ExamplesTuple) getExamplesTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ExamplesTuple list.
   * @return The node representing the ExamplesTuple list.
   * @apilevel high-level
   */
  public JastAddList<ExamplesTuple> getExamplesTuples() {
    return getExamplesTupleList();
  }
  /**
   * Retrieves the ExamplesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ExamplesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ExamplesTuple> getExamplesTuplesNoTransform() {
    return getExamplesTupleListNoTransform();
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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
