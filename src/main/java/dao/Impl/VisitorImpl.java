package dao.Impl;

import Entity.Visitor;
import dao.VisitorDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class VisitorImpl implements VisitorDAO {
    EntityManagerFactory emf;
    EntityManager em;
    EntityTransaction tx;

    public VisitorImpl() {
        emf = Persistence.createEntityManagerFactory("HibernateCourse");
        em = emf.createEntityManager();
        tx = em.getTransaction();
        tx.begin();
    }

    @Override
    public void addVistor(Visitor v) {
        em.persist(v);
    }

    public void close() {
        tx.commit();
        em.close();
        emf.close();
    }
}
