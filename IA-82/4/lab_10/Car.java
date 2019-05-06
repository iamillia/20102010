abstract public class Car{

    private String company;
    private String name;
    private int year;
    private boolean hasICE;

    public Car() {
    }

    public Car(String company, boolean hasICE) {
        this.setCompany(company);
        this.setHasICE(hasICE);

    }

    public Car(String company, String name, int year, boolean hasICE) {
        this.setCompany(company);
        this.setName(name);
        this.setYear(year);
        this.setHasICE(hasICE);
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Boolean getHasICE() {
        return isHasICE();
    }

    public abstract boolean equal(Car car);

    public abstract String toString();

    public abstract Car changeNameAndYear(String newName, int newYear);

    private void setCompany(String company) {
        this.company = company;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private boolean isHasICE() {
        return hasICE;
    }

    private void setHasICE(boolean hasICE) {
        this.hasICE = hasICE;
    }

}
