import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Heals> heals = new ArrayList();

        Krapli k1 = new Krapli(1,"Nazalong",245,900, 98, "Glass");
        Krapli k2 = new Krapli(2,"Evkazolin",250,450, 32);
        Krapli k3 = new Krapli(3,"Arestin",95,50, 78,"Glass");

        Tablets t1 = new Tablets(45, "Analgin", 45, 50);
        Tablets t2 = new Tablets(56, "Espumizan", 50, 15);
        Tablets t3 = new Tablets(32, "Paracitamol", 32, 65, "Circle", "Paper Box");

        heals.add(k1); heals.add(k2); heals.add(k3);
        heals.add(t1); heals.add(t2); heals.add(t3);

        priceFilter(heals);
        printAll(heals);
        sortAll(heals);
        createNew(heals);
    }


    public static void priceFilter(ArrayList<Heals> heals){
        System.out.println("Task 1:" + "\n");

        heals
                .stream()
                .filter(Heals::discount)
                .forEach(System.out::println);

        System.out.println();
    }

    public static void printAll(ArrayList<Heals> heals){
        System.out.println("Task 2:" + "\n");

        heals.forEach(System.out::println);

        System.out.println();
    }

    public static void sortAll(ArrayList<Heals> heals){
        System.out.println("Task 3:" + "\n");

        heals
                .stream()
                .sorted(Heals::compareByPrice)
                .forEach(System.out::println);

        System.out.println();
    }

    public static void createNew(ArrayList<Heals> heals){
        System.out.println("Task 4:" + "\n");

        heals
                .stream()
                .map(Laboratory::new)
                .forEach(System.out::println);
    }
}
