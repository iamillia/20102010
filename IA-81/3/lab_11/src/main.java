import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class main {

    public static void main(String[] args) {
        Trudyaga trudyaga1 = new Trudyaga("Bucky", "Barns", 950);
        Trudyaga trudyaga2 = new Trudyaga("Natasha", "Romanov", 8000);
        Trudyaga trudyaga3 = new Trudyaga("Piter", "Parker", 1000);
        Trudyaga trudyaga4 = new Trudyaga("James", "Rouds", 3500);
        Trudyaga boss_Viddilu = new Trudyaga("Tony", "Stark", 10000);
        Trudyaga boss_Viddilu1 = new Trudyaga("Steven", "Rogers", 7000);
        Trudyaga BFBoss = new Trudyaga("Stan", "Lee", 20000);

        Set<Trudyaga> Za_Rogersa = new TreeSet<Trudyaga>();
        Za_Rogersa.add(trudyaga1);
        Za_Rogersa.add(trudyaga2);

        Set<Trudyaga> Za_Starka = new TreeSet<Trudyaga>();
        Za_Starka.add(trudyaga3);
        Za_Starka.add(trudyaga4);

        Set<Trudyaga> mini_bosses = new TreeSet<Trudyaga>();
        mini_bosses.add(boss_Viddilu);
        mini_bosses.add(boss_Viddilu1);

        Viddil Za_Regisraciu = new Viddil("Za_Starka", boss_Viddilu, Za_Starka);

        Viddil Protiv_Registracii = new Viddil("Za_Rogersa", boss_Viddilu1, Za_Rogersa);

        Set<Viddil> viddils = new TreeSet<Viddil>();
        viddils.add(Za_Regisraciu);
        viddils.add(Protiv_Registracii);

        Firma Marvel = new Firma("Mstiteli", BFBoss, viddils);

        Set<Firma> firmas = new TreeSet<Firma>();
        firmas.add(Marvel);

// Завдання №1 --------------------------------------------------
        Set<Integer> VseGroshi = new TreeSet<Integer>();

        int maxZarplata = 0;

            VseGroshi.add(Marvel.getName_of_BFBos().getZarplata());
            VseGroshi.add(Za_Regisraciu.getMini_Boss().getZarplata());
            VseGroshi.add(Protiv_Registracii.getMini_Boss().getZarplata());
            VseGroshi.add(Za_Regisraciu.getSpisok_trudiag(trudyaga3).getZarplata());
            VseGroshi.add(Za_Regisraciu.getSpisok_trudiag(trudyaga4).getZarplata());
            VseGroshi.add(Protiv_Registracii.getSpisok_trudiag(trudyaga1).getZarplata());
            VseGroshi.add(Protiv_Registracii.getSpisok_trudiag(trudyaga2).getZarplata());

        for (Iterator j = VseGroshi.iterator(); j.hasNext(); ) {
            int zarplata = (int) j.next();
            if (maxZarplata < zarplata) {
                maxZarplata = zarplata;
            }
        }
        System.out.println("Max Zarplata : " + maxZarplata);
//----------------------------------------------------------------

// Завдання №2 --------------------------------------------------

            for (Iterator<Trudyaga> j = Za_Rogersa.iterator(); j.hasNext(); ) {
                if (boss_Viddilu1.getZarplata() < j.next().getZarplata()) {
                    System.out.println("Tut trudyaga mae bilshe za mini bosa: " + Protiv_Registracii.name_of_viddil);
                }

            for (Iterator<Trudyaga> k = Za_Starka.iterator(); k.hasNext(); ) {
                if (boss_Viddilu.getZarplata() < k.next().getZarplata()) {
                    System.out.println("Tut trudyaga mae bilshe za mini bosa: " + Za_Regisraciu.name_of_viddil);
                }
            }
        }
//----------------------------------------------------------------

// Завдання №3 --------------------------------------------------

            Set<Trudyaga> VsiRabochi = new TreeSet<>();
            for(Firma k : firmas){
                VsiRabochi.addAll(Za_Rogersa);
                VsiRabochi.addAll(Za_Starka);
                VsiRabochi.add(boss_Viddilu);
                VsiRabochi.add(boss_Viddilu1);
                VsiRabochi.add(BFBoss);
//                VsiRabochi.add(k.name_of_BFBos);
//                VsiRabochi.add(k.getV);
//                VsiRabochi.add(k.getViddils().);
//                VsiRabochi.add(k.viddils.get(0).rabotniki.get(0));
//                VsiRabochi.add(k.viddils.get(0).rabotniki.get(1));
//                VsiRabochi.add(k.viddils.get(1).rabotniki.get(0));
//                VsiRabochi.add(k.viddils.get(1).rabotniki.get(1));
            }
            System.out.println(VsiRabochi);
//----------------------------------------------------------------

        }
}
