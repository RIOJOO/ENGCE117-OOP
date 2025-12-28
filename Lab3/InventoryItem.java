import java.util.Scanner;

public class InventoryItem {

    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;

        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount <= this.stock) {
            this.stock -= amount;
            System.out.println("Sale successful.");
        } else {
            System.out.println("Not enough stock.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Product Name (String): ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Stock (int): ");
        int initialStock = scanner.nextInt();

        InventoryItem item = new InventoryItem(name, initialStock);

        System.out.print("Enter Number of Days N (int): ");
        int N = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < N; i++) {
            System.out.print("Day " + (i + 1) + " (Command and Amount): ");
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            
            if (parts.length < 2) {
                System.out.println("Invalid input format. Skipping day.");
                continue;
            }

            String command = parts[0];
            int amount = 0;
            try {
                amount = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount format. Skipping day.");
                continue;
            }

            if (command.equalsIgnoreCase("ADD")) {
                item.addStock(amount);
            } else if (command.equalsIgnoreCase("SELL")) {
                item.sellStock(amount);
            } else {
                System.out.println("Invalid command.");
            }
        }

        System.out.println("--- Final Stock ---");
        System.out.println("Final: " + item.getProductName() + " | " + item.getStock());
        
        scanner.close();
    }
}