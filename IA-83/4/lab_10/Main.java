package lab10;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	    public static void main(String[] args) {
	        
	        List<Car> list = new ArrayList();

	        list.add(new ICE_Car("Bugatti","La Voiture Noire",2019));
                list.add(new ElectricCar("Tesla","X P100D", 2017));
                list.add(new ICE_Car("Hyundai","Grand i10 X", 2015));
                list.add(new ICE_Car("Audi","Typ R Imperator", 1927));
                list.add(new ElectricCar("BMW","i3", 2018));	        
	        
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

