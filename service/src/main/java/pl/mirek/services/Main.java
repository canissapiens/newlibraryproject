package pl.mirek.services;

import pl.mirek.model.Author;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AuthorService authorService = AuthorService.getInstance();
        List<Author> authors = authorService.getAuthorsList();

        System.out.println(authors.size());
    }
}
