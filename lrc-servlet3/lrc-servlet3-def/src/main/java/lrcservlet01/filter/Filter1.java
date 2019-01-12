package lrcservlet01.filter;

import javax.servlet.*;
import java.io.IOException;

public class Filter1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("filter1 init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException

    {
        System.out.println("filter1 doFilter");
        /**
         * 若没有下面这句，Servlet1中的doGet方法将不执行，因为过滤器把Servlet1上的请求拦截了，
         * 我理解：若过滤链没有向下传导，那请求就终止了
         */
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("filter destroy");
    }
}
