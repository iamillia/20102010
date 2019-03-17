public class Main {
    public static void main(String[] args) {
        FileFinder fileFinder = new FileFinder();
        long currentTime = System.currentTimeMillis();
        System.out.println(fileFinder.rarestWord("D://file1.txt", "D://file2.txt"));
        System.out.println(System.currentTimeMillis() - currentTime);
    }
}
