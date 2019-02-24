package Sem2_Laba2;

public class Run implements Runnable {
    Long N;
    Integer k;
    long i = 1;
    int count = 1;
    long Sum = 0;


    public Run(Long n, Integer k) {
        this.N = n;
        this.k = k;
    }

    @Override
    public void run() {
        for (; i <= N * count / k; i++) {
            Sum += 6 * i;
        }
        count++;
        System.out.println(Sum);
    }
}
