package com.ejercicio2.application.service;

import com.ejercicio2.application.input.port.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Override
    public double getDiscountedPrice(double price, double discountRate) {
        return price - price * discountRate;
    }
}
