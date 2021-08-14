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
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:78
 * @astdecl ExampleObject : ASTNode ::= <Summary:String> <Description:String> <Value:Object> <ExternalValue:String>;
 * @production ExampleObject : {@link ASTNode} ::= <span class="component">&lt;Summary:String&gt;</span> <span class="component">&lt;Description:String&gt;</span> <span class="component">&lt;Value:Object&gt;</span> <span class="component">&lt;ExternalValue:String&gt;</span>;

 */
public class ExampleObject extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect Composer
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Composer.jadd:507
   */
  public static Example composeExample (ExampleObject exampleObject){
        Example example = new Example();

        if( !exampleObject.getSummary().isEmpty() )
        example.setSummary( exampleObject.getSummary() );
        if( !exampleObject.getDescription().isEmpty() )
        example.setDescription( exampleObject.getDescription() );
        if( exampleObject.getValue() != null )
        example.setValue( exampleObject.getValue() );
        if( !exampleObject.getExternalValue().isEmpty() )
        example.setExternalValue( exampleObject.getExternalValue() );

        return example;
        }
  /**
   * @aspect Parser
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\Parser.jrag:520
   */
  public static ExampleObject parseExample(Example example){
        ExampleObject exampleObject = new ExampleObject();

        if( example.getSummary() != null )
        exampleObject.setSummary( example.getSummary() );
        if( example.getDescription() != null )
        exampleObject.setDescription( example.getDescription() );
        if( example.getValue() != null )
        exampleObject.setValue( example.getValue() );
        if( example.getExternalValue() != null )
        exampleObject.setExternalValue( example.getExternalValue() );

        return exampleObject;
        }
  /**
   * @declaredat ASTNode:1
   */
  public ExampleObject() {
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
    name = {"Summary", "Description", "Value", "ExternalValue"},
    type = {"String", "String", "Object", "String"},
    kind = {"Token", "Token", "Token", "Token"}
  )
  public ExampleObject(String p0, String p1, Object p2, String p3) {
    setSummary(p0);
    setDescription(p1);
    setValue(p2);
    setExternalValue(p3);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:24
   */
  protected int numChildren() {
    return 0;
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
  public ExampleObject clone() throws CloneNotSupportedException {
    ExampleObject node = (ExampleObject) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:47
   */
  public ExampleObject copy() {
    try {
      ExampleObject node = (ExampleObject) clone();
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
  public ExampleObject fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:76
   */
  public ExampleObject treeCopyNoTransform() {
    ExampleObject tree = (ExampleObject) copy();
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
  public ExampleObject treeCopy() {
    ExampleObject tree = (ExampleObject) copy();
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
    return super.is$Equal(node) && (tokenString_Summary == ((ExampleObject) node).tokenString_Summary) && (tokenString_Description == ((ExampleObject) node).tokenString_Description) && (tokenObject_Value == ((ExampleObject) node).tokenObject_Value) && (tokenString_ExternalValue == ((ExampleObject) node).tokenString_ExternalValue);    
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
   * Replaces the lexeme Value.
   * @param value The new value for the lexeme Value.
   * @apilevel high-level
   */
  public void setValue(Object value) {
    tokenObject_Value = value;
  }
  /** @apilevel internal 
   */
  protected Object tokenObject_Value;
  /**
   * Retrieves the value for the lexeme Value.
   * @return The value for the lexeme Value.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Value")
  public Object getValue() {
    return tokenObject_Value;
  }
  /**
   * Replaces the lexeme ExternalValue.
   * @param value The new value for the lexeme ExternalValue.
   * @apilevel high-level
   */
  public void setExternalValue(String value) {
    tokenString_ExternalValue = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_ExternalValue;
  /**
   * Retrieves the value for the lexeme ExternalValue.
   * @return The value for the lexeme ExternalValue.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="ExternalValue")
  public String getExternalValue() {
    return tokenString_ExternalValue != null ? tokenString_ExternalValue : "";
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
