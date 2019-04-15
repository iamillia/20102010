import java.util.Comparator;

class Comp implements Comparator<Videoclip> {
    public int compare(Videoclip s1, Videoclip s2) {
        return s1.getVideo().compareTo(s2.getVideo());
}}