package org.example.Enterprise;

public class PayrollService {
    public double calculateBonus(Employee employee) {
        switch (employee.getRole()) {
            case "MANAGER": return employee.getBaseSalary() * 0.2;
            case "DEV": return employee.getBaseSalary() * 0.1;
            case "TESTER": return employee.getBaseSalary() * 0.05;
            default: throw new IllegalArgumentException("Role inconnu");
        }
    }

    public double calculateTotalSalary(Employee employee) {
        return employee.getBaseSalary() + calculateBonus(employee);
    }
}
