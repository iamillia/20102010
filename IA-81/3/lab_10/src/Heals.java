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
    public String toString() {
        return "Heals:" + "code = " + code +
                " name = " + name + '\'' +
                " price = " + price +
                " nubmerOf = " + nubmerOf+ '\'';
    }
}
