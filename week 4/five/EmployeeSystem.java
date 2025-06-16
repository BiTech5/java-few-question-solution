/*
 5. Employee Management System

Instructions:

    Base class Employee with private fields name, id, and method calculateSalary().
    Subclasses:
        Manager with bonus
        Developer with overtimeHours
    Use encapsulation for fields and override calculateSalary():
        For Manager, salary = base + bonus
        For Developer, salary = base + overtimeHours * rate
    File: EmployeeSystem.java.

 */

class Employee {
    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;
    private double  baseSalary;
    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
        this.baseSalary=baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    private int overtimeHours;
    private double rate;
    private double  baseSalary;
    public Developer(String name, int id, double baseSalary, int overtimeHours, double rate) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
        this.rate = rate;
        this.baseSalary=baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary+ (overtimeHours * rate);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Bikiii", 1, 8772, 1000);
        Developer developer = new Developer("Ramm",2, 888, 20, 50);

        System.out.println("Manager Salary: " + manager.calculateSalary());
        System.out.println("Developer Salary: " + developer.calculateSalary());
    }
}
