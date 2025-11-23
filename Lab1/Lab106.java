package Lab1
import java.util.Scanner;

public class Lab106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("กรุณาใส่หมายเลขแม่สูตรคูณ (N): ");
        int N = scanner.nextInt();
        
        System.out.println("--- แม่สูตรคูณของ " + N + " (ผลลัพธ์ไม่เกิน 25) ---");

        int i = 1; 

        int result = 0; 

        while (result <= 25) {

            result = N * i;

            if (result > 25) {
                break; 
            }

            System.out.println(N + " x " + i + " = " + result);

            i++; 
        }
        
        scanner.close();
    }
}