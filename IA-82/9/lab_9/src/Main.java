import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation[] quadraticEquations = new QuadraticEquation[] {
                new QuadraticEquation(5, 6, 1),
                new QuadraticEquation(1, 2, 1),
                new QuadraticEquation(3, 1, 2),
                new QuadraticEquation(2, 1, 1),
        };

        System.out.println("Unsorted: ");
        printQuadraticEquations(quadraticEquations);

        System.out.println("Sorted (Number of Xs): ");
        Arrays.sort(quadraticEquations, (QuadraticEquation o1, QuadraticEquation o2) -> Integer.compare(o1.getNumberOfXs(), o2.getNumberOfXs()));
        printQuadraticEquations(quadraticEquations);

        System.out.println("Sorted (Number of Xs rev): ");
        Arrays.sort(quadraticEquations, Comparator.comparing(QuadraticEquation::getNumberOfXs).reversed());
        printQuadraticEquations(quadraticEquations);

        System.out.println("Sorted (Number Xs then A): ");
        Arrays.sort(quadraticEquations, Comparator.comparing(QuadraticEquation::getNumberOfXs).thenComparing(Comparator.comparing(QuadraticEquation::getA)));
        printQuadraticEquations(quadraticEquations);

        System.out.println("Sorted (Number Xs but nulls first): ");
        quadraticEquations = Arrays.copyOf(quadraticEquations, quadraticEquations.length + 2);
        Arrays.sort(quadraticEquations, Comparator.nullsFirst(Comparator.comparing(QuadraticEquation::getNumberOfXs)));
        printQuadraticEquations(quadraticEquations);
    }

    private static void printQuadraticEquations(QuadraticEquation[] quadraticEquations) {
        for(QuadraticEquation quadraticEquation : quadraticEquations) {
            if(quadraticEquation != null) {
                System.out.println(quadraticEquation.getResultString());
            } else {
                System.out.println("NULL");
            }
        }
    }
}
