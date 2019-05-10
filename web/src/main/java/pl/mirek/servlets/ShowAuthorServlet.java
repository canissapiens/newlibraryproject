package pl.mirek.servlets;

import pl.mirek.dto.AuthorDto;
import pl.mirek.services.AuthorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowAuthorServlet", urlPatterns = "/showAuthorServlet")
public class ShowAuthorServlet extends HttpServlet {

    private AuthorService authorService;

    public ShowAuthorServlet() {
        this.authorService = AuthorService.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id_author = 0;

        try {
            id_author = Long.valueOf(request.getParameter("optradio"));
        } catch (NumberFormatException e) {
            e.getMessage();
        }


        AuthorDto authorDto = authorService.getAuthorDtoById(id_author);
        request.setAttribute("authorDTO", authorDto);

        request.getRequestDispatcher("showauthordetails.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
