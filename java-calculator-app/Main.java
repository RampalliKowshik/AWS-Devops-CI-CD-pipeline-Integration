
import services.CalculatorService;
import utils.InputHelper;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();
        int a, b;

        System.out.println("🔢 Welcome to the Java Calculator!");

        if (args.length < 2) {
            a = InputHelper.getInt("Enter first number: ");
            b = InputHelper.getInt("Enter second number: ");
        } else {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        System.out.println("➕ Addition: " + calculator.add(a, b));
        System.out.println("➖ Subtraction: " + calculator.subtract(a, b));
        System.out.println("✖️ Multiplication: " + calculator.multiply(a, b));

        try {
            System.out.println("➗ Division: " + calculator.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}

