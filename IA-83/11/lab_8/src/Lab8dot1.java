import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Lab8dot1 {

    class Compar implements Comparator<QuadraticEquation>{
        Lab8dot1 out;

        Compar(Lab8dot1 out){
            this.out = out;
        }

        @Override
        public int compare(QuadraticEquation o1, QuadraticEquation o2) {
            return (o1.a < o2.a) ? -1 : ((o1.a == o2.a) ? 0 : 1);
        }
    }

    public void printSorted(QuadraticEquation[] arr){
        Comparator<QuadraticEquation> compar = new Lab8dot1.Compar(this);
        compar = compar.thenComparing(obj -> obj.b);
        compar = compar.thenComparing(obj -> obj.c);

        TreeSet<QuadraticEquation> asd = new TreeSet<>(compar);
        asd.addAll(Arrays.asList(arr));
        System.out.println(asd);
    }
}
