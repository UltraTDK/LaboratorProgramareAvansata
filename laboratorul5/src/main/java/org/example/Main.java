package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
    public static void main(String args[]) throws InvalidCatalogException {
        Main compulsory = new Main();
        compulsory.testCreateSave();
        compulsory.testLoad();
        Parameter parameter = new Parameter();
    }


    private void testCreateSave() {
        Catalog catalog = new Catalog("Catalog", "C:\\Date\\Facultate\\Anul 3\\Semestrul 2\\Java\\Laborator\\laboratorul5\\Catalog\\catalog.json");
        Document doc1 = new Document("Test1", "Test1.txt", "C:\\Date\\Facultate\\Anul 3\\Semestrul 2\\Java\\Laborator\\laboratorul5\\Documente\\Test1.txt");
        Document doc2 = new Document("Test2", "Test2.txt", "C:\\Date\\Facultate\\Anul 3\\Semestrul 2\\Java\\Laborator\\laboratorul5\\Documente\\Test2.txt");
        Document doc3 = new Document("smileyFace", "smileyFace.jpg", "C:\\Date\\Facultate\\Anul 3\\Semestrul 2\\Java\\Laborator\\laboratorul5\\Documente\\smileyFace.jpg");
        doc3.addTag("type", "Photo");
        catalog.add(doc1, doc2, doc3);

        CatalogUtil.save(catalog, "C:\\Date\\Facultate\\Anul 3\\Semestrul 2\\Java\\Laborator\\laboratorul5\\Catalog\\catalog.json");
    }


    private void testLoad() throws InvalidCatalogException {
        Catalog catalog = CatalogUtil.load("C:\\Date\\Facultate\\Anul 3\\Semestrul 2\\Java\\Laborator\\laboratorul5\\Catalog\\catalog.json");
        System.out.println(catalog.getDocuments());
    }
}