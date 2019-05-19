import java.util.Set;

public class Firma implements Comparable {
    String name_of_Company;
    Trudyaga name_of_BFBos;
    Set<Viddil> viddils ;

    public Firma(String name_of_Company, Trudyaga name_of_BFBos, Set<Viddil> viddils) {
        this.name_of_Company = name_of_Company;
        this.name_of_BFBos = name_of_BFBos;
        this.viddils = viddils;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "name_of_Company='" + name_of_Company + '\'' +
                ", name_of_BFBos=" + name_of_BFBos +
                ", viddils=" + viddils +
                '}';
    }

    public Set<Viddil> getViddils() {
        return viddils;
    }

    public Trudyaga getName_of_BFBos() {
        return name_of_BFBos;
    }

    @Override
    public int compareTo(Object o) {
        return((Firma)o).name_of_Company.compareTo(this.name_of_Company);
    }
}


