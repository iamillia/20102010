
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ParamServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("  <head><title>Формула</title></head>");
            out.println("  <body>");
            out.println("       <form action='temp', method='get'>");
            out.println("           a=<input type='text' name='a' value=''>");
            out.println("           b=<input type='text' name='b' value=''>");
            out.println("           c=<input type='text' name='c' value=''>");
            out.println("           d=<input type='text' name='d' value=''>");
            out.println("           <input type='submit' name='Submit'>");
            out.println("       </form>");
            out.println("  </body>");
            out.println("</html>");
        }
    }
}