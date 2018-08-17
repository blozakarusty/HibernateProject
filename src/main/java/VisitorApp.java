import Entity.Visitor;
import dao.Impl.VisitorImpl;
import dao.VisitorDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VisitorApp {
    public static void main(String[] args) {
     /*   EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateCourse");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Visitor v = new Visitor("Maxim",26);
        em.persist(v);
        tx.commit();
        em.close();
        emf.close();*/

        VisitorDAO visitorDAO = new VisitorImpl();
        visitorDAO.addVistor(new Visitor("Joske", 26));
        visitorDAO.close();
    }
}
