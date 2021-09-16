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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:107
 * @astdecl SchemaOb : ASTNode;
 * @production SchemaOb : {@link ASTNode};

 */
public abstract class SchemaOb extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:646
   */
  public static org.openapi4j.parser.model.v3.Schema composeSchema (SchemaObject schemaObject) {
        org.openapi4j.parser.model.v3.Schema schema = new org.openapi4j.parser.model.v3.Schema();

        if( !schemaObject.getRef().isEmpty() )
        schema.setRef(schemaObject.getRef());
        if( schemaObject.getAdditionalProperties() != null )
        schema.setAdditionalProperties(composeSchema(schemaObject.getAdditionalProperties()));
        if( schemaObject.getAdditionalPropertiesAllowed() != null )
        schema.setAdditionalPropertiesAllowed(schemaObject.getAdditionalPropertiesAllowed());
        if( schemaObject.getDefaultValue() != null )
        schema.setDefault(schemaObject.getDefaultValue());
        if( !schemaObject.getDescription().isEmpty() )
        schema.setDescription(schemaObject.getDescription());
        if( schemaObject.getDeprecatedBoolean() != null )
        schema.setDeprecated(schemaObject.getDeprecatedBoolean());
        if( schemaObject.hasDiscriminatorObject() )
        schema.setDiscriminator(DiscriminatorObject.composeDiscriminator(schemaObject.getDiscriminatorObject()));
        if( schemaObject.getNumEnumObj() != 0 ){
        for( EnumObj e : schemaObject.getEnumObjs() )
        schema.addEnum(e.getEnumOb());
        }
        if( schemaObject.getExample() != null )
        schema.setExample(schemaObject.getExample());
        if( schemaObject.getExclusiveMaximum() != null )
        schema.setExclusiveMaximum(schemaObject.getExclusiveMaximum());
        if( schemaObject.getExclusiveMinimum() != null )
        schema.setExclusiveMinimum(schemaObject.getExclusiveMinimum());
        if( schemaObject.hasExternalDocObject() )
        schema.setExternalDocs(ExternalDocObject.composeExternalDocs(schemaObject.getExternalDocObject()));
        if( !schemaObject.getFormat().isEmpty() )
        schema.setFormat(schemaObject.getFormat());
        if( schemaObject.hasItemsSchema() )
        schema.setItemsSchema(composeSchema(schemaObject.getItemsSchema().getSchemaObject()));
        if( schemaObject.getMaximum() != null )
        schema.setMaximum(schemaObject.getMaximum());
        if( schemaObject.getMinimum() != null )
        schema.setMinimum(schemaObject.getMinimum());
        if( schemaObject.getMaxItems() != null )
        schema.setMaxItems(schemaObject.getMaxItems());
        if( schemaObject.getMinItems() != null )
        schema.setMinItems(schemaObject.getMinItems());
        if( schemaObject.getMaxLength() != null )
        schema.setMaxLength(schemaObject.getMaxLength());
        if( schemaObject.getMinLength() != null )
        schema.setMinLength(schemaObject.getMinLength());
        if( schemaObject.getMaxProperties() != null )
        schema.setMaxProperties(schemaObject.getMaxProperties());
        if( schemaObject.getMinProperties() != null )
        schema.setMinProperties(schemaObject.getMinProperties());
        if( schemaObject.getMultipleOf() != null )
        schema.setMultipleOf(schemaObject.getMultipleOf());
        if( schemaObject.hasNotSchema() )
        schema.setNotSchema(composeSchema(schemaObject.getNotSchema().getSchemaObject()));
        if( schemaObject.getNullable() != null )
        schema.setNullable(schemaObject.getNullable());
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
        schema.setReadOnly(schemaObject.getReadOnly());
        if( schemaObject.getWriteOnly() != null )
        schema.setWriteOnly(schemaObject.getWriteOnly());
        if( !schemaObject.getType().isEmpty() )
        schema.setType(schemaObject.getType());
        if( !schemaObject.getTitle().isEmpty() )
        schema.setTitle(schemaObject.getTitle());
        if( schemaObject.getUniqueItems() != null )
        schema.setUniqueItems(schemaObject.getUniqueItems());
        if( schemaObject.hasXmlObject() )
        schema.setXml(XmlObject.composeXml(schemaObject.getXmlObject()));
        if( schemaObject.getNumExtension() != 0 ){
        Map<String, Object> extensionMap = new HashMap<>();
        for( Extension e : schemaObject.getExtensions() )
        extensionMap.put(e.getKey(), e.getValue());
        schema.setExtensions(extensionMap);
        }

        return schema;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:637
   */
  public static SchemaObject parseSchema (org.openapi4j.parser.model.v3.Schema schema) {
        SchemaObject schemaObject = new SchemaObject();

        if( schema.isRef() )
        schemaObject.setRef(schema.getRef());
        if( schema.getAdditionalProperties() != null )
        schemaObject.setAdditionalProperties(parseSchema(schema.getAdditionalProperties()));
        if( schema.getAdditionalProperties() == null && schema.getAdditionalPropertiesAllowed() != null )
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
        for( Object o : schema.getEnums() ){
        EnumObj enumObj = new EnumObj();
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
        schemaObject.setExternalDocObject(ExternalDocObject.parseExternalDocs(schema.getExternalDocs()));
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
        for( String key : schema.getProperties().keySet() ){
        PropertyItem propertyItem = new PropertyItem();
        schemaObject.addPropertyItem(new PropertyItem(key, parseSchema(schema.getProperty(key))));
        }
        }
        if( schema.getRequiredFields() != null ){
        for( String s : schema.getRequiredFields() ){
        RequiredField requiredField = new RequiredField();
        requiredField.setValue(s);
        schemaObject.addRequiredField(requiredField);
        }
        }
        if( schema.getAllOfSchemas() != null ){
        for(org.openapi4j.parser.model.v3.Schema schemaItem : schema.getAllOfSchemas()){
        AllOfSchema allOfSchema = new AllOfSchema();
        allOfSchema.setSchemaObject(parseSchema(schemaItem));
        schemaObject.addAllOfSchema(allOfSchema);
        }
        }
        if( schema.getAnyOfSchemas() != null ){
        for(org.openapi4j.parser.model.v3.Schema schemaItem : schema.getAnyOfSchemas()){
        AnyOfSchema anyOfSchema = new AnyOfSchema();
        anyOfSchema.setSchemaObject(parseSchema(schemaItem));
        schemaObject.addAnyOfSchema(anyOfSchema);
        }
        }
        if( schema.getOneOfSchemas() != null ){
        for(org.openapi4j.parser.model.v3.Schema schemaItem : schema.getOneOfSchemas()){
        OneOfSchema oneOfSchema = new OneOfSchema();
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
        if( schema.getExtensions() != null ){
        for( String key : schema.getExtensions().keySet() )
        schemaObject.addExtension(new Extension(key, schema.getExtensions().get(key)));
        }

        return schemaObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public SchemaOb() {
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
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:19
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:23
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public SchemaOb clone() throws CloneNotSupportedException {
    SchemaOb node = (SchemaOb) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:42
   */
  @Deprecated
  public abstract SchemaOb fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  public abstract SchemaOb treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:58
   */
  public abstract SchemaOb treeCopy();
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
