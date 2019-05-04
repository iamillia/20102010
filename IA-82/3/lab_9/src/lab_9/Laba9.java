package lab_9;

import java.util.Arrays;
import java.util.Comparator;

public class Laba9 {

    public static void main(String[] args) {
        FootballResults f1 = new FootballResults("t1", "t2", 1, 2, 10);
        FootballResults f2 = new FootballResults("t1", "t2", 1, 2, 20);
        FootballResults f3 = new FootballResults("t2", "t3", 1, 1, 40);
        FootballResults f4 = new FootballResults("t2", "t4", 1, 3, 1);
        FootballResults f5 = new FootballResults("t7", "t5", 1, 4, 3);
        FootballResults f6 = new FootballResults("t2", "t6", 1, 1);

        FootballResults[] arr = {f1, f2, f3, f4, f5, f6};

        for (FootballResults f : arr) {
            System.out.println(f);
        }
        
        System.out.println("--------------------------------");
        System.out.println("byFirstTeamName");
        Comparator<FootballResults> byFirstTeamName = 
		(FootballResults fr1, FootballResults fr2)->fr1.FirstTeamName.compareTo(fr2.FirstTeamName);
        Arrays.sort(arr, byFirstTeamName);
        for (FootballResults f : arr) {
            System.out.println(f);
        }
        
        System.out.println("--------------------------------");
        System.out.println("byAddTime");
        Comparator<FootballResults> byAddTime = 
		(FootballResults fr1, FootballResults fr2)->Double.compare(fr1.addTime, fr2.addTime);
        Arrays.sort(arr, byAddTime);
        for (FootballResults f : arr) {
            System.out.println(f);
        }
        
        System.out.println("--------------------------------");
        System.out.println("byAddTime reversed");	
        Arrays.sort(arr, byAddTime.reversed());
        for (FootballResults f : arr) {
            System.out.println(f);
        }
        
        System.out.println("--------------------------------");
        System.out.println("byFirstTeamName");
        Comparator<FootballResults> bySecontTeamName = 
		(FootballResults fr1, FootballResults fr2)->fr2.FirstTeamName.compareTo(fr1.FirstTeamName);
        Arrays.sort(arr, byFirstTeamName.thenComparing(bySecontTeamName));
        for (FootballResults f : arr) {
            System.out.println(f);
        }
    }
}
