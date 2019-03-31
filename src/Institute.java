import java.util.ArrayList;
import java.util.List;

public class Institute {
    private String name;
    private List<Faculty> Faculties = new ArrayList();

    public Institute(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addFaculty(Faculty faculty) {
        Faculties.add(faculty);
    }
    public List<Faculty> getFacultyList() {
        return Faculties;
    }
}
