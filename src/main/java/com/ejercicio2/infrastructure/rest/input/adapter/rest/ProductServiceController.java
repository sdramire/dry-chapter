package com.ejercicio2.infrastructure.rest.input.adapter.rest;

import com.ejercicio2.application.input.port.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class ProductServiceController {
    @Autowired
    private IProductService productService;

    @GetMapping("/discount")
    public Mono<Double> getDiscountedPrice(@RequestParam double price, @RequestParam double discountRate) {
        return Mono.just(productService.getDiscountedPrice(price, discountRate));
    }
}
