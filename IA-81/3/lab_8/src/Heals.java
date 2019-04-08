import java.util.Comparator;
import java.util.Objects;

public abstract class Heals {
    Integer  code;
    String name;
    int price;
    int nubmerOf;

    public Heals(Integer code, String name, int price, int nubmerOf) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.nubmerOf = nubmerOf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Heals)) return false;
        final Heals secElem = (Heals) o;
        if(this.price != secElem.price) return false;
        if(!Objects.equals(this.price, secElem.price)) return  false;
        return Objects.equals(this.price, secElem.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, price, nubmerOf);
    }

    @Override
    public String toString() {
        return "Heals:" + "code = " + code +
                " name = " + name + '\'' +
                " price = " + price +
                " nubmerOf = " + nubmerOf+ '\'';
    }

    static class HealsComparator implements Comparator<Heals> {
        @Override
        public int compare(Heals h1, Heals h2){
            return Integer.compare(h1.nubmerOf, h2.nubmerOf);
        }
    }
}
