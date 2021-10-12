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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
/**
 * @ast node
 * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:92
 * @astdecl LinkObject : LinkOb ::= <OperationRef:String> <OperationID:String> LinkParameterTuple* HeaderTuple* <Description:String> [ServerObject] Extension*;
 * @production LinkObject : {@link LinkOb} ::= <span class="component">&lt;OperationRef:String&gt;</span> <span class="component">&lt;OperationID:String&gt;</span> <span class="component">{@link LinkParameterTuple}*</span> <span class="component">{@link HeaderTuple}*</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">[{@link ServerObject}]</span> <span class="component">{@link Extension}*</span>;

 */
public class LinkObject extends LinkOb implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public LinkObject() {
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
    setChild(new Opt(), 2);
    setChild(new JastAddList(), 3);
  }
  /**
   * @declaredat ASTNode:17
   */
  @ASTNodeAnnotation.Constructor(
    name = {"OperationRef", "OperationID", "LinkParameterTuple", "HeaderTuple", "Description", "ServerObject", "Extension"},
    type = {"String", "String", "JastAddList<LinkParameterTuple>", "JastAddList<HeaderTuple>", "String", "Opt<ServerObject>", "JastAddList<Extension>"},
    kind = {"Token", "Token", "List", "List", "Token", "Opt", "List"}
  )
  public LinkObject(String p0, String p1, JastAddList<LinkParameterTuple> p2, JastAddList<HeaderTuple> p3, String p4, Opt<ServerObject> p5, JastAddList<Extension> p6) {
    setOperationRef(p0);
    setOperationID(p1);
    setChild(p2, 0);
    setChild(p3, 1);
    setDescription(p4);
    setChild(p5, 2);
    setChild(p6, 3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:32
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:38
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:50
   */
  public LinkObject clone() throws CloneNotSupportedException {
    LinkObject node = (LinkObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:55
   */
  public LinkObject copy() {
    try {
      LinkObject node = (LinkObject) clone();
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
   * @declaredat ASTNode:74
   */
  @Deprecated
  public LinkObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:84
   */
  public LinkObject treeCopyNoTransform() {
    LinkObject tree = (LinkObject) copy();
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
   * @declaredat ASTNode:104
   */
  public LinkObject treeCopy() {
    LinkObject tree = (LinkObject) copy();
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
   * @declaredat ASTNode:118
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_OperationRef == ((LinkObject) node).tokenString_OperationRef) && (tokenString_OperationID == ((LinkObject) node).tokenString_OperationID) && (tokenString_Description == ((LinkObject) node).tokenString_Description);    
  }
  /**
   * Replaces the lexeme OperationRef.
   * @param value The new value for the lexeme OperationRef.
   * @apilevel high-level
   */
  public void setOperationRef(String value) {
    tokenString_OperationRef = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_OperationRef;
  /**
   * Retrieves the value for the lexeme OperationRef.
   * @return The value for the lexeme OperationRef.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="OperationRef")
  public String getOperationRef() {
    return tokenString_OperationRef != null ? tokenString_OperationRef : "";
  }
  /**
   * Replaces the lexeme OperationID.
   * @param value The new value for the lexeme OperationID.
   * @apilevel high-level
   */
  public void setOperationID(String value) {
    tokenString_OperationID = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_OperationID;
  /**
   * Retrieves the value for the lexeme OperationID.
   * @return The value for the lexeme OperationID.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="OperationID")
  public String getOperationID() {
    return tokenString_OperationID != null ? tokenString_OperationID : "";
  }
  /**
   * Replaces the LinkParameterTuple list.
   * @param list The new list node to be used as the LinkParameterTuple list.
   * @apilevel high-level
   */
  public void setLinkParameterTupleList(JastAddList<LinkParameterTuple> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the LinkParameterTuple list.
   * @return Number of children in the LinkParameterTuple list.
   * @apilevel high-level
   */
  public int getNumLinkParameterTuple() {
    return getLinkParameterTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the LinkParameterTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the LinkParameterTuple list.
   * @apilevel low-level
   */
  public int getNumLinkParameterTupleNoTransform() {
    return getLinkParameterTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the LinkParameterTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the LinkParameterTuple list.
   * @apilevel high-level
   */
  public LinkParameterTuple getLinkParameterTuple(int i) {
    return (LinkParameterTuple) getLinkParameterTupleList().getChild(i);
  }
  /**
   * Check whether the LinkParameterTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasLinkParameterTuple() {
    return getLinkParameterTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the LinkParameterTuple list.
   * @param node The element to append to the LinkParameterTuple list.
   * @apilevel high-level
   */
  public void addLinkParameterTuple(LinkParameterTuple node) {
    JastAddList<LinkParameterTuple> list = (parent == null) ? getLinkParameterTupleListNoTransform() : getLinkParameterTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addLinkParameterTupleNoTransform(LinkParameterTuple node) {
    JastAddList<LinkParameterTuple> list = getLinkParameterTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the LinkParameterTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setLinkParameterTuple(LinkParameterTuple node, int i) {
    JastAddList<LinkParameterTuple> list = getLinkParameterTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the LinkParameterTuple list.
   * @return The node representing the LinkParameterTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="LinkParameterTuple")
  public JastAddList<LinkParameterTuple> getLinkParameterTupleList() {
    JastAddList<LinkParameterTuple> list = (JastAddList<LinkParameterTuple>) getChild(0);
    return list;
  }
  /**
   * Retrieves the LinkParameterTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the LinkParameterTuple list.
   * @apilevel low-level
   */
  public JastAddList<LinkParameterTuple> getLinkParameterTupleListNoTransform() {
    return (JastAddList<LinkParameterTuple>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the LinkParameterTuple list without
   * triggering rewrites.
   */
  public LinkParameterTuple getLinkParameterTupleNoTransform(int i) {
    return (LinkParameterTuple) getLinkParameterTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the LinkParameterTuple list.
   * @return The node representing the LinkParameterTuple list.
   * @apilevel high-level
   */
  public JastAddList<LinkParameterTuple> getLinkParameterTuples() {
    return getLinkParameterTupleList();
  }
  /**
   * Retrieves the LinkParameterTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the LinkParameterTuple list.
   * @apilevel low-level
   */
  public JastAddList<LinkParameterTuple> getLinkParameterTuplesNoTransform() {
    return getLinkParameterTupleListNoTransform();
  }
  /**
   * Replaces the HeaderTuple list.
   * @param list The new list node to be used as the HeaderTuple list.
   * @apilevel high-level
   */
  public void setHeaderTupleList(JastAddList<HeaderTuple> list) {
    setChild(list, 1);
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
    JastAddList<HeaderTuple> list = (JastAddList<HeaderTuple>) getChild(1);
    return list;
  }
  /**
   * Retrieves the HeaderTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HeaderTuple list.
   * @apilevel low-level
   */
  public JastAddList<HeaderTuple> getHeaderTupleListNoTransform() {
    return (JastAddList<HeaderTuple>) getChildNoTransform(1);
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
   * Replaces the optional node for the ServerObject child. This is the <code>Opt</code>
   * node containing the child ServerObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ServerObject child.
   * @apilevel low-level
   */
  public void setServerObjectOpt(Opt<ServerObject> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) ServerObject child.
   * @param node The new node to be used as the ServerObject child.
   * @apilevel high-level
   */
  public void setServerObject(ServerObject node) {
    getServerObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ServerObject child exists.
   * @return {@code true} if the optional ServerObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasServerObject() {
    return getServerObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ServerObject child.
   * @return The ServerObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ServerObject getServerObject() {
    return (ServerObject) getServerObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ServerObject child. This is the <code>Opt</code> node containing the child ServerObject, not the actual child!
   * @return The optional node for child the ServerObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ServerObject")
  public Opt<ServerObject> getServerObjectOpt() {
    return (Opt<ServerObject>) getChild(2);
  }
  /**
   * Retrieves the optional node for child ServerObject. This is the <code>Opt</code> node containing the child ServerObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ServerObject.
   * @apilevel low-level
   */
  public Opt<ServerObject> getServerObjectOptNoTransform() {
    return (Opt<ServerObject>) getChildNoTransform(2);
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
protected boolean linkObject_visited = false;
  /**
   * @attribute syn
   * @aspect Reference
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Reference.jrag:54
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Reference", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Reference.jrag:53")
  public LinkObject linkObject() {
    if (linkObject_visited) {
      throw new RuntimeException("Circular definition of attribute LinkOb.linkObject().");
    }
    linkObject_visited = true;
    LinkObject linkObject_value = this;
    linkObject_visited = false;
    return linkObject_value;
  }
/** @apilevel internal */
protected java.util.Set composeLink_LinkOb_Map_Object__ASTNode__visited;
  /**
   * @attribute syn
   * @aspect Composer
   * @declaredat /Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:596
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Composer", declaredAt="/Users/jueunpark/bachelor-thesis-jastadd/src/main/jastadd/Composer.jrag:596")
  public Link composeLink(LinkOb linkOb, Map<Object, ASTNode> map) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(linkOb);
    _parameters.add(map);
    if (composeLink_LinkOb_Map_Object__ASTNode__visited == null) composeLink_LinkOb_Map_Object__ASTNode__visited = new java.util.HashSet(4);
    if (composeLink_LinkOb_Map_Object__ASTNode__visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute LinkOb.composeLink(LinkOb,Map_Object__ASTNode_).");
    }
    composeLink_LinkOb_Map_Object__ASTNode__visited.add(_parameters);
    try {
            Link link = new Link();
            LinkObject l = (LinkObject) linkOb;
    
            if( !l.getOperationRef().isEmpty() )
            link.setOperationRef( l.getOperationRef() );
            if( !l.getOperationID().isEmpty() )
            link.setOperationId( l.getOperationID() );
            if( l.getNumLinkParameterTuple() != 0 ){
            Map<String, String> parameters = new HashMap<>();
            for( LinkParameterTuple t : l.getLinkParameterTuples() )
            parameters.put( t.getLinkParameterKey(), t.getLinkParameterValue() );
            link.setParameters(parameters);
            }
            if( !l.getDescription().isEmpty() )
            link.setDescription( l.getDescription() );
            if( l.hasServerObject() )
            link.setServer( ServerObject.composeServer(l.getServerObject(), map) );
    
            return link;
            }
    finally {
      composeLink_LinkOb_Map_Object__ASTNode__visited.remove(_parameters);
    }
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
