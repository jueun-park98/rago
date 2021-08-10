/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package de.tudresden.inf.st.openapi.ast;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.model.v3.*;
import java.io.IOException;
import java.util.*;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:6
 * @astdecl SecurityRequirementObject : ASTNode ::= SecurityRequirementTuple*;
 * @production SecurityRequirementObject : {@link ASTNode} ::= <span class="component">{@link SecurityRequirementTuple}*</span>;

 */
public class SecurityRequirementObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:660
   */
  public static SecurityRequirement composeSecurityRequiremnet (SecurityRequirementObject securityRequirementObject){
        SecurityRequirement securityRequirement = new SecurityRequirement();

        if( securityRequirementObject.getNumSecurityRequirementTuple() != 0 ){
        Map<String, List<String>> requirements = new HashMap<>();
        for( SecurityRequirementTuple t : securityRequirementObject.getSecurityRequirementTuples() ){
        List<String> values = new ArrayList<>();
        for( SecurityRequirementValue v : t.getSecurityRequirementValues() )
        values.add(v.getValue());
        requirements.put(t.getName(), values);
        }
        securityRequirement.setRequirements(requirements);
        }

        return securityRequirement;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:745
   */
  public static SecurityRequirementObject parseSecurityRequirement(SecurityRequirement securityRequirement){
        SecurityRequirementObject securityRequirementObject = new SecurityRequirementObject();

        if( securityRequirement.getRequirements() != null ){
        for( String key : securityRequirement.getRequirements().keySet() ){
        JastAddList<SecurityRequirementTuple> tuples = new JastAddList<>();
        for( String v : securityRequirement.getRequirement(key) ) {
        JastAddList<SecurityRequirementValue> values = new JastAddList<>();
        }

        }
        }

        return securityRequirementObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public SecurityRequirementObject() {
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
    name = {"SecurityRequirementTuple"},
    type = {"JastAddList<SecurityRequirementTuple>"},
    kind = {"List"}
  )
  public SecurityRequirementObject(JastAddList<SecurityRequirementTuple> p0) {
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
  public SecurityRequirementObject clone() throws CloneNotSupportedException {
    SecurityRequirementObject node = (SecurityRequirementObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:46
   */
  public SecurityRequirementObject copy() {
    try {
      SecurityRequirementObject node = (SecurityRequirementObject) clone();
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
  public SecurityRequirementObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:75
   */
  public SecurityRequirementObject treeCopyNoTransform() {
    SecurityRequirementObject tree = (SecurityRequirementObject) copy();
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
  public SecurityRequirementObject treeCopy() {
    SecurityRequirementObject tree = (SecurityRequirementObject) copy();
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
   * Replaces the SecurityRequirementTuple list.
   * @param list The new list node to be used as the SecurityRequirementTuple list.
   * @apilevel high-level
   */
  public void setSecurityRequirementTupleList(JastAddList<SecurityRequirementTuple> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the SecurityRequirementTuple list.
   * @return Number of children in the SecurityRequirementTuple list.
   * @apilevel high-level
   */
  public int getNumSecurityRequirementTuple() {
    return getSecurityRequirementTupleList().getNumChild();
  }
  /**
   * Retrieves the number of children in the SecurityRequirementTuple list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the SecurityRequirementTuple list.
   * @apilevel low-level
   */
  public int getNumSecurityRequirementTupleNoTransform() {
    return getSecurityRequirementTupleListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the SecurityRequirementTuple list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the SecurityRequirementTuple list.
   * @apilevel high-level
   */
  public SecurityRequirementTuple getSecurityRequirementTuple(int i) {
    return (SecurityRequirementTuple) getSecurityRequirementTupleList().getChild(i);
  }
  /**
   * Check whether the SecurityRequirementTuple list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasSecurityRequirementTuple() {
    return getSecurityRequirementTupleList().getNumChild() != 0;
  }
  /**
   * Append an element to the SecurityRequirementTuple list.
   * @param node The element to append to the SecurityRequirementTuple list.
   * @apilevel high-level
   */
  public void addSecurityRequirementTuple(SecurityRequirementTuple node) {
    JastAddList<SecurityRequirementTuple> list = (parent == null) ? getSecurityRequirementTupleListNoTransform() : getSecurityRequirementTupleList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addSecurityRequirementTupleNoTransform(SecurityRequirementTuple node) {
    JastAddList<SecurityRequirementTuple> list = getSecurityRequirementTupleListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the SecurityRequirementTuple list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setSecurityRequirementTuple(SecurityRequirementTuple node, int i) {
    JastAddList<SecurityRequirementTuple> list = getSecurityRequirementTupleList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the SecurityRequirementTuple list.
   * @return The node representing the SecurityRequirementTuple list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="SecurityRequirementTuple")
  public JastAddList<SecurityRequirementTuple> getSecurityRequirementTupleList() {
    JastAddList<SecurityRequirementTuple> list = (JastAddList<SecurityRequirementTuple>) getChild(0);
    return list;
  }
  /**
   * Retrieves the SecurityRequirementTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecurityRequirementTuple list.
   * @apilevel low-level
   */
  public JastAddList<SecurityRequirementTuple> getSecurityRequirementTupleListNoTransform() {
    return (JastAddList<SecurityRequirementTuple>) getChildNoTransform(0);
  }
  /**
   * @return the element at index {@code i} in the SecurityRequirementTuple list without
   * triggering rewrites.
   */
  public SecurityRequirementTuple getSecurityRequirementTupleNoTransform(int i) {
    return (SecurityRequirementTuple) getSecurityRequirementTupleListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the SecurityRequirementTuple list.
   * @return The node representing the SecurityRequirementTuple list.
   * @apilevel high-level
   */
  public JastAddList<SecurityRequirementTuple> getSecurityRequirementTuples() {
    return getSecurityRequirementTupleList();
  }
  /**
   * Retrieves the SecurityRequirementTuple list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the SecurityRequirementTuple list.
   * @apilevel low-level
   */
  public JastAddList<SecurityRequirementTuple> getSecurityRequirementTuplesNoTransform() {
    return getSecurityRequirementTupleListNoTransform();
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
