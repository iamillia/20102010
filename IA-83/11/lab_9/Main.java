//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    private static QuadraticEquation Uravnenie1 = new QuadraticEquation(6, -1, -1);
    private static QuadraticEquation Uravnenie2 = new QuadraticEquation(3, 2, 1);
    private static QuadraticEquation Uravnenie3 = new QuadraticEquation(5, -1, -1);
    private static QuadraticEquation Uravnenie4 = new QuadraticEquation(5, 6, 2);

    public static void main(String[] args) {

        Comparator<QuadraticEquation> aComparator = (QuadraticEquation a, QuadraticEquation b) -> {
            if (a.a > b.a) {
                return 1;
            } else if (a.a < b.a) {
                return -1;
            } else {
                return 0;
            }
        };

        Comparator<QuadraticEquation> bComparator = (QuadraticEquation a, QuadraticEquation b) -> {
            if (a.b > b.b) {
                return 1;
            } else if (a.b < b.b) {
                return -1;
            } else {
                return 0;
            }
        };

        Comparator<QuadraticEquation> reversedComparatorA = aComparator.reversed();
        Comparator<QuadraticEquation> reversedComparatorB = bComparator.reversed();
        Comparator<QuadraticEquation> nullComparatorA = Comparator.nullsFirst(aComparator);
        Comparator<QuadraticEquation> nullComparatorB = Comparator.nullsFirst(bComparator);
        Comparator<QuadraticEquation> abCompar = aComparator.thenComparing(bComparator);

        compareAndOut(aComparator);
        compareAndOut(bComparator);
        compareAndOut(abCompar);
        compareAndOut(reversedComparatorA);
        compareAndOut(reversedComparatorB);
        compareAndOut(nullComparatorA);
        compareAndOut(nullComparatorB);


    }

    private static void compareAndOut(Comparator comp) {
        TreeSet<QuadraticEquation> UravnenieTree = new TreeSet<QuadraticEquation>(comp);
        UravnenieTree.add(Uravnenie1);
        UravnenieTree.add(Uravnenie2);
        UravnenieTree.add(Uravnenie3);
        UravnenieTree.add(Uravnenie4);
        //UravnenieTree.add(null);
        for (QuadraticEquation p : UravnenieTree) {
            System.out.println(p);
        }
        System.out.println();
    }
}

