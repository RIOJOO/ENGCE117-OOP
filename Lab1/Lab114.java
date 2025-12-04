package Lab1;

import java.util.Scanner;

public class Lab114 {
    /**
     * ตรวจสอบว่าพิกัด (r, c) อยู่ในขอบเขตของแผนที่ (map) หรือไม่
     * @param r แถว (Row)
     * @param c คอลัมน์ (Column)
     * @param R จำนวนแถวสูงสุด
     * @param C จำนวนคอลัมน์สูงสุด
     * @return true ถ้าอยู่ในขอบเขต, false ถ้าอยู่นอกขอบเขต
     */
    private static boolean isSafe(int r, int c, int R, int C) {
        // Boundary Check: r ต้องอยู่ระหว่าง 0 ถึง R-1 และ c ต้องอยู่ระหว่าง 0 ถึง C-1
        return (r >= 0 && r < R && c >= 0 && c < C);
    }

    /**
     * คำนวณจำนวนระเบิด (*) รอบพิกัดเป้าหมาย (targetR, targetC) 8 ทิศทาง
     * @param map แผนที่ Minesweeper (2D char array)
     * @param R จำนวนแถวของแผนที่
     * @param C จำนวนคอลัมน์ของแผนที่
     * @param targetR แถวเป้าหมายที่คลิก
     * @param targetC คอลัมน์เป้าหมายที่คลิก
     * @return จำนวนระเบิดรอบข้าง
     */
    public static int countSurroundingMines(char[][] map, int R, int C, int targetR, int targetC) {
        int mineCount = 0;

        // อาร์เรย์คู่สำหรับกำหนดทิศทางการตรวจสอบ 8 ทิศ (บน, ล่าง, ซ้าย, ขวา, ทแยงมุม)
        // รูปแบบ: {dRow, dCol}
        int[][] directions = {
            {-1, 0},    // บน
            {1, 0},     // ล่าง
            {0, -1},    // ซ้าย
            {0, 1},     // ขวา
            {-1, -1},   // บน-ซ้าย
            {-1, 1},    // บน-ขวา
            {1, -1},    // ล่าง-ซ้าย
            {1, 1}      // ล่าง-ขวา
        };

        // ลูปเพื่อตรวจสอบระเบิดรอบข้าง 8 ทิศทาง
        for (int[] dir : directions) {
            int newR = targetR + dir[0];
            int newC = targetC + dir[1];

            // 1. ตรวจสอบขอบเขต (Boundary Check)
            if (isSafe(newR, newC, R, C)) {
                // 2. ถ้าอยู่ในขอบเขต ให้ตรวจสอบว่าพิกัดนั้นเป็นระเบิดหรือไม่ (*)
                if (map[newR][newC] == '*') {
                    mineCount++;
                }
            }
        }

        return mineCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. รับค่า R และ C (ตามโจทย์กำหนด: 3x3)
        // แต่ในโค้ดจะยังคงรับค่าจากผู้ใช้เพื่อให้เป็นไปตามข้อกำหนด "การทำงาน"
        System.out.print("Enter R (rows): ");
        int R = scanner.nextInt();
        System.out.print("Enter C (columns): ");
        int C = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        char[][] map = new char[R][C];

        System.out.println("Enter the Map (R * C characters: '*' for mine, '.' for safe):");
        // 2. วนลูปรับข้อมูลแผนที่
        for (int r = 0; r < R; r++) {
            System.out.print("Row " + (r + 1) + ": ");
            String line = scanner.nextLine();
            if (line.length() != C) {
                System.out.println("Error: Must enter exactly " + C + " characters. Please restart.");
                scanner.close();
                return;
            }
            map[r] = line.toCharArray();
        }

        // 3. รับพิกัดเป้าหมาย (Target coordinate)
        System.out.println("Enter Target Coordinate (R C) - 1-based indexing:");
        System.out.print("R C: ");
        
        // รับค่าพิกัดในรูปแบบ 1-based index (R=1, C=1) ตาม Test Case
        int targetR_input = scanner.nextInt();
        int targetC_input = scanner.nextInt();
        
        // แปลงเป็น 0-based index สำหรับการใช้งานใน Array
        int targetR = targetR_input - 1;
        int targetC = targetC_input - 1;

        System.out.println("\n--- Output ---");
        
        // 4. ตรวจสอบกรณีที่ 1: คลิกโดนระเบิด (*)
        if (isSafe(targetR, targetC, R, C) && map[targetR][targetC] == '*') {
            System.out.println("Mine");
        } 
        // 5. ตรวจสอบกรณีที่ 2: คลิกโดนช่องว่าง (.)
        else if (isSafe(targetR, targetC, R, C) && map[targetR][targetC] == '.') {
            int mineCount = countSurroundingMines(map, R, C, targetR, targetC);
            
            // แสดงผลลัพธ์ตาม Test Case
            System.out.println(mineCount);
        } else {
            // กรณีที่พิกัดเป้าหมายอยู่นอกแผนที่ (ควรมีการตรวจสอบก่อนหน้านี้ แต่เพิ่มไว้เป็น safeguard)
             System.out.println("Invalid Target Coordinate.");
        }

        scanner.close();
    }
}