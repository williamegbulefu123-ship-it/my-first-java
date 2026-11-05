import java.util.Scanner;

/**
 * ItemCost
 * Reads an item name, its unit price and the quantity bought,
 * then displays the total cost.
 */
public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Item Cost Calculator ===");

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the price per item: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        double totalCost = unitPrice * quantity;

        System.out.println();
        System.out.println("Item        : " + itemName);
        System.out.printf("Unit price  : %.2f%n", unitPrice);
        System.out.println("Quantity    : " + quantity);
        System.out.printf("Total cost  : %.2f%n", totalCost);

        input.close();
    }
}
