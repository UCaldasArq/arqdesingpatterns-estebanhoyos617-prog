package edu.ucaldas.creacionales.factory;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("📱 SMS enviado: " + message);
    }
}