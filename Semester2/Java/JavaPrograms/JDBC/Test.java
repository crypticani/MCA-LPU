package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
public class Test {
   public static void main(String[]args){
      Connection con = null;
      try {
         con = DriverManager.
         getConnection("jdbc:mariadb://localhost:3306/sample?useSSL=false", "user", "password");
         System.out.println("Connection is successful !!!!!");
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}