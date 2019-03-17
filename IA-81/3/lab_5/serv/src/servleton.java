import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import static java.lang.Math.*;

public class servleton extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response ) throws SecurityException,IOException {
        response.setContentType("text/html;charset=UTF-16");
        PrintWriter printWriter = response.getWriter();
        try {

            Cookie cookies =new Cookie("a","-3.75");
            cookies.setMaxAge(60*60*24*2);
            response.addCookie(cookies);

            String aParam = request.getParameter("a");
            String bParam = request.getParameter("b");
            String cParam = request.getParameter("c");
            String dParam = request.getParameter("d");



            double a = Double.parseDouble(aParam);
            double b = Double.parseDouble(bParam);
            double c = Double.parseDouble(cParam);
            double d = Double.parseDouble(dParam);
            double y = pow((4*cosh(sqrt(abs(a/b)))+3*acos(d)), c);

            printWriter.println("<!DOCTYPE html>");
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Servlet</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println(String.format("y = pow((4*cosh(sqrt(abs(%f/%f)))+3*acos(%f)), %f) = %f",a,b,d,c,y));
            printWriter.println("<body>");
            printWriter.println("</html>");
        } finally {
            printWriter.close();
        }
    }
}
