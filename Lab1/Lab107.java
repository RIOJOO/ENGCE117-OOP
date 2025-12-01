package Lab1;

import java.util.Scanner;

public class Lab107 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N;
        int m; //
        
        do {
            System.out.print("Enter the number of integers (N, N >= 1): ");

            if (scanner.hasNextInt()) {
                N = scanner.nextInt();

                if (N >= 1) {
                    break;
                } else {
                    System.out.println("Error: N must be greater than or equal to 1.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next();
            }
        } while (true);
        
        long sum = 0;

        System.out.println("------------------------------------");
        System.out.println("Enter " + N + " integers:");
        
        for (int i = 0; i < N; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Invalid input. Please enter an integer.");
                System.out.print("Enter integer #" + (i + 1) + ": ");
                scanner.next();
            }
            
            int num = scanner.nextInt();
            
            sum += num;
        }

        System.out.println("\n--- Result ---");
        System.out.println("The **Sum** of the " + N + " integers is: **" + sum + "**");
        
        scanner.close();
    }
}

