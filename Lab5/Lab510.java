import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String description, int baseHours) {
        this.description = description;
        this.baseHours = baseHours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String description, int baseHours, double setupFee) {
        super(description, baseHours);
        this.setupFee = setupFee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjectTask {
    public SimpleTask(String description, int baseHours) {
        super(description, baseHours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class Lab510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cDesc = sc.nextLine();
        int cHours = sc.nextInt();
        double cFee = sc.nextDouble();
        sc.nextLine();

        String sDesc = sc.nextLine();
        int sHours = sc.nextInt();

        ProjectTask[] tasks = new ProjectTask[2];
        tasks[0] = new ComplexTask(cDesc, cHours, cFee);
        tasks[1] = new SimpleTask(sDesc, sHours);

        for (ProjectTask task : tasks) {
            System.out.println(task.calculateCost());
        }
        
        sc.close();
    }
}