package pl.mirek.services;

import pl.mirek.dao.IBookDao;
import pl.mirek.dao.impl.BookDao;
import pl.mirek.dto.BookDetailsWithAuthorDto;
import pl.mirek.model.Book;

import java.util.List;

public class BookService {
    private IBookDao bookDao;

    private BookService() {
        bookDao = new BookDao();
    }

    public static BookService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BookService INSTANCE = new BookService();
    }

    public void save(Book book) {
        bookDao.save(book);
    }

    public List<Book> getBooksList() {
        System.out.println("BookService ------------------------>");
        System.out.println(((BookDao) bookDao).findAll().get(1).getTitle());
        return ((BookDao) bookDao).findAll();
    }

    public BookDetailsWithAuthorDto getBookWithAuthorById(long bookId) {
        BookDetailsWithAuthorDto bookDetailsWithAuthor = new BookDetailsWithAuthorDto();
        Book book = bookDao.findBookByID(bookId);
        bookDetailsWithAuthor.setTitle(book.getTitle());
        bookDetailsWithAuthor.setBorrowed(book.isBorrow());
        bookDetailsWithAuthor.setIsbn(book.getIsbn());
        bookDetailsWithAuthor.setIssueYear(book.getReleaseDate());
        bookDetailsWithAuthor.setId(book.getId_book());
        bookDetailsWithAuthor.setPages(book.getPages());
        System.out.println("BookId -----> " + book.getId_book());
        // bookDetailsWithAuthor.set
        bookDetailsWithAuthor.setAuthor(book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName());
        bookDetailsWithAuthor.setAuthorId(book.getAuthor().getId_author());
        return bookDetailsWithAuthor;
    }

    public Book getBookById(long bookId) {
        return bookDao.findBookByID(bookId);
    }
}
