package pl.mirek.dao.impl;

import pl.mirek.dao.IAuthorDao;
import pl.mirek.model.Author;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class AuthorDao implements IAuthorDao {
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public AuthorDao() {
        factory = Persistence.createEntityManagerFactory("myOwnLibrary");
        entityManager = factory.createEntityManager();
    }

    @Override
    public void save(Author author) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(author);
        transaction.commit();
    }

    @Override
    public List<Author> findAll() {
        List<Author> authors;
        authors = entityManager.createQuery(
                "SELECT a FROM Author a", Author.class)
                .getResultList();
        return authors;
    }

    @Override
    public Author findAuthorById(long authorId) {
        Author author;

        author = entityManager.createQuery("SELECT a FROM Author a WHERE a.id_author = :authorid", Author.class)
                .setParameter("authorid", authorId)
                .getSingleResult();
        System.out.println(author.getLastName());
        return author;
    }

    public void cleanUp() {

    }
}
