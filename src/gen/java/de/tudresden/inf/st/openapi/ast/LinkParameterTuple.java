/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:126
 * @astdecl LinkParameterTuple : ASTNode ::= <LinkParameterKey:String> <LinkParameterValue:Object>;
 * @production LinkParameterTuple : {@link ASTNode} ::= <span class="component">&lt;LinkParameterKey:String&gt;</span> <span class="component">&lt;LinkParameterValue:Object&gt;</span>;

 */
public class LinkParameterTuple extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public LinkParameterTuple() {
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
    name = {"LinkParameterKey", "LinkParameterValue"},
    type = {"String", "Object"},
    kind = {"Token", "Token"}
  )
  public LinkParameterTuple(String p0, Object p1) {
    setLinkParameterKey(p0);
    setLinkParameterValue(p1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:28
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:36
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:40
   */
  public LinkParameterTuple clone() throws CloneNotSupportedException {
    LinkParameterTuple node = (LinkParameterTuple) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public LinkParameterTuple copy() {
    try {
      LinkParameterTuple node = (LinkParameterTuple) clone();
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
   * @declaredat ASTNode:64
   */
  @Deprecated
  public LinkParameterTuple fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public LinkParameterTuple treeCopyNoTransform() {
    LinkParameterTuple tree = (LinkParameterTuple) copy();
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
   * @declaredat ASTNode:94
   */
  public LinkParameterTuple treeCopy() {
    LinkParameterTuple tree = (LinkParameterTuple) copy();
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
   * @declaredat ASTNode:108
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_LinkParameterKey == ((LinkParameterTuple) node).tokenString_LinkParameterKey) && (tokenObject_LinkParameterValue == ((LinkParameterTuple) node).tokenObject_LinkParameterValue);    
  }
  /**
   * Replaces the lexeme LinkParameterKey.
   * @param value The new value for the lexeme LinkParameterKey.
   * @apilevel high-level
   */
  public void setLinkParameterKey(String value) {
    tokenString_LinkParameterKey = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_LinkParameterKey;
  /**
   * Retrieves the value for the lexeme LinkParameterKey.
   * @return The value for the lexeme LinkParameterKey.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="LinkParameterKey")
  public String getLinkParameterKey() {
    return tokenString_LinkParameterKey != null ? tokenString_LinkParameterKey : "";
  }
  /**
   * Replaces the lexeme LinkParameterValue.
   * @param value The new value for the lexeme LinkParameterValue.
   * @apilevel high-level
   */
  public void setLinkParameterValue(Object value) {
    tokenObject_LinkParameterValue = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_LinkParameterValue;
  /**
   * Retrieves the value for the lexeme LinkParameterValue.
   * @return The value for the lexeme LinkParameterValue.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="LinkParameterValue")
  public Object getLinkParameterValue() {
    return tokenObject_LinkParameterValue;
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
            String result = "\"" + getLinkParameterKey() + "\": ";
            if( getLinkParameterValue() instanceof String ){
            result += "\"" + getLinkParameterValue() + "\"";
            } else {
            result += getLinkParameterValue();
            }
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
