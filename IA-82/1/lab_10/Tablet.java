public class Tablet extends Device {
    private double SSD;
    public Tablet( String processor, int ram,double SSD) {
        super(processor, ram);
        this.SSD=SSD;
    }
    public Tablet(){

    }
    @Override
    public String toString() {
        return "Tablet{" +
                "processor='" + getProcessor() + '\'' +
                ", ram=" + getRam() +
                ", SSD='" + SSD + '\'' +
                '}';
    }
}
