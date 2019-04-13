package pl.mirek.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_book;

    @Column(name = "borrow", nullable = false)
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean borrow;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "isbn", nullable = false)
    private String isbn;

    @Column(name = "pages")
    private int pages;

    @Column(name = "release_date")
    private int releaseDate;

    @Column(name="summary")
    private String summary;

    @Column(name="title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;


    @ManyToMany
    @JoinTable(name = "borrow",
            joinColumns = {@JoinColumn(name = "book_id", referencedColumnName = "id_book")},
            inverseJoinColumns = {@JoinColumn(name = "borrower_id", referencedColumnName = "id_borrower")})
    private List<Borrower> borrowers;

}
