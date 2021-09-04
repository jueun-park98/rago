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
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:18
 * @astdecl ServerVariableObject : ASTNode ::= Enum* <Default:String> <Description:String>;
 * @production ServerVariableObject : {@link ASTNode} ::= <span class="component">{@link Enum}*</span> <span class="component">&lt;Default:String&gt;</span> <span class="component">&lt;Description:String&gt;</span>;

 */
public class ServerVariableObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:132
   */
  public static ServerVariable composeServerVariable (ServerVariableObject serverVariableObject){
        ServerVariable serverVariable = new ServerVariable();

        if( !serverVariableObject.getDefault().isEmpty() )
        serverVariable.setDefault(serverVariableObject.getDefault());
        if( !serverVariableObject.getDescription().isEmpty() )
        serverVariable.setDescription(serverVariableObject.getDescription());
        if( serverVariableObject.getNumEnum() != 0 ){
        List<String> enums = new ArrayList<>();
        for( Enum e : serverVariableObject.getEnums() )
        enums.add( e.getEnumValue() );
        serverVariable.setEnums( enums );
        }

        return serverVariable;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:106
   */
  public static ServerVariableObject parseServerVariable(ServerVariable serverVariable){
        ServerVariableObject serverVariableObject = new ServerVariableObject();

        if( serverVariable.getDefault() != null )
        serverVariableObject.setDefault(serverVariable.getDefault());
        if( serverVariable.getDescription() != null )
        serverVariableObject.setDescription(serverVariable.getDescription());
        if( serverVariable.getEnums() != null ){
        for( String e : serverVariable.getEnums() )
        serverVariableObject.addEnum(new Enum(e));
        }

        return serverVariableObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public ServerVariableObject() {
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
    name = {"Enum", "Default", "Description"},
    type = {"JastAddList<Enum>", "String", "String"},
    kind = {"List", "Token", "Token"}
  )
  public ServerVariableObject(JastAddList<Enum> p0, String p1, String p2) {
    setChild(p0, 0);
    setDefault(p1);
    setDescription(p2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:25
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:31
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:43
   */
  public ServerVariableObject clone() throws CloneNotSupportedException {
    ServerVariableObject node = (ServerVariableObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public ServerVariableObject copy() {
    try {
      ServerVariableObject node = (ServerVariableObject) clone();
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
   * @declaredat ASTNode:67
   */
  @Deprecated
  public ServerVariableObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:77
   */
  public ServerVariableObject treeCopyNoTransform() {
    ServerVariableObject tree = (ServerVariableObject) copy();
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
   * @declaredat ASTNode:97
   */
  public ServerVariableObject treeCopy() {
    ServerVariableObject tree = (ServerVariableObject) copy();
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
   * @declaredat ASTNode:111
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Default == ((ServerVariableObject) node).tokenString_Default) && (tokenString_Description == ((ServerVariableObject) node).tokenString_Description);    
  }
  /**
   * Replaces the Enum list.
   * @param list The new list node to be used as the Enum list.
   * @apilevel high-level
   */
  public void setEnumList(JastAddList<Enum> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Enum list.
   * @return Number of children in the Enum list.
   * @apilevel high-level
   */
  public int getNumEnum() {
    return getEnumList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Enum list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Enum list.
   * @apilevel low-level
   */
  public int getNumEnumNoTransform() {
    return getEnumListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Enum list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Enum list.
   * @apilevel high-level
   */
  public Enum getEnum(int i) {
    return (Enum) getEnumList().getChild(i);
  }
  /**
   * Check whether the Enum list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasEnum() {
    return getEnumList().getNumChild() != 0;
  }
  /**
   * Append an element to the Enum list.
   * @param node The element to append to the Enum list.
   * @apilevel high-level
   */
  public void addEnum(Enum node) {
    JastAddList<Enum> list = (parent == null) ? getEnumListNoTransform() : getEnumList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addEnumNoTransform(Enum node) {
    JastAddList<Enum> list = getEnumListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Enum list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setEnum(Enum node, int i) {
    JastAddList<Enum> list = getEnumList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Enum list.
   * @return The node representing the Enum list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Enum")
  public JastAddList<Enum> getEnumList() {
    JastAddList<Enum> list = (JastAddList<Enum>) getChild(0);
    return list;
  }
  /**
   * Retrieves the Enum list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Enum list.
   * @apilevel low-level
   */
  public JastAddList<Enum> getEnumListNoTransform() {
    return (JastAddList<Enum>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the Enum list without
   * triggering rewrites.
   */
  public Enum getEnumNoTransform(int i) {
    return (Enum) getEnumListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Enum list.
   * @return The node representing the Enum list.
   * @apilevel high-level
   */
  public JastAddList<Enum> getEnums() {
    return getEnumList();
  }
  /**
   * Retrieves the Enum list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Enum list.
   * @apilevel low-level
   */
  public JastAddList<Enum> getEnumsNoTransform() {
    return getEnumListNoTransform();
  }
  /**
   * Replaces the lexeme Default.
   * @param value The new value for the lexeme Default.
   * @apilevel high-level
   */
  public void setDefault(String value) {
    tokenString_Default = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Default;
  /**
   * Retrieves the value for the lexeme Default.
   * @return The value for the lexeme Default.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Default")
  public String getDefault() {
    return tokenString_Default != null ? tokenString_Default : "";
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
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
