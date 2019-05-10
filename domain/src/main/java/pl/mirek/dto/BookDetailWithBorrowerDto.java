package pl.mirek.dto;

import lombok.Data;

@Data
public class BookDetailWithBorrowerDto {

    private String title;
    private String author;
    private String isbn;
    private int issueYear;
    private boolean borrowed;
    private String borrower;

}
