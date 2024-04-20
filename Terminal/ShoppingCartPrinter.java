package ShoppingCart.Terminal;

import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Item 1
        ItemToPurchase item1 = new ItemToPurchase();

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        item1.setName(scnr.nextLine());
        System.out.println("Enter the item price:");
        item1.setPrice(scnr.nextDouble());
        System.out.println("Enter the item quantity:");
        item1.setQuantity(scnr.nextInt());

        // Clear the buffer
        scnr.nextLine();

        // Item 2
        ItemToPurchase item2 = new ItemToPurchase();

        System.out.println("\nItem 2");
        System.out.println("Enter the item name:");
        item2.setName(scnr.nextLine());
        System.out.println("Enter the item price:");
        item2.setPrice(scnr.nextDouble());
        System.out.println("Enter the item quantity:");
        item2.setQuantity(scnr.nextInt());

        // Calculate total cost
        double totalCost = (item1.getPrice() * item1.getQuantity()) + (item2.getPrice() * item2.getQuantity());

        // Output total cost
        System.out.println("\nTOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $"
                + (item1.getPrice() * item1.getQuantity()));
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $"
                + (item2.getPrice() * item2.getQuantity()));

        System.out.println("\nTotal: $" + totalCost);

        scnr.close();
    }
}
