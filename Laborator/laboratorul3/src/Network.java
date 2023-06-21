import java.text.SimpleDateFormat;
import java.util.*;

class Network {
    private List<Object> nodes;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");


    public Network() {
        this.nodes = new LinkedList<>();
    }


    public void addNode(Object node) {
        this.nodes.add(node);
    }


    public List<Object> getNodes() {
        return this.nodes;
    }


    // calculez importanta nodurilor pentru persoane si companii
    public static int computeNodeImportance(Object node) {
        int numOfConnections = 0;
        if (node instanceof Person) {
            // trebuie sa fac cast pentru a stabili tipul obiectului
            // altfel, pot primi eroare ClassCastException
            Person person = (Person)node;
            numOfConnections = person.getNumOfRelationships();
        } else if (node instanceof Company) {
            Company company = (Company)node;
            numOfConnections = company.getNumOfEmployees();
        }
        return numOfConnections;
    }


    // afisez in mod descrescator
    private static int compareNodes(Object node) {
        return -computeNodeImportance(node);
    }


    // Afiseaza reteua de noduri
    public void printNetwork() {
        Collections.sort(nodes, Comparator.comparing(Network::compareNodes));

        for (Object node : nodes) {
            if (node instanceof Person) {
                Person person = (Person)node;
                if (person instanceof Programmer) {
                    Programmer programmer = (Programmer) person;
                    System.out.println("- Persoana: " + programmer.getName() + " (" + dateFormat.format(programmer.getBirthDate()) + ")");
                    System.out.println(" - Specialitate: " + programmer.getProgrammingLanguage() + "\n" + " Pozitie in companie: " + programmer.getPositionInCompany());
                } else if (person instanceof Designer) {
                    Designer designer = (Designer) person;
                    System.out.println("- Persoana: " + designer.getName() + " (" + dateFormat.format(designer.getBirthDate()) + ")");
                    System.out.println(" - Specialitate: " + designer.getDesignerSpecialty() + "\n" + " Pozitie in companie: " + designer.getPositionInCompany());
                }
                for (Map.Entry<String, Object> relationship : person.getRelationships().entrySet()) {
                    System.out.println(" " + relationship.getKey() + ": " + relationship.getValue().toString());
                }
            } else if (node instanceof Company) {
                Company company = (Company)node;
                System.out.println("- Compania: " + company.getName());
                System.out.println(" - Angajati:");
                for (Person employee : company.getEmployees()) {
                    System.out.println(" " + employee.getName());
                }
            }
        }
    }
}