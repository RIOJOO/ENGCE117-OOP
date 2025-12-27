public class DatabaseConnection {

    private String connectionString;
    private boolean connected;

    public DatabaseConnection(String connectionString) {

        this.connectionString = connectionString;
        
        this.connected = true;
        System.out.println("DatabaseConnection object created and initialized.");
    }

    public boolean isConnected() {
        return connected;
    }

    public void connect() {
        if (connected == false) {
            
            this.connected = true;
            
            System.out.println("Connected to [" + connectionString + "]");
        } else {
            
            System.out.println("Already connected.");
        }
    }

    
    public void disconnect() {
        if (connected == true) {
            
            this.connected = false;
            
            System.out.println("Disconnected.");
        } else {
            
            System.out.println("Already disconnected.");
        }
    }

    
    public static void main(String[] args) {
        
        String connectionString = "jdbc:mysql://localhost:3306/mydb"; 

        DatabaseConnection db = new DatabaseConnection(connectionString);

        System.out.println("--- Start Test ---");

        db.connect(); 

        db.disconnect(); 

        db.disconnect(); 

        db.connect(); 

        System.out.println("Is connected? " + db.isConnected()); 

        System.out.println("--- End Test ---");
    }
}