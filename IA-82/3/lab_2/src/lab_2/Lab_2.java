package lab_2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab_2 {

    public static void main(String[] args) {
       displayResults(700000000);
 
    }
    
    public static void displayResults(long n){
        
        long t1 = System.currentTimeMillis();
        System.out.print(fistMethod(n));
        long t2 = System.currentTimeMillis();
        System.out.println("  duration: " + (t2-t1) + " ms");
        System.out.println("***universal methods***");
        for(int i = 1; i <= 32; i *= 2){
            long t3= System.currentTimeMillis();
            System.out.print(universalMethod(n, i));
            long t4 = System.currentTimeMillis();
            System.out.println("  duration: " + (t4-t3) + " ms" + "  threads: " + i);
        }
    }
    
    public static long fistMethod(long n){
        return n * 15 *(2 + (n-1) );
    }
    
    public static long universalMethod(long n, int threads){
        long result = 0;
        ArrayList<ThreadImplementation> listImp = new ArrayList<>();
        ArrayList<Thread> listThreads = new ArrayList<>();
        long step = Math.floorDiv(n, threads);
        
        if(threads>1){
            ThreadImplementation tiFirst = 
                    new ThreadImplementation(0,step);
            Thread tFirst = new Thread(tiFirst);
            tFirst.start();
            listImp.add(tiFirst);
            listThreads.add(tFirst);
        }
        
        for(int i = 1; i < threads-1; i++){
            ThreadImplementation ti = 
                    new ThreadImplementation(step * i + 1 , step * (i + 1));
            Thread t = new Thread(ti);
             t.start();
            listImp.add(ti);
            listThreads.add(t);
        }
        
        ThreadImplementation tiLast = 
                new ThreadImplementation(step * (threads -1)+1,n);
        Thread tLast = new Thread(tiLast);
        tLast.start();
        listImp.add(tiLast);
        listThreads.add(tLast);
        
        try {
            for(Thread t : listThreads){  
                t.join();    
            }
        } catch (InterruptedException ex) {
                Logger.getLogger(Lab_2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(ThreadImplementation t : listImp){    
            result += t.result;
        }
        return result;
    }
}
