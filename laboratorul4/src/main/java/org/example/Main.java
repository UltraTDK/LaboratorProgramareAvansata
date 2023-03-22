package org.example;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.github.javafaker.Faker;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        // adaugare studenti in lista
        LinkedList<Student> students = Stream.of("Maria", "Ion", "Elena")
                .map(name -> new Student(name))
                .collect(Collectors.toCollection(LinkedList::new));


        // adaugare proiecte in arbore
        Set<Project> projects = Stream.of("Proiectul A", "Proiectul Alfa", "Projectul Z", "Proiectul Beta")
                .map(Project::new)
                .collect(Collectors.toCollection(TreeSet::new));


        // API pentru generare
        Faker faker = new Faker();


        // generare proiecte
        for (int nrOfProj = 1; nrOfProj <= 10; nrOfProj++) {
            projects.add(new Project(faker.company().name()));;
        }


        // generare studenti
        for (int nrOfStud = 0; nrOfStud <= 10; nrOfStud++) {
            students.add(new Student(faker.name().fullName()));
        }


        // sortarea studentilor dupa nume
        students.sort(Student::compareTo);


        Random rand = new Random();
        Map<Student, Set<Project>> projMap = new HashMap<>();
        Map<Student, List<Project>> prefMap = new HashMap<>();
        Map<Student, Integer> nrOfPrefMap = new HashMap<>();
        List<Project> projList = List.copyOf(projects);


        for (int i = 0; i < students.size(); i++) {
            int nrOfProj = rand.nextInt(projects.size());
            Set<Project> tempSet = new TreeSet<>();
            List<Project> preference = new ArrayList<>();
            int nrOfPreferences = 0;
            for (int j = 0; j < nrOfProj; j++) {
                int projNr = rand.nextInt(projects.size());
                tempSet.add(projList.get(projNr));
                boolean choice = rand.nextBoolean();
                if (choice)
                    preference.add(projList.get(projNr));
                    nrOfPreferences+=1;
            }

            projMap.put(students.get(i), tempSet);
            prefMap.put(students.get(i), preference);
            nrOfPrefMap.put(students.get(i), nrOfPreferences);
        }


        // filtrarea studentilor pe baza proiectului asociat
        List<Project> target = Arrays.asList(projList.get(rand.nextInt(projects.size())),
                projList.get(rand.nextInt(projects.size())));
        List<Student> result = students.stream()
                .filter(s -> prefMap.get(s).containsAll(target))
                .collect(Collectors.toList());


        // afisarea listei sortate de studenti
        System.out.println("---------- Lista sortata de studenti: ----------");
        students.forEach(student -> System.out.println(student.getName()));


        // afisarea proiectelor
        System.out.println("\n---------- Lista sortata de proiecte: ----------");
        projects.forEach(project -> System.out.println(project.getName()));


        // afisarea studentilor si proiectele asociate
        System.out.println("\n---------- Studenti si Proiecte asociate: ----------");
        projMap.forEach((k,v) ->
        {
            v.forEach(project ->
                    System.out.println("Student: " + k.getName() + ", Proiect: " + project.getName()));
        });


        // afisarea studentilor si preferintele acestora
        System.out.println("\n---------- Studenti si Preferinte: ----------");
        prefMap.forEach((k,v) ->
        {
            v.forEach(preference ->
                    System.out.println("Student: " + k.getName() + ", Preferinte: " + preference.getName()));
        });


        // afisarea studentilor si numarul de preferinte
        System.out.println("\n---------- Studenti si Numar de Preferinte: ----------");
        nrOfPrefMap.entrySet().forEach(entry -> {
            if (projects.size() <= entry.getValue())
                System.out.println("Student: " + entry.getKey().getName() + ", numar preferinte: " + entry.getValue());
        });


        // studentii care au proiectele date ca parametru
        System.out.println("\n---------- Studentii care au proiectele p(): ----------");
        for (Project p : projects) {
            students.stream()
                    .filter(s -> prefMap.get(s).contains(p))
                    .forEach(s -> System.out.println(s.getName()));
        }


        // rezultat final
        System.out.println("\n---------- Rezultat: ----------");
        result.forEach(r -> System.out.println(r.getName()));


        // asocierea finala student - proiect
        Map<Student, Project> studProjMap = new HashMap<>();
        Set set = prefMap.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) i.next();
            if (studProjMap.putIfAbsent((Student) mapEntry.getKey(), (Project) mapEntry.getValue()) == null) {
                System.out.println("Proiectul a fost asociat.");
            } else {
                System.out.println("Proiectul nu a putut fi asociat.");
            }
        }


        // afisare student-proiect
        System.out.println("\n---------- Student - Proiect: ----------");
        prefMap.forEach((k,v) ->
        {
            v.forEach(project ->
                    System.out.println("Student: " + k.getName() + ", Proiect: " + project.getName()));
        });
    }
}
