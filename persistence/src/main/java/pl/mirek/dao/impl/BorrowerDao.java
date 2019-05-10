package pl.mirek.dao.impl;

import pl.mirek.dao.IBorrowerDao;
import pl.mirek.model.Borrower;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class BorrowerDao implements IBorrowerDao {

    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public BorrowerDao() {
        factory = Persistence.createEntityManagerFactory("myOwnLibrary");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void save(Borrower borrower) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(borrower);
        transaction.commit();
    }

    @Override
    public List<Borrower> findAll() {
        List<Borrower> borrowers;
        borrowers = entityManager.createQuery("SELECT b from Borrower b", Borrower.class)
                .getResultList();
        return borrowers;
    }

    @Override
    public Borrower findBorrowerById(long borrowerId) {
        Borrower borrower;
        borrower = entityManager.createQuery("SELECT b FROM Borrower b WHERE b.id_borrower = :borrowerid", Borrower.class)
                .setParameter("borrowerid", borrowerId)
                .getSingleResult();
        return borrower;
    }

    @Override
    public void cleanUp() {

    }
}
