package openapi;

import com.flipkart.zjsonpatch.JsonDiff;
import de.tudresden.inf.st.openapi.ast.Enum;
import de.tudresden.inf.st.openapi.ast.*;
import org.junit.jupiter.api.Assertions;
import org.openapi4j.core.exception.EncodeException;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.core.validation.ValidationResults;
import org.openapi4j.parser.OpenApi3Parser;
import org.openapi4j.parser.model.v3.RequestBody;
import org.openapi4j.parser.model.v3.Tag;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.parser.validation.v3.OpenApi3Validator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;

public class OpenAPIMain_test {

    @Test
    /** main-method, calls the set of methods to test the OpenAPI-Generator with JastAdd **/
    public void test() throws IOException, ResolutionException, ValidationException, EncodeException {
        OpenAPIObject openApi;
        OpenApi3 api3;
        ValidationResults results = new ValidationResults();

        String fileName = "callback-example.json";

        Path path = Paths.get(fileName);

        FileWriter writer = new FileWriter("./gen-api-ex/callback-example_generated.json");

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

        OpenApi3 api = new OpenApi3Parser().parse(expUrl, new ArrayList<>(), true);
        System.out.println("Loading expression DSL file '" + fileName + "'.");

        openApi = OpenAPIObject.parseOpenAPI(api);

        api3 = OpenAPIObject.composeOpenAPI(openApi);

        results = OpenApi3Validator.instance().validate(api3);

        System.out.println(results.isValid());

        writer.write(api3.toNode().toPrettyString());
        writer.close();

        compareJson(api3.toNode(), api.toNode(), Paths.get("api-with-examples.json"));
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