import javax.servlet.ServletException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ServletController extends javax.servlet.http.HttpServlet {
    public HashMap<String, Institute> institutes = new HashMap();

    private void institutesInit() {
        institutes.put("КПІ", new Institute("КПІ"));
        institutes.put("КНУ", new Institute("КНУ"));

        institutes.get("КПІ").addFaculty("ФІОТ");
        institutes.get("КПІ").addFaculty("ІПСА");
        institutes.get("КНУ").addFaculty("ФМФ");

        institutes.get("КПІ").addStudent("ФІОТ", "Аимя", "Афамилия", 1001, 95);
        institutes.get("КПІ").addStudent("ФІОТ", "Бимя", "Бфамилия", 1002, 98);
        institutes.get("КПІ").addStudent("ФІОТ", "Бимя", "Бфамилия", 1003, 100);
        institutes.get("КПІ").addStudent("ІПСА", "Вимя", "Вфамилия", 2001, 84);
        institutes.get("КНУ").addStudent("ФМФ", "Гимя", "Гфамилия", 3001, 96);
        institutes.get("КНУ").addStudent("ФМФ", "Димя", "Дфамилия", 3002, 95);
    }

    public void init() throws ServletException {
        institutesInit();
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String type = request.getParameter("type");

        if(type != null) {
            if (type.equals("getAll")) {
                int allStudents = institutes.get(request.getParameter("institute")).getAllStudents();
                request.setAttribute("allStudents", allStudents);
            } else if (type.equals("getLargetFaculty")) {
                Faculty largestFaculty = institutes.get(request.getParameter("institute")).getLargestFaculty();
                String largestFacultyName = largestFaculty.fcName;
                request.setAttribute("largestFacultyName", largestFacultyName);
            } else if (type.equals("getBestStudents")) {
                ArrayList<Student> bestStudents = institutes.get(request.getParameter("institute")).getBestStudents();
                request.setAttribute("bestStudents", bestStudents);
            }
        }

        request.setAttribute("institutes", institutes);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
