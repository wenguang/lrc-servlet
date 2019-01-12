package lrcservlet01.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "annoFilter", servletNames = {"anno"}, dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD})
public class AnnoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("注解filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("注解filter doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("注解filter destroy");
    }
}
