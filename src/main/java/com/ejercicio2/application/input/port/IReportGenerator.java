package com.ejercicio2.application.input.port;

import java.util.List;

public interface IReportGenerator {
    double getTotalSales(List<Double> sales);
    double getAverageSale(List<Double> sales);
    int getTotalInventory(List<Integer> inventory);
    double getAverageInventory(List<Integer> inventory);
}

