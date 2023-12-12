package basics.lab2;

public class Calculator {
    public static void summation(int a, int b) {
        int result = a + b;
        print(result);
    }

    public static void summation(double a, double b) {
        double result = a + b;
        print(result);
    }

    public static void summation(long a, long b) {
        long result = a + b;
        print(result);
    }

    public static void division(int a, int b) {
        double result = a / b;
        print(result);
    }

    public static void division(double a, double b) {
        double result = a / b;
        print(result);
    }

    public static void division(long a, long b) {
        double result = a / b;
        print(result);
    }

    public static void multiplication(int a, int b) {
        int result = a * b;
        print(result);
    }

    public static void multiplication(double a, double b) {
        double result = a * b;
        print(result);
    }

    public static void multiplication(long a, long b) {
        long result = a * b;
        print(result);
    }

    public static void subtraction(int a, int b) {
        int result = a - b;
        print(result);
    }

    public static void subtraction(double a, double b) {
        double result = a - b;
        print(result);
    }

    public static void subtraction(long a, long b) {
        long result = a - b;
        print(result);
    }

    private static void print(Object result) {
        System.out.println(result);
    }

}
