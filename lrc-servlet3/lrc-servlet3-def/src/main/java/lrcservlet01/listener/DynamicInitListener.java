package lrcservlet01.listener;

import lrcservlet01.servlet.DynamicServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;

@WebListener
public class DynamicInitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("动态init Listener init");

        ServletContext context = servletContextEvent.getServletContext();

        //context.addListener("lrcservlet01.listener.DynamicServletContextListener");

        ServletRegistration.Dynamic dynamicServlet1 = context.addServlet("dynamicServlet1", DynamicServlet.class);
        dynamicServlet1.setLoadOnStartup(1);
        dynamicServlet1.addMapping("dynamic1");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("动态init Listener destroy");
    }
}
