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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:108
 * @astdecl SchemaObject : SchemaOb ::= [AdditionalProperties] <AdditionalPropertiesAllowed:Boolean> <DefaultValue:Object> <Description:String> <DeprecatedBoolean:Boolean> [DiscriminatorObject] EnumObj* <Example:Object> <ExclusiveMaximum:Boolean> <ExclusiveMinimum:Boolean> [ExternalDocObject] <Format:String> [ItemsSchema] <Maximum:Number> <Minimum:Number> <MaxItems:Integer> <MinItems:Integer> <MaxLength:Integer> <MinLength:Integer> <MaxProperties:Integer> <MinProperties:Integer> <MultipleOf:Number> [NotSchema] <Nullable:Boolean> <Pattern:String> PropertyItem* RequiredField* AllOfSchema* AnyOfSchema* OneOfSchema* <ReadOnly:Boolean> <WriteOnly:Boolean> <Type:String> <Title:String> <UniqueItems:Boolean> [XmlObject] Extension*;
 * @production SchemaObject : {@link SchemaOb} ::= <span class="component">[{@link AdditionalProperties}]</span> <span class="component">&lt;AdditionalPropertiesAllowed:Boolean&gt;</span> <span class="component">&lt;DefaultValue:Object&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;DeprecatedBoolean:Boolean&gt;</span> <span class="component">[{@link DiscriminatorObject}]</span> <span class="component">{@link EnumObj}*</span> <span class="component">&lt;Example:Object&gt;</span> <span class="component">&lt;ExclusiveMaximum:Boolean&gt;</span> <span class="component">&lt;ExclusiveMinimum:Boolean&gt;</span> <span class="component">[{@link ExternalDocObject}]</span> <span class="component">&lt;Format:String&gt;</span> <span class="component">[{@link ItemsSchema}]</span> <span class="component">&lt;Maximum:Number&gt;</span> <span class="component">&lt;Minimum:Number&gt;</span> <span class="component">&lt;MaxItems:Integer&gt;</span> <span class="component">&lt;MinItems:Integer&gt;</span> <span class="component">&lt;MaxLength:Integer&gt;</span> <span class="component">&lt;MinLength:Integer&gt;</span> <span class="component">&lt;MaxProperties:Integer&gt;</span> <span class="component">&lt;MinProperties:Integer&gt;</span> <span class="component">&lt;MultipleOf:Number&gt;</span> <span class="component">[{@link NotSchema}]</span> <span class="component">&lt;Nullable:Boolean&gt;</span> <span class="component">&lt;Pattern:String&gt;</span> <span class="component">{@link PropertyItem}*</span> <span class="component">{@link RequiredField}*</span> <span class="component">{@link AllOfSchema}*</span> <span class="component">{@link AnyOfSchema}*</span> <span class="component">{@link OneOfSchema}*</span> <span class="component">&lt;ReadOnly:Boolean&gt;</span> <span class="component">&lt;WriteOnly:Boolean&gt;</span> <span class="component">&lt;Type:String&gt;</span> <span class="component">&lt;Title:String&gt;</span> <span class="component">&lt;UniqueItems:Boolean&gt;</span> <span class="component">[{@link XmlObject}]</span> <span class="component">{@link Extension}*</span>;

 */
