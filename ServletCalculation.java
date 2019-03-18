import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCalculation")
public class ServletCalculation extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        String title = "Результат вычисления";
        try {
            double a = Double.parseDouble(request.getParameter("a"));
            double b = Double.parseDouble(request.getParameter("b"));
            double c = Double.parseDouble(request.getParameter("c"));
            double d = Double.parseDouble(request.getParameter("d"));

            HttpSession session = request.getSession();
            session.setAttribute("a", Double.toString(a));
            session.setAttribute("b", Double.toString(b));
            session.setAttribute("c", Double.toString(c));
            session.setAttribute("d", Double.toString(d));
            session.setMaxInactiveInterval(60 * 60 * 48);

            if(c != 0 && b > 0) {
                double result = getResult(a, b, c, d);
                out.print(
                        "<html><head><title>" +
                        title +
                        "</title></head>" +
                        "<body>" +
                        "<p>Ответ: \n" + "<br>" +
                        result +
                        "</body></html>"
                );
            } else {
                out.println("<meta http-equiv='refresh' content='3; URL=/'>");
                out.print("<p>Ошибка! Неверные параметры.</p>");
            }
        } catch(NumberFormatException e) {
            out.println("<meta http-equiv='refresh' content='3; URL=/'>");
            out.print("<p>Ошибка! Заполните все поля.</p>");
        } catch(Exception e) {
            out.println("<meta http-equiv='refresh' content='3; URL=/'>");
            out.print("<p>Ошибка! Повторите попытку позже.</p>");
        }
    }

    private double getResult(double a, double b, double c, double d) {
        return Math.sqrt(Math.abs(Math.sin(a) - (4 * Math.log(b))/(Math.pow(c, d))));
    }
}