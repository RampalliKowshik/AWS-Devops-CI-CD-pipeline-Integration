
import services.CalculatorService;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();

        System.out.println("🔢 Welcome to the Java Calculator!");

        if (args.length < 2) {
            System.out.println("❌ Please provide two integer arguments.");
            System.out.println("Usage: java Main <num1> <num2>");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            System.out.println("➕ Addition: " + calculator.add(a, b));
            System.out.println("➖ Subtraction: " + calculator.subtract(a, b));
            System.out.println("✖️ Multiplication: " + calculator.multiply(a, b));

            try {
                System.out.println("➗ Division: " + calculator.divide(a, b));
            } catch (ArithmeticException e) {
                System.out.println("❌ Error: " + e.getMessage());
            }

        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid input. Please provide valid integers.");
        }
    }
}

