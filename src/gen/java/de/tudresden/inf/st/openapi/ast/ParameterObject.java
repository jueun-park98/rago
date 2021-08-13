/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.core.model.reference.Reference;
import java.io.IOException;
import java.util.*;
import java.net.URL;
/**
 * @ast node
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:72
 * @astdecl ParameterObject : ASTNode ::= <Name:String> <In:String> <Description:String> <Required:Boolean> <DeprecatedBoolean:Boolean> <AllowEmptyValue:Boolean> <Style:String> <Explode:Boolean> <AllowReserved:Boolean> [SchemaObject] <Example:Object> ExamplesTuple* ContentTuple* <Ref:String>;
 * @production ParameterObject : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">&lt;In:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;Required:Boolean&gt;</span> <span class="component">&lt;DeprecatedBoolean:Boolean&gt;</span> <span class="component">&lt;AllowEmptyValue:Boolean&gt;</span> <span class="component">&lt;Style:String&gt;</span> <span class="component">&lt;Explode:Boolean&gt;</span> <span class="component">&lt;AllowReserved:Boolean&gt;</span> <span class="component">[{@link SchemaObject}]</span> <span class="component">&lt;Example:Object&gt;</span> <span class="component">{@link ExamplesTuple}*</span> <span class="component">{@link ContentTuple}*</span> <span class="component">&lt;Ref:String&gt;</span>;

 */
