import java.util.Comparator;
import java.util.Objects;

public class Krapli extends Heals {
    String type;
    String bottleMaterial;

    public Krapli(Integer code, String name, int price, int nubmerOf, String type, String bottleMaterial) {
        super(code, name, price, nubmerOf);
        this.type = type;
        this.bottleMaterial = bottleMaterial;
    }

    public Krapli(Integer code, String name, int price, int nubmerOf) {
        super(code, name, price, nubmerOf);
    }

    public String getType() { return type;  }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), bottleMaterial);
    }

    @Override
    public String toString() {
        return "Krapli{" +
                "type='" + type + '\'' +
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
