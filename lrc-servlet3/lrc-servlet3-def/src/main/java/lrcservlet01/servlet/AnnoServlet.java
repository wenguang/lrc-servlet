package lrcservlet01.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="anno", urlPatterns = {"/anno"})
public class AnnoServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("注解servlet init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("用注解实现的servlet doGet");
    }
}
