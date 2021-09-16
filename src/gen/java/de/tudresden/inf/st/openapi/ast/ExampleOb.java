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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:88
 * @astdecl ExampleOb : ASTNode;
 * @production ExampleOb : {@link ASTNode};

 */
public abstract class ExampleOb extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:548
   */
  public static Example composeExample (ExampleObject exampleObject){
        Example example = new Example();

        if( !exampleObject.getSummary().isEmpty() )
        example.setSummary( exampleObject.getSummary() );
        if( !exampleObject.getDescription().isEmpty() )
        example.setDescription( exampleObject.getDescription() );
        if( exampleObject.getValue() != null )
        example.setValue( exampleObject.getValue() );
        if( !exampleObject.getExternalValue().isEmpty() )
        example.setExternalValue( exampleObject.getExternalValue() );
        if( exampleObject.getNumExtension() != 0 ){
        Map<String, Object> extension = new HashMap<>();
        for( Extension e : exampleObject.getExtensions() )
        extension.put(e.getKey(), e.getValue());
        example.setExtensions(extension);
        }

        return example;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:547
   */
  public static ExampleObject parseExample(Example example){
        ExampleObject exampleObject = new ExampleObject();

        if( example.getSummary() != null )
        exampleObject.setSummary( example.getSummary() );
        if( example.getDescription() != null )
        exampleObject.setDescription( example.getDescription() );
        if( example.getValue() != null )
        exampleObject.setValue( example.getValue() );
        if( example.getExternalValue() != null )
        exampleObject.setExternalValue( example.getExternalValue() );
        if( example.getExtensions() != null ){
        for( String key : example.getExtensions().keySet() )
        exampleObject.addExtension(new Extension(key, example.getExtensions().get(key)));
        }

        return exampleObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public ExampleOb() {
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
  public ExampleOb clone() throws CloneNotSupportedException {
    ExampleOb node = (ExampleOb) super.clone();
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
  public abstract ExampleOb fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:50
   */
  public abstract ExampleOb treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:58
   */
  public abstract ExampleOb treeCopy();
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
