import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name) {
        this(name, 0.0);
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

public class Lab402 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mode = sc.nextInt();
        sc.nextLine();

        if (mode == 1) {
            String name = sc.nextLine();
            Product p = new Product(name);
            p.displayInfo();
        } else if (mode == 2) {
            String name = sc.nextLine();
            double price = sc.nextDouble();
            Product p = new Product(name, price);
            p.displayInfo();
        }
        
        sc.close();
    }
}