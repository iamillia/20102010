import java.util.ArrayList;

public class University {
    String name;
    ArrayList<Faculty> allFaculty;

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", allUniversity=" + allFaculty +
                '}';
    }

}
