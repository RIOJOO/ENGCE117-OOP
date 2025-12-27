import java.util.Arrays;
import java.util.Scanner;

class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 5;

    public AuditRecord(String user) {
        this.user = user;
        this.logMessages = new String[0];
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;
        this.logMessages = Arrays.copyOf(logs, logs.length);
    }

    public static void setMaxMessages(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        } else {
            System.out.println("Invalid policy");
        }
    }

    public AuditRecord addMessage(String message) {
        if (logMessages.length < maxMessages) {
            String[] newLogs = new String[logMessages.length + 1];
            System.arraycopy(logMessages, 0, newLogs, 0, logMessages.length);
            newLogs[newLogs.length - 1] = message;
            
            System.out.println(message + " added.");
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    public void displaying() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i] + (i == logMessages.length - 1 ? "" : ", "));
        }
        System.out.println("]");
    }
}

public class Lab415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            AuditRecord.setMaxMessages(sc.nextInt());
        }
        sc.nextLine();

        String name = sc.nextLine();
        AuditRecord record = new AuditRecord(name);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                String input = sc.nextLine();
                
                if (input.equals("SET_POLICY")) {
                    if (sc.hasNextInt()) {
                        AuditRecord.setMaxMessages(sc.nextInt());
                        if (sc.hasNextLine()) sc.nextLine();
                    }
                } else {
                    record = record.addMessage(input);
                }
            }
        }

        // 5. แสดงผลลัพธ์สุดท้าย
        record.displaying();
        sc.close();
    }
}