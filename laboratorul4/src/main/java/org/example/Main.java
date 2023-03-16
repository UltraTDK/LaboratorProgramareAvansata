package org.example;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // crearea de studenti folosind Stream
        LinkedList<Student> students = Stream.of("Maria", "Ion", "Elena")
                .map(Student::new)
                .collect(Collectors.toCollection(LinkedList::new));

        // sortarea studentilor dupa nume
        students.sort(Student::compareTo);

        // afisarea listei sortate de studenti
        System.out.println("Lista sortata de studenti:");
        students.forEach(student -> System.out.println(student.getName()));

        // crearea de proiecte folosind Stream
        Set<Project> projects = Stream.of("Proiectul A", "Proiectul Alfa", "Projectul Z", "Proiectul Beta")
                .map(Project::new)
                .collect(Collectors.toCollection(TreeSet::new));

        // afisarea listei sortate de proiecte
        System.out.println("\nLista sortata de proiecte:");
        projects.forEach(project -> System.out.println(project.getName()));
    }
}
