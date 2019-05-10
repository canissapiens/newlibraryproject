package pl.mirek.dto;

import lombok.Data;

@Data
public class BorrowerDto {
    private long id;
    private String firstName;
    private String lastName;
    private String address;

}
