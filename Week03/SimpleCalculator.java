import java.util.Scanner;

/**
 * SimpleCalculator
 * Reads two numbers from the user and displays their sum,
 * difference, product and quotient.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        double sum = firstNumber + secondNumber;
        double difference = firstNumber - secondNumber;
        double product = firstNumber * secondNumber;

        System.out.println();
        System.out.println("Sum        : " + firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println("Difference : " + firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println("Product    : " + firstNumber + " * " + secondNumber + " = " + product);

        // Division by zero must be avoided
        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.println("Quotient   : " + firstNumber + " / " + secondNumber + " = " + quotient);
        } else {
            System.out.println("Quotient   : Cannot divide by zero.");
        }

        input.close();
    }
}
