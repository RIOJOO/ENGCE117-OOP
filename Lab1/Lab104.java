package Lab1;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        String[] grades = {"F", "F", "F", "F", "F", "D", "C", "B", "A", "A", "A"};

        int index = score / 10;
        
        System.out.println(grades[index]);
        
        sc.close();
    }
}