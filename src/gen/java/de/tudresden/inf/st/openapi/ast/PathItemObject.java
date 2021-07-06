/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:60
 * @astdecl PathItemObject : ASTNode ::= <Ref:String> <Summary:String> <Description:String> [Get] [Put] [Post] [Delete] [Options] [Head] [Patch] [Trace] ServerObject* Parameter*;
 * @production PathItemObject : {@link ASTNode} ::= <span class="component">&lt;Ref:String&gt;</span> <span class="component">&lt;Summary:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">[{@link Get}]</span> <span class="component">[{@link Put}]</span> <span class="component">[{@link Post}]</span> <span class="component">[{@link Delete}]</span> <span class="component">[{@link Options}]</span> <span class="component">[{@link Head}]</span> <span class="component">[{@link Patch}]</span> <span class="component">[{@link Trace}]</span> <span class="component">{@link ServerObject}*</span> <span class="component">{@link Parameter}*</span>;

 */
public class PathItemObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public PathItemObject() {
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
    children = new ASTNode[10];
    setChild(new Opt(), 0);
    setChild(new Opt(), 1);
    setChild(new Opt(), 2);
    setChild(new Opt(), 3);
    setChild(new Opt(), 4);
    setChild(new Opt(), 5);
    setChild(new Opt(), 6);
    setChild(new Opt(), 7);
    setChild(new JastAddList(), 8);
    setChild(new JastAddList(), 9);
  }
  /**
   * @declaredat ASTNode:23
   */
  @ASTNodeAnnotation.Constructor(
    name = {"Ref", "Summary", "Description", "Get", "Put", "Post", "Delete", "Options", "Head", "Patch", "Trace", "ServerObject", "Parameter"},
    type = {"String", "String", "String", "Opt<Get>", "Opt<Put>", "Opt<Post>", "Opt<Delete>", "Opt<Options>", "Opt<Head>", "Opt<Patch>", "Opt<Trace>", "JastAddList<ServerObject>", "JastAddList<Parameter>"},
    kind = {"Token", "Token", "Token", "Opt", "Opt", "Opt", "Opt", "Opt", "Opt", "Opt", "Opt", "List", "List"}
  )
  public PathItemObject(String p0, String p1, String p2, Opt<Get> p3, Opt<Put> p4, Opt<Post> p5, Opt<Delete> p6, Opt<Options> p7, Opt<Head> p8, Opt<Patch> p9, Opt<Trace> p10, JastAddList<ServerObject> p11, JastAddList<Parameter> p12) {
    setRef(p0);
    setSummary(p1);
    setDescription(p2);
    setChild(p3, 0);
    setChild(p4, 1);
    setChild(p5, 2);
    setChild(p6, 3);
    setChild(p7, 4);
    setChild(p8, 5);
    setChild(p9, 6);
    setChild(p10, 7);
    setChild(p11, 8);
    setChild(p12, 9);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:44
   */
  protected int numChildren() {
    return 10;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:50
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:54
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:58
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:62
   */
  public PathItemObject clone() throws CloneNotSupportedException {
    PathItemObject node = (PathItemObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:67
   */
  public PathItemObject copy() {
    try {
      PathItemObject node = (PathItemObject) clone();
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
   * @declaredat ASTNode:86
   */
  @Deprecated
  public PathItemObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:96
   */
  public PathItemObject treeCopyNoTransform() {
    PathItemObject tree = (PathItemObject) copy();
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
   * @declaredat ASTNode:116
   */
  public PathItemObject treeCopy() {
    PathItemObject tree = (PathItemObject) copy();
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
   * @declaredat ASTNode:130
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Ref == ((PathItemObject) node).tokenString_Ref) && (tokenString_Summary == ((PathItemObject) node).tokenString_Summary) && (tokenString_Description == ((PathItemObject) node).tokenString_Description);    
  }
  /**
   * Replaces the lexeme Ref.
   * @param value The new value for the lexeme Ref.
   * @apilevel high-level
   */
  public void setRef(String value) {
    tokenString_Ref = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Ref;
  /**
   * Retrieves the value for the lexeme Ref.
   * @return The value for the lexeme Ref.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Ref")
  public String getRef() {
    return tokenString_Ref != null ? tokenString_Ref : "";
  }
  /**
   * Replaces the lexeme Summary.
   * @param value The new value for the lexeme Summary.
   * @apilevel high-level
   */
  public void setSummary(String value) {
    tokenString_Summary = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Summary;
  /**
   * Retrieves the value for the lexeme Summary.
   * @return The value for the lexeme Summary.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Summary")
  public String getSummary() {
    return tokenString_Summary != null ? tokenString_Summary : "";
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
   * Replaces the optional node for the Get child. This is the <code>Opt</code>
   * node containing the child Get, not the actual child!
   * @param opt The new node to be used as the optional node for the Get child.
   * @apilevel low-level
   */
  public void setGetOpt(Opt<Get> opt) {
    setChild(opt, 0);
  }
  /**
   * Replaces the (optional) Get child.
   * @param node The new node to be used as the Get child.
   * @apilevel high-level
   */
  public void setGet(Get node) {
    getGetOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Get child exists.
   * @return {@code true} if the optional Get child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasGet() {
    return getGetOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Get child.
   * @return The Get child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Get getGet() {
    return (Get) getGetOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Get child. This is the <code>Opt</code> node containing the child Get, not the actual child!
   * @return The optional node for child the Get child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Get")
  public Opt<Get> getGetOpt() {
    return (Opt<Get>) getChild(0);
  }
  /**
   * Retrieves the optional node for child Get. This is the <code>Opt</code> node containing the child Get, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Get.
   * @apilevel low-level
   */
  public Opt<Get> getGetOptNoTransform() {
    return (Opt<Get>) getChildNoTransform(0);
  }
  /**
   * Replaces the optional node for the Put child. This is the <code>Opt</code>
   * node containing the child Put, not the actual child!
   * @param opt The new node to be used as the optional node for the Put child.
   * @apilevel low-level
   */
  public void setPutOpt(Opt<Put> opt) {
    setChild(opt, 1);
  }
  /**
   * Replaces the (optional) Put child.
   * @param node The new node to be used as the Put child.
   * @apilevel high-level
   */
  public void setPut(Put node) {
    getPutOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Put child exists.
   * @return {@code true} if the optional Put child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasPut() {
    return getPutOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Put child.
   * @return The Put child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Put getPut() {
    return (Put) getPutOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Put child. This is the <code>Opt</code> node containing the child Put, not the actual child!
   * @return The optional node for child the Put child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Put")
  public Opt<Put> getPutOpt() {
    return (Opt<Put>) getChild(1);
  }
  /**
   * Retrieves the optional node for child Put. This is the <code>Opt</code> node containing the child Put, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Put.
   * @apilevel low-level
   */
  public Opt<Put> getPutOptNoTransform() {
    return (Opt<Put>) getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the Post child. This is the <code>Opt</code>
   * node containing the child Post, not the actual child!
   * @param opt The new node to be used as the optional node for the Post child.
   * @apilevel low-level
   */
  public void setPostOpt(Opt<Post> opt) {
    setChild(opt, 2);
  }
  /**
   * Replaces the (optional) Post child.
   * @param node The new node to be used as the Post child.
   * @apilevel high-level
   */
  public void setPost(Post node) {
    getPostOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Post child exists.
   * @return {@code true} if the optional Post child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasPost() {
    return getPostOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Post child.
   * @return The Post child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Post getPost() {
    return (Post) getPostOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Post child. This is the <code>Opt</code> node containing the child Post, not the actual child!
   * @return The optional node for child the Post child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Post")
  public Opt<Post> getPostOpt() {
    return (Opt<Post>) getChild(2);
  }
  /**
   * Retrieves the optional node for child Post. This is the <code>Opt</code> node containing the child Post, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Post.
   * @apilevel low-level
   */
  public Opt<Post> getPostOptNoTransform() {
    return (Opt<Post>) getChildNoTransform(2);
  }
  /**
   * Replaces the optional node for the Delete child. This is the <code>Opt</code>
   * node containing the child Delete, not the actual child!
   * @param opt The new node to be used as the optional node for the Delete child.
   * @apilevel low-level
   */
  public void setDeleteOpt(Opt<Delete> opt) {
    setChild(opt, 3);
  }
  /**
   * Replaces the (optional) Delete child.
   * @param node The new node to be used as the Delete child.
   * @apilevel high-level
   */
  public void setDelete(Delete node) {
    getDeleteOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Delete child exists.
   * @return {@code true} if the optional Delete child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasDelete() {
    return getDeleteOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Delete child.
   * @return The Delete child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Delete getDelete() {
    return (Delete) getDeleteOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Delete child. This is the <code>Opt</code> node containing the child Delete, not the actual child!
   * @return The optional node for child the Delete child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Delete")
  public Opt<Delete> getDeleteOpt() {
    return (Opt<Delete>) getChild(3);
  }
  /**
   * Retrieves the optional node for child Delete. This is the <code>Opt</code> node containing the child Delete, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Delete.
   * @apilevel low-level
   */
  public Opt<Delete> getDeleteOptNoTransform() {
    return (Opt<Delete>) getChildNoTransform(3);
  }
  /**
   * Replaces the optional node for the Options child. This is the <code>Opt</code>
   * node containing the child Options, not the actual child!
   * @param opt The new node to be used as the optional node for the Options child.
   * @apilevel low-level
   */
  public void setOptionsOpt(Opt<Options> opt) {
    setChild(opt, 4);
  }
  /**
   * Replaces the (optional) Options child.
   * @param node The new node to be used as the Options child.
   * @apilevel high-level
   */
  public void setOptions(Options node) {
    getOptionsOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Options child exists.
   * @return {@code true} if the optional Options child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasOptions() {
    return getOptionsOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Options child.
   * @return The Options child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Options getOptions() {
    return (Options) getOptionsOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Options child. This is the <code>Opt</code> node containing the child Options, not the actual child!
   * @return The optional node for child the Options child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Options")
  public Opt<Options> getOptionsOpt() {
    return (Opt<Options>) getChild(4);
  }
  /**
   * Retrieves the optional node for child Options. This is the <code>Opt</code> node containing the child Options, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Options.
   * @apilevel low-level
   */
  public Opt<Options> getOptionsOptNoTransform() {
    return (Opt<Options>) getChildNoTransform(4);
  }
  /**
   * Replaces the optional node for the Head child. This is the <code>Opt</code>
   * node containing the child Head, not the actual child!
   * @param opt The new node to be used as the optional node for the Head child.
   * @apilevel low-level
   */
  public void setHeadOpt(Opt<Head> opt) {
    setChild(opt, 5);
  }
  /**
   * Replaces the (optional) Head child.
   * @param node The new node to be used as the Head child.
   * @apilevel high-level
   */
  public void setHead(Head node) {
    getHeadOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Head child exists.
   * @return {@code true} if the optional Head child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasHead() {
    return getHeadOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Head child.
   * @return The Head child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Head getHead() {
    return (Head) getHeadOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Head child. This is the <code>Opt</code> node containing the child Head, not the actual child!
   * @return The optional node for child the Head child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Head")
  public Opt<Head> getHeadOpt() {
    return (Opt<Head>) getChild(5);
  }
  /**
   * Retrieves the optional node for child Head. This is the <code>Opt</code> node containing the child Head, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Head.
   * @apilevel low-level
   */
  public Opt<Head> getHeadOptNoTransform() {
    return (Opt<Head>) getChildNoTransform(5);
  }
  /**
   * Replaces the optional node for the Patch child. This is the <code>Opt</code>
   * node containing the child Patch, not the actual child!
   * @param opt The new node to be used as the optional node for the Patch child.
   * @apilevel low-level
   */
  public void setPatchOpt(Opt<Patch> opt) {
    setChild(opt, 6);
  }
  /**
   * Replaces the (optional) Patch child.
   * @param node The new node to be used as the Patch child.
   * @apilevel high-level
   */
  public void setPatch(Patch node) {
    getPatchOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Patch child exists.
   * @return {@code true} if the optional Patch child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasPatch() {
    return getPatchOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Patch child.
   * @return The Patch child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Patch getPatch() {
    return (Patch) getPatchOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Patch child. This is the <code>Opt</code> node containing the child Patch, not the actual child!
   * @return The optional node for child the Patch child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Patch")
  public Opt<Patch> getPatchOpt() {
    return (Opt<Patch>) getChild(6);
  }
  /**
   * Retrieves the optional node for child Patch. This is the <code>Opt</code> node containing the child Patch, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Patch.
   * @apilevel low-level
   */
  public Opt<Patch> getPatchOptNoTransform() {
    return (Opt<Patch>) getChildNoTransform(6);
  }
  /**
   * Replaces the optional node for the Trace child. This is the <code>Opt</code>
   * node containing the child Trace, not the actual child!
   * @param opt The new node to be used as the optional node for the Trace child.
   * @apilevel low-level
   */
  public void setTraceOpt(Opt<Trace> opt) {
    setChild(opt, 7);
  }
  /**
   * Replaces the (optional) Trace child.
   * @param node The new node to be used as the Trace child.
   * @apilevel high-level
   */
  public void setTrace(Trace node) {
    getTraceOpt().setChild(node, 0);
  }
  /**
   * Check whether the optional Trace child exists.
   * @return {@code true} if the optional Trace child exists, {@code false} if it does not.
   * @apilevel high-level
   */
  public boolean hasTrace() {
    return getTraceOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Trace child.
   * @return The Trace child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   */
  public Trace getTrace() {
    return (Trace) getTraceOpt().getChild(0);
  }
  /**
   * Retrieves the optional node for the Trace child. This is the <code>Opt</code> node containing the child Trace, not the actual child!
   * @return The optional node for child the Trace child.
   * @apilevel low-level
   */
  @ASTNodeAnnotation.OptChild(name="Trace")
  public Opt<Trace> getTraceOpt() {
    return (Opt<Trace>) getChild(7);
  }
  /**
   * Retrieves the optional node for child Trace. This is the <code>Opt</code> node containing the child Trace, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Trace.
   * @apilevel low-level
   */
  public Opt<Trace> getTraceOptNoTransform() {
    return (Opt<Trace>) getChildNoTransform(7);
  }
  /**
   * Replaces the ServerObject list.
   * @param list The new list node to be used as the ServerObject list.
   * @apilevel high-level
   */
  public void setServerObjectList(JastAddList<ServerObject> list) {
    setChild(list, 8);
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
    JastAddList<ServerObject> list = (JastAddList<ServerObject>) getChild(8);
    return list;
  }
  /**
   * Retrieves the ServerObject list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ServerObject list.
   * @apilevel low-level
   */
  public JastAddList<ServerObject> getServerObjectListNoTransform() {
    return (JastAddList<ServerObject>) getChildNoTransform(8);
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
   * Replaces the Parameter list.
   * @param list The new list node to be used as the Parameter list.
   * @apilevel high-level
   */
  public void setParameterList(JastAddList<Parameter> list) {
    setChild(list, 9);
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * @return Number of children in the Parameter list.
   * @apilevel high-level
   */
  public int getNumParameter() {
    return getParameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Parameter list.
   * @apilevel low-level
   */
  public int getNumParameterNoTransform() {
    return getParameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Parameter list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Parameter list.
   * @apilevel high-level
   */
  public Parameter getParameter(int i) {
    return (Parameter) getParameterList().getChild(i);
  }
  /**
   * Check whether the Parameter list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParameter() {
    return getParameterList().getNumChild() != 0;
  }
  /**
   * Append an element to the Parameter list.
   * @param node The element to append to the Parameter list.
   * @apilevel high-level
   */
  public void addParameter(Parameter node) {
    JastAddList<Parameter> list = (parent == null) ? getParameterListNoTransform() : getParameterList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addParameterNoTransform(Parameter node) {
    JastAddList<Parameter> list = getParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Parameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParameter(Parameter node, int i) {
    JastAddList<Parameter> list = getParameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Parameter")
  public JastAddList<Parameter> getParameterList() {
    JastAddList<Parameter> list = (JastAddList<Parameter>) getChild(9);
    return list;
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   */
  public JastAddList<Parameter> getParameterListNoTransform() {
    return (JastAddList<Parameter>) getChildNoTransform(9);
  }
  /**
   * @return the element at index {@code i} in the Parameter list without
   * triggering rewrites.
   */
  public Parameter getParameterNoTransform(int i) {
    return (Parameter) getParameterListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   */
  public JastAddList<Parameter> getParameters() {
    return getParameterList();
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   */
  public JastAddList<Parameter> getParametersNoTransform() {
    return getParameterListNoTransform();
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
    
            if( !getRef().isEmpty() ){
            result += "\"$ref\": \"" + getRef() + "\", ";
            }
            if( !getSummary().isEmpty() ){
            result += "\"summary\": \"" + getSummary() + "\", ";
            }
            if( !getDescription().isEmpty() ){
            result += "\"description\": \"" + getDescription() + "\", ";
            }
            if( hasGet() ){
            result += "\"get\": \"" + getGet() + "\", ";
            }
            if( hasPut() ){
            result += "\"put\": \"" + getPut() + "\", ";
            }
            if( hasPost() ){
            result += "\"post\": \"" + getPost() + "\", ";
            }
            if( hasDelete() ){
            result += "\"delete\": \"" + getDelete() + "\", ";
            }
            if( hasOptions() ){
            result += "\"options\": \"" + getOptions() + "\", ";
            }
            if( hasHead() ){
            result += "\"head\": \"" + getHead() + "\", ";
            }
            if( hasPatch() ){
            result += "\"patch\": \"" + getPatch() + "\", ";
            }
            if( hasTrace() ){
            result += "\"trace\": \"" + getTrace() + "\", ";
            }
            if( getNumParameter() != 0 ){
            result += "\"parameters\": [ ";
            for( Parameter p : getParameters() ){
            result += p.print() + ", ";
            }
            result = result.substring(0, result.length() - 2) + " ], ";
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
