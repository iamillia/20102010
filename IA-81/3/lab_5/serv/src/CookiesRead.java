import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CookiesRead extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        try{
            resp.addCookie(new Cookie("a","-3.45"));
            resp.addCookie(new Cookie("b","2.34"));
            resp.addCookie(new Cookie("c","1.45"));
            resp.addCookie(new Cookie("d","0.83"));
        }finally {
            out.close();
        }
    }
}
