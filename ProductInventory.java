import java.util.Scanner;

public class ProductInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Arrays to store product names and quantities
        String[] productNames = new String[n];
        int[] quantities = new int[n];

        // Input product names and quantities
        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name #" + (i + 1) + ": ");
            productNames[i] = sc.nextLine();

            System.out.print("Enter quantity for " + productNames[i] + ": ");
            quantities[i] = sc.nextInt();
            sc.nextLine(); // consume newline
        }

        // Display low stock items (quantity < 5)
        System.out.println("\nLow Stock Items (quantity < 5):");
        boolean hasLowStock = false;
        for (int i = 0; i < n; i++) {
            if (quantities[i] < 5) {
                System.out.println(productNames[i] + " - Quantity: " + quantities[i]);
                hasLowStock = true;
            }
        }
        if (!hasLowStock) {
            System.out.println("No low stock items.");
        }

        // Search for a product by name
        System.out.print("\nEnter product name to search: ");
        String search = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (productNames[i].equalsIgnoreCase(search)) {
                System.out.println("Product Found: " + productNames[i] + " - Quantity: " + quantities[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }

        sc.close();
    }
}
