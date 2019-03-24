
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math;

@WebServlet("/temp")
public class CalcServlet extends HttpServlet {
    public boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {

            String aParam = req.getParameter("a");
            String bParam = req.getParameter("b");
            String cParam = req.getParameter("c");
            String dParam = req.getParameter("d");

            Cookie cA = new Cookie("a", aParam);
            Cookie cB = new Cookie("b", bParam);
            Cookie cC = new Cookie("c", cParam);
            Cookie cD = new Cookie("d", dParam);

            cA.setMaxAge(3600 * 24 * 2);
            cB.setMaxAge(3600 * 24 * 2);
            cC.setMaxAge(3600 * 24 * 2);
            cD.setMaxAge(3600 * 24 * 2);

            resp.addCookie(cA);
            resp.addCookie(cB);
            resp.addCookie(cC);
            resp.addCookie(cD);

            if     (isNumber(aParam) &
                    isNumber(bParam) &
                    isNumber(cParam) &
                    isNumber(dParam)) {

                double a = Double.parseDouble(aParam);
                double b = Double.parseDouble(bParam);
                double c = Double.parseDouble(cParam);
                double d = Double.parseDouble(dParam);
                double y = 0;

                if (Math.abs(Math.sin(c)) > Math.pow(Math.E, d) & Math.sin(c) < 0) {
                    resp.sendError(422);
                } else if (b == 0) {
                    resp.sendError(422);
                } else {
                    y = 3 * (Math.log(Math.abs(a / b)) + Math.sqrt((Math.sin(c) + Math.pow(Math.E, d))));
                }

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head> <title>Servlet Calculator</title> </head>");
                out.println("<body>");
                out.println("<h1>" + y + "</h1>");
                out.println("</body>");
                out.println("</html>");
            } else {
                resp.sendError(422);
            }
        }
    }
}
