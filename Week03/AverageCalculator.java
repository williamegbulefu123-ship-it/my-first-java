import java.util.Scanner;

/**
 * AverageCalculator
 * Reads three numbers from the user and displays their total and average.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Average Calculator ===");

        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        System.out.print("Enter the third number: ");
        double thirdNumber = input.nextDouble();

        double total = firstNumber + secondNumber + thirdNumber;
        double average = total / 3;

        System.out.println();
        System.out.println("Total   : " + total);
        System.out.printf("Average : %.2f%n", average);

        input.close();
    }
}
