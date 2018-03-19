/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieday;

import static com.sun.glass.ui.Cursor.setVisible;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author johnclaude
 */
public class Function {
    public static void goToAdminHome(){
        new AdminHome().setVisible(true);
    }
    
    public static void goToAdminUserScreen(){
        new AdminUsersScreen().setVisible(true);
    }
    
    public static void goToReportScreen(){
         new ReportScreen().setVisible(true);
    }
    
     public static void goToAdminMoviesScreen(){
        new AdminMoviesScreen().setVisible(true);
    }
     
     public static void goToAdminHelpScreen(){
        new AdminHelpScreen().setVisible(true);
    }
     
    public void initDatabase(){
         String jdbcDriver = "com.mysql.jdbc.Driver";
         String dbUrl = "jdbc:mysql://localhost:8889/";
         String dbUserID = "root";
         String dbPassword = "root";
         
         Connection c  = null;
         
        try {    
            Class.forName(jdbcDriver);
        }
        catch (ClassNotFoundException exp) {
            System.err.println("Could not load the JDBC driver " + jdbcDriver);
            return;
        }
        
        try {
        c = DriverManager.getConnection(dbUrl, dbUserID, dbPassword);
         /*       
        try {
            
          Statement s = c.createStatement();
        
          // The statements are copied from the SQL script directly
          s.addBatch("DROP DATABASE shop");
          s.addBatch("CREATE DATABASE shop");
          s.addBatch("USE shop");
          s.addBatch(
              "CREATE TABLE products (" +
              "item_id CHAR(6) NOT NULL UNIQUE, title VARCHAR(50), " +
              "price DOUBLE, PRIMARY KEY (item_id))");
          s.addBatch(
              "CREATE TABLE users (" +
              "user_id INTEGER NOT NULL AUTO_INCREMENT UNIQUE, " +
              "login_id VARCHAR(16) NOT NULL UNIQUE, " +
              "user_password VARCHAR(16) NOT NULL, " +
              "email VARCHAR(30) NOT NULL UNIQUE,  PRIMARY KEY (user_id))");
          s.addBatch(
              "INSERT INTO products VALUES " +
              "('100420', 'Coffee', 4.50), " +
              "('123456', 'Tea', 5.00), " +
              "('241412', 'Orange Juice', 6.50)");
          s.addBatch(
              "INSERT INTO users (login_id, user_password, email) VALUES " +
              "('joe', 'joe', 'joe@yahoo.com'), " +
              "('jane', 'jane', 'jane@hotmail.com')");
                
          // In case you want to see the update results from each statement
          // Normally not needed to store the results.
          int results[] = s.executeBatch();  
          
        } catch (SQLException sqlexp) {
            System.err.println("Failed to execute one of the statements.");
            System.err.println(sqlexp.getMessage());
        }
        */
        c.close();
        
      } catch (SQLException sqlexp) {
        System.err.println("Failed to connect to the database.");
        System.err.println(sqlexp.getMessage());
      }
      
     }
}
