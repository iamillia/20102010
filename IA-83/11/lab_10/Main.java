import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IMathSolution sol1 = (a, b, c, d) -> Math.sqrt(Math.abs(Math.sin(a) - 4 * Math.log(b) / Math.pow(c, d)));
        IMathSolution sol2 = (a, b, c, d) -> 2 * Math.log(Math.pow(b, a)) + Math.abs(Math.asin((-Math.sqrt(d / c))));
        IMathSolution sol3 = (a, b, c, d) -> Math.pow(2 * Math.cos(Math.sqrt(a / b)) +  4 * Math.asin(d), c);
        printResult(sol1, -1.49, 23.4, 1.23, 2.542);
        printResult(sol2, 3.56, 1.02, 3, 2.43);
        printResult(sol3, -2.89, 1.62, 10.874, 2.91);

        // -----------------------------------------------

        Discriminant s1 = new Discriminant(4, 7, 2);
        Discriminant s2 = new Discriminant(7, 2, 4);
        Discriminant s3 = new Discriminant(2, 4, 7);

        List<? super  Uravnenie> solution =new ArrayList<>();
        solution.add(s1);
        solution.add(s2);
        solution.add(s3);

        solution.forEach(element -> System.out.println(element));
    }

    static void printResult(IMathSolution func, double a, double b, double c, double d){
        System.out.println(func.calculate(a, b, c, d));
    }
}

interface IMathSolution {

    double calculate(double a, double b, double c, double d);
}
