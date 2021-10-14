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
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import org.openapi4j.core.exception.DecodeException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.util.Random;
import java.util.stream.IntStream;
/**
 * @ast node
 * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\OpenAPISpecification.ast:45
 * @astdecl Post : ASTNode ::= OperationObject;
 * @production Post : {@link ASTNode} ::= <span class="component">{@link OperationObject}</span>;

 */
public class Post extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect InferParameter
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:172
   */
  public void connectPOST(String path){
        try{URL url=new URL(path);
        HttpsURLConnection con=(HttpsURLConnection)url.openConnection();

        con.setRequestMethod("POST"); // HTTP POST
        con.setRequestProperty("User-Agent","Mozilla/5.0"); // add request header
        con.setDoOutput(true); // POST

        int responseCode=con.getResponseCode();
        BufferedReader in=new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response=new StringBuffer();

        while((inputLine=in.readLine())!=null){
        response.append(inputLine);
        }
        in.close();

        // print result
        System.out.println("Inferred path : "+path);
        System.out.println("HTTP status code (POST) : "+responseCode);}catch(Exception e){
        System.out.println(e.toString());
        }
        }
  /**
   * @declaredat ASTNode:1
   */
  public Post() {
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
    name = {"OperationObject"},
    type = {"OperationObject"},
    kind = {"Child"}
  )
  public Post(OperationObject p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:22
   */
  protected int numChildren() {
    return 1;
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
  public Post clone() throws CloneNotSupportedException {
    Post node = (Post) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:45
   */
  public Post copy() {
    try {
      Post node = (Post) clone();
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
  public Post fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:74
   */
  public Post treeCopyNoTransform() {
    Post tree = (Post) copy();
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
  public Post treeCopy() {
    Post tree = (Post) copy();
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
    return super.is$Equal(node);    
  }
  /**
   * Replaces the OperationObject child.
   * @param node The new node to replace the OperationObject child.
   * @apilevel high-level
   */
  public void setOperationObject(OperationObject node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the OperationObject child.
   * @return The current node used as the OperationObject child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="OperationObject")
  public OperationObject getOperationObject() {
    return (OperationObject) getChild(0);
  }
  /**
   * Retrieves the OperationObject child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the OperationObject child.
   * @apilevel low-level
   */
  public OperationObject getOperationObjectNoTransform() {
    return (OperationObject) getChildNoTransform(0);
  }
/** @apilevel internal */
protected java.util.Set inferRandomUrl_String_OperationObject_visited;
  /**
   * @attribute syn
   * @aspect InferParameter
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:59
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="InferParameter", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\InferParameter.jrag:59")
  public String inferRandomUrl(String pathRef, OperationObject operationObject) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(pathRef);
    _parameters.add(operationObject);
    if (inferRandomUrl_String_OperationObject_visited == null) inferRandomUrl_String_OperationObject_visited = new java.util.HashSet(4);
    if (inferRandomUrl_String_OperationObject_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Post.inferRandomUrl(String,OperationObject).");
    }
    inferRandomUrl_String_OperationObject_visited.add(_parameters);
    try {
            List<String> paths=new ArrayList<>();
    
            for(ParameterOb o:operationObject.getParameterObs()){
            ParameterObject p=o.parameterObject();
            SchemaObject s=p.getSchemaOb().schemaObject();
    
            // check if the parameter is in type 'path'.
            if(p.getIn().equals("path"))
            paths=p.addinfPathParameters(pathRef,paths);
            // check if the parameter is in type 'query'
            else if(p.getIn().equals("query"))
            paths=p.addinfQueryParameters(pathRef,paths);
    
            System.out.println(paths.size()+" Paths are inferred.");
            }
            for(String path:paths)
            connectPOST(path);
            return pathRef;
            }
    finally {
      inferRandomUrl_String_OperationObject_visited.remove(_parameters);
    }
  }
/** @apilevel internal */
protected java.util.Set generateRandomUrl_String_visited;
  /**
   * @attribute syn
   * @aspect RandomRequestGenerator
   * @declaredat E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:120
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="RandomRequestGenerator", declaredAt="E:\\bachelor-thesis\\SigTest\\bachelor-thesis-jastadd\\src\\main\\jastadd\\RandomRequestGenerator.jrag:120")
  public boolean generateRandomUrl(String pathRef) {
    Object _parameters = pathRef;
    if (generateRandomUrl_String_visited == null) generateRandomUrl_String_visited = new java.util.HashSet(4);
    if (generateRandomUrl_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Post.generateRandomUrl(String).");
    }
    generateRandomUrl_String_visited.add(_parameters);
    try {
            try{
            for(ParameterOb o:getOperationObject().getParameterObs()){
            ParameterObject p=o.parameterObject();
            if(p.getIn().equals("path"))
            pathRef=p.randomPathParameter(pathRef);
            else if(p.getIn().equals("query"))
            pathRef=p.randomQueryParameter(pathRef);
            }
            System.out.println("Generated path : "+pathRef);
    
            URL url=new URL(pathRef);
            HttpsURLConnection con=(HttpsURLConnection)url.openConnection();
    
    
            con.setRequestMethod("POST"); // HTTP POST
            con.setRequestProperty("User-Agent","Mozilla/5.0"); // add request header
            con.setDoOutput(true); // POST
    
            int responseCode=con.getResponseCode();
            BufferedReader in=new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response=new StringBuffer();
    
            while((inputLine=in.readLine())!=null){
            response.append(inputLine);
            }
            in.close();
    
            // print result
            System.out.println("HTTP status code (POST) : "+responseCode);
            //System.out.println("Response : " + response.toString());
            for(ResponseTuple t:getOperationObject().getResponseTuples()){
            if(t.getKey().equals("200")&&responseCode==200){
            //System.out.println("Response successfully saved!");
            SchemaOb respSchema=t.getResponseOb().responseObject().getContentTuple(0).getMediaTypeObject().getSchemaOb();
            if(respSchema.schemaObject().getType().equals("array"))
            getOperationObject().writeDictionaryWithArray(respSchema,response.toString());
            else
            getOperationObject().writeDictionary(respSchema,response.toString());
            }
            }return true;
            }catch(Exception e){
            System.out.println(e.toString());
            return false;
            }
            }
    finally {
      generateRandomUrl_String_visited.remove(_parameters);
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
