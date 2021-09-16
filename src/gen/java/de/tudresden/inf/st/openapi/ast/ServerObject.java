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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:14
 * @astdecl ServerObject : ASTNode ::= <Url:String> <Description:String> ServerVariablesTuple* Extension*;
 * @production ServerObject : {@link ASTNode} ::= <span class="component">&lt;Url:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">{@link ServerVariablesTuple}*</span> <span class="component">{@link Extension}*</span>;

 */
public class ServerObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:115
   */
  public static Server composeServer (ServerObject serverObject){
        Server server = new Server();

        if( !serverObject.getUrl().isEmpty() )
        server.setUrl(serverObject.getUrl());
        if( !serverObject.getDescription().isEmpty() )
        server.setDescription( serverObject.getDescription() );
        if( serverObject.hasServerVariablesTuple() ){
        Map<String, ServerVariable> serverVariables = new HashMap<>();
        for( ServerVariablesTuple s : serverObject.getServerVariablesTuples() )
        serverVariables.put( s.getName(), ServerVariableObject.composeServerVariable(s.getServerVariableObject()) );
        server.setVariables(serverVariables);
        }

        return server;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:91
   */
  public static ServerObject parseServer(Server server){
        ServerObject serverObject = new ServerObject();

        if( server.getUrl() != null )
        serverObject.setUrl(server.getUrl());
        if( server.getDescription() != null )
        serverObject.setDescription(server.getDescription());
        if( server.getVariables() != null ){
        for (String key : server.getVariables().keySet())
        serverObject.addServerVariablesTuple(new ServerVariablesTuple(key, ServerVariableObject.parseServerVariable(server.getVariable(key))));
        }

        return serverObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public ServerObject() {
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
    name = {"Url", "Description", "ServerVariablesTuple", "Extension"},
    type = {"String", "String", "JastAddList<ServerVariablesTuple>", "JastAddList<Extension>"},
    kind = {"Token", "Token", "List", "List"}
  )
  public ServerObject(String p0, String p1, JastAddList<ServerVariablesTuple> p2, JastAddList<Extension> p3) {
    setUrl(p0);
    setDescription(p1);
    setChild(p2, 0);
    setChild(p3, 1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:27
   */
  protected int numChildren() {
    return 2;
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
  public ServerObject clone() throws CloneNotSupportedException {
    ServerObject node = (ServerObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:50
   */
  public ServerObject copy() {
    try {
      ServerObject node = (ServerObject) clone();
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
  public ServerObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:79
   */
  public ServerObject treeCopyNoTransform() {
    ServerObject tree = (ServerObject) copy();
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
  public ServerObject treeCopy() {
    ServerObject tree = (ServerObject) copy();
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
    return super.is$Equal(node) && (tokenString_Url == ((ServerObject) node).tokenString_Url) && (tokenString_Description == ((ServerObject) node).tokenString_Description);    
  }
  /**
   * Replaces the lexeme Url.
   * @param value The new value for the lexeme Url.
   * @apilevel high-level
   */
  public void setUrl(String value) {
    tokenString_Url = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Url;
  /**
   * Retrieves the value for the lexeme Url.
   * @return The value for the lexeme Url.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Url")
  public String getUrl() {
    return tokenString_Url != null ? tokenString_Url : "";
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
   * Replaces the ServerVariablesTuple list.
   * @param list The new list node to be used as the ServerVariablesTuple list.
   * @apilevel high-level
   */
  public void setServerVariablesTupleList(JastAddList<ServerVariablesTuple> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the ServerVariablesTuple list.
   * @return Number of children in the ServerVariablesTuple list.
   * @apilevel high-level
   */
  public int getNumServerVariablesTuple() {
    return getServerVariablesTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ServerVariablesTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ServerVariablesTuple list.
   * @apilevel low-level
   */
  public int getNumServerVariablesTupleNoTransform() {
    return getServerVariablesTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ServerVariablesTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ServerVariablesTuple list.
   * @apilevel high-level
   */
  public ServerVariablesTuple getServerVariablesTuple(int i) {
    return (ServerVariablesTuple) getServerVariablesTupleList().getChild(i);
  }
  /**
   * Check whether the ServerVariablesTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasServerVariablesTuple() {
    return getServerVariablesTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ServerVariablesTuple list.
   * @param node The element to append to the ServerVariablesTuple list.
   * @apilevel high-level
   */
  public void addServerVariablesTuple(ServerVariablesTuple node) {
    JastAddList<ServerVariablesTuple> list = (parent == null) ? getServerVariablesTupleListNoTransform() : getServerVariablesTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addServerVariablesTupleNoTransform(ServerVariablesTuple node) {
    JastAddList<ServerVariablesTuple> list = getServerVariablesTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ServerVariablesTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setServerVariablesTuple(ServerVariablesTuple node, int i) {
    JastAddList<ServerVariablesTuple> list = getServerVariablesTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ServerVariablesTuple list.
   * @return The node representing the ServerVariablesTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ServerVariablesTuple")
  public JastAddList<ServerVariablesTuple> getServerVariablesTupleList() {
    JastAddList<ServerVariablesTuple> list = (JastAddList<ServerVariablesTuple>) getChild(0);
    return list;
  }
  /**
   * Retrieves the ServerVariablesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerVariablesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ServerVariablesTuple> getServerVariablesTupleListNoTransform() {
    return (JastAddList<ServerVariablesTuple>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the ServerVariablesTuple list without
   * triggering rewrites.
   */
  public ServerVariablesTuple getServerVariablesTupleNoTransform(int i) {
    return (ServerVariablesTuple) getServerVariablesTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ServerVariablesTuple list.
   * @return The node representing the ServerVariablesTuple list.
   * @apilevel high-level
   */
  public JastAddList<ServerVariablesTuple> getServerVariablesTuples() {
    return getServerVariablesTupleList();
  }
  /**
   * Retrieves the ServerVariablesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerVariablesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ServerVariablesTuple> getServerVariablesTuplesNoTransform() {
    return getServerVariablesTupleListNoTransform();
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
