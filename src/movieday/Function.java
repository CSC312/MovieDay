/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieday;

import static com.sun.glass.ui.Cursor.setVisible;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author johnclaude
 */
public class Function {

    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost:8889/";
    String dbUserID = "root";
    String dbPassword = "root";

    Connection c = null;

    public static void goToAdminHome() {
        new AdminHome().setVisible(true);
    }

    public static void goToAdminUserScreen() {
        new AdminUsersScreen().setVisible(true);
    }

    public static void goToReportScreen() {
        new ReportScreen().setVisible(true);
    }

    public static void goToAdminMoviesScreen() {
        new AdminMoviesScreen().setVisible(true);
    }

    public static void goToAdminHelpScreen() {
        new AdminHelpScreen().setVisible(true);
    }

    public void initDatabase() {
        if (checkDBExists() == false) {
            System.out.println("DB Does Not Exist and will created ...");
            try {
                Class.forName(jdbcDriver);
            } catch (ClassNotFoundException exp) {
                System.err.println("Could not load the JDBC driver " + jdbcDriver);
                return;
            }

            try {
                c = DriverManager.getConnection(dbUrl, dbUserID, dbPassword);

                try {

                    Statement s = c.createStatement();

                    // The statements are copied from the SQL script directly
                    //s.addBatch("DROP DATABASE MovieDay");
                    s.addBatch("CREATE DATABASE MovieDay");
                    s.addBatch("USE MovieDay");
                    s.addBatch(
                            "CREATE TABLE User ("
                            + "UserID INTEGER NOT NULL AUTO_INCREMENT UNIQUE, Name VARCHAR(50) NOT NULL, "
                            + "Surname VARCHAR(50) NOT NULL, DateOfBirth DATE NOT NULL,"
                            + " Email VARCHAR (50) NOT NULL UNIQUE, Password VARCHAR(50) NOT NULL,"
                            + "SecQuestionAnswer VARCHAR (100), PRIMARY KEY (UserID))");
                    s.addBatch(
                            "CREATE TABLE Admin ("
                            + "UserID INTEGER NOT NULL AUTO_INCREMENT UNIQUE, "
                            + "Name VARCHAR(50) NOT NULL UNIQUE, "
                            + "Surname VARCHAR(50) NOT NULL, "
                            + "Email VARCHAR(50) NOT NULL UNIQUE,"
                            + "Password VARCHAR (50) NOT NULL,"
                            + "PRIMARY KEY (UserID))");
                    s.addBatch(
                            "CREATE TABLE Reservation("
                            + "ReservationID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"
                            + "UserID INTEGER,"
                            + "SeatID INTEGER,"
                            + "ShowID INTEGER,"
                            + "MovieID INTEGER,"
                            + "PRIMARY KEY(ReservationID),"
                            + "FOREIGN KEY (UserID) REFERENCES User(UserID))");
                    s.addBatch(
                            "CREATE TABLE Venue ("
                            + "VenueID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"
                            + "Venue BOOLEAN NOT NULL, "
                            + "VenueFee DOUBLE,"
                            + "UserID INTEGER NOT NULL,"
                            + "SeatID INTEGER NOT NULL,"
                            + "ShowID INTEGER NOT NULL,"
                            + "MovieID INTEGER NOT NULL,"
                            + "PRIMARY KEY (VenueID))");
                    s.addBatch(
                            "CREATE TABLE Movie ("
                            + "MovieID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"
                            + "Title VARCHAR (50) NOT NULL,"
                            + "Year VARCHAR(30) NOT NULL,"
                            + "Length INTEGER,"
                            + "Description VARCHAR (250),"
                            + "Price DOUBLE,"
                            + "ImageUrl VARCHAR(250),"
                            + "PRIMARY KEY (MovieID))");
                    s.addBatch(
                            "CREATE TABLE MovieShow ("
                            + "ShowID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"
                            + "MovieIDs VARCHAR(250),"
                            + "PRIMARY KEY (ShowID))");
                    s.addBatch(
                            "CREATE TABLE Seat ("
                            + "SeatID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"
                            + "ReservationStatUs BOOLEAN, "
                            + "VenueID INTEGER,"
                            + "PRIMARY KEY (SeatID),"
                            + "FOREIGN KEY(VenueID) REFERENCES Venue(VenueID))");
                    s.addBatch(
                            "CREATE TABLE MovieShow("
                            + "ShowID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"
                            + "MovieIDs VARCHAR (250),"
                            + "PRIMARY KEY (ShowID))");
                    //Initial Populating of Users Data
                    s.addBatch(
                            "INSERT INTO User VALUES "
                            + "(1,'Nino', 'Jacobs', '2008-7-04','nino@gmail.com','1234','Fort Nite'), "
                            + "(2,'Jean Luc','Niyonzima', '2008-7-04','jean@gmail.com','1234','MAT211'), "
                            + "(3,'Kamo','Matjila', '2008-7-04','kamo@gmail.com','1234','MAT211'),"
                            + "(4,'Big', 'Sean', 21/05/1990,'sean@gmail.com','1234','i Decided'), "
                            + "(5,'Zuks','Something', '2008-7-04','zuks@gmail.com','1234','MAT211'), "
                            + "(6,'Stevie','Wonder', '2008-7-04','stevie@gmail.com','1234','MAT211')"
                    );

                    //Populating Admin Data
                    s.addBatch(
                            "INSERT INTO Admin VALUES "
                            + "(1,'Admin','Guy', 'admin@movieday.com','1234'),"
                            + "(2,'John', 'Claude', 'john@movieday.com','q234')"
                    );
                    //Populating Movies Table
                    s.addBatch(
                            "INSERT INTO Movie VALUES"
                                    + "(1,'Get Out', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg'),"
                                    + "(2,'Blade Runner', '2018', 156, 'Sci-Fi movie about blah.', 98.00,'../movieday/images/Folder.jpg'),"
                                    + "(3,'Maze Runner', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg'),"
                                    + "(4,'Black Panther', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg'),"
                                    + "(5, '50 Shades', '2018', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg'),"
                                    + "(6,'Test Movie', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg'),"
                                    + "(7,'Test Movie 2 Out', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg'),"
                                    + "(8,'This Is Another One', '2017', 123,'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg'),"
                                    + "(9,'Movie Number 4', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg')");
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
        } else {
            System.out.println("DB Movie Already Exists...");
        }
    }

    public boolean checkDBExists() {

        try {
            Class.forName(jdbcDriver); //Register JDBC Driver

            System.out.println("Creating a connection...");
            c = DriverManager.getConnection(dbUrl, dbUserID, dbPassword); //Open a connection

            ResultSet resultSet = c.getMetaData().getCatalogs();

            while (resultSet.next()) {

                String databaseName = resultSet.getString(1);
                if (databaseName.equals("MovieDay")) {
                    return true;
                }
            }
            resultSet.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
