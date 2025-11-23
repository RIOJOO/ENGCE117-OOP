package Lab1;
import java.util.Scanner;

public class Lab106 {

    public static void printTable(int N, int i) {

        if (i > 12) {
            return;
        }

        int result = N * i;
        System.out.println(N + " x " + i + " = " + result);

        printTable(N, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number for the multiplication table: ");
        int N = scanner.nextInt();
        
        System.out.println("--- Multiplication Table for " + N + " (Recursive) ---");

        printTable(N, 1);
        
        scanner.close();
    }
}