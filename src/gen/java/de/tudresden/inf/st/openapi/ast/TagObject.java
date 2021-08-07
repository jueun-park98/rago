/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:132
 * @astdecl TagObject : ASTNode ::= <Name:String> <Description:String> [ExternalDocumentationObject];
 * @production TagObject : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">[{@link ExternalDocumentationObject}]</span>;

 */
public class TagObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/Composer.jadd:469
   */
  public static org.openapi4j.parser.model.v3.Tag composeTag (TagObject tagObject){
        org.openapi4j.parser.model.v3.Tag tag = new org.openapi4j.parser.model.v3.Tag();

        tag.setName( tagObject.getName() );

        if( !tagObject.getDescription().isEmpty() )
        tag.setDescription( tagObject.getDescription() );
        if( tagObject.hasExternalDocumentationObject() )
        tag.setExternalDocs( ExternalDocumentationObject.composeExternalDocs(tagObject.getExternalDocumentationObject()) );

        return tag;
        }
  /**
   * @aspect Parser
   * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/Parser.jrag:518
   */
  public static TagObject parseTag(org.openapi4j.parser.model.v3.Tag tag){
        TagObject tagObject = new TagObject();

        tagObject.setName( tag.getName() );

        if( tag.getDescription() != null )
        tagObject.setDescription( tag.getDescription() );
        if( tag.getExternalDocs() != null )
        tagObject.setExternalDocumentationObject( ExternalDocumentationObject.parseExternalDocs(tag.getExternalDocs()) );

        return tagObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public TagObject() {
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
    setChild(new Opt(), 0);
  }
  /**
   * @declaredat ASTNode:14
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Name", "Description", "ExternalDocumentationObject"},
    type = {"String", "String", "Opt<ExternalDocumentationObject>"},
    kind = {"Token", "Token", "Opt"}
  )
  public TagObject(String p0, String p1, Opt<ExternalDocumentationObject> p2) {
    setName(p0);
    setDescription(p1);
    setChild(p2, 0);
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
  public TagObject clone() throws CloneNotSupportedException {
    TagObject node = (TagObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public TagObject copy() {
    try {
      TagObject node = (TagObject) clone();
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
  public TagObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:77
   */
  public TagObject treeCopyNoTransform() {
    TagObject tree = (TagObject) copy();
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
  public TagObject treeCopy() {
    TagObject tree = (TagObject) copy();
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
    return super.is$Equal(node) && (tokenString_Name == ((TagObject) node).tokenString_Name) && (tokenString_Description == ((TagObject) node).tokenString_Description);    
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
   * Replaces the optional node for the ExternalDocumentationObject child. This is the <code>Opt</code>
   * node containing the child ExternalDocumentationObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ExternalDocumentationObject child.
   * @apilevel low-level
   */
  public void setExternalDocumentationObjectOpt(Opt<ExternalDocumentationObject> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) ExternalDocumentationObject child.
   * @param node The new node to be used as the ExternalDocumentationObject child.
   * @apilevel high-level
   */
  public void setExternalDocumentationObject(ExternalDocumentationObject node) {
    getExternalDocumentationObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ExternalDocumentationObject child exists.
   * @return {@code true} if the optional ExternalDocumentationObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasExternalDocumentationObject() {
    return getExternalDocumentationObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ExternalDocumentationObject child.
   * @return The ExternalDocumentationObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ExternalDocumentationObject getExternalDocumentationObject() {
    return (ExternalDocumentationObject) getExternalDocumentationObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ExternalDocumentationObject child. This is the <code>Opt</code> node containing the child ExternalDocumentationObject, not the actual child!
   * @return The optional node for child the ExternalDocumentationObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ExternalDocumentationObject")
  public Opt<ExternalDocumentationObject> getExternalDocumentationObjectOpt() {
    return (Opt<ExternalDocumentationObject>) getChild(0);
  }
  /**
   * Retrieves the optional node for child ExternalDocumentationObject. This is the <code>Opt</code> node containing the child ExternalDocumentationObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ExternalDocumentationObject.
   * @apilevel low-level
   */
  public Opt<ExternalDocumentationObject> getExternalDocumentationObjectOptNoTransform() {
    return (Opt<ExternalDocumentationObject>) getChildNoTransform(0);
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
