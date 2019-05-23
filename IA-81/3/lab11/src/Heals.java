public abstract class Heals {
    Integer  code;
    String name;
    int price;
    int nubmerOf;

    public Heals(Integer code) {
        this.code = code;
    }

    public Heals(Integer code, String name, int price, int nubmerOf) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.nubmerOf = nubmerOf;
    }

    public static boolean discount(Heals obj){
        return obj.price < 100;
    }

    @Override
    public String toString() {
        return "Heals:" + "code = " + code +
                " name = " + name + '\'' +
                " price = " + price +
                " nubmerOf = " + nubmerOf+ '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Heals)) return false;
        Heals heals = (Heals) o;
        return name.equals(heals.name);
    }

    public static int compareByPrice(Heals h1, Heals h2){return Integer.compare(h1.price, h2.price);}
}
