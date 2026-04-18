package edu.ucaldas.creacionales.factory;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("📧 Email enviado: " + message);
    }
}