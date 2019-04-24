import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class world {
	
    public static void main(String[] args) throws FileNotFoundException {
    	FileReader file = new FileReader ("D:\\Workspace Eclipse\\labka.txt"); 
        Scanner line = new Scanner(file);
        
        String s = "";
        while(line.hasNext())
            s += line.nextLine() + "\r\n";
        
        String[] a = s.split("\\s");
        Arrays.sort(a);
        String maxWord = "",
        word = "";
        
        int maxCount = 0, count = 1;

        for (String one : a) {
            if (one.equals(word)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = word;
                }
                word = one;
                count = 1;
            }
        }

    System.out.println("Слово, яке зустрічається найчастіше: " + maxWord + " , зустрічається " + maxCount + " рази");
        line.close();
    }
}