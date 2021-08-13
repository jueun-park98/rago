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
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:105
 * @astdecl ResponseObject : HTTPStatusCode ::= <Name:String> <Description:String> HeadersTuple* ContentTuple* LinksTuple*;
 * @production ResponseObject : {@link HTTPStatusCode} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">{@link HeadersTuple}*</span> <span class="component">{@link ContentTuple}*</span> <span class="component">{@link LinksTuple}*</span>;

 */
public class ResponseObject extends HTTPStatusCode implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jadd:445
   */
  public static Response composeResponse (ResponseObject responseObject){
        Response response = new Response();

        response.setDescription( responseObject.getDescription() );

        if( responseObject.getNumHeadersTuple() != 0 ){
        Map<String, Header> headers = new HashMap<>();
        for( HeadersTuple t : responseObject.getHeadersTuples() )
        headers.put( ((HeaderObjectTuple)t).getName(), HeaderObject.composeHeader( ((HeaderObjectTuple)t).getHeaderObject() ) );
        response.setHeaders(headers);
        }
        if( responseObject.getNumContentTuple() != 0 ){
        Map<String, MediaType> contents = new HashMap<>();
        for( ContentTuple t : responseObject.getContentTuples() )
        contents.put( ((ContentObjectTuple)t).getName(), MediaTypeObject.composeMediaType( ((ContentObjectTuple)t).getMediaTypeObject() ) );
        response.setContentMediaTypes(contents);
        }
        if( responseObject.getNumLinksTuple() != 0 ){
        Map<String, Link> links = new HashMap<>();
        for( LinksTuple t : responseObject.getLinksTuples() )
        links.put( ((LinkObjectTuple)t).getName(), LinkObject.composeLink( ((LinkObjectTuple)t).getLinkObject() ) );
        }

        return response;
        }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:510
   */
  public static ResponseObject parseResponse(Response response){
        ResponseObject responseObject = new ResponseObject();

        responseObject.setDescription( response.getDescription() );

        if( response.getHeaders() != null ){
        for( String key : response.getHeaders().keySet() )
        responseObject.addHeadersTuple( new HeaderObjectTuple(key, HeaderObject.parseHeader(response.getHeader(key))) );
        }
        if( response.getContentMediaTypes() != null ){
        for( String key : response.getContentMediaTypes().keySet() )
        responseObject.addContentTuple( new ContentObjectTuple(key, MediaTypeObject.parseMediaType(response.getContentMediaType(key))) );
        }
        if( response.getLinks() != null ){
        for( String key : response.getLinks().keySet() )
        responseObject.addLinksTuple( new LinkObjectTuple(key, LinkObject.parseLink(response.getLink(key))) );
        }

        return responseObject;
        }
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
    children = new ASTNode[3];
    setChild(new JastAddList(), 0);
    setChild(new JastAddList(), 1);
    setChild(new JastAddList(), 2);
  }
  /**
   * @declaredat ASTNode:16
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Name", "Description", "HeadersTuple", "ContentTuple", "LinksTuple"},
    type = {"String", "String", "JastAddList<HeadersTuple>", "JastAddList<ContentTuple>", "JastAddList<LinksTuple>"},
    kind = {"Token", "Token", "List", "List", "List"}
  )
  public ResponseObject(String p0, String p1, JastAddList<HeadersTuple> p2, JastAddList<ContentTuple> p3, JastAddList<LinksTuple> p4) {
    setName(p0);
    setDescription(p1);
    setChild(p2, 0);
    setChild(p3, 1);
    setChild(p4, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:29
   */
  protected int numChildren() {
    return 3;
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
  public ResponseObject clone() throws CloneNotSupportedException {
    ResponseObject node = (ResponseObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
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
   * @declaredat ASTNode:71
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
   * @declaredat ASTNode:81
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
   * @declaredat ASTNode:101
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
   * @declaredat ASTNode:115
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((ResponseObject) node).tokenString_Name) && (tokenString_Description == ((ResponseObject) node).tokenString_Description);    
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
   * Replaces the LinksTuple list.
   * @param list The new list node to be used as the LinksTuple list.
   * @apilevel high-level
   */
  public void setLinksTupleList(JastAddList<LinksTuple> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the LinksTuple list.
   * @return Number of children in the LinksTuple list.
   * @apilevel high-level
   */
  public int getNumLinksTuple() {
    return getLinksTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the LinksTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the LinksTuple list.
   * @apilevel low-level
   */
  public int getNumLinksTupleNoTransform() {
    return getLinksTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the LinksTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the LinksTuple list.
   * @apilevel high-level
   */
  public LinksTuple getLinksTuple(int i) {
    return (LinksTuple) getLinksTupleList().getChild(i);
  }
  /**
   * Check whether the LinksTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasLinksTuple() {
    return getLinksTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the LinksTuple list.
   * @param node The element to append to the LinksTuple list.
   * @apilevel high-level
   */
  public void addLinksTuple(LinksTuple node) {
    JastAddList<LinksTuple> list = (parent == null) ? getLinksTupleListNoTransform() : getLinksTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addLinksTupleNoTransform(LinksTuple node) {
    JastAddList<LinksTuple> list = getLinksTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the LinksTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setLinksTuple(LinksTuple node, int i) {
    JastAddList<LinksTuple> list = getLinksTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the LinksTuple list.
   * @return The node representing the LinksTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="LinksTuple")
  public JastAddList<LinksTuple> getLinksTupleList() {
    JastAddList<LinksTuple> list = (JastAddList<LinksTuple>) getChild(2);
    return list;
  }
  /**
   * Retrieves the LinksTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the LinksTuple list.
   * @apilevel low-level
   */
  public JastAddList<LinksTuple> getLinksTupleListNoTransform() {
    return (JastAddList<LinksTuple>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the LinksTuple list without
   * triggering rewrites.
   */
  public LinksTuple getLinksTupleNoTransform(int i) {
    return (LinksTuple) getLinksTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the LinksTuple list.
   * @return The node representing the LinksTuple list.
   * @apilevel high-level
   */
  public JastAddList<LinksTuple> getLinksTuples() {
    return getLinksTupleList();
  }
  /**
   * Retrieves the LinksTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the LinksTuple list.
   * @apilevel low-level
   */
  public JastAddList<LinksTuple> getLinksTuplesNoTransform() {
    return getLinksTupleListNoTransform();
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
