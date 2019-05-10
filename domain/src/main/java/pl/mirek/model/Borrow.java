package pl.mirek.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name="borrow")

public class Borrow implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name= "id_borrow")
    private Long idBorrow;

    @Column(name="book_id")
    private Long bookId;

    @Column(name="borrower_id")
    private Long borrowerID;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_login")
    private Date lastLogin;

}
