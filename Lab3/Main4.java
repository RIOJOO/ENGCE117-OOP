class User {
    // Attributes
    private String username;
    private String password;

    // Static Security Policy: ใช้ร่วมกันทั้งระบบ
    private static int minPasswordLength = 8; // ค่าเริ่มต้น (Initial Value)

    // 3. Constructor
    public User(String username, String password) {
        this.username = username;
        
        // ตรวจสอบรหัสผ่านเทียบกับ minPasswordLength ปัจจุบัน
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            // ตามข้อกำหนด: ถ้าไม่ผ่านเกณฑ์ ให้กำหนด password ของ Instance เป็น "Invalid"
            this.password = "Invalid"; 
            System.out.println("Creation failed.");
        }
    }

    // 1. Static Setter: setMinLength
    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid Length");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length + ".");
        }
    }

    // 2. Static Getter: getMinLength
    public static int getMinLength() {
        return minPasswordLength;
    }

    // 4. Instance Setter: setPassword
    public void setPassword(String newPassword) {
        // ตรวจสอบ newPassword เทียบกับ minPasswordLength ปัจจุบัน
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
            // รหัสผ่านไม่ผ่านเกณฑ์ ไม่เปลี่ยน password เดิม
        }
    }

    // 5. Instance Getter: getPassword
    public String getPassword() {
        return this.password;
    }
}

public class Main {
    public static void main(String[] args) {
        // ข้อมูลนำเข้าตามโจทย์หลัก (7 ตัวแปร)
        int minLength1 = 7;
        String user1_name = "user1_name";
        String user1_pass = "pass1"; // ยาว 5
        String user2_name = "user2_name";
        String user2_pass = "pass2"; // ยาว 5
        int minLength2 = 10;
        String user2_newPass = "newPass"; // ยาว 7

        // 1. เรียก User.setMinLength(minLength1)
        User.setMinLength(minLength1);

        // 2. สร้าง user1
        User user1 = new User(user1_name, user1_pass);

        // 3. สร้าง user2
        User user2 = new User(user2_name, user2_pass);

        // 4. เรียก User.setMinLength(minLength2)
        User.setMinLength(minLength2);

        // 5. เรียก user2.setPassword(user2_newPass)
        user2.setPassword(user2_newPass);

        // สุดท้ายให้แสดงผลลัพธ์
        System.out.println("\n--- Final Output (รหัสผ่าน) ---");
        System.out.println(user1.getPassword()); // บรรทัดแรก
        System.out.println(user2.getPassword()); // บรรทัดที่สอง
    }
}