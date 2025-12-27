import java.util.Scanner;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getStatus() {
        return "Person: " + name;
    }
}

class Student extends Person {
    protected int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
    }
}

class Employee508 extends Person {
    protected double salary;

    public Employee508(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus) {
        this.salary += bonus;
    }

    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

public class Lab508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sName = sc.next();
        int sId = sc.nextInt();
        String eName = sc.next();
        double eSalary = sc.nextDouble();

        Student student = new Student(sName, sId);
        Employee508 employee = new Employee508(eName, eSalary); 

        Person[] people = new Person[2];
        people[0] = student;
        people[1] = employee;

        for (Person p : people) {
            if (p instanceof Employee508) { 
                Employee508 emp = (Employee508) p;
                emp.applyBonus(1000.0);
            }
        }

        for (Person p : people) {
            System.out.println(p.getStatus());
        }
        
        sc.close();
    }
}