package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab114 {
    private static boolean isSafe(int r, int c, int R, int C) {
        return (r >= 0 && r < R && c >= 0 && c < C);
    }

    public static int countSurroundingMines(char[][] map, int R, int C, int targetR, int targetC) {
        int mineCount = 0;
        int[][] directions = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
        };

        for (int[] dir : directions) {
            int newR = targetR + dir[0];
            int newC = targetC + dir[1];

            if (isSafe(newR, newC, R, C)) {
                if (map[newR][newC] == '*') {
                    mineCount++;
                }
            }
        }
        return mineCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่า R และ C
        int R, C;
        try {
            System.out.print("Enter R (rows): ");
            R = scanner.nextInt();
            System.out.print("Enter C (columns): ");
            C = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid Input: Please enter integers for R and C.");
            scanner.close();
            return;
        }
        scanner.nextLine(); 

        if (R <= 0 || C <= 0) {
            System.out.println("❌ R and C must be positive integers.");
            scanner.close();
            return;
        }

        char[][] map = new char[R][C];

        System.out.println("\nEnter the Map (R * C characters: '*' for mine, '.' for safe):");
        //  รับข้อมูลแผนที่
        for (int r = 0; r < R; r++) {
            System.out.print("Row " + (r + 1) + " (" + C + " chars): ");
            String line = scanner.nextLine();
            if (line.length() != C) {
                System.out.println("❌ Error: Must enter exactly " + C + " characters. Please restart.");
                scanner.close();
                return;
            }
            map[r] = line.toCharArray();
        }

        //  รับพิกัดเป้าหมาย 
        int targetR_input, targetC_input;
        try {
            System.out.println("\nEnter Target Coordinate (R C) - Use 1-based indexing (e.g., 1 1 for first cell):");
            System.out.print("R C: ");
            targetR_input = scanner.nextInt();
            targetC_input = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("❌ Invalid Input: Please enter integers for Target R and C.");
            scanner.close();
            return;
        }
        
        // แปลงเป็น 0-based index สำหรับการใช้งานใน Array
        int targetR_0based = targetR_input - 1;
        int targetC_0based = targetC_input - 1;

        System.out.println("\n--- Output ---");
        
        //  ตรวจสอบพิกัดที่ป้อนเข้ามา
        if (!isSafe(targetR_0based, targetC_0based, R, C)) {
            System.out.println("Invalid Target Coordinate. (Out of bounds for " + R + "x" + C + " map)");
        }
        //  กรณีที่ 1: คลิกโดนระเบิด (*)
        else if (map[targetR_0based][targetC_0based] == '*') {
            System.out.println("Mine");
        }
        //  กรณีที่ 2: คลิกโดนช่องว่าง (.)
        else if (map[targetR_0based][targetC_0based] == '.') {
            int mineCount = countSurroundingMines(map, R, C, targetR_0based, targetC_0based);
            System.out.println(mineCount);
        }
        
        scanner.close();
    }
}