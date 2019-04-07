import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Lab8dot2 {

    public static void main(String[] args) {
        Random r = new Random();
        final int N = 10;
        QuadraticEquation[] arr = new QuadraticEquation[N];
        for(int i = 0; i < N; i++)
            arr[i] = new QuadraticEquation(r.nextInt(21) - 10, r.nextInt(21) - 10, r.nextInt(21) - 10);

        printSorted(arr);
    }

    public static void printSorted(QuadraticEquation[] arr){
        TreeSet<QuadraticEquation> asd = new TreeSet<>(new ComparQuadratic());
        asd.addAll(Arrays.asList(arr));
        System.out.println(asd);
    }
}

class ComparQuadratic implements Comparator<QuadraticEquation> {

    @Override
    public int compare(QuadraticEquation o1, QuadraticEquation o2) {
            return (o1.a < o2.a) ? -1 : (o1.a == o2.a) ? (o1.b < o2.b) ? -1 : (o1.b == o2.b) ? (o1.c < o2.c) ?  -1 : (o1.c == o2.c) ? 0 : 1 : 1 : 1;
    }
}