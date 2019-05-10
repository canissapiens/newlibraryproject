package pl.mirek.servlets;

import pl.mirek.model.Author;
import pl.mirek.services.AuthorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowAllAuthorsServlet", urlPatterns = "/showAllAuthorsServlet")
public class ShowAllAuthorsServlet extends HttpServlet {

    private final AuthorService authorService;

    public ShowAllAuthorsServlet() {
        authorService = AuthorService.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Author> authors = authorService.getAuthorsList();
        request.setAttribute("authorlist", authors);
        request.getRequestDispatcher("authorlist.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
