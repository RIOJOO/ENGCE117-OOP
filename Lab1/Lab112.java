package Lab1;

import java.util.Scanner;

public class Lab112 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // รับจำนวนสินค้า
        System.out.print("Enter the number of products: ");
        // รับค่า n เพื่อกำหนดขนาดอาเรย์
        int n = scanner.nextInt();
        // สร้างอาเรย์เพื่อเก็บข้อมูลสินค้า
        int[] productIDs = new int[n];           // สำหรับรหัสสินค้า
        int[] stockQuantities = new int[n];      // สำหรับจำนวนคงคลัง
        
        // รับข้อมูลสินค้า n ชิ้น
        for (int index = 0; index < n; index++) {
            System.out.println("Enter details for product " + (index + 1) + ":");
            // รับรหัสสินค้า ( ID )
            System.out.print("  Product ID: ");
            productIDs[index] = scanner.nextInt();
            // รับจำนวนคงคลัง ( Stock )
            System.out.print("  Stock Quantity: ");
            stockQuantities[index] = scanner.nextInt();
        }
        // รับรหัสสินค้าที่ต้องการค้น (Search ID)
        System.out.print("Enter the Product ID to search: ");
        int searchID = scanner.nextInt();
        // ค้นหาสินค้าและแสดงผล
        int foundStock = -1;  // เอา -1 มาเป็นค่าเริ่มต้นเพื่อบอกว่ายังไม่เจอสินค้า
        for (int index = 0; index < n; index++) {
            if (productIDs[index] == searchID) {
                foundStock = stockQuantities[index];
                break; // หยุดหาต่อเมื่อเจอสินค้า
            }
        }
        // แสดงผลลัพธ์
        if (foundStock != -1) {
            System.out.println("Stock Quantity for Product ID " + searchID + ": " + foundStock); // กรณีที่เจอสินค้า
        } else {
            System.out.println("Product ID " + searchID + " not found."); // กรณีที่ไม่เจอสินค้า
        }
        scanner.close();
    }
}