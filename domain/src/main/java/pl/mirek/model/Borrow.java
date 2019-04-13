package pl.mirek.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="borrow")

public class Borrow {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name= "id_borrow")
    private Long idBorrow;

    @Column(name="book_id")
    private Long bookId;

    @Column(name="borrower_id")
    private Long borrowerID;



}
