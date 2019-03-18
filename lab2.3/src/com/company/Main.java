package com.company;

        import java.io.*;
        import java.util.*;

public class Main {
    public static void maxWordPrint(Map<String, Integer> wordMap){
        int max = (int) Collections.max(wordMap.values());
        Iterator it = wordMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if (pair.getValue().equals(max)){
                System.out.println(pair.getKey() + " is repeated  " + pair.getValue()+" times");}

        }
    }
     public static void makeThreds(File[] files,Map<String,Integer> Map){
        int i =0;
        Thread[] threads = new Thread[files.length];
        for (File file:files) {
            MyRunnable myRunnable = new MyRunnable("Thread " + (i+1), file, Map);
            Thread thread = new Thread(myRunnable);
            threads[i]=thread;
            thread.start();
            i++;
        }
        for (Thread thread:threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> wordToCount = Collections.synchronizedMap(new HashMap<String,Integer>());
        File myFile1 = new File("MyFile1");
        File myFile2 = new File("MyFile2");
        File myFile3 = new File("MyFile3");
        File myFile4 = new File("MyFile4");
        File myFile5 = new File("MyFile5");
        File myFile6 = new File("MyFile6");
        File myFile7 = new File("MyFile7");
        File myFile8 = new File("MyFile8");
        File myFile9 = new File("MyFile9");
        File myFile10 = new File("MyFile10");
        File myFile11 = new File("MyFile11");
        File myFile12 = new File("MyFile12");
        File myFile13 = new File("MyFile13");
        File myFile14 = new File("MyFile14");
        File myFile15 = new File("MyFile15");
        File myFile16 = new File("MyFile16");
        File[] files = new File[]{
                 myFile1,myFile2,myFile3,myFile4,myFile5,myFile6,myFile7,myFile8,
                 myFile9,myFile10,myFile11,myFile12,myFile13,myFile14,myFile15,myFile16
         };

         makeThreds(files,wordToCount);


        maxWordPrint(wordToCount);



    }
}

