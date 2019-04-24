interface SolutionEquation {
    void CalculateUravnenie();
}

public class QuadraticEquation implements SolutionEquation {
    int a, b, c;
    private double x1=0, x2=0, d=0;
    QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public void CalculateUravnenie() {
        d = (int) (Math.pow(b, 2) - (4 * a * c));
        if (d > 0) {
            x1 = (((-1) * b + Math.sqrt(d)) / (2 * a));
            x2 = (((-1) * b - Math.sqrt(d)) / (2 * a));
        } else if (d == 0) {
            x1 = x2 = ((-1) * b) / (2 * a);
        } else {

            x1 = x2 = 0;
        }
        Output();
    }

    public String toString(){
        return "QuadraticEquation: a = " + a + " b = " + b + " c = " + c;
    }
    private void Output() {
        if (d > 0) {
            System.out.print("x1 = " + x1 + "; x2 = " + x2);
        }
        else if (d == 0) {
            System.out.print("Only one solution: x1,x2 = " + x2);

        } else {
            System.out.print("D is smaller then zero! No real solution.");
        }
    }
}
