public class Demo {

    static class User {
        private String username;
        private String password;
        private static int minPasswordLength = 8;

        public User(String username, String password) {
            this.username = username;
            
            if (setPassword(password)) {
                System.out.println("Creation successful.");
            } else {
                System.out.println("Creation unsuccessful.");
            }
        }

        
        public String getUsername() {
            return username;
        }

        
        public String getPassword() {
            return password;
        }

        public boolean setPassword(String newPassword) {
            if (newPassword != null && newPassword.length() >= minPasswordLength) {
                this.password = newPassword;
                return true;
            }
            return false;
        }

        public static boolean setMinLength(int length) {
            
            if (length >= 1 && length <= 10) {
                minPasswordLength = length;
                return true;
            }
            return false;
        }

        public static int getMinLength() {
            return minPasswordLength;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Execution ---");
        
        
        System.out.println("Current min length set to " + User.getMinLength());
        
        System.out.print("user1: ");
        User user1 = new User("user1", "pass1");

        System.out.print("user2: ");
        User user2 = new User("user2", "pass2019");

        
        if (User.setMinLength(6)) {
            System.out.println("Update successful.");
        } else {
            System.out.println("Update unsuccessful.");
        }
        
        if (user1.setPassword("newpass")) {
            System.out.println("Update successful.");
        } else {
            System.out.println("Update unsuccessful.");
        }
        
        
        System.out.println("user1's password: " + user1.getPassword());
        
        
        System.out.println("user2's password: " + user2.getPassword());
        
        System.out.print("user2 set short: ");
        if (user2.setPassword("short")) {
            System.out.println("Update successful.");
        } else {
            System.out.println("Update unsuccessful."); 
        }
        System.out.println("user2's password now: " + user2.getPassword()); 
    }
}