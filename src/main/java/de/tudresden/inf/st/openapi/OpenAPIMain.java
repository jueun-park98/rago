package de.tudresden.inf.st.openapi;

import com.fasterxml.jackson.databind.JsonNode;
import de.tudresden.inf.st.openapi.ast.*;
import de.tudresden.inf.st.openapi.ast.Enum;
import org.openapi4j.core.exception.EncodeException;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.core.validation.ValidationResults;
import org.openapi4j.parser.OpenApi3Parser;
import org.openapi4j.parser.model.v3.*;
import org.openapi4j.parser.model.v3.Parameter;
import org.openapi4j.parser.model.v3.RequestBody;
import org.openapi4j.parser.model.v3.Schema;
import org.openapi4j.parser.model.v3.Tag;
import org.openapi4j.parser.validation.v3.OpenApi3Validator;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class OpenAPIMain {

    /** main-method, calls the set of methods to test the OpenAPI-Generator with JastAdd **/
    public static void main(String[] args) throws IOException, ResolutionException, ValidationException, EncodeException {
        OpenAPIObject openApi;
        OpenApi3 api3;
        ValidationResults results = new ValidationResults();

        String fileName = "callback-example.json";
        FileWriter writer = new FileWriter("./gen-api-ex/callback-example_generated.json");

        URL expUrl = OpenAPIMain.class.getClassLoader().getResource(fileName);
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
        System.out.println(api.toNode().equals(api3.toNode()));

        writer.write(api3.toNode().toPrettyString());
        writer.close();

        if (args.length > 0) {
            fileName = args[0];
        }

    }
}