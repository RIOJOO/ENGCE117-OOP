import java.util.Scanner;

class Subscription {
    private final String platform;
    private final int durationDays;
    
    private static int maxDuration = 365;

    public Subscription(String platform, int durationDays) {
        this.platform = platform;
        if (durationDays > maxDuration) {
            this.durationDays = maxDuration;
        } else if (durationDays < 0) {
            this.durationDays = 0;
        } else {
            this.durationDays = durationDays;
        }
    }

    public Subscription(Subscription other) {
        this.platform = other.platform;
        this.durationDays = other.durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + max);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }
        
        int newDuration = this.durationDays + days;
        
        if (newDuration > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }
        
        System.out.println("Extension successful.");
        return new Subscription(this.platform, newDuration);
    }

    public void displayInfo() {
        System.out.printf("Plan: %s, Days: %d\n", platform, durationDays);
    }
}

public class Lab413 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            Subscription.setMaxDuration(sc.nextInt());
        }

        String name = sc.next();
        int initialDays = sc.nextInt();
        Subscription sub = new Subscription(name, initialDays);

        int ext1 = sc.nextInt();
        sub = sub.extend(ext1);
        
        int ext2 = sc.nextInt();
        sub = sub.extend(ext2);

        sub.displayInfo();
        
        sc.close();
    }
}