import java.util.ArrayList;
import java.util.List;

public class Model {

    University KPI = new University("KPI", allFaculty);
    static ArrayList<Faculty> allFaculty = new ArrayList<Faculty>();
    static ArrayList<Student> FICTstudents = new ArrayList<Student>();
    static ArrayList<Student> IASAstudents = new ArrayList<>();

    public void allObject(University KPI) {
        KPI.allFaculty.clear();
        FICTstudents.clear();
        IASAstudents.clear();
        Student egor_gorban = new Student("Єгор", "Горбань", 45698346, 99.0);
        Student olga_sugak = new Student("Оля", "Сугак", 12332219, 50.0);
        Student katya_babanina = new Student("Катя", "Бабаніна", 12392219, 98.0);
        Student koval_dmitry = new Student("Дмитро", "Коваль", 12302219, 97.0);
        Student alina_hrechyn = new Student("Аліна", "Гречин", 18302219, 33.0);
        Student zinovets_anastasia = new Student("Анастасія", "Зіновець", 12702219, 94.0);
        Student lyaskovich_angelina = new Student("Ангеліна", "Ляскович", 12302119, 94.0);

        Faculty FICT = new Faculty("ФІОТ", FICTstudents);
        Faculty IASA = new Faculty("ІПСА", IASAstudents);

        KPI.allFaculty.add(FICT);
        KPI.allFaculty.add(IASA);

        FICTstudents.add(egor_gorban);
        FICTstudents.add(olga_sugak);
        FICTstudents.add(katya_babanina);
        FICTstudents.add(koval_dmitry);
        FICTstudents.add(alina_hrechyn);
        IASAstudents.add(zinovets_anastasia);
        IASAstudents.add(lyaskovich_angelina);
    }

    public University kopei() {
        return KPI;
    }

    public int countStudents() {
        int count = 0;
        for (Faculty fac: KPI.allFaculty) {
            for (Student student : fac.allStudent) {
                count++;
            }
        }
        return count;
    }

    public Faculty faculty() {
        Faculty fac1 = KPI.allFaculty.get(0);
        for(Faculty fac: KPI.allFaculty) {
            if(fac.allStudent.size() > fac1.allStudent.size()) {
                fac1 = fac;
            }
        }
        return fac1;
    }

    public List<Student> id() {
        List<Student> bestStudents = new ArrayList<Student>();
        for (Faculty fac : KPI.allFaculty)
            for (Student student: fac.allStudent) {
                if (student.averageMark > 95) {
                    bestStudents.add(student);
                }
            }
        return bestStudents;
    }
}
