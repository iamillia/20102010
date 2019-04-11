import java.util.Comparator;
import java.util.Objects;

public class Tablets extends Heals {
    String form;
    String typeOfContainer;

    public Tablets(Integer code, String name, int price, int nubmerOf, String form, String typeOfContainer) {
        super(code, name, price, nubmerOf);
        this.form = form;
        this.typeOfContainer = typeOfContainer;
    }

    public Tablets(Integer code, String name, int price, int nubmerOf) {
        super(code, name, price, nubmerOf);
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
                ", typeOfContainer='" + typeOfContainer + '\'' +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", nubmerOf=" + nubmerOf +
                '}';
    }

    static class TabletsNumberOfComparator implements Comparator<Tablets>{
        @Override
        public int compare(Tablets t1, Tablets t2){ return Integer.compare(t1.nubmerOf, t2.nubmerOf); }
    }
}
