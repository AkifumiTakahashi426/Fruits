package servlet;

import java.io.IOException;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Main() {
        super();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=Shift_JIS");// [4]

        String[] checkedFruits = request.getParameterValues("checkbox");// [5]
        PrintWriter out = response.getWriter();// [6]
        out.println("<html><head></head><body>");// [7]
        out.print("<p>あなたが好きな果物は");// [8]
        for (String fruit : checkedFruits) {// [9]
            out.print("[" + fruit + "]");// [9]
        } // [10]
        out.println("です。</p>");// [11]
        out.println("</body></html>");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
