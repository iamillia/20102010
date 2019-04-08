package Servlet;

import MyModels.Faculty;
import MyModels.Model;
import MyModels.Student;
import MyModels.University;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Student> studentlist1 = new ArrayList<>();
        Student s1 = new Student("Vlad","Sirenko",1,100);
        Student s2 = new Student("Vika","Nesterenko",1,95);
        Student s3 = new Student("Dima","Masabanda",1,80);



        studentlist1.add(s1);
        studentlist1.add(s2);
        studentlist1.add(s3);


        List<Student> studentlist2 = new ArrayList<>();
        Student s4 = new Student("Ktoto","Tam",1,83);
        studentlist2.add(s4);

        Faculty First = new Faculty("FICT",studentlist1);
        Faculty Second = new Faculty("IASA",studentlist2);
        ArrayList<Faculty> facultylist = new ArrayList<>();
        facultylist.add(First);
        facultylist.add(Second);

        University One = new University("KPI",facultylist);

        Model model = new Model();
        int FirstTask = model.GetNumberOfStudents(One);
        String SecondTask = model.MaxFaculty(One);
        ArrayList<Student> ThirdTask = model.MaxScore(One);

        req.setAttribute("Task1", FirstTask);
        req.setAttribute("Task2",SecondTask);
        req.setAttribute("Task3",ThirdTask);
        req.setAttribute("univ", One);
        req.getRequestDispatcher("View.jsp").forward(req,resp);
    }
}
