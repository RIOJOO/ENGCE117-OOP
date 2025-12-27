import java.util.Scanner;

public class Main {

    static class User {
        private String password;

        public User(String initialPassword) {
            this.password = initialPassword;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String newPassword) {
            if (newPassword.length() >= 8) {
                this.password = newPassword; 
                System.out.println("Password updated.");
            } else {
                System.out.println("Password is too short.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String initialPassword = scanner.nextLine(); 
        
        String newPasswordAttempt = scanner.nextLine(); 
        
        User user = new User(initialPassword); 
        user.setPassword(newPasswordAttempt);
        
        System.out.println(user.getPassword());
        
        scanner.close();
    }
}