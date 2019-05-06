import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Part 1
        printResult((double a, double b, double c, double d) -> (Math.sin(Math.abs(a)) + Math.cos(Math.sqrt(b)))/ (2 * Math.tan(c) + Math.pow(Math.E, d)),
        -2.98, 5.55, 0.045, 0.129);

        //Part 2
        ArrayList<QuadraticEquation> quadraticEquations = new ArrayList(Arrays.asList(
                new QuadraticEquation(5, 6, 1),
                new QuadraticEquation(1, 2, 1),
                new QuadraticEquation(2, 1, 2),
                new QuadraticEquation(2, 3, 1)));

        quadraticEquations.forEach(element -> System.out.println(element));
    }

    static void printResult(Function func, double a, double b, double c, double d) {
        double result = func.calculate(a, b, c, d);

        System.out.printf("A = %f, B = %f, C = %f, D = %f. Result: %f\n", a, b, c, d, result);
    }

    @FunctionalInterface
    interface Function {
        double calculate(double a, double b, double c, double d);
    }
}