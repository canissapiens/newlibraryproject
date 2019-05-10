package pl.mirek.servlets;

import pl.mirek.model.Book;
import pl.mirek.services.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BorrowBookServlet", urlPatterns = "/borrowBookServlet")


public class BorrowBookServlet extends HttpServlet {

    private BookService bookService;

    public BorrowBookServlet() {
        bookService = BookService.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("------> BorrowBookServlet");
        request.getRequestDispatcher("booktorent.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
