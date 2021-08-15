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
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:8
 * @astdecl ContactObject : ASTNode ::= <Name:String> <Url:String> <Email:String>;
 * @production ContactObject : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">&lt;Url:String&gt;</span> <span class="component">&lt;Email:String&gt;</span>;

 */
public class ContactObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:79
   */
  public static Contact composeContact (ContactObject contactObject){
        Contact contact = new Contact();

        if( !contactObject.getName().isEmpty() )
        contact.setName( contactObject.getName() );
        if( !contactObject.getUrl().isEmpty() )
        contact.setUrl( contactObject.getUrl() );
        if( !contactObject.getEmail().isEmpty() )
        contact.setEmail( contactObject.getEmail() );

        return contact;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:59
   */
  public static ContactObject parseContact(Contact contact){
        ContactObject contactObject = new ContactObject();

        if( contact.getName() != null )
        contactObject.setName( contact.getName() );
        if( contact.getUrl() != null )
        contactObject.setUrl( contact.getUrl() );
        if( contact.getEmail() != null )
        contactObject.setEmail( contact.getEmail() );

        return contactObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public ContactObject() {
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
  }
  /**
   * @declaredat ASTNode:12
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Name", "Url", "Email"},
    type = {"String", "String", "String"},
    kind = {"Token", "Token", "Token"}
  )
  public ContactObject(String p0, String p1, String p2) {
    setName(p0);
    setUrl(p1);
    setEmail(p2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:29
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:33
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:37
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:41
   */
  public ContactObject clone() throws CloneNotSupportedException {
    ContactObject node = (ContactObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public ContactObject copy() {
    try {
      ContactObject node = (ContactObject) clone();
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
   * @declaredat ASTNode:65
   */
  @Deprecated
  public ContactObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public ContactObject treeCopyNoTransform() {
    ContactObject tree = (ContactObject) copy();
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
   * @declaredat ASTNode:95
   */
  public ContactObject treeCopy() {
    ContactObject tree = (ContactObject) copy();
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
   * @declaredat ASTNode:109
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((ContactObject) node).tokenString_Name) && (tokenString_Url == ((ContactObject) node).tokenString_Url) && (tokenString_Email == ((ContactObject) node).tokenString_Email);    
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
   * Replaces the lexeme Email.
   * @param value The new value for the lexeme Email.
   * @apilevel high-level
   */
  public void setEmail(String value) {
    tokenString_Email = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Email;
  /**
   * Retrieves the value for the lexeme Email.
   * @return The value for the lexeme Email.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Email")
  public String getEmail() {
    return tokenString_Email != null ? tokenString_Email : "";
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
