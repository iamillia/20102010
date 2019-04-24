package laba;


	public class ICE_Car extends Car {

	    public ICE_Car(String company){
	        super(company, true);
	    }

	    public ICE_Car(String company, String name, int year){
	        super(company, name, year, true);
	    }

	    @Override
	    public boolean equal(Car car) {
	        if(!car.getHasICE()) 
	        	return false;

	        return (super.getCompany().equals(car.getCompany()) && super.getName().equals(car.getName()) && super.getYear() == car.getYear())? true : false;
	    }

	    @Override
	    public String toString() {
	        return "Company - " + super.getCompany() + ", Name - " + super.getName() + ", Year - " + super.getYear() + ", car with ICE";
	    }

	    @Override
	    public Car changeNameAndYear(String newName, int newYear) {
	        return new ICE_Car(super.getCompany(), newName, newYear);
	    }
            
	}


