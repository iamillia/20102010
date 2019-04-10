import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        pixelObjects();
        nixelpixelObjects();
    }

    public static void pixelObjects() {
        Pixel.HeightComparator heightComparator = new Pixel.HeightComparator();
        TreeSet<Pixel> pixelTree = new TreeSet(heightComparator);
        Pixel[] pixelArray = new Pixel[5];

        Pixel p1 = new Pixel(180, 120, 140);
        Pixel p2 = new Pixel(160, 140, 160);
        Pixel p3 = new Pixel(140, 160, 180);
        Pixel p4 = new Pixel(120, 180, 200);
        Pixel p5 = new Pixel(100, 200, 220);

        pixelArray[0] = p1;
        pixelArray[1] = p2;
        pixelArray[2] = p3;
        pixelArray[3] = p4;
        pixelArray[4] = p5;
        System.out.println("Неотсортированный массив пикселей:");
        for (int i = 0; i < pixelArray.length; i++) {
            System.out.println(pixelArray[i]);
        }
        Arrays.sort(pixelArray, heightComparator);
        System.out.println("Отсортированный массив пикселей:");
        for (int i = 0; i < pixelArray.length; i++) {
            System.out.println(pixelArray[i]);
        }

        pixelTree.add(p1);
        pixelTree.add(p2);
        pixelTree.add(p3);
        pixelTree.add(p4);
        pixelTree.add(p5);
        System.out.println("TreeSet:");
        for (Pixel p : pixelTree) {
            System.out.println(p);
        }
    }


    public static void nixelpixelObjects() {
        NixelPixel.HeightComparator comparator = new NixelPixel().new HeightComparator();
        TreeSet<NixelPixel> nixelpixelTree = new TreeSet(comparator);
        NixelPixel[] nixelpixelArray = new NixelPixel[5];

        NixelPixel np1 = new NixelPixel(180, 120, 140, Color.Blue);
        NixelPixel np2 = new NixelPixel(160, 140, 160, Color.Blue);
        NixelPixel np3 = new NixelPixel(140, 160, 180, Color.Green);
        NixelPixel np4 = new NixelPixel(120, 180, 200, Color.Red);
        NixelPixel np5 = new NixelPixel(100, 200, 220, Color.Red);
        nixelpixelArray[0] = np1;
        nixelpixelArray[1] = np2;
        nixelpixelArray[2] = np3;
        nixelpixelArray[3] = np4;
        nixelpixelArray[4] = np5;

        Arrays.sort(nixelpixelArray, comparator);
        System.out.println("Отсортированный массив цветных пикселей:");

        for (int i = 0; i < nixelpixelArray.length; i++) {
            System.out.println(nixelpixelArray[i]);
        }

        nixelpixelTree.add(np1);
        nixelpixelTree.add(np2);
        nixelpixelTree.add(np3);
        nixelpixelTree.add(np4);
        nixelpixelTree.add(np5);
        System.out.println("TreeSet:");
        for (Pixel p : nixelpixelTree) {
            System.out.println(p);
        }
    }

}
