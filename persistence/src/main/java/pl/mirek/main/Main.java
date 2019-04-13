package pl.mirek.main;

import pl.mirek.dao.IAuthorDao;
import pl.mirek.dao.impl.AuthorDao;
import pl.mirek.model.Author;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IAuthorDao authorDao = new AuthorDao();

        Author author = new Author();
        author.setFirstName("Juliusz");
        author.setLastName("Słowacki");
        author.setBirthPlace("Krzemieniec");
        // authorDao.save(author);

        // List<Author> allAuthors = ((AuthorDao) authorDao).findAll();
        // System.out.println(allAuthors.size());
    }
}
