package org.example;
import javax.print.Doc;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class Document implements Serializable {
    private String id;
    private String title;
    private String location;


    public Document() {}

    public Document(String id, String title, String location) {
        this.id = id;
        this.title = title;
        this.location = location;
    }


    private Map<String, Object> tags = new HashMap<>();


    public void addTag(String key, Object obj) {
        tags.put(key, obj);
    }


    public void setId(String id) {
        this.id = id;
    }


    public Object getId() {
        return id;
    }


    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nLocation: " + location + "\n";
    }
}

