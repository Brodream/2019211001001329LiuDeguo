package lab1;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class LifeCycleServlet extends HttpServlet {

    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws  ServletException, IOException {

        System.out.println("service");
        //System.out.println(getServletConfig().getInitParameter("email"));
    }

    public void destroy() {
        System.out.println("destroy");
    }
}//end of class