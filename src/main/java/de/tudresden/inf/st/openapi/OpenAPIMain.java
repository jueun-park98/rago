package de.tudresden.inf.st.openapi;

import de.tudresden.inf.st.openapi.ast.OpenAPIObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class OpenAPIMain {

    public static OpenAPIObject load(String fileName) throws IOException {
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
        return (OpenAPIObject) parser.parse(scanner);
    }

    public static void main(String[] args) throws IOException {
        OpenAPIObject openApi;

        String fileName = "generatedBegin.exp";

        if (args.length > 0) {
            fileName = args[0];
        }

        openApi = load(fileName);
        System.out.println(openApi.print());
    }

}