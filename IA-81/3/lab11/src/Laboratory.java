public class Laboratory {
    Heals heals;
    boolean fit;

    public Laboratory(Heals heals, boolean fit) {
        this.heals = heals;
        this.fit = fit;
    }

    public Laboratory(Heals heals) {
        this.heals = heals;
    }

    public static boolean test(Heals obj){
        return obj.nubmerOf >= 50;}

    @Override
    public String toString() {
        return "Laboratory{" +
                "heals=" + heals +
                ", fit=" + fit +
                '}';
    }
}
