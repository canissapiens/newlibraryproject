package pl.mirek.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="borrower")
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_borrower")
    private Long id_borrower;

    @Column(name="first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    @Column(name="borrower_details_id")
    private Long borrowerDetailsId;

    @ManyToMany(mappedBy="borrowers")
    private List<Book> books;

    @OneToOne
    @JoinColumn(name="id_borrower_detail")
    private BorrowerDetails details;


}
