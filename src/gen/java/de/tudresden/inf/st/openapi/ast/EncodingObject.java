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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:67
 * @astdecl EncodingObject : ASTNode ::= <ContentType:String> HeaderTuple* <Style:String> <Explode:Boolean> <AllowReserved:Boolean> Extension*;
 * @production EncodingObject : {@link ASTNode} ::= <span class="component">&lt;ContentType:String&gt;</span> <span class="component">{@link HeaderTuple}*</span> <span class="component">&lt;Style:String&gt;</span> <span class="component">&lt;Explode:Boolean&gt;</span> <span class="component">&lt;AllowReserved:Boolean&gt;</span> <span class="component">{@link Extension}*</span>;

 */
public class EncodingObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:482
   */
  public static EncodingProperty composeEncodingProperty (EncodingObject encodingObject){
        EncodingProperty encodingProperty = new EncodingProperty();

        if( !encodingObject.getContentType().isEmpty() )
        encodingProperty.setContentType( encodingObject.getContentType() );
        if( encodingObject.getNumHeaderTuple() != 0 ){
        Map<String, Header> headers = new HashMap<>();
        for( HeaderTuple t : encodingObject.getHeaderTuples() )
        headers.put(t.getKey(), HeaderObject.composeHeader(t.getHeaderObject()));
        encodingProperty.setHeaders(headers);
        }
        if( !encodingObject.getStyle().isEmpty() )
        encodingProperty.setStyle(encodingObject.getStyle());
        if( encodingObject.getExplode() != null )
        encodingProperty.setExplode(encodingObject.getExplode());
        if( encodingObject.getNumExtension() != 0 ){
        Map<String, Object> extensionMap = new HashMap<>();
        for( Extension e : encodingObject.getExtensions() )
        extensionMap.put(e.getKey(), e.getValue());
        encodingProperty.setExtensions(extensionMap);
        }

        return encodingProperty;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:493
   */
  public static EncodingObject parseEncoding(EncodingProperty encodingProperty){
        EncodingObject encodingObject = new EncodingObject();

        if( encodingProperty.getContentType() != null )
        encodingObject.setContentType( encodingProperty.getContentType() );
        if( encodingProperty.getHeaders() != null ){
        for( String key : encodingProperty.getHeaders().keySet() )
        encodingObject.addHeaderTuple(new HeaderTuple(key, HeaderObject.parseHeader(encodingProperty.getHeader(key))));
        }
        if( encodingProperty.getStyle() != null )
        encodingObject.setStyle( encodingProperty.getStyle() );
        if( encodingProperty.getExplode() != null )
        encodingObject.setExplode( encodingProperty.getExplode() );
        if( encodingProperty.getExtensions() != null ){
        for( String key : encodingProperty.getExtensions().keySet() )
        encodingObject.addExtension(new Extension(key, encodingProperty.getExtensions().get(key)));
        }

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
    children = new ASTNode[2];
    setChild(new JastAddList(), 0);
    setChild(new JastAddList(), 1);
  }
  /**
   * @declaredat ASTNode:15
   */
  @ASTNodeAnnotation.Constructor(
    name = {"ContentType", "HeaderTuple", "Style", "Explode", "AllowReserved", "Extension"},
    type = {"String", "JastAddList<HeaderTuple>", "String", "Boolean", "Boolean", "JastAddList<Extension>"},
    kind = {"Token", "List", "Token", "Token", "Token", "List"}
  )
  public EncodingObject(String p0, JastAddList<HeaderTuple> p1, String p2, Boolean p3, Boolean p4, JastAddList<Extension> p5) {
    setContentType(p0);
    setChild(p1, 0);
    setStyle(p2);
    setExplode(p3);
    setAllowReserved(p4);
    setChild(p5, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:29
   */
  protected int numChildren() {
    return 2;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:35
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public EncodingObject clone() throws CloneNotSupportedException {
    EncodingObject node = (EncodingObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
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
   * @declaredat ASTNode:71
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
   * @declaredat ASTNode:81
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
   * @declaredat ASTNode:101
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
   * @declaredat ASTNode:115
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_ContentType == ((EncodingObject) node).tokenString_ContentType) && (tokenString_Style == ((EncodingObject) node).tokenString_Style) && (tokenBoolean_Explode == ((EncodingObject) node).tokenBoolean_Explode) && (tokenBoolean_AllowReserved == ((EncodingObject) node).tokenBoolean_AllowReserved);    
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
   * Replaces the HeaderTuple list.
   * @param list The new list node to be used as the HeaderTuple list.
   * @apilevel high-level
   */
  public void setHeaderTupleList(JastAddList<HeaderTuple> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the HeaderTuple list.
   * @return Number of children in the HeaderTuple list.
   * @apilevel high-level
   */
  public int getNumHeaderTuple() {
    return getHeaderTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the HeaderTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the HeaderTuple list.
   * @apilevel low-level
   */
  public int getNumHeaderTupleNoTransform() {
    return getHeaderTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the HeaderTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the HeaderTuple list.
   * @apilevel high-level
   */
  public HeaderTuple getHeaderTuple(int i) {
    return (HeaderTuple) getHeaderTupleList().getChild(i);
  }
  /**
   * Check whether the HeaderTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasHeaderTuple() {
    return getHeaderTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the HeaderTuple list.
   * @param node The element to append to the HeaderTuple list.
   * @apilevel high-level
   */
  public void addHeaderTuple(HeaderTuple node) {
    JastAddList<HeaderTuple> list = (parent == null) ? getHeaderTupleListNoTransform() : getHeaderTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addHeaderTupleNoTransform(HeaderTuple node) {
    JastAddList<HeaderTuple> list = getHeaderTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the HeaderTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setHeaderTuple(HeaderTuple node, int i) {
    JastAddList<HeaderTuple> list = getHeaderTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the HeaderTuple list.
   * @return The node representing the HeaderTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="HeaderTuple")
  public JastAddList<HeaderTuple> getHeaderTupleList() {
    JastAddList<HeaderTuple> list = (JastAddList<HeaderTuple>) getChild(0);
    return list;
  }
  /**
   * Retrieves the HeaderTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HeaderTuple list.
   * @apilevel low-level
   */
  public JastAddList<HeaderTuple> getHeaderTupleListNoTransform() {
    return (JastAddList<HeaderTuple>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the HeaderTuple list without
   * triggering rewrites.
   */
  public HeaderTuple getHeaderTupleNoTransform(int i) {
    return (HeaderTuple) getHeaderTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the HeaderTuple list.
   * @return The node representing the HeaderTuple list.
   * @apilevel high-level
   */
  public JastAddList<HeaderTuple> getHeaderTuples() {
    return getHeaderTupleList();
  }
  /**
   * Retrieves the HeaderTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HeaderTuple list.
   * @apilevel low-level
   */
  public JastAddList<HeaderTuple> getHeaderTuplesNoTransform() {
    return getHeaderTupleListNoTransform();
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
   * Replaces the Extension list.
   * @param list The new list node to be used as the Extension list.
   * @apilevel high-level
   */
  public void setExtensionList(JastAddList<Extension> list) {
    setChild(list, 1);
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
    JastAddList<Extension> list = (JastAddList<Extension>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionListNoTransform() {
    return (JastAddList<Extension>) getChildNoTransform(1);
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
