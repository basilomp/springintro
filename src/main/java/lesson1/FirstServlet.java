package lesson1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "lesson1.FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet implements Servlet {
    private transient ServletConfig config;
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("New request");
        servletResponse.getWriter().println("<h1>My first servlet</h1>");
        logger.info("Request close");
    }

    @Override
    public String getServletInfo() {
        return "lesson1.FirstServlet";
    }

    @Override
    public void destroy() {
        logger.info("Destroyed");
    }
}