public class ParameterObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jadd:340
   */
  public static Parameter composeParameter (ParameterObject parameterObject){
        Parameter parameter = new Parameter();

        parameter.setName( parameterObject.getName() );
        parameter.setIn( parameterObject.getIn() );
        parameter.setRequired( parameterObject.getRequired() );

        if( !parameterObject.getDescription().isEmpty() )
        parameter.setDescription( parameterObject.getDescription() );
        if( parameterObject.getDeprecatedBoolean() != null )
        parameter.setDeprecated( parameterObject.getDeprecatedBoolean() );
        if( parameterObject.getStyle() != null )
        parameter.setStyle( parameter.getStyle() );
        if( parameterObject.getAllowReserved() != null )
        parameter.setAllowReserved( parameterObject.getAllowReserved() );
        if( parameterObject.getExplode() != null )
        parameter.setExplode( parameterObject.getExplode() );
        if( parameterObject.getAllowReserved() != null )
        parameter.setAllowReserved( parameterObject.getAllowReserved() );
        if( parameterObject.getSchemaObject() != null ){
        Schema schema = new Schema();
        schema = SchemaObject.composeSchema(parameterObject.getSchemaObject());
        if( !parameterObject.getRef().isEmpty() )
        schema.setRef(parameterObject.getRef());
        parameter.setSchema(schema);}
        if( parameterObject.getExample() != null )
        parameter.setExample( parameterObject.getExample() );
        if( parameterObject.getNumExamplesTuple() != 0 ){
        Map<String, Example> examples = new HashMap<>();
        for( ExamplesTuple t : parameterObject.getExamplesTuples() )
        examples.put( ((ExampleObjectTuple)t).getName(), ExampleObject.composeExample( ((ExampleObjectTuple)t).getExampleObject() ) );
        parameter.setExamples(examples);
        }
        if( parameterObject.getNumContentTuple() != 0 ){
        Map<String, MediaType> contents = new HashMap<>();
        for( ContentTuple t : parameterObject.getContentTuples() )
        contents.put( ((ContentObjectTuple)t).getName(), MediaTypeObject.composeMediaType( ((ContentObjectTuple)t).getMediaTypeObject() ) );
        parameter.setContentMediaTypes(contents);
        }

        return parameter;
        }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:412
   */
  public static ParameterObject parseParameter(Parameter parameter){
        ParameterObject parameterObject = new ParameterObject();

        parameterObject.setName(parameter.getName());
        parameterObject.setIn(parameter.getIn());
        if( parameter.getRequired() == null )
        parameterObject.setRequired(false);
        else
        parameterObject.setRequired(parameter.getRequired());

        if( parameter.getDescription() != null )
        parameterObject.setDescription( parameter.getDescription() );
        if( parameter.getDeprecated() != null )
        parameterObject.setDeprecatedBoolean( parameter.getDeprecated() );
        if( parameter.getStyle() != null )
        parameterObject.setStyle( parameter.getStyle() );
        if( parameter.getExplode() != null )
        parameterObject.setExplode( parameter.getExplode() );
        if( parameter.getAllowReserved() != null )
        parameterObject.setAllowReserved( parameter.getAllowReserved() );
        if( parameter.getSchema() != null ){
        SchemaObject schema = new SchemaObject();
        schema = SchemaObject.parseSchema(parameter.getSchema());
        if( parameter.getSchema().isRef() )
        schema.setRef(parameter.getSchema().getRef());
        parameterObject.setSchemaObject(schema);
        }
        if( parameter.getExample() != null )
        parameterObject.setExample( parameter.getExample() );
        if( parameter.getExamples() != null ){
        for( String key : parameter.getExamples().keySet() )
        parameterObject.addExamplesTuple(new ExampleObjectTuple(key, ExampleObject.parseExample(parameter.getExample(key))));
        }
        if( parameter.getContentMediaTypes() != null ){
        for( String key : parameter.getContentMediaTypes().keySet() )
        parameterObject.addContentTuple(new ContentObjectTuple(key, MediaTypeObject.parseMediaType(parameter.getContentMediaType(key))));
        }

        return parameterObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public ParameterObject() {
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
    name = {"Name", "In", "Description", "Required", "DeprecatedBoolean", "AllowEmptyValue", "Style", "Explode", "AllowReserved", "SchemaObject", "Example", "ExamplesTuple", "ContentTuple", "Ref"},
    type = {"String", "String", "String", "Boolean", "Boolean", "Boolean", "String", "Boolean", "Boolean", "Opt<SchemaObject>", "Object", "JastAddList<ExamplesTuple>", "JastAddList<ContentTuple>", "String"},
    kind = {"Token", "Token", "Token", "Token", "Token", "Token", "Token", "Token", "Token", "Opt", "Token", "List", "List", "Token"}
  )
  public ParameterObject(String p0, String p1, String p2, Boolean p3, Boolean p4, Boolean p5, String p6, Boolean p7, Boolean p8, Opt<SchemaObject> p9, Object p10, JastAddList<ExamplesTuple> p11, JastAddList<ContentTuple> p12, String p13) {
    setName(p0);
    setIn(p1);
    setDescription(p2);
    setRequired(p3);
    setDeprecatedBoolean(p4);
    setAllowEmptyValue(p5);
    setStyle(p6);
    setExplode(p7);
    setAllowReserved(p8);
    setChild(p9, 0);
    setExample(p10);
    setChild(p11, 1);
    setChild(p12, 2);
    setRef(p13);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:38
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:44
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:56
   */
  public ParameterObject clone() throws CloneNotSupportedException {
    ParameterObject node = (ParameterObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:61
   */
  public ParameterObject copy() {
    try {
      ParameterObject node = (ParameterObject) clone();
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
   * @declaredat ASTNode:80
   */
  @Deprecated
  public ParameterObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:90
   */
  public ParameterObject treeCopyNoTransform() {
    ParameterObject tree = (ParameterObject) copy();
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
   * @declaredat ASTNode:110
   */
  public ParameterObject treeCopy() {
    ParameterObject tree = (ParameterObject) copy();
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
   * @declaredat ASTNode:124
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((ParameterObject) node).tokenString_Name) && (tokenString_In == ((ParameterObject) node).tokenString_In) && (tokenString_Description == ((ParameterObject) node).tokenString_Description) && (tokenBoolean_Required == ((ParameterObject) node).tokenBoolean_Required) && (tokenBoolean_DeprecatedBoolean == ((ParameterObject) node).tokenBoolean_DeprecatedBoolean) && (tokenBoolean_AllowEmptyValue == ((ParameterObject) node).tokenBoolean_AllowEmptyValue) && (tokenString_Style == ((ParameterObject) node).tokenString_Style) && (tokenBoolean_Explode == ((ParameterObject) node).tokenBoolean_Explode) && (tokenBoolean_AllowReserved == ((ParameterObject) node).tokenBoolean_AllowReserved) && (tokenObject_Example == ((ParameterObject) node).tokenObject_Example) && (tokenString_Ref == ((ParameterObject) node).tokenString_Ref);    
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
   * Replaces the lexeme In.
   * @param value The new value for the lexeme In.
   * @apilevel high-level
   */
  public void setIn(String value) {
    tokenString_In = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_In;
  /**
   * Retrieves the value for the lexeme In.
   * @return The value for the lexeme In.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="In")
  public String getIn() {
    return tokenString_In != null ? tokenString_In : "";
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
