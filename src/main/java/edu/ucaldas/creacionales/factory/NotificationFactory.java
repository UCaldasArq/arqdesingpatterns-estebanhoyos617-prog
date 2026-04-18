package edu.ucaldas.creacionales.factory;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailNotification();
            case "SMS"   -> new SMSNotification();
            case "PUSH"  -> new PushNotification();
            default -> throw new IllegalArgumentException(
                "Tipo de notificación no soportado: " + type
            );
        };
    }
}
