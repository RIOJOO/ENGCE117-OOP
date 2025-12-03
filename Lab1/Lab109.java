package Lab1;

import java.util.Scanner;

public class Lab109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N <= 0 ) {
            System.out.println("Error: N must be a positive integer.");
            scanner.close();
            return ;
        }

        long sum = scanner.nextLong();
        for (int i = 1; i < N; i++) {
            sum += scanner.nextLong();
        }
        double average = (double) sum / N;

        System.out.println(average);

        scanner.close();
    }
    
}
