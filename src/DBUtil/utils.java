package DBUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class utils {
    private static final String PERSISTANCE_UNIT_NAME = "tasklist";
    private static EntityManagerFactory emf;

    public static EntityManager createEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

    private static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
        }

        return emf;
    }

}
