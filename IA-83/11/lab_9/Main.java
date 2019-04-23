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

        compareAndOut(aComparator);
        compareAndOut(bComparator);
        compareAndOut(reversedComparatorA);
        compareAndOut(reversedComparatorB);
        compareNullAndOut(nullComparatorA);
        compareNullAndOut(nullComparatorB);


    }

    private static void compareAndOut(Comparator comp) {
        TreeSet<QuadraticEquation> UravnenieTree = new TreeSet<QuadraticEquation>(comp);
        UravnenieTree.add(Uravnenie1);
        UravnenieTree.add(Uravnenie2);
        UravnenieTree.add(Uravnenie3);
        UravnenieTree.add(Uravnenie4);
        for (QuadraticEquation p : UravnenieTree) {
            System.out.println(p);
        }
        System.out.println();
    }

    private static void compareNullAndOut(Comparator comp) {
        TreeSet<QuadraticEquation> UravnenieTree = new TreeSet<QuadraticEquation>(comp);
        UravnenieTree.add(Uravnenie1);
        UravnenieTree.add(Uravnenie2);
        UravnenieTree.add(Uravnenie3);
        UravnenieTree.add(Uravnenie4);
        for (QuadraticEquation p : UravnenieTree) {
            System.out.println(p);
        }
        System.out.println();
    }
}

interface SolutionEquation {
    void CalculateUravnenie();
}

class QuadraticEquation implements SolutionEquation {
    int a, b, c;
    private double x1=0, x2=0, d=0;
    QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public void CalculateUravnenie() {
        d = (int) (Math.pow(b, 2) - (4 * a * c));
        if (d > 0) {
            x1 = (((-1) * b + Math.sqrt(d)) / (2 * a));
            x2 = (((-1) * b - Math.sqrt(d)) / (2 * a));
        } else if (d == 0) {
            x1 = x2 = ((-1) * b) / (2 * a);
        } else {

            x1 = x2 = 0;
        }
        Output();
    }

    public String toString(){
        return "QuadraticEquation: a = " + a + " b = " + b + " c = " + c;
    }
    private void Output() {
        if (d > 0) {
            System.out.print("x1 = " + x1 + "; x2 = " + x2);
        }
        else if (d == 0) {
            System.out.print("Only one solution: x1,x2 = " + x2);

        } else {
            System.out.print("D is smaller then zero! No real solution.");
        }
    }
}