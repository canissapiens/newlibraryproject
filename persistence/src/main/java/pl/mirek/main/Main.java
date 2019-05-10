package pl.mirek.main;

import pl.mirek.dao.IAuthorDao;
import pl.mirek.dao.IBookDao;
import pl.mirek.dao.impl.AuthorDao;
import pl.mirek.dao.impl.BookDao;
import pl.mirek.model.Author;
import pl.mirek.model.Book;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        IBookDao bookDao = new BookDao();
        Book bookByID = ((BookDao) bookDao).findBookByID(8L);

        // System.out.println("Z BookDao -------------------->" + bookByID.getTitle());

    }
}
