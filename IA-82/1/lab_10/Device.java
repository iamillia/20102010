public class Device {

    private int ram = 0;
    private String device = "";
    private String videoCard="";
    String processor="";

    public Device() {
    }

    public Device( int ram, String device, String videoCard) {
        this.ram = ram;
        this.device = device;
        this.videoCard=videoCard;
    }

    public Device( String processor, int ram) {
        this.processor = processor;
        this.ram = ram;
    }


    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public String getDevice() {
        return device;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setDevice(String device) {
        this.device = device;
    }

}


