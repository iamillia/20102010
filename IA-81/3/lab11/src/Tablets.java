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
}
