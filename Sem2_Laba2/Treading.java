package Sem2_Laba2;

public class Treading {
    public static void main(String[] args) {
        long N = 1_000_000_000L;
        int k = 32;
        long startTime = System.currentTimeMillis();
        try {
            Exc_3(N, k);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }


    public static void Exc_3(long N, int k) throws Exception {
        Runnable run = new Run(N, k);
        for (int i = 0; i < k; i++) {
            Thread threads = new Thread(run);
            threads.start();
        //    System.out.println(threads.getName());
            threads.join();
        }
    }
}
