import java.util.ArrayList;
import java.util.List;

public class Model {
    private Institute kpi = new Institute("КПИ");

    private Faculty fiot = new Faculty("ФИОТ", kpi);
    private Faculty ipsa = new Faculty("ИПСА", kpi);
    private Faculty fmo = new Faculty("ФМО", kpi);
    private Faculty uf = new Faculty("ЮФ", kpi);

    private Student s1 = new Student("Артем", "Топольский", 28, 87, fiot);
    private Student s2 = new Student("Александр", "Ивашина", 13, 93, fiot);
    //private Student s3 = new Student("Albert", "Einstein", 3, 100, ipsa);
    private Student s4 = new Student("Ricardo", "Milos", 21, 15, ipsa);
    private Student s5 = new Student("Samanta", "Smith", 17, 76, fmo);
    private Student s6 = new Student("Saul", "Goodman", 5, 96, uf);

    public int getStudentsCount() {
        int count = 0;
        for (Faculty fac : kpi.getFacultyList()) {
            for (Student stud : fac.getStudentList()) {
                count++;
            }
        }
        return count;
    }

    public Faculty getLargestFaculty() {
        int globalcount = 0;
        Faculty theLargest = null;
        for (Faculty faculty : kpi.getFacultyList()) {
            int count = 0;
            for (Student stud : faculty.getStudentList()) {
                count++;
            }
            if (count >= globalcount) {
                globalcount = count;
                theLargest = faculty;
            }
        }
        return theLargest;
    }

    public List<String> getGoodStudentsList() {
        List<String> list = new ArrayList();
        for (Faculty fac : kpi.getFacultyList()) {
            for (Student stud : fac.getStudentList()) {
                if (stud.getMark() >= 95 && stud.getMark() <= 100) {
                    String student = stud.getSurname() +" "+ stud.getName()+" - средний балл:" + stud.getMark();
                    list.add(student);
                }
            }
        }
        return list;
    }



}
