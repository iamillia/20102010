import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, NullPointerException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out= response.getWriter();

        try {
            String aParam = request.getParameter("a");
            String bParam = request.getParameter("b");
            String cParam = request.getParameter("c");
            String dParam = request.getParameter("d");
            double a = Double.parseDouble(aParam);
            double b = Double.parseDouble(bParam);
            double c = Double.parseDouble(cParam);
            if(c<0){
                response.sendError(406,"param c cant be less then 0");
            }
            double d = Double.parseDouble(dParam);
            HttpSession session = request.getSession();
            session.setAttribute("a", Double.toString(a));
            session.setAttribute("b", Double.toString(b));
            session.setAttribute("c", Double.toString(c));
            session.setAttribute("d", Double.toString(d));
            session.setMaxInactiveInterval(60 * 60 * 48);
            double result = Math.pow((2 * Math.sin(a) + Math.cos(Math.abs(b * Math.sqrt(c)))), d);

            out.println("<html>");
            out.println("<head>");
            out.println("<title>ServletCalculator</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("Calculated! Your result is " + result);
            out.println("<br>By the way, we were using .jps before Mr.Bukasov gave us a lecture about it ");
            out.println("<br><img src=\"think.gif\" height=\"200\" width=\"400\">");
            out.println("<br><a href='index.jsp'>Back to math</a>");
            out.println("</body>");
            out.println("</html>");

        }
        finally {
            out.close();
        }

    }
}
