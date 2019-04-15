import java.util.ArrayList;
import java.util.Iterator;
public class Institute {
    public String insName;
    private  ArrayList<Faculty> faculties = new ArrayList();

    public Institute() {}

    public Institute(String insName) {
        this.insName = insName;
    }

    public String getInsName() {
        return insName;
    }

    public void addFaculty(String fcName) {
        faculties.add(new Faculty(fcName));
    }

    public void addStudent(String fcName, String sdName, String sdSurname, int sdRecBook, int sdAvgGrade) {
        for(Faculty faculty : faculties) {
            if(faculty.fcName == fcName) {
                faculty.addStudent(sdName, sdSurname, sdRecBook, sdAvgGrade);
                return;
            }
        }
    }

    public int getAllStudents() {
        int quantity = 0;
        Iterator<Faculty> facultyIterator = faculties.iterator();

        while(facultyIterator.hasNext()) {
            Faculty currentFaculty = facultyIterator.next();
            quantity += currentFaculty.quantityStudents;
        }

        return quantity;
    }

    public Faculty getLargestFaculty() {
        Faculty largestFaculty = new Faculty();
        Iterator iterator = faculties.iterator();

        while(iterator.hasNext()) {
            Faculty currentFaculty = (Faculty) iterator.next();

            if(largestFaculty == null) {
                largestFaculty = currentFaculty;
            }

            if(largestFaculty.quantityStudents < currentFaculty.quantityStudents) {
                largestFaculty = currentFaculty;
            }
        }

        return largestFaculty;
    }

    public ArrayList<Student> getBestStudents() {
        ArrayList<Student> bestStudents = new ArrayList();

        for(Faculty currentFaculty : faculties) {
            for(Student student : currentFaculty.students) {
                if(student.sdAvgGrade >= 95 && student.sdAvgGrade <= 100) {
                    bestStudents.add(student);
                }
            }
        }

        return bestStudents;
    }
}
