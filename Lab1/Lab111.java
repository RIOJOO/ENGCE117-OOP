package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab111 {
    
    //คำนวณผลรวมของตัวเลขทั้งหมดในอาเรย์
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
    //รับค่าจำนวนเต็มบวกจากผู้ใช้ พร้อมการตรวจสอบความถูกต้องของข้อมูล
    public static int getPositiveIntInput(Scanner scanner, String prompt) {
        int input = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            try {
                if (scanner.hasNextInt()) {
                    input = scanner.nextInt();
                    if (input > 0) {
                        isValid = true;
                    } else {
                        System.out.println(" The array size must be a positive integer (N > 0).");
                    }
                } else {
                    System.out.println(" Invalid Input: Please enter an integer.");
                    scanner.next(); // ลบอินพุตที่ไม่ถูกต้อง
                }
            } catch (InputMismatchException e) {
                System.out.println(" Invalid Input: Please enter a valid integer.");
                scanner.next(); // ลบอินพุตที่ไม่ถูกต้อง
            }
        }
        return input;
    }
    // รับค่าตัวเลข n ตัวจากผู้ใช้เพื่อเก็บในอาเรย์
    public static int[] getArrayElements(Scanner scanner, int n) {
        int[] numbers = new int[n];
        System.out.println("---------------------------------");
        System.out.println("Enter the integer " + n + " to store in the array:");
        for (int i = 0; i < n; i++) {
            boolean isValid = false;
            while (!isValid) {
                System.out.print("Enter number " + (i + 1) + ": ");
                try {
                    if (scanner.hasNextInt()) {
                        numbers[i] = scanner.nextInt();
                        isValid = true;
                    } else {
                        System.out.println(" Invalid Input: Please enter an integer.");
                        scanner.next(); // ลบอินพุตที่ไม่ถูกต้อง
                    }
                } catch (InputMismatchException e) {
                    System.out.println(" Invalid Input: Please enter a valid integer.");
                    scanner.next(); // ลบอินพุตที่ไม่ถูกต้อง
                }
            }
        }
        return numbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Find the sum of the numbers in an array. ---");
        int n = getPositiveIntInput(scanner, "Enter an integer N (the size of the array).: ");
        int[] numbers = getArrayElements(scanner, n);
        // เรียกใช้ฟังก์ชัน sumArray
        int totalSum = sumArray(numbers);
        // เอาผลลัพธ์แสดงบนหน้าจอ
        System.out.println("---------------------------------");
        System.out.println(" The sum of the numbers in the array is: " + totalSum);
        scanner.close();
    }
}
/*
* แล้วแต่คิงจะกึ๊ดเต๊อะฮายะตึงวันก่ได้คะแนนตะอี้หนะ */