package zad1;

public class Calculator {
//    private double result;

    public double add(double x, double y, double z) {
//        System.out.println(result);
//        result = x + y + z;
//        return result;
        return x + y + z;
    }

    public double substract(double x, double y) {
//        System.out.println(result);
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0)
//            throw new NullPointerException("Second argument can not be null");
            throw new IllegalArgumentException("Second argument can not be null");

        return x / y;
    }

}
