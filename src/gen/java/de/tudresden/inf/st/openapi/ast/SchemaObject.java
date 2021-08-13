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
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:85
 * @astdecl SchemaObject : ASTNode ::= [AdditionalProperties] <AdditionalPropertiesAllowed:Object> <DefaultValue:Object> <Description:String> <DeprecatedBoolean:Object> [DiscriminatorObject] EnumObj* <Example:Object> <ExclusiveMaximum:Object> <ExclusiveMinimum:Object> [ExternalDocumentationObject] <Format:String> [ItemsSchema] <Maximum:Object> <Minimum:Object> <MaxItems:Object> <MinItems:Object> <MaxLength:Object> <MinLength:Object> <MaxProperties:Object> <MinProperties:Object> <MultipleOf:Object> [NotSchema] <Nullable:Object> <Pattern:String> PropertyItem* RequiredField* AllOfSchema* AnyOfSchema* OneOfSchema* <ReadOnly:Object> <WriteOnly:Object> <Type:String> <Title:String> <UniqueItems:Object> [XmlObject] <Ref:String>;
 * @production SchemaObject : {@link ASTNode} ::= <span class="component">[{@link AdditionalProperties}]</span> <span class="component">&lt;AdditionalPropertiesAllowed:Object&gt;</span> <span class="component">&lt;DefaultValue:Object&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;DeprecatedBoolean:Object&gt;</span> <span class="component">[{@link DiscriminatorObject}]</span> <span class="component">{@link EnumObj}*</span> <span class="component">&lt;Example:Object&gt;</span> <span class="component">&lt;ExclusiveMaximum:Object&gt;</span> <span class="component">&lt;ExclusiveMinimum:Object&gt;</span> <span class="component">[{@link ExternalDocumentationObject}]</span> <span class="component">&lt;Format:String&gt;</span> <span class="component">[{@link ItemsSchema}]</span> <span class="component">&lt;Maximum:Object&gt;</span> <span class="component">&lt;Minimum:Object&gt;</span> <span class="component">&lt;MaxItems:Object&gt;</span> <span class="component">&lt;MinItems:Object&gt;</span> <span class="component">&lt;MaxLength:Object&gt;</span> <span class="component">&lt;MinLength:Object&gt;</span> <span class="component">&lt;MaxProperties:Object&gt;</span> <span class="component">&lt;MinProperties:Object&gt;</span> <span class="component">&lt;MultipleOf:Object&gt;</span> <span class="component">[{@link NotSchema}]</span> <span class="component">&lt;Nullable:Object&gt;</span> <span class="component">&lt;Pattern:String&gt;</span> <span class="component">{@link PropertyItem}*</span> <span class="component">{@link RequiredField}*</span> <span class="component">{@link AllOfSchema}*</span> <span class="component">{@link AnyOfSchema}*</span> <span class="component">{@link OneOfSchema}*</span> <span class="component">&lt;ReadOnly:Object&gt;</span> <span class="component">&lt;WriteOnly:Object&gt;</span> <span class="component">&lt;Type:String&gt;</span> <span class="component">&lt;Title:String&gt;</span> <span class="component">&lt;UniqueItems:Object&gt;</span> <span class="component">[{@link XmlObject}]</span> <span class="component">&lt;Ref:String&gt;</span>;

 */
