import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        final int N = 10;
        QuadraticEquation[] arr = new QuadraticEquation[N];
        for(int i = 0; i < N; i++)
            arr[i] = new QuadraticEquation(r.nextInt(21) - 10, r.nextInt(21) - 10, r.nextInt(21) - 10);
        for(QuadraticEquation i : arr)
        System.out.print(i.toString());
        System.out.println();
        new Lab8dot1().printSorted(arr);
        System.out.println();
        new Lab8dot2().printSorted(arr);
    }
}
