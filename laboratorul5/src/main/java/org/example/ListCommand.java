package org.example;
import java.util.List;


public class ListCommand implements Command {
    
    List<String> doc;
    public ListCommand(List<String> doc) {
        this.doc = doc;
    }

    @Override
    public void execute() throws CommandException {
        if (doc == null) throw new CommandException("Command failed, objects references are null.");
        // System.out.println(doc.getItems());
    }
}
