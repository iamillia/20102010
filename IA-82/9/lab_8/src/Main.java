import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation[] quadraticEquations = new QuadraticEquation[] {
                new QuadraticEquation(5, 6, 1),
                new QuadraticEquation(1, 2, 1),
                new QuadraticEquation(2, 1, 2),
                new QuadraticEquation(2, 3, 1)
        };

        System.out.println("Unsorted: ");
        printQuadraticEquations(quadraticEquations);

        System.out.println("Sorted (Param A): ");
        Arrays.sort(quadraticEquations, new QuadraticEquation().new EquationParamAComparator());
        printQuadraticEquations(quadraticEquations);

        System.out.println("Sorted (Number of Xs): ");
        Arrays.sort(quadraticEquations, new QuadraticEquation.EquationComparator());
        printQuadraticEquations(quadraticEquations);
    }

    private static void printQuadraticEquations(QuadraticEquation[] quadraticEquations) {
        for(QuadraticEquation quadraticEquation : quadraticEquations) {
            System.out.println(quadraticEquation.getResultString());
        }
    }
}
