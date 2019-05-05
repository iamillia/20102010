package com.company;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Formula f = ((a, b, c, d) -> Math.pow(2*Math.sin(a)+ Math.cos(Math.abs(b*Math.sqrt(c))),d));
        System.out.println(method(f,4 ,1,1,1));


    }
    public static String method (Formula f,double a, double b,double c,double d) {
        return "a: " + a + ", b: " + b + ", c: " + c + ", d: "+d+", result: "+f.calculate(a,b,c,d);
    }
}
