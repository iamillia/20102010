import java.util.Comparator;

public class Student extends Human {
    String id;
    Integer payment;
    Integer course;

    public Student(String name, String surname, Integer age, Integer payment, Integer course, Integer phoneNumber) {
        super(name, surname, age, phoneNumber);
        this.payment = payment;
        this.course = course;
    }

    public  String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "payment= " + payment +
                ", course= " + course +
                ", name=' " + name + '\'' +
                ", surname=' " + surname + '\'' +
                ", age= " + age ;
    }
    public static class PayCompare implements Comparator<Student> {
        @Override
        public int compare(Student stud1, Student stud2) {
            if (stud1.payment == stud2.payment) {
                return 0;
            }
            if (stud1.payment > stud2.payment) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}




