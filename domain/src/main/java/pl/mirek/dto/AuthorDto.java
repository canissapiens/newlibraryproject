package pl.mirek.dto;

import lombok.Data;

@Data
public class AuthorDto {

    private long id;
    private String firstName;
    private String lastName;
    private String from;

}
