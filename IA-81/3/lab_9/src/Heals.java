import java.util.Objects;

public abstract class Heals {
    Integer  code;
    String name;
    int price;
    int numberOf;

    public Heals(Integer code, String name, int price, int nubmerOf) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.numberOf = nubmerOf;
    }

    public Heals() {
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
        return Objects.hash(code, name, price, numberOf);
    }

    @Override
    public String toString() {
        return "Heals:" + "code = " + code +
                " name = " + name + '\'' +
                " price = " + price +
                " nubmerOf = " + numberOf+ '\'';
    }

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }

    public int getNubmerOf() {
        return numberOf;
    }
}
