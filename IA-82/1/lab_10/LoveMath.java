import static java.lang.Math.*;
public interface LoveMath {
    double calculate( double a, double b, double c, double d);


    default double methodSinh(double a, double b, double c, double d, LoveMath LM1){
        double res = LM1.calculate(1.23, -0.34, 0.707, 2.312);
        System.out.println("first:" + a+",second: "+b+",third: "+c+",fourth: "+d+",result: "+res);
        return res;

    }

    default double methodAbs(double a, double b, double c, double d, LoveMath LM2){
        double res = LM2.calculate(1.478, 9.26, 0.68, 2.24);
        System.out.println("first:" + a+",second: "+b+",third: "+c+",fourth: "+d+",result: "+res);
        return res;
    }
    default double methodTan(double a, double b, double c, double d, LoveMath LM3){
        double res = LM3.calculate(2.34,0.756, 2.23, -1.653);
        System.out.println("first:" + a+",second: "+b+",third: "+c+",fourth: "+d+",result: "+res);
        return res;
    }

}