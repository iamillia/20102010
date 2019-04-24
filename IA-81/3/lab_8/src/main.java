import java.util.Arrays;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

        //public Krapli(Integer code, String name, int price, int nubmerOf, String type, String bottleMaterial)
        //public Krapli(Integer code, String name, int price, int nubmerOf)

        Krapli k1 = new Krapli(1,"Nazalong",245,900, 98, "Glass");
        Krapli k2 = new Krapli(2,"Evkazolin",250,450, 32);
        Krapli k3 = new Krapli(3,"Arestin",95,50, 78,"Glass");
        Krapli k4 = new Krapli(4,"Hiter",200,500, 45, "Plastic");
        Krapli k5 = new Krapli(5,"Talin",568,78, 86);
        Krapli k6 = new Krapli(6,"Sulini",698,45, 687);
        Krapli k7 = new Krapli(7,"Eriya",641,46, 54,"Glass");
        Krapli k8 = new Krapli(8,"Mekrel",981,52, 795, "Plastic");


        Krapli[] kraplis = {k1, k2, k3, k4, k5, k6, k7, k8};

        for(Krapli k : kraplis){
            System.out.println(k);
        }

        System.out.println("----****----");

        Arrays.sort(kraplis, k1.new KraplipriceComparator());

        for(Krapli k : kraplis){
            System.out.println(k);
        }

        System.out.println("----****----");

        //public Tablets(Integer code, String name, int price, int nubmerOf, String form, String typeOfContainer)
        //public Tablets(Integer code, String name, int price, int nubmerOf)

        Tablets t1 = new Tablets(45, "Analgin", 45, 50);
        Tablets t2 = new Tablets(56, "Espumizan", 50, 15);
        Tablets t3 = new Tablets(32, "Paracitamol", 32, 65, "Circle", "Paper Box");
        Tablets t4 = new Tablets(185, "Chlorophilipt", 120, 901, "Triangle", "Plastic Box");
        Tablets t5 = new Tablets(25, "Septumsempre", 89, 500);
        Tablets t6 = new Tablets(5546, "Compadre", 73, 18);
        Tablets t7 = new Tablets(3452, "Vendetta", 3432, 98, "Circle", "Paper Box");
        Tablets t8 = new Tablets(17585, "Terorro", 1720, 10065, "Triangle", "Plastic Box");

        Tablets[] tabletki ={t1, t2, t3, t4, t5, t6, t7, t8};

        for(Tablets t : tabletki){
            System.out.println(t);
        }

        System.out.println("----****----");

        Arrays.sort(tabletki, new Tablets.TabletsNumberOfComparator());

        for(Tablets t : tabletki){
            System.out.println(t);
        }

        System.out.println("----****----");

        TreeSet<Tablets> tabs = new TreeSet(new Tablets.TabletsNumberOfComparator());
        tabs.add(t1);
        tabs.add(t2);
        tabs.add(t3);
        tabs.add(t4);
        tabs.add(t5);
        tabs.add(t6);
        tabs.add(t7);
        tabs.add(t8);

        System.out.println(tabs);
    }
}
