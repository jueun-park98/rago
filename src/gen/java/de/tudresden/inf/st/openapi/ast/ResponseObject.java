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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:70
 * @astdecl ResponseObject : ASTNode ::= <Ref:String> <Description:String> HeaderTuple* ContentTuple* LinkTuple*;
 * @production ResponseObject : {@link ASTNode} ::= <span class="component">&lt;Ref:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">{@link HeaderTuple}*</span> <span class="component">{@link ContentTuple}*</span> <span class="component">{@link LinkTuple}*</span>;

 */
public class ResponseObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:507
   */
  public static Response composeResponse (ResponseObject responseObject){
        Response response = new Response();

        if( !responseObject.getRef().isEmpty() )
        response.setRef(responseObject.getRef());
        if( !responseObject.getDescription().isEmpty() )
        response.setDescription(responseObject.getDescription());
        if( responseObject.getNumHeaderTuple() != 0 ){
        Map<String, Header> headers = new HashMap<>();
        for( HeaderTuple t : responseObject.getHeaderTuples() )
        headers.put(t.getKey(), HeaderObject.composeHeader(t.getHeaderObject()));
        response.setHeaders(headers);
        }
        if( responseObject.getNumContentTuple() != 0 ){
        Map<String, MediaType> contents = new HashMap<>();
        for( ContentTuple t : responseObject.getContentTuples() )
        contents.put(t.getKey(), MediaTypeObject.composeMediaType(t.getMediaTypeObject()));
        response.setContentMediaTypes(contents);
        }
        if( responseObject.getNumLinkTuple() != 0 ){
        Map<String, Link> links = new HashMap<>();
        for( LinkTuple t : responseObject.getLinkTuples() )
        links.put(t.getKey(), LinkObject.composeLink(t.getLinkObject()));
        response.setLinks(links);
        }

        return response;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:514
   */
  public static ResponseObject parseResponse(Response response){
        ResponseObject responseObject = new ResponseObject();

        if( response.isRef() )
        responseObject.setRef(response.getRef());
        if( response.getDescription() != null )
        responseObject.setDescription(response.getDescription());
        if( response.getHeaders() != null ){
        for( String key : response.getHeaders().keySet() )
        responseObject.addHeaderTuple( new HeaderTuple(key, HeaderObject.parseHeader(response.getHeader(key))) );
        }
        if( response.getContentMediaTypes() != null ){
        for( String key : response.getContentMediaTypes().keySet() )
        responseObject.addContentTuple( new ContentTuple(key, MediaTypeObject.parseMediaType(response.getContentMediaType(key))) );
        }
        if( response.getLinks() != null ){
        for( String key : response.getLinks().keySet() )
        responseObject.addLinkTuple( new LinkTuple(key, LinkObject.parseLink(response.getLink(key))) );
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
    name = {"Ref", "Description", "HeaderTuple", "ContentTuple", "LinkTuple"},
    type = {"String", "String", "JastAddList<HeaderTuple>", "JastAddList<ContentTuple>", "JastAddList<LinkTuple>"},
    kind = {"Token", "Token", "List", "List", "List"}
  )
  public ResponseObject(String p0, String p1, JastAddList<HeaderTuple> p2, JastAddList<ContentTuple> p3, JastAddList<LinkTuple> p4) {
    setRef(p0);
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
    return super.is$Equal(node) && (tokenString_Ref == ((ResponseObject) node).tokenString_Ref) && (tokenString_Description == ((ResponseObject) node).tokenString_Description);    
  }
  /**
   * Replaces the lexeme Ref.
   * @param value The new value for the lexeme Ref.
   * @apilevel high-level
   */
  public void setRef(String value) {
    tokenString_Ref = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Ref;
  /**
   * Retrieves the value for the lexeme Ref.
   * @return The value for the lexeme Ref.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Ref")
  public String getRef() {
    return tokenString_Ref != null ? tokenString_Ref : "";
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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
