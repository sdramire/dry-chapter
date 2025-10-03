package com.ejercicio2.infrastructure.rest.input.adapter.rest;

import com.ejercicio2.application.input.port.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @PostMapping("/online")
    public Mono<String> processOnlineOrder(@RequestParam double total) {
        return Mono.just(orderService.processOrder(total, "online"));
    }

    @PostMapping("/instore")
    public Mono<String> processInStoreOrder(@RequestParam double total) {
        return Mono.just(orderService.processOrder(total, "instore"));
    }
}
