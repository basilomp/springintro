package assignment1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "Servlet", urlPatterns = "/products")
public class Servlet extends HttpServlet {
    Shopbuilder shopbuilder = new Shopbuilder();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        List<Product> products = shopbuilder.prepareProducts();
        for (Product product : products) {
            out.println(product);
        }
    }
}
