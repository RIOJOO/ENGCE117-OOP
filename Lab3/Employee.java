import java.util.Scanner;

class Employee {

    private String employeeId;
    private String department;

    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    
    public String getDepartment() {
        return department;
    }

    
    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employeeIdInput = scanner.nextLine();

        String oldDepartmentInput = scanner.nextLine();
        
        String newDepartmentInput = scanner.nextLine();

        Employee employee = new Employee(employeeIdInput, oldDepartmentInput);

        employee.setDepartment(newDepartmentInput);

        System.out.println(employee.getEmployeeId());
        
        System.out.println(employee.getDepartment());

        scanner.close();
    }
}