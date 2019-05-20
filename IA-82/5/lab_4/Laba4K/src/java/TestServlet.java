import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
        *
        * @author User
        */
public class TestServlet extends HttpServlet {

    /*
            * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
            * methods.
     *
             * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ops = request.getParameter("ops");
        System.out.println(ops);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<body  background=\"С:\\Users\\фон.jpg\">");
        out.println("<title>Камм Катерина</title>");
        out.println("Привіт, "+ops +", мене звати Катя");
        out.println("<p>");
        out.println(ops+",Не забувай підписуватись на мне в Instagram");
        out.println("<p>");

        out.println("<p>");
        out.println("<a style=\"float: left\" href=\"https://www.instagram.com/kamm_hamm/\">Мій Instagram-профіль</a></h2>");

        out.close();
    }
}