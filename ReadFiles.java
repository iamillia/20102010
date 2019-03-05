package Sem2_Laba3;

import java.io.*;
import java.util.*;

public class ReadFiles {
    static Map<String, Integer> map_list = Collections.synchronizedMap(new HashMap<>());

    public static void main(String[] args) {
        int k = 4;
        String[] filenames = new String[k];

        filenames[0] = "C:\\Users\\hp\\Desktop\\New Pack\\file1.txt";
        filenames[1] = "C:\\Users\\hp\\Desktop\\New Pack\\file2.txt";
        filenames[2] = "C:\\Users\\hp\\Desktop\\New Pack\\file3.txt";
        filenames[3] = "C:\\Users\\hp\\Desktop\\New Pack\\file4.txt";
        long t1 = System.currentTimeMillis();
        commonestWord(filenames, k);

        int maxValueInMap = (Collections.max(map_list.values()));
        Object maxKey = null;

        Iterator it = map_list.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (pair.getValue().equals(maxValueInMap)) {
                maxKey = pair.getKey();
            }
        }
        System.out.println("Самое повторяющееся слово: " + maxKey + " (встречается " + maxValueInMap + " раз)");
        long t2 = System.currentTimeMillis();
        System.out.println("duration: " + (t2 - t1) + " ms");
    }

    static void commonestWord(String[] filenames, int k) {
        int count = 0;
        try {
            Thread[] threads = new Thread[k];
            for (int i = 0; i < k; i++) {
                Runnable run = new Run1(map_list, k, count, filenames);
                threads[i] = new Thread(run);
                threads[i].start();
                count++;

            }
            for (Thread th : threads) {
                th.join();
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

class Run1 implements Runnable {

    Map<String, Integer> map_list;
    int count;
    int k;
    String[] filenames;

    public Run1(Map<String, Integer> map_list, int k, int count, String[] filenames) {
        this.map_list = map_list;
        this.k = k;
        this.count = count;
        this.filenames = filenames;
    }

    @Override
    public void run() {

        try {
            FileReader reader = new FileReader(filenames[count]);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] sub = line.split("\\s");
                synchronized (this) {
                    for (int i = 0; i < sub.length; i++) {
                        if (!map_list.containsKey(sub[i])) {
                            map_list.put(sub[i], 1);
                        } else {
                            map_list.replace(sub[i], map_list.get(sub[i]) + 1);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found.");
            e.printStackTrace();
        } catch (IOException e1) {
            System.out.println("Error Reading The File.");
            e1.printStackTrace();
        }
    }
}
