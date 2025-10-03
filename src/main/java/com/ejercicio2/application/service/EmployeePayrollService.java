package com.ejercicio2.application.service;

import com.ejercicio2.domain.Employee;
import com.ejercicio2.application.input.port.IEmployeePayrollService;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
    @Override
    public double processPayroll(Employee employee, String type) {
        return switch (type) {
            case "monthly" -> employee.getBaseSalary() + employee.getMonthlyBonus() - employee.getMonthlyDeductions();
            case "annual" -> employee.getBaseSalary() * 12 + employee.getAnnualBonus() - employee.getAnnualDeductions();
            default -> throw new IllegalArgumentException("Unknown payroll type: " + type);
        };
    }
}
