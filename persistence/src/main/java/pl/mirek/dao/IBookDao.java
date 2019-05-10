package pl.mirek.dao;

import pl.mirek.model.Book;

import java.util.List;

public interface IBookDao {

    void save(Book book);

    List<Book> findAll();

    Book findBookByID(long bookId);

    void cleanUp();
}