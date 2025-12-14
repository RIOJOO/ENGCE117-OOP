public class SystemConfig {

    private static SystemConfig instance;

    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        this.serverUrl = "default server url";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    public void showConfig() {
        System.out.println("URL: " + getServerUrl());
        System.out.println("MAX: " + getMaxConnections());
    }

    public static void main(String[] args) {
        System.out.println("--- Scenario 1: Default values and simple access ---");
        SystemConfig config1 = SystemConfig.getInstance();
        config1.showConfig(); 

        System.out.println("\n--- Scenario 2: Modifying configuration ---");
        config1.setServerUrl("api.myservice.com");
        config1.setMaxConnections(5);
        config1.showConfig(); 

        System.out.println("\n--- Scenario 3: Checking the Singleton property ---");
        SystemConfig config2 = SystemConfig.getInstance();
        
        config2.showConfig(); 
        
        System.out.println("\nIs config1 the same object as config2? " + (config1 == config2)); 
    }
}