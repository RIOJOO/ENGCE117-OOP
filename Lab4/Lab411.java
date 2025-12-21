import java.util.Scanner;

class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;
        this.fontSize = Math.min(Math.max(fontSize, 10), 20);
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = (user.theme == null || user.theme.isEmpty()) ? base.theme : user.theme;
        this.fontSize = user.fontSize; 
        this.darkMode = user.darkMode;
    }

    public void displaySettings() {
        System.out.printf("Theme: %s, Size: %d, Dark: %b\n", theme, fontSize, darkMode);
    }
}

public class Lab411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Configuration baseConfig = new Configuration(sc.next(), sc.nextInt(), sc.nextBoolean());
        
        Configuration userConfig = new Configuration(sc.next(), sc.nextInt(), sc.nextBoolean());

        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();
        sc.close();
    }
}