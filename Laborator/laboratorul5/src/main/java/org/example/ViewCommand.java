package org.example;

import java.io.File;

public class ViewCommand implements Command {

    private String filePath;

    public ViewCommand(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void execute() throws CommandException {
        // Open the document using the native operating system application
        // If the document does not exist, throw a CommandException
        File file = new File(filePath);
        if (file.exists()) {
            Desktop.getDesktop().open(file);
        } else {
            throw new CommandException("Document does not exist.");
        }
    }
}
