package openapi;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.flipkart.zjsonpatch.JsonDiff;
import de.tudresden.inf.st.openapi.ast.*;
import org.junit.jupiter.api.Assertions;
import org.openapi4j.core.exception.DecodeException;
import org.openapi4j.core.exception.EncodeException;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.core.validation.ValidationResults;
import org.openapi4j.parser.OpenApi3Parser;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.parser.validation.v3.OpenApi3Validator;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;

public class OpenAPIMain_test {

    @Test
    public void test() throws IOException, ResolutionException, ValidationException, EncodeException, DecodeException {
        OpenAPIObject openApi;
        OpenApi3 api3;
        ValidationResults results;
        List<String> filenames = new ArrayList<>();
        String genDir = "./gen-api-ex/";
        File genDirectory = new File(genDir);
        File[] contents;

        File resource = new File("./src/main/resources");

        for( File file : resource.listFiles() )
                filenames.add(file.getName());
        System.out.println(filenames.size());

        for( String file : filenames ){
            String writerName = genDir + file;
            FileWriter expectedWriter = new FileWriter((writerName.substring(0, writerName.length()-5) + "-expected.json"));
            FileWriter actualWriter = new FileWriter((writerName.substring(0, writerName.length()-5) + "-actual.json"));
            URL expUrl = OpenAPIMain_test.class.getClassLoader().getResource(file);

            // parsed openAPI object with openapi4j
            OpenApi3 api = new OpenApi3Parser().parse(expUrl, new ArrayList<>(), true);
            System.out.println("Loading expression DSL file '" + file + "'.");
            // save expected object
            expectedWriter.write(api.toNode().toPrettyString());
            expectedWriter.close();

            //results = OpenApi3Validator.instance().validate(api);
            //System.out.println(results.isValid());

            // openAPI object is integrated in JastAdd grammar
            openApi = OpenAPIObject.parseOpenAPI(api);

            // composed openAPI object, it is expected to be equivalent to parsed source object
            api3 = OpenAPIObject.composeOpenAPI(openApi);

            // check, if the composed openAPI object is valid
            //results = OpenApi3Validator.instance().validate(api3);
            //System.out.println(results.isValid());

            //System.out.println(api.toNode().equals(api3.toNode()));

            // save generated object
            actualWriter.write(api3.toNode().toPrettyString());
            actualWriter.close();

            // compare if api (source object) is equivalent to api3 (generated object)
            compareJson(api3.toNode(), api.toNode(), Paths.get(file));
        }

        // clean all generated jsons
        contents = genDirectory.listFiles();
        if (contents != null) {
            for (File file : contents)
                file.delete();
        }
    }

    protected void compareJson(JsonNode expectedNode, JsonNode actualNode, Path path) throws IOException {
        JsonNode diff = JsonDiff.asJson(expectedNode, actualNode);
        while( diff.size() > 0 ){
            // remove all diffs, which are empty
            if( diff.get(0).has("value") && diff.get(0).get("value").isEmpty() )
                ((ArrayNode) diff).remove(0);
            // remove all diffs, which are copies of empty properties
            else if( diff.get(0).has("op") && diff.get(0).get("op").toString().equals("\"copy\"") )
                ((ArrayNode) diff).remove(0);
            else if( diff.get(0).has("op") && diff.get(0).get("op").toString().equals("\"move\"") )
                ((ArrayNode) diff).remove(0);
            else if( diff.get(0).has("op") && diff.get(0).get("op").toString().equals("\"remove\"") )
                ((ArrayNode) diff).remove(0);
        }

        // if the Jsons are equivalent, there is no reason to to the text comparison
        // if there is a difference, a text comparison might look better than just the diff.
        if (diff.size() != 0) {
            //System.out.println(diff.toPrettyString());
            Assertions.assertEquals(actualNode.toPrettyString(), expectedNode.toPrettyString(), "JSONs for " + path + " are different:\n" + diff.toPrettyString());
        }
    }
}