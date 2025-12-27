import java.util.Scanner;

class Employee507 {
    protected String name;
    protected double baseSalary;

    public Employee507(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee507 extends Employee507 {
    protected double commissionRate;

    public SalesEmployee507(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Manager507 extends Employee507 {
    protected double fixedBonus;

    public Manager507(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Employee507 e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

public class Lab507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine()) {
            String sName = sc.nextLine();
            double sSalary = Double.parseDouble(sc.nextLine());
            double sComm = Double.parseDouble(sc.nextLine());

            String mName = sc.nextLine();
            double mSalary = Double.parseDouble(sc.nextLine());
            double mBonus = Double.parseDouble(sc.nextLine());

            SalesEmployee507 se = new SalesEmployee507(sName, sSalary, sComm);
            Manager507 m = new Manager507(mName, mSalary, mBonus);

            PayrollProcessor.process(se);
            PayrollProcessor.process(m);
        }

        sc.close();
    }
}