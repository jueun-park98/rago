/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:125
 * @astdecl LinkObject : ASTNode ::= <OperationRef:String> <OperationID:String> LinkParameterTuple* <LinkRequestBody:Object> <Description:String> [ServerObject];
 * @production LinkObject : {@link ASTNode} ::= <span class="component">&lt;OperationRef:String&gt;</span> <span class="component">&lt;OperationID:String&gt;</span> <span class="component">{@link LinkParameterTuple}*</span> <span class="component">&lt;LinkRequestBody:Object&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">[{@link ServerObject}]</span>;

 */
public class LinkObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:417
   */
  public static Link composeLink (LinkObject linkObject){
        Link link = new Link();

        if( linkObject.getOperationRef() != null )
        link.setOperationRef( linkObject.getOperationRef() );
        if( linkObject.getOperationID() != null )
        link.setOperationId( linkObject.getOperationID() );
        if( linkObject.getNumLinkParameterTuple() != 0 ){
        Map<String, String> parameters = new HashMap<>();
        for( LinkParameterTuple t : linkObject.getLinkParameterTuples() )
        parameters.put( t.getLinkParameterKey(), t.getLinkParameterValue() );
        link.setParameters(parameters);
        }
        if( !linkObject.getDescription().isEmpty() )
        link.setDescription( linkObject.getDescription() );
        if( linkObject.hasServerObject() )
        link.setServer( ServerObject.composeServer(linkObject.getServerObject()) );

        return link;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:470
   */
  public static LinkObject parseLink(Link link){
        LinkObject linkObject = new LinkObject();

        if( link.getOperationRef() != null )
        linkObject.setOperationRef( link.getOperationRef() );
        if( link.getOperationId() != null )
        linkObject.setOperationID( link.getOperationId() );
        if( link.getParameters() != null ){
        for( String key : link.getParameters().keySet() )
        linkObject.addLinkParameterTuple(new LinkParameterTuple(key, link.getParameter(key)));
        }
        if( link.getDescription() != null )
        linkObject.setDescription( link.getDescription() );
        if( link.getServer() != null )
        linkObject.setServerObject( ServerObject.parseServer(link.getServer()) );

        return linkObject;
        }
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
    children = new ASTNode[2];
    setChild(new JastAddList(), 0);
    setChild(new Opt(), 1);
  }
  /**
   * @declaredat ASTNode:15
   */
  @ASTNodeAnnotation.Constructor(
    name = {"OperationRef", "OperationID", "LinkParameterTuple", "LinkRequestBody", "Description", "ServerObject"},
    type = {"String", "String", "JastAddList<LinkParameterTuple>", "Object", "String", "Opt<ServerObject>"},
    kind = {"Token", "Token", "List", "Token", "Token", "Opt"}
  )
  public LinkObject(String p0, String p1, JastAddList<LinkParameterTuple> p2, Object p3, String p4, Opt<ServerObject> p5) {
    setOperationRef(p0);
    setOperationID(p1);
    setChild(p2, 0);
    setLinkRequestBody(p3);
    setDescription(p4);
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
  public LinkObject clone() throws CloneNotSupportedException {
    LinkObject node = (LinkObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
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
   * @declaredat ASTNode:71
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
   * @declaredat ASTNode:81
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
   * @declaredat ASTNode:101
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
   * @declaredat ASTNode:115
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_OperationRef == ((LinkObject) node).tokenString_OperationRef) && (tokenString_OperationID == ((LinkObject) node).tokenString_OperationID) && (tokenObject_LinkRequestBody == ((LinkObject) node).tokenObject_LinkRequestBody) && (tokenString_Description == ((LinkObject) node).tokenString_Description);    
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
   * Replaces the lexeme LinkRequestBody.
   * @param value The new value for the lexeme LinkRequestBody.
   * @apilevel high-level
   */
  public void setLinkRequestBody(Object value) {
    tokenObject_LinkRequestBody = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_LinkRequestBody;
  /**
   * Retrieves the value for the lexeme LinkRequestBody.
   * @return The value for the lexeme LinkRequestBody.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="LinkRequestBody")
  public Object getLinkRequestBody() {
    return tokenObject_LinkRequestBody;
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
    setChild(opt, 1);
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
    return (Opt<ServerObject>) getChild(1);
  }
  /**
   * Retrieves the optional node for child ServerObject. This is the <code>Opt</code> node containing the child ServerObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ServerObject.
   * @apilevel low-level
   */
  public Opt<ServerObject> getServerObjectOptNoTransform() {
    return (Opt<ServerObject>) getChildNoTransform(1);
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
