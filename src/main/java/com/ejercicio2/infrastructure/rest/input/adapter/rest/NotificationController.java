package com.ejercicio2.infrastructure.rest.input.adapter.rest;

import com.ejercicio2.application.input.port.INotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private INotificationService notificationService;

    @PostMapping("/email")
    public Mono<String> sendEmail(@RequestParam String to, @RequestParam String subject) {
        return Mono.just(notificationService.sendNotification(to, subject, "email"));
    }

    @PostMapping("/sms")
    public Mono<String> sendSms(@RequestParam String phone, @RequestParam String message) {
        return Mono.just(notificationService.sendNotification(phone, message, "sms"));
    }

    @PostMapping("/push")
    public Mono<String> sendPush(@RequestParam String deviceToken, @RequestParam String message) {
        return Mono.just(notificationService.sendNotification(deviceToken, message, "push"));
    }
}
