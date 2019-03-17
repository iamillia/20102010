import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head><title>Участник №2</title></head>");
            out.println("  <body>");
            out.println("    <h1>Горовенко Дмитрий Романович</h1>");
            out.println("    <em><h2>Горыныч!!!</h2><em>");
            out.println("    <img src=images/dimka.jpg");
            out.println("  </body>");
            out.println("</html>");
        }
    }
}
