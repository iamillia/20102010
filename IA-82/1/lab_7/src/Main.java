import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] arg) {


        Videoclip vi = new Videoclip(" ", " ", " ");
        vi.setTitle("Sky");
        vi.setSinger("Okean Elzy");
        vi.setVideo("GodBlessYOu");

        TreeSet<Song> videoclips = new TreeSet<>(new Song.NameComparator());


        videoclips.add(new Videoclip("Voice", "Alekseev", "HD"));
        videoclips.add(new Videoclip("Apple", "Brunette", "NO"));
        videoclips.add(new Videoclip("Blue", "Jack", "Best"));

        System.out.println(videoclips);
        System.out.println("---------------------------------------------------------------------------------------");

        Videoclip v1 = new Videoclip("Sun", "Alekseev", "new");
        Videoclip v2 = new Videoclip("Island","We", "africs");
        Videoclip v4 = new Videoclip("a", "Json", "bount");
        Videoclip v5 = new Videoclip("v", "Barskix", "wide");
        Videoclip v6 = new Videoclip("c", "Maruv", "clone");
        Videoclip v7 = new Videoclip("b", "Maroon5", "birthday");


        Videoclip[] videoclips1 = {v1,v2,v5, v4, v7, v6};

        Arrays.sort(videoclips1, v1. new VideoComparator());

        for (Videoclip t : videoclips1) {
            System.out.println(t);
        }

    }
}



