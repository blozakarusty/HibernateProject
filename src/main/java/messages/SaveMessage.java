package messages;

import Entity.Message;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMessage {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateCourse");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        Message m = new Message(1, "Hello world");
        em.persist(m);
        tx.commit();


        em.close();
        emf.close();
        System.out.println("Message saved");
    }
}
