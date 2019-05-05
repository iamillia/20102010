public class PC extends Device {

    public PC(String processor, int ram) {
        super(processor, ram);
    }

    public PC() {

    }

    @Override
    public String toString() {
        return "PC{" +
                "processor='" + getProcessor() + '\'' +
                ", ram=" + getRam() +
                '}';
    }
}