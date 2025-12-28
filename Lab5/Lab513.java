import java.util.Scanner;

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class Lab513 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        
        int proj1 = Integer.parseInt(sc.nextLine());
        
        String name2 = sc.nextLine();
        
        int proj2 = Integer.parseInt(sc.nextLine());
        
        String key = sc.nextLine();

        User[] users = new User[3];
        users[0] = new User(name1);
        users[1] = new Developer(name2, proj1);
        users[2] = new Admin(name2, proj2, key);

        int totalClearance = 0;

        for (User u : users) {
            if (u instanceof Admin) {
                Admin adm = (Admin) u;
                System.out.println(adm.getAdminKey());
            }
            totalClearance += u.getClearanceLevel();
        }

        System.out.println(totalClearance);
        
        sc.close();
    }
}