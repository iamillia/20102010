package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TextDocument textdoc1 = new TextDocument("Top Secret",01,"List");
        TextDocument textdoc2 = new TextDocument("Public",02,"Report");
        EDocument eDoc1 = new EDocument("Public",03,"flashDrive",".txt","Report");
        EDocument eDoc2 = new EDocument("Secret", 04, "CD",".xls","List");
        TextDocument[] textDocuments = new TextDocument[]{textdoc2,textdoc1};
        System.out.println("Unsorted textdocs array");
        for (TextDocument t:textDocuments) {
            System.out.println(t);
        }
        System.out.println("Sorted textdocs list");
        Arrays.sort(textDocuments, new TextDocument.IdComparator());
        for (TextDocument t:textDocuments) {
            System.out.println(t);
        }
        System.out.println("TreeSet of Documents");
        TreeSet<EDocument> treeDocs = new TreeSet<EDocument>(eDoc1.new EdocIdCompporator());
        treeDocs.add(eDoc2);
        treeDocs.add(eDoc1);
        System.out.println(treeDocs);
    }
}
