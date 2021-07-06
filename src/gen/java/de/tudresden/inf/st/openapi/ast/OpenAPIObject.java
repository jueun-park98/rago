/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:2
 * @astdecl OpenAPIObject : ASTNode ::= <OpenAPI:String> InfoObject ServerObject* PathsObject [ComponentsObject] SecurityRequirementObject* TagObject* [ExternalDocumentationObject];
 * @production OpenAPIObject : {@link ASTNode} ::= <span class="component">&lt;OpenAPI:String&gt;</span> <span class="component">{@link InfoObject}</span> <span class="component">{@link ServerObject}*</span> <span class="component">{@link PathsObject}</span> <span class="component">[{@link ComponentsObject}]</span> <span class="component">{@link SecurityRequirementObject}*</span> <span class="component">{@link TagObject}*</span> <span class="component">[{@link ExternalDocumentationObject}]</span>;

 */
public class OpenAPIObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public OpenAPIObject() {
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
    children = new ASTNode[7];
    setChild(new JastAddList(), 1);
    setChild(new Opt(), 3);
    setChild(new JastAddList(), 4);
    setChild(new JastAddList(), 5);
    setChild(new Opt(), 6);
  }
  /**
   * @declaredat ASTNode:18
   */
  @ASTNodeAnnotation.Constructor(
    name = {"OpenAPI", "InfoObject", "ServerObject", "PathsObject", "ComponentsObject", "SecurityRequirementObject", "TagObject", "ExternalDocumentationObject"},
    type = {"String", "InfoObject", "JastAddList<ServerObject>", "PathsObject", "Opt<ComponentsObject>", "JastAddList<SecurityRequirementObject>", "JastAddList<TagObject>", "Opt<ExternalDocumentationObject>"},
    kind = {"Token", "Child", "List", "Child", "Opt", "List", "List", "Opt"}
  )
  public OpenAPIObject(String p0, InfoObject p1, JastAddList<ServerObject> p2, PathsObject p3, Opt<ComponentsObject> p4, JastAddList<SecurityRequirementObject> p5, JastAddList<TagObject> p6, Opt<ExternalDocumentationObject> p7) {
    setOpenAPI(p0);
    setChild(p1, 0);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
    setChild(p5, 4);
    setChild(p6, 5);
    setChild(p7, 6);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:34
   */
  protected int numChildren() {
    return 7;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:40
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:52
   */
  public OpenAPIObject clone() throws CloneNotSupportedException {
    OpenAPIObject node = (OpenAPIObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:57
   */
  public OpenAPIObject copy() {
    try {
      OpenAPIObject node = (OpenAPIObject) clone();
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
   * @declaredat ASTNode:76
   */
  @Deprecated
  public OpenAPIObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:86
   */
  public OpenAPIObject treeCopyNoTransform() {
    OpenAPIObject tree = (OpenAPIObject) copy();
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
   * @declaredat ASTNode:106
   */
  public OpenAPIObject treeCopy() {
    OpenAPIObject tree = (OpenAPIObject) copy();
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
   * @declaredat ASTNode:120
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_OpenAPI == ((OpenAPIObject) node).tokenString_OpenAPI);    
  }
  /**
   * Replaces the lexeme OpenAPI.
   * @param value The new value for the lexeme OpenAPI.
   * @apilevel high-level
   */
  public void setOpenAPI(String value) {
    tokenString_OpenAPI = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_OpenAPI;
  /**
   * Retrieves the value for the lexeme OpenAPI.
   * @return The value for the lexeme OpenAPI.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="OpenAPI")
  public String getOpenAPI() {
    return tokenString_OpenAPI != null ? tokenString_OpenAPI : "";
  }
  /**
   * Replaces the InfoObject child.
   * @param node The new node to replace the InfoObject child.
   * @apilevel high-level
   */
  public void setInfoObject(InfoObject node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the InfoObject child.
   * @return The current node used as the InfoObject child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="InfoObject")
  public InfoObject getInfoObject() {
    return (InfoObject) getChild(0);
  }
  /**
   * Retrieves the InfoObject child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the InfoObject child.
   * @apilevel low-level
   */
  public InfoObject getInfoObjectNoTransform() {
    return (InfoObject) getChildNoTransform(0);
  }
  /**
   * Replaces the ServerObject list.
   * @param list The new list node to be used as the ServerObject list.
   * @apilevel high-level
   */
  public void setServerObjectList(JastAddList<ServerObject> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the ServerObject list.
   * @return Number of children in the ServerObject list.
   * @apilevel high-level
   */
  public int getNumServerObject() {
    return getServerObjectList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ServerObject list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the ServerObject list.
   * @apilevel low-level
   */
  public int getNumServerObjectNoTransform() {
    return getServerObjectListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ServerObject list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ServerObject list.
   * @apilevel high-level
   */
  public ServerObject getServerObject(int i) {
    return (ServerObject) getServerObjectList().getChild(i);
  }
  /**
   * Check whether the ServerObject list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasServerObject() {
    return getServerObjectList().getNumChild() != 0;
  }
  /**
   * Append an element to the ServerObject list.
   * @param node The element to append to the ServerObject list.
   * @apilevel high-level
   */
  public void addServerObject(ServerObject node) {
    JastAddList<ServerObject> list = (parent == null) ? getServerObjectListNoTransform() : getServerObjectList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addServerObjectNoTransform(ServerObject node) {
    JastAddList<ServerObject> list = getServerObjectListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ServerObject list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setServerObject(ServerObject node, int i) {
    JastAddList<ServerObject> list = getServerObjectList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ServerObject list.
   * @return The node representing the ServerObject list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="ServerObject")
  public JastAddList<ServerObject> getServerObjectList() {
    JastAddList<ServerObject> list = (JastAddList<ServerObject>) getChild(1);
    return list;
  }
  /**
   * Retrieves the ServerObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerObject list.
   * @apilevel low-level
   */
  public JastAddList<ServerObject> getServerObjectListNoTransform() {
    return (JastAddList<ServerObject>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the ServerObject list without
   * triggering rewrites.
   */
  public ServerObject getServerObjectNoTransform(int i) {
    return (ServerObject) getServerObjectListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the ServerObject list.
   * @return The node representing the ServerObject list.
   * @apilevel high-level
   */
  public JastAddList<ServerObject> getServerObjects() {
    return getServerObjectList();
  }
  /**
   * Retrieves the ServerObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerObject list.
   * @apilevel low-level
   */
  public JastAddList<ServerObject> getServerObjectsNoTransform() {
    return getServerObjectListNoTransform();
  }
  /**
   * Replaces the PathsObject child.
   * @param node The new node to replace the PathsObject child.
   * @apilevel high-level
   */
  public void setPathsObject(PathsObject node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the PathsObject child.
   * @return The current node used as the PathsObject child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="PathsObject")
  public PathsObject getPathsObject() {
    return (PathsObject) getChild(2);
  }
  /**
   * Retrieves the PathsObject child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the PathsObject child.
   * @apilevel low-level
   */
  public PathsObject getPathsObjectNoTransform() {
    return (PathsObject) getChildNoTransform(2);
  }
  /**
   * Replaces the optional node for the ComponentsObject child. This is the <code>Opt</code>
   * node containing the child ComponentsObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ComponentsObject child.
   * @apilevel low-level
   */
  public void setComponentsObjectOpt(Opt<ComponentsObject> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) ComponentsObject child.
   * @param node The new node to be used as the ComponentsObject child.
   * @apilevel high-level
   */
  public void setComponentsObject(ComponentsObject node) {
    getComponentsObjectOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional ComponentsObject child exists.
   * @return {@code true} if the optional ComponentsObject child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasComponentsObject() {
    return getComponentsObjectOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ComponentsObject child.
   * @return The ComponentsObject child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public ComponentsObject getComponentsObject() {
    return (ComponentsObject) getComponentsObjectOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the ComponentsObject child. This is the <code>Opt</code> node containing the child ComponentsObject, not the actual child!
   * @return The optional node for child the ComponentsObject child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="ComponentsObject")
  public Opt<ComponentsObject> getComponentsObjectOpt() {
    return (Opt<ComponentsObject>) getChild(3);
  }
  /**
   * Retrieves the optional node for child ComponentsObject. This is the <code>Opt</code> node containing the child ComponentsObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ComponentsObject.
   * @apilevel low-level
   */
  public Opt<ComponentsObject> getComponentsObjectOptNoTransform() {
    return (Opt<ComponentsObject>) getChildNoTransform(3);
  }
  /**
   * Replaces the SecurityRequirementObject list.
   * @param list The new list node to be used as the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public void setSecurityRequirementObjectList(JastAddList<SecurityRequirementObject> list) {
    setChild(list, 4);
  }
  /**
   * Retrieves the number of children in the SecurityRequirementObject list.
   * @return Number of children in the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public int getNumSecurityRequirementObject() {
    return getSecurityRequirementObjectList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SecurityRequirementObject list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SecurityRequirementObject list.
   * @apilevel low-level
   */
  public int getNumSecurityRequirementObjectNoTransform() {
    return getSecurityRequirementObjectListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SecurityRequirementObject list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public SecurityRequirementObject getSecurityRequirementObject(int i) {
    return (SecurityRequirementObject) getSecurityRequirementObjectList().getChild(i);
  }
  /**
   * Check whether the SecurityRequirementObject list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSecurityRequirementObject() {
    return getSecurityRequirementObjectList().getNumChild() != 0;
  }
  /**
   * Append an element to the SecurityRequirementObject list.
   * @param node The element to append to the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public void addSecurityRequirementObject(SecurityRequirementObject node) {
    JastAddList<SecurityRequirementObject> list = (parent == null) ? getSecurityRequirementObjectListNoTransform() : getSecurityRequirementObjectList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSecurityRequirementObjectNoTransform(SecurityRequirementObject node) {
    JastAddList<SecurityRequirementObject> list = getSecurityRequirementObjectListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SecurityRequirementObject list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSecurityRequirementObject(SecurityRequirementObject node, int i) {
    JastAddList<SecurityRequirementObject> list = getSecurityRequirementObjectList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SecurityRequirementObject list.
   * @return The node representing the SecurityRequirementObject list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SecurityRequirementObject")
  public JastAddList<SecurityRequirementObject> getSecurityRequirementObjectList() {
    JastAddList<SecurityRequirementObject> list = (JastAddList<SecurityRequirementObject>) getChild(4);
    return list;
  }
  /**
   * Retrieves the SecurityRequirementObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecurityRequirementObject list.
   * @apilevel low-level
   */
  public JastAddList<SecurityRequirementObject> getSecurityRequirementObjectListNoTransform() {
    return (JastAddList<SecurityRequirementObject>) getChildNoTransform(4);
  }
  /**
   * @return the element at index {@code i} in the SecurityRequirementObject list without
   * triggering rewrites.
   */
  public SecurityRequirementObject getSecurityRequirementObjectNoTransform(int i) {
    return (SecurityRequirementObject) getSecurityRequirementObjectListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the SecurityRequirementObject list.
   * @return The node representing the SecurityRequirementObject list.
   * @apilevel high-level
   */
  public JastAddList<SecurityRequirementObject> getSecurityRequirementObjects() {
    return getSecurityRequirementObjectList();
  }
  /**
   * Retrieves the SecurityRequirementObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecurityRequirementObject list.
   * @apilevel low-level
   */
  public JastAddList<SecurityRequirementObject> getSecurityRequirementObjectsNoTransform() {
    return getSecurityRequirementObjectListNoTransform();
  }
  /**
   * Replaces the TagObject list.
   * @param list The new list node to be used as the TagObject list.
   * @apilevel high-level
   */
  public void setTagObjectList(JastAddList<TagObject> list) {
    setChild(list, 5);
  }
  /**
   * Retrieves the number of children in the TagObject list.
   * @return Number of children in the TagObject list.
   * @apilevel high-level
   */
  public int getNumTagObject() {
    return getTagObjectList().getNumChild();
  }
  /**
   * Retrieves the number of children in the TagObject list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the TagObject list.
   * @apilevel low-level
   */
  public int getNumTagObjectNoTransform() {
    return getTagObjectListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the TagObject list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the TagObject list.
   * @apilevel high-level
   */
  public TagObject getTagObject(int i) {
    return (TagObject) getTagObjectList().getChild(i);
  }
  /**
   * Check whether the TagObject list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasTagObject() {
    return getTagObjectList().getNumChild() != 0;
  }
  /**
   * Append an element to the TagObject list.
   * @param node The element to append to the TagObject list.
   * @apilevel high-level
   */
  public void addTagObject(TagObject node) {
    JastAddList<TagObject> list = (parent == null) ? getTagObjectListNoTransform() : getTagObjectList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addTagObjectNoTransform(TagObject node) {
    JastAddList<TagObject> list = getTagObjectListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the TagObject list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setTagObject(TagObject node, int i) {
    JastAddList<TagObject> list = getTagObjectList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the TagObject list.
   * @return The node representing the TagObject list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="TagObject")
  public JastAddList<TagObject> getTagObjectList() {
    JastAddList<TagObject> list = (JastAddList<TagObject>) getChild(5);
    return list;
  }
  /**
   * Retrieves the TagObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TagObject list.
   * @apilevel low-level
   */
  public JastAddList<TagObject> getTagObjectListNoTransform() {
    return (JastAddList<TagObject>) getChildNoTransform(5);
  }
  /**
   * @return the element at index {@code i} in the TagObject list without
   * triggering rewrites.
   */
  public TagObject getTagObjectNoTransform(int i) {
    return (TagObject) getTagObjectListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the TagObject list.
   * @return The node representing the TagObject list.
   * @apilevel high-level
   */
  public JastAddList<TagObject> getTagObjects() {
    return getTagObjectList();
  }
  /**
   * Retrieves the TagObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TagObject list.
   * @apilevel low-level
   */
  public JastAddList<TagObject> getTagObjectsNoTransform() {
    return getTagObjectListNoTransform();
  }
  /**
   * Replaces the optional node for the ExternalDocumentationObject child. This is the <code>Opt</code>
   * node containing the child ExternalDocumentationObject, not the actual child!
   * @param opt The new node to be used as the optional node for the ExternalDocumentationObject child.
   * @apilevel low-level
   */
  public void setExternalDocumentationObjectOpt(Opt<ExternalDocumentationObject> opt) {
    setChild(opt, 6);
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
    return (Opt<ExternalDocumentationObject>) getChild(6);
  }
  /**
   * Retrieves the optional node for child ExternalDocumentationObject. This is the <code>Opt</code> node containing the child ExternalDocumentationObject, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ExternalDocumentationObject.
   * @apilevel low-level
   */
  public Opt<ExternalDocumentationObject> getExternalDocumentationObjectOptNoTransform() {
    return (Opt<ExternalDocumentationObject>) getChildNoTransform(6);
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
          String result =
            "{ \"openapi\": \"" + getOpenAPI() + "\", " +
            "\"info\": " + getInfoObject().print() + ", ";
    
          if( getNumServerObject() != 0 ){
            result += "\"servers\": [ ";
            for( ServerObject s : getServerObjects() ){
              result += s.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " ], ";
          }
          result += "\"paths\": \"" + getPathsObject().print() + ", ";
          if( hasComponentsObject() ){
            result += "\"components\": \"" + getComponentsObject().print() + ", ";
          }
          if( getNumSecurityRequirementObject() != 0 ){
            result += "\"security\": [ ";
            for( SecurityRequirementObject s : getSecurityRequirementObjects() ){
              result += s.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " ], ";
          }
          if( getNumTagObject() != 0 ){
            result += "\"tags\": [ ";
            for( TagObject t : getTagObjects() ){
            result += t.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " ], ";
            }
          if( hasExternalDocumentationObject() ){
            result += "\"externalDocs\": \"" + getExternalDocumentationObject().print() + ", ";
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
