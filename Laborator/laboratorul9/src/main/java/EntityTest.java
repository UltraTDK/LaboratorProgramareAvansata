import jakarta.persistence.EntityManagerFactory;
import java.util.List;

public class EntityTest {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = EntityManager.getEntityManagerFactory();

        EntityData data = new EntityData(entityManagerFactory);

        EntityModel entity = new EntityModel();
        entity.setName("Andrei");
        data.create(entity);

        // cautare dupa ID
        EntityModel retrievedEntity = data.findById(entity.getId());
        System.out.println("Retrieved entity: " + retrievedEntity);

        // cautare entitati dupa nume
        // List<EntityModel> entities = data.findByName("Andrei%");
        // System.out.println("Entitati cu numele 'Andrei':");
        // for (EntityModel e : entities) {
        // System.out.println(e);
        // }

        EntityManager.closeEntityManagerFactory();
    }
}
