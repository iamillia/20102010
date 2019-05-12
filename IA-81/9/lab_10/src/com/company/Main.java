package com.company;

import java.util.ArrayList;

public class Main {


    public static String countMethod(double a, double b,double c, double d,FuncInterface result){
        return "a: "+a+", b: "+b+", c: "+c+", d: "+d+", output: "+result.count(a,b,c,d);
    }

    public static void main(String[] args) {
        System.out.println("------------------------------TASK 1------------------------------");
        FuncInterface result = (a,b,c,d) ->Math.pow((2*Math.sin(a)+Math.cos(Math.abs(b*Math.sqrt(c)))),d);
        System.out.println(countMethod(2,3,4,5,result));
        System.out.println();

        System.out.println("------------------------------TASK 2------------------------------");
        ArrayList<TextDocument> textDocuments = new ArrayList<>();
        ArrayList<EDocument> eDocuments = new ArrayList<>();

        TextDocument textdoc1 = new TextDocument("Top Secret",01,"List");
        TextDocument textdoc2 = new TextDocument("Public",02,"Report");
        TextDocument textdoc3 = new TextDocument("Public",03,"Essay");
        EDocument eDoc1 = new EDocument("Public", 6, "flashDrive", ".txt", "Report");
        EDocument eDoc2 = new EDocument("Secret", 4, "CD", ".xls", "List");
        EDocument eDoc3 = new EDocument("Public",5,"CD",".docx","Essay");

        textDocuments.add(textdoc1);
        textDocuments.add(textdoc2);
        textDocuments.add(textdoc3);
        eDocuments.add(eDoc1);
        eDocuments.add(eDoc2);
        eDocuments.add(eDoc3);
        textDocuments.forEach(System.out::println);
        eDocuments.forEach(System.out::println);

    }
}
