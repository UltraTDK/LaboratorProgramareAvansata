import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class EntityData {
    private final EntityManagerFactory entityManagerFactory;

    public EntityData(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public void create(EntityModel entity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
        }
    }

    public EntityModel findById(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            return entityManager.find(EntityModel.class, id);
        } finally {
            entityManager.close();
        }
    }

//    public List<EntityModel> findByName(String namePattern) {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        try {
//            TypedQuery<EntityModel> query = entityManager.createNamedQuery("EntityData.findByName", EntityModel.class);
//            query.setParameter("namePattern", namePattern);
//            return query.getResultList();
//        } finally {
//            entityManager.close();
//        }
//    }
}
