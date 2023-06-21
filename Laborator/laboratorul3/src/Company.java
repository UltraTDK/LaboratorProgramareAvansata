import java.util.LinkedList;
import java.util.List;

class Company implements Comparable<Company>, Node {
    private String name;
    private List<Person> employees;


    public Company(String name) {
        this.name = name;
        this.employees = new LinkedList<>();
    }


    public String getName() {
        return this.name;
    }


    public List<Person> getEmployees() {
        return this.employees;
    }


    public void addEmployee(Person employee) {
        this.employees.add(employee);
    }


    // returneaza numarul de angajati dintr-o companie
    public int getNumOfEmployees() {
        return this.employees.size();
    }


    @Override
    public int compareTo(Company company) {
        return name.compareTo(company.name);
    }
}