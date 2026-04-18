package edu.ucaldas.creacionales.factory;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("🔔 Push enviada: " + message);
    }
}