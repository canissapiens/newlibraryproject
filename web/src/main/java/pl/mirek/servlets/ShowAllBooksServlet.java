package pl.mirek.servlets;

import pl.mirek.model.Book;
import pl.mirek.services.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="ShowAllBooksServlet", urlPatterns = "/showAllBooksServlet")
public class ShowAllBooksServlet extends HttpServlet {

    private final BookService bookService;

    public ShowAllBooksServlet() {
        this.bookService = BookService.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showAllBooks(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showAllBooks(request, response);
    }

    private void showAllBooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> books = bookService.getBooksList();
        request.setAttribute("booklist", books);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}