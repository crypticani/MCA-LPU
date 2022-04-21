package JDBC;

import java.sql.*;

public class JavaMysqlSelectExample {

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        try{
            // Ensure we have mariadb Driver in classpath
        Class.forName("org.mariadb.jdbc.Driver");

        // create our mysql database connection
        String host = "localhost";
        String dbname = "java";
        String url = "jdbc:mariadb://" + host + "/" + dbname;
        String username = "user";
        String password = "password";
        conn = DriverManager.getConnection(url, username, password);

        System.out.println("Connected database successfully...");

        System.out.println("Creating table in given database...");
        stmt = conn.createStatement();

        String sql = "CREATE TABLE IF NOT EXISTS REGISTRATION"
                + "(id INTEGER not NULL, "
                + " first VARCHAR(255), "
                + " last VARCHAR(255), "
                + " age INTEGER, "
                + " PRIMARY KEY ( id ))";

        stmt.executeUpdate(sql);
        System.out.println("Created table in given database...");
        }
        catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}
