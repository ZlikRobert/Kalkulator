// A class that provides basic mathematical operations such as addition, subtraction, multiplication, and division
public class Kalkulator {
    // A static method that adds two numbers and returns the result
    public static double dodaj(double a, double b) {
        return a + b;
    }
    // A static method that subtracts one number from another and returns the result
    public static double odejmij(double a, double b) {
        return a - b;
    }
    // A static method that multiplies two numbers and returns the result
    public static double pomnoz(double a, double b) {
        return a * b;
    }
    // A static method that divides one number by another and returns the result. If the second number is zero, an exception is thrown.
    public static double podziel(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Nie można dzielić przez zero!");
        }
        return a / b;
    }
}
