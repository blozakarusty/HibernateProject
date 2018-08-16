package Bieren;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BeerApp {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateCourse");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Bieren bieren = em.find(Bieren.class, 4);
        System.out.println(bieren.getNaam());
        tx.commit();
        em.close();
        emf.close();
    }
}
