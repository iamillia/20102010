import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Controller extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String aParam =  request.getParameter("choise");
        int choise = Integer.parseInt(aParam);

        Model model = new Model();
        switch (choise) {
            case 1 :
                int count = model.getStudentsCount();
                request.setAttribute("count", count);
                break;
            case 2:
                String faculty;
                if (model.getLargestFaculty() != null) {
                    faculty = model.getLargestFaculty().getName();
                } else {
                    faculty = "факультет не существует";
                }
                request.setAttribute("faculty", faculty);
                break;
            case 3:
                List<String> list = model.getGoodStudentsList();
                request.setAttribute("list", list);
        }

        request.setAttribute("choise", choise);
        request.getRequestDispatcher("view.jsp").forward(request,response);
    }


}
