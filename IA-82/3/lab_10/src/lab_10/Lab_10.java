package lab_10;

public class Lab_10 {
    public static void main(String[] args) {
        displayResults((a, b, c, d) -> 
                Math.pow(2 * Math.sin(a) + Math.cos(Math.abs(b * Math.pow(c, 0.5))), d), 1, 1, 1, 1);
    }
    
    public double calculateResult(int a, int b, int c, int d) {
        return Math.pow(2 * Math.sin(a) + Math.cos(Math.abs(b * Math.pow(c, 0.5))), d);
    }
    
    public static void displayResults(FourIntParamsFunction f, int a, int b, int c, int d){
        System.out.println(String.format("a = %d, b = %d, c = %d, d = %d, result = %g",
                a, b, c, d, f.applyAsByte(a, b, c, d)));
    } 
    
    @FunctionalInterface
    public interface FourIntParamsFunction {

        double applyAsByte(int a, int b, int c, int d);

    }
}
