
public class ElectricCar extends Car {

    public ElectricCar(String company) {
        super(company, false);
    }

    public ElectricCar(String company, String name, int year) {
        super(company, name, year, false);
    }

    public ElectricCar() {

    }

   
    public boolean equal(Car car) {
        if (car.getHasICE()) {
            return false;
        }

        return (super.getCompany().equals(car.getCompany()) && super.getName().equals(car.getName()) && super.getYear() == car.getYear()) ? true : false;
    }

   
    public String toString() {
        return "Company - " + super.getCompany() + ", Name - " + super.getName() + ", Year - " + super.getYear() + ", electric car";
    }

    
    public Car changeNameAndYear(String newName, int newYear) {
        return new ElectricCar(super.getCompany(), newName, newYear);
    }
    

}
