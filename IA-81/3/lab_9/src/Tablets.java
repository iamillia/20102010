import java.util.Objects;

public class Tablets extends Heals {
    String form = null;
    Integer weight = null;

    public Tablets(Integer code, String name, int price, int numberOf, String form, Integer weight) {
        super(code, name, price, numberOf);
        this.form = form;
        this.weight = weight;
    }

    public Tablets(Integer code, String name, int price, int numberOf) {
        super(code, name, price, numberOf);
    }

    public String getForm() {
        return form;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tablets)) return false;
        if (!super.equals(o)) return false;
        Tablets tablets = (Tablets) o;
        return getForm().equals(tablets.getForm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getForm());
    }

    @Override
    public String toString() {
        return "Tablets{" +
                "form='" + form + '\'' +
                ", weight='" + weight + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", nubmerOf=" + numberOf +
                '}';
    }

    public Integer getWeight() {
        return weight;
    }
}
