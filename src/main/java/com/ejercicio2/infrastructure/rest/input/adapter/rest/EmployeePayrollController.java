package com.ejercicio2.infrastructure.rest.input.adapter.rest;

import com.ejercicio2.application.input.port.IEmployeePayrollService;
import com.ejercicio2.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/payroll")
public class EmployeePayrollController {
    @Autowired
    private IEmployeePayrollService payrollService;

    @PostMapping("/monthly")
    public Mono<Double> processMonthlyPayroll(@RequestBody Employee employee) {
        return Mono.just(payrollService.processPayroll(employee, "monthly"));
    }

    @PostMapping("/annual")
    public Mono<Double> processAnnualPayroll(@RequestBody Employee employee) {
        return Mono.just(payrollService.processPayroll(employee, "annual"));
    }
}
