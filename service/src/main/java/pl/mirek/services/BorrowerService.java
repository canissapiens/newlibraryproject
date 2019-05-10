package pl.mirek.services;

import pl.mirek.dao.IBorrowerDao;
import pl.mirek.dao.impl.BorrowerDao;
import pl.mirek.dto.BorrowerDto;
import pl.mirek.model.Borrower;

import java.util.List;

public class BorrowerService {
    private IBorrowerDao borrowerDao;

    private BorrowerService() {
        borrowerDao = new BorrowerDao();
    }

    public static BorrowerService getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final BorrowerService INSTANCE = new BorrowerService();
    }

    public void save(Borrower borrower) {
        borrowerDao.save(borrower);
    }

    public List<Borrower> getBorrowersList(){
        return ((BorrowerDao) borrowerDao).findAll();
    }

    public Borrower getBorrowerById (long borrowerId){
        return borrowerDao.findBorrowerById(borrowerId);
    }
}
