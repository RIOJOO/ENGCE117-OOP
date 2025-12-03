package Lab1;

import java.util.Scanner;

public class Lab110 {

    public static double calculateArea(double width, double height) {
        return width * height; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width (double): ");
        if (!scanner.hasNextDouble()) {
             System.out.println("Invalid input for width. Please enter a number.");
             scanner.close();
             return;
        }
        double width = scanner.nextDouble();
        
        System.out.print("Enter the height (double): ");
        if (!scanner.hasNextDouble()) {
             System.out.println("Invalid input for height. Please enter a number.");
             scanner.close();
             return;
        }
        double height = scanner.nextDouble();
        
        double areaResult = calculateArea(width, height);
        
        System.out.println("--- Area Calculation Result ---");
        System.out.printf("Width: %.2f, Height: %.2f%n", width, height);
        System.out.printf("The calculated Area is: %.2f%n", areaResult);
        
        scanner.close();
    }
}