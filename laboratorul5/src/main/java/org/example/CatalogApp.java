package org.example;


public class CatalogApp {

    private Catalog catalog;


    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }


    public CatalogApp() {
        this.catalog = new Catalog();
    }


    public void run(Parameter parameter) throws CommandException {

        if (parameter.equals(null)) {
            throw new CommandException("Invalid command");
        }


        Command command;


        switch (parameter.name) {
            case "load":
                try {
                    command = new AddCommand(parameter, catalog);
                } catch (Exception e) {
                    throw new CommandException("Invalid command parameters");
                }
                break;
            case "list":
                command = new ListCommand(catalog);
                break;
            case "view":
                try {
                    command = new ViewCommand(parameter.name);
                } catch (Exception e) {
                    throw new CommandException("Invalid command parameters");
                }
                break;
            case "report":
                try {
                    command = new ReportCommand(parameter.name, parameter.name);
                } catch (Exception e) {
                    throw new CommandException("Invalid command parameters");
                }
                break;
            default:
                throw new CommandException("Invalid command");
        }
    }
}
