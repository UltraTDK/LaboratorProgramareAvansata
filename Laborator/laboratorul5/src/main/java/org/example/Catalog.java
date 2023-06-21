package org.example;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Catalog implements Serializable {
    
    private String name;
    private String path;
    private List<Document> docs = new ArrayList<>();


    public Catalog() {}


    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }


    public String getPath() {
        return path;
    }


    public List<Document> getDocuments() {
        return docs;
    }


    // numar variabil de parametri
    public void add(Document... doc) {
        docs.addAll(List.of(doc));
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Document doc : docs) {
            sb.append(doc.toString());
        }
        return sb.toString();
    }
}
