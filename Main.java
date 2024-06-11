class Calculator {
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public double cubeRoot(double num) {
        return Math.cbrt(num);
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Example usage
        double number = 64.0; // Example number
        double squareRoot = calculator.squareRoot(number);
        double cubeRoot = calculator.cubeRoot(number);

        System.out.println("Square root of " + number + " is: " + squareRoot);
        System.out.println("Cube root of " + number + " is: " + cubeRoot);
    }
}
