import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation[] quadraticEquations = new QuadraticEquation[] {
                new QuadraticEquation(),
                new QuadraticEquation(1, 2, 1),
                new QuadraticEquation(2, 1, 2),
                new QuadraticEquation(2, 3, 1)
        };

        System.out.println("Static method reference: ");
        Arrays.stream(quadraticEquations).filter(QuadraticEquation::haveSolutions).forEach(System.out::println);

        System.out.println("Instance method reference:");
        executeForEachQE(quadraticEquations, new QuadraticEquation()::printA);

        System.out.println("Class method reference: ");
        Arrays.stream(quadraticEquations).forEach(new QuadraticEquation()::printA);

        System.out.println("Constructor method reference: ");

        double[][] quadraticParams = {{}, {1, 2, 1}, {2, 1, 2}, {2, 3, 1}};
        Arrays.stream(quadraticParams).map(QuadraticEquation::new).forEach(System.out::println);
    }

    public static void executeForEachQE(QuadraticEquation[] quadraticEquations,
                                   Consumer<QuadraticEquation> quadraticEquationConsumer) {
        for (QuadraticEquation quadraticEquation : quadraticEquations) {
            quadraticEquationConsumer.accept(quadraticEquation);
        }
    }
}