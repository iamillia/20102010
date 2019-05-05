public class Laptop  extends Device {
    String processor = "";


    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", device='" + getDevice() + '\'' +
                ", ram=" + getRam() +
                ", videoCard='" + getVideoCard() + '\'' +
                '}';
    }

    public Laptop(String processor, int ram, String device, String videoCard) {
        super(ram, device, videoCard);
        this.processor = processor;
    }
}
