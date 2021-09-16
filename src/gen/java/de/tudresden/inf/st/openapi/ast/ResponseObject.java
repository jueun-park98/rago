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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:78
 * @astdecl ResponseObject : ResponseOb ::= <Description:String> HeaderTuple* ContentTuple* LinkTuple* Extension*;
 * @production ResponseObject : {@link ResponseOb} ::= <span class="component">&lt;Description:String&gt;</span> <span class="component">{@link HeaderTuple}*</span> <span class="component">{@link ContentTuple}*</span> <span class="component">{@link LinkTuple}*</span> <span class="component">{@link Extension}*</span>;

 */
public class ResponseObject extends ResponseOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ResponseObject() {
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
    setChild(new JastAddList(), 0);
    setChild(new JastAddList(), 1);
    setChild(new JastAddList(), 2);
    setChild(new JastAddList(), 3);
  }
  /**
   * @declaredat ASTNode:17
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Description", "HeaderTuple", "ContentTuple", "LinkTuple", "Extension"},
    type = {"String", "JastAddList<HeaderTuple>", "JastAddList<ContentTuple>", "JastAddList<LinkTuple>", "JastAddList<Extension>"},
    kind = {"Token", "List", "List", "List", "List"}
  )
  public ResponseObject(String p0, JastAddList<HeaderTuple> p1, JastAddList<ContentTuple> p2, JastAddList<LinkTuple> p3, JastAddList<Extension> p4) {
    setDescription(p0);
    setChild(p1, 0);
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
  public ResponseObject clone() throws CloneNotSupportedException {
    ResponseObject node = (ResponseObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public ResponseObject copy() {
    try {
      ResponseObject node = (ResponseObject) clone();
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
  public ResponseObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:82
   */
  public ResponseObject treeCopyNoTransform() {
    ResponseObject tree = (ResponseObject) copy();
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
  public ResponseObject treeCopy() {
    ResponseObject tree = (ResponseObject) copy();
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
    return super.is$Equal(node) && (tokenString_Description == ((ResponseObject) node).tokenString_Description);    
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
   * Replaces the ContentTuple list.
   * @param list The new list node to be used as the ContentTuple list.
   * @apilevel high-level
   */
  public void setContentTupleList(JastAddList<ContentTuple> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the ContentTuple list.
   * @return Number of children in the ContentTuple list.
   * @apilevel high-level
   */
  public int getNumContentTuple() {
    return getContentTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ContentTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ContentTuple list.
   * @apilevel low-level
   */
  public int getNumContentTupleNoTransform() {
    return getContentTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ContentTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ContentTuple list.
   * @apilevel high-level
   */
  public ContentTuple getContentTuple(int i) {
    return (ContentTuple) getContentTupleList().getChild(i);
  }
  /**
   * Check whether the ContentTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasContentTuple() {
    return getContentTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ContentTuple list.
   * @param node The element to append to the ContentTuple list.
   * @apilevel high-level
   */
  public void addContentTuple(ContentTuple node) {
    JastAddList<ContentTuple> list = (parent == null) ? getContentTupleListNoTransform() : getContentTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addContentTupleNoTransform(ContentTuple node) {
    JastAddList<ContentTuple> list = getContentTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ContentTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setContentTuple(ContentTuple node, int i) {
    JastAddList<ContentTuple> list = getContentTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ContentTuple list.
   * @return The node representing the ContentTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ContentTuple")
  public JastAddList<ContentTuple> getContentTupleList() {
    JastAddList<ContentTuple> list = (JastAddList<ContentTuple>) getChild(1);
    return list;
  }
  /**
   * Retrieves the ContentTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ContentTuple list.
   * @apilevel low-level
   */
  public JastAddList<ContentTuple> getContentTupleListNoTransform() {
    return (JastAddList<ContentTuple>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the ContentTuple list without
   * triggering rewrites.
   */
  public ContentTuple getContentTupleNoTransform(int i) {
    return (ContentTuple) getContentTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ContentTuple list.
   * @return The node representing the ContentTuple list.
   * @apilevel high-level
   */
  public JastAddList<ContentTuple> getContentTuples() {
    return getContentTupleList();
  }
  /**
   * Retrieves the ContentTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ContentTuple list.
   * @apilevel low-level
   */
  public JastAddList<ContentTuple> getContentTuplesNoTransform() {
    return getContentTupleListNoTransform();
  }
  /**
   * Replaces the LinkTuple list.
   * @param list The new list node to be used as the LinkTuple list.
   * @apilevel high-level
   */
  public void setLinkTupleList(JastAddList<LinkTuple> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the LinkTuple list.
   * @return Number of children in the LinkTuple list.
   * @apilevel high-level
   */
  public int getNumLinkTuple() {
    return getLinkTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the LinkTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the LinkTuple list.
   * @apilevel low-level
   */
  public int getNumLinkTupleNoTransform() {
    return getLinkTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the LinkTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the LinkTuple list.
   * @apilevel high-level
   */
  public LinkTuple getLinkTuple(int i) {
    return (LinkTuple) getLinkTupleList().getChild(i);
  }
  /**
   * Check whether the LinkTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasLinkTuple() {
    return getLinkTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the LinkTuple list.
   * @param node The element to append to the LinkTuple list.
   * @apilevel high-level
   */
  public void addLinkTuple(LinkTuple node) {
    JastAddList<LinkTuple> list = (parent == null) ? getLinkTupleListNoTransform() : getLinkTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addLinkTupleNoTransform(LinkTuple node) {
    JastAddList<LinkTuple> list = getLinkTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the LinkTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setLinkTuple(LinkTuple node, int i) {
    JastAddList<LinkTuple> list = getLinkTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the LinkTuple list.
   * @return The node representing the LinkTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="LinkTuple")
  public JastAddList<LinkTuple> getLinkTupleList() {
    JastAddList<LinkTuple> list = (JastAddList<LinkTuple>) getChild(2);
    return list;
  }
  /**
   * Retrieves the LinkTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the LinkTuple list.
   * @apilevel low-level
   */
  public JastAddList<LinkTuple> getLinkTupleListNoTransform() {
    return (JastAddList<LinkTuple>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the LinkTuple list without
   * triggering rewrites.
   */
  public LinkTuple getLinkTupleNoTransform(int i) {
    return (LinkTuple) getLinkTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the LinkTuple list.
   * @return The node representing the LinkTuple list.
   * @apilevel high-level
   */
  public JastAddList<LinkTuple> getLinkTuples() {
    return getLinkTupleList();
  }
  /**
   * Retrieves the LinkTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the LinkTuple list.
   * @apilevel low-level
   */
  public JastAddList<LinkTuple> getLinkTuplesNoTransform() {
    return getLinkTupleListNoTransform();
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
