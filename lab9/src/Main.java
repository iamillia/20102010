import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    static Pixel p1 = new Pixel(140, 180, 140);
    static Pixel p2 = new Pixel(100, 160, 160);
    static Pixel p3 = new Pixel(180, 140, 180);
    static Pixel p4 = new Pixel(100, 100, 200);
    static Pixel p5 = new Pixel(160, 120, 220);
    static Pixel pNull = null;

    public static void main(String[] args) {

        Comparator<Pixel> heightComparator = (Pixel o1, Pixel o2) -> {
            if (o1.getHeight() > o2.getHeight()) {
                return 1;
            } else  if (o1.getHeight() < o2.getHeight()) {
                return  -1;
            } else {
                return 0;
            }
        };

        Comparator<Pixel> widthComparator = (Pixel o1, Pixel o2) -> {
            if (o1.getWidth() > o2.getWidth()) {
                return 1;
            } else  if (o1.getWidth() < o2.getWidth()) {
                return  -1;
            } else {
                return 0;
            }
        };

        Comparator<Pixel> reversedComparator = heightComparator.reversed();
        Comparator<Pixel> doubleComparator = heightComparator.thenComparing(widthComparator);
        Comparator<Pixel> nullComparator = Comparator.nullsFirst(heightComparator);


        compareAndOut(heightComparator);
        compareAndOut(reversedComparator);
        compareAndOut(doubleComparator);
        compareNullAndOut(nullComparator);
    }

    public static void compareAndOut(Comparator comp) {
        TreeSet<Pixel>pixelTree = new TreeSet<Pixel>(comp);
        pixelTree.add(p1);
        pixelTree.add(p2);
        pixelTree.add(p3);
        pixelTree.add(p4);
        pixelTree.add(p5);
        for (Pixel p : pixelTree) {
            System.out.println(p);
        }
        System.out.println();
    }

    public static void compareNullAndOut(Comparator comp) {
        TreeSet<Pixel>pixelTree = new TreeSet<Pixel>(comp);
        pixelTree.add(p1);
        pixelTree.add(p2);
        pixelTree.add(p3);
        pixelTree.add(p4);
        pixelTree.add(p5);
        pixelTree.add(pNull);
        for (Pixel p : pixelTree) {
            System.out.println(p);
        }
        System.out.println();
    }
}
