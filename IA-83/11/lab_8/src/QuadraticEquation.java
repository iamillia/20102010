class QuadraticEquation implements SolutionEquation {
    public int a, b, c;
    private double x1, x2, d;

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

    @Override
    public String toString() {
        return String.format("Quadratic equation a = %d, b = %d, c = %d\n", a, b, c);
    }
}
