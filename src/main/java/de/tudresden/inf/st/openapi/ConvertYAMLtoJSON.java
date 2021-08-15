package de.tudresden.inf.st.openapi;

import java.io.IOException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

public class ConvertYAMLtoJSON {
    public static void main(String[] args) throws IOException {
        String content = "";
        FileWriter writer = new FileWriter("./src/main/resources/openapi.json");
        try {
            content = new String(Files.readAllBytes(Paths.get(
                    "./src/main/resources/openapi.yaml")));
            System.out.println("*********Content from YAML File ****************");
            System.out.println(content);
            String json = convertYamlToJson(content);
            System.out.println("*********Converted JSON from YAML File ****************");
            System.out.println(json);
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String convertYamlToJson(String yaml) {
        try {
            ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
            Object obj = yamlReader.readValue(yaml, Object.class);
            ObjectMapper jsonWriter = new ObjectMapper();
            return jsonWriter.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
