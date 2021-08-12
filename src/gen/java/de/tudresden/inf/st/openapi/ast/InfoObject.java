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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:10
 * @astdecl InfoObject : ASTNode ::= <Title:String> <Description:String> <TermsOfService:String> [ContactObject] [LicenseObject] <Version:String>;
 * @production InfoObject : {@link ASTNode} ::= <span class="component">&lt;Title:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;TermsOfService:String&gt;</span> <span class="component">[{@link ContactObject}]</span> <span class="component">[{@link LicenseObject}]</span> <span class="component">&lt;Version:String&gt;</span>;

 */
public class InfoObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:50
   */
  public static Info composeInfo (InfoObject infoObject){
        Info info = new Info();

        info.setTitle( infoObject.getTitle() );
        info.setVersion( infoObject.getVersion() );

        if( !infoObject.getDescription().isEmpty() )
        info.setDescription( infoObject.getDescription() );
        if( !infoObject.getTermsOfService().isEmpty() )
        info.setTermsOfService( infoObject.getTermsOfService() );
        if( infoObject.hasContactObject() )
        info.setContact( ContactObject.composeContact(infoObject.getContactObject()) );
        if( infoObject.hasLicenseObject() )
        info.setLicense( LicenseObject.composeLicense(infoObject.getLicenseObject()) );

        return info;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:31
   */
  public static InfoObject parseInfo(Info info) {
        InfoObject infoObject = new InfoObject();

        infoObject.setTitle( info.getTitle() );
        infoObject.setVersion( info.getVersion() );

        if( info.getDescription() != null )
        infoObject.setDescription( info.getDescription() );
        if( info.getTermsOfService() != null )
        infoObject.setTermsOfService( info.getTermsOfService() );
        if( info.getContact() != null )
        infoObject.setContactObject( ContactObject.parseContact(info.getContact()) );
        if( info.getLicense() != null )
        infoObject.setLicenseObject( LicenseObject.parseLicense(info.getLicense()) );

        return infoObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public InfoObject() {
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
    setChild(new Opt(), 0);
    setChild(new Opt(), 1);
  }
  /**
   * @declaredat ASTNode:15
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Title", "Description", "TermsOfService", "ContactObject", "LicenseObject", "Version"},
    type = {"String", "String", "String", "Opt<ContactObject>", "Opt<LicenseObject>", "String"},
    kind = {"Token", "Token", "Token", "Opt", "Opt", "Token"}
  )
  public InfoObject(String p0, String p1, String p2, Opt<ContactObject> p3, Opt<LicenseObject> p4, String p5) {
    setTitle(p0);
    setDescription(p1);
    setTermsOfService(p2);
    setChild(p3, 0);
    setChild(p4, 1);
    setVersion(p5);
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
  public InfoObject clone() throws CloneNotSupportedException {
    InfoObject node = (InfoObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
   */
  public InfoObject copy() {
    try {
      InfoObject node = (InfoObject) clone();
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
  public InfoObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:81
   */
  public InfoObject treeCopyNoTransform() {
    InfoObject tree = (InfoObject) copy();
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
  public InfoObject treeCopy() {
    InfoObject tree = (InfoObject) copy();
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
    return super.is$Equal(node) && (tokenString_Title == ((InfoObject) node).tokenString_Title) && (tokenString_Description == ((InfoObject) node).tokenString_Description) && (tokenString_TermsOfService == ((InfoObject) node).tokenString_TermsOfService) && (tokenString_Version == ((InfoObject) node).tokenString_Version);    
  }
  /**
   * Replaces the lexeme Title.
   * @param value The new value for the lexeme Title.
   * @apilevel high-level
   */
  public void setTitle(String value) {
    tokenString_Title = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Title;
  /**
   * Retrieves the value for the lexeme Title.
   * @return The value for the lexeme Title.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Title")
  public String getTitle() {
    return tokenString_Title != null ? tokenString_Title : "";
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
   * Replaces the lexeme TermsOfService.
   * @param value The new value for the lexeme TermsOfService.
   * @apilevel high-level
   */
  public void setTermsOfService(String value) {
    tokenString_TermsOfService = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_TermsOfService;
  /**
   * Retrieves the value for the lexeme TermsOfService.
   * @return The value for the lexeme TermsOfService.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="TermsOfService")
  public String getTermsOfService() {
    return tokenString_TermsOfService != null ? tokenString_TermsOfService : "";
  }
  /**
   * Replaces the optional node for the ContactObject child. This is the <code>Opt</code>
   * node containing the child ContactObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ContactObject child.
   * @apilevel low-level
   */
  public void setContactObjectOpt(Opt<ContactObject> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) ContactObject child.
   * @param node The new node to be used as the ContactObject child.
   * @apilevel high-level
   */
  public void setContactObject(ContactObject node) {
    getContactObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ContactObject child exists.
   * @return {@code true} if the optional ContactObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasContactObject() {
    return getContactObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ContactObject child.
   * @return The ContactObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ContactObject getContactObject() {
    return (ContactObject) getContactObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ContactObject child. This is the <code>Opt</code> node containing the child ContactObject, not the actual child!
   * @return The optional node for child the ContactObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ContactObject")
  public Opt<ContactObject> getContactObjectOpt() {
    return (Opt<ContactObject>) getChild(0);
  }
  /**
   * Retrieves the optional node for child ContactObject. This is the <code>Opt</code> node containing the child ContactObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ContactObject.
   * @apilevel low-level
   */
  public Opt<ContactObject> getContactObjectOptNoTransform() {
    return (Opt<ContactObject>) getChildNoTransform(0);
  }
  /**
   * Replaces the optional node for the LicenseObject child. This is the <code>Opt</code>
   * node containing the child LicenseObject, not the actual child!
   * @param opt The new node to be used as the optional node for the LicenseObject child.
   * @apilevel low-level
   */
  public void setLicenseObjectOpt(Opt<LicenseObject> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) LicenseObject child.
   * @param node The new node to be used as the LicenseObject child.
   * @apilevel high-level
   */
  public void setLicenseObject(LicenseObject node) {
    getLicenseObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional LicenseObject child exists.
   * @return {@code true} if the optional LicenseObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasLicenseObject() {
    return getLicenseObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) LicenseObject child.
   * @return The LicenseObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public LicenseObject getLicenseObject() {
    return (LicenseObject) getLicenseObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the LicenseObject child. This is the <code>Opt</code> node containing the child LicenseObject, not the actual child!
   * @return The optional node for child the LicenseObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="LicenseObject")
  public Opt<LicenseObject> getLicenseObjectOpt() {
    return (Opt<LicenseObject>) getChild(1);
  }
  /**
   * Retrieves the optional node for child LicenseObject. This is the <code>Opt</code> node containing the child LicenseObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child LicenseObject.
   * @apilevel low-level
   */
  public Opt<LicenseObject> getLicenseObjectOptNoTransform() {
    return (Opt<LicenseObject>) getChildNoTransform(1);
  }
  /**
   * Replaces the lexeme Version.
   * @param value The new value for the lexeme Version.
   * @apilevel high-level
   */
  public void setVersion(String value) {
    tokenString_Version = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Version;
  /**
   * Retrieves the value for the lexeme Version.
   * @return The value for the lexeme Version.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Version")
  public String getVersion() {
    return tokenString_Version != null ? tokenString_Version : "";
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
