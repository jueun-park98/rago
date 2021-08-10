package openapi;

import com.flipkart.zjsonpatch.JsonDiff;
import de.tudresden.inf.st.openapi.ast.*;
import org.junit.jupiter.api.Assertions;
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
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;

public class OpenAPIMain_test {

    @Test
    public void test() throws IOException, ResolutionException, ValidationException, EncodeException {
        OpenAPIObject openApi;
        OpenApi3 api3;
        ValidationResults results = new ValidationResults();
        String fileName = "uspto.json";
        FileWriter writer = new FileWriter("./gen-api-ex/" + fileName);

        URL expUrl = OpenAPIMain_test.class.getClassLoader().getResource(fileName);
        File file = null;
        if (expUrl != null) {
            file = new File(expUrl.getFile());
        } else {
            file = new File(fileName);
        }
        if (file == null) {
            throw new FileNotFoundException("Could not load JSON file " + fileName);
        }

        // parsed openAPI object with openapi4j
        OpenApi3 api = new OpenApi3Parser().parse(expUrl, new ArrayList<>(), true);
        System.out.println("Loading expression DSL file '" + fileName + "'.");

        // openAPI object is integrated in JastAdd grammar
        openApi = OpenAPIObject.parseOpenAPI(api);

        // composed openAPI object, it is expected to be equivalent to parsed source object
        api3 = OpenAPIObject.composeOpenAPI(openApi);

        // check, if the composed openAPI object is valid
        results = OpenApi3Validator.instance().validate(api3);
        System.out.println(results.isValid());

        // compare if api (source object) is equivalent to api3 (generated object)
        compareJson(api3.toNode(), api.toNode(), Paths.get(fileName));

        // save the generated object
        writer.write(api3.toNode().toPrettyString());
        writer.close();
    }

    protected void compareJson(JsonNode expectedNode, JsonNode actualNode, Path path) throws IOException {
        JsonNode diff = JsonDiff.asJson(expectedNode, actualNode);

        // if the Jsons are equivalent, there is no reason to to the text comparison
        // if there is a difference, a text comparison might look better than just the diff.
        if (diff.size() != 0) {
            Assertions.assertEquals(actualNode.toPrettyString(), expectedNode.toPrettyString(), "JSONs for " + path + " are different:\n" + diff.toPrettyString());
        }
    }
}