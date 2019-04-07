
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/bs")
public class ServletBest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

            Model m = new Model();
            m.allObject(m.KPI);
            req.setAttribute("option", req.getParameter("option"));
            req.setAttribute("BestStudents", m.id());
            req.setAttribute("count", m.countStudents());
            req.setAttribute("BigFac", m.faculty());
            req.setAttribute("KPI", m.kopei());

        RequestDispatcher rq = req.getRequestDispatcher("index.jsp");
        rq.forward(req, resp);
    }
}
