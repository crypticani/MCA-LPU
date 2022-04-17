package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
 
public class MySQLConnectExample {
    public static void main(String[] args) {
 
        // creates three different Connection objects
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
 
        try {
            // connect way #1
            String url1 = "jdbc:mariadb://localhost:3306/java";
            String user = "user";
            String password = "password";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database java");
            }
 
            // connect way #2
            String url2 = "jdbc:mariadb://localhost:3306/java?user=user&password=password";
            conn2 = DriverManager.getConnection(url2);
            if (conn2 != null) {
                System.out.println("Connected to the database java");
            }
 
            // connect way #3
            String url3 = "jdbc:mariadb://localhost:3306/java";
            Properties info = new Properties();
            info.put("user", "user");
            info.put("password", "password");
 
            conn3 = DriverManager.getConnection(url3, info);
            if (conn3 != null) {
                System.out.println("Connected to the database java");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}
