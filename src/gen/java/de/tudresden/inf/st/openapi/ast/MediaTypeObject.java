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
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:94
 * @astdecl MediaTypeObject : ASTNode ::= [SchemaObject] <Example:Object> ExamplesTuple* EncodingTuple*;
 * @production MediaTypeObject : {@link ASTNode} ::= <span class="component">[{@link SchemaObject}]</span> <span class="component">&lt;Example:Object&gt;</span> <span class="component">{@link ExamplesTuple}*</span> <span class="component">{@link EncodingTuple}*</span>;

 */
public class MediaTypeObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jadd:400
   */
  public static MediaType composeMediaType (MediaTypeObject mediaTypeObject){
        MediaType mediaType = new MediaType();

        if( mediaTypeObject.getSchemaObject() != null ) {
        Schema schema = new Schema();
        schema = SchemaObject.composeSchema(mediaTypeObject.getSchemaObject());
        mediaType.setSchema(schema);
        }
        if( mediaTypeObject.getExample() != null )
        mediaType.setExample( mediaTypeObject.getExample() );
        if( mediaTypeObject.getNumExamplesTuple() != 0 ){
        Map<String, Example> examples = new HashMap<>();
        for( ExamplesTuple t : mediaTypeObject.getExamplesTuples() )
        examples.put( ((ExampleObjectTuple)t).getName(), ExampleObject.composeExample( ((ExampleObjectTuple)t).getExampleObject() ) );
        mediaType.setExamples(examples);
        }
        if( mediaTypeObject.getNumEncodingTuple() != 0 ){
        Map<String, EncodingProperty> encodings = new HashMap<>();
        for( EncodingTuple t : mediaTypeObject.getEncodingTuples() )
        encodings.put( ((EncodingObjectTuple)t).getName(), EncodingObject.composeEncodingProperty( ((EncodingObjectTuple)t).getEncodingObject() ) );
        mediaType.setEncodings(encodings);
        }

        return mediaType;
        }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:470
   */
  public static MediaTypeObject parseMediaType(MediaType mediaType){
        MediaTypeObject mediaTypeObject = new MediaTypeObject();

        if( mediaType.getSchema() != null ) {
        SchemaObject schema = new SchemaObject();
        schema = SchemaObject.parseSchema(mediaType.getSchema());
        mediaTypeObject.setSchemaObject(schema);
        }
        if( mediaType.getExample() != null )
        mediaTypeObject.setExample( mediaType.getExample() );
        if( mediaType.getExamples() != null ){
        for( String key : mediaType.getExamples().keySet() )
        mediaTypeObject.addExamplesTuple(new ExampleObjectTuple(key, ExampleObject.parseExample(mediaType.getExample(key))));
        }
        if( mediaType.getEncodings() != null ){
        for( String key : mediaType.getEncodings().keySet() )
        mediaTypeObject.addEncodingTuple(new EncodingObjectTuple(key, EncodingObject.parseEncoding(mediaType.getEncoding(key))));
        }

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
    children = new ASTNode[3];
    setChild(new Opt(), 0);
    setChild(new JastAddList(), 1);
    setChild(new JastAddList(), 2);
  }
  /**
   * @declaredat ASTNode:16
   */
  @ASTNodeAnnotation.Constructor(
    name = {"SchemaObject", "Example", "ExamplesTuple", "EncodingTuple"},
    type = {"Opt<SchemaObject>", "Object", "JastAddList<ExamplesTuple>", "JastAddList<EncodingTuple>"},
    kind = {"Opt", "Token", "List", "List"}
  )
  public MediaTypeObject(Opt<SchemaObject> p0, Object p1, JastAddList<ExamplesTuple> p2, JastAddList<EncodingTuple> p3) {
    setChild(p0, 0);
    setExample(p1);
    setChild(p2, 1);
    setChild(p3, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:28
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:34
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public MediaTypeObject clone() throws CloneNotSupportedException {
    MediaTypeObject node = (MediaTypeObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
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
   * @declaredat ASTNode:70
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
   * @declaredat ASTNode:80
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
   * @declaredat ASTNode:100
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
   * @declaredat ASTNode:114
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenObject_Example == ((MediaTypeObject) node).tokenObject_Example);    
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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
