package com.ejercicio2.application.input.port;

import com.ejercicio2.domain.Employee;

public interface IEmployeePayrollService {
    double processPayroll(Employee employee, String type);
}

