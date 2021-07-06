/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:5
 * @astdecl ComponentsObject : ASTNode ::= SchemasTuple* ResponsesTuple* ParameterTuple* ExamplesTuple* RequestBodiesTuple* HeadersTuple* SecuritySchemesTuple* LinksTuple* CallbacksTuple*;
 * @production ComponentsObject : {@link ASTNode} ::= <span class="component">{@link SchemasTuple}*</span> <span class="component">{@link ResponsesTuple}*</span> <span class="component">{@link ParameterTuple}*</span> <span class="component">{@link ExamplesTuple}*</span> <span class="component">{@link RequestBodiesTuple}*</span> <span class="component">{@link HeadersTuple}*</span> <span class="component">{@link SecuritySchemesTuple}*</span> <span class="component">{@link LinksTuple}*</span> <span class="component">{@link CallbacksTuple}*</span>;

 */
public class ComponentsObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public ComponentsObject() {
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
    children = new ASTNode[9];
    setChild(new JastAddList(), 0);
    setChild(new JastAddList(), 1);
    setChild(new JastAddList(), 2);
    setChild(new JastAddList(), 3);
    setChild(new JastAddList(), 4);
    setChild(new JastAddList(), 5);
    setChild(new JastAddList(), 6);
    setChild(new JastAddList(), 7);
    setChild(new JastAddList(), 8);
  }
  /**
   * @declaredat ASTNode:22
   */
  @ASTNodeAnnotation.Constructor(
    name = {"SchemasTuple", "ResponsesTuple", "ParameterTuple", "ExamplesTuple", "RequestBodiesTuple", "HeadersTuple", "SecuritySchemesTuple", "LinksTuple", "CallbacksTuple"},
    type = {"JastAddList<SchemasTuple>", "JastAddList<ResponsesTuple>", "JastAddList<ParameterTuple>", "JastAddList<ExamplesTuple>", "JastAddList<RequestBodiesTuple>", "JastAddList<HeadersTuple>", "JastAddList<SecuritySchemesTuple>", "JastAddList<LinksTuple>", "JastAddList<CallbacksTuple>"},
    kind = {"List", "List", "List", "List", "List", "List", "List", "List", "List"}
  )
  public ComponentsObject(JastAddList<SchemasTuple> p0, JastAddList<ResponsesTuple> p1, JastAddList<ParameterTuple> p2, JastAddList<ExamplesTuple> p3, JastAddList<RequestBodiesTuple> p4, JastAddList<HeadersTuple> p5, JastAddList<SecuritySchemesTuple> p6, JastAddList<LinksTuple> p7, JastAddList<CallbacksTuple> p8) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
    setChild(p4, 4);
    setChild(p5, 5);
    setChild(p6, 6);
    setChild(p7, 7);
    setChild(p8, 8);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:39
   */
  protected int numChildren() {
    return 9;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:45
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:49
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:57
   */
  public ComponentsObject clone() throws CloneNotSupportedException {
    ComponentsObject node = (ComponentsObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:62
   */
  public ComponentsObject copy() {
    try {
      ComponentsObject node = (ComponentsObject) clone();
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
   * @declaredat ASTNode:81
   */
  @Deprecated
  public ComponentsObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:91
   */
  public ComponentsObject treeCopyNoTransform() {
    ComponentsObject tree = (ComponentsObject) copy();
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
   * @declaredat ASTNode:111
   */
  public ComponentsObject treeCopy() {
    ComponentsObject tree = (ComponentsObject) copy();
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
   * @declaredat ASTNode:125
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the SchemasTuple list.
   * @param list The new list node to be used as the SchemasTuple list.
   * @apilevel high-level
   */
  public void setSchemasTupleList(JastAddList<SchemasTuple> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the SchemasTuple list.
   * @return Number of children in the SchemasTuple list.
   * @apilevel high-level
   */
  public int getNumSchemasTuple() {
    return getSchemasTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SchemasTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SchemasTuple list.
   * @apilevel low-level
   */
  public int getNumSchemasTupleNoTransform() {
    return getSchemasTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SchemasTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SchemasTuple list.
   * @apilevel high-level
   */
  public SchemasTuple getSchemasTuple(int i) {
    return (SchemasTuple) getSchemasTupleList().getChild(i);
  }
  /**
   * Check whether the SchemasTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSchemasTuple() {
    return getSchemasTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the SchemasTuple list.
   * @param node The element to append to the SchemasTuple list.
   * @apilevel high-level
   */
  public void addSchemasTuple(SchemasTuple node) {
    JastAddList<SchemasTuple> list = (parent == null) ? getSchemasTupleListNoTransform() : getSchemasTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSchemasTupleNoTransform(SchemasTuple node) {
    JastAddList<SchemasTuple> list = getSchemasTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SchemasTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSchemasTuple(SchemasTuple node, int i) {
    JastAddList<SchemasTuple> list = getSchemasTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SchemasTuple list.
   * @return The node representing the SchemasTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SchemasTuple")
  public JastAddList<SchemasTuple> getSchemasTupleList() {
    JastAddList<SchemasTuple> list = (JastAddList<SchemasTuple>) getChild(0);
    return list;
  }
  /**
   * Retrieves the SchemasTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SchemasTuple list.
   * @apilevel low-level
   */
  public JastAddList<SchemasTuple> getSchemasTupleListNoTransform() {
    return (JastAddList<SchemasTuple>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the SchemasTuple list without
   * triggering rewrites.
   */
  public SchemasTuple getSchemasTupleNoTransform(int i) {
    return (SchemasTuple) getSchemasTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the SchemasTuple list.
   * @return The node representing the SchemasTuple list.
   * @apilevel high-level
   */
  public JastAddList<SchemasTuple> getSchemasTuples() {
    return getSchemasTupleList();
  }
  /**
   * Retrieves the SchemasTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SchemasTuple list.
   * @apilevel low-level
   */
  public JastAddList<SchemasTuple> getSchemasTuplesNoTransform() {
    return getSchemasTupleListNoTransform();
  }
  /**
   * Replaces the ResponsesTuple list.
   * @param list The new list node to be used as the ResponsesTuple list.
   * @apilevel high-level
   */
  public void setResponsesTupleList(JastAddList<ResponsesTuple> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the ResponsesTuple list.
   * @return Number of children in the ResponsesTuple list.
   * @apilevel high-level
   */
  public int getNumResponsesTuple() {
    return getResponsesTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ResponsesTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ResponsesTuple list.
   * @apilevel low-level
   */
  public int getNumResponsesTupleNoTransform() {
    return getResponsesTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ResponsesTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ResponsesTuple list.
   * @apilevel high-level
   */
  public ResponsesTuple getResponsesTuple(int i) {
    return (ResponsesTuple) getResponsesTupleList().getChild(i);
  }
  /**
   * Check whether the ResponsesTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasResponsesTuple() {
    return getResponsesTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ResponsesTuple list.
   * @param node The element to append to the ResponsesTuple list.
   * @apilevel high-level
   */
  public void addResponsesTuple(ResponsesTuple node) {
    JastAddList<ResponsesTuple> list = (parent == null) ? getResponsesTupleListNoTransform() : getResponsesTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addResponsesTupleNoTransform(ResponsesTuple node) {
    JastAddList<ResponsesTuple> list = getResponsesTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ResponsesTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setResponsesTuple(ResponsesTuple node, int i) {
    JastAddList<ResponsesTuple> list = getResponsesTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ResponsesTuple list.
   * @return The node representing the ResponsesTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ResponsesTuple")
  public JastAddList<ResponsesTuple> getResponsesTupleList() {
    JastAddList<ResponsesTuple> list = (JastAddList<ResponsesTuple>) getChild(1);
    return list;
  }
  /**
   * Retrieves the ResponsesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResponsesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ResponsesTuple> getResponsesTupleListNoTransform() {
    return (JastAddList<ResponsesTuple>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the ResponsesTuple list without
   * triggering rewrites.
   */
  public ResponsesTuple getResponsesTupleNoTransform(int i) {
    return (ResponsesTuple) getResponsesTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ResponsesTuple list.
   * @return The node representing the ResponsesTuple list.
   * @apilevel high-level
   */
  public JastAddList<ResponsesTuple> getResponsesTuples() {
    return getResponsesTupleList();
  }
  /**
   * Retrieves the ResponsesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ResponsesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ResponsesTuple> getResponsesTuplesNoTransform() {
    return getResponsesTupleListNoTransform();
  }
  /**
   * Replaces the ParameterTuple list.
   * @param list The new list node to be used as the ParameterTuple list.
   * @apilevel high-level
   */
  public void setParameterTupleList(JastAddList<ParameterTuple> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the ParameterTuple list.
   * @return Number of children in the ParameterTuple list.
   * @apilevel high-level
   */
  public int getNumParameterTuple() {
    return getParameterTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ParameterTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ParameterTuple list.
   * @apilevel low-level
   */
  public int getNumParameterTupleNoTransform() {
    return getParameterTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ParameterTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ParameterTuple list.
   * @apilevel high-level
   */
  public ParameterTuple getParameterTuple(int i) {
    return (ParameterTuple) getParameterTupleList().getChild(i);
  }
  /**
   * Check whether the ParameterTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParameterTuple() {
    return getParameterTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ParameterTuple list.
   * @param node The element to append to the ParameterTuple list.
   * @apilevel high-level
   */
  public void addParameterTuple(ParameterTuple node) {
    JastAddList<ParameterTuple> list = (parent == null) ? getParameterTupleListNoTransform() : getParameterTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addParameterTupleNoTransform(ParameterTuple node) {
    JastAddList<ParameterTuple> list = getParameterTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ParameterTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParameterTuple(ParameterTuple node, int i) {
    JastAddList<ParameterTuple> list = getParameterTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ParameterTuple list.
   * @return The node representing the ParameterTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ParameterTuple")
  public JastAddList<ParameterTuple> getParameterTupleList() {
    JastAddList<ParameterTuple> list = (JastAddList<ParameterTuple>) getChild(2);
    return list;
  }
  /**
   * Retrieves the ParameterTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParameterTuple list.
   * @apilevel low-level
   */
  public JastAddList<ParameterTuple> getParameterTupleListNoTransform() {
    return (JastAddList<ParameterTuple>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the ParameterTuple list without
   * triggering rewrites.
   */
  public ParameterTuple getParameterTupleNoTransform(int i) {
    return (ParameterTuple) getParameterTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ParameterTuple list.
   * @return The node representing the ParameterTuple list.
   * @apilevel high-level
   */
  public JastAddList<ParameterTuple> getParameterTuples() {
    return getParameterTupleList();
  }
  /**
   * Retrieves the ParameterTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ParameterTuple list.
   * @apilevel low-level
   */
  public JastAddList<ParameterTuple> getParameterTuplesNoTransform() {
    return getParameterTupleListNoTransform();
  }
  /**
   * Replaces the ExamplesTuple list.
   * @param list The new list node to be used as the ExamplesTuple list.
   * @apilevel high-level
   */
  public void setExamplesTupleList(JastAddList<ExamplesTuple> list) {
    setChild(list, 3);
  }
  /**
   * Retrieves the number of children in the ExamplesTuple list.
   * @return Number of children in the ExamplesTuple list.
   * @apilevel high-level
   */
  public int getNumExamplesTuple() {
    return getExamplesTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ExamplesTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ExamplesTuple list.
   * @apilevel low-level
   */
  public int getNumExamplesTupleNoTransform() {
    return getExamplesTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ExamplesTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ExamplesTuple list.
   * @apilevel high-level
   */
  public ExamplesTuple getExamplesTuple(int i) {
    return (ExamplesTuple) getExamplesTupleList().getChild(i);
  }
  /**
   * Check whether the ExamplesTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasExamplesTuple() {
    return getExamplesTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ExamplesTuple list.
   * @param node The element to append to the ExamplesTuple list.
   * @apilevel high-level
   */
  public void addExamplesTuple(ExamplesTuple node) {
    JastAddList<ExamplesTuple> list = (parent == null) ? getExamplesTupleListNoTransform() : getExamplesTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addExamplesTupleNoTransform(ExamplesTuple node) {
    JastAddList<ExamplesTuple> list = getExamplesTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ExamplesTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setExamplesTuple(ExamplesTuple node, int i) {
    JastAddList<ExamplesTuple> list = getExamplesTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ExamplesTuple list.
   * @return The node representing the ExamplesTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ExamplesTuple")
  public JastAddList<ExamplesTuple> getExamplesTupleList() {
    JastAddList<ExamplesTuple> list = (JastAddList<ExamplesTuple>) getChild(3);
    return list;
  }
  /**
   * Retrieves the ExamplesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ExamplesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ExamplesTuple> getExamplesTupleListNoTransform() {
    return (JastAddList<ExamplesTuple>) getChildNoTransform(3);
  }
  /**
   * @return the element at index {@code i} in the ExamplesTuple list without
   * triggering rewrites.
   */
  public ExamplesTuple getExamplesTupleNoTransform(int i) {
    return (ExamplesTuple) getExamplesTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ExamplesTuple list.
   * @return The node representing the ExamplesTuple list.
   * @apilevel high-level
   */
  public JastAddList<ExamplesTuple> getExamplesTuples() {
    return getExamplesTupleList();
  }
  /**
   * Retrieves the ExamplesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ExamplesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ExamplesTuple> getExamplesTuplesNoTransform() {
    return getExamplesTupleListNoTransform();
  }
  /**
   * Replaces the RequestBodiesTuple list.
   * @param list The new list node to be used as the RequestBodiesTuple list.
   * @apilevel high-level
   */
  public void setRequestBodiesTupleList(JastAddList<RequestBodiesTuple> list) {
    setChild(list, 4);
  }
  /**
   * Retrieves the number of children in the RequestBodiesTuple list.
   * @return Number of children in the RequestBodiesTuple list.
   * @apilevel high-level
   */
  public int getNumRequestBodiesTuple() {
    return getRequestBodiesTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the RequestBodiesTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the RequestBodiesTuple list.
   * @apilevel low-level
   */
  public int getNumRequestBodiesTupleNoTransform() {
    return getRequestBodiesTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the RequestBodiesTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the RequestBodiesTuple list.
   * @apilevel high-level
   */
  public RequestBodiesTuple getRequestBodiesTuple(int i) {
    return (RequestBodiesTuple) getRequestBodiesTupleList().getChild(i);
  }
  /**
   * Check whether the RequestBodiesTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasRequestBodiesTuple() {
    return getRequestBodiesTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the RequestBodiesTuple list.
   * @param node The element to append to the RequestBodiesTuple list.
   * @apilevel high-level
   */
  public void addRequestBodiesTuple(RequestBodiesTuple node) {
    JastAddList<RequestBodiesTuple> list = (parent == null) ? getRequestBodiesTupleListNoTransform() : getRequestBodiesTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addRequestBodiesTupleNoTransform(RequestBodiesTuple node) {
    JastAddList<RequestBodiesTuple> list = getRequestBodiesTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the RequestBodiesTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setRequestBodiesTuple(RequestBodiesTuple node, int i) {
    JastAddList<RequestBodiesTuple> list = getRequestBodiesTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the RequestBodiesTuple list.
   * @return The node representing the RequestBodiesTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="RequestBodiesTuple")
  public JastAddList<RequestBodiesTuple> getRequestBodiesTupleList() {
    JastAddList<RequestBodiesTuple> list = (JastAddList<RequestBodiesTuple>) getChild(4);
    return list;
  }
  /**
   * Retrieves the RequestBodiesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the RequestBodiesTuple list.
   * @apilevel low-level
   */
  public JastAddList<RequestBodiesTuple> getRequestBodiesTupleListNoTransform() {
    return (JastAddList<RequestBodiesTuple>) getChildNoTransform(4);
  }
  /**
   * @return the element at index {@code i} in the RequestBodiesTuple list without
   * triggering rewrites.
   */
  public RequestBodiesTuple getRequestBodiesTupleNoTransform(int i) {
    return (RequestBodiesTuple) getRequestBodiesTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the RequestBodiesTuple list.
   * @return The node representing the RequestBodiesTuple list.
   * @apilevel high-level
   */
  public JastAddList<RequestBodiesTuple> getRequestBodiesTuples() {
    return getRequestBodiesTupleList();
  }
  /**
   * Retrieves the RequestBodiesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the RequestBodiesTuple list.
   * @apilevel low-level
   */
  public JastAddList<RequestBodiesTuple> getRequestBodiesTuplesNoTransform() {
    return getRequestBodiesTupleListNoTransform();
  }
  /**
   * Replaces the HeadersTuple list.
   * @param list The new list node to be used as the HeadersTuple list.
   * @apilevel high-level
   */
  public void setHeadersTupleList(JastAddList<HeadersTuple> list) {
    setChild(list, 5);
  }
  /**
   * Retrieves the number of children in the HeadersTuple list.
   * @return Number of children in the HeadersTuple list.
   * @apilevel high-level
   */
  public int getNumHeadersTuple() {
    return getHeadersTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the HeadersTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the HeadersTuple list.
   * @apilevel low-level
   */
  public int getNumHeadersTupleNoTransform() {
    return getHeadersTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the HeadersTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the HeadersTuple list.
   * @apilevel high-level
   */
  public HeadersTuple getHeadersTuple(int i) {
    return (HeadersTuple) getHeadersTupleList().getChild(i);
  }
  /**
   * Check whether the HeadersTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasHeadersTuple() {
    return getHeadersTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the HeadersTuple list.
   * @param node The element to append to the HeadersTuple list.
   * @apilevel high-level
   */
  public void addHeadersTuple(HeadersTuple node) {
    JastAddList<HeadersTuple> list = (parent == null) ? getHeadersTupleListNoTransform() : getHeadersTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addHeadersTupleNoTransform(HeadersTuple node) {
    JastAddList<HeadersTuple> list = getHeadersTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the HeadersTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setHeadersTuple(HeadersTuple node, int i) {
    JastAddList<HeadersTuple> list = getHeadersTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the HeadersTuple list.
   * @return The node representing the HeadersTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="HeadersTuple")
  public JastAddList<HeadersTuple> getHeadersTupleList() {
    JastAddList<HeadersTuple> list = (JastAddList<HeadersTuple>) getChild(5);
    return list;
  }
  /**
   * Retrieves the HeadersTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HeadersTuple list.
   * @apilevel low-level
   */
  public JastAddList<HeadersTuple> getHeadersTupleListNoTransform() {
    return (JastAddList<HeadersTuple>) getChildNoTransform(5);
  }
  /**
   * @return the element at index {@code i} in the HeadersTuple list without
   * triggering rewrites.
   */
  public HeadersTuple getHeadersTupleNoTransform(int i) {
    return (HeadersTuple) getHeadersTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the HeadersTuple list.
   * @return The node representing the HeadersTuple list.
   * @apilevel high-level
   */
  public JastAddList<HeadersTuple> getHeadersTuples() {
    return getHeadersTupleList();
  }
  /**
   * Retrieves the HeadersTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the HeadersTuple list.
   * @apilevel low-level
   */
  public JastAddList<HeadersTuple> getHeadersTuplesNoTransform() {
    return getHeadersTupleListNoTransform();
  }
  /**
   * Replaces the SecuritySchemesTuple list.
   * @param list The new list node to be used as the SecuritySchemesTuple list.
   * @apilevel high-level
   */
  public void setSecuritySchemesTupleList(JastAddList<SecuritySchemesTuple> list) {
    setChild(list, 6);
  }
  /**
   * Retrieves the number of children in the SecuritySchemesTuple list.
   * @return Number of children in the SecuritySchemesTuple list.
   * @apilevel high-level
   */
  public int getNumSecuritySchemesTuple() {
    return getSecuritySchemesTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SecuritySchemesTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SecuritySchemesTuple list.
   * @apilevel low-level
   */
  public int getNumSecuritySchemesTupleNoTransform() {
    return getSecuritySchemesTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SecuritySchemesTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SecuritySchemesTuple list.
   * @apilevel high-level
   */
  public SecuritySchemesTuple getSecuritySchemesTuple(int i) {
    return (SecuritySchemesTuple) getSecuritySchemesTupleList().getChild(i);
  }
  /**
   * Check whether the SecuritySchemesTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSecuritySchemesTuple() {
    return getSecuritySchemesTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the SecuritySchemesTuple list.
   * @param node The element to append to the SecuritySchemesTuple list.
   * @apilevel high-level
   */
  public void addSecuritySchemesTuple(SecuritySchemesTuple node) {
    JastAddList<SecuritySchemesTuple> list = (parent == null) ? getSecuritySchemesTupleListNoTransform() : getSecuritySchemesTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSecuritySchemesTupleNoTransform(SecuritySchemesTuple node) {
    JastAddList<SecuritySchemesTuple> list = getSecuritySchemesTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SecuritySchemesTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSecuritySchemesTuple(SecuritySchemesTuple node, int i) {
    JastAddList<SecuritySchemesTuple> list = getSecuritySchemesTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SecuritySchemesTuple list.
   * @return The node representing the SecuritySchemesTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SecuritySchemesTuple")
  public JastAddList<SecuritySchemesTuple> getSecuritySchemesTupleList() {
    JastAddList<SecuritySchemesTuple> list = (JastAddList<SecuritySchemesTuple>) getChild(6);
    return list;
  }
  /**
   * Retrieves the SecuritySchemesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecuritySchemesTuple list.
   * @apilevel low-level
   */
  public JastAddList<SecuritySchemesTuple> getSecuritySchemesTupleListNoTransform() {
    return (JastAddList<SecuritySchemesTuple>) getChildNoTransform(6);
  }
  /**
   * @return the element at index {@code i} in the SecuritySchemesTuple list without
   * triggering rewrites.
   */
  public SecuritySchemesTuple getSecuritySchemesTupleNoTransform(int i) {
    return (SecuritySchemesTuple) getSecuritySchemesTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the SecuritySchemesTuple list.
   * @return The node representing the SecuritySchemesTuple list.
   * @apilevel high-level
   */
  public JastAddList<SecuritySchemesTuple> getSecuritySchemesTuples() {
    return getSecuritySchemesTupleList();
  }
  /**
   * Retrieves the SecuritySchemesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecuritySchemesTuple list.
   * @apilevel low-level
   */
  public JastAddList<SecuritySchemesTuple> getSecuritySchemesTuplesNoTransform() {
    return getSecuritySchemesTupleListNoTransform();
  }
  /**
   * Replaces the LinksTuple list.
   * @param list The new list node to be used as the LinksTuple list.
   * @apilevel high-level
   */
  public void setLinksTupleList(JastAddList<LinksTuple> list) {
    setChild(list, 7);
  }
  /**
   * Retrieves the number of children in the LinksTuple list.
   * @return Number of children in the LinksTuple list.
   * @apilevel high-level
   */
  public int getNumLinksTuple() {
    return getLinksTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the LinksTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the LinksTuple list.
   * @apilevel low-level
   */
  public int getNumLinksTupleNoTransform() {
    return getLinksTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the LinksTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the LinksTuple list.
   * @apilevel high-level
   */
  public LinksTuple getLinksTuple(int i) {
    return (LinksTuple) getLinksTupleList().getChild(i);
  }
  /**
   * Check whether the LinksTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasLinksTuple() {
    return getLinksTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the LinksTuple list.
   * @param node The element to append to the LinksTuple list.
   * @apilevel high-level
   */
  public void addLinksTuple(LinksTuple node) {
    JastAddList<LinksTuple> list = (parent == null) ? getLinksTupleListNoTransform() : getLinksTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addLinksTupleNoTransform(LinksTuple node) {
    JastAddList<LinksTuple> list = getLinksTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the LinksTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setLinksTuple(LinksTuple node, int i) {
    JastAddList<LinksTuple> list = getLinksTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the LinksTuple list.
   * @return The node representing the LinksTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="LinksTuple")
  public JastAddList<LinksTuple> getLinksTupleList() {
    JastAddList<LinksTuple> list = (JastAddList<LinksTuple>) getChild(7);
    return list;
  }
  /**
   * Retrieves the LinksTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the LinksTuple list.
   * @apilevel low-level
   */
  public JastAddList<LinksTuple> getLinksTupleListNoTransform() {
    return (JastAddList<LinksTuple>) getChildNoTransform(7);
  }
  /**
   * @return the element at index {@code i} in the LinksTuple list without
   * triggering rewrites.
   */
  public LinksTuple getLinksTupleNoTransform(int i) {
    return (LinksTuple) getLinksTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the LinksTuple list.
   * @return The node representing the LinksTuple list.
   * @apilevel high-level
   */
  public JastAddList<LinksTuple> getLinksTuples() {
    return getLinksTupleList();
  }
  /**
   * Retrieves the LinksTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the LinksTuple list.
   * @apilevel low-level
   */
  public JastAddList<LinksTuple> getLinksTuplesNoTransform() {
    return getLinksTupleListNoTransform();
  }
  /**
   * Replaces the CallbacksTuple list.
   * @param list The new list node to be used as the CallbacksTuple list.
   * @apilevel high-level
   */
  public void setCallbacksTupleList(JastAddList<CallbacksTuple> list) {
    setChild(list, 8);
  }
  /**
   * Retrieves the number of children in the CallbacksTuple list.
   * @return Number of children in the CallbacksTuple list.
   * @apilevel high-level
   */
  public int getNumCallbacksTuple() {
    return getCallbacksTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the CallbacksTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the CallbacksTuple list.
   * @apilevel low-level
   */
  public int getNumCallbacksTupleNoTransform() {
    return getCallbacksTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the CallbacksTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the CallbacksTuple list.
   * @apilevel high-level
   */
  public CallbacksTuple getCallbacksTuple(int i) {
    return (CallbacksTuple) getCallbacksTupleList().getChild(i);
  }
  /**
   * Check whether the CallbacksTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasCallbacksTuple() {
    return getCallbacksTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the CallbacksTuple list.
   * @param node The element to append to the CallbacksTuple list.
   * @apilevel high-level
   */
  public void addCallbacksTuple(CallbacksTuple node) {
    JastAddList<CallbacksTuple> list = (parent == null) ? getCallbacksTupleListNoTransform() : getCallbacksTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addCallbacksTupleNoTransform(CallbacksTuple node) {
    JastAddList<CallbacksTuple> list = getCallbacksTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the CallbacksTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setCallbacksTuple(CallbacksTuple node, int i) {
    JastAddList<CallbacksTuple> list = getCallbacksTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the CallbacksTuple list.
   * @return The node representing the CallbacksTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="CallbacksTuple")
  public JastAddList<CallbacksTuple> getCallbacksTupleList() {
    JastAddList<CallbacksTuple> list = (JastAddList<CallbacksTuple>) getChild(8);
    return list;
  }
  /**
   * Retrieves the CallbacksTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CallbacksTuple list.
   * @apilevel low-level
   */
  public JastAddList<CallbacksTuple> getCallbacksTupleListNoTransform() {
    return (JastAddList<CallbacksTuple>) getChildNoTransform(8);
  }
  /**
   * @return the element at index {@code i} in the CallbacksTuple list without
   * triggering rewrites.
   */
  public CallbacksTuple getCallbacksTupleNoTransform(int i) {
    return (CallbacksTuple) getCallbacksTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the CallbacksTuple list.
   * @return The node representing the CallbacksTuple list.
   * @apilevel high-level
   */
  public JastAddList<CallbacksTuple> getCallbacksTuples() {
    return getCallbacksTupleList();
  }
  /**
   * Retrieves the CallbacksTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CallbacksTuple list.
   * @apilevel low-level
   */
  public JastAddList<CallbacksTuple> getCallbacksTuplesNoTransform() {
    return getCallbacksTupleListNoTransform();
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
    
            if( getNumSchemasTuple() != 0 ){
            result += "\"schemas\": { ";
            for( SchemasTuple t : getSchemasTuples() ){
            result += t.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " }, ";
            }
            if( getNumResponsesTuple() != 0 ){
            result += "\"responses\": { ";
            for( ResponsesTuple t : getResponsesTuples() ){
            result += t.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " }, ";
            }
            if( getNumParameterTuple() != 0 ){
            result += "\"parameters\": { ";
            for( ParameterTuple t : getParameterTuples() ){
            result += t.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " }, ";
            }
            if( getNumExamplesTuple() != 0 ){
            result += "\"examples\": { ";
            for( ExamplesTuple t : getExamplesTuples() ){
            result += t.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " }, ";
            }
            if( getNumRequestBodiesTuple() != 0 ){
            result += "\"requestBodies\": { ";
            for( RequestBodiesTuple t : getRequestBodiesTuples() ){
            result += t.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " }, ";
            }
            if( getNumHeadersTuple() != 0 ){
            result += "\"headers\": { ";
            for( HeadersTuple t : getHeadersTuples() ){
            result += t.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " }, ";
            }
            if( getNumSecuritySchemesTuple() != 0 ){
            result += "\"securitySchemes\": { ";
            for( SecuritySchemesTuple t : getSecuritySchemesTuples() ){
            result += t.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " }, " ;
            }
            if( getNumLinksTuple() != 0 ){
            result += "\"links\": { ";
            for( LinksTuple t : getLinksTuples() ){
            result += t.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " }, ";
            }
            if( getNumCallbacksTuple() != 0 ){
            result += "\"callbacks\": { ";
            for( CallbacksTuple t : getCallbacksTuples() ){
            result += t.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " }, ";
            }
            result = result.substring(0, result.length() - 2) + " }";
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
