package pl.mirek.dao;

import pl.mirek.model.Borrower;

import java.util.List;

public interface IBorrowerDao {


    void save(Borrower borower);

    List<Borrower> findAll();

    Borrower findBorrowerById(long borrowerId);

    void cleanUp();
}
