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
}
