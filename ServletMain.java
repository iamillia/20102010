import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletMain")
public class ServletMain extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();

        String a = "";
        String b = "";
        String c = "";
        String d = "";

        if(!session.isNew()) {
            a = session.getAttribute("a").toString();
            b = session.getAttribute("b").toString();
            c = session.getAttribute("c").toString();
            d = session.getAttribute("d").toString();
        }
        out.println("<html>\n" +
                "<head>\n" +
                "  <title>Онлайн вычисление по формуле</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action = \"servlets/calculate\" method = \"GET\">\n" +
                "  <p><b>Введите параметры:</b></p>\n");

        out.println(
                "  <p>A:</p>\n" +
                "  <input type = \"text\" name =\"a\" value =\"" + a + "\"/>\n" +
                "  <br>\n" +
                "  <p>B:</p>\n" +
                        "  <input type = \"text\" name =\"b\" value =\"" + b + "\"/>\n" +
                "  <br>\n" +
                "  <p>C:</p>\n" +
                        "  <input type = \"text\" name =\"c\" value =\"" + c + "\"/>\n" +
                "  <br>\n" +
                "  <p>D:</p>\n" +
                        "  <input type = \"text\" name =\"d\" value =\"" + d + "\"/>\n" +
                "  <br>\n");

        out.println(
                "  <input type = \"submit\" value = \"Получить результат!\"/>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }
}
