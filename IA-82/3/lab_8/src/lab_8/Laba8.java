package lab_8;

import java.util.Arrays;

public class Laba8 {

    public static void main(String[] args) {
        FootballResults f1 = new FootballResults("t1", "t2", 1, 2, 10);
        FootballResults f2 = new FootballResults("t1", "t2", 1, 2, 20);
        FootballResults f3 = new FootballResults("t2", "t2", 1, 1, 40);
        FootballResults f4 = new FootballResults("t2", "t2", 1, 3, 1);
        FootballResults f5 = new FootballResults("t2", "t2", 1, 4, 3);
        FootballResults f6 = new FootballResults("t2", "t2", 1, 1);

        FootballResults[] arr = {f1, f2, f3, f4, f5, f6};

        for (FootballResults f : arr) {
            System.out.println(f);
        }
        System.out.println("--------------------------------");
        
        Arrays.sort(arr, f1.new AddTimeComparator());
        for (FootballResults f : arr) {
            System.out.println(f);
        }
        System.out.println("--------------------------------");
        
        Arrays.sort(arr, new CompetitionResults.CompetitionResultsComparator());
        
        for (FootballResults f : arr) {
            System.out.println(f);
        }
    }
}
