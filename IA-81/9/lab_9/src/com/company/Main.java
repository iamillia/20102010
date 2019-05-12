package com.company;


import javax.swing.text.EditorKit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void print(TextDocument[] array){
        for (TextDocument t : array) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh-mm");
        Date date1 = sdf.parse("2009-12-31-15-30");
        Date date2 = sdf.parse("2010-01-31-08-19");
        //тут задается дата создания документа например date1 это 2010 год 31 января 15:30 а sdf для удобного задания даты
        TextDocument textdoc1 = new TextDocument("Top Secret", 1, date1, "List");
        TextDocument textdoc2 = new TextDocument("Public", 2, date2, "Report");
        EDocument eDoc1 = new EDocument("Public", 3, date2, "flashDrive", ".txt", "Report");
        EDocument eDoc2 = new EDocument("Secret", 4, date1, "CD", ".xls", "List");
        EDocument eDoc3 = new EDocument("Public",5,date2,"CD",".docx","Essay");
        //инициализация обьектов
        Comparator<TextDocument> IdComparator = (TextDocument t1, TextDocument t2) -> {
            if (t1.getId() > t2.getId()) {
                return 1;
            } else if (t1.getId() < t2.getId()) {
                return -1;
            } else {
                return 0;
            }
        };//компаратор через лямбда функцию, сравнивает все TextDocument по id в порядке возростания и все компараторы через лямбду тоже в порядке возростания
        Comparator<TextDocument> DateComparator = (TextDocument t1, TextDocument t2) -> {
            if (t1.getDate().compareTo(t2.getDate()) > 0) {
                return 1;
            } else if (t1.getDate().compareTo(t2.getDate())<0) {
                return -1;
            } else {
                return 0;
            }
        };//компаратор через лямбда функцию, сравнивает все TextDocument по дате
        Comparator<EDocument> EdocIdComparator = (EDocument e1, EDocument e2) -> {
            if (e1.getId() > e2.getId()) {
                return 1;
            } else if (e1.getId() < e2.getId()) {
                return -1;
            } else {
                return 0;
            }
        };//компаратор через лямбда функцию, сравнивает все ЕDocument по id
        Comparator<EDocument> EdocDateComparator = (EDocument e1, EDocument e2) -> {
            if (e1.getDate().compareTo(e2.getDate()) > 0) {
                return 1;
            } else if (e1.getDate().compareTo(e2.getDate())<0) {
                return -1;
            } else {
                return 0;
            }
        };//компаратор через лямбда функцию, сравнивает все ЕDocument по дате

        //тут начались залания лабки под номером 2
        Comparator<TextDocument> reversIdComporator = IdComparator.reversed();//через метод IdComparator.reversed() создали компоратор reversIdComporator который выстаивает все TextDocuments в порядке спадания по id
        Comparator<TextDocument> nullFirstComporator = Comparator.nullsFirst(DateComparator);// через метод Comparator.nullsFirst(DateComparator) создали компоратор котрый сравнивает по дате как обычно
        //как обычно но тепрь может принять вместо обьекта null и поставить его на первое место. Что бы поставить null на последнее место используй метод Comparator.nullsLast(DateComparator)
        Comparator<EDocument> EdocThenComporator = EdocDateComparator.thenComparing(EdocIdComparator);
        // EdocDateComparator.thenComparing(EdocIdComparator) метод где создаем компоратор котрый сравнивает EDocuments сначала по дате а если встречает одинаковые даты то сравнивает по id

        TextDocument[] textDocuments = new TextDocument[]{textdoc2, textdoc1};//создаем массив и просто по разному его сортируем с помощью Arrays.sort(Массив, Comparator);
        System.out.println("Unsorted textdocs array");
        print(textDocuments);//метод что бы не писать каждый раз for для вывода
        System.out.println();

        System.out.println("Sorted textdocs list");
        Arrays.sort(textDocuments, IdComparator);
        print(textDocuments);
        System.out.println();

        System.out.println("Sorted reversed textdocs list");
        Arrays.sort(textDocuments, reversIdComporator);
        print(textDocuments);
        System.out.println();

        TextDocument[] textDocNull = new TextDocument[]{textdoc2,textdoc1,null};//создали массив с обьектом null
        System.out.println("Unsorted array of textdocs with null");
        print(textDocNull);
        System.out.println();

        System.out.println("Sorted array of textdocs with null");
        Arrays.sort(textDocNull,nullFirstComporator);
        print(textDocNull);
        System.out.println();

        System.out.println("TreeSet of Documents");
        TreeSet<EDocument> treeDocs = new TreeSet<EDocument>(EdocThenComporator);//создали дерево которое будет добавляя сравнивает сначала по дате потом по id
        treeDocs.add(eDoc2);
        treeDocs.add(eDoc1);
        treeDocs.add(eDoc3);
        System.out.println(treeDocs);
    }
}
