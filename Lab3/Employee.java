public class Employee {

    private String employeeId; 
    private String department; 

    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
        System.out.println("Employee object created for ID: " + employeeId);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.println("Department updated to: " + newDepartment);
    }

    public static void main(String[] args) {
        String initialEmployeeId = "E1001";
        String initialDepartment = "Sales";
        String newDepartment = "Marketing";

        Employee employee = new Employee(initialEmployeeId, initialDepartment);

        employee.setDepartment(newDepartment);

        System.out.println(employee.getEmployeeId());

        System.out.println(employee.getDepartment());
    }
}