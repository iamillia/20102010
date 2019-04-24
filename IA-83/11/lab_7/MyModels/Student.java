package MyModels;

public class Student {
    public String Name;
    private String Surname;
    private int BookNumber;
    int AverageScore;


    public Student(String name, String surname, int BookNumber, int AverageScore) {
        this.Name = name;
        this.Surname = surname;
        this.BookNumber = BookNumber;
        this.AverageScore = AverageScore;
    }
    public String getName(){
        return this.Name + " " + this.Surname;
    }
}
