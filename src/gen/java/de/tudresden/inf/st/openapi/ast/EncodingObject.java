/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:106
 * @astdecl EncodingObject : ASTNode ::= <ContentType:String> HeadersTuple* <Style:String> <Explode:Object> <AllowReserved:Object>;
 * @production EncodingObject : {@link ASTNode} ::= <span class="component">&lt;ContentType:String&gt;</span> <span class="component">{@link HeadersTuple}*</span> <span class="component">&lt;Style:String&gt;</span> <span class="component">&lt;Explode:Object&gt;</span> <span class="component">&lt;AllowReserved:Object&gt;</span>;

 */
public class EncodingObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/Composer.jadd:344
   */
  public static EncodingProperty composeEncodingProperty (EncodingObject encodingObject){
        EncodingProperty encodingProperty = new EncodingProperty();

        if( encodingObject.getContentType() != null )
        encodingProperty.setContentType( encodingObject.getContentType() );
        if( encodingObject.getNumHeadersTuple() != 0 ){
        Map<String, Header> headers = new HashMap<>();
        for( HeadersTuple t : encodingObject.getHeadersTuples() )
        headers.put( ((HeaderObjectTuple)t).getName(), HeaderObject.composeHeader( ((HeaderObjectTuple)t).getHeaderObject() ) );
        encodingProperty.setHeaders(headers);
        }
        if( encodingObject.getStyle() != null )
        encodingProperty.setStyle(encodingObject.getStyle());
        if( encodingObject.getExplode() != null )
        encodingProperty.setExplode( (boolean) encodingObject.getExplode() );

        return encodingProperty;
        }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:405
   */
  public static EncodingObject parseEncoding(EncodingProperty encodingProperty){
        EncodingObject encodingObject = new EncodingObject();

        if( encodingProperty.getContentType() != null )
        encodingObject.setContentType( encodingProperty.getContentType() );
        if( encodingProperty.getHeaders() != null ){
        for( String key : encodingProperty.getHeaders().keySet() )
        encodingObject.addHeadersTuple(new HeaderObjectTuple(key, HeaderObject.parseHeader(encodingProperty.getHeader(key))));
        }
        if( encodingProperty.getStyle() != null )
        encodingObject.setStyle( encodingProperty.getStyle() );
        if( encodingProperty.getExplode() != null )
        encodingObject.setExplode( encodingProperty.getExplode() );
        // if( encodingProperty.getAllowReserved() != null ) /** parser for allowReserved non-existent **/

        return encodingObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public EncodingObject() {
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
    children = new ASTNode[1];
    setChild(new JastAddList(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"ContentType", "HeadersTuple", "Style", "Explode", "AllowReserved"},
    type = {"String", "JastAddList<HeadersTuple>", "String", "Object", "Object"},
    kind = {"Token", "List", "Token", "Token", "Token"}
  )
  public EncodingObject(String p0, JastAddList<HeadersTuple> p1, String p2, Object p3, Object p4) {
    setContentType(p0);
    setChild(p1, 0);
    setStyle(p2);
    setExplode(p3);
    setAllowReserved(p4);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:27
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:33
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public EncodingObject clone() throws CloneNotSupportedException {
    EncodingObject node = (EncodingObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:50
   */
  public EncodingObject copy() {
    try {
      EncodingObject node = (EncodingObject) clone();
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
   * @declaredat ASTNode:69
   */
  @Deprecated
  public EncodingObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:79
   */
  public EncodingObject treeCopyNoTransform() {
    EncodingObject tree = (EncodingObject) copy();
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
   * @declaredat ASTNode:99
   */
  public EncodingObject treeCopy() {
    EncodingObject tree = (EncodingObject) copy();
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
   * @declaredat ASTNode:113
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ContentType == ((EncodingObject) node).tokenString_ContentType) && (tokenString_Style == ((EncodingObject) node).tokenString_Style) && (tokenObject_Explode == ((EncodingObject) node).tokenObject_Explode) && (tokenObject_AllowReserved == ((EncodingObject) node).tokenObject_AllowReserved);    
  }
  /**
   * Replaces the lexeme ContentType.
   * @param value The new value for the lexeme ContentType.
   * @apilevel high-level
   */
  public void setContentType(String value) {
    tokenString_ContentType = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ContentType;
  /**
   * Retrieves the value for the lexeme ContentType.
   * @return The value for the lexeme ContentType.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ContentType")
  public String getContentType() {
    return tokenString_ContentType != null ? tokenString_ContentType : "";
  }
  /**
   * Replaces the HeadersTuple list.
   * @param list The new list node to be used as the HeadersTuple list.
   * @apilevel high-level
   */
  public void setHeadersTupleList(JastAddList<HeadersTuple> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the HeadersTuple list.
   * @return Number of children in the HeadersTuple list.
   * @apilevel high-level
   */
  public int getNumHeadersTuple() {
    return getHeadersTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the HeadersTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the HeadersTuple list.
   * @apilevel low-level
   */
  public int getNumHeadersTupleNoTransform() {
    return getHeadersTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the HeadersTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the HeadersTuple list.
   * @apilevel high-level
   */
  public HeadersTuple getHeadersTuple(int i) {
    return (HeadersTuple) getHeadersTupleList().getChild(i);
  }
  /**
   * Check whether the HeadersTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasHeadersTuple() {
    return getHeadersTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the HeadersTuple list.
   * @param node The element to append to the HeadersTuple list.
   * @apilevel high-level
   */
  public void addHeadersTuple(HeadersTuple node) {
    JastAddList<HeadersTuple> list = (parent == null) ? getHeadersTupleListNoTransform() : getHeadersTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addHeadersTupleNoTransform(HeadersTuple node) {
    JastAddList<HeadersTuple> list = getHeadersTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the HeadersTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setHeadersTuple(HeadersTuple node, int i) {
    JastAddList<HeadersTuple> list = getHeadersTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the HeadersTuple list.
   * @return The node representing the HeadersTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="HeadersTuple")
  public JastAddList<HeadersTuple> getHeadersTupleList() {
    JastAddList<HeadersTuple> list = (JastAddList<HeadersTuple>) getChild(0);
    return list;
  }
  /**
   * Retrieves the HeadersTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HeadersTuple list.
   * @apilevel low-level
   */
  public JastAddList<HeadersTuple> getHeadersTupleListNoTransform() {
    return (JastAddList<HeadersTuple>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the HeadersTuple list without
   * triggering rewrites.
   */
  public HeadersTuple getHeadersTupleNoTransform(int i) {
    return (HeadersTuple) getHeadersTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the HeadersTuple list.
   * @return The node representing the HeadersTuple list.
   * @apilevel high-level
   */
  public JastAddList<HeadersTuple> getHeadersTuples() {
    return getHeadersTupleList();
  }
  /**
   * Retrieves the HeadersTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HeadersTuple list.
   * @apilevel low-level
   */
  public JastAddList<HeadersTuple> getHeadersTuplesNoTransform() {
    return getHeadersTupleListNoTransform();
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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
