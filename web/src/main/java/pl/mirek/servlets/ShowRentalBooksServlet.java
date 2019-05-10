package pl.mirek.servlets;

import pl.mirek.model.Borrower;
import pl.mirek.services.BookService;
import pl.mirek.services.BorrowerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ShowRentalBooksServlet", urlPatterns = "/showRentalBooksServlet")
public class ShowRentalBooksServlet extends HttpServlet {

    private BookService bookService;
    private BorrowerService borrowerService;

    public ShowRentalBooksServlet() {
        this.bookService = BookService.getInstance();
        this.borrowerService = BorrowerService.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("borrowerId", request.getParameter("optradio"));
        long idBorrower = 0;
        try {
            idBorrower = Long.valueOf(request.getParameter("optradio"));
        } catch (Exception e){
            e.printStackTrace();
        }

        Borrower borrower = borrowerService.getBorrowerById(idBorrower);
        request.setAttribute("borrower", borrower);
        System.out.println("------> ShowRentalBooksServlet");
        request.getRequestDispatcher("booktorent.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
