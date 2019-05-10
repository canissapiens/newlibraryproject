package pl.mirek.servlets;

import pl.mirek.services.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddNewBookServlet", urlPatterns = "/addNewBookServlet")
public class AddNewBookServlet extends HttpServlet {

    private final BookService bookService;

    public AddNewBookServlet() {
        this.bookService = BookService.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
