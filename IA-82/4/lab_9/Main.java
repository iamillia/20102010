package laba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import static java.util.Comparator.*;

public class Main {

    public static <T> Comparator<T> nullsFirst(Comparator<T> comparator) {
        return (a, b) -> {
            if (a == null) {
                return (b == null) ? 0 : -1;
            }

            if (b == null) {
                return 1;
            }

            return comparator.compare(a, b);
        };
    }
    
    public static <T> Comparator<T> nullsLat(Comparator<T> comparator) {
        return (a, b) -> {
            if (a == null) {
                return (b == null) ? 0 : 1;
            }

            if (b == null) {
                return -1;
            }
            return comparator.compare(a, b);
        };
    }

    public static void main(String[] args) {

        List<Car> list = new ArrayList();

        list.add(new ElectricCar("Nisan", "S210", 2018));
        list.add(new ICE_Car("Audi", "A8", 2013));
        list.add(new ElectricCar("Tesla", "Model X", 2012));
        list.add(new ElectricCar("Lada", "Model X", 2011));
        list.add(new ElectricCar("Mazda", "C8", 2013));

        
        
        System.out.println("Car list before: \n");

        list.forEach((l) -> System.out.println(String.format("%8s, %d, %s", l.getName(), l.getYear(), l.getCompany())));
        System.out.println("______________________");

        Comparator<Car> nameComparator = (car1, car2) -> car1.getName().compareTo(car2.getName());
        list.sort(nameComparator);

        System.out.println("Car list sort by Name: \n");
        list.forEach((l) -> System.out.println(String.format("%8s, %d, %s", l.getName(), l.getYear(), l.getCompany())));

        System.out.println("___________________________________");
     
        Comparator<Car> nameComparatorDesc = nameComparator.reversed();
        list.sort(nameComparatorDesc);

        System.out.println("Car list sort by Name Reverse: \n");
        list.forEach((l) -> System.out.println(String.format("%8s, %d, %s", l.getName(), l.getYear(), l.getCompany())));

        System.out.println("____________________________________");

        Comparator<Car> nameAndCompany = Comparator.comparing(Car::getName).thenComparing(Car::getCompany);

        list.sort(nameAndCompany);
        System.out.println("Car list sort by Name, Company: \n");
        list.forEach((l) -> System.out.println(String.format("%8s, %d, %s", l.getName(), l.getYear(), l.getCompany())));

        list.add(null);
        list.sort(nullsFirst(nameComparator));
        System.out.println("_____________________________________");
        System.out.println("Car list sort by Name NULL FIRST: \n");
        list.forEach((l) -> {if (l!=null) 
                  System.out.println(String.format("%8s, %d, %s", l.getName(),  l.getYear(), l.getCompany()));
                          else System.out.println(l);}
        );

        list.sort(nullsLast(nameComparator));

        System.out.println("_____________________________________");
        System.out.println("Car list sort by Name NULL LAST: \n");
        list.forEach((l) -> {if (l!=null) 
                  System.out.println(String.format("%8s, %d, %s", l.getName(),  l.getYear(), l.getCompany()));
                          else System.out.println(l);}
        );
        
        System.out.println("______________________________________________");
        System.out.println("Car tree sort by Name,Company NULL FIRST: \n");
        
        TreeSet tree = new TreeSet(nullsFirst(nameAndCompany));
        list.forEach((l) ->tree.add(l));
        tree.forEach(System.out::println);

    }
}
