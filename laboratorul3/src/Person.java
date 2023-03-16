import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Person implements Node, Comparable<Person> {
    private final String name;
    private final Date birthDate;
    private final Map<String, Object> relationships;


    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.relationships = new HashMap<>();
    }


    @Override
    public String getName() {
        return name;
    }


    public Date getBirthDate() {
        return this.birthDate;
    }


    //
    public void addRelationship(String relationshipType, Object relatedObject) {
        this.relationships.put(relationshipType, relatedObject);
    }


    public Map<String, Object> getRelationships() {
        return this.relationships;
    }


    public int getNumOfRelationships() {
        return this.relationships.size();
    }


    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }

}