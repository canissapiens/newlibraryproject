package pl.mirek.servlets;

import pl.mirek.dto.BookDetailsWithAuthorDto;
import pl.mirek.dto.NewBookWithAuthorsListDto;
import pl.mirek.model.Author;
import pl.mirek.services.AuthorService;
import pl.mirek.services.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddNewBookFormServlet", urlPatterns = "/addNewBookFormServlet")
public class AddNewBookFormServlet extends HttpServlet {

    private final BookService bookService;
    private final AuthorService authorService;

    public AddNewBookFormServlet() {
        bookService = BookService.getInstance();
        authorService = AuthorService.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Author> authors = authorService.getAuthorsList();
        List<String> selections = new ArrayList<>();

        System.out.println("Parametr optradio -------> " + request.getParameter("optradio"));
        for (Author a : authors) {
            // String s = String.valueOf(a.getId_author());
            if (String.valueOf(a.getId_author()).equals(request.getParameter("optradio"))) {
                selections.add("selected");
            } else {
                selections.add("");
            }
        }
        request.setAttribute("authorsselections", selections);

        NewBookWithAuthorsListDto bookDetails = new NewBookWithAuthorsListDto();
        if (request.getParameter("newbookform") == null) {
            bookDetails.setTitle("");
        } else {
            bookDetails.setTitle(request.getParameter("title"));
        }

        bookDetails.setId(0L);
        bookDetails.setIsbn("");
        bookDetails.setIssueYear(0);
        bookDetails.setPages(0);
        bookDetails.setAuthors(authors);
        request.setAttribute("bookDTO", bookDetails);
        request.getRequestDispatcher("addnewbook.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
