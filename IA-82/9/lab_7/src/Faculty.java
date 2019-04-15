import java.util.ArrayList;

public class Faculty extends Institute{
    public String fcName;
    protected int quantityStudents = 0;
    protected ArrayList<Student> students = new ArrayList();

    public Faculty() {}

    public Faculty(String fcName) {
        this.fcName = fcName;
    }

    public void addStudent(String sdName, String sdSurname, int sdRecBook, int sdAvgGrade) {
        students.add(new Student(sdName, sdSurname, sdRecBook, sdAvgGrade));
        quantityStudents++;
    }
}
