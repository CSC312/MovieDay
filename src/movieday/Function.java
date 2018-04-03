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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.FileOutputStream;
import javax.swing.JTable;

/**
 * 
 *
 * @author johnclaude
 */
public class Function {

    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost:8889/";
    String dbUserID = "root";
    String dbPassword = "root";

    Connection c = null;

    public static void goToAdminHome(int UserID) {
        new AdminHome(UserID).setVisible(true);
    }

    public static void goToAdminUserScreen(int UserID) {
        new AdminUsersScreen(UserID).setVisible(true);
    }

    public static void goToReportScreen(int UserID) {
        new ReportScreen(UserID).setVisible(true);
    }

    public static void goToAdminMoviesScreen(int UserID) {
        new AdminMoviesScreen(UserID).setVisible(true);
    }

    public static void goToAdminHelpScreen(int UserID) {
        new AdminHelpScreen(UserID).setVisible(true);
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
                            + "UserID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"
                            + "Name VARCHAR(50) NOT NULL, "
                            + "Surname VARCHAR(50) NOT NULL,"
                            + "DateOfBirth DATE NOT NULL,"
                            + "Email VARCHAR (50) NOT NULL UNIQUE,"
                            + "Password VARCHAR(50) NOT NULL,"
                            + "SecQuestionAnswer VARCHAR (100),"
                            + "PRIMARY KEY (UserID))");
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
                            + "UserID INTEGER NOT NULL,"
                            + "SeatID INTEGER,"
                            + "ShowID INTEGER,"
                            + "MovieID INTEGER,"
                            + "PRIMARY KEY(ReservationID))");

                    s.addBatch(
                            "CREATE TABLE Movie ("
                            + "MovieID INTEGER NOT NULL AUTO_INCREMENT UNIQUE,"
                            + "Title VARCHAR (50) NOT NULL,"
                            + "Year VARCHAR(30) NOT NULL,"
                            + "Length INTEGER,"
                            + "Description VARCHAR (250),"
                            + "Price DOUBLE,"
                            + "ImageUrl VARCHAR(250),"
                            + "Cancelled INTEGER,"
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
                            + "PRIMARY KEY (SeatID))");
                    s.addBatch("DROP TABLE MovieShow");
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
                            + "(4,'Big', 'Sean', '1990-02-01','sean@gmail.com','1234','i Decided'), "
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
                            + "(1,'Get Out', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg',0),"
                            + "(2,'Blade Runner', '2018', 156, 'Sci-Fi movie about blah.', 98.00,'../movieday/images/Folder.jpg',0),"
                            + "(3,'Maze Runner', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg',0),"
                            + "(4,'Black Panther', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg',0),"
                            + "(5, '50 Shades', '2018', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg',0),"
                            + "(6,'Test Movie', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg',0),"
                            + "(7,'Test Movie 2 Out', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg',0),"
                            + "(8,'This Is Another One', '2017', 123,'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg',0),"
                            + "(9,'Movie Number 4', '2017', 123, 'Thriller movie about blah.', 98.00,'../movieday/images/Folder.jpg',0)");
                    s.addBatch(
                            "INSERT INTO Reservation VALUES"
                            + "(1,1,1,1,1),"
                            + "(2,1,2,1,1),"
                            + "(3,1,3,1,1),"
                            + "(4,2,1,1,2),"
                            + "(5,2,4,1,1),"
                            + "(6,2,1,3,7),"
                            + "(7,3,2,3,7),"
                            + "(8,5,5,2,6),"
                            + "(9,3,6,2,5),"
                            + "(10,5,1,3,8),"
                            + "(11,6,4,2,5)");
                    s.addBatch("INSERT INTO MovieShow VALUES"
                            + "(1,'1,2,3'),"
                            + "(2,'4,5,6'),"
                            + "(3,'7,8,9')");
                    s.addBatch("INSERT INTO Seat Values"
                            + "(1,0),"
                            + "(2,0),"
                            + "(3,0),"
                            + "(4,0),"
                            + "(5,0),"
                            + "(6,0),"
                            + "(7,0),"
                            + "(8,0),"
                            + "(9,0),"
                            + "(10,0),"
                            + "(11,0),"
                            + "(12,0),"
                            + "(13,0),"
                            + "(14,0),"
                            + "(15,0),"
                            + "(16,0),"
                            + "(17,0),"
                            + "(18,0),"
                            + "(19,0),"
                            + "(20,0)");

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
            c = getConnection(); //Open a connection

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

    public Connection getConnection() {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:8889/MovieDay", dbUserID, dbPassword);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean checkEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            return false;
        }
        return true;
    }

    public boolean checkPassword(String password) {
        if (password.length() < 5) {
            return false;
        }
        return true;
    }

    public static DefaultTableModel buildTableModel(ResultSet rs)
            throws SQLException {

        ResultSetMetaData metaData = rs.getMetaData();

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);

    }

    public void print(JTable table) {
        Document document = new Document(PageSize.A4.rotate());
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Report.pdf"));

            document.open();
            PdfContentByte cb = writer.getDirectContent();

            cb.saveState();
            Graphics2D g2 = cb.createGraphicsShapes(500, 500);

            Shape oldClip = g2.getClip();
            g2.clipRect(0, 0, 500, 500);

            table.print(g2);
            g2.setClip(oldClip);

            g2.dispose();
            cb.restoreState();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        document.close();
    }

}
