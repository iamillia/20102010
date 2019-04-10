import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Lab8dot2 {

    class Compar implements Comparator<QuadraticEquation>{
        @Override
        public int compare(QuadraticEquation o1, QuadraticEquation o2) {
            return (o1.a < o2.a) ? -1 : (o1.a == o2.a) ? (o1.b < o2.b) ? -1 : (o1.b == o2.b) ? (o1.c < o2.c) ?  -1 : (o1.c == o2.c) ? 0 : 1 : 1 : 1;
        }
    }

    public void printSorted(QuadraticEquation[] arr){
        Comparator compar = this.new Lab8dot2.Compar();
        TreeSet<QuadraticEquation> asd = new TreeSet<>(compar);
        asd.addAll(Arrays.asList(arr));
        System.out.println(asd);
    }
}