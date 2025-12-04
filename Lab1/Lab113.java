package Lab1;

import java.util.Scanner;

public class Lab113 {
    // รับค่า จำนวนเต็ม R (จำนวนแถว) และ C (จำนวนคอลัมน์) จากกริดเซิร์ฟเวอร์
    // จากนั้นให้วนลูปรับค่าสถานะ (0 หรือ 1) สำหรับแต่ละเซลล์ในกริดขนาด R x C เพื่อเติมลงใน Array 2 มิติ (โดยรับทีละแถวจนครบ)
    // เมื่อรับค่าครบแล้วให้โปรแกรมประมวล Array 2 มิติเพื่อ " นับ " (Count)  ว่ามีเซิร์ฟเวอร์ที่ออนไลน์ (มีค่าเป็น 1) ทั้งหมดกี่ตัว
    // แสดงผลเป็น " จำนวน " เซิร์ฟเวอร์ที่ออนไลน์ทั้งหมด
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่า R และ C
        System.out.print("Enter number of rows (R): ");
        int R = scanner.nextInt();
        System.out.print("Enter number of columns (C): ");
        int C = scanner.nextInt();
    
        int[][] grid = new int[R][C];
        int onlineCount = 0; // ตัวนับเซิร์ฟเวอร์ที่ออนไลน์

        // วนลูปรับค่าสถานะสำหรับแต่ละเซลล์ในกริด และ นับเซิร์ฟเวอร์ที่ออนไลน์พร้อมกัน
        System.out.println("Enter the grid values (0 or 1):");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                // รับค่าสถานะ [i][j]
                grid[i][j] = scanner.nextInt();
                
                // ตรวจสอบและนับเซิร์ฟเวอร์ที่ออนไลน์
                if (grid[i][j] == 1) {
                    onlineCount++;
                }
            }
        }
        // แสดงผลจำนวนเซิร์ฟเวอร์ที่ออนไลน์
        System.out.println("----------------------------------  ");
        System.out.println("total number of online servers: " + onlineCount);

        scanner.close();
        }    
}
