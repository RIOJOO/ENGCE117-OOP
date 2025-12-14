package Lab1;

import java.util.Scanner;

public class Lab108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbers : ");
        
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i< n; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        for (int i = 1; i < n; i++){
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
