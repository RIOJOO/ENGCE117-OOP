class LoginManager {
    private String username;
    private int failedAttempts = 0;
    private boolean isLocked = false;
    private final String CORRECT_PASSWORD = "1234"; 

    private static int maxFailedAttempts = 3;

    public LoginManager(String username) {
        this.username = username;
        System.out.println("Account for " + username + " created.");
    }

    public String getUsername() {
        return username;
    }

    public boolean isAccountLocked() {
        return isLocked;
    }

    public static void setMaxFailedAttempts(int max) {
        maxFailedAttempts = max;
        System.out.println("Login policy updated. Max attempts set to: " + max);
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public String login(String password) {
        if (isLocked) {
            return "Login failed: Account is locked.";
        }

        if (password.equals(CORRECT_PASSWORD)) {
            failedAttempts = 0;
            isLocked = false;
            return "Login successful.";
        } else {
            failedAttempts++;

            if (failedAttempts >= maxFailedAttempts) {
                isLocked = true;
                return "Login failed: Account locked.";
            } else {
                int attemptsLeft = maxFailedAttempts - failedAttempts;
                return "Login failed: " + attemptsLeft + " attempts left.";
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        
        LoginManager.setMaxFailedAttempts(3);
        
        LoginManager user1 = new LoginManager("Admin");
        
        System.out.println(user1.login("pass1"));
        
        System.out.println(user1.login("pass2"));
        
        System.out.println(user1.login("1234"));
        

        LoginManager user2 = new LoginManager("Guest");
        
        System.out.println(user2.login("000"));
        
        System.out.println(user2.login("000"));
        
        System.out.println(user2.login("000"));
        
        System.out.println(user2.login("1234"));

        LoginManager.setMaxFailedAttempts(2);
        LoginManager user3 = new LoginManager("Service");
        
        System.out.println(user3.login("wrong"));
        
        System.out.println(user3.login("wrong"));
        
    }
}