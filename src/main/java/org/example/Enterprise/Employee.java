package org.example.Enterprise;

public class Employee {

    private String id;
    private String name;
    private double baseSalary;
    private String role; // "DEV", "MANAGER", "TESTER"

    public Employee(String id, String name, double baseSalary, String role) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.role = role;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public String getRole() { return role; }
}
