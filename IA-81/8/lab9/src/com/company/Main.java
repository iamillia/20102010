package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

import static java.util.Comparator.nullsFirst;

public class Main {

    public static void main(String[] args) {



        Smartphone smartphone= new Smartphone("samsung", 1.3,1.2,90,100,"red");
        Smartphone smartphone1= new Smartphone("samsung", 1.3,1.2,30,50,"red");
        Smartphone smartphone2= new Smartphone("samsung", 1.3,1.2,80,60,"red");
        Smartphone smartphone3= new Smartphone("lg",1.3,1.2,50,"blue");
        Smartphone smartphone4= new Smartphone("samsung", 1.3,1.2,10,50,"red");

        Comparator<Smartphone> byEnergy
                = (h1, h2) -> Double.compare(h1.getEnergyInPhone(),h2.getEnergyInPhone());
        TreeSet<Smartphone> set = new TreeSet<>(byEnergy);

        set.add(smartphone);
        set.add(smartphone1);
        set.add(smartphone2);
        set.add(smartphone3);
        set.add(smartphone4);
        Smartphone [] smartphones = new Smartphone[5];
        smartphones[0]=smartphone;
        smartphones[1]=smartphone1;
        smartphones[2]=smartphone2;
        smartphones[3]=smartphone3;
        smartphones[4]=smartphone4;

        Comparator<Smartphone> byMoney = Comparator.comparing(Smartphone::getMoneyInPhone).thenComparing(Smartphone:: getEnergyInPhone);
        Arrays.sort(smartphones, byEnergy.reversed());
        System.out.println(Arrays.toString(smartphones));
        Arrays.sort(smartphones, byMoney);
        System.out.println("----------");
        System.out.println(Arrays.toString(smartphones));
        Arrays.sort(smartphones, nullsFirst(byEnergy));
        System.out.println("----------");
        System.out.println(Arrays.toString(smartphones));
        System.out.println("----------");
        System.out.println(set);

    }


}
