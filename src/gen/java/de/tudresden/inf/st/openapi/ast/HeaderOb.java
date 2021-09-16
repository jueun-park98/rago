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
import org.openapi4j.core.exception.DecodeException;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:97
 * @astdecl HeaderOb : ASTNode;
 * @production HeaderOb : {@link ASTNode};

 */
public abstract class HeaderOb extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:562
   */
  public static Header composeHeader (HeaderObject headerObject, Map<Object, ASTNode> map){
        Header header = new Header();

        if( !headerObject.getRef().isEmpty() )
        header.setRef(headerObject.getRef());
        if( headerObject.getRequired() != null )
        header.setRequired(headerObject.getRequired());
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
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:588
   */
  public static HeaderOb parseHeader(Header header, OAIContext context, Map<Object, ASTNode> map) throws DecodeException {
        HeaderObject headerObject = new HeaderObject();

        if( header.isRef() ){
        HeaderReference h = new HeaderReference();
        h.setRef(header.getRef());
        h.setHeaderOb(parseHeader(header.getReference(context).getMappedContent(Header.class), context, map));
        return h;
        } else {
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
        headerObject.addExampleTuple(new ExampleTuple(key, ExampleObject.parseExample(header.getExample(key), context, map)));
        }
        if( header.getContentMediaTypes() != null ){
        for( String key : header.getContentMediaTypes().keySet() )
        headerObject.addContentTuple(new ContentTuple(key, MediaTypeObject.parseMediaType(header.getContentMediaType(key), context, map)));
        }
        if( header.getSchema() != null )
        headerObject.setSchemaOb(SchemaOb.parseSchema(header.getSchema(), context, map));
        if( header.getExtensions() != null ){
        for( String key : header.getExtensions().keySet() )
        headerObject.addExtension(new Extension(key, header.getExtensions().get(key)));
        }
        }

        map.put(header, headerObject);
        return headerObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public HeaderOb() {
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
  public HeaderOb clone() throws CloneNotSupportedException {
    HeaderOb node = (HeaderOb) super.clone();
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
  public abstract HeaderOb fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  public abstract HeaderOb treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:58
   */
  public abstract HeaderOb treeCopy();
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
