import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Lab8dot2 {

    protected class Compar implements Comparator<QuadraticEquation>{
        @Override
        public int compare(final QuadraticEquation o1, final QuadraticEquation o2) {
            return (o1.a < o2.a) ? -1 : (o1.a == o2.a) ? (o1.b < o2.b) ? -1 : (o1.b == o2.b) ? (o1.c < o2.c) ?  -1 : (o1.c == o2.c) ? 0 : 1 : 1 : 1;
        }
    }

    public void printSorted(QuadraticEquation[] arr){
        Comparator compar = this.new Compar();
        TreeSet<QuadraticEquation> asd = new TreeSet<>(compar);
        asd.addAll(Arrays.asList(arr));
        System.out.println(asd);
    }
}