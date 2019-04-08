package MyModels;

import java.util.ArrayList;
import java.util.List;

public class University {
   public String name;
    List<Faculty> faculties;

    public University(String name, ArrayList<Faculty> faculties) {
        this.name = name;
        this.faculties = faculties;
    }
}
