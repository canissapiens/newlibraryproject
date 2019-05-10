package pl.mirek.dto;

import lombok.Data;

@Data
public class BookDetailsWithAuthorDto {

    private long id;
    private String title;
    private String author;
    private long authorId;
    private int issueYear;
    private String isbn;
    private boolean borrowed;
    private int pages;

    public BookDetailsWithAuthorDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
