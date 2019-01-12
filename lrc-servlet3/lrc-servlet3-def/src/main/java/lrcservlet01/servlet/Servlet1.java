package lrcservlet01.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {

    public Servlet1() {
        System.out.println("servlet1 load on startup");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("servlet1 init");
        //super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet1 doGet");
        //super.doGet(req, resp);
    }
}
