package pl.mirek.servlets;

import pl.mirek.dto.BookDetailsWithAuthorDto;
import pl.mirek.services.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowBookDetailsServlet", urlPatterns = "/showBookDetailsServlet")
public class ShowBookDetailsServlet extends HttpServlet {

    private final BookService bookService;

    public ShowBookDetailsServlet() {
        bookService = BookService.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id_book = 0;

        if (request.getAttribute("selection").equals("0")) {
            request.getRequestDispatcher("showAllBooksServlet").forward(request, response);
        } else {
            try {
                System.out.println("ShowBookDetailsServlet ------------------------> " + request.getParameter("optradio"));
                id_book = Long.valueOf(((String)request.getAttribute("selection")));
            } catch (Exception e) {
                throw new ServletException("To ma być liczba");
            }
            BookDetailsWithAuthorDto bookDto = bookService.getBookWithAuthorById(id_book);

            System.out.println("ShowBookDetailsServlet --------------------->  ");
            System.out.println("---------> " + bookDto.getTitle());
            request.setAttribute("bookDTO", bookDto);

            System.out.println("Book ID ------> " + ((BookDetailsWithAuthorDto) request.getAttribute("bookDTO")).getId());
            request.getRequestDispatcher("showbookdetails.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
