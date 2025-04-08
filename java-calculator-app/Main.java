
import services.CalculatorService;
import utils.InputHelper;

public class Main {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();

        System.out.println("🔢 Welcome to the Java Calculator!");
        int a = InputHelper.getInt("Enter first number: ");
        int b = InputHelper.getInt("Enter second number: ");

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

