/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:109
 * @astdecl ResponsesObject : ASTNode ::= HTTPStatusCode*;
 * @production ResponsesObject : {@link ASTNode} ::= <span class="component">{@link HTTPStatusCode}*</span>;

 */
public class ResponsesObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ResponsesObject() {
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
    name = {"HTTPStatusCode"},
    type = {"JastAddList<HTTPStatusCode>"},
    kind = {"List"}
  )
  public ResponsesObject(JastAddList<HTTPStatusCode> p0) {
    setChild(p0, 0);
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
  public ResponsesObject clone() throws CloneNotSupportedException {
    ResponsesObject node = (ResponsesObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public ResponsesObject copy() {
    try {
      ResponsesObject node = (ResponsesObject) clone();
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
  public ResponsesObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public ResponsesObject treeCopyNoTransform() {
    ResponsesObject tree = (ResponsesObject) copy();
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
  public ResponsesObject treeCopy() {
    ResponsesObject tree = (ResponsesObject) copy();
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
    return super.is$Equal(node);    
  }
  /**
   * Replaces the HTTPStatusCode list.
   * @param list The new list node to be used as the HTTPStatusCode list.
   * @apilevel high-level
   */
  public void setHTTPStatusCodeList(JastAddList<HTTPStatusCode> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the HTTPStatusCode list.
   * @return Number of children in the HTTPStatusCode list.
   * @apilevel high-level
   */
  public int getNumHTTPStatusCode() {
    return getHTTPStatusCodeList().getNumChild();
  }
  /**
   * Retrieves the number of children in the HTTPStatusCode list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the HTTPStatusCode list.
   * @apilevel low-level
   */
  public int getNumHTTPStatusCodeNoTransform() {
    return getHTTPStatusCodeListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the HTTPStatusCode list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the HTTPStatusCode list.
   * @apilevel high-level
   */
  public HTTPStatusCode getHTTPStatusCode(int i) {
    return (HTTPStatusCode) getHTTPStatusCodeList().getChild(i);
  }
  /**
   * Check whether the HTTPStatusCode list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasHTTPStatusCode() {
    return getHTTPStatusCodeList().getNumChild() != 0;
  }
  /**
   * Append an element to the HTTPStatusCode list.
   * @param node The element to append to the HTTPStatusCode list.
   * @apilevel high-level
   */
  public void addHTTPStatusCode(HTTPStatusCode node) {
    JastAddList<HTTPStatusCode> list = (parent == null) ? getHTTPStatusCodeListNoTransform() : getHTTPStatusCodeList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addHTTPStatusCodeNoTransform(HTTPStatusCode node) {
    JastAddList<HTTPStatusCode> list = getHTTPStatusCodeListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the HTTPStatusCode list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setHTTPStatusCode(HTTPStatusCode node, int i) {
    JastAddList<HTTPStatusCode> list = getHTTPStatusCodeList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the HTTPStatusCode list.
   * @return The node representing the HTTPStatusCode list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="HTTPStatusCode")
  public JastAddList<HTTPStatusCode> getHTTPStatusCodeList() {
    JastAddList<HTTPStatusCode> list = (JastAddList<HTTPStatusCode>) getChild(0);
    return list;
  }
  /**
   * Retrieves the HTTPStatusCode list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HTTPStatusCode list.
   * @apilevel low-level
   */
  public JastAddList<HTTPStatusCode> getHTTPStatusCodeListNoTransform() {
    return (JastAddList<HTTPStatusCode>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the HTTPStatusCode list without
   * triggering rewrites.
   */
  public HTTPStatusCode getHTTPStatusCodeNoTransform(int i) {
    return (HTTPStatusCode) getHTTPStatusCodeListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the HTTPStatusCode list.
   * @return The node representing the HTTPStatusCode list.
   * @apilevel high-level
   */
  public JastAddList<HTTPStatusCode> getHTTPStatusCodes() {
    return getHTTPStatusCodeList();
  }
  /**
   * Retrieves the HTTPStatusCode list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HTTPStatusCode list.
   * @apilevel low-level
   */
  public JastAddList<HTTPStatusCode> getHTTPStatusCodesNoTransform() {
    return getHTTPStatusCodeListNoTransform();
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
            String result = "{ ";
    
            if( getNumHTTPStatusCode() != 0 ){
            for( HTTPStatusCode h : getHTTPStatusCodes() ){
            result += h.print() + ", ";
            }
            result = result.substring(0, result.length() - 2);
            }
            result = " } ";
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
