# Cerinte

1. Compulsory:

* Create an object-oriented model of the problem. You should have at least the following classes: Catalog, Document. Create a class responsible with external operations regarding a catalog.
* Implement the following methods representing commands that will manage the content of the catalog:

    * add: adds a new entry into the catalog;
    
    * toString: a textual representation of the catalog;
    
    * save: saves the catalog to an external file using JSON format; you may use Jackson or other library;
    
    * load: loads the catalog from an external file.

2. Homework:

* Represent the commands using classes instead of methods. Use an interface or an abstract class in order to desribe a generic command.

* Implement the commands load, list, view, report (create the classes AddCommand, ListCommand, etc.).
    
    * list: prints the list of documents on the screen;
    
    * view: opens a document using the native operating system application (see the Desktop class);
    
    * report: creates (and opens) an HTML report representing the content of the catalog.