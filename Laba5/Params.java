import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Params extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            Cookie[] cs = req.getCookies();
            if (cs.length > 1) {
                out.write("<!DOCTYPE html>");
                out.write("<html lang=\"en\">");
                out.write("<head>\n");
                out.write("    <meta charset=\"UTF-8\">");
                out.write("    <title>Параметры</title>\n");
                out.write("</head>");
                out.write("<body>\n");
                out.write("    <form action='temp' method='get'>\n");
                out.write("           <p>a=<input type='text' name='a' value='" + cs[1].getValue() + "'required/></p>\n");
                out.write("           <p>b=<input type='text' name='b' value='" + cs[2].getValue() + "'required/></p>\n");
                out.write("           <p>c=<input type='text' name='c' value='" + cs[3].getValue() + "'required/></p>\n");
                out.write("           <p>d=<input type='text' name='d' value='" + cs[4].getValue() + "'required/></p>\n");
                out.write("        <input type=\"submit\" value=\"Отправить\">\n");
                out.write("     </form>");
                out.write("</body>");
                out.write("</html>");
            } else {
                out.write("<!DOCTYPE html>");
                out.write("<html lang='en'>");
                out.write("<head>\n");
                out.write("    <meta charset='UTF-8'>");
                out.write("    <title>Параметры</title>\n");
                out.write("</head>");
                out.write("<body>\n");
                out.write("    <form action='temp' method='get'>\n");
                out.write("           <p>a=<input type='text' name='a' value='0' required/></p>\n");
                out.write("           <p>b=<input type='text' name='b' value='0' required/></p>\n");
                out.write("           <p>c=<input type='text' name='c' value='0' required/></p>\n");
                out.write("           <p>d=<input type='text' name='d' value='0' required/></p>\n");
                out.write("        <input type=\"submit\" value=\"Отправить\">\n");
                out.write("     </form>");
                out.write("</body>");
                out.write("</html>");
            }
        }
    }
}
