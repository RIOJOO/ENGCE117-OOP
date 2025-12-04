package Lab1;

import java.util.Scanner;

public class Lab111 {
    public static ArraySum {
        int sum = 0;
        // ลูปผ่านแต่ละตัวเลขของอาเรย์และบวกเข้ากับ sum
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ( " หาผลรวมของตัวเลขในอาเรย์ " );
        // รับค่าขนาดอาเรย์จากผู้ใช้
        System.out.println ( " ป้อนจำนวนตัวเลขในอาเรย์: " );
        if (!scanner.hasNextInt()) {
             System.out.println( " Input ไม่ถูก : ป้อนจำนวนเต็มขนาดอาเรย์ใหม่. " );
             scanner.close();
             return;
        }
        int n = scanner.nextInt();

        if ( n <= 0 ) {
            System.out.println ( " ขนาดอาเรย์ต้องเป็นจำนวนเต็มบวก. " );
            scanner.close();
            return;
        }
        // สร้างอาเรย์ขนาด n
        int[] numbers = new int[n];
        // รับค่าตัวเลข n ... ตัวจากผู้ใช้
        System.out.println ( " ----------------------- " )
        System.out.println ( " ป้อนตัวเลข " );

    }
}
