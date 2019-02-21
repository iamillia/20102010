package Sem2_Laba1;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Out_In {
    static HashMap<String, Integer> map_list = new HashMap<>();
    static Scanner scan;
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String filename = "C:\\Users\\hp\\Desktop\\New pack\\Laba1.java";
        commonestWord(filename);
    }

    static void commonestWord(String filename) {
        try {
            scan = new Scanner(new File(filename));
            while (scan.hasNext()) {
                list.add(scan.next());
            }
            for (String elem : list) {
                if (elem.isEmpty())
                    continue;
                int value = 0;
                for (String elem_2 : list) {
                    if (elem_2.equals(elem))
                        value++;
                }
                map_list.put(elem, value);
            }

            int maxValueInMap = (Collections.max(map_list.values()));
            Object maxKey = null;
            Iterator it = map_list.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if (pair.getValue().equals(maxValueInMap)) {
                    maxKey = pair.getKey();
                }
                it.remove();
            }
            System.out.println("Самое повторяющееся слово: " + maxKey + " (встречается " + maxValueInMap + " раз)");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
