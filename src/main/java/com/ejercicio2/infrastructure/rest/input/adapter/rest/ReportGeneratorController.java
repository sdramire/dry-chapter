package com.ejercicio2.infrastructure.rest.input.adapter.rest;

import com.ejercicio2.application.input.port.IReportGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import java.util.List;

@RestController
@RequestMapping("/report")
public class ReportGeneratorController {
    @Autowired
    private IReportGenerator reportGenerator;

    @PostMapping("/sales/total")
    public Mono<Double> getTotalSales(@RequestBody List<Double> sales) {
        return Mono.just(reportGenerator.getTotalSales(sales));
    }

    @PostMapping("/sales/average")
    public Mono<Double> getAverageSale(@RequestBody List<Double> sales) {
        return Mono.just(reportGenerator.getAverageSale(sales));
    }

    @PostMapping("/inventory/total")
    public Mono<Integer> getTotalInventory(@RequestBody List<Integer> inventory) {
        return Mono.just(reportGenerator.getTotalInventory(inventory));
    }

    @PostMapping("/inventory/average")
    public Mono<Double> getAverageInventory(@RequestBody List<Integer> inventory) {
        return Mono.just(reportGenerator.getAverageInventory(inventory));
    }
}
