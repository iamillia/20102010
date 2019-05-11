public final class QuadraticEquation implements EquationSolver {
    private final double a, b, c;
    private final double[] result;
    private final int numberOfXs;

    public QuadraticEquation(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
        result = null;
        numberOfXs = -1;
    }

    public QuadraticEquation(double[] args){
        boolean isArgsNull = args.length == 0;
            this.a = isArgsNull ? 0 : args[0];
            this.b = isArgsNull ? 0 : args[1];
            this.c = isArgsNull ? 0 : args[2];
            result = isArgsNull ? null : getResult();

            numberOfXs = isArgsNull ? -1 :
                    result != null ? result.length : 0;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        result = getResult();

        numberOfXs = result != null ? result.length : 0;
    }

    public String getResultString() {
        double[] res = getResult();
        String resultString = this.toString();

        if(res == null) {
            return resultString.concat("No solutions.");
        }

        switch (res.length) {
            case 2:
                return resultString.concat(String.format("X1: %f, X2: %f", res[0], res[1]));
            case 1:
                return resultString.concat(String.format("X0: %f", res[0]));
        }

        return null;
    }

    private double[] getResult() {
        double[] result = solveEquation(a, b, c);

        return result != null ? result : null;
    }

    private double[] solveEquation(double a, double b, double c) {
        double descriminant = Math.pow(b, 2) - 4*a*c;
        double[] x;

        if(descriminant > 0) {
            x = new double[2];
            x[0] = (-b + Math.sqrt(descriminant)) / 2*a;
            x[1] = (-b - Math.sqrt(descriminant)) / 2*a;
            return x;
        } else if(descriminant == 0) {
            x = new double[1];
            x[0] = -b / 2*a;
            return x;
        }

        return null;
    }

    public double getA() { return a; }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    static boolean haveSolutions(QuadraticEquation quadraticEquation) {
        return quadraticEquation.numberOfXs != -1;
    }

    public void printA(QuadraticEquation quadraticEquation) {
        if(haveSolutions(quadraticEquation)) {
            System.out.println(quadraticEquation.getA());
        }
    }

    public String toString() {
        return String.format("Quadratic equation params. A: %f, B: %f, C: %f. ", a, b, c);
    }

    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }
}