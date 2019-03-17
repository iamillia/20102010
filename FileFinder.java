import java.util.*;

public class FileFinder {
    public Map<String, Integer> wordsOccur = new HashMap();

	public String rarestWord(String... filePath) {
	    ThreadFinder[] threadFinders = new ThreadFinder[filePath.length];

	    for(int i = 0; i < filePath.length; i++) {
            threadFinders[i] = new ThreadFinder(filePath[i]);
            threadFinders[i].start();
        }

        try {
            for (ThreadFinder threadFinder : threadFinders) {
                threadFinder.join();
                for (Map.Entry<String, Integer> entry : threadFinder.wordsOccur.entrySet()) {
                    if (wordsOccur.containsKey(entry.getKey())) {
                        wordsOccur.put(entry.getKey(), wordsOccur.get(entry.getKey()) + entry.getValue());
                        continue;
                    }
                    System.out.println(entry.getKey() + " " + entry.getValue());
                    wordsOccur.put(entry.getKey(), entry.getValue());
                }
            }
        } catch(InterruptedException e) {
            System.out.println("Thread was interrupted");
        }

        Map.Entry<String, Integer> rarestEntry = null;

        for(Map.Entry<String, Integer> entry : wordsOccur.entrySet()) {
	        if(rarestEntry == null || entry.getValue() < rarestEntry.getValue()) {
                rarestEntry = entry;
            }
        }

        return rarestEntry.getKey();
    }
}