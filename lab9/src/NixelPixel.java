import java.util.Comparator;

enum Color {
    Red, Green, Blue
}
public class NixelPixel extends Pixel {
    private Color color;

    public NixelPixel() {

    }

    public NixelPixel(Color pixelColor) {
        this.color = pixelColor;
    }

    public NixelPixel(double height, double width, double depth, Color color) {
        super(height, width, depth);
        this.color = color;
    }



    public void setColor(Color pixelColor) {
        this.color = pixelColor;
    }

    public Color getColor() {
        return color;
    }

    public boolean equals(NixelPixel pixel) {
        if (getHeight() == pixel.getHeight() && getWidth() == pixel.getWidth()
                && getDepth() == pixel.getDepth() && this.color == pixel.getColor()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "height:"+getHeight()+" width:"+getWidth()+" depth:"+getDepth()+" color:"+color;
    }
}
