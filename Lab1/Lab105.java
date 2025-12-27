package Lab1;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Menu Number (1-4): ");
        int menuNumber = scanner.nextInt();
        
        String menuName = switch (menuNumber) {
            case 1 -> "Americano";
            case 2 -> "Latte";
            case 3 -> "Espresso";
            case 4 -> "Mocha";
            default -> "Invalid Menu";
        }; 
        
        System.out.println(menuName);
        
        scanner.close();
    }
}