/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
/**
 * @ast node
 * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:145
 * @astdecl SecuritySchemeObject : ASTNode ::= <SecurityType:String> <Description:String> <SecurityName:String> <SecurityIn:String> <SecurityScheme:String> <BearerFormat:String> Flows <OpenIdConnectUrl:String>;
 * @production SecuritySchemeObject : {@link ASTNode} ::= <span class="component">&lt;SecurityType:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;SecurityName:String&gt;</span> <span class="component">&lt;SecurityIn:String&gt;</span> <span class="component">&lt;SecurityScheme:String&gt;</span> <span class="component">&lt;BearerFormat:String&gt;</span> <span class="component">{@link Flows}</span> <span class="component">&lt;OpenIdConnectUrl:String&gt;</span>;

 */
public class SecuritySchemeObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public SecuritySchemeObject() {
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
  }
  /**
   * @declaredat ASTNode:13
   */
  @ASTNodeAnnotation.Constructor(
    name = {"SecurityType", "Description", "SecurityName", "SecurityIn", "SecurityScheme", "BearerFormat", "Flows", "OpenIdConnectUrl"},
    type = {"String", "String", "String", "String", "String", "String", "Flows", "String"},
    kind = {"Token", "Token", "Token", "Token", "Token", "Token", "Child", "Token"}
  )
  public SecuritySchemeObject(String p0, String p1, String p2, String p3, String p4, String p5, Flows p6, String p7) {
    setSecurityType(p0);
    setDescription(p1);
    setSecurityName(p2);
    setSecurityIn(p3);
    setSecurityScheme(p4);
    setBearerFormat(p5);
    setChild(p6, 0);
    setOpenIdConnectUrl(p7);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:29
   */
  protected int numChildren() {
    return 1;
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
  public SecuritySchemeObject clone() throws CloneNotSupportedException {
    SecuritySchemeObject node = (SecuritySchemeObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
   */
  public SecuritySchemeObject copy() {
    try {
      SecuritySchemeObject node = (SecuritySchemeObject) clone();
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
  public SecuritySchemeObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:81
   */
  public SecuritySchemeObject treeCopyNoTransform() {
    SecuritySchemeObject tree = (SecuritySchemeObject) copy();
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
  public SecuritySchemeObject treeCopy() {
    SecuritySchemeObject tree = (SecuritySchemeObject) copy();
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
    return super.is$Equal(node) && (tokenString_SecurityType == ((SecuritySchemeObject) node).tokenString_SecurityType) && (tokenString_Description == ((SecuritySchemeObject) node).tokenString_Description) && (tokenString_SecurityName == ((SecuritySchemeObject) node).tokenString_SecurityName) && (tokenString_SecurityIn == ((SecuritySchemeObject) node).tokenString_SecurityIn) && (tokenString_SecurityScheme == ((SecuritySchemeObject) node).tokenString_SecurityScheme) && (tokenString_BearerFormat == ((SecuritySchemeObject) node).tokenString_BearerFormat) && (tokenString_OpenIdConnectUrl == ((SecuritySchemeObject) node).tokenString_OpenIdConnectUrl);    
  }
  /**
   * Replaces the lexeme SecurityType.
   * @param value The new value for the lexeme SecurityType.
   * @apilevel high-level
   */
  public void setSecurityType(String value) {
    tokenString_SecurityType = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_SecurityType;
  /**
   * Retrieves the value for the lexeme SecurityType.
   * @return The value for the lexeme SecurityType.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="SecurityType")
  public String getSecurityType() {
    return tokenString_SecurityType != null ? tokenString_SecurityType : "";
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
   * Replaces the lexeme SecurityName.
   * @param value The new value for the lexeme SecurityName.
   * @apilevel high-level
   */
  public void setSecurityName(String value) {
    tokenString_SecurityName = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_SecurityName;
  /**
   * Retrieves the value for the lexeme SecurityName.
   * @return The value for the lexeme SecurityName.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="SecurityName")
  public String getSecurityName() {
    return tokenString_SecurityName != null ? tokenString_SecurityName : "";
  }
  /**
   * Replaces the lexeme SecurityIn.
   * @param value The new value for the lexeme SecurityIn.
   * @apilevel high-level
   */
  public void setSecurityIn(String value) {
    tokenString_SecurityIn = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_SecurityIn;
  /**
   * Retrieves the value for the lexeme SecurityIn.
   * @return The value for the lexeme SecurityIn.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="SecurityIn")
  public String getSecurityIn() {
    return tokenString_SecurityIn != null ? tokenString_SecurityIn : "";
  }
  /**
   * Replaces the lexeme SecurityScheme.
   * @param value The new value for the lexeme SecurityScheme.
   * @apilevel high-level
   */
  public void setSecurityScheme(String value) {
    tokenString_SecurityScheme = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_SecurityScheme;
  /**
   * Retrieves the value for the lexeme SecurityScheme.
   * @return The value for the lexeme SecurityScheme.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="SecurityScheme")
  public String getSecurityScheme() {
    return tokenString_SecurityScheme != null ? tokenString_SecurityScheme : "";
  }
  /**
   * Replaces the lexeme BearerFormat.
   * @param value The new value for the lexeme BearerFormat.
   * @apilevel high-level
   */
  public void setBearerFormat(String value) {
    tokenString_BearerFormat = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_BearerFormat;
  /**
   * Retrieves the value for the lexeme BearerFormat.
   * @return The value for the lexeme BearerFormat.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="BearerFormat")
  public String getBearerFormat() {
    return tokenString_BearerFormat != null ? tokenString_BearerFormat : "";
  }
  /**
   * Replaces the Flows child.
   * @param node The new node to replace the Flows child.
   * @apilevel high-level
   */
  public void setFlows(Flows node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Flows child.
   * @return The current node used as the Flows child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="Flows")
  public Flows getFlows() {
    return (Flows) getChild(0);
  }
  /**
   * Retrieves the Flows child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Flows child.
   * @apilevel low-level
   */
  public Flows getFlowsNoTransform() {
    return (Flows) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme OpenIdConnectUrl.
   * @param value The new value for the lexeme OpenIdConnectUrl.
   * @apilevel high-level
   */
  public void setOpenIdConnectUrl(String value) {
    tokenString_OpenIdConnectUrl = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_OpenIdConnectUrl;
  /**
   * Retrieves the value for the lexeme OpenIdConnectUrl.
   * @return The value for the lexeme OpenIdConnectUrl.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="OpenIdConnectUrl")
  public String getOpenIdConnectUrl() {
    return tokenString_OpenIdConnectUrl != null ? tokenString_OpenIdConnectUrl : "";
  }
/** @apilevel internal */
protected boolean print_visited = false;
  /**
   * @attribute syn
   * @aspect Print
   * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/Print.jrag:2
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Print", declaredAt="/Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/Print.jrag:2")
  public String print() {
    if (print_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.print().");
    }
    print_visited = true;
    try {
            String result = "{ \"type\" : \"" + getSecurityType() + "\", " ;
            if( !getDescription().isEmpty() ){
            result += "\"description\" : \"" + getDescription() + "\", ";
            }
            result += "\"name\" : \"" + getSecurityName() + "\", " +
            "\"in\" : \"" + getSecurityIn() + "\", " +
            "\"scheme\" : \"" + getSecurityScheme() + "\", ";
            if( !getBearerFormat().isEmpty() ){
            result += "\"bearerFormat\" : \"" + getBearerFormat() + "\", ";
            }
            result += "\"flows\" : " + getFlows() + ", " +
            "\"openIdConnectUrl\" : \"" + getOpenIdConnectUrl() + "\" }";
            return result;
            }
    finally {
      print_visited = false;
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
