public class Student {
    private String name;
    private String surname;
    private int number;
    private double mark;

    public Student(String name, String surname, int number, double mark) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.mark = mark;
    }
    public Student(String name, String surname, int number, double mark, Faculty faculty) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.mark = mark;
        faculty.addStudent(this);
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getNumber() {
        return number;
    }
    public double getMark() {
        return mark;
    }
}
