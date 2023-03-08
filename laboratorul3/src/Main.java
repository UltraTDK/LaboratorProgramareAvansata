import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Person("Andrei"));
        nodes.add(new Company("Home"));

        Collections.sort(nodes, Comparator.comparing(Node::getName));

        for (Node node : nodes) {
            System.out.println(node.getName());
        }
    }
}