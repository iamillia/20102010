public class Student extends Faculty{
    public String sdName, sdSurname;
    public int sdRecBook, sdAvgGrade;

    public Student(String sdName, String sdSurname, int sdRecBook, int sdAvgGrade) {
        this.sdName = sdName;
        this.sdSurname = sdSurname;
        this.sdRecBook = sdRecBook;
        this.sdAvgGrade = sdAvgGrade;
    }

    public String getSdName() {
        return sdName;
    }

    public String getSdSurname() {
        return sdSurname;
    }

    public int getSdAvgGrade() {
        return sdAvgGrade;
    }
}
