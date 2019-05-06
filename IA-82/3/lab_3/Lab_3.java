package lab_3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lab_3 {

    public static void main(String[] args) throws IOException {
        String folderPath = "E:\\Labas\\20102010\\IA-82\\3\\lab_3\\test";
        int fileNumber = 1;
        long t1= System.currentTimeMillis();
        rarestWords(folderPath, fileNumber);
        long t2 = System.currentTimeMillis();
        System.out.println("duration: " + (t2-t1) + " ms");
    }
    
    public static ArrayList<String> geRarestWords(String fileName, int fileNumber){
        HashMap<String, Integer> result = new HashMap<>();
        ArrayList<Thread> listThreads = new ArrayList<>();
        
        for(int i = 0; i < fileNumber; i++){
            String threadFileName = fileName + i + ".txt";
            ThreadImplementation ti = 
                    new ThreadImplementation(threadFileName, result);
            Thread t = new Thread(ti);
            t.start();
            listThreads.add(t);
        }
        
        try {
            for(Thread t : listThreads){  
                t.join();    
            }
        } catch (InterruptedException ex) {
                Logger.getLogger(Lab_3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ArrayList<String> resultWords = new ArrayList<>(); 
        if(result.size() > 0)
        {
            int min = result.values().stream().findFirst().get();

            for(String s : result.keySet()){
                int v = result.get(s);
                if(v <= min){
                    min = v;
                }
            }

            for(String s : result.keySet()){                   
                if(result.get(s) == min){
                    resultWords.add(s);
                }
            }
            resultWords.add(String.valueOf(min));
        }
        return resultWords;
    }
    
    public static void rarestWords(String filename, int fileNumber) throws IOException{
        
        ArrayList<String> resultWords = geRarestWords(filename, fileNumber);
        if(resultWords.size() > 0){
            System.out.print("rarestWords in file " + filename + " is : ");
            for(int i = 0;i < resultWords.size()-2;i++){
                System.out.print(resultWords.get(i) + ", ");
            }
            System.out.println(resultWords.get(resultWords.size()-2) +
                    ". (" + resultWords.get(resultWords.size()-1) + ") time ");
        }
        else
        {
            System.out.println("No words in file " + filename);
        }
    } 
    
}
