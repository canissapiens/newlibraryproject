package pl.mirek.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "borrower_details")

public class BorrowerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_borrower_details")
    private Long idBorrowerDetails;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @OneToOne(mappedBy = "details")
    private Borrower borrower;

}
