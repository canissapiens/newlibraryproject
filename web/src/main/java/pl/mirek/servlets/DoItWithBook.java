package pl.mirek.servlets;

import pl.mirek.dao.IAuthorDao;
import pl.mirek.dao.impl.AuthorDao;
import pl.mirek.model.Author;
import pl.mirek.tools.ShowInputValues;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DoItWithBook", urlPatterns = "/doItWithBook")
public class DoItWithBook extends HttpServlet {
    private final String ACTION = "optradio";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ShowInputValues inputs = new ShowInputValues(request);
        inputs.printInputValues();
        if (request.getParameter(ACTION)  == null){
            System.out.println("Nie zaznaczyles pozycji ");
        }


        request.getRequestDispatcher("/").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
