package Lab1;

import java.util.Scanner;

public class Lab111 {
    public static int sumArray(int[] numbers) {
        int sum = 0;
        // ลูปผ่านแต่ละตัวเลขของอาเรย์และบวกเข้ากับ sum
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Find the sum of the numbers in an array. ---");

        // รับค่าขนาดอาเรย์จากผู้ใช้
        System.out.print("Enter an integer N (the size of the array).: ");
        if (!scanner.hasNextInt()) {
            System.out.println(" Invalid Input: Enter an integer of the size of the array..");
            scanner.close();
            return;
        }
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println(" The array size must be a positive integer.");
            scanner.close();
            return;
        }
        
        // สร้างอาเรย์ขนาด n
        int[] numbers = new int[n];
        
        // รับค่าตัวเลข n ตัวจากผู้ใช้
        System.out.println("---------------------------------");
        System.out.println("Enter the integer " + n + " to store in the array.:"); 
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            if (!scanner.hasNextInt()) {
                System.out.println(" Invalid Input: Enter an integer of the size of the array.");
                scanner.close();
                return;
            }
            
            numbers[i] = scanner.nextInt();
        } // สิ้นสุด For Loop สำหรับรับ Input

        // เรียกใช้ฟังก์ชัน sumArray
        int totalSum = sumArray(numbers); 
        
        // เอาผลลัพธ์แสดงบนหน้าจอ
        System.out.println("---------------------------------");
        System.out.println(" The sum of the numbers in the array is: " + totalSum);
        
        scanner.close();
    }
}