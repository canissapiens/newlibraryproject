package pl.mirek.dao;

import pl.mirek.model.Author;

public interface IAuthorDao {

void save (Author author);

void cleanUP();
}
