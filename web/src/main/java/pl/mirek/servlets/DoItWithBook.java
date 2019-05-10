package pl.mirek.servlets;


import pl.mirek.tools.ShowInputValues;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "DoItWithBook", urlPatterns = "/doItWithBook")
public class DoItWithBook extends HttpServlet {
    private final String SELECTION = "optradio";
    private final String ACTION = "command";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ShowInputValues inputs = new ShowInputValues(request);
        inputs.printInputValues();
        String action;

        if (request.getParameter(SELECTION) == null) {
            request.setAttribute("selection", "0");
        } else {
            request.setAttribute("selection", request.getParameter(SELECTION));
        }
        System.out.println("Main SERVLET --------------------------------------->");

        switch (request.getParameter(ACTION)) {
            case "ADDBOOK":
                request.getRequestDispatcher("addNewBookFormServlet").forward(request, response);
                break;

            case "EDITBOOK":
                request.setAttribute("editable", "");
                request.setAttribute("pagetitle", "Library - edit book");
                request.getRequestDispatcher("showBookDetailsServlet").forward(request, response);
                break;

            case "SHOWBOOK":
                request.setAttribute("editable", "readonly");
                request.setAttribute("pagetitle", "Library - book details");
                request.getRequestDispatcher("showBookDetailsServlet").forward(request, response);
                break;

            case "WRITEBOOK":
                request.getRequestDispatcher("writeBookServlet").forward(request, response);
                break;

            case "DELETE":
                break;

            case "HOME":
                request.getRequestDispatcher("showAllBooksServlet").forward(request, response);
                break;

            case "ALLAUTHORS":
                request.getRequestDispatcher("showAllAuthorsServlet").forward(request, response);
                break;

            case "EDITAUTHOR":
                request.setAttribute("editable", "");
                request.setAttribute("pagetitle", "Library - edit book");
                request.getRequestDispatcher("showAuthorServlet").forward(request, response);
                break;

            case "SHOWAUTHOR":
                request.setAttribute("editable", "readonly");
                request.setAttribute("pagetitle", "Library - book details");
                request.getRequestDispatcher("showAuthorServlet").forward(request, response);
                break;

            case "BORROWERS":
                request.getRequestDispatcher("showAllBorrowersServlet").forward(request, response);
                break;

            case "BORROWBOOKLIST":

                request.getRequestDispatcher("showRentalBooksServlet").forward(request, response);
                break;

            case "BORROWBOOK":
                request.getRequestDispatcher("borrowBookServlet").forward(request, response);
                break;

            default:

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
