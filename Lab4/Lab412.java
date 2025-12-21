import java.util.Scanner;

class Schedule {
    private int hour;

    public Schedule(int hour) { this.hour = hour; }
    public void setHour(int newHour) { this.hour = newHour; }
    public int getHour() { return hour; }
    
    public Schedule(Schedule other) { this.hour = other.hour; }
}

class EmployeeSchedule {
    private String name;
    private Schedule schedule;

    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = new Schedule(schedule.getHour());
    }

    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name;
        this.schedule = new Schedule(other.schedule.getHour());
    }

    public void displaySchedule() {
        System.out.printf("%s: %d:00\n", name, schedule.getHour());
    }
}

public class Lab412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        String name = sc.next();
        int initialHour = sc.nextInt();
        int newHour = sc.nextInt();

        Schedule sch1 = new Schedule(initialHour);
        
        EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);
        
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

        sch1.setHour(newHour);

        emp1.displaySchedule();
        emp2.displaySchedule();
        
        sc.close();
    }
}