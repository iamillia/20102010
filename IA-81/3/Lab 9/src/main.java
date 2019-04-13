import java.util.*;

import static java.util.Comparator.*;

/**
 * Types of constructors:
 *  Krapli(Integer code, String name, int price, int nubmerOf, String type, String bottleMaterial)
 *  Krapli(Integer code, String name, int price, int nubmerOf)
 *
 *  Tablets(Integer code, String name, int price, int nubmerOf, String form, String typeOfContainer)
 *  Tablets(Integer code, String name, int price, int nubmerOf)
 */
public class main  {
    public static void main(String[] args) {

        List<Krapli> kraplis = getKrapli();

        printerKrapli("List",2.1);

        kraplis.forEach(System.out::println);

        printerSorted("Krapli");

        kraplis.sort((kr1, kr2) -> kr1.getDaysToEnd().compareTo(kr2.getDaysToEnd()));

        kraplis.forEach(System.out::println);

        //------------------------------------------//

        printerTablets("List", 2.2);

        List<Tablets> tabletki = getTablets();

        tabletki.forEach(System.out::println);

        printerSorted("Tablets");

        Comparator<Tablets> comparator = comparing(Heals::getName);
        tabletki.sort(comparator.reversed());

        tabletki.forEach(System.out::println);

        //------------------------------------------//

        printerTablets("TreeSet", 2.3);

        TreeSet<Tablets> tabs = new TreeSet(comparing(Tablets::getName).thenComparing(Tablets::getPrice));
        tabs.add(getTablets().get(0));
        tabs.add(getTablets().get(1));
        tabs.add(getTablets().get(2));
        tabs.add(getTablets().get(3));
        tabs.add(getTablets().get(4));
        tabs.add(getTablets().get(5));
        tabs.add(getTablets().get(6));
        tabs.add(getTablets().get(7));

        tabs.forEach(System.out::println);

        //------------------------------------------//

        List<Krapli> kraplis1 = getKrapli();

        printerKrapli("List",2.4);

        kraplis1.forEach(System.out::println);

        printerSorted("Krapli");

        kraplis1.sort((comparing(Krapli::getBottleMaterial, nullsFirst(String::compareTo))));

        kraplis1.forEach(System.out::println);
    }

    private static  List<Tablets> getTablets(){
       List<Tablets> result = new ArrayList<>();

        result.add(new Tablets(45, "Analgin", 45, 50));
        result.add(new Tablets(56, "Espumizan", 50, 15));
        result.add(new Tablets(32, "Paracitamol", 32, 65, "Circle", 15));
        result.add(new Tablets(185, "Chlorophilipt", 120, 901, "Triangle", 6));
        result.add(new Tablets(25, "Septumsempre", 89, 500));
        result.add(new Tablets(5546, "Compadre", 73, 18));
        result.add(new Tablets(3452, "Vendetta", 3432, 98, "Circle", 9));
        result.add(new Tablets(17585, "Terorro", 1720, 10065, "Triangle", 4));

        return result;
    }

    private static  List<Krapli> getKrapli() {
        List<Krapli> result = new ArrayList<>();

        result.add(new Krapli(1,"Nazalong",245,900, 98, "Glass"));
        result.add(new Krapli(2,"Evkazolin",250,450, 32, null ));
        result.add(new Krapli(3,"Arestin",95,50, 78,"Glass"));
        result.add(new Krapli(4,"Hiter",200,500, 45, "Plastic"));
        result.add(new Krapli(5,"Talin",568,78, 86, null ));
        result.add(new Krapli(6,"Sulini",698,45, 687, null));
        result.add(new Krapli(7,"Eriya",641,46, 54,"Glass"));
        result.add(new Krapli(8,"Mekrel",981,52, 795, "Plastic"));

        return result;
    }

    private static void printerSorted(String typeOfHeal){
        System.out.println();
        System.out.println("----Sorted " + typeOfHeal + "----");
        System.out.println();
    }
    private static void printerKrapli(String krapIn, double taskNum){
        System.out.println();
        System.out.println("Task № " + taskNum);
        System.out.println("----Krapli in " + krapIn + "----");
        System.out.println();
    }
    private static void printerTablets(String tabIn, double taskNum){
        System.out.println();
        System.out.println("Task № " + taskNum);
        System.out.println("----Tablets in " + tabIn + "----");
        System.out.println();
    }
}
