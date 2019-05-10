package pl.mirek.services;

import pl.mirek.dao.IAuthorDao;
import pl.mirek.dao.impl.AuthorDao;
import pl.mirek.dto.AuthorDto;
import pl.mirek.model.Author;

import java.util.List;

public class AuthorService {
    private static IAuthorDao authorDao;
    List<Author> authors;

    private AuthorService() {
        authorDao = new AuthorDao();
    }

    public static AuthorService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final AuthorService INSTANCE = new AuthorService();
    }

    public List<Author> getAuthorsList() {
        return ((AuthorDao) authorDao).findAll();
    }

    public AuthorDto getAuthorDtoById(long authorId) {
        AuthorDto authorDto = new AuthorDto();
        Author author = authorDao.findAuthorById(authorId);
        authorDto.setFirstName(author.getFirstName());
        authorDto.setLastName(author.getLastName());
        authorDto.setFrom(author.getBirthPlace());
        authorDto.setId(author.getId_author());
        return authorDto;
    }

    public Author getAuthorById (long authorId){
        return authorDao.findAuthorById(authorId);
    }
}
