class Employee {
    private String name;
    private double weeklySalary;

    public Employee(String name, double weeklySalary) {
        this.name = name;
        this.weeklySalary = weeklySalary;
    }

    public String getName() {
        return name;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void giveRaise(double amount) {
        this.weeklySalary += amount;
    }

    public double getBonus() {
        return 0.0;
    }

    public double calculateTax(double taxRate) {
        return weeklySalary * taxRate;
    }
}

class Main {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Teerak", 40000.0);
        
        
        emp1.giveRaise(2000.0);
        
        
        double taxAmount1 = emp1.calculateTax(0.10);

        System.out.println("Name: " + emp1.getName()); 
        System.out.println("New Salary: " + emp1.getWeeklySalary()); 
        
        System.out.println("Tax Amount: " + taxAmount1); 

        Employee emp2 = new Employee("Wachira", 5000.0);
        
        double taxAmount2 = emp2.calculateTax(0.10);

        System.out.println("Name: " + emp2.getName()); 
        System.out.println("Salary: " + emp2.getWeeklySalary()); 
        System.out.println("Tax Amount: " + taxAmount2); 
    }
}