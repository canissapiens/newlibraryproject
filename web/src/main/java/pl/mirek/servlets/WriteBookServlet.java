package pl.mirek.servlets;

import pl.mirek.model.Author;
import pl.mirek.model.Book;
import pl.mirek.services.AuthorService;
import pl.mirek.services.BookService;
import pl.mirek.validator.Validator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "WriteBookServlet", urlPatterns = "/writeBookServlet")
public class WriteBookServlet extends HttpServlet {

    private final BookService bookService;
    private final AuthorService authorService;
    private final Validator validator;

    public WriteBookServlet() {
        this.bookService = BookService.getInstance();
        this.authorService = AuthorService.getInstance();
        this.validator = Validator.getInstance();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("\n\nWriteBookServlet ----------->");
        if (request.getParameter("newbookform") == null) {

            Long id_book = 0L;

            try {
                id_book = Long.valueOf(request.getParameter("optradio"));
            } catch (Exception e) {
                throw new ServletException("Invalid number format");
            }

            Book book = bookService.getBookById(id_book);

            System.out.println("Id Book --------> " + id_book);
            System.out.println("Book Title -----> " + book.getTitle());

            if (!request.getParameter("title").equals(book.getTitle())) {
                book.setTitle(request.getParameter("title"));
            }

            if (!request.getParameter("year").equals(String.valueOf(book.getReleaseDate()))) {
                int date = Integer.valueOf(request.getParameter("year"));
                book.setReleaseDate(date);
            }

            book.setPages(Integer.valueOf(request.getParameter("pages")));
            book.setIsbn(request.getParameter("isbn"));

            request.setAttribute("editable", "readonly");
            request.setAttribute("pagetitle", "Library - book details");
            bookService.save(book);
            request.getRequestDispatcher("showBookDetailsServlet").forward(request, response);
        } else {
            if (request.getParameter("optradio").equals("X") || request.getParameter("title").length() == 0) {
                request.getRequestDispatcher("addNewBookFormServlet").forward(request, response);
            } else {
                Book book = new Book();

                Long id_author = 0L;
                try {
                    id_author = Long.valueOf(request.getParameter("optradio"));
                } catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("ID Autora -----------> " + id_author);

                Author author =  authorService.getAuthorById(id_author);
                book.setTitle(request.getParameter("title"));
                book.setIsbn(request.getParameter("isbn"));
                try{
                    book.setPages(Integer.valueOf(request.getParameter("pages")));
                } catch (Exception e){
                    book.setPages(0);
                }
                book.setAuthor(author);
                try {
                    book.setReleaseDate(Integer.valueOf(request.getParameter("year")));
                } catch (Exception e){
                    book.setReleaseDate(1900);
                }
                book.setBorrow(false);
                book.setCategory(request.getParameter("cathegory"));
                bookService.save(book);

                request.getRequestDispatcher("showAllBooksServlet").forward(request, response);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
