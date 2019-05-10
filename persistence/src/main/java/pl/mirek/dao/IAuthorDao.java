package pl.mirek.dao;

import pl.mirek.model.Author;

import java.util.List;

public interface IAuthorDao {

    void save(Author author);

    List<Author> findAll();

    Author findAuthorById(long authorId);

    void cleanUp();
}
