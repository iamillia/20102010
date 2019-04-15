import java.util.Objects;

public class Krapli extends Heals {
    Integer daysToEnd = null;
    String bottleMaterial = null;

    public Krapli(Integer code, String name, int price, int numberOf, Integer daysToEnd, String bottleMaterial) {
        super(code, name, price, numberOf);
        this.daysToEnd = daysToEnd;
        this.bottleMaterial = bottleMaterial;
    }


    public Krapli(Integer code, String name, int price, int numberOf, Integer daysToEnd) {
        super(code, name, price, numberOf);
        this.daysToEnd = daysToEnd;
    }

    public Krapli(Integer code, String name, int price, int numberOf) {
        super(code, name, price, numberOf);
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
                "daysToEnd=" + daysToEnd +
                ", bottleMaterial='" + bottleMaterial + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", nubmerOf=" + numberOf +
                '}';
    }

    public Integer getDaysToEnd() {
        return daysToEnd;
    }

    public String getBottleMaterial() {
        return bottleMaterial;
    }

    public Krapli() {
    }
}
