package pl.mirek.dto;

import lombok.Data;
import pl.mirek.model.Author;

import java.util.List;

@Data
public class NewBookWithAuthorsListDto {

    private long id;
    private String title;
    private List<Author> authors;
    private long authorId;
    private int issueYear;
    private String isbn;
    private int pages;

}
