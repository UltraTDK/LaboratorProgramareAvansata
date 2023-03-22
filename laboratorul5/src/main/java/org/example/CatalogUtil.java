package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;


public class CatalogUtil {
    public static void save(Catalog catalog, String path) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(path), catalog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Catalog load(String path) {
        Catalog catalog = new Catalog();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            catalog = objectMapper.readValue(new File(path), Catalog.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return catalog;
    }
}
