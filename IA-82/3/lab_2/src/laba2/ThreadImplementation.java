package laba2;

public class ThreadImplementation implements Runnable {
    private final long fromN;
    private final long toN;
    public long result = 0;
    
    public ThreadImplementation(long fromN, long toN){
        this.fromN = fromN;
        this.toN = toN;
    }
    
    @Override
    public void run(){
        result = sumFromTo();
    }
    
    private long sumFromTo(){
        for (long i = fromN; i <= toN; i++) {
            result += 3 * i;
        }
        return result;
    }
    
}