public class SchemaObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jadd:564
   */
  public static org.openapi4j.parser.model.v3.Schema composeSchema (SchemaObject schemaObject) {
        org.openapi4j.parser.model.v3.Schema schema = new org.openapi4j.parser.model.v3.Schema();

        if( schemaObject.hasAdditionalProperties() )
        schema.setAdditionalProperties(composeSchema(schemaObject.getAdditionalProperties().getSchemaObject()));
        if( schemaObject.getAdditionalPropertiesAllowed() != null )
        schema.setAdditionalPropertiesAllowed((boolean)schemaObject.getAdditionalPropertiesAllowed());
        if( schemaObject.getDefaultValue() != null )
        schema.setDefault(schemaObject.getDefaultValue());
        if( !schemaObject.getDescription().isEmpty() )
        schema.setDescription(schemaObject.getDescription());
        if( schemaObject.getDeprecatedBoolean() != null )
        schema.setDeprecated((boolean)schemaObject.getDeprecatedBoolean());
        if( schemaObject.hasDiscriminatorObject() )
        schema.setDiscriminator(DiscriminatorObject.composeDiscriminator(schemaObject.getDiscriminatorObject()));
        if( schemaObject.getExample() != null )
        schema.setExample(schemaObject.getExample());
        if( schemaObject.getExclusiveMaximum() != null )
        schema.setExclusiveMaximum((boolean)schemaObject.getExclusiveMaximum());
        if( schemaObject.getExclusiveMinimum() != null )
        schema.setExclusiveMinimum((boolean)schemaObject.getExclusiveMinimum());
        if( schemaObject.hasExternalDocumentationObject() )
        schema.setExternalDocs(ExternalDocumentationObject.composeExternalDocs(schemaObject.getExternalDocumentationObject()));
        if( !schemaObject.getFormat().isEmpty() )
        schema.setFormat(schemaObject.getFormat());
        if( schemaObject.hasItemsSchema() )
        schema.setItemsSchema(composeSchema(schemaObject.getItemsSchema().getSchemaObject()));
        if( schemaObject.getMaximum() != null )
        schema.setMaximum((Number) schemaObject.getMaximum());
        if( schemaObject.getMinimum() != null )
        schema.setMinimum((Number) schemaObject.getMinimum());
        if( schemaObject.getMaxItems() != null )
        schema.setMaxItems((Integer) schemaObject.getMaxItems());
        if( schemaObject.getMinItems() != null )
        schema.setMinItems((Integer) schemaObject.getMinItems());
        if( schemaObject.getMaxLength() != null )
        schema.setMaxLength((Integer) schemaObject.getMaxLength());
        if( schemaObject.getMinLength() != null )
        schema.setMinLength((Integer) schemaObject.getMinLength());
        if( schemaObject.getMaxProperties() != null )
        schema.setMaxProperties((Integer) schemaObject.getMaxProperties());
        if( schemaObject.getMinProperties() != null )
        schema.setMinProperties((Integer) schemaObject.getMinProperties());
        if( schemaObject.getMultipleOf() != null )
        schema.setMultipleOf((Number) schemaObject.getMultipleOf());
        if( schemaObject.hasNotSchema() )
        schema.setNotSchema(composeSchema(schemaObject.getNotSchema().getSchemaObject()));
        if( schemaObject.getNullable() != null )
        schema.setNullable((boolean) schemaObject.getNullable());
        if( !schemaObject.getPattern().isEmpty() )
        schema.setPattern(schemaObject.getPattern());
        if( schemaObject.getNumPropertyItem() != 0 ){
        Map<String, org.openapi4j.parser.model.v3.Schema> properties = new HashMap<>();
        for( PropertyItem p : schemaObject.getPropertyItemList() )
        properties.put(p.getName(), composeSchema(p.getSchemaObject()));
        schema.setProperties(properties);
        }
        if( schemaObject.getNumRequiredField() != 0 ){
        for( RequiredField r : schemaObject.getRequiredFields() )
        schema.addRequiredField(r.getValue());
        }
        if( schemaObject.getNumAllOfSchema() != 0 ){
        for( AllOfSchema a : schemaObject.getAllOfSchemas() )
        schema.addAllOfSchema(composeSchema(a.getSchemaObject()));
        }
        if( schemaObject.getNumAnyOfSchema() != 0 ){
        for( AnyOfSchema a : schemaObject.getAnyOfSchemas() )
        schema.addAnyOfSchema(composeSchema(a.getSchemaObject()));
        }
        if( schemaObject.getNumOneOfSchema() != 0 ){
        for( OneOfSchema o : schemaObject.getOneOfSchemas() )
        schema.addOneOfSchema(composeSchema(o.getSchemaObject()));
        }
        if( schemaObject.getReadOnly() != null )
        schema.setReadOnly((boolean) schemaObject.getReadOnly());
        if( schemaObject.getWriteOnly() != null )
        schema.setWriteOnly((boolean) schemaObject.getWriteOnly());
        if( !schemaObject.getType().isEmpty() )
        schema.setType(schemaObject.getType());
        if( !schemaObject.getTitle().isEmpty() )
        schema.setTitle(schemaObject.getTitle());
        if( schemaObject.getUniqueItems() != null )
        schema.setUniqueItems((boolean) schemaObject.getUniqueItems());
        if( schemaObject.hasXmlObject() )
        schema.setXml(XmlObject.composeXml(schemaObject.getXmlObject()));

        return schema;
        }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:618
   */
  public static SchemaObject parseSchema (org.openapi4j.parser.model.v3.Schema schema) {
        SchemaObject schemaObject = new SchemaObject();

        if( schema.getAdditionalProperties() != null ){
        AdditionalProperties additionalProperties = new AdditionalProperties();
        additionalProperties.setSchemaObject(parseSchema(schema.getAdditionalProperties()));
        schemaObject.setAdditionalProperties(additionalProperties);
        }
        if( schema.getAdditionalPropertiesAllowed() != null )
        schemaObject.setAdditionalPropertiesAllowed(schema.getAdditionalPropertiesAllowed());
        if( schema.getDefault() != null )
        schemaObject.setDefaultValue(schema.getDefault());
        if( schema.getDescription() != null )
        schemaObject.setDescription(schema.getDescription());
        if( schema.getDeprecated() != null )
        schemaObject.setDeprecatedBoolean(schema.getDeprecated());
        if( schema.getDiscriminator() != null )
        schemaObject.setDiscriminatorObject(DiscriminatorObject.parseDiscriminator(schema.getDiscriminator()));
        if( schema.getEnums() != null ){
        EnumObj enumObj = new EnumObj();
        for( Object o : schema.getEnums() ){
        enumObj.setEnumOb(o);
        schemaObject.addEnumObj(enumObj);
        }
        }
        if( schema.getExample() != null )
        schemaObject.setExample(schema.getExample());
        if( schema.getExclusiveMaximum() != null )
        schemaObject.setExclusiveMaximum(schema.getExclusiveMaximum());
        if( schema.getExclusiveMinimum() != null )
        schemaObject.setExclusiveMinimum(schema.getExclusiveMinimum());
        if( schema.getExternalDocs() != null )
        schemaObject.setExternalDocumentationObject(ExternalDocumentationObject.parseExternalDocs(schema.getExternalDocs()));
        if( schema.getFormat() != null )
        schemaObject.setFormat(schema.getFormat());
        if( schema.getItemsSchema() != null ){
        ItemsSchema itemsSchema = new ItemsSchema();
        itemsSchema.setSchemaObject(parseSchema(schema.getItemsSchema()));
        schemaObject.setItemsSchema(itemsSchema);
        }
        if( schema.getMaximum() != null )
        schemaObject.setMaximum(schema.getMaximum());
        if( schema.getMinimum() != null )
        schemaObject.setMinimum(schema.getMinimum());
        if( schema.getMaxItems() != null )
        schemaObject.setMaxItems(schema.getMaxItems());
        if( schema.getMinItems() != null )
        schemaObject.setMinItems(schema.getMinItems());
        if( schema.getMaxLength() != null )
        schemaObject.setMaxLength(schema.getMaxLength());
        if( schema.getMinLength() != null )
        schemaObject.setMinLength(schema.getMinLength());
        if( schema.getMaxProperties() != null )
        schemaObject.setMaxProperties(schema.getMaxProperties());
        if( schema.getMinProperties() != null )
        schemaObject.setMinProperties(schema.getMinProperties());
        if( schema.getMultipleOf() != null )
        schemaObject.setMultipleOf(schema.getMultipleOf());
        if( schema.getNotSchema() != null ){
        NotSchema notSchema = new NotSchema();
        notSchema.setSchemaObject(parseSchema(schema.getNotSchema()));
        schemaObject.setNotSchema(notSchema);
        }
        if( schema.getNullable() != null )
        schemaObject.setNullable(schema.getNullable());
        if( schema.getPattern() != null )
        schemaObject.setPattern(schema.getPattern());
        if( schema.getProperties() != null  ){
        PropertyItem propertyItem = new PropertyItem();
        for( String key : schema.getProperties().keySet() )
        schemaObject.addPropertyItem(new PropertyItem(key, parseSchema(schema.getProperty(key))));
        }
        if( schema.getRequiredFields() != null ){
        RequiredField requiredField = new RequiredField();
        for( String s : schema.getRequiredFields() ){
        requiredField.setValue(s);
        schemaObject.addRequiredField(requiredField);
        }
        }
        if( schema.getAllOfSchemas() != null ){
        AllOfSchema allOfSchema = new AllOfSchema();
        for(org.openapi4j.parser.model.v3.Schema schemaItem : schema.getAllOfSchemas()){
        allOfSchema.setSchemaObject(parseSchema(schemaItem));
        schemaObject.addAllOfSchema(allOfSchema);
        }
        }
        if( schema.getAnyOfSchemas() != null ){
        AnyOfSchema anyOfSchema = new AnyOfSchema();
        for(org.openapi4j.parser.model.v3.Schema schemaItem : schema.getAnyOfSchemas()){
        anyOfSchema.setSchemaObject(parseSchema(schemaItem));
        schemaObject.addAnyOfSchema(anyOfSchema);
        }
        }
        if( schema.getOneOfSchemas() != null ){
        OneOfSchema oneOfSchema = new OneOfSchema();
        for(org.openapi4j.parser.model.v3.Schema schemaItem : schema.getOneOfSchemas()){
        oneOfSchema.setSchemaObject(parseSchema(schemaItem));
        schemaObject.addOneOfSchema(oneOfSchema);
        }
        }
        if( schema.getReadOnly() != null )
        schemaObject.setReadOnly(schema.getReadOnly());
        if( schema.getWriteOnly() != null )
        schemaObject.setWriteOnly(schema.getWriteOnly());
        if( schema.getType() != null )
        schemaObject.setType(schema.getType());
        if( schema.getTitle() != null )
        schemaObject.setTitle(schema.getTitle());
        if( schema.getUniqueItems() != null )
        schemaObject.setUniqueItems(schema.getUniqueItems());
        if( schema.getXml() != null )
        schemaObject.setXmlObject(XmlObject.parseXml(schema.getXml()));

        return schemaObject;
        }
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
    children = new ASTNode[12];
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
  }
  /**
   * @declaredat ASTNode:25
   */
  @ASTNodeAnnotation.Constructor(
    name = {"AdditionalProperties", "AdditionalPropertiesAllowed", "DefaultValue", "Description", "DeprecatedBoolean", "DiscriminatorObject", "EnumObj", "Example", "ExclusiveMaximum", "ExclusiveMinimum", "ExternalDocumentationObject", "Format", "ItemsSchema", "Maximum", "Minimum", "MaxItems", "MinItems", "MaxLength", "MinLength", "MaxProperties", "MinProperties", "MultipleOf", "NotSchema", "Nullable", "Pattern", "PropertyItem", "RequiredField", "AllOfSchema", "AnyOfSchema", "OneOfSchema", "ReadOnly", "WriteOnly", "Type", "Title", "UniqueItems", "XmlObject", "Ref"},
    type = {"Opt<AdditionalProperties>", "Object", "Object", "String", "Object", "Opt<DiscriminatorObject>", "JastAddList<EnumObj>", "Object", "Object", "Object", "Opt<ExternalDocumentationObject>", "String", "Opt<ItemsSchema>", "Object", "Object", "Object", "Object", "Object", "Object", "Object", "Object", "Object", "Opt<NotSchema>", "Object", "String", "JastAddList<PropertyItem>", "JastAddList<RequiredField>", "JastAddList<AllOfSchema>", "JastAddList<AnyOfSchema>", "JastAddList<OneOfSchema>", "Object", "Object", "String", "String", "Object", "Opt<XmlObject>", "String"},
    kind = {"Opt", "Token", "Token", "Token", "Token", "Opt", "List", "Token", "Token", "Token", "Opt", "Token", "Opt", "Token", "Token", "Token", "Token", "Token", "Token", "Token", "Token", "Token", "Opt", "Token", "Token", "List", "List", "List", "List", "List", "Token", "Token", "Token", "Token", "Token", "Opt", "Token"}
  )
  public SchemaObject(Opt<AdditionalProperties> p0, Object p1, Object p2, String p3, Object p4, Opt<DiscriminatorObject> p5, JastAddList<EnumObj> p6, Object p7, Object p8, Object p9, Opt<ExternalDocumentationObject> p10, String p11, Opt<ItemsSchema> p12, Object p13, Object p14, Object p15, Object p16, Object p17, Object p18, Object p19, Object p20, Object p21, Opt<NotSchema> p22, Object p23, String p24, JastAddList<PropertyItem> p25, JastAddList<RequiredField> p26, JastAddList<AllOfSchema> p27, JastAddList<AnyOfSchema> p28, JastAddList<OneOfSchema> p29, Object p30, Object p31, String p32, String p33, Object p34, Opt<XmlObject> p35, String p36) {
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
    setRef(p36);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:70
   */
  protected int numChildren() {
    return 12;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:76
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:80
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:84
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:88
   */
  public SchemaObject clone() throws CloneNotSupportedException {
    SchemaObject node = (SchemaObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:93
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
   * @declaredat ASTNode:112
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
   * @declaredat ASTNode:122
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
   * @declaredat ASTNode:142
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
   * @declaredat ASTNode:156
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenObject_AdditionalPropertiesAllowed == ((SchemaObject) node).tokenObject_AdditionalPropertiesAllowed) && (tokenObject_DefaultValue == ((SchemaObject) node).tokenObject_DefaultValue) && (tokenString_Description == ((SchemaObject) node).tokenString_Description) && (tokenObject_DeprecatedBoolean == ((SchemaObject) node).tokenObject_DeprecatedBoolean) && (tokenObject_Example == ((SchemaObject) node).tokenObject_Example) && (tokenObject_ExclusiveMaximum == ((SchemaObject) node).tokenObject_ExclusiveMaximum) && (tokenObject_ExclusiveMinimum == ((SchemaObject) node).tokenObject_ExclusiveMinimum) && (tokenString_Format == ((SchemaObject) node).tokenString_Format) && (tokenObject_Maximum == ((SchemaObject) node).tokenObject_Maximum) && (tokenObject_Minimum == ((SchemaObject) node).tokenObject_Minimum) && (tokenObject_MaxItems == ((SchemaObject) node).tokenObject_MaxItems) && (tokenObject_MinItems == ((SchemaObject) node).tokenObject_MinItems) && (tokenObject_MaxLength == ((SchemaObject) node).tokenObject_MaxLength) && (tokenObject_MinLength == ((SchemaObject) node).tokenObject_MinLength) && (tokenObject_MaxProperties == ((SchemaObject) node).tokenObject_MaxProperties) && (tokenObject_MinProperties == ((SchemaObject) node).tokenObject_MinProperties) && (tokenObject_MultipleOf == ((SchemaObject) node).tokenObject_MultipleOf) && (tokenObject_Nullable == ((SchemaObject) node).tokenObject_Nullable) && (tokenString_Pattern == ((SchemaObject) node).tokenString_Pattern) && (tokenObject_ReadOnly == ((SchemaObject) node).tokenObject_ReadOnly) && (tokenObject_WriteOnly == ((SchemaObject) node).tokenObject_WriteOnly) && (tokenString_Type == ((SchemaObject) node).tokenString_Type) && (tokenString_Title == ((SchemaObject) node).tokenString_Title) && (tokenObject_UniqueItems == ((SchemaObject) node).tokenObject_UniqueItems) && (tokenString_Ref == ((SchemaObject) node).tokenString_Ref);    
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
  public void setAdditionalPropertiesAllowed(Object value) {
    tokenObject_AdditionalPropertiesAllowed = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_AdditionalPropertiesAllowed;
  /**
   * Retrieves the value for the lexeme AdditionalPropertiesAllowed.
   * @return The value for the lexeme AdditionalPropertiesAllowed.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="AdditionalPropertiesAllowed")
  public Object getAdditionalPropertiesAllowed() {
    return tokenObject_AdditionalPropertiesAllowed;
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
  public void setExclusiveMaximum(Object value) {
    tokenObject_ExclusiveMaximum = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_ExclusiveMaximum;
  /**
   * Retrieves the value for the lexeme ExclusiveMaximum.
   * @return The value for the lexeme ExclusiveMaximum.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ExclusiveMaximum")
  public Object getExclusiveMaximum() {
    return tokenObject_ExclusiveMaximum;
  }
  /**
   * Replaces the lexeme ExclusiveMinimum.
   * @param value The new value for the lexeme ExclusiveMinimum.
   * @apilevel high-level
   */
  public void setExclusiveMinimum(Object value) {
    tokenObject_ExclusiveMinimum = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_ExclusiveMinimum;
  /**
   * Retrieves the value for the lexeme ExclusiveMinimum.
   * @return The value for the lexeme ExclusiveMinimum.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ExclusiveMinimum")
  public Object getExclusiveMinimum() {
    return tokenObject_ExclusiveMinimum;
  }
  /**
   * Replaces the optional node for the ExternalDocumentationObject child. This is the <code>Opt</code>
   * node containing the child ExternalDocumentationObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ExternalDocumentationObject child.
   * @apilevel low-level
   */
  public void setExternalDocumentationObjectOpt(Opt<ExternalDocumentationObject> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) ExternalDocumentationObject child.
   * @param node The new node to be used as the ExternalDocumentationObject child.
   * @apilevel high-level
   */
  public void setExternalDocumentationObject(ExternalDocumentationObject node) {
    getExternalDocumentationObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ExternalDocumentationObject child exists.
   * @return {@code true} if the optional ExternalDocumentationObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasExternalDocumentationObject() {
    return getExternalDocumentationObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ExternalDocumentationObject child.
   * @return The ExternalDocumentationObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ExternalDocumentationObject getExternalDocumentationObject() {
    return (ExternalDocumentationObject) getExternalDocumentationObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ExternalDocumentationObject child. This is the <code>Opt</code> node containing the child ExternalDocumentationObject, not the actual child!
   * @return The optional node for child the ExternalDocumentationObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ExternalDocumentationObject")
  public Opt<ExternalDocumentationObject> getExternalDocumentationObjectOpt() {
    return (Opt<ExternalDocumentationObject>) getChild(3);
  }
  /**
   * Retrieves the optional node for child ExternalDocumentationObject. This is the <code>Opt</code> node containing the child ExternalDocumentationObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ExternalDocumentationObject.
   * @apilevel low-level
   */
  public Opt<ExternalDocumentationObject> getExternalDocumentationObjectOptNoTransform() {
    return (Opt<ExternalDocumentationObject>) getChildNoTransform(3);
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
  public void setMaximum(Object value) {
    tokenObject_Maximum = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_Maximum;
  /**
   * Retrieves the value for the lexeme Maximum.
   * @return The value for the lexeme Maximum.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Maximum")
  public Object getMaximum() {
    return tokenObject_Maximum;
  }
  /**
   * Replaces the lexeme Minimum.
   * @param value The new value for the lexeme Minimum.
   * @apilevel high-level
   */
  public void setMinimum(Object value) {
    tokenObject_Minimum = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_Minimum;
  /**
   * Retrieves the value for the lexeme Minimum.
   * @return The value for the lexeme Minimum.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Minimum")
  public Object getMinimum() {
    return tokenObject_Minimum;
  }
  /**
   * Replaces the lexeme MaxItems.
   * @param value The new value for the lexeme MaxItems.
   * @apilevel high-level
   */
  public void setMaxItems(Object value) {
    tokenObject_MaxItems = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_MaxItems;
  /**
   * Retrieves the value for the lexeme MaxItems.
   * @return The value for the lexeme MaxItems.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MaxItems")
  public Object getMaxItems() {
    return tokenObject_MaxItems;
  }
  /**
   * Replaces the lexeme MinItems.
   * @param value The new value for the lexeme MinItems.
   * @apilevel high-level
   */
  public void setMinItems(Object value) {
    tokenObject_MinItems = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_MinItems;
  /**
   * Retrieves the value for the lexeme MinItems.
   * @return The value for the lexeme MinItems.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MinItems")
  public Object getMinItems() {
    return tokenObject_MinItems;
  }
  /**
   * Replaces the lexeme MaxLength.
   * @param value The new value for the lexeme MaxLength.
   * @apilevel high-level
   */
  public void setMaxLength(Object value) {
    tokenObject_MaxLength = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_MaxLength;
  /**
   * Retrieves the value for the lexeme MaxLength.
   * @return The value for the lexeme MaxLength.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MaxLength")
  public Object getMaxLength() {
    return tokenObject_MaxLength;
  }
  /**
   * Replaces the lexeme MinLength.
   * @param value The new value for the lexeme MinLength.
   * @apilevel high-level
   */
  public void setMinLength(Object value) {
    tokenObject_MinLength = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_MinLength;
  /**
   * Retrieves the value for the lexeme MinLength.
   * @return The value for the lexeme MinLength.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MinLength")
  public Object getMinLength() {
    return tokenObject_MinLength;
  }
  /**
   * Replaces the lexeme MaxProperties.
   * @param value The new value for the lexeme MaxProperties.
   * @apilevel high-level
   */
  public void setMaxProperties(Object value) {
    tokenObject_MaxProperties = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_MaxProperties;
  /**
   * Retrieves the value for the lexeme MaxProperties.
   * @return The value for the lexeme MaxProperties.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MaxProperties")
  public Object getMaxProperties() {
    return tokenObject_MaxProperties;
  }
  /**
   * Replaces the lexeme MinProperties.
   * @param value The new value for the lexeme MinProperties.
   * @apilevel high-level
   */
  public void setMinProperties(Object value) {
    tokenObject_MinProperties = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_MinProperties;
  /**
   * Retrieves the value for the lexeme MinProperties.
   * @return The value for the lexeme MinProperties.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MinProperties")
  public Object getMinProperties() {
    return tokenObject_MinProperties;
  }
  /**
   * Replaces the lexeme MultipleOf.
   * @param value The new value for the lexeme MultipleOf.
   * @apilevel high-level
   */
  public void setMultipleOf(Object value) {
    tokenObject_MultipleOf = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_MultipleOf;
  /**
   * Retrieves the value for the lexeme MultipleOf.
   * @return The value for the lexeme MultipleOf.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="MultipleOf")
  public Object getMultipleOf() {
    return tokenObject_MultipleOf;
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
  public void setNullable(Object value) {
    tokenObject_Nullable = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_Nullable;
  /**
   * Retrieves the value for the lexeme Nullable.
   * @return The value for the lexeme Nullable.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Nullable")
  public Object getNullable() {
    return tokenObject_Nullable;
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
  public void setReadOnly(Object value) {
    tokenObject_ReadOnly = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_ReadOnly;
  /**
   * Retrieves the value for the lexeme ReadOnly.
   * @return The value for the lexeme ReadOnly.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ReadOnly")
  public Object getReadOnly() {
    return tokenObject_ReadOnly;
  }
  /**
   * Replaces the lexeme WriteOnly.
   * @param value The new value for the lexeme WriteOnly.
   * @apilevel high-level
   */
  public void setWriteOnly(Object value) {
    tokenObject_WriteOnly = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_WriteOnly;
  /**
   * Retrieves the value for the lexeme WriteOnly.
   * @return The value for the lexeme WriteOnly.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="WriteOnly")
  public Object getWriteOnly() {
    return tokenObject_WriteOnly;
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
  public void setUniqueItems(Object value) {
    tokenObject_UniqueItems = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_UniqueItems;
  /**
   * Retrieves the value for the lexeme UniqueItems.
   * @return The value for the lexeme UniqueItems.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="UniqueItems")
  public Object getUniqueItems() {
    return tokenObject_UniqueItems;
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
