package lab_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ThreadImplementation implements Runnable {
    private final HashMap<String, Integer> result;
    private final String fileName;
    
    public ThreadImplementation(String fileName, HashMap<String, Integer> result){
        this.result = result;
        this.fileName = fileName;
    }
    
    @Override
    public void run(){
        getRarestWords();
    }
    
    private void getRarestWords() {
        try(BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream(fileName)))) {
            String str;
            while((str = br.readLine())!= null){
                String[] arr = str.split(" ");
                for(String s : arr)
                {
                    s = s.replaceAll("[.,!?\\\\-]", "");
                    if(s.matches("[A-Za-z]+")){
                        if(result.containsKey(s)){
                            Integer t = result.get(s);
                            synchronized(result){
                              result.replace(s, t, ++t);
                            }
                        }
                        else{
                            result.put(s, 1);
                        }
                    }
                }
            }
        } catch (FileNotFoundException ex){
            System.out.println("Sorry, no such file. " + ex.getMessage());
        } catch (IOException ex){
            System.out.println("Oooops, IO error. " + ex.getMessage());
        }
    }
    
}
