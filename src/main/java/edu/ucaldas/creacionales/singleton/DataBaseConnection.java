package edu.ucaldas.creacionales.singleton;

public class DatabaseConnection {
    
    private static volatile DatabaseConnection instance;
    private String url;

    private DatabaseConnection() {
        this.url = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Conexión a base de datos creada");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public void query(String sql) {
        System.out.println("Ejecutando query: " + sql);
    }
}
