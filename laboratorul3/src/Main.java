import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();

        // crearea de persoane
        Programmer programmer1 = new Programmer("Maria", new Date(1998, 5, 8), "Java", "Senior Developer");
        Programmer programmer2 = new Programmer("Ion", new Date(2000, 3, 14), "C++", "Junior Developer");
        Designer designer1 = new Designer("Mihai", new Date(1994, 7, 28), "Visual design", "Senior Designer");
        Designer designer2 = new Designer("Mirel", new Date(1996, 12, 31), "Service design", "Middle Designer");


        // crearea de companii
        Company company1 = new Company("Endava");
        Company company2 = new Company("Microsoft");


        // crearea de relatii intre angajati-companii
        programmer1.addRelationship("Lucreaza la", company1.getName());
        programmer2.addRelationship("Lucreaza la", company2.getName());
        designer1.addRelationship("Lucreaza la", company2.getName());
        designer2.addRelationship("Lucreaza la", company2.getName());


        // adaugarea de angajati in companii
        company1.addEmployee(programmer1);
        company2.addEmployee(programmer2);
        company2.addEmployee(designer1);
        company2.addEmployee(designer2);


        // crearea unei retele de angajati si companii
        Network network = new Network();
        network.addNode(programmer1);
        network.addNode(programmer2);
        network.addNode(designer1);
        network.addNode(designer2);
        network.addNode(company1);
        network.addNode(company2);


        // afisare retea de noduri
        network.printNetwork();
    }
}