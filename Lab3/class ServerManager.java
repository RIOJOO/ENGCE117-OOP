class ServerManager {

    private static int MAX_SERVERS = 5;
    private static int usedServers = 0;

    public static void init(int max) {
        MAX_SERVERS = max;
        usedServers = 0;
        System.out.println("Max servers set to: " + MAX_SERVERS);
    }

    public static boolean checkout() {
        if (usedServers < MAX_SERVERS) {
            usedServers++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No servers available.");
            return false;
        }
    }

    public static void checkin() {
        if (usedServers > 0) {
            usedServers--;
            System.out.println("Checkin successful.");
        } else {
            System.out.println("Checkin failed: All servers are already available.");
        }
    }

    public static void displayStatus() {
        int available = MAX_SERVERS - usedServers;
        System.out.println("Used: " + usedServers);
        System.out.println("Available: " + available);
    }
}

class Main {
    public static void main(String[] args) {

        ServerManager.init(5);
        ServerManager.checkout();
        ServerManager.checkout();
        ServerManager.checkin();
        ServerManager.displayStatus();

        ServerManager.init(2);
        ServerManager.checkout();
        ServerManager.checkout();
        ServerManager.checkout();
        ServerManager.checkin();
        ServerManager.checkout();
        ServerManager.displayStatus();
        
        ServerManager.init(3);
        ServerManager.checkout();
        ServerManager.checkout();
        ServerManager.checkout();
        ServerManager.checkout();
        ServerManager.checkin();
        ServerManager.displayStatus();
    }
}