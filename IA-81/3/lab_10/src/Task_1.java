import static java.lang.Math.*;
public class Task_1 {
    public static void main(String[] args)
    {
        lab_10<Double> example = (a,b,c,d) ->{
            System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
            System.out.println(2 * log(pow(b, a)) + abs(asin((-1) * sqrt(d / c))));};
        forLab(3.56,1.02,3.0,2.43, example);
    }

    public static void forLab(double a, double b, double c,double d,lab_10<Double> example ){
            example.execute(a,b,c,d);
        }
    }



