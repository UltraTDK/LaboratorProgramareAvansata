package org.example;
import java.util.List;


public class AddCommand implements Command {

    private String filePath;
    private List<String> document;


    public AddCommand(String filePath, List<String> document) {
        this.filePath = filePath;
        this.document = document;
    }


    public AddCommand(Parameter parameter, Catalog catalog2) {
    }


    @Override
    public void execute() throws CommandException {
        // Verific daca exista documentul in catalog
        if (!document.contains(filePath)) {
            document.add(filePath);
        } else {
            throw new CommandException("Document already exists in catalog.");
        }
    }
}
