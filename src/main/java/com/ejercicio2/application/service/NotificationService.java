package com.ejercicio2.application.service;

import com.ejercicio2.application.input.port.INotificationService;
import com.ejercicio2.infrastructure.rest.util.ValidationUtils;
import org.springframework.stereotype.Service;

@Service
public class NotificationService implements INotificationService {
    @Override
    public String sendNotification(String recipient, String message, String type) {
        if (ValidationUtils.isNullOrEmpty(recipient)) {
            return switch (type) {
                case "email" -> "Invalid email address";
                case "sms" -> "Invalid phone number";
                case "push" -> "Invalid device token";
                default -> "Invalid recipient";
            };
        }
        return switch (type) {
            case "email" -> "Email sent to: " + recipient + ", Subject: " + message;
            case "sms" -> "SMS sent to: " + recipient;
            case "push" -> "Push notification sent to: " + recipient;
            default -> "Notification sent to: " + recipient;
        };
    }
}
