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
              
        try {
            
          Statement s = c.createStatement();
        
          // The statements are copied from the SQL script directly
          // They recreate the database and tables
          s.addBatch("DROP DATABASE MovieDay");
          s.addBatch("CREATE DATABASE MovieDay");
          s.addBatch("USE MovieDay");
          s.addBatch(
              "CREATE TABLE User (" +
              "UserID INTEGER NOT NULL AUTO_INCREMENT UNIQUE, Name VARCHAR(50) NOT NULL, " +
              "Surname VARCHAR(50) NOT NULL, DateOfBirth DATE NOT NULL,"
                      + " Email VARCHAR (50) NOT NULL UNIQUE, Password VARCHAR(50) NOT NULL,"+
              "SecQuestionAnswer VARCHAR (100), PRIMARY KEY (UserID))");
          s.addBatch(
              "CREATE TABLE Admin (" +
              "UserID INTEGER NOT NULL AUTO_INCREMENT UNIQUE, " +
              "Name VARCHAR(50) NOT NULL UNIQUE, " +
              "Surname VARCHAR(50) NOT NULL, " +
              "Email VARCHAR(50) NOT NULL UNIQUE," +
              "Password VARCHAR (50) NOT NULL," +
              "PRIMARY KEY (UserID))");
          s.addBatch(
                "CREATE TABLE Reservation("+
                "ReservationID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"+ 
                "UserID INTEGER,"+
                "PRIMARY KEY(ReservationID),"+
                "FOREIGN KEY (UserID) REFERENCES User(UserID))");
           s.addBatch(
                "CREATE TABLE Venue (" +
                "VenueID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"+
                "Venue BOOLEAN NOT NULL, " +
                "VenueFee DOUBLE,"+
                "PRIMARY KEY (VenueID))");
           s.addBatch(
                "CREATE TABLE Movie (" +
                "MovieID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"+
                "Title VARCHAR (50) NOT NULL," +
                "Year DATETIME NOT NULL," + 
                "Length INTEGER," +
                "Description VARCHAR (250)," +
                "Price DOUBLE," +
                "MovieUrl VARCHAR(250)"+
                "PRIMARY KEY (MovieID))");
           s.addBatch(
                "CREATE TABLE Seat (" +
                "SeatID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"+
                "ReservationStatUs BOOLEAN, " +
                "VenueID INTEGER NOT NULL,"+
                "PRIMARY KEY (SeatID),"+
                "FOREIGN KEY(VenueID) REFERENCES Venue(VenueID))");
           
           //Initial Populating of Users Data
            s.addBatch(
              "INSERT INTO User VALUES " +
              "(1,'Nino', 'Jacobs', '2008-7-04','nino@gmail.com','1234','Fort Nite'), " +
              "(2,'Jean Luc','Niyonzima', '2008-7-04','jean@gmail.com','1234','MAT211'), " +
              "(3,'Kamo','Matjila', '2008-7-04','kamo@gmail.com','1234','MAT211')," +
              "(4,'Big', 'Sean', 21/05/1990,'sean@gmail.com','1234','i Decided'), " +
              "(5,'Zuks','Something', '2008-7-04','zuks@gmail.com','1234','MAT211'), " +
              "(6,'Stevie','Wonder', '2008-7-04','stevie@gmail.com','1234','MAT211')"
            );
            
            //Populating Admin Data
            s.addBatch(
                "INSERT INTO Admin VALUES "+
                "(1,'Admin','Guy', '1234','admin@movieday.com'),"+
                "(2,'John', 'Claude', '1234','john@movieday.com')"
            );
            
            //Populating Movies Table
            s.addBatch(
                "INSERT INTO Movie VALUES"+
                "()" +
                "()" +
                "()"
            );
       
          // In case you want to see the update results from each statement
          // Normally not needed to store the results.
          int results[] = s.executeBatch();  
          
        } catch (SQLException sqlexp) {
            System.err.println("Failed to execute one of the statements.");
            System.err.println(sqlexp.getMessage());
        }
        c.close();
        
      } catch (SQLException sqlexp) {
        System.err.println("Failed to connect to the database.");
        System.err.println(sqlexp.getMessage());
      }
      
     }
}
