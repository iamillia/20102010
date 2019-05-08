abstract class Uravnenie {

    double a;
    double b;
    double c;
    double x1, x2, d;

    Uravnenie(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void CalculateUravnenie(double x) {
        double Begin = a * (double) (Math.pow(x, 2)) + (b * x) + c;

    }
}

