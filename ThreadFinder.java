import java.io.*;
import java.util.*;

public class ThreadFinder extends Thread {
    public Map<String, Integer> wordsOccur = new HashMap();
    private String filePath = null;

    ThreadFinder(String filePath) {
        this.filePath = filePath;
    }

    public void run() {
        try (FileReader fileReader = new FileReader(filePath)) {
            Scanner scanInput = new Scanner(fileReader);
            while (scanInput.hasNext()) {
                String currentKey = scanInput.next().toLowerCase().replaceAll("[();,.«»]", "");
                synchronized (wordsOccur) {
                    if (currentKey.matches("[\\D]{3,}")) {
                        if (!wordsOccur.containsKey(currentKey)) {
                            wordsOccur.put(currentKey, 1);
                            continue;
                        }
                        wordsOccur.put(currentKey, wordsOccur.get(currentKey) + 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
