public class SystemLogger {
    
    private static final int INFO = 1;
    private static final int DEBUG = 2;
    private static final int ERROR = 3;
    private static final String UNKNOWN = "UNKNOWN";

    private static int currentLogLevel = INFO; 

    private static String getLevelName(int level) {
        if (level == INFO) {
            return "INFO";
        } else if (level == DEBUG) {
            return "DEBUG";
        } else if (level == ERROR) {
            return "ERROR";
        } else {
            return UNKNOWN;
        }
    }

    public static String getCurrentLevel() {
        return getLevelName(currentLogLevel);
    }

    public static void setLogLevel(int newLevel) {
        
        if (newLevel == INFO || newLevel == DEBUG || newLevel == ERROR) {
            String oldLevelName = getCurrentLevel();
            currentLogLevel = newLevel;
            System.out.println("[System Name] Log level set to [" + getLevelName(newLevel) + "]");
        } else {
            
            System.err.println("Invalid log level set attempt: " + newLevel);
        }
    }

    
    public static void logInfo(String logName, String message) {
        
        if (currentLogLevel >= DEBUG) {
            System.out.println("[" + getLevelName(currentLogLevel) + "] [" + logName + "] (" 
                               + getLevelName(currentLogLevel) + ") " + message);
        } else {
            
            System.out.println("Current Log level is [" + getCurrentLevel() + "]");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Start Test Case 1 ---");
        
        
        SystemLogger.setLogLevel(DEBUG); 
        SystemLogger.setLogLevel(1);
        SystemLogger.setLogLevel(2);
        SystemLogger.logInfo("LOG", "User login attempt"); 
        SystemLogger.logInfo("LOG", "Database query executing");
        SystemLogger.logInfo("LOG", "Critical error occurred");
        SystemLogger.setLogLevel(5);
        SystemLogger.setLogLevel(0);
        
        System.out.println("--- End Test Case 1 ---");
    }
}