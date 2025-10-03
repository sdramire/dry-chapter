package com.ejercicio2.application.input.port;

public interface INotificationService {
    String sendNotification(String recipient, String message, String type);
}

