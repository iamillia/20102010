import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Task {


	    public static void main(String[] args) {
	        
	        List<Car> list = new ArrayList();

	        list.add(new ElectricCar("Nisan", "S210", 2018));
	        list.add(new ICE_Car("Audi", "A8", 2013));
	        list.add(new ElectricCar("Tesla", "Model X", 2012));
	        list.add(new ElectricCar("Lada", "Model X", 2011));
	        list.add(new ElectricCar("Mazda", "C8", 2013));
	        
	        
	        list.forEach(System.out::println);
	        System.out.println("_____________________________________________________________");
	        
	        Consumer<Car> printCar = new Consumer<Car>() {
	            
	            public void accept(Car t) {
	               System.out.println(t);
	            }
	        };
	        
	        
	       list.forEach(printCar);
	        
	        System.out.println("_____________________________________________________________");
	        list.forEach((l) -> System.out.println(l));



	    }
	    
	}