public class SchemaObject extends SchemaOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public SchemaObject() {
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
    children = new ASTNode[13];
    setChild(new Opt(), 0);
    setChild(new Opt(), 1);
    setChild(new JastAddList(), 2);
    setChild(new Opt(), 3);
    setChild(new Opt(), 4);
    setChild(new Opt(), 5);
    setChild(new JastAddList(), 6);
    setChild(new JastAddList(), 7);
    setChild(new JastAddList(), 8);
    setChild(new JastAddList(), 9);
    setChild(new JastAddList(), 10);
    setChild(new Opt(), 11);
    setChild(new JastAddList(), 12);
  }
  /**
   * @declaredat ASTNode:26
   */
  @ASTNodeAnnotation.Constructor(
    name = {"AdditionalProperties", "AdditionalPropertiesAllowed", "DefaultValue", "Description", "DeprecatedBoolean", "DiscriminatorObject", "EnumObj", "Example", "ExclusiveMaximum", "ExclusiveMinimum", "ExternalDocObject", "Format", "ItemsSchema", "Maximum", "Minimum", "MaxItems", "MinItems", "MaxLength", "MinLength", "MaxProperties", "MinProperties", "MultipleOf", "NotSchema", "Nullable", "Pattern", "PropertyItem", "RequiredField", "AllOfSchema", "AnyOfSchema", "OneOfSchema", "ReadOnly", "WriteOnly", "Type", "Title", "UniqueItems", "XmlObject", "Extension"},
    type = {"Opt<AdditionalProperties>", "Boolean", "Object", "String", "Boolean", "Opt<DiscriminatorObject>", "JastAddList<EnumObj>", "Object", "Boolean", "Boolean", "Opt<ExternalDocObject>", "String", "Opt<ItemsSchema>", "Number", "Number", "Integer", "Integer", "Integer", "Integer", "Integer", "Integer", "Number", "Opt<NotSchema>", "Boolean", "String", "JastAddList<PropertyItem>", "JastAddList<RequiredField>", "JastAddList<AllOfSchema>", "JastAddList<AnyOfSchema>", "JastAddList<OneOfSchema>", "Boolean", "Boolean", "String", "String", "Boolean", "Opt<XmlObject>", "JastAddList<Extension>"},
    kind = {"Opt", "Token", "Token", "Token", "Token", "Opt", "List", "Token", "Token", "Token", "Opt", "Token", "Opt", "Token", "Token", "Token", "Token", "Token", "Token", "Token", "Token", "Token", "Opt", "Token", "Token", "List", "List", "List", "List", "List", "Token", "Token", "Token", "Token", "Token", "Opt", "List"}
  )
  public SchemaObject(Opt<AdditionalProperties> p0, Boolean p1, Object p2, String p3, Boolean p4, Opt<DiscriminatorObject> p5, JastAddList<EnumObj> p6, Object p7, Boolean p8, Boolean p9, Opt<ExternalDocObject> p10, String p11, Opt<ItemsSchema> p12, Number p13, Number p14, Integer p15, Integer p16, Integer p17, Integer p18, Integer p19, Integer p20, Number p21, Opt<NotSchema> p22, Boolean p23, String p24, JastAddList<PropertyItem> p25, JastAddList<RequiredField> p26, JastAddList<AllOfSchema> p27, JastAddList<AnyOfSchema> p28, JastAddList<OneOfSchema> p29, Boolean p30, Boolean p31, String p32, String p33, Boolean p34, Opt<XmlObject> p35, JastAddList<Extension> p36) {
    setChild(p0, 0);
    setAdditionalPropertiesAllowed(p1);
    setDefaultValue(p2);
    setDescription(p3);
    setDeprecatedBoolean(p4);
    setChild(p5, 1);
    setChild(p6, 2);
    setExample(p7);
    setExclusiveMaximum(p8);
    setExclusiveMinimum(p9);
    setChild(p10, 3);
    setFormat(p11);
    setChild(p12, 4);
    setMaximum(p13);
    setMinimum(p14);
    setMaxItems(p15);
    setMinItems(p16);
    setMaxLength(p17);
    setMinLength(p18);
    setMaxProperties(p19);
    setMinProperties(p20);
    setMultipleOf(p21);
    setChild(p22, 5);
    setNullable(p23);
    setPattern(p24);
    setChild(p25, 6);
    setChild(p26, 7);
    setChild(p27, 8);
    setChild(p28, 9);
    setChild(p29, 10);
    setReadOnly(p30);
    setWriteOnly(p31);
    setType(p32);
    setTitle(p33);
    setUniqueItems(p34);
    setChild(p35, 11);
    setChild(p36, 12);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:71
   */
  protected int numChildren() {
    return 13;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:77
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:81
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:85
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:89
   */
  public SchemaObject clone() throws CloneNotSupportedException {
    SchemaObject node = (SchemaObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:94
   */
  public SchemaObject copy() {
    try {
      SchemaObject node = (SchemaObject) clone();
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
   * @declaredat ASTNode:113
   */
  @Deprecated
  public SchemaObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:123
   */
  public SchemaObject treeCopyNoTransform() {
    SchemaObject tree = (SchemaObject) copy();
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
   * @declaredat ASTNode:143
   */
  public SchemaObject treeCopy() {
    SchemaObject tree = (SchemaObject) copy();
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
   * @declaredat ASTNode:157
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenBoolean_AdditionalPropertiesAllowed == ((SchemaObject) node).tokenBoolean_AdditionalPropertiesAllowed) && (tokenObject_DefaultValue == ((SchemaObject) node).tokenObject_DefaultValue) && (tokenString_Description == ((SchemaObject) node).tokenString_Description) && (tokenBoolean_DeprecatedBoolean == ((SchemaObject) node).tokenBoolean_DeprecatedBoolean) && (tokenObject_Example == ((SchemaObject) node).tokenObject_Example) && (tokenBoolean_ExclusiveMaximum == ((SchemaObject) node).tokenBoolean_ExclusiveMaximum) && (tokenBoolean_ExclusiveMinimum == ((SchemaObject) node).tokenBoolean_ExclusiveMinimum) && (tokenString_Format == ((SchemaObject) node).tokenString_Format) && (tokenNumber_Maximum == ((SchemaObject) node).tokenNumber_Maximum) && (tokenNumber_Minimum == ((SchemaObject) node).tokenNumber_Minimum) && (tokenInteger_MaxItems == ((SchemaObject) node).tokenInteger_MaxItems) && (tokenInteger_MinItems == ((SchemaObject) node).tokenInteger_MinItems) && (tokenInteger_MaxLength == ((SchemaObject) node).tokenInteger_MaxLength) && (tokenInteger_MinLength == ((SchemaObject) node).tokenInteger_MinLength) && (tokenInteger_MaxProperties == ((SchemaObject) node).tokenInteger_MaxProperties) && (tokenInteger_MinProperties == ((SchemaObject) node).tokenInteger_MinProperties) && (tokenNumber_MultipleOf == ((SchemaObject) node).tokenNumber_MultipleOf) && (tokenBoolean_Nullable == ((SchemaObject) node).tokenBoolean_Nullable) && (tokenString_Pattern == ((SchemaObject) node).tokenString_Pattern) && (tokenBoolean_ReadOnly == ((SchemaObject) node).tokenBoolean_ReadOnly) && (tokenBoolean_WriteOnly == ((SchemaObject) node).tokenBoolean_WriteOnly) && (tokenString_Type == ((SchemaObject) node).tokenString_Type) && (tokenString_Title == ((SchemaObject) node).tokenString_Title) && (tokenBoolean_UniqueItems == ((SchemaObject) node).tokenBoolean_UniqueItems);    
  }
  /**
   * Replaces the optional node for the AdditionalProperties child. This is the <code>Opt</code>
   * node containing the child AdditionalProperties, not the actual child!
   * @param opt The new node to be used as the optional node for the AdditionalProperties child.
   * @apilevel low-level
   */
  public void setAdditionalPropertiesOpt(Opt<AdditionalProperties> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) AdditionalProperties child.
   * @param node The new node to be used as the AdditionalProperties child.
   * @apilevel high-level
   */
  public void setAdditionalProperties(AdditionalProperties node) {
    getAdditionalPropertiesOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional AdditionalProperties child exists.
   * @return {@code true} if the optional AdditionalProperties child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasAdditionalProperties() {
    return getAdditionalPropertiesOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) AdditionalProperties child.
   * @return The AdditionalProperties child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public AdditionalProperties getAdditionalProperties() {
    return (AdditionalProperties) getAdditionalPropertiesOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the AdditionalProperties child. This is the <code>Opt</code> node containing the child AdditionalProperties, not the actual child!
   * @return The optional node for child the AdditionalProperties child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="AdditionalProperties")
  public Opt<AdditionalProperties> getAdditionalPropertiesOpt() {
    return (Opt<AdditionalProperties>) getChild(0);
  }
  /**
   * Retrieves the optional node for child AdditionalProperties. This is the <code>Opt</code> node containing the child AdditionalProperties, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child AdditionalProperties.
   * @apilevel low-level
   */
  public Opt<AdditionalProperties> getAdditionalPropertiesOptNoTransform() {
    return (Opt<AdditionalProperties>) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme AdditionalPropertiesAllowed.
   * @param value The new value for the lexeme AdditionalPropertiesAllowed.
   * @apilevel high-level
   */
  public void setAdditionalPropertiesAllowed(Boolean value) {
    tokenBoolean_AdditionalPropertiesAllowed = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_AdditionalPropertiesAllowed;
  /**
   * Retrieves the value for the lexeme AdditionalPropertiesAllowed.
   * @return The value for the lexeme AdditionalPropertiesAllowed.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="AdditionalPropertiesAllowed")
  public Boolean getAdditionalPropertiesAllowed() {
    return tokenBoolean_AdditionalPropertiesAllowed;
  }
  /**
   * Replaces the lexeme DefaultValue.
   * @param value The new value for the lexeme DefaultValue.
   * @apilevel high-level
   */
  public void setDefaultValue(Object value) {
    tokenObject_DefaultValue = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_DefaultValue;
  /**
   * Retrieves the value for the lexeme DefaultValue.
   * @return The value for the lexeme DefaultValue.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="DefaultValue")
  public Object getDefaultValue() {
    return tokenObject_DefaultValue;
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
   * Replaces the optional node for the DiscriminatorObject child. This is the <code>Opt</code>
   * node containing the child DiscriminatorObject, not the actual child!
   * @param opt The new node to be used as the optional node for the DiscriminatorObject child.
   * @apilevel low-level
   */
  public void setDiscriminatorObjectOpt(Opt<DiscriminatorObject> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) DiscriminatorObject child.
   * @param node The new node to be used as the DiscriminatorObject child.
   * @apilevel high-level
   */
  public void setDiscriminatorObject(DiscriminatorObject node) {
    getDiscriminatorObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional DiscriminatorObject child exists.
   * @return {@code true} if the optional DiscriminatorObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasDiscriminatorObject() {
    return getDiscriminatorObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) DiscriminatorObject child.
   * @return The DiscriminatorObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public DiscriminatorObject getDiscriminatorObject() {
    return (DiscriminatorObject) getDiscriminatorObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the DiscriminatorObject child. This is the <code>Opt</code> node containing the child DiscriminatorObject, not the actual child!
   * @return The optional node for child the DiscriminatorObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="DiscriminatorObject")
  public Opt<DiscriminatorObject> getDiscriminatorObjectOpt() {
    return (Opt<DiscriminatorObject>) getChild(1);
  }
  /**
   * Retrieves the optional node for child DiscriminatorObject. This is the <code>Opt</code> node containing the child DiscriminatorObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child DiscriminatorObject.
   * @apilevel low-level
   */
  public Opt<DiscriminatorObject> getDiscriminatorObjectOptNoTransform() {
    return (Opt<DiscriminatorObject>) getChildNoTransform(1);
  }
  /**
   * Replaces the EnumObj list.
   * @param list The new list node to be used as the EnumObj list.
   * @apilevel high-level
   */
  public void setEnumObjList(JastAddList<EnumObj> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the EnumObj list.
   * @return Number of children in the EnumObj list.
   * @apilevel high-level
   */
  public int getNumEnumObj() {
    return getEnumObjList().getNumChild();
  }
  /**
   * Retrieves the number of children in the EnumObj list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the EnumObj list.
   * @apilevel low-level
   */
  public int getNumEnumObjNoTransform() {
    return getEnumObjListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the EnumObj list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the EnumObj list.
   * @apilevel high-level
   */
  public EnumObj getEnumObj(int i) {
    return (EnumObj) getEnumObjList().getChild(i);
  }
  /**
   * Check whether the EnumObj list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasEnumObj() {
    return getEnumObjList().getNumChild() != 0;
  }
  /**
   * Append an element to the EnumObj list.
   * @param node The element to append to the EnumObj list.
   * @apilevel high-level
   */
  public void addEnumObj(EnumObj node) {
    JastAddList<EnumObj> list = (parent == null) ? getEnumObjListNoTransform() : getEnumObjList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addEnumObjNoTransform(EnumObj node) {
    JastAddList<EnumObj> list = getEnumObjListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the EnumObj list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setEnumObj(EnumObj node, int i) {
    JastAddList<EnumObj> list = getEnumObjList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the EnumObj list.
   * @return The node representing the EnumObj list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="EnumObj")
  public JastAddList<EnumObj> getEnumObjList() {
    JastAddList<EnumObj> list = (JastAddList<EnumObj>) getChild(2);
    return list;
  }
  /**
   * Retrieves the EnumObj list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the EnumObj list.
   * @apilevel low-level
   */
  public JastAddList<EnumObj> getEnumObjListNoTransform() {
    return (JastAddList<EnumObj>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the EnumObj list without
   * triggering rewrites.
   */
  public EnumObj getEnumObjNoTransform(int i) {
    return (EnumObj) getEnumObjListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the EnumObj list.
   * @return The node representing the EnumObj list.
   * @apilevel high-level
   */
  public JastAddList<EnumObj> getEnumObjs() {
    return getEnumObjList();
  }
  /**
   * Retrieves the EnumObj list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the EnumObj list.
   * @apilevel low-level
   */
  public JastAddList<EnumObj> getEnumObjsNoTransform() {
    return getEnumObjListNoTransform();
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
   * Replaces the lexeme ExclusiveMaximum.
   * @param value The new value for the lexeme ExclusiveMaximum.
   * @apilevel high-level
   */
  public void setExclusiveMaximum(Boolean value) {
    tokenBoolean_ExclusiveMaximum = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_ExclusiveMaximum;
  /**
   * Retrieves the value for the lexeme ExclusiveMaximum.
   * @return The value for the lexeme ExclusiveMaximum.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ExclusiveMaximum")
  public Boolean getExclusiveMaximum() {
    return tokenBoolean_ExclusiveMaximum;
  }
  /**
   * Replaces the lexeme ExclusiveMinimum.
   * @param value The new value for the lexeme ExclusiveMinimum.
   * @apilevel high-level
   */
  public void setExclusiveMinimum(Boolean value) {
    tokenBoolean_ExclusiveMinimum = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_ExclusiveMinimum;
  /**
   * Retrieves the value for the lexeme ExclusiveMinimum.
   * @return The value for the lexeme ExclusiveMinimum.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ExclusiveMinimum")
  public Boolean getExclusiveMinimum() {
    return tokenBoolean_ExclusiveMinimum;
  }
  /**
   * Replaces the optional node for the ExternalDocObject child. This is the <code>Opt</code>
   * node containing the child ExternalDocObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ExternalDocObject child.
   * @apilevel low-level
   */
  public void setExternalDocObjectOpt(Opt<ExternalDocObject> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) ExternalDocObject child.
   * @param node The new node to be used as the ExternalDocObject child.
   * @apilevel high-level
   */
  public void setExternalDocObject(ExternalDocObject node) {
    getExternalDocObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ExternalDocObject child exists.
   * @return {@code true} if the optional ExternalDocObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasExternalDocObject() {
    return getExternalDocObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ExternalDocObject child.
   * @return The ExternalDocObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ExternalDocObject getExternalDocObject() {
    return (ExternalDocObject) getExternalDocObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ExternalDocObject child. This is the <code>Opt</code> node containing the child ExternalDocObject, not the actual child!
   * @return The optional node for child the ExternalDocObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ExternalDocObject")
  public Opt<ExternalDocObject> getExternalDocObjectOpt() {
    return (Opt<ExternalDocObject>) getChild(3);
  }
  /**
   * Retrieves the optional node for child ExternalDocObject. This is the <code>Opt</code> node containing the child ExternalDocObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ExternalDocObject.
   * @apilevel low-level
   */
  public Opt<ExternalDocObject> getExternalDocObjectOptNoTransform() {
    return (Opt<ExternalDocObject>) getChildNoTransform(3);
  }
  /**
   * Replaces the lexeme Format.
   * @param value The new value for the lexeme Format.
   * @apilevel high-level
   */
  public void setFormat(String value) {
    tokenString_Format = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Format;
  /**
   * Retrieves the value for the lexeme Format.
   * @return The value for the lexeme Format.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Format")
  public String getFormat() {
    return tokenString_Format != null ? tokenString_Format : "";
  }
  /**
   * Replaces the optional node for the ItemsSchema child. This is the <code>Opt</code>
   * node containing the child ItemsSchema, not the actual child!
   * @param opt The new node to be used as the optional node for the ItemsSchema child.
   * @apilevel low-level
   */
  public void setItemsSchemaOpt(Opt<ItemsSchema> opt) {
    setChild(opt, 4);
  }
  /**
   * Replaces the (optional) ItemsSchema child.
   * @param node The new node to be used as the ItemsSchema child.
   * @apilevel high-level
   */
  public void setItemsSchema(ItemsSchema node) {
    getItemsSchemaOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ItemsSchema child exists.
   * @return {@code true} if the optional ItemsSchema child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasItemsSchema() {
    return getItemsSchemaOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ItemsSchema child.
   * @return The ItemsSchema child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ItemsSchema getItemsSchema() {
    return (ItemsSchema) getItemsSchemaOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ItemsSchema child. This is the <code>Opt</code> node containing the child ItemsSchema, not the actual child!
   * @return The optional node for child the ItemsSchema child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ItemsSchema")
  public Opt<ItemsSchema> getItemsSchemaOpt() {
    return (Opt<ItemsSchema>) getChild(4);
  }
  /**
   * Retrieves the optional node for child ItemsSchema. This is the <code>Opt</code> node containing the child ItemsSchema, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ItemsSchema.
   * @apilevel low-level
   */
  public Opt<ItemsSchema> getItemsSchemaOptNoTransform() {
    return (Opt<ItemsSchema>) getChildNoTransform(4);
  }
  /**
   * Replaces the lexeme Maximum.
   * @param value The new value for the lexeme Maximum.
   * @apilevel high-level
   */
  public void setMaximum(Number value) {
    tokenNumber_Maximum = value;
  }
  /** @apilevel internal 
   */
  protected Number tokenNumber_Maximum;
  /**
   * Retrieves the value for the lexeme Maximum.
   * @return The value for the lexeme Maximum.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Maximum")
  public Number getMaximum() {
    return tokenNumber_Maximum;
  }
  /**
   * Replaces the lexeme Minimum.
   * @param value The new value for the lexeme Minimum.
   * @apilevel high-level
   */
  public void setMinimum(Number value) {
    tokenNumber_Minimum = value;
  }
  /** @apilevel internal 
   */
  protected Number tokenNumber_Minimum;
  /**
   * Retrieves the value for the lexeme Minimum.
   * @return The value for the lexeme Minimum.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Minimum")
  public Number getMinimum() {
    return tokenNumber_Minimum;
  }
  /**
   * Replaces the lexeme MaxItems.
   * @param value The new value for the lexeme MaxItems.
   * @apilevel high-level
   */
  public void setMaxItems(Integer value) {
    tokenInteger_MaxItems = value;
  }
  /** @apilevel internal 
   */
  protected Integer tokenInteger_MaxItems;
  /**
   * Retrieves the value for the lexeme MaxItems.
   * @return The value for the lexeme MaxItems.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MaxItems")
  public Integer getMaxItems() {
    return tokenInteger_MaxItems;
  }
  /**
   * Replaces the lexeme MinItems.
   * @param value The new value for the lexeme MinItems.
   * @apilevel high-level
   */
  public void setMinItems(Integer value) {
    tokenInteger_MinItems = value;
  }
  /** @apilevel internal 
   */
  protected Integer tokenInteger_MinItems;
  /**
   * Retrieves the value for the lexeme MinItems.
   * @return The value for the lexeme MinItems.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MinItems")
  public Integer getMinItems() {
    return tokenInteger_MinItems;
  }
  /**
   * Replaces the lexeme MaxLength.
   * @param value The new value for the lexeme MaxLength.
   * @apilevel high-level
   */
  public void setMaxLength(Integer value) {
    tokenInteger_MaxLength = value;
  }
  /** @apilevel internal 
   */
  protected Integer tokenInteger_MaxLength;
  /**
   * Retrieves the value for the lexeme MaxLength.
   * @return The value for the lexeme MaxLength.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MaxLength")
  public Integer getMaxLength() {
    return tokenInteger_MaxLength;
  }
  /**
   * Replaces the lexeme MinLength.
   * @param value The new value for the lexeme MinLength.
   * @apilevel high-level
   */
  public void setMinLength(Integer value) {
    tokenInteger_MinLength = value;
  }
  /** @apilevel internal 
   */
  protected Integer tokenInteger_MinLength;
  /**
   * Retrieves the value for the lexeme MinLength.
   * @return The value for the lexeme MinLength.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MinLength")
  public Integer getMinLength() {
    return tokenInteger_MinLength;
  }
  /**
   * Replaces the lexeme MaxProperties.
   * @param value The new value for the lexeme MaxProperties.
   * @apilevel high-level
   */
  public void setMaxProperties(Integer value) {
    tokenInteger_MaxProperties = value;
  }
  /** @apilevel internal 
   */
  protected Integer tokenInteger_MaxProperties;
  /**
   * Retrieves the value for the lexeme MaxProperties.
   * @return The value for the lexeme MaxProperties.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MaxProperties")
  public Integer getMaxProperties() {
    return tokenInteger_MaxProperties;
  }
  /**
   * Replaces the lexeme MinProperties.
   * @param value The new value for the lexeme MinProperties.
   * @apilevel high-level
   */
  public void setMinProperties(Integer value) {
    tokenInteger_MinProperties = value;
  }
  /** @apilevel internal 
   */
  protected Integer tokenInteger_MinProperties;
  /**
   * Retrieves the value for the lexeme MinProperties.
   * @return The value for the lexeme MinProperties.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MinProperties")
  public Integer getMinProperties() {
    return tokenInteger_MinProperties;
  }
  /**
   * Replaces the lexeme MultipleOf.
   * @param value The new value for the lexeme MultipleOf.
   * @apilevel high-level
   */
  public void setMultipleOf(Number value) {
    tokenNumber_MultipleOf = value;
  }
  /** @apilevel internal 
   */
  protected Number tokenNumber_MultipleOf;
  /**
   * Retrieves the value for the lexeme MultipleOf.
   * @return The value for the lexeme MultipleOf.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MultipleOf")
  public Number getMultipleOf() {
    return tokenNumber_MultipleOf;
  }
  /**
   * Replaces the optional node for the NotSchema child. This is the <code>Opt</code>
   * node containing the child NotSchema, not the actual child!
   * @param opt The new node to be used as the optional node for the NotSchema child.
   * @apilevel low-level
   */
  public void setNotSchemaOpt(Opt<NotSchema> opt) {
    setChild(opt, 5);
  }
  /**
   * Replaces the (optional) NotSchema child.
   * @param node The new node to be used as the NotSchema child.
   * @apilevel high-level
   */
  public void setNotSchema(NotSchema node) {
    getNotSchemaOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional NotSchema child exists.
   * @return {@code true} if the optional NotSchema child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasNotSchema() {
    return getNotSchemaOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) NotSchema child.
   * @return The NotSchema child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public NotSchema getNotSchema() {
    return (NotSchema) getNotSchemaOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the NotSchema child. This is the <code>Opt</code> node containing the child NotSchema, not the actual child!
   * @return The optional node for child the NotSchema child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="NotSchema")
  public Opt<NotSchema> getNotSchemaOpt() {
    return (Opt<NotSchema>) getChild(5);
  }
  /**
   * Retrieves the optional node for child NotSchema. This is the <code>Opt</code> node containing the child NotSchema, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child NotSchema.
   * @apilevel low-level
   */
  public Opt<NotSchema> getNotSchemaOptNoTransform() {
    return (Opt<NotSchema>) getChildNoTransform(5);
  }
  /**
   * Replaces the lexeme Nullable.
   * @param value The new value for the lexeme Nullable.
   * @apilevel high-level
   */
  public void setNullable(Boolean value) {
    tokenBoolean_Nullable = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_Nullable;
  /**
   * Retrieves the value for the lexeme Nullable.
   * @return The value for the lexeme Nullable.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Nullable")
  public Boolean getNullable() {
    return tokenBoolean_Nullable;
  }
  /**
   * Replaces the lexeme Pattern.
   * @param value The new value for the lexeme Pattern.
   * @apilevel high-level
   */
  public void setPattern(String value) {
    tokenString_Pattern = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Pattern;
  /**
   * Retrieves the value for the lexeme Pattern.
   * @return The value for the lexeme Pattern.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Pattern")
  public String getPattern() {
    return tokenString_Pattern != null ? tokenString_Pattern : "";
  }
  /**
   * Replaces the PropertyItem list.
   * @param list The new list node to be used as the PropertyItem list.
   * @apilevel high-level
   */
  public void setPropertyItemList(JastAddList<PropertyItem> list) {
    setChild(list, 6);
  }
  /**
   * Retrieves the number of children in the PropertyItem list.
   * @return Number of children in the PropertyItem list.
   * @apilevel high-level
   */
  public int getNumPropertyItem() {
    return getPropertyItemList().getNumChild();
  }
  /**
   * Retrieves the number of children in the PropertyItem list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the PropertyItem list.
   * @apilevel low-level
   */
  public int getNumPropertyItemNoTransform() {
    return getPropertyItemListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the PropertyItem list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the PropertyItem list.
   * @apilevel high-level
   */
  public PropertyItem getPropertyItem(int i) {
    return (PropertyItem) getPropertyItemList().getChild(i);
  }
  /**
   * Check whether the PropertyItem list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasPropertyItem() {
    return getPropertyItemList().getNumChild() != 0;
  }
  /**
   * Append an element to the PropertyItem list.
   * @param node The element to append to the PropertyItem list.
   * @apilevel high-level
   */
  public void addPropertyItem(PropertyItem node) {
    JastAddList<PropertyItem> list = (parent == null) ? getPropertyItemListNoTransform() : getPropertyItemList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addPropertyItemNoTransform(PropertyItem node) {
    JastAddList<PropertyItem> list = getPropertyItemListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the PropertyItem list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setPropertyItem(PropertyItem node, int i) {
    JastAddList<PropertyItem> list = getPropertyItemList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the PropertyItem list.
   * @return The node representing the PropertyItem list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="PropertyItem")
  public JastAddList<PropertyItem> getPropertyItemList() {
    JastAddList<PropertyItem> list = (JastAddList<PropertyItem>) getChild(6);
    return list;
  }
  /**
   * Retrieves the PropertyItem list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the PropertyItem list.
   * @apilevel low-level
   */
  public JastAddList<PropertyItem> getPropertyItemListNoTransform() {
    return (JastAddList<PropertyItem>) getChildNoTransform(6);
  }
  /**
   * @return the element at index {@code i} in the PropertyItem list without
   * triggering rewrites.
   */
  public PropertyItem getPropertyItemNoTransform(int i) {
    return (PropertyItem) getPropertyItemListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the PropertyItem list.
   * @return The node representing the PropertyItem list.
   * @apilevel high-level
   */
  public JastAddList<PropertyItem> getPropertyItems() {
    return getPropertyItemList();
  }
  /**
   * Retrieves the PropertyItem list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the PropertyItem list.
   * @apilevel low-level
   */
  public JastAddList<PropertyItem> getPropertyItemsNoTransform() {
    return getPropertyItemListNoTransform();
  }
  /**
   * Replaces the RequiredField list.
   * @param list The new list node to be used as the RequiredField list.
   * @apilevel high-level
   */
  public void setRequiredFieldList(JastAddList<RequiredField> list) {
    setChild(list, 7);
  }
  /**
   * Retrieves the number of children in the RequiredField list.
   * @return Number of children in the RequiredField list.
   * @apilevel high-level
   */
  public int getNumRequiredField() {
    return getRequiredFieldList().getNumChild();
  }
  /**
   * Retrieves the number of children in the RequiredField list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the RequiredField list.
   * @apilevel low-level
   */
  public int getNumRequiredFieldNoTransform() {
    return getRequiredFieldListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the RequiredField list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the RequiredField list.
   * @apilevel high-level
   */
  public RequiredField getRequiredField(int i) {
    return (RequiredField) getRequiredFieldList().getChild(i);
  }
  /**
   * Check whether the RequiredField list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasRequiredField() {
    return getRequiredFieldList().getNumChild() != 0;
  }
  /**
   * Append an element to the RequiredField list.
   * @param node The element to append to the RequiredField list.
   * @apilevel high-level
   */
  public void addRequiredField(RequiredField node) {
    JastAddList<RequiredField> list = (parent == null) ? getRequiredFieldListNoTransform() : getRequiredFieldList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addRequiredFieldNoTransform(RequiredField node) {
    JastAddList<RequiredField> list = getRequiredFieldListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the RequiredField list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setRequiredField(RequiredField node, int i) {
    JastAddList<RequiredField> list = getRequiredFieldList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the RequiredField list.
   * @return The node representing the RequiredField list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="RequiredField")
  public JastAddList<RequiredField> getRequiredFieldList() {
    JastAddList<RequiredField> list = (JastAddList<RequiredField>) getChild(7);
    return list;
  }
  /**
   * Retrieves the RequiredField list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the RequiredField list.
   * @apilevel low-level
   */
  public JastAddList<RequiredField> getRequiredFieldListNoTransform() {
    return (JastAddList<RequiredField>) getChildNoTransform(7);
  }
  /**
   * @return the element at index {@code i} in the RequiredField list without
   * triggering rewrites.
   */
  public RequiredField getRequiredFieldNoTransform(int i) {
    return (RequiredField) getRequiredFieldListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the RequiredField list.
   * @return The node representing the RequiredField list.
   * @apilevel high-level
   */
  public JastAddList<RequiredField> getRequiredFields() {
    return getRequiredFieldList();
  }
  /**
   * Retrieves the RequiredField list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the RequiredField list.
   * @apilevel low-level
   */
  public JastAddList<RequiredField> getRequiredFieldsNoTransform() {
    return getRequiredFieldListNoTransform();
  }
  /**
   * Replaces the AllOfSchema list.
   * @param list The new list node to be used as the AllOfSchema list.
   * @apilevel high-level
   */
  public void setAllOfSchemaList(JastAddList<AllOfSchema> list) {
    setChild(list, 8);
  }
  /**
   * Retrieves the number of children in the AllOfSchema list.
   * @return Number of children in the AllOfSchema list.
   * @apilevel high-level
   */
  public int getNumAllOfSchema() {
    return getAllOfSchemaList().getNumChild();
  }
  /**
   * Retrieves the number of children in the AllOfSchema list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the AllOfSchema list.
   * @apilevel low-level
   */
  public int getNumAllOfSchemaNoTransform() {
    return getAllOfSchemaListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the AllOfSchema list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the AllOfSchema list.
   * @apilevel high-level
   */
  public AllOfSchema getAllOfSchema(int i) {
    return (AllOfSchema) getAllOfSchemaList().getChild(i);
  }
  /**
   * Check whether the AllOfSchema list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasAllOfSchema() {
    return getAllOfSchemaList().getNumChild() != 0;
  }
  /**
   * Append an element to the AllOfSchema list.
   * @param node The element to append to the AllOfSchema list.
   * @apilevel high-level
   */
  public void addAllOfSchema(AllOfSchema node) {
    JastAddList<AllOfSchema> list = (parent == null) ? getAllOfSchemaListNoTransform() : getAllOfSchemaList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addAllOfSchemaNoTransform(AllOfSchema node) {
    JastAddList<AllOfSchema> list = getAllOfSchemaListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the AllOfSchema list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setAllOfSchema(AllOfSchema node, int i) {
    JastAddList<AllOfSchema> list = getAllOfSchemaList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the AllOfSchema list.
   * @return The node representing the AllOfSchema list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="AllOfSchema")
  public JastAddList<AllOfSchema> getAllOfSchemaList() {
    JastAddList<AllOfSchema> list = (JastAddList<AllOfSchema>) getChild(8);
    return list;
  }
  /**
   * Retrieves the AllOfSchema list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the AllOfSchema list.
   * @apilevel low-level
   */
  public JastAddList<AllOfSchema> getAllOfSchemaListNoTransform() {
    return (JastAddList<AllOfSchema>) getChildNoTransform(8);
  }
  /**
   * @return the element at index {@code i} in the AllOfSchema list without
   * triggering rewrites.
   */
  public AllOfSchema getAllOfSchemaNoTransform(int i) {
    return (AllOfSchema) getAllOfSchemaListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the AllOfSchema list.
   * @return The node representing the AllOfSchema list.
   * @apilevel high-level
   */
  public JastAddList<AllOfSchema> getAllOfSchemas() {
    return getAllOfSchemaList();
  }
  /**
   * Retrieves the AllOfSchema list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the AllOfSchema list.
   * @apilevel low-level
   */
  public JastAddList<AllOfSchema> getAllOfSchemasNoTransform() {
    return getAllOfSchemaListNoTransform();
  }
  /**
   * Replaces the AnyOfSchema list.
   * @param list The new list node to be used as the AnyOfSchema list.
   * @apilevel high-level
   */
  public void setAnyOfSchemaList(JastAddList<AnyOfSchema> list) {
    setChild(list, 9);
  }
  /**
   * Retrieves the number of children in the AnyOfSchema list.
   * @return Number of children in the AnyOfSchema list.
   * @apilevel high-level
   */
  public int getNumAnyOfSchema() {
    return getAnyOfSchemaList().getNumChild();
  }
  /**
   * Retrieves the number of children in the AnyOfSchema list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the AnyOfSchema list.
   * @apilevel low-level
   */
  public int getNumAnyOfSchemaNoTransform() {
    return getAnyOfSchemaListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the AnyOfSchema list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the AnyOfSchema list.
   * @apilevel high-level
   */
  public AnyOfSchema getAnyOfSchema(int i) {
    return (AnyOfSchema) getAnyOfSchemaList().getChild(i);
  }
  /**
   * Check whether the AnyOfSchema list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasAnyOfSchema() {
    return getAnyOfSchemaList().getNumChild() != 0;
  }
  /**
   * Append an element to the AnyOfSchema list.
   * @param node The element to append to the AnyOfSchema list.
   * @apilevel high-level
   */
  public void addAnyOfSchema(AnyOfSchema node) {
    JastAddList<AnyOfSchema> list = (parent == null) ? getAnyOfSchemaListNoTransform() : getAnyOfSchemaList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addAnyOfSchemaNoTransform(AnyOfSchema node) {
    JastAddList<AnyOfSchema> list = getAnyOfSchemaListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the AnyOfSchema list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setAnyOfSchema(AnyOfSchema node, int i) {
    JastAddList<AnyOfSchema> list = getAnyOfSchemaList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the AnyOfSchema list.
   * @return The node representing the AnyOfSchema list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="AnyOfSchema")
  public JastAddList<AnyOfSchema> getAnyOfSchemaList() {
    JastAddList<AnyOfSchema> list = (JastAddList<AnyOfSchema>) getChild(9);
    return list;
  }
  /**
   * Retrieves the AnyOfSchema list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the AnyOfSchema list.
   * @apilevel low-level
   */
  public JastAddList<AnyOfSchema> getAnyOfSchemaListNoTransform() {
    return (JastAddList<AnyOfSchema>) getChildNoTransform(9);
  }
  /**
   * @return the element at index {@code i} in the AnyOfSchema list without
   * triggering rewrites.
   */
  public AnyOfSchema getAnyOfSchemaNoTransform(int i) {
    return (AnyOfSchema) getAnyOfSchemaListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the AnyOfSchema list.
   * @return The node representing the AnyOfSchema list.
   * @apilevel high-level
   */
  public JastAddList<AnyOfSchema> getAnyOfSchemas() {
    return getAnyOfSchemaList();
  }
  /**
   * Retrieves the AnyOfSchema list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the AnyOfSchema list.
   * @apilevel low-level
   */
  public JastAddList<AnyOfSchema> getAnyOfSchemasNoTransform() {
    return getAnyOfSchemaListNoTransform();
  }
  /**
   * Replaces the OneOfSchema list.
   * @param list The new list node to be used as the OneOfSchema list.
   * @apilevel high-level
   */
  public void setOneOfSchemaList(JastAddList<OneOfSchema> list) {
    setChild(list, 10);
  }
  /**
   * Retrieves the number of children in the OneOfSchema list.
   * @return Number of children in the OneOfSchema list.
   * @apilevel high-level
   */
  public int getNumOneOfSchema() {
    return getOneOfSchemaList().getNumChild();
  }
  /**
   * Retrieves the number of children in the OneOfSchema list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the OneOfSchema list.
   * @apilevel low-level
   */
  public int getNumOneOfSchemaNoTransform() {
    return getOneOfSchemaListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the OneOfSchema list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the OneOfSchema list.
   * @apilevel high-level
   */
  public OneOfSchema getOneOfSchema(int i) {
    return (OneOfSchema) getOneOfSchemaList().getChild(i);
  }
  /**
   * Check whether the OneOfSchema list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasOneOfSchema() {
    return getOneOfSchemaList().getNumChild() != 0;
  }
  /**
   * Append an element to the OneOfSchema list.
   * @param node The element to append to the OneOfSchema list.
   * @apilevel high-level
   */
  public void addOneOfSchema(OneOfSchema node) {
    JastAddList<OneOfSchema> list = (parent == null) ? getOneOfSchemaListNoTransform() : getOneOfSchemaList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addOneOfSchemaNoTransform(OneOfSchema node) {
    JastAddList<OneOfSchema> list = getOneOfSchemaListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the OneOfSchema list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setOneOfSchema(OneOfSchema node, int i) {
    JastAddList<OneOfSchema> list = getOneOfSchemaList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the OneOfSchema list.
   * @return The node representing the OneOfSchema list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="OneOfSchema")
  public JastAddList<OneOfSchema> getOneOfSchemaList() {
    JastAddList<OneOfSchema> list = (JastAddList<OneOfSchema>) getChild(10);
    return list;
  }
  /**
   * Retrieves the OneOfSchema list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the OneOfSchema list.
   * @apilevel low-level
   */
  public JastAddList<OneOfSchema> getOneOfSchemaListNoTransform() {
    return (JastAddList<OneOfSchema>) getChildNoTransform(10);
  }
  /**
   * @return the element at index {@code i} in the OneOfSchema list without
   * triggering rewrites.
   */
  public OneOfSchema getOneOfSchemaNoTransform(int i) {
    return (OneOfSchema) getOneOfSchemaListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the OneOfSchema list.
   * @return The node representing the OneOfSchema list.
   * @apilevel high-level
   */
  public JastAddList<OneOfSchema> getOneOfSchemas() {
    return getOneOfSchemaList();
  }
  /**
   * Retrieves the OneOfSchema list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the OneOfSchema list.
   * @apilevel low-level
   */
  public JastAddList<OneOfSchema> getOneOfSchemasNoTransform() {
    return getOneOfSchemaListNoTransform();
  }
  /**
   * Replaces the lexeme ReadOnly.
   * @param value The new value for the lexeme ReadOnly.
   * @apilevel high-level
   */
  public void setReadOnly(Boolean value) {
    tokenBoolean_ReadOnly = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_ReadOnly;
  /**
   * Retrieves the value for the lexeme ReadOnly.
   * @return The value for the lexeme ReadOnly.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ReadOnly")
  public Boolean getReadOnly() {
    return tokenBoolean_ReadOnly;
  }
  /**
   * Replaces the lexeme WriteOnly.
   * @param value The new value for the lexeme WriteOnly.
   * @apilevel high-level
   */
  public void setWriteOnly(Boolean value) {
    tokenBoolean_WriteOnly = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_WriteOnly;
  /**
   * Retrieves the value for the lexeme WriteOnly.
   * @return The value for the lexeme WriteOnly.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="WriteOnly")
  public Boolean getWriteOnly() {
    return tokenBoolean_WriteOnly;
  }
  /**
   * Replaces the lexeme Type.
   * @param value The new value for the lexeme Type.
   * @apilevel high-level
   */
  public void setType(String value) {
    tokenString_Type = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Type;
  /**
   * Retrieves the value for the lexeme Type.
   * @return The value for the lexeme Type.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Type")
  public String getType() {
    return tokenString_Type != null ? tokenString_Type : "";
  }
  /**
   * Replaces the lexeme Title.
   * @param value The new value for the lexeme Title.
   * @apilevel high-level
   */
  public void setTitle(String value) {
    tokenString_Title = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Title;
  /**
   * Retrieves the value for the lexeme Title.
   * @return The value for the lexeme Title.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Title")
  public String getTitle() {
    return tokenString_Title != null ? tokenString_Title : "";
  }
  /**
   * Replaces the lexeme UniqueItems.
   * @param value The new value for the lexeme UniqueItems.
   * @apilevel high-level
   */
  public void setUniqueItems(Boolean value) {
    tokenBoolean_UniqueItems = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_UniqueItems;
  /**
   * Retrieves the value for the lexeme UniqueItems.
   * @return The value for the lexeme UniqueItems.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="UniqueItems")
  public Boolean getUniqueItems() {
    return tokenBoolean_UniqueItems;
  }
  /**
   * Replaces the optional node for the XmlObject child. This is the <code>Opt</code>
   * node containing the child XmlObject, not the actual child!
   * @param opt The new node to be used as the optional node for the XmlObject child.
   * @apilevel low-level
   */
  public void setXmlObjectOpt(Opt<XmlObject> opt) {
    setChild(opt, 11);
  }
  /**
   * Replaces the (optional) XmlObject child.
   * @param node The new node to be used as the XmlObject child.
   * @apilevel high-level
   */
  public void setXmlObject(XmlObject node) {
    getXmlObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional XmlObject child exists.
   * @return {@code true} if the optional XmlObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasXmlObject() {
    return getXmlObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) XmlObject child.
   * @return The XmlObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public XmlObject getXmlObject() {
    return (XmlObject) getXmlObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the XmlObject child. This is the <code>Opt</code> node containing the child XmlObject, not the actual child!
   * @return The optional node for child the XmlObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="XmlObject")
  public Opt<XmlObject> getXmlObjectOpt() {
    return (Opt<XmlObject>) getChild(11);
  }
  /**
   * Retrieves the optional node for child XmlObject. This is the <code>Opt</code> node containing the child XmlObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child XmlObject.
   * @apilevel low-level
   */
  public Opt<XmlObject> getXmlObjectOptNoTransform() {
    return (Opt<XmlObject>) getChildNoTransform(11);
  }
  /**
   * Replaces the Extension list.
   * @param list The new list node to be used as the Extension list.
   * @apilevel high-level
   */
  public void setExtensionList(JastAddList<Extension> list) {
    setChild(list, 12);
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
    JastAddList<Extension> list = (JastAddList<Extension>) getChild(12);
    return list;
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionListNoTransform() {
    return (JastAddList<Extension>) getChildNoTransform(12);
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
protected java.util.Set composeSchema_SchemaOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:701
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:701")
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
            SchemaObject s = (SchemaObject) schemaOb;
    
            if( s.hasAdditionalProperties() ) {
            SchemaOb o = s.getAdditionalProperties().getSchemaOb();
            if ( o instanceof SchemaObject )
            schema.setAdditionalProperties(((SchemaObject) o).composeSchema(o, map));
            else
            schema.setAdditionalProperties(((SchemaReference) o).composeSchema(o, map));
            }
            if( s.getAdditionalPropertiesAllowed() != null )
            schema.setAdditionalPropertiesAllowed(s.getAdditionalPropertiesAllowed());
            if( s.getDefaultValue() != null )
            schema.setDefault(s.getDefaultValue());
            if( !s.getDescription().isEmpty() )
            schema.setDescription(s.getDescription());
            if( s.getDeprecatedBoolean() != null )
            schema.setDeprecated(s.getDeprecatedBoolean());
            if( s.hasDiscriminatorObject() )
            schema.setDiscriminator(DiscriminatorObject.composeDiscriminator(s.getDiscriminatorObject(), map));
            if( s.getNumEnumObj() != 0 ){
            for( EnumObj e : s.getEnumObjs() )
            schema.addEnum(e.getEnumOb());
            }
            if( s.getExample() != null )
            schema.setExample(s.getExample());
            if( s.getExclusiveMaximum() != null )
            schema.setExclusiveMaximum(s.getExclusiveMaximum());
            if( s.getExclusiveMinimum() != null )
            schema.setExclusiveMinimum(s.getExclusiveMinimum());
            if( s.hasExternalDocObject() )
            schema.setExternalDocs(ExternalDocObject.composeExternalDocs(s.getExternalDocObject(), map));
            if( !s.getFormat().isEmpty() )
            schema.setFormat(s.getFormat());
            if( s.hasItemsSchema() ) {
            if (s.getItemsSchema().getSchemaOb() instanceof SchemaObject)
            schema.setItemsSchema(((SchemaObject) s.getItemsSchema().getSchemaOb()).composeSchema(s.getItemsSchema().getSchemaOb(), map));
            else
            schema.setItemsSchema(((SchemaReference) s.getItemsSchema().getSchemaOb()).composeSchema(s.getItemsSchema().getSchemaOb(), map));
            }
            if( s.getMaximum() != null )
            schema.setMaximum(s.getMaximum());
            if( s.getMinimum() != null )
            schema.setMinimum(s.getMinimum());
            if( s.getMaxItems() != null )
            schema.setMaxItems(s.getMaxItems());
            if( s.getMinItems() != null )
            schema.setMinItems(s.getMinItems());
            if( s.getMaxLength() != null )
            schema.setMaxLength(s.getMaxLength());
            if( s.getMinLength() != null )
            schema.setMinLength(s.getMinLength());
            if( s.getMaxProperties() != null )
            schema.setMaxProperties(s.getMaxProperties());
            if( s.getMinProperties() != null )
            schema.setMinProperties(s.getMinProperties());
            if( s.getMultipleOf() != null )
            schema.setMultipleOf(s.getMultipleOf());
            if( s.hasNotSchema() ) {
            if( s.getNotSchema().getSchemaOb() instanceof SchemaObject )
            schema.setNotSchema(((SchemaObject) s.getNotSchema().getSchemaOb()).composeSchema(s.getNotSchema().getSchemaOb(), map));
            else
            schema.setNotSchema(((SchemaReference) s.getNotSchema().getSchemaOb()).composeSchema(s.getNotSchema().getSchemaOb(), map));
            }
            if( s.getNullable() != null )
            schema.setNullable(s.getNullable());
            if( !s.getPattern().isEmpty() )
            schema.setPattern(s.getPattern());
            if( s.getNumPropertyItem() != 0 ){
            Map<String, org.openapi4j.parser.model.v3.Schema> properties = new HashMap<>();
            for( PropertyItem p : s.getPropertyItemList() ) {
            if( p.getSchemaOb() instanceof SchemaObject )
            properties.put(p.getName(), ((SchemaObject) p.getSchemaOb()).composeSchema(p.getSchemaOb(), map));
            else
            properties.put(p.getName(), ((SchemaReference) p.getSchemaOb()).composeSchema(p.getSchemaOb(), map));
            }
            schema.setProperties(properties);
            }
            if( s.getNumRequiredField() != 0 ){
            for( RequiredField r : s.getRequiredFields() )
            schema.addRequiredField(r.getValue());
            }
            if( s.getNumAllOfSchema() != 0 ){
            for( AllOfSchema a : s.getAllOfSchemas() ) {
            if( a.getSchemaOb() instanceof SchemaObject )
            schema.addAllOfSchema(((SchemaObject) a.getSchemaOb()).composeSchema(a.getSchemaOb(), map));
            else
            schema.addAllOfSchema(((SchemaReference) a.getSchemaOb()).composeSchema(a.getSchemaOb(), map));
            }
            }
            if( s.getNumAnyOfSchema() != 0 ){
            for( AnyOfSchema a : s.getAnyOfSchemas() ) {
            if( a.getSchemaOb() instanceof SchemaObject )
            schema.addAnyOfSchema(((SchemaObject) a.getSchemaOb()).composeSchema(a.getSchemaOb(), map));
            else
            schema.addAnyOfSchema(((SchemaReference) a.getSchemaOb()).composeSchema(a.getSchemaOb(), map));
            }
            }
            if( s.getNumOneOfSchema() != 0 ){
            for( OneOfSchema o : s.getOneOfSchemas() ) {
            if( o.getSchemaOb() instanceof SchemaObject )
            schema.addOneOfSchema(((SchemaObject) o.getSchemaOb()).composeSchema(o.getSchemaOb(), map));
            else
            schema.addOneOfSchema(((SchemaReference) o.getSchemaOb()).composeSchema(o.getSchemaOb(), map));
            }
            }
            if( s.getReadOnly() != null )
            schema.setReadOnly(s.getReadOnly());
            if( s.getWriteOnly() != null )
            schema.setWriteOnly(s.getWriteOnly());
            if( !s.getType().isEmpty() )
            schema.setType(s.getType());
            if( !s.getTitle().isEmpty() )
            schema.setTitle(s.getTitle());
            if( s.getUniqueItems() != null )
            schema.setUniqueItems(s.getUniqueItems());
            if( s.hasXmlObject() )
            schema.setXml(XmlObject.composeXml(s.getXmlObject(), map));
            if( s.getNumExtension() != 0 ){
            Map<String, Object> extensionMap = new HashMap<>();
            for( Extension e : s.getExtensions() )
            extensionMap.put(e.getKey(), e.getValue());
            schema.setExtensions(extensionMap);
            }
    
            return schema;
            }
    finally {
      composeSchema_SchemaOb_Map_Object__ASTNode__visited.remove(_parameters);
    }
  }
/** @apilevel internal */
protected boolean schemaObject_visited = false;
  /**
   * @attribute syn
   * @aspect ReferenceGet
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\ReferenceGet.jrag:13
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ReferenceGet", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\ReferenceGet.jrag:12")
  public SchemaObject schemaObject() {
    if (schemaObject_visited) {
      throw new RuntimeException("Circular definition of attribute SchemaOb.schemaObject().");
    }
    schemaObject_visited = true;
    SchemaObject schemaObject_value = this;
    schemaObject_visited = false;
    return schemaObject_value;
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
