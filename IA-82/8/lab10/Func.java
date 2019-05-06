package laba10;
import static java.lang.Math.*;


public class Func {

    public static double execute() {
       Calculate  co = (double a, double b, double c, double d) -> sqrt(abs(sin(a) - (4 * log(b) / (pow(c, d)))));
        return co.calc(-1.49, 23.4, 1.23, 2.542);
    }

    public static void main(String[] args) {

        System.out.println( execute());
    }
}
@FunctionalInterface
interface Calculate{
   double calc(double a, double b, double c, double d);

}
