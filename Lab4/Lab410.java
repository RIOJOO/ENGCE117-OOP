import java.util.Scanner;

class TimePeriod {
    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour) {
        int validatedStart = normalizeHour(startHour);
        int validatedEnd = normalizeHour(endHour);

        if (validatedStart <= validatedEnd) {
            this.startHour = validatedStart;
            this.endHour = validatedEnd;
        } else {
            this.startHour = 9;
            this.endHour = 17;
        }
    }

    private int normalizeHour(int hour) {
        if (hour < 0) return 0;
        if (hour > 23) return 23;
        return hour;
    }

    public void displayPeriod() {
        System.out.printf("%d:00 %d:00\n", this.startHour, this.endHour);
    }
}

public class Lab410 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int mode = scanner.nextInt();

        if (mode == 1) {
            new TimePeriod().displayPeriod();
        } else if (mode == 2) {
            int s = scanner.hasNextInt() ? scanner.nextInt() : 0;
            int e = scanner.hasNextInt() ? scanner.nextInt() : 0;
            new TimePeriod(s, e).displayPeriod();
        }
        scanner.close();
    }
}