import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Laptop lenovo = new Laptop("pro4", 18, "lenovo","AMD");
        Laptop lenovo1 = new Laptop( "pro4", 16, "lenovo","Nividia");
        Laptop lenovo2 = new Laptop( "intelCore7", 49, "lenovo","AMD");
        Laptop lenovo3 = new Laptop( "intelCore7", 48, "lenovo","Nividia");
        Laptop lenovo4 = new Laptop( "pro2", 8, "lenovo","Nividia");

        Tablet samsung = new Tablet("pro2", 8,45);
        Tablet samsung1 = new Tablet( "intelCore5", 5,55);
        Tablet samsung2 = new Tablet( "pro4", 23,77);
        Tablet samsung3 = new Tablet( "intelCore7", 4,55);
        Tablet samsung4 = new Tablet( "Ryzen2", 6,65877);


        PC asus=new PC("intelCore7",24);
        PC asus1=new PC("IntelCore5",4);
        PC asus2=new PC("AMD A4",48);
        PC asus3=new PC("intelCore2",256);
        PC asus4=new PC("AMD A2",24);

        List<? super  Device> devices =new ArrayList<>();
        devices.add(lenovo);
        devices.add(lenovo1);
        devices.add(lenovo2);
        devices.add(lenovo3);
        devices.add(lenovo4);
        devices.add(samsung);
        devices.add(samsung1);
        devices.add(samsung2);
        devices.add(samsung3);
        devices.add(samsung4);
        devices.add(asus);
        devices.add(asus1);
        devices.add(asus2);
        devices.add(asus3);



        List< Tablet> tablets=new ArrayList<>();
        tablets.add(samsung);
        tablets.add(samsung1);
        tablets.add(samsung2);
        tablets.add(samsung3);
        tablets.add(samsung4);




        System.out.println("---------------LAPTOPS-----------------------");
        devices.forEach(System.out::println);
        System.out.println("---------------TABLETS-----------------------");
        tablets.forEach(System.out::println);
        System.out.println("--------------Task2---------------------------");
        formula();
        formula1();
         formula2();
    }
    public static void formula (){
        LoveMath LM1 = (a, b,c,d) ->  pow(4 * sinh(sqrt(abs(a / b))) + 3 * asin(c), d);
       double res = LM1.calculate(1.478, 9.26, 0.68, 2.24);
        System.out.println(res);

    }

    public static  void  formula1 (){
         LoveMath LM2 = (a,b,c,d) ->  (6 * pow(sin(abs(2 * a)), log(b)) + sqrt(c * cosh(d)));
         double res1=LM2.calculate(1.478, 9.26, 0.68, 2.24);
         System.out.println(res1);
    }
    public static  void  formula2 (){
        LoveMath LM3 = (a,b,c,d) -> (pow(E, a) + 3* log(c)/ sqrt(pow(b, c))* abs(atan(d)));
       double res2=LM3.calculate(1.478, 9.26, 0.68, 2.24);
        System.out.println(res2);
    }


}



