package de.tudresden.inf.st.openapi;

import de.tudresden.inf.st.openapi.ast.OpenAPIObject;
import org.openapi4j.core.exception.ResolutionException;
import org.openapi4j.core.validation.ValidationException;
import org.openapi4j.parser.OpenApi3Parser;
import org.openapi4j.parser.model.v3.OpenApi3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class OpenAPIMain {

    public static OpenAPIObject load(String fileName) throws IOException, ResolutionException, ValidationException {
        fileName = "api-with-examples.json";
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

        System.out.println("Loading expression DSL file '" + fileName + "'.");
        FileReader reader = new FileReader(file);
        OpenApi3 api = new OpenApi3Parser().parse(expUrl, new ArrayList<>(), false);
        System.out.println(api.toString());
        return (OpenAPIObject) null; // ToDo
    }

    public static void main(String[] args) throws IOException, ResolutionException, ValidationException {
        OpenAPIObject openApi;
//
        String fileName = "api-with-examples.json";
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

        System.out.println("Loading expression DSL file '" + fileName + "'.");
        FileReader reader = new FileReader(file);
        OpenApi3 api = new OpenApi3Parser().parse(expUrl, new ArrayList<>(), false);
        System.out.println(api.toString());
//
        //String fileName = "api-with-examples.json";

        if (args.length > 0) {
            fileName = args[0];
        }

        //openApi = load(fileName);
        //System.out.println(openApi.print());
    }

}