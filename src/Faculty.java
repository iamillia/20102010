import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> Students = new ArrayList();

    public Faculty(String name, Institute institute) {
        this.name = name;
        institute.addFaculty(this);
    }

    public void addStudent(Student student) {
        Students.add(student);
    }
    public List<Student> getStudentList() {
        return Students;
    }
    public String getName() {
        return name;
    }
}
