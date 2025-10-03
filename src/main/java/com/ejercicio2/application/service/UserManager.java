package com.ejercicio2.application.service;

import com.ejercicio2.application.input.port.IUserManager;
import com.ejercicio2.infrastructure.rest.util.ValidationUtils;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements IUserManager {
    @Override
    public String manageUser(String name, String email, String action) {
        if (ValidationUtils.isNullOrEmpty(name)) {
            return "Invalid name";
        }
        if (ValidationUtils.isNullOrEmpty(email)) {
            return "Invalid email";
        }
        return switch (action) {
            case "add" -> "User added: " + name + " - " + email;
            case "update" -> "User updated: " + name + " - " + email;
            default -> "Unknown action";
        };
    }
}
