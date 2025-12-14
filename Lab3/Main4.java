
public class Main4 {

    static class User {
        private String username;
        private String password;

        private static int minPasswordLength = 8;
        public static void setMinLength(int length) {
            
            if (length < 4) {
                System.out.println("Invalid length.");
            }
            
            else {
                minPasswordLength = length;
                System.out.println("New min length set to " + length);
            }
        }

        
        public static int getMinLength() {
            
            return minPasswordLength;
        }
        
        public User(String username, String password) {
            this.username = username;

            if (password.length() >= minPasswordLength) {
                this.password = password;
                System.out.println("Creation successful.");
            } else {
                this.password = "Invalid"; 
                System.out.println("Creation failed.");
            }
        }

        public void setPassword(String newPassword) {
            if (newPassword.length() >= minPasswordLength) {
                this.password = newPassword;
                System.out.println("Update successful.");
            } else {
                // ถ้าไม่ผ่านเกณฑ์
                System.out.println("Update failed.");
            }
        }

        
        public String getPassword() {
            return password;
        }
    }

    public static void main(String[] args) {

        int minLength1 = 10;
        String user1_name = "user1";
        String user1_pass = "pass1234567890";
        String user2_name = "user2";
        String user2_pass = "pass123";
        int minLength2 = 5;
        String user2_newPass = "pass567";

        System.out.println("--- Start Test Case 1 Simulation ---");
        
        System.out.println("1. Set Min Length (10):");
        User.setMinLength(minLength1);
        
        
        System.out.println("2. Create user1 (Pass: 14 chars):");
        User user1 = new User(user1_name, user1_pass);
        
        
        System.out.println("3. Create user2 (Pass: 7 chars < 10):");
        User user2 = new User(user2_name, user2_pass);

        System.out.println("4. Set Min Length (5):");
        User.setMinLength(minLength2);
        
        System.out.println("5. user2 set new password (Pass: 7 chars >= 5):");
        user2.setPassword(user2_newPass); 
        
        System.out.println("--- Final Output ---");
        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());
    }
}