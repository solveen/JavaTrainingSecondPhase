package ServletPractice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPractice2", urlPatterns = "/sessions")
public class ForSession1 extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    //first request then response on parameter
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriters = response.getWriter();
        HttpSession session = request.getSession(false);

        String email = (String) session.getAttribute("email");

        printWriters.println("<form action = 'sessions2' method = 'Post' >");
        printWriters.println("<p>Click to view your email</p>");
        printWriters.println("<input type = 'hidden' name = 'email' value = " + email + ">");
        printWriters.println("<button type = 'submit'> Submit </button>");
        printWriters.println("</form>");
        printWriters.close();

    }

}