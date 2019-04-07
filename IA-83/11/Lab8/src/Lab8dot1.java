import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Lab8dot1 {

    public static void main(String[] args) {
        Random r = new Random();
        final int N = 10;
        QuadraticEquation[] arr = new QuadraticEquation[N];
        for(int i = 0; i < N; i++)
            arr[i] = new QuadraticEquation(r.nextInt(21) - 10, r.nextInt(21) - 10, r.nextInt(21) - 10);
        printSorted(arr);
    }

    public static void printSorted(QuadraticEquation[] arr){
        Comparator<QuadraticEquation> compar = new Comparator<QuadraticEquation>() {
            @Override
            public int compare(QuadraticEquation o1, QuadraticEquation o2) {
                return (o1.a < o2.a) ? -1 : ((o1.a == o2.a) ? 0 : 1);
            }
        };
        compar = compar.thenComparing(obj -> obj.b);
        compar = compar.thenComparing(obj -> obj.c);

        TreeSet<QuadraticEquation> asd = new TreeSet<>(compar);
        asd.addAll(Arrays.asList(arr));
        System.out.println(asd);
    }
}
