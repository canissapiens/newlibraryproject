package pl.mirek.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="borrower")
public class Borrower implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_borrower")
    private Long id_borrower;

    @Column(name="first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;


    @ManyToMany(mappedBy="borrowers")
    private List<Book> books = new ArrayList<>();

    @OneToOne
    @JoinColumn(name="borrower_details_id")
    private BorrowerDetails details;


}
