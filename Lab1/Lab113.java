package Lab1;

import java.util.Scanner;

public class Lab113 {
    // รับค่า จำนวนเต็ม R (จำนวนแถว) และ C (จำนวนคอลัมน์) จากกริดเซิร์ฟเวอร์
    // จากนั้นให้วนลูปรับค่าสถานะ (0 หรือ 1) สำหรับแต่ละเซลล์ในกริดขนาด R x C เพื่อเติมลงใน Array 2 มิติ (โดยรับทีละแถวจนครบ)
    // เมื่อรับค่าครบแล้วให้โปรแกรมประมวล Array 2 มิติเพื่อ " นับ " (Count)  ว่ามีเซิร์ฟเวอร์ที่ออนไลน์ (มีค่าเป็น 1) ทั้งหมดกี่ตัว
    // แสดงผลเป็น " จำนวน " เซิร์ฟเวอร์ที่ออนไลน์ทั้งหมด
    private static Scanner scanner = new Scanner(System.in);
        // รับค่า R และ C
    public static int[] readGridSize() {
        System.out.print("Enter number of rows (R): ");
        int R = scanner.nextInt();
        System.out.print("Enter number of columns (C): ");
        int C = scanner.nextInt();
        return new int[]{ R , C };
    }
 //  เมธอดสำหรับรับค่า Grid และนับเซิร์ฟเวอร์ออนไลน์ (ตรรกะหลัก)
    public static int readAndCountGrid(int R, int C) {
        int[][] grid = new int[R][C];
        int onlineCount = 0;

        System.out.println("Enter the grid values (0 or 1):");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = scanner.nextInt();
                
                // นับเซิร์ฟเวอร์ที่ออนไลน์
                if (grid[i][j] == 1) {
                    onlineCount++;
                }
            }
        }
        return onlineCount;
    }

    public static void main(String[] args) {
        
        // รับขนาด Array
        int[] size = readGridSize();
        int R = size[0];
        int C = size[1];
        
        //  รับค่า Grid และนับ
        int onlineCount = readAndCountGrid(R, C);
        
        //  แสดงผลลัพธ์
        System.out.println("----------------------------------  ");
        System.out.println("Total number of online servers: " + onlineCount);

        scanner.close();
    }
}
