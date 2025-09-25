package org.example.Enterprise;

public class NotificationService {

    public String sendEmail(String to, String message) {
        if (to == null || !to.contains("@")) {
            throw new IllegalArgumentException("Email invalide");
        }
        return "Email envoyé à " + to + " avec message: " + message;
    }
}
