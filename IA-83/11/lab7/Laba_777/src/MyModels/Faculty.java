package MyModels;

import java.util.List;

public class Faculty implements Comparable<Faculty>{
    String name;
    List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public Faculty(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;

    }
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Faculty f) {
        if (f.studentList.size() < this.studentList.size()) {
            return -1;
        } else if (f.studentList.size() == this.studentList.size()) {
            return 0;
        } else {
            return 1;
        }

    }
}
