class Discriminant extends Uravnenie {

    public Discriminant(int a, int b, int c) {
        super(a, b, c);
    }

    public void Dis() {
        d = Math.pow(b, 2) - (4 * a * c);
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
        } else if (d == 0) {
            x1 = -b / (2 * a);
        }
    }

    @Override
    public String toString() {
        Dis();
        if (d == 0) {
            return "x1, x2 = " + x1;
        } else if(d > 0) {
            return "x1 = " + x1 + ", x2 = " + x2;
        } else
            return "D is smaller then zero!";
    }
}
