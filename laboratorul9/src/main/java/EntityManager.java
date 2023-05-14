import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManager {
    private static final String PERSISTENCE_UNIT_NAME = "lab9";
    private static EntityManagerFactory entityManagerFactory;

    private EntityManager() {
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return entityManagerFactory;
    }

    public static void closeEntityManagerFactory() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
