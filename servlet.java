import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class servlet extends HttpServlet {

    public static final int AGE_COOKIE = 3600 * 24 * 2;
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String aParam =  request.getParameter("a");
            String bParam =  request.getParameter("b");
            String cParam =  request.getParameter("c");
            String dParam =  request.getParameter("d");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Это сервлет</title>");
            out.println("</head>");
            out.println("<body>");
            if (isNum(aParam) & isNum(bParam) & isNum(cParam) & isNum(dParam)) {
                Double a = Double.parseDouble(aParam);
                Double b = Double.parseDouble(bParam);
                Double c = Double.parseDouble(cParam);
                Double d = Double.parseDouble(dParam);
                double result = 2 * Math.sqrt(Math.tan(Math.abs(a+c))) + (Math.log10(b)/(Math. pow(c, d)));
                out.println("Результат:" + result);
            } else {
                out.println("<h3>Вы ввели недопустимые параметры!</h3>");
            }
            out.println("<p><img src=\"pictures/poroshenko.jpg\" alt=\"Результат\"></p>");
            out.println("</body>");
            out.println("</html>");

        }
    }



    public static boolean isNum(String s) {
        try {
            Double.parseDouble(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        return true;
    }




}
