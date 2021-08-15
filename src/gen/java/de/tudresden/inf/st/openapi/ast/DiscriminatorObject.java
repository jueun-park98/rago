/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.core.model.reference.Reference;
import org.openapi4j.core.model.OAIContext;
import java.io.IOException;
import java.util.*;
import java.net.URL;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:103
 * @astdecl DiscriminatorObject : ASTNode ::= <PropertyName:String> MappingTuple*;
 * @production DiscriminatorObject : {@link ASTNode} ::= <span class="component">&lt;PropertyName:String&gt;</span> <span class="component">{@link MappingTuple}*</span>;

 */
public class DiscriminatorObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:698
   */
  public static Discriminator composeDiscriminator (DiscriminatorObject discriminatorObject) {
        Discriminator discriminator = new Discriminator();

        if( !discriminatorObject.getPropertyName().isEmpty() )
        discriminator.setPropertyName(discriminatorObject.getPropertyName());
        if( discriminatorObject.getNumMappingTuple() != 0 ){
        Map<String, String> mapping = new HashMap<>();
        for( MappingTuple m : discriminatorObject.getMappingTuples() )
        mapping.put(m.getKey(), m.getValue());
        discriminator.setMapping(mapping);
        }

        return discriminator;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:724
   */
  public static DiscriminatorObject parseDiscriminator (Discriminator discriminator) {
        DiscriminatorObject discriminatorObject = new DiscriminatorObject();

        if( discriminator.getPropertyName() != null )
        discriminatorObject.setPropertyName(discriminator.getPropertyName());
        if( discriminator.getMapping() != null ){
        MappingTuple mapping = new MappingTuple();
        for( String key : discriminator.getMapping().keySet() ){
        mapping.setKey(key);
        mapping.setValue(discriminator.getMapping().get(key));
        discriminatorObject.addMappingTuple(mapping);
        }
        }

        return discriminatorObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public DiscriminatorObject() {
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
    name = {"PropertyName", "MappingTuple"},
    type = {"String", "JastAddList<MappingTuple>"},
    kind = {"Token", "List"}
  )
  public DiscriminatorObject(String p0, JastAddList<MappingTuple> p1) {
    setPropertyName(p0);
    setChild(p1, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:30
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:34
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:42
   */
  public DiscriminatorObject clone() throws CloneNotSupportedException {
    DiscriminatorObject node = (DiscriminatorObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public DiscriminatorObject copy() {
    try {
      DiscriminatorObject node = (DiscriminatorObject) clone();
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
   * @declaredat ASTNode:66
   */
  @Deprecated
  public DiscriminatorObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public DiscriminatorObject treeCopyNoTransform() {
    DiscriminatorObject tree = (DiscriminatorObject) copy();
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
   * @declaredat ASTNode:96
   */
  public DiscriminatorObject treeCopy() {
    DiscriminatorObject tree = (DiscriminatorObject) copy();
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
   * @declaredat ASTNode:110
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_PropertyName == ((DiscriminatorObject) node).tokenString_PropertyName);    
  }
  /**
   * Replaces the lexeme PropertyName.
   * @param value The new value for the lexeme PropertyName.
   * @apilevel high-level
   */
  public void setPropertyName(String value) {
    tokenString_PropertyName = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_PropertyName;
  /**
   * Retrieves the value for the lexeme PropertyName.
   * @return The value for the lexeme PropertyName.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="PropertyName")
  public String getPropertyName() {
    return tokenString_PropertyName != null ? tokenString_PropertyName : "";
  }
  /**
   * Replaces the MappingTuple list.
   * @param list The new list node to be used as the MappingTuple list.
   * @apilevel high-level
   */
  public void setMappingTupleList(JastAddList<MappingTuple> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the MappingTuple list.
   * @return Number of children in the MappingTuple list.
   * @apilevel high-level
   */
  public int getNumMappingTuple() {
    return getMappingTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the MappingTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the MappingTuple list.
   * @apilevel low-level
   */
  public int getNumMappingTupleNoTransform() {
    return getMappingTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the MappingTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the MappingTuple list.
   * @apilevel high-level
   */
  public MappingTuple getMappingTuple(int i) {
    return (MappingTuple) getMappingTupleList().getChild(i);
  }
  /**
   * Check whether the MappingTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasMappingTuple() {
    return getMappingTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the MappingTuple list.
   * @param node The element to append to the MappingTuple list.
   * @apilevel high-level
   */
  public void addMappingTuple(MappingTuple node) {
    JastAddList<MappingTuple> list = (parent == null) ? getMappingTupleListNoTransform() : getMappingTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addMappingTupleNoTransform(MappingTuple node) {
    JastAddList<MappingTuple> list = getMappingTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the MappingTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setMappingTuple(MappingTuple node, int i) {
    JastAddList<MappingTuple> list = getMappingTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the MappingTuple list.
   * @return The node representing the MappingTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="MappingTuple")
  public JastAddList<MappingTuple> getMappingTupleList() {
    JastAddList<MappingTuple> list = (JastAddList<MappingTuple>) getChild(0);
    return list;
  }
  /**
   * Retrieves the MappingTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the MappingTuple list.
   * @apilevel low-level
   */
  public JastAddList<MappingTuple> getMappingTupleListNoTransform() {
    return (JastAddList<MappingTuple>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the MappingTuple list without
   * triggering rewrites.
   */
  public MappingTuple getMappingTupleNoTransform(int i) {
    return (MappingTuple) getMappingTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the MappingTuple list.
   * @return The node representing the MappingTuple list.
   * @apilevel high-level
   */
  public JastAddList<MappingTuple> getMappingTuples() {
    return getMappingTupleList();
  }
  /**
   * Retrieves the MappingTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the MappingTuple list.
   * @apilevel low-level
   */
  public JastAddList<MappingTuple> getMappingTuplesNoTransform() {
    return getMappingTupleListNoTransform();
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
