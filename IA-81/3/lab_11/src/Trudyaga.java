public class Trudyaga implements Comparable {
    String name;
    String surname;
    int zarplata;

    public Trudyaga(String name, String surname, int zarplata) {
        this.name = name;
        this.surname = surname;
        this.zarplata = zarplata;
    }

    @Override
    public String toString() {
        return "Trudyaga{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", zarplata=" + zarplata +
                '}';
    }


    public int getZarplata() {
        return zarplata;
    }

    @Override
    public int compareTo(Object o) {
        return((Trudyaga)o).name.compareTo(this.name);
    }
}
