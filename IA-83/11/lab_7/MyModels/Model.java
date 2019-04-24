package MyModels;

import java.util.ArrayList;

public class Model {

    public int GetNumberOfStudents(University univ) {
        int result = 0;
        for (Faculty f : univ.faculties) {
            result += f.getStudentList().size();
        }
        return result;
    }
    public String MaxFaculty(University univ) {
        Faculty max = univ.faculties.get(0);
        for (Faculty f : univ.faculties) {
            if (max.compareTo(f) > 0) {
                max = f;
            }
        }
        return max.name;
    }
    public ArrayList<Student> MaxScore(University univ) {
        ArrayList<Student> MaxNumber = new ArrayList<Student>();
        for (Faculty f : univ.faculties) {
            for (Student s : f.studentList) {
                if (s.AverageScore >= 95) {
                    MaxNumber.add(s);
                }
            }
        }
        return MaxNumber;
    }

}
