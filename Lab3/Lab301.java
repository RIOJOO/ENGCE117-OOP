public class User { 

    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        String userName = " Somchai ";

        User userobject = new User(userName.trim()); 
        
        System.out.println("User name is: " + userobject.getUsername());
    }
}