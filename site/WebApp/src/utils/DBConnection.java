package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connectionInstance = null;


    static String connectionUrl = "jdbc:sqlserver://pedrometer.database.windows.net:1433;database=PedrometerDB";
    private DBConnection() {
    }

    public static Connection getInstance() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (connectionInstance == null) {
            try {
                connectionInstance = DriverManager.getConnection(connectionUrl, "Elena", "_eli6636");
                return connectionInstance;
            } catch (SQLException var1) {
                throw new RuntimeException(var1);
            }
        } else {
            return connectionInstance;
        }

    }

}