import java.util.Set;
public class Viddil implements Comparable {
    String name_of_viddil;
    Trudyaga mini_Boss;
    Set spisok_trudiag;

    public Trudyaga getMini_Boss() {
        return mini_Boss;
    }

    @Override
    public String toString() {
        return "Viddil{" +
                "name_of_viddil='" + name_of_viddil + '\'' +
                ", mini_Boss=" + mini_Boss +
                ", spisok_trudiag=" + spisok_trudiag +
                '}';
    }

    public Viddil(String name_of_viddil, Trudyaga mini_Boss, Set spisok_trudiag) {
        this.name_of_viddil = name_of_viddil;
        this.mini_Boss = mini_Boss;
        this.spisok_trudiag = spisok_trudiag;
    }

    public Trudyaga getSpisok_trudiag(Trudyaga rabotyaga) {
        return rabotyaga;
    }

    @Override
    public int compareTo(Object o) {
        return((Viddil)o).name_of_viddil.compareTo(this.name_of_viddil);
    }

}