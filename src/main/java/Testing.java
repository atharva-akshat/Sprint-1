import com.womenempowerment.model.Trainee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Testing {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CG_PU");
        EntityManager manager = factory.createEntityManager();
        EntityTransaction trans = manager.getTransaction();

        Trainee trainee = new Trainee();
        trainee.setFirstName("Jack");
        trainee.setLastName("Sparrow");

        trans.begin();
        manager.persist(trainee);
        trans.commit();
        manager.close();
        factory.close();
    }
}
