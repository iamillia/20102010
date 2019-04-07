import java.util.ArrayList;

public class Faculty {
    String name;
    ArrayList<Student> allStudent;

    public Faculty(String name, ArrayList<Student> allStudent) {
        this.name = name;
        this.allStudent = allStudent;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", allStudent=" + allStudent +
                '}';
    }
}
