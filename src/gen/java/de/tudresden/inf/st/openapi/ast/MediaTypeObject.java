/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import java.util.Random;
import java.util.stream.IntStream;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.core.model.reference.Reference;
import org.openapi4j.core.model.OAIContext;
import java.io.IOException;
import java.util.*;
import org.openapi4j.core.exception.DecodeException;
/**
 * @ast node
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:70
 * @astdecl MediaTypeObject : ASTNode ::= [SchemaOb] <Example:Object> ExampleTuple* EncodingTuple* Extension*;
 * @production MediaTypeObject : {@link ASTNode} ::= <span class="component">[{@link SchemaOb}]</span> <span class="component">&lt;Example:Object&gt;</span> <span class="component">{@link ExampleTuple}*</span> <span class="component">{@link EncodingTuple}*</span> <span class="component">{@link Extension}*</span>;

 */
public class MediaTypeObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:468
   */
  public static MediaType composeMediaType (MediaTypeObject mediaTypeObject, Map<Object, ASTNode> map){
        MediaType mediaType = new MediaType();
        SchemaOb s;

        if( mediaTypeObject.getSchemaOb() != null ){
        s = mediaTypeObject.getSchemaOb();
        mediaType.setSchema(s.composeSchema(s, map));}
        if( mediaTypeObject.getExample() != null )
        mediaType.setExample(mediaTypeObject.getExample());
        if( mediaTypeObject.getNumExampleTuple() != 0 ){
        Map<String, Example> exampleMap = new HashMap<>();
        for( ExampleTuple t : mediaTypeObject.getExampleTuples() )
        exampleMap.put(t.getKey(), ExampleObject.composeExample(t.getExampleObject(), map));
        mediaType.setExamples(exampleMap);
        }
        if( mediaTypeObject.getNumEncodingTuple() != 0 ){
        Map<String, EncodingProperty> encodingMap = new HashMap<>();
        for( EncodingTuple t : mediaTypeObject.getEncodingTuples() )
        encodingMap.put(t.getKey(), EncodingObject.composeEncodingProperty(t.getEncodingObject(), map));
        mediaType.setEncodings(encodingMap);
        }

        return mediaType;
        }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:403
   */
  public static MediaTypeObject parseMediaType(MediaType mediaType, OAIContext context, Map<Object, ASTNode> map) throws DecodeException {
        MediaTypeObject mediaTypeObject = new MediaTypeObject();

        if( mediaType.getSchema() != null )
        mediaTypeObject.setSchemaOb(SchemaObject.parseSchema(mediaType.getSchema(), context, map));
        if( mediaType.getExample() != null )
        mediaTypeObject.setExample(mediaType.getExample());
        if( mediaType.getExamples() != null ){
        for( String key : mediaType.getExamples().keySet() )
        mediaTypeObject.addExampleTuple(new ExampleTuple(key, ExampleObject.parseExample(mediaType.getExample(key), context, map)));
        }
        if( mediaType.getEncodings() != null ){
        for( String key : mediaType.getEncodings().keySet() )
        mediaTypeObject.addEncodingTuple(new EncodingTuple(key, EncodingObject.parseEncoding(mediaType.getEncoding(key), context, map)));
        }
        if( mediaType.getExtensions() != null ){
        for( String key : mediaType.getExtensions().keySet() )
        mediaTypeObject.addExtension(new Extension(key, mediaType.getExtensions().get(key)));
        }

        map.put(mediaType, mediaTypeObject);
        return mediaTypeObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public MediaTypeObject() {
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
    name = {"SchemaOb", "Example", "ExampleTuple", "EncodingTuple", "Extension"},
    type = {"Opt<SchemaOb>", "Object", "JastAddList<ExampleTuple>", "JastAddList<EncodingTuple>", "JastAddList<Extension>"},
    kind = {"Opt", "Token", "List", "List", "List"}
  )
  public MediaTypeObject(Opt<SchemaOb> p0, Object p1, JastAddList<ExampleTuple> p2, JastAddList<EncodingTuple> p3, JastAddList<Extension> p4) {
    setChild(p0, 0);
    setExample(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:30
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:36
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public MediaTypeObject clone() throws CloneNotSupportedException {
    MediaTypeObject node = (MediaTypeObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public MediaTypeObject copy() {
    try {
      MediaTypeObject node = (MediaTypeObject) clone();
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
   * @declaredat ASTNode:72
   */
  @Deprecated
  public MediaTypeObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:82
   */
  public MediaTypeObject treeCopyNoTransform() {
    MediaTypeObject tree = (MediaTypeObject) copy();
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
   * @declaredat ASTNode:102
   */
  public MediaTypeObject treeCopy() {
    MediaTypeObject tree = (MediaTypeObject) copy();
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
   * @declaredat ASTNode:116
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenObject_Example == ((MediaTypeObject) node).tokenObject_Example);    
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
   * Replaces the EncodingTuple list.
   * @param list The new list node to be used as the EncodingTuple list.
   * @apilevel high-level
   */
  public void setEncodingTupleList(JastAddList<EncodingTuple> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the EncodingTuple list.
   * @return Number of children in the EncodingTuple list.
   * @apilevel high-level
   */
  public int getNumEncodingTuple() {
    return getEncodingTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the EncodingTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the EncodingTuple list.
   * @apilevel low-level
   */
  public int getNumEncodingTupleNoTransform() {
    return getEncodingTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the EncodingTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the EncodingTuple list.
   * @apilevel high-level
   */
  public EncodingTuple getEncodingTuple(int i) {
    return (EncodingTuple) getEncodingTupleList().getChild(i);
  }
  /**
   * Check whether the EncodingTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasEncodingTuple() {
    return getEncodingTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the EncodingTuple list.
   * @param node The element to append to the EncodingTuple list.
   * @apilevel high-level
   */
  public void addEncodingTuple(EncodingTuple node) {
    JastAddList<EncodingTuple> list = (parent == null) ? getEncodingTupleListNoTransform() : getEncodingTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addEncodingTupleNoTransform(EncodingTuple node) {
    JastAddList<EncodingTuple> list = getEncodingTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the EncodingTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setEncodingTuple(EncodingTuple node, int i) {
    JastAddList<EncodingTuple> list = getEncodingTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the EncodingTuple list.
   * @return The node representing the EncodingTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="EncodingTuple")
  public JastAddList<EncodingTuple> getEncodingTupleList() {
    JastAddList<EncodingTuple> list = (JastAddList<EncodingTuple>) getChild(2);
    return list;
  }
  /**
   * Retrieves the EncodingTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the EncodingTuple list.
   * @apilevel low-level
   */
  public JastAddList<EncodingTuple> getEncodingTupleListNoTransform() {
    return (JastAddList<EncodingTuple>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the EncodingTuple list without
   * triggering rewrites.
   */
  public EncodingTuple getEncodingTupleNoTransform(int i) {
    return (EncodingTuple) getEncodingTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the EncodingTuple list.
   * @return The node representing the EncodingTuple list.
   * @apilevel high-level
   */
  public JastAddList<EncodingTuple> getEncodingTuples() {
    return getEncodingTupleList();
  }
  /**
   * Retrieves the EncodingTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the EncodingTuple list.
   * @apilevel low-level
   */
  public JastAddList<EncodingTuple> getEncodingTuplesNoTransform() {
    return getEncodingTupleListNoTransform();
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
