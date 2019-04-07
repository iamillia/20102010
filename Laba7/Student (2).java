public class Student {

    String name;
    String surname;
    Integer id;
    Double averageMark;

    public Student(String name, String surname, Integer id, Double averageMark) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", zalik=" + id +
                ", mark=" + averageMark +
                '}';
    }
}
