package laba;

import java.util.Comparator;

public class ElectricCar extends Car {

    public ElectricCar(String company) {
        super(company, false);
    }

    public ElectricCar(String company, String name, int year) {
        super(company, name, year, false);
    }

    public ElectricCar() {

    }

    @Override
    public boolean equal(Car car) {
        if (car.getHasICE()) {
            return false;
        }

        return (super.getCompany().equals(car.getCompany()) && super.getName().equals(car.getName()) && super.getYear() == car.getYear()) ? true : false;
    }

    @Override
    public String toString() {
        return "Company - " + super.getCompany() + ", Name - " + super.getName() + ", Year - " + super.getYear() + ", electric car";
    }

    @Override
    public Car changeNameAndYear(String newName, int newYear) {
        return new ElectricCar(super.getCompany(), newName, newYear);
    }
    

}
