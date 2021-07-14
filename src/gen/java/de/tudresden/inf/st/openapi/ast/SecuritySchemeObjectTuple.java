/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:49
 * @astdecl SecuritySchemeObjectTuple : SecuritySchemesTuple ::= <Name:String> SecuritySchemeObject;
 * @production SecuritySchemeObjectTuple : {@link SecuritySchemesTuple} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">{@link SecuritySchemeObject}</span>;

 */
public class SecuritySchemeObjectTuple extends SecuritySchemesTuple implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public SecuritySchemeObjectTuple() {
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
    name = {"Name", "SecuritySchemeObject"},
    type = {"String", "SecuritySchemeObject"},
    kind = {"Token", "Child"}
  )
  public SecuritySchemeObjectTuple(String p0, SecuritySchemeObject p1) {
    setName(p0);
    setChild(p1, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:23
   */
  protected int numChildren() {
    return 1;
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
  public SecuritySchemeObjectTuple clone() throws CloneNotSupportedException {
    SecuritySchemeObjectTuple node = (SecuritySchemeObjectTuple) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public SecuritySchemeObjectTuple copy() {
    try {
      SecuritySchemeObjectTuple node = (SecuritySchemeObjectTuple) clone();
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
  public SecuritySchemeObjectTuple fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public SecuritySchemeObjectTuple treeCopyNoTransform() {
    SecuritySchemeObjectTuple tree = (SecuritySchemeObjectTuple) copy();
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
  public SecuritySchemeObjectTuple treeCopy() {
    SecuritySchemeObjectTuple tree = (SecuritySchemeObjectTuple) copy();
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
    return super.is$Equal(node) && (tokenString_Name == ((SecuritySchemeObjectTuple) node).tokenString_Name);    
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
   * Replaces the SecuritySchemeObject child.
   * @param node The new node to replace the SecuritySchemeObject child.
   * @apilevel high-level
   */
  public void setSecuritySchemeObject(SecuritySchemeObject node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the SecuritySchemeObject child.
   * @return The current node used as the SecuritySchemeObject child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="SecuritySchemeObject")
  public SecuritySchemeObject getSecuritySchemeObject() {
    return (SecuritySchemeObject) getChild(0);
  }
  /**
   * Retrieves the SecuritySchemeObject child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the SecuritySchemeObject child.
   * @apilevel low-level
   */
  public SecuritySchemeObject getSecuritySchemeObjectNoTransform() {
    return (SecuritySchemeObject) getChildNoTransform(0);
  }
/** @apilevel internal */
protected boolean print_visited = false;
  /**
   * @attribute syn
   * @aspect Print
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Print.jrag:2
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Print", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Print.jrag:2")
  public String print() {
    if (print_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.print().");
    }
    print_visited = true;
    try {
            String result = "\"" + getName() + "\": " + getSecuritySchemeObject().print();
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
