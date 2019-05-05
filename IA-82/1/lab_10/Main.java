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

        List<Laptop> laptops=new ArrayList<>();
        laptops.add(lenovo);
        laptops.add(lenovo1);
        laptops.add(lenovo2);
        laptops.add(lenovo3);
        laptops.add(lenovo4);

        List< Tablet> tablets=new ArrayList<>();
        tablets.add(samsung);
        tablets.add(samsung1);
        tablets.add(samsung2);
        tablets.add(samsung3);
        tablets.add(samsung4);


        List<PC> pcList=new ArrayList<>();
        pcList.add(asus);
        pcList.add(asus1);
        pcList.add(asus2);
        pcList.add(asus3);
        pcList.add(asus4);

        System.out.println("---------------LAPTOPS-----------------------");
        laptops.forEach(System.out::println);
        System.out.println("---------------TABLETS-----------------------");
        tablets.forEach(System.out::println);
        System.out.println("------------------PC--------------------------");
        pcList.forEach(System.out::println);
        System.out.println("--------------Task2---------------------------");
        LoveMath LM1 = (a, b, c, d) ->  pow(4 * sinh(sqrt(abs(a / b))) + 3 * asin(c), d);
        LoveMath LM2 = (a, b, c, d) ->  (6 * pow(sin(abs(2 * a)), log(b)) + sqrt(c * cosh(-d)));
        LoveMath LM3 = (a, b, c, d) -> (pow(E, a) + 3* log(c)/ sqrt(pow(b, c))* abs(atan(d)));


        double res1 = LM1.methodSinh(1.23, -0.34, 0.707, 2.312,LM1);
        double res2 = LM2.methodAbs(1.478, 9.26, 0.68, 2.24,LM2);
        double res3= LM3.methodTan(  2.34,0.756, 2.23, -1.653,LM3 );

        System.out.println("All results: "+"\n" +res1+"\n"+ res2+"\n"+res3);



    }
}



