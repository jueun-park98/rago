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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:59
 * @astdecl ParameterOb : ASTNode;
 * @production ParameterOb : {@link ASTNode};

 */
public abstract class ParameterOb extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:329
   */
  public static ParameterOb parseParameter(Parameter parameter, OAIContext context, Map<Object, ASTNode> map) throws DecodeException {
        ParameterObject parameterObject = new ParameterObject();

        if( parameter.isRef() ){
        ParameterReference p = new ParameterReference();
        p.setRef(parameter.getRef());
        p.setParameterOb(parseParameter(parameter.getReference(context).getMappedContent(Parameter.class), context, map));
        return p;
        } else {
        if( parameter.getName() != null )
        parameterObject.setName(parameter.getName());
        if( parameter.getIn() != null )
        parameterObject.setIn(parameter.getIn());
        if( parameter.getDescription() != null )
        parameterObject.setDescription(parameter.getDescription());
        if( parameter.getDeprecated() != null )
        parameterObject.setDeprecatedBoolean(parameter.getDeprecated());
        if( parameter.getStyle() != null )
        parameterObject.setStyle( parameter.getStyle() );
        if( parameter.getExplode() != null )
        parameterObject.setExplode( parameter.getExplode() );
        if( parameter.getAllowReserved() != null )
        parameterObject.setAllowReserved( parameter.getAllowReserved() );
        if( parameter.getSchema() != null )
        parameterObject.setSchemaOb(SchemaOb.parseSchema(parameter.getSchema(), context, map));
        if( parameter.getExample() != null )
        parameterObject.setExample( parameter.getExample() );
        if( parameter.getExamples() != null ){
        for( String key : parameter.getExamples().keySet() )
        parameterObject.addExampleTuple(new ExampleTuple(key, ExampleObject.parseExample(parameter.getExample(key), context, map)));
        }
        if( parameter.getContentMediaTypes() != null ){
        for( String key : parameter.getContentMediaTypes().keySet() )
        parameterObject.addContentTuple(new ContentTuple(key, MediaTypeObject.parseMediaType(parameter.getContentMediaType(key), context, map)));
        }
        if( parameter.getRequired() != null )
        parameterObject.setRequired(parameter.getRequired());
        if( parameter.getExtensions() != null ){
        for( String key : parameter.getExtensions().keySet() )
        parameterObject.addExtension(new Extension(key, parameter.getExtensions().get(key)));
        }
        }

        map.put(parameter, parameterObject);
        return parameterObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public ParameterOb() {
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
  public ParameterOb clone() throws CloneNotSupportedException {
    ParameterOb node = (ParameterOb) super.clone();
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
  public abstract ParameterOb fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  public abstract ParameterOb treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:58
   */
  public abstract ParameterOb treeCopy();
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:382
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jrag:382")
  public abstract Parameter composeParameter(ParameterOb parameterOb, Map<Object, ASTNode> map);
  /**
   * @attribute syn
   * @aspect ReferenceGet
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\ReferenceGet.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="ReferenceGet", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\ReferenceGet.jrag:3")
  public abstract ParameterObject parameterObject();
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}