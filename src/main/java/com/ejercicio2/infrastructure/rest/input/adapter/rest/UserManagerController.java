package com.ejercicio2.infrastructure.rest.input.adapter.rest;

import com.ejercicio2.application.input.port.IUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserManagerController {
    @Autowired
    private IUserManager userManager;

    @PostMapping("/add")
    public Mono<String> addUser(@RequestParam String name, @RequestParam String email) {
        return Mono.just(userManager.manageUser(name, email, "add"));
    }

    @PostMapping("/update")
    public Mono<String> updateUser(@RequestParam String name, @RequestParam String email) {
        return Mono.just(userManager.manageUser(name, email, "update"));
    }
}
