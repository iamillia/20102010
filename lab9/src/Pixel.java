import java.util.Comparator;

public class Pixel {
    private double height;
    private double width;
    private double depth;

    public Pixel() {
    }

    public Pixel(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    static class HeightComparator implements Comparator<Pixel> {

        public int compare(Pixel p1, Pixel p2) {
            if (p1.getHeight() == p2.getHeight()) {
                return 0;
            } else if (p1.getHeight() > p2.getHeight()) {
                return 1;
            } else {
                return -1;
            }
        }
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public boolean equals(Pixel pixel) {
        if (this.height == pixel.height && this.height == pixel.width && this.depth == pixel.depth) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "height:"+height+" width:"+width+" depth:"+depth;
    }
}
