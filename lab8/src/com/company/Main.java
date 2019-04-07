package com.company;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {



        Smartphone smartphone= new Smartphone("samsung", 1.3,1.2,90,100,"red");
        Smartphone smartphone1= new Smartphone("samsung", 1.3,1.2,30,10,"red");
        Smartphone smartphone2= new Smartphone("samsung", 1.3,1.2,80,2000,"red");
        Smartphone smartphone3= new Smartphone("lg",1.3,2,40,50,"blue");

        TreeSet<Smartphone> set = new TreeSet<>(new Smartphone.CompareEnergy());

        set.add(smartphone);
        set.add(smartphone1);
        set.add(smartphone2);
        set.add(smartphone3);
        Smartphone [] smartphones = new Smartphone[4];
        smartphones[0]=smartphone;
        smartphones[1]=smartphone1;
        smartphones[2]=smartphone2;
        smartphones[3]=smartphone3;


        Arrays.sort(smartphones,smartphone.new CompareMoney());
        System.out.println(Arrays.toString(smartphones));
        System.out.println(set);


    }


}
