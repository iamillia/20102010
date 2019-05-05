import static java.lang.Math.*;
public class Task_1 {
    public static void main(String[] args){
        forLab();
    }

    public static void forLab(){

        lab_10<Double> example = (a,b,c,d) ->{
            System.out.println("a = " + a + " b = " + b + " c = " + c + " d = " + d);
            System.out.println(2 * log(pow(b, a)) + abs(asin((-1) * sqrt(d / c))));
        };
            example.execute(3.56,1.02,3.0,2.43);
        }
    }

