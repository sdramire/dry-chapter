package com.ejercicio2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private double baseSalary;
    private double monthlyBonus;
    private double monthlyDeductions;
    private double annualBonus;
    private double annualDeductions;
}
