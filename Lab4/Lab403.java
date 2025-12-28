import java.util.Scanner;

class Player {
    private String username;
    private int level;

    public Player() {
        this("Guest", 1);
    }

    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.printf("User: %s, Level: %d%n", username, level);
    }
}

public class Lab403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int mode = sc.nextInt();
            sc.nextLine();

            Player p = null;
            
            if (mode == 1) {
                p = new Player();
            } else if (mode == 2) {
                String name = sc.nextLine();
                int level = sc.hasNextInt() ? sc.nextInt() : 0;
                p = new Player(name, level);
            }

            if (p != null) {
                p.displayProfile();
            }
        }
        sc.close();
    }
}