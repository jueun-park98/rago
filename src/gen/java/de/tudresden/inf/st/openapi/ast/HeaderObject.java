/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
/**
 * @ast node
 * @declaredat /Users/jueunpark/Documents/gitJastadd/bachelor-thesis-jastadd/src/main/jastadd/OpenAPISpecification.ast:129
 * @astdecl HeaderObject : ASTNode ::= <Name:String> <In:String> <Description:String> <Required:boolean> <DeprecatedBoolean:Object> <AllowEmptyValue:Object> <Style:String> <Explode:Object> <AllowReserved:Object> [Schema] <Example:Object> ExamplesTuple* ContentTuple*;
 * @production HeaderObject : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">&lt;In:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;Required:boolean&gt;</span> <span class="component">&lt;DeprecatedBoolean:Object&gt;</span> <span class="component">&lt;AllowEmptyValue:Object&gt;</span> <span class="component">&lt;Style:String&gt;</span> <span class="component">&lt;Explode:Object&gt;</span> <span class="component">&lt;AllowReserved:Object&gt;</span> <span class="component">[{@link Schema}]</span> <span class="component">&lt;Example:Object&gt;</span> <span class="component">{@link ExamplesTuple}*</span> <span class="component">{@link ContentTuple}*</span>;

 */
public class HeaderObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public HeaderObject() {
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
    children = new ASTNode[3];
    setChild(new Opt(), 0);
    setChild(new JastAddList(), 1);
    setChild(new JastAddList(), 2);
  }
  /**
   * @declaredat ASTNode:16
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Name", "In", "Description", "Required", "DeprecatedBoolean", "AllowEmptyValue", "Style", "Explode", "AllowReserved", "Schema", "Example", "ExamplesTuple", "ContentTuple"},
    type = {"String", "String", "String", "boolean", "Object", "Object", "String", "Object", "Object", "Opt<Schema>", "Object", "JastAddList<ExamplesTuple>", "JastAddList<ContentTuple>"},
    kind = {"Token", "Token", "Token", "Token", "Token", "Token", "Token", "Token", "Token", "Opt", "Token", "List", "List"}
  )
  public HeaderObject(String p0, String p1, String p2, boolean p3, Object p4, Object p5, String p6, Object p7, Object p8, Opt<Schema> p9, Object p10, JastAddList<ExamplesTuple> p11, JastAddList<ContentTuple> p12) {
    setName(p0);
    setIn(p1);
    setDescription(p2);
    setRequired(p3);
    setDeprecatedBoolean(p4);
    setAllowEmptyValue(p5);
    setStyle(p6);
    setExplode(p7);
    setAllowReserved(p8);
    setChild(p9, 0);
    setExample(p10);
    setChild(p11, 1);
    setChild(p12, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:37
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:43
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:55
   */
  public HeaderObject clone() throws CloneNotSupportedException {
    HeaderObject node = (HeaderObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:60
   */
  public HeaderObject copy() {
    try {
      HeaderObject node = (HeaderObject) clone();
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
   * @declaredat ASTNode:79
   */
  @Deprecated
  public HeaderObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:89
   */
  public HeaderObject treeCopyNoTransform() {
    HeaderObject tree = (HeaderObject) copy();
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
   * @declaredat ASTNode:109
   */
  public HeaderObject treeCopy() {
    HeaderObject tree = (HeaderObject) copy();
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
   * @declaredat ASTNode:123
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((HeaderObject) node).tokenString_Name) && (tokenString_In == ((HeaderObject) node).tokenString_In) && (tokenString_Description == ((HeaderObject) node).tokenString_Description) && (tokenboolean_Required == ((HeaderObject) node).tokenboolean_Required) && (tokenObject_DeprecatedBoolean == ((HeaderObject) node).tokenObject_DeprecatedBoolean) && (tokenObject_AllowEmptyValue == ((HeaderObject) node).tokenObject_AllowEmptyValue) && (tokenString_Style == ((HeaderObject) node).tokenString_Style) && (tokenObject_Explode == ((HeaderObject) node).tokenObject_Explode) && (tokenObject_AllowReserved == ((HeaderObject) node).tokenObject_AllowReserved) && (tokenObject_Example == ((HeaderObject) node).tokenObject_Example);    
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
   * Replaces the lexeme In.
   * @param value The new value for the lexeme In.
   * @apilevel high-level
   */
  public void setIn(String value) {
    tokenString_In = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_In;
  /**
   * Retrieves the value for the lexeme In.
   * @return The value for the lexeme In.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="In")
  public String getIn() {
    return tokenString_In != null ? tokenString_In : "";
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
   * Replaces the lexeme Required.
   * @param value The new value for the lexeme Required.
   * @apilevel high-level
   */
  public void setRequired(boolean value) {
    tokenboolean_Required = value;
  }
  /** @apilevel internal 
   */
  protected boolean tokenboolean_Required;
  /**
   * Retrieves the value for the lexeme Required.
   * @return The value for the lexeme Required.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Required")
  public boolean getRequired() {
    return tokenboolean_Required;
  }
  /**
   * Replaces the lexeme DeprecatedBoolean.
   * @param value The new value for the lexeme DeprecatedBoolean.
   * @apilevel high-level
   */
  public void setDeprecatedBoolean(Object value) {
    tokenObject_DeprecatedBoolean = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_DeprecatedBoolean;
  /**
   * Retrieves the value for the lexeme DeprecatedBoolean.
   * @return The value for the lexeme DeprecatedBoolean.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="DeprecatedBoolean")
  public Object getDeprecatedBoolean() {
    return tokenObject_DeprecatedBoolean;
  }
  /**
   * Replaces the lexeme AllowEmptyValue.
   * @param value The new value for the lexeme AllowEmptyValue.
   * @apilevel high-level
   */
  public void setAllowEmptyValue(Object value) {
    tokenObject_AllowEmptyValue = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_AllowEmptyValue;
  /**
   * Retrieves the value for the lexeme AllowEmptyValue.
   * @return The value for the lexeme AllowEmptyValue.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="AllowEmptyValue")
  public Object getAllowEmptyValue() {
    return tokenObject_AllowEmptyValue;
  }
  /**
   * Replaces the lexeme Style.
   * @param value The new value for the lexeme Style.
   * @apilevel high-level
   */
  public void setStyle(String value) {
    tokenString_Style = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Style;
  /**
   * Retrieves the value for the lexeme Style.
   * @return The value for the lexeme Style.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Style")
  public String getStyle() {
    return tokenString_Style != null ? tokenString_Style : "";
  }
  /**
   * Replaces the lexeme Explode.
   * @param value The new value for the lexeme Explode.
   * @apilevel high-level
   */
  public void setExplode(Object value) {
    tokenObject_Explode = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_Explode;
  /**
   * Retrieves the value for the lexeme Explode.
   * @return The value for the lexeme Explode.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Explode")
  public Object getExplode() {
    return tokenObject_Explode;
  }
  /**
   * Replaces the lexeme AllowReserved.
   * @param value The new value for the lexeme AllowReserved.
   * @apilevel high-level
   */
  public void setAllowReserved(Object value) {
    tokenObject_AllowReserved = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_AllowReserved;
  /**
   * Retrieves the value for the lexeme AllowReserved.
   * @return The value for the lexeme AllowReserved.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="AllowReserved")
  public Object getAllowReserved() {
    return tokenObject_AllowReserved;
  }
  /**
   * Replaces the optional node for the Schema child. This is the <code>Opt</code>
   * node containing the child Schema, not the actual child!
   * @param opt The new node to be used as the optional node for the Schema child.
   * @apilevel low-level
   */
  public void setSchemaOpt(Opt<Schema> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) Schema child.
   * @param node The new node to be used as the Schema child.
   * @apilevel high-level
   */
  public void setSchema(Schema node) {
    getSchemaOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Schema child exists.
   * @return {@code true} if the optional Schema child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasSchema() {
    return getSchemaOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Schema child.
   * @return The Schema child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Schema getSchema() {
    return (Schema) getSchemaOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Schema child. This is the <code>Opt</code> node containing the child Schema, not the actual child!
   * @return The optional node for child the Schema child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Schema")
  public Opt<Schema> getSchemaOpt() {
    return (Opt<Schema>) getChild(0);
  }
  /**
   * Retrieves the optional node for child Schema. This is the <code>Opt</code> node containing the child Schema, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Schema.
   * @apilevel low-level
   */
  public Opt<Schema> getSchemaOptNoTransform() {
    return (Opt<Schema>) getChildNoTransform(0);
  }
  /**
   * Replaces the lexeme Example.
   * @param value The new value for the lexeme Example.
   * @apilevel high-level
   */
  public void setExample(Object value) {
    tokenObject_Example = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_Example;
  /**
   * Retrieves the value for the lexeme Example.
   * @return The value for the lexeme Example.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Example")
  public Object getExample() {
    return tokenObject_Example;
  }
  /**
   * Replaces the ExamplesTuple list.
   * @param list The new list node to be used as the ExamplesTuple list.
   * @apilevel high-level
   */
  public void setExamplesTupleList(JastAddList<ExamplesTuple> list) {
    setChild(list, 1);
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
    JastAddList<ExamplesTuple> list = (JastAddList<ExamplesTuple>) getChild(1);
    return list;
  }
  /**
   * Retrieves the ExamplesTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ExamplesTuple list.
   * @apilevel low-level
   */
  public JastAddList<ExamplesTuple> getExamplesTupleListNoTransform() {
    return (JastAddList<ExamplesTuple>) getChildNoTransform(1);
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
   * Replaces the ContentTuple list.
   * @param list The new list node to be used as the ContentTuple list.
   * @apilevel high-level
   */
  public void setContentTupleList(JastAddList<ContentTuple> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the ContentTuple list.
   * @return Number of children in the ContentTuple list.
   * @apilevel high-level
   */
  public int getNumContentTuple() {
    return getContentTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ContentTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ContentTuple list.
   * @apilevel low-level
   */
  public int getNumContentTupleNoTransform() {
    return getContentTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ContentTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ContentTuple list.
   * @apilevel high-level
   */
  public ContentTuple getContentTuple(int i) {
    return (ContentTuple) getContentTupleList().getChild(i);
  }
  /**
   * Check whether the ContentTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasContentTuple() {
    return getContentTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the ContentTuple list.
   * @param node The element to append to the ContentTuple list.
   * @apilevel high-level
   */
  public void addContentTuple(ContentTuple node) {
    JastAddList<ContentTuple> list = (parent == null) ? getContentTupleListNoTransform() : getContentTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addContentTupleNoTransform(ContentTuple node) {
    JastAddList<ContentTuple> list = getContentTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ContentTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setContentTuple(ContentTuple node, int i) {
    JastAddList<ContentTuple> list = getContentTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ContentTuple list.
   * @return The node representing the ContentTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ContentTuple")
  public JastAddList<ContentTuple> getContentTupleList() {
    JastAddList<ContentTuple> list = (JastAddList<ContentTuple>) getChild(2);
    return list;
  }
  /**
   * Retrieves the ContentTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ContentTuple list.
   * @apilevel low-level
   */
  public JastAddList<ContentTuple> getContentTupleListNoTransform() {
    return (JastAddList<ContentTuple>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the ContentTuple list without
   * triggering rewrites.
   */
  public ContentTuple getContentTupleNoTransform(int i) {
    return (ContentTuple) getContentTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ContentTuple list.
   * @return The node representing the ContentTuple list.
   * @apilevel high-level
   */
  public JastAddList<ContentTuple> getContentTuples() {
    return getContentTupleList();
  }
  /**
   * Retrieves the ContentTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ContentTuple list.
   * @apilevel low-level
   */
  public JastAddList<ContentTuple> getContentTuplesNoTransform() {
    return getContentTupleListNoTransform();
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
            String result = "{ ";
    
            if( !getName().isEmpty() ){
            result += "\"name\": \"" + getName() + "\", ";
            }
            if( !getIn().isEmpty() ){
            result += "\"in\": \"" + getIn() + "\", ";
            }
            if( !getDescription().isEmpty() ){
            result += "\"description\": \"" + getDescription() + "\", ";
            }
            result += "\"required\": \"" + getRequired() + "\", ";
            if( getDeprecatedBoolean() != null ){
            result += "\"deprecated\": " + getDeprecatedBoolean() + ", ";
            }
            if( getAllowEmptyValue() != null ){
            result += "\"allowEmptyValue\": " + getAllowEmptyValue() + ", ";
            }
            if( !getStyle().isEmpty() ){
            result += "\"style\": \"" + getStyle() + "\", ";
            }
            if( getExplode() != null ){
            result += "\"explode\": " + getExplode() + ", ";
            }
            if( getAllowReserved() != null ){
            result += "\"allowReserved\": " + getAllowReserved() + ", ";
            }
            if( hasSchema() ){
            result += "\"schema\": " + getSchema() + ", ";
            }
            if( getExample() != null ){
            result += "\"example\": " + getExample() + ", ";
            }
            if( getNumExamplesTuple() != 0 ){
            result += "\"examples\": { ";
            for( ExamplesTuple e : getExamplesTuples() ){
            result += e.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " }, ";
            }
            if( getNumContentTuple() != 0 ){
            result += "\"content\": { ";
            for( ContentTuple c : getContentTuples() ){
            result += c.print() + ", ";
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
