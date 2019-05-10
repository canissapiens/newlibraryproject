package pl.mirek.dao.impl;

import pl.mirek.dao.IBookDao;
import pl.mirek.model.Book;

import javax.persistence.*;
import java.util.List;

public class BookDao implements IBookDao {

    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public BookDao() {
        factory = Persistence.createEntityManagerFactory("myOwnLibrary");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void save(Book book) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(book);
        transaction.commit();
    }

    @Override
    public List<Book> findAll() {
        List<Book> books;
        books = entityManager.createQuery("SELECT b FROM Book b", Book.class)
                .getResultList();
        return books;
    }

    @Override
    public Book findBookByID(long bookId) {
        Book book;

        book = entityManager.createQuery("SELECT b FROM Book b WHERE b.id_book = :bookid", Book.class)
                .setParameter("bookid", bookId)
                .getSingleResult();
        return book;
    }

    @Override
    public void cleanUp() {

    }
}
