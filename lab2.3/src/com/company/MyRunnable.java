package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MyRunnable implements Runnable{
    String name;
    File file;
    Map<String, Integer> wordMap;

    public MyRunnable(String name, File file, Map<String, Integer> wordMap) {
        this.file = file;
        this.wordMap = wordMap;
        this.name=name;
    }

    @Override
    public void run() {

        long t1 = System.nanoTime()/1000;

        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader buff = new BufferedReader(fr);
        String line = null;
        try {
            line = buff.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String line1 ="";
        while(line!=null){
            line1 = line.toLowerCase() + " ";
            try {
                line = buff.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] str = line1.split(" ");

            for (String word:str) {
                if (!wordMap.containsKey(word)) {
                    wordMap.put(word, 0);
                }
                wordMap.put(word, wordMap.get(word) + 1);

            }

        }
        try {
            buff.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        long t2 = System.nanoTime()/1000;
        System.out.println("duration: of "+name+" is "+ (t2-t1) + " mcrs");
    }

}
