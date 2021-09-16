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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:123
 * @astdecl XmlObject : ASTNode ::= <Name:String> <Namespace:String> <Prefix:String> <Attribute:Boolean> <Wrapped:Boolean> Extension*;
 * @production XmlObject : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">&lt;Namespace:String&gt;</span> <span class="component">&lt;Prefix:String&gt;</span> <span class="component">&lt;Attribute:Boolean&gt;</span> <span class="component">&lt;Wrapped:Boolean&gt;</span> <span class="component">{@link Extension}*</span>;

 */
public class XmlObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:732
   */
  public static Xml composeXml (XmlObject xmlObject) {
        Xml xml = new Xml();

        if( !xmlObject.getName().isEmpty() )
        xml.setName(xmlObject.getName());
        if( !xmlObject.getNamespace().isEmpty() )
        xml.setNamespace(xmlObject.getNamespace());
        if( !xmlObject.getPrefix().isEmpty() )
        xml.setPrefix(xmlObject.getPrefix());
        if( xmlObject.getAttribute() != null )
        xml.setAttribute((boolean) xmlObject.getAttribute());
        if( xmlObject.getWrapped() != null )
        xml.setWrapped((boolean) xmlObject.getWrapped());

        return xml;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:909
   */
  public static XmlObject parseXml (Xml xml, Map<Object, ASTNode> map) {
        XmlObject xmlObject = new XmlObject();

        if( xml.getName() != null )
        xmlObject.setName(xml.getName());
        if( xml.getNamespace() != null )
        xmlObject.setNamespace(xml.getNamespace());
        if( xml.getPrefix() != null )
        xmlObject.setPrefix(xml.getPrefix());
        if( xml.getAttribute() != null )
        xmlObject.setAttribute(xml.getAttribute());
        if( xml.getWrapped() != null )
        xmlObject.setWrapped(xml.getWrapped());
        map.put(xml, xmlObject);
        if( xml.getExtensions() != null ){
        for( String key : xml.getExtensions().keySet() )
        xmlObject.addExtension(new Extension(key, xml.getExtensions().get(key)));
        }

        return xmlObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public XmlObject() {
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
    name = {"Name", "Namespace", "Prefix", "Attribute", "Wrapped", "Extension"},
    type = {"String", "String", "String", "Boolean", "Boolean", "JastAddList<Extension>"},
    kind = {"Token", "Token", "Token", "Token", "Token", "List"}
  )
  public XmlObject(String p0, String p1, String p2, Boolean p3, Boolean p4, JastAddList<Extension> p5) {
    setName(p0);
    setNamespace(p1);
    setPrefix(p2);
    setAttribute(p3);
    setWrapped(p4);
    setChild(p5, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:28
   */
  protected int numChildren() {
    return 1;
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
  public XmlObject clone() throws CloneNotSupportedException {
    XmlObject node = (XmlObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public XmlObject copy() {
    try {
      XmlObject node = (XmlObject) clone();
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
  public XmlObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:80
   */
  public XmlObject treeCopyNoTransform() {
    XmlObject tree = (XmlObject) copy();
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
  public XmlObject treeCopy() {
    XmlObject tree = (XmlObject) copy();
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
    return super.is$Equal(node) && (tokenString_Name == ((XmlObject) node).tokenString_Name) && (tokenString_Namespace == ((XmlObject) node).tokenString_Namespace) && (tokenString_Prefix == ((XmlObject) node).tokenString_Prefix) && (tokenBoolean_Attribute == ((XmlObject) node).tokenBoolean_Attribute) && (tokenBoolean_Wrapped == ((XmlObject) node).tokenBoolean_Wrapped);    
  }
  /**
   * Replaces the lexeme Name.
   * @param value The new value for the lexeme Name.
   * @apilevel high-level
   */
  public void setName(String value) {
    tokenString_Name = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Name;
  /**
   * Retrieves the value for the lexeme Name.
   * @return The value for the lexeme Name.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Name")
  public String getName() {
    return tokenString_Name != null ? tokenString_Name : "";
  }
  /**
   * Replaces the lexeme Namespace.
   * @param value The new value for the lexeme Namespace.
   * @apilevel high-level
   */
  public void setNamespace(String value) {
    tokenString_Namespace = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Namespace;
  /**
   * Retrieves the value for the lexeme Namespace.
   * @return The value for the lexeme Namespace.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Namespace")
  public String getNamespace() {
    return tokenString_Namespace != null ? tokenString_Namespace : "";
  }
  /**
   * Replaces the lexeme Prefix.
   * @param value The new value for the lexeme Prefix.
   * @apilevel high-level
   */
  public void setPrefix(String value) {
    tokenString_Prefix = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Prefix;
  /**
   * Retrieves the value for the lexeme Prefix.
   * @return The value for the lexeme Prefix.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Prefix")
  public String getPrefix() {
    return tokenString_Prefix != null ? tokenString_Prefix : "";
  }
  /**
   * Replaces the lexeme Attribute.
   * @param value The new value for the lexeme Attribute.
   * @apilevel high-level
   */
  public void setAttribute(Boolean value) {
    tokenBoolean_Attribute = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_Attribute;
  /**
   * Retrieves the value for the lexeme Attribute.
   * @return The value for the lexeme Attribute.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Attribute")
  public Boolean getAttribute() {
    return tokenBoolean_Attribute;
  }
  /**
   * Replaces the lexeme Wrapped.
   * @param value The new value for the lexeme Wrapped.
   * @apilevel high-level
   */
  public void setWrapped(Boolean value) {
    tokenBoolean_Wrapped = value;
  }
  /** @apilevel internal 
   */
  protected Boolean tokenBoolean_Wrapped;
  /**
   * Retrieves the value for the lexeme Wrapped.
   * @return The value for the lexeme Wrapped.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Wrapped")
  public Boolean getWrapped() {
    return tokenBoolean_Wrapped;
  }
  /**
   * Replaces the Extension list.
   * @param list The new list node to be used as the Extension list.
   * @apilevel high-level
   */
  public void setExtensionList(JastAddList<Extension> list) {
    setChild(list, 0);
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
    JastAddList<Extension> list = (JastAddList<Extension>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Extension list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Extension list.
   * @apilevel low-level
   */
  public JastAddList<Extension> getExtensionListNoTransform() {
    return (JastAddList<Extension>) getChildNoTransform(0);
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
