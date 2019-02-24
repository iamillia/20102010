package Sem2_Laba2;

public class onethread {
    public static void main(String[] args) {
       long N = 1_000_000_000L;
        long startTime = System.currentTimeMillis();
        Exc_1(N);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
        long startTime1 = System.currentTimeMillis();
        try {
            Exc_2(N);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long timeSpent1 = System.currentTimeMillis() - startTime1;
        System.out.println("программа выполнялась " + timeSpent1 + " миллисекунд");
    }

    public static void Exc_1(long N) {
        long S = (2 * 6 + (N - 1) * 6) * N / 2;
        System.out.println(S);
    }

    public static void Exc_2(long N) throws InterruptedException {
        Runnable run_1 = new Run(N, 1);
        Thread first_thread = new Thread(run_1);
        first_thread.start();
        first_thread.join();
    }
}
