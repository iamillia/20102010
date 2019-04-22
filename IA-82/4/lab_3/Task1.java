import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {

    private static File fileDir = new File("C:\\Users\\Екатерина\\Desktop\\lab3");
    private static ConcurrentHashMap<String, AtomicInteger> wordsCount = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        long tBegin = System.currentTimeMillis();
        for (File file : fileDir.listFiles()) {
            Thread t = new Thread(() -> {
                try {
                    new BufferedReader(new InputStreamReader(new FileInputStream(file)))
                            .lines()
                            //.peek(System.out::println)
                            .flatMap(line -> Arrays.stream(line.split(" ")))
                            .map(word -> word.trim().toLowerCase().replaceAll("[^a-zа-я]", ""))
                            .filter(word -> word.length() > 0)
                            .forEach(word -> {
                                AtomicInteger ctr = wordsCount.get(word);
                                if (ctr != null) {
                                    ctr.incrementAndGet();
                                    return;
                                }
                                createNewWordCtr(word);
                            });
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            });
            threads.add(t);
            t.start();
        }
        long tStart = System.currentTimeMillis();
        for (Thread thread : threads) {
            thread.join();
        }
        long tEnd = System.currentTimeMillis();
        String mostPopularWord = null;
        int popularity = -1;
        System.out.println(String.format("Все потоки работают в течении %d мс", (tStart - tBegin)));
        System.out.println(String.format("Работа заняла %d мс", (tEnd - tBegin)));
        for (String word : wordsCount.keySet()) {
            if (wordsCount.get(word).get() > popularity) {
                mostPopularWord = word;
                popularity = wordsCount.get(word).get();
            }
        }


        System.out.println(String.format("Самое популярное слово: %s (%d раз)", mostPopularWord, popularity));

    }

    private static synchronized void createNewWordCtr(String word) {
        AtomicInteger ctr = wordsCount.get(word);
        if (ctr == null) { // to avoid concurrency
            ctr = new AtomicInteger(0);
            wordsCount.put(word, ctr);
        }
        ctr.incrementAndGet();
    }

}
