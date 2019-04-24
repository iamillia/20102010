import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import static java.lang.Math.*;


public class Servlet extends javax.servlet.http.HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String aParam = request.getParameter("a");
            String bParam = request.getParameter("b");
            String cParam = request.getParameter("c");
            String dParam = request.getParameter("d");
            response.addCookie(new Cookie("a", aParam));
            response.addCookie(new Cookie("b", bParam));
            response.addCookie(new Cookie("c", cParam));
            response.addCookie(new Cookie("d", dParam));
            for(Cookie i : request.getCookies())
                i.setMaxAge(3600);
            String head = "ERROR";
            ArrayList<String> body = new ArrayList<>();
            if ((aParam.equals("") || bParam.equals("") || cParam.equals("") || dParam.equals(""))) {
                body.add("<h1 align=\"center\" style=\"color:darkred\">" +
                         "OOOOOOOOPS! You don't write anything! Please try again :) ");
            }
            else {
                try {
                    double a = Double.parseDouble(aParam);
                    double b = Double.parseDouble(bParam);
                    double c = Double.parseDouble(cParam);
                    double d = Double.parseDouble(dParam);

                    double result = sqrt(abs((sin(a) - 4 * Math.log(b)/ pow(c, d))));
                    head = "Servlet Calculator";
                    body.add(String.format("<h1>sqrt( sin(%g) - 4 * log(%g)/pow(%g, %g)))", a, b, c, d));
                    body.add("<h1>result = " + result);
                } catch (NumberFormatException e) {
                    body.add("<h1 align=\"center\" style=\"color:indianred\">" +
                            "This program don't count letters, dear!");
                }
            }
            out.println("<!DOCTYPE html>\n<html>\n<head>\n<title>" + head + "</title>\n</head>\n<body>");
            for(String i : body)
                out.println(i + "</h1><br>");
            out.println("</body>\n</html>");
        }
    }
}

