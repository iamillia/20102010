class QuadCalculator {
    static double calculate(QuadDoubleFunction function, double arg1, double arg2, double arg3, double arg4) {
        return function.apply(arg1, arg2, arg3, arg4);
    }
}
