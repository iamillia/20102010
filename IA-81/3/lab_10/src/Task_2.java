import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList heals = new ArrayList();

        Krapli k1 = new Krapli(1,"Nazalong",245,900, 98, "Glass");
        Krapli k2 = new Krapli(2,"Evkazolin",250,450, 32);
        Krapli k3 = new Krapli(3,"Arestin",95,50, 78,"Glass");

        Tablets t1 = new Tablets(45, "Analgin", 45, 50);
        Tablets t2 = new Tablets(56, "Espumizan", 50, 15);
        Tablets t3 = new Tablets(32, "Paracitamol", 32, 65, "Circle", "Paper Box");

        heals.add(k1); heals.add(k2); heals.add(k3);
        heals.add(t1); heals.add(t2); heals.add(t3);

        heals.forEach(System.out::println);

    }
}
