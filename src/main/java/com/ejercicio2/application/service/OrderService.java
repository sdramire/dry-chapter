package com.ejercicio2.application.service;

import com.ejercicio2.application.input.port.IOrderService;
import com.ejercicio2.infrastructure.rest.util.ValidationUtils;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    @Override
    public String processOrder(double total, String type) {
        if (ValidationUtils.isNegative(total)) {
            return "Total cannot be negative";
        } else if (ValidationUtils.isZero(total)) {
            return "Order total is zero";
        } else {
            return "Processing " + type + " order: " + total;
        }
    }
}
