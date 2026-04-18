package edu.ucaldas.creacionales.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void debeRetornarSiempreLaMismaInstancia() {
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        assertSame(conn1, conn2);
    }

    @Test
    void debeSerThreadSafe() throws InterruptedException {
        DatabaseConnection[] instancias = new DatabaseConnection[2];

        Thread t1 = new Thread(() -> instancias[0] = DatabaseConnection.getInstance());
        Thread t2 = new Thread(() -> instancias[1] = DatabaseConnection.getInstance());

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        assertSame(instancias[0], instancias[1]);
    }
}