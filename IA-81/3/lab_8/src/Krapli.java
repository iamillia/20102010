import java.util.Comparator;
import java.util.Objects;

public class Krapli extends Heals {
    Integer daysToEnd;
    String bottleMaterial;

    public Krapli(Integer code, String name, int price, int nubmerOf, Integer daysToEnd, String bottleMaterial) {
        super(code, name, price, nubmerOf);
        this.daysToEnd = daysToEnd;
        this.bottleMaterial = bottleMaterial;
    }


    public Krapli(Integer code, String name, int price, int nubmerOf, Integer daysToEnd) {
        super(code, name, price, nubmerOf);
        this.daysToEnd = daysToEnd;
    }

    public Krapli(Integer code, String name, int price, int nubmerOf) {
        super(code, name, price, nubmerOf);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Krapli)) return false;
        if (!super.equals(o)) return false;
        Krapli krapli = (Krapli) o;
        return daysToEnd.equals(krapli.daysToEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), daysToEnd);
    }
    

    @Override
    public String toString() {
        return "Krapli{" +
                "type='" + daysToEnd + '\'' +
                ", bottleMaterial='" + bottleMaterial + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", nubmerOf=" + nubmerOf +
                '}';
    }

    class KraplipriceComparator implements Comparator<Krapli>{
        @Override
        public int compare(Krapli k1, Krapli k2){
            return Integer.compare(k1.price, k2.price);
        }
    }

}
