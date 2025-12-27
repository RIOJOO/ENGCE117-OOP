import java.util.Scanner;

class Product {

    private String name; 

    public static int productCount = 0; 

    public Product(String name) {
        this.name = name; 
        productCount++;   
    }

    public String getName() {
        return name;
    }

    public static int getProductCount() {
        return productCount;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        scanner.nextLine(); 

        for (int i = 0; i < N; i++) {
            String productName = scanner.nextLine();

            Product product = new Product(productName);
        }
        
        System.out.println(Product.getProductCount());
        
        scanner.close();
    }
}