import java.util.Scanner;

class Employee {
    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return super.calculateBonus() + (salary * 0.05);
    }
}

public class Lab503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager myManager = new Manager();

        double inputSalary = sc.nextDouble();

        myManager.salary = inputSalary;

        double totalBonus = myManager.calculateBonus();
        System.out.println(totalBonus);

        sc.close();
    }
}