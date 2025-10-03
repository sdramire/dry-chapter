package com.ejercicio2.application.service;

import com.ejercicio2.application.input.port.IReportGenerator;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReportGenerator implements IReportGenerator {
    @Override
    public double getTotalSales(List<Double> sales) {
        return sumDoubleList(sales);
    }

    @Override
    public double getAverageSale(List<Double> sales) {
        return averageDoubleList(sales);
    }

    @Override
    public int getTotalInventory(List<Integer> inventory) {
        return sumIntList(inventory);
    }

    @Override
    public double getAverageInventory(List<Integer> inventory) {
        return averageIntList(inventory);
    }

    private double sumDoubleList(List<Double> list) {
        return list.stream().mapToDouble(Double::doubleValue).sum();
    }

    private double averageDoubleList(List<Double> list) {
        return list.isEmpty() ? 0 : sumDoubleList(list) / list.size();
    }

    private int sumIntList(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    private double averageIntList(List<Integer> list) {
        return list.isEmpty() ? 0 : (double) sumIntList(list) / list.size();
    }
}
