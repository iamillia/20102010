package lab_10_1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lab_10_1 {

    public static void main(String[] args) {
                FootballResults f1 = new FootballResults("t1", "t2", 1, 2, 10);
        FootballResults f2 = new FootballResults("t1", "t2", 1, 2, 20);
        FootballResults f3 = new FootballResults("t2", "t2", 1, 1, 40);
        FootballResults f4 = new FootballResults("t2", "t2", 1, 3, 1);
        FootballResults f5 = new FootballResults("t2", "t2", 1, 4, 3);
        FootballResults f6 = new FootballResults("t2", "t2", 1, 1);

        ArrayList<FootballResults> results = new ArrayList<>();
        results.add(f1);
        results.add(f2);
        results.add(f3);
        results.add(f4);
        results.add(f5);
        results.add(f6);
        
        Consumer<FootballResults> action = fr -> System.out.println(fr.toString() + " !!!!");
        
        results.forEach(action);
    }
    
}
