package edu.ucaldas.creacionales.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void debeCrearEmailNotification() {
        Notification notif = NotificationFactory.createNotification("EMAIL");
        assertInstanceOf(EmailNotification.class, notif);
    }

    @Test
    void debeCrearSMSNotification() {
        Notification notif = NotificationFactory.createNotification("SMS");
        assertInstanceOf(SMSNotification.class, notif);
    }

    @Test
    void debeCrearPushNotification() {
        Notification notif = NotificationFactory.createNotification("PUSH");
        assertInstanceOf(PushNotification.class, notif);
    }

    @Test
    void debeLanzarExcepcionConTipoInvalido() {
        assertThrows(IllegalArgumentException.class, () ->
            NotificationFactory.createNotification("WHATSAPP")
        );
    }
}
