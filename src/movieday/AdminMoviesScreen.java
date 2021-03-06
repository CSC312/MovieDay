/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieday;

import UserPages.Screen1Home;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author johnclaude
 */
public class AdminMoviesScreen extends javax.swing.JFrame {

    /**
     * Creates new form AdminMoviesScreen
     */
    //Show 1 - Movie 1
    String show1m1Title, show1m1Year, show1m1Description;
    int show1m1Length;

    //Show 1 - Movie 2
    String show1m2Title, show1m2Year, show1m2Description;
    int show1m2Length;

    //Show 1 - Movie 3
    String show1m3Title, show1m3Year, show1m3Description;
    int show1m3Length;

    //Show 2 - Movie 1
    String show2m1Title, show2m1Year, show2m1Description;
    int show2m1Length;

    //Show 2 - Movie 2
    String show2m2Title, show2m2Year, show2m2Description;
    int show2m2Length;

    //Show 2 - Movie 3
    String show2m3Title, show2m3Year, show2m3Description;
    int show2m3Length;

    //Show 3 - Movie 1
    String show3m1Title, show3m1Year, show3m1Description;
    int show3m1Length;

    //Show 3 - Movie 2
    String show3m2Title, show3m2Year, show3m2Description;
    int show3m2Length;

    //Show 3 - Movie 3
    String show3m3Title, show3m3Year, show3m3Description;
    int show3m3Length;

    //Databases Variables
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost:8889/MovieDay";
    String dbUserID = "root";
    String dbPassword = "root";
    
    static int UserID;

    ResultSet res;
    Connection c;
    ResultSetMetaData meta;
    DefaultTableModel model;

    Function funct = new Function();

    public AdminMoviesScreen(int usrID) {
        initComponents();
        this.setLocationRelativeTo(null);
        UserID = usrID;

        //Code to retrieve data from database and populate Fields
        try {
            Class.forName(jdbcDriver);
            c = DriverManager.getConnection("jdbc:mysql://localhost:8889/MovieDay", dbUserID, dbPassword);

            // The SQL SELECT query.
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM Movie WHERE Movie.MovieID = 1";

            // create the java statement
            Statement st = c.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            // iterate through the java resultset
            while (rs.next()) {
                //int id = rs.getInt("id");
                s1m1Title.setText(rs.getString("Title"));
                s1m1Year.setText(rs.getString("Year"));
                s1m1Length.setText("" + rs.getInt("Length"));
                s1m1Description.setText(rs.getString("Description"));

            }

            //Show 1 Movie 2
            query = "SELECT * FROM Movie WHERE Movie.MovieID = 2";
            rs = st.executeQuery(query);
            while (rs.next()) {
                s1m2Title.setText(rs.getString("Title"));
                s1m2Year.setText(rs.getString("Year"));
                s1m2Length.setText("" + rs.getInt("Length"));
                s1m2Description.setText(rs.getString("Description"));
            }

            //Show 1 Movie 3
            query = "SELECT * FROM Movie WHERE Movie.MovieID = 3";
            rs = st.executeQuery(query);
            while (rs.next()) {
                s1m3Title.setText(rs.getString("Title"));
                s1m3Year.setText(rs.getString("Year"));
                s1m3Length.setText("" + rs.getInt("Length"));
                s1m3Description.setText(rs.getString("Description"));
            }

            //Show 2 Movie 1
            query = "SELECT * FROM Movie WHERE Movie.MovieID = 4";
            rs = st.executeQuery(query);
            while (rs.next()) {
                s2m1Title.setText(rs.getString("Title"));
                s2m1Year.setText(rs.getString("Year"));
                s2m1Length.setText("" + rs.getInt("Length"));
                s2m1Description.setText(rs.getString("Description"));
            }

            //Show 2 Movie 2
            query = "SELECT * FROM Movie WHERE Movie.MovieID = 5";
            rs = st.executeQuery(query);
            while (rs.next()) {
                s2m2Title.setText(rs.getString("Title"));
                s2m2Year.setText(rs.getString("Year"));
                s2m2Length.setText("" + rs.getInt("Length"));
                s2m2Description.setText(rs.getString("Description"));
            }

            //Show 2 Movie 3
            query = "SELECT * FROM Movie WHERE Movie.MovieID = 6";
            rs = st.executeQuery(query);
            while (rs.next()) {
                s2m3Title.setText(rs.getString("Title"));
                s2m3Year.setText(rs.getString("Year"));
                s2m3Length.setText("" + rs.getInt("Length"));
                s2m3Description.setText(rs.getString("Description"));
            }

            //Show 3 Movie 1
            query = "SELECT * FROM Movie WHERE Movie.MovieID = 7";
            rs = st.executeQuery(query);
            while (rs.next()) {
                s3m1Title.setText(rs.getString("Title"));
                s3m1Year.setText(rs.getString("Year"));
                s3m1Length.setText("" + rs.getInt("Length"));
                s3m1Description.setText(rs.getString("Description"));
            }

            //Show 3 Movie 2
            query = "SELECT * FROM Movie WHERE Movie.MovieID = 8";
            rs = st.executeQuery(query);
            while (rs.next()) {
                s3m2Title.setText(rs.getString("Title"));
                s3m2Year.setText(rs.getString("Year"));
                s3m2Length.setText("" + rs.getInt("Length"));
                s3m2Description.setText(rs.getString("Description"));
            }

            //Show 3 Movie 3
            query = "SELECT * FROM Movie WHERE Movie.MovieID = 9";
            rs = st.executeQuery(query);
            while (rs.next()) {
                s3m3Title.setText(rs.getString("Title"));
                s3m3Year.setText(rs.getString("Year"));
                s3m3Length.setText("" + rs.getInt("Length"));
                s3m3Description.setText(rs.getString("Description"));
            }

            //Populate Reservations Table
            PreparedStatement statement = c.prepareStatement("SELECT r.ReservationID AS `Reservation ID`,\n"
                    + "u.Email AS `Email`,\n"
                    + "m.Title AS `Movie`,\n"
                    + "s.SeatID AS `Seat Number`,\n"
                    + "ms.ShowID AS `Show`\n"
                    + "FROM Reservation r\n"
                    + "LEFT JOIN Seat s\n"
                    + "ON s.SeatID = r.SeatID\n"
                    + "LEFT JOIN Movie m\n"
                    + "ON m.MovieID = r.MovieID\n"
                    + "LEFT JOIN `User` u\n"
                    + "ON u.UserID = r.UserID\n"
                    + "LEFT JOIN MovieShow ms\n"
                    + "ON ms.ShowID = r.ShowID\n"
                    + "GROUP BY r.ReservationID");
            res = statement.executeQuery();
            meta = res.getMetaData();
            // It creates and displays the table
            model = funct.buildTableModel(res);
            reservationsTable.setModel(model);
            // Closes the Connection
            //JOptionPane.showMessageDialog(null, new JScrollPane(reservationsTable));

            //c.close();
        } catch (ClassNotFoundException exp) {
            System.err.println("Could not load the JDBC driver " + jdbcDriver);
            return;
        } catch (SQLException ex) {
            Logger.getLogger(AdminMoviesScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        show1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        s1m1Image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        s1m1Title = new javax.swing.JTextField();
        s1m1Length = new javax.swing.JTextField();
        s1m1Year = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        s1m1Description = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        s1m3Image = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        s1m3Title = new javax.swing.JTextField();
        s1m3Length = new javax.swing.JTextField();
        s1m3Year = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        s1m3Description = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        s1m2Image = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        s1m2Title = new javax.swing.JTextField();
        s1m2Length = new javax.swing.JTextField();
        s1m2Year = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        s1m2Description = new javax.swing.JTextArea();
        s1Savechanges = new javax.swing.JButton();
        show2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        s2m1Title = new javax.swing.JTextField();
        s2m1Length = new javax.swing.JTextField();
        s2m1Year = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        s2m1Description = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        s2m3Title = new javax.swing.JTextField();
        s2m3Length = new javax.swing.JTextField();
        s2m3Year = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        s2m3Description = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        s2m2Title = new javax.swing.JTextField();
        s2m2Length = new javax.swing.JTextField();
        s2m2Year = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        s2m2Description = new javax.swing.JTextArea();
        s2SaveChangesButton = new javax.swing.JButton();
        show3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        s3m1Title = new javax.swing.JTextField();
        s3m1Length = new javax.swing.JTextField();
        s3m1Year = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        s3m1Description = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        s3m3Title = new javax.swing.JTextField();
        s3m3Length = new javax.swing.JTextField();
        s3m3Year = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        s3m3Description = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        s3m2Title = new javax.swing.JTextField();
        s3m2Length = new javax.swing.JTextField();
        s3m2Year = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        s3m2Description = new javax.swing.JTextArea();
        s3SaveChangesButton = new javax.swing.JButton();
        manageReservations = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        reservationsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        btnSearchReservation = new javax.swing.JButton();
        btnDeleteReservation = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        adminHomeMenu = new javax.swing.JMenu();
        adminReportsMenu = new javax.swing.JMenu();
        adminMoviesMenu = new javax.swing.JMenu();
        adminUsersMenu = new javax.swing.JMenu();
        adminProfileMenu = new javax.swing.JMenu();
        adminHelpMenu = new javax.swing.JMenu();
        adminExitMenu = new javax.swing.JMenu();
        adminLogoutMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 960, 770));
        setMinimumSize(new java.awt.Dimension(960, 770));
        setPreferredSize(new java.awt.Dimension(960, 770));
        setResizable(false);
        setSize(new java.awt.Dimension(960, 770));
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));

        show1.setBackground(new java.awt.Color(51, 51, 51));
        show1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        s1m1Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/m1.png"))); // NOI18N
        s1m1Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s1m1ImageMouseClicked(evt);
            }
        });
        jPanel2.add(s1m1Image);
        s1m1Image.setBounds(60, 80, 200, 180);

        jLabel2.setText("Length");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 360, 50, 40);

        jLabel3.setText("Year");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 320, 50, 40);

        jLabel5.setText("Title");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 280, 50, 40);

        jLabel6.setText("Description");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 430, 120, 20);

        s1m1Title.setText("Get Out");
        jPanel2.add(s1m1Title);
        s1m1Title.setBounds(90, 280, 160, 40);

        s1m1Length.setText("123");
        s1m1Length.setToolTipText("Length of Movie in minutes");
        jPanel2.add(s1m1Length);
        s1m1Length.setBounds(90, 360, 160, 40);

        s1m1Year.setText("2017");
        jPanel2.add(s1m1Year);
        s1m1Year.setBounds(90, 320, 160, 40);

        s1m1Description.setColumns(20);
        s1m1Description.setRows(5);
        s1m1Description.setText("dfvsdcds");
        jScrollPane1.setViewportView(s1m1Description);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 470, 210, 130);

        show1.add(jPanel2);
        jPanel2.setBounds(10, 20, 300, 620);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        s1m3Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/m3.png"))); // NOI18N
        jPanel4.add(s1m3Image);
        s1m3Image.setBounds(60, 80, 200, 180);

        jLabel9.setText("Length");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(40, 360, 50, 40);

        jLabel10.setText("Year");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(40, 320, 50, 40);

        jLabel11.setText("Title");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(40, 280, 50, 40);

        jLabel12.setText("Description");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(40, 430, 120, 20);

        s1m3Title.setText("Assassin's Creed");
        jPanel4.add(s1m3Title);
        s1m3Title.setBounds(90, 280, 160, 40);

        s1m3Length.setText("144");
        jPanel4.add(s1m3Length);
        s1m3Length.setBounds(90, 360, 160, 40);

        s1m3Year.setText("2017");
        jPanel4.add(s1m3Year);
        s1m3Year.setBounds(90, 320, 160, 40);

        s1m3Description.setColumns(20);
        s1m3Description.setRows(5);
        s1m3Description.setText("cgvjhbkjl");
        jScrollPane2.setViewportView(s1m3Description);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(40, 470, 210, 130);

        show1.add(jPanel4);
        jPanel4.setBounds(600, 20, 300, 620);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(null);

        s1m2Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/m2.png"))); // NOI18N
        jPanel5.add(s1m2Image);
        s1m2Image.setBounds(60, 80, 200, 180);

        jLabel13.setText("Length");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(40, 360, 50, 40);

        jLabel14.setText("Year");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(40, 320, 50, 40);

        jLabel15.setText("Title");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(40, 280, 50, 40);

        jLabel16.setText("Description");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(40, 430, 120, 20);

        s1m2Title.setText("Some Movie");
        jPanel5.add(s1m2Title);
        s1m2Title.setBounds(90, 280, 160, 40);

        s1m2Length.setText("156");
        jPanel5.add(s1m2Length);
        s1m2Length.setBounds(90, 360, 160, 40);

        s1m2Year.setText("2018");
        jPanel5.add(s1m2Year);
        s1m2Year.setBounds(90, 320, 160, 40);

        s1m2Description.setColumns(20);
        s1m2Description.setRows(5);
        s1m2Description.setText("dzxfcgvbnohv hjhfxjkl");
        jScrollPane3.setViewportView(s1m2Description);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(40, 470, 210, 130);

        show1.add(jPanel5);
        jPanel5.setBounds(300, 20, 300, 620);

        s1Savechanges.setText("Save Changes");
        s1Savechanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1SavechangesActionPerformed(evt);
            }
        });
        show1.add(s1Savechanges);
        s1Savechanges.setBounds(360, 650, 180, 40);

        jTabbedPane1.addTab("Show 1-15:00", show1);

        show2.setBackground(new java.awt.Color(51, 51, 51));
        show2.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/m1.png"))); // NOI18N
        jPanel7.add(jLabel17);
        jLabel17.setBounds(40, 80, 200, 180);

        jLabel19.setText("Length");
        jPanel7.add(jLabel19);
        jLabel19.setBounds(40, 360, 50, 40);

        jLabel20.setText("Year");
        jPanel7.add(jLabel20);
        jLabel20.setBounds(40, 320, 50, 40);

        jLabel21.setText("Title");
        jPanel7.add(jLabel21);
        jLabel21.setBounds(40, 280, 50, 40);

        jLabel22.setText("Description");
        jPanel7.add(jLabel22);
        jLabel22.setBounds(40, 430, 120, 20);
        jPanel7.add(s2m1Title);
        s2m1Title.setBounds(90, 280, 160, 40);
        jPanel7.add(s2m1Length);
        s2m1Length.setBounds(90, 360, 160, 40);
        jPanel7.add(s2m1Year);
        s2m1Year.setBounds(90, 320, 160, 40);

        s2m1Description.setColumns(20);
        s2m1Description.setRows(5);
        jScrollPane5.setViewportView(s2m1Description);

        jPanel7.add(jScrollPane5);
        jScrollPane5.setBounds(40, 470, 210, 130);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(10, 20, 300, 620);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/m3.png"))); // NOI18N
        jPanel8.add(jLabel23);
        jLabel23.setBounds(40, 80, 200, 180);

        jLabel24.setText("Length");
        jPanel8.add(jLabel24);
        jLabel24.setBounds(40, 370, 50, 30);

        jLabel25.setText("Year");
        jPanel8.add(jLabel25);
        jLabel25.setBounds(40, 320, 50, 40);

        jLabel26.setText("Title");
        jPanel8.add(jLabel26);
        jLabel26.setBounds(40, 280, 50, 40);

        jLabel27.setText("Description");
        jPanel8.add(jLabel27);
        jLabel27.setBounds(40, 430, 120, 20);
        jPanel8.add(s2m3Title);
        s2m3Title.setBounds(90, 280, 160, 40);
        jPanel8.add(s2m3Length);
        s2m3Length.setBounds(90, 360, 160, 40);
        jPanel8.add(s2m3Year);
        s2m3Year.setBounds(90, 320, 160, 40);

        s2m3Description.setColumns(20);
        s2m3Description.setRows(5);
        jScrollPane6.setViewportView(s2m3Description);

        jPanel8.add(jScrollPane6);
        jScrollPane6.setBounds(40, 470, 210, 130);

        jPanel6.add(jPanel8);
        jPanel8.setBounds(600, 20, 300, 620);

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setLayout(null);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/m2.png"))); // NOI18N
        jPanel9.add(jLabel28);
        jLabel28.setBounds(40, 80, 200, 180);

        jLabel29.setText("Length");
        jPanel9.add(jLabel29);
        jLabel29.setBounds(40, 360, 50, 40);

        jLabel30.setText("Year");
        jPanel9.add(jLabel30);
        jLabel30.setBounds(40, 320, 50, 40);

        jLabel31.setText("Title");
        jPanel9.add(jLabel31);
        jLabel31.setBounds(40, 280, 50, 40);

        jLabel32.setText("Description");
        jPanel9.add(jLabel32);
        jLabel32.setBounds(40, 430, 120, 20);
        jPanel9.add(s2m2Title);
        s2m2Title.setBounds(90, 280, 160, 40);
        jPanel9.add(s2m2Length);
        s2m2Length.setBounds(90, 360, 160, 40);
        jPanel9.add(s2m2Year);
        s2m2Year.setBounds(90, 320, 160, 40);

        s2m2Description.setColumns(20);
        s2m2Description.setRows(5);
        jScrollPane7.setViewportView(s2m2Description);

        jPanel9.add(jScrollPane7);
        jScrollPane7.setBounds(40, 470, 210, 130);

        jPanel6.add(jPanel9);
        jPanel9.setBounds(300, 20, 300, 620);

        show2.add(jPanel6);
        jPanel6.setBounds(0, 0, 920, 650);

        s2SaveChangesButton.setText("Save Changes");
        s2SaveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2SaveChangesButtonActionPerformed(evt);
            }
        });
        show2.add(s2SaveChangesButton);
        s2SaveChangesButton.setBounds(350, 650, 180, 40);

        jTabbedPane1.addTab("Show 2-17:00", show2);

        show3.setBackground(new java.awt.Color(51, 51, 51));
        show3.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(null);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(null);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/m1.png"))); // NOI18N
        jPanel12.add(jLabel18);
        jLabel18.setBounds(40, 80, 200, 180);

        jLabel33.setText("Length");
        jPanel12.add(jLabel33);
        jLabel33.setBounds(40, 360, 50, 40);

        jLabel34.setText("Year");
        jPanel12.add(jLabel34);
        jLabel34.setBounds(40, 320, 50, 40);

        jLabel35.setText("Title");
        jPanel12.add(jLabel35);
        jLabel35.setBounds(40, 280, 50, 40);

        jLabel36.setText("Description");
        jPanel12.add(jLabel36);
        jLabel36.setBounds(40, 430, 120, 20);
        jPanel12.add(s3m1Title);
        s3m1Title.setBounds(90, 280, 160, 40);
        jPanel12.add(s3m1Length);
        s3m1Length.setBounds(90, 360, 160, 40);
        jPanel12.add(s3m1Year);
        s3m1Year.setBounds(90, 320, 160, 40);

        s3m1Description.setColumns(20);
        s3m1Description.setRows(5);
        jScrollPane8.setViewportView(s3m1Description);

        jPanel12.add(jScrollPane8);
        jScrollPane8.setBounds(40, 470, 210, 130);

        jPanel11.add(jPanel12);
        jPanel12.setBounds(10, 20, 300, 620);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(null);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/m3.png"))); // NOI18N
        jPanel13.add(jLabel37);
        jLabel37.setBounds(40, 80, 200, 180);

        jLabel38.setText("Length");
        jPanel13.add(jLabel38);
        jLabel38.setBounds(40, 370, 50, 30);

        jLabel39.setText("Year");
        jPanel13.add(jLabel39);
        jLabel39.setBounds(40, 320, 50, 40);

        jLabel40.setText("Title");
        jPanel13.add(jLabel40);
        jLabel40.setBounds(40, 280, 50, 40);

        jLabel41.setText("Description");
        jPanel13.add(jLabel41);
        jLabel41.setBounds(40, 430, 120, 20);
        jPanel13.add(s3m3Title);
        s3m3Title.setBounds(90, 280, 160, 40);
        jPanel13.add(s3m3Length);
        s3m3Length.setBounds(90, 360, 160, 40);
        jPanel13.add(s3m3Year);
        s3m3Year.setBounds(90, 320, 160, 40);

        s3m3Description.setColumns(20);
        s3m3Description.setRows(5);
        jScrollPane9.setViewportView(s3m3Description);

        jPanel13.add(jScrollPane9);
        jScrollPane9.setBounds(40, 470, 210, 130);

        jPanel11.add(jPanel13);
        jPanel13.setBounds(600, 20, 300, 620);

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));
        jPanel14.setLayout(null);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/m2.png"))); // NOI18N
        jPanel14.add(jLabel42);
        jLabel42.setBounds(40, 80, 200, 180);

        jLabel43.setText("Length");
        jPanel14.add(jLabel43);
        jLabel43.setBounds(40, 360, 50, 40);

        jLabel44.setText("Year");
        jPanel14.add(jLabel44);
        jLabel44.setBounds(40, 320, 50, 30);

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Title");
        jPanel14.add(jLabel45);
        jLabel45.setBounds(40, 280, 50, 40);

        jLabel46.setText("Description");
        jPanel14.add(jLabel46);
        jLabel46.setBounds(40, 430, 120, 20);
        jPanel14.add(s3m2Title);
        s3m2Title.setBounds(90, 280, 160, 40);
        jPanel14.add(s3m2Length);
        s3m2Length.setBounds(90, 360, 160, 40);
        jPanel14.add(s3m2Year);
        s3m2Year.setBounds(90, 320, 160, 40);

        s3m2Description.setColumns(20);
        s3m2Description.setRows(5);
        jScrollPane10.setViewportView(s3m2Description);

        jPanel14.add(jScrollPane10);
        jScrollPane10.setBounds(40, 470, 210, 130);

        jPanel11.add(jPanel14);
        jPanel14.setBounds(300, 20, 300, 620);

        show3.add(jPanel11);
        jPanel11.setBounds(0, 0, 940, 650);

        s3SaveChangesButton.setText("Save Changes");
        s3SaveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s3SaveChangesButtonActionPerformed(evt);
            }
        });
        show3.add(s3SaveChangesButton);
        s3SaveChangesButton.setBounds(350, 650, 180, 40);

        jTabbedPane1.addTab("Show 3-19:00", show3);

        manageReservations.setLayout(null);

        jScrollPane11.setViewportView(reservationsTable);

        manageReservations.add(jScrollPane11);
        jScrollPane11.setBounds(30, 170, 860, 260);

        jLabel1.setText("Manage Reservations");
        manageReservations.add(jLabel1);
        jLabel1.setBounds(30, 60, 230, 40);

        jLabel47.setText("Search By Email");
        manageReservations.add(jLabel47);
        jLabel47.setBounds(40, 110, 120, 40);
        manageReservations.add(emailTxt);
        emailTxt.setBounds(140, 110, 160, 40);

        btnSearchReservation.setText("Go");
        btnSearchReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchReservationActionPerformed(evt);
            }
        });
        manageReservations.add(btnSearchReservation);
        btnSearchReservation.setBounds(320, 110, 90, 40);

        btnDeleteReservation.setText("Delete Selected");
        btnDeleteReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteReservationActionPerformed(evt);
            }
        });
        manageReservations.add(btnDeleteReservation);
        btnDeleteReservation.setBounds(30, 440, 150, 50);

        btnClearAll.setText("Clear All");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });
        manageReservations.add(btnClearAll);
        btnClearAll.setBounds(410, 110, 150, 40);

        jTabbedPane1.addTab("Manage Reservations", manageReservations);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 960, 760);

        adminHomeMenu.setText("Home");
        adminHomeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminHomeMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(adminHomeMenu);

        adminReportsMenu.setText("Reports");
        adminReportsMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminReportsMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(adminReportsMenu);

        adminMoviesMenu.setText("Movies");
        adminMoviesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMoviesMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(adminMoviesMenu);

        adminUsersMenu.setText("Users");
        adminUsersMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminUsersMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(adminUsersMenu);

        adminProfileMenu.setText("Profile");
        adminProfileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminProfileMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(adminProfileMenu);

        adminHelpMenu.setText("Help");
        adminHelpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminHelpMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(adminHelpMenu);

        adminExitMenu.setText("Exit");
        adminExitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminExitMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(adminExitMenu);

        adminLogoutMenu.setText("Logout");
        adminLogoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLogoutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(adminLogoutMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteReservationActionPerformed
        int row = reservationsTable.getSelectedRow();
        int selected = Integer.parseInt(model.getValueAt(row, 0).toString());
        //System.out.println(selected);
        model.removeRow(row);

        String sql = "delete from reservation where ReservationID= ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, selected);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminMoviesScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(rootPane, "Reservations Deleted Successfully.");
    }//GEN-LAST:event_btnDeleteReservationActionPerformed

    private void adminHomeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminHomeMenuMouseClicked
        Function.goToAdminHome(UserID);
        this.setVisible(false);
    }//GEN-LAST:event_adminHomeMenuMouseClicked

    private void adminReportsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminReportsMenuMouseClicked
        Function.goToReportScreen(UserID);
        this.setVisible(false);
    }//GEN-LAST:event_adminReportsMenuMouseClicked

    private void adminMoviesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMoviesMenuMouseClicked
        Function.goToAdminMoviesScreen(UserID);
        this.setVisible(false);
    }//GEN-LAST:event_adminMoviesMenuMouseClicked

    private void adminUsersMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminUsersMenuMouseClicked
        Function.goToAdminUserScreen(UserID);
        this.setVisible(false);
    }//GEN-LAST:event_adminUsersMenuMouseClicked

    private void adminProfileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminProfileMenuMouseClicked
        Function.goToAdminUserScreen(UserID);
        this.setVisible(false);
    }//GEN-LAST:event_adminProfileMenuMouseClicked

    private void adminHelpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminHelpMenuMouseClicked
        Function.goToAdminHelpScreen(UserID);
        this.setVisible(false);
    }//GEN-LAST:event_adminHelpMenuMouseClicked

    private void adminExitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminExitMenuMouseClicked
        int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to exit?");
        if (choice == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_adminExitMenuMouseClicked

    private void s1m1ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s1m1ImageMouseClicked

    }//GEN-LAST:event_s1m1ImageMouseClicked

    private void s1SavechangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1SavechangesActionPerformed
        //Show 1
        try {
            show1m1Title = s1m1Title.getText();
            show1m1Year = s1m1Year.getText();
            show1m1Description = s1m1Description.getText();
            show1m1Length = Integer.parseInt(s1m1Length.getText());

            show1m2Title = s1m2Title.getText();
            show1m2Year = s1m2Year.getText();
            show1m2Description = s1m2Description.getText();
            show1m2Length = Integer.parseInt(s1m2Length.getText());

            show1m3Title = s1m3Title.getText();
            show1m3Year = s1m3Year.getText();
            show1m3Description = s1m3Description.getText();
            show1m3Length = Integer.parseInt(s1m3Length.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Enter The Length in minutes", "Length Format Error", JOptionPane.ERROR_MESSAGE);
        }

        try {
            Class.forName(jdbcDriver);
            c = new Function().getConnection();

            // the mysql insert statement
            String query = " UPDATE Movie set Title = ?, Year = ?, Length = ?, Description = ? WHERE MovieID = ?";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = c.prepareStatement(query);

            preparedStmt.setString(1, show1m1Title);
            preparedStmt.setString(2, show1m1Year);
            preparedStmt.setInt(3, show1m1Length);
            preparedStmt.setString(4, show1m1Description);
            preparedStmt.setInt(5, 1);
            // execute the preparedstatement
            preparedStmt.execute();

            //Update Movie 2
            String query2 = " UPDATE Movie SET Title = ?, Year = ?, Length = ?, Description = ? WHERE MovieID = ?";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt2 = c.prepareStatement(query);
            preparedStmt2.setString(1, show1m2Title);
            preparedStmt2.setString(2, show1m2Year);
            preparedStmt2.setInt(3, show1m2Length);
            preparedStmt2.setString(4, show1m2Description);
            preparedStmt2.setInt(5, 2);
            // execute the preparedstatement
            preparedStmt2.execute();

            //Update Movie 3
            String query3 = " UPDATE Movie set Title = ?, Year = ?, Length = ?, Description = ? WHERE MovieID = ?";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt3 = c.prepareStatement(query);
            preparedStmt3.setString(1, show1m3Title);
            preparedStmt3.setString(2, show1m3Year);
            preparedStmt3.setInt(3, show1m3Length);
            preparedStmt3.setString(4, show1m3Description);
            //preparedStmt.setDouble(5, 97.00);
            preparedStmt3.setInt(5, 3);
            // execute the preparedstatement
            preparedStmt3.execute();

            JOptionPane.showMessageDialog(rootPane, "Movie Changes Saved Successfully");

            c.close();

        } catch (ClassNotFoundException exp) {
            System.err.println("Could not load the JDBC driver " + jdbcDriver);
            return;
        } catch (SQLException ex) {
            Logger.getLogger(AdminMoviesScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_s1SavechangesActionPerformed

    private void s2SaveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2SaveChangesButtonActionPerformed
        //Show 2
        try {
            show2m1Title = s2m1Title.getText();
            show2m1Year = s2m1Year.getText();
            show2m1Description = s2m1Description.getText();
            show2m1Length = Integer.parseInt(s2m1Length.getText());

            show2m2Title = s2m2Title.getText();
            show2m2Year = s2m2Year.getText();
            show2m2Description = s2m2Description.getText();
            show2m2Length = Integer.parseInt(s2m2Length.getText());

            show2m3Title = s2m3Title.getText();
            show2m3Year = s2m3Year.getText();
            show2m3Description = s2m3Description.getText();
            show2m3Length = Integer.parseInt(s2m3Length.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Enter The Length in minutes", "Length Format Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            Class.forName(jdbcDriver);
            c = new Function().getConnection();

            // the mysql insert statement
            String query = " UPDATE Movie set Title = ?, Year = ?, Length = ?, Description = ?, Price = ? WHERE MovieID = ?";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = c.prepareStatement(query);
            preparedStmt.setString(1, show2m1Title);
            preparedStmt.setString(2, show2m1Year);
            preparedStmt.setInt(3, show2m1Length);
            preparedStmt.setString(4, show2m1Description);
            preparedStmt.setDouble(5, 97.00);
            preparedStmt.setInt(6, 4);
            // execute the preparedstatement
            preparedStmt.execute();

            //Update Movie 2
            String query2 = " UPDATE Movie set Title = ?, Year = ?, Length = ?, Description = ?, Price = ? WHERE MovieID = ?";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt2 = c.prepareStatement(query);
            preparedStmt2.setString(1, show2m2Title);
            preparedStmt2.setString(2, show2m2Year);
            preparedStmt2.setInt(3, show2m2Length);
            preparedStmt2.setString(4, show2m2Description);
            preparedStmt2.setDouble(5, 97.00);
            preparedStmt2.setInt(6, 5);
            // execute the preparedstatement
            preparedStmt2.execute();

            //Update Movie 3
            String query3 = " UPDATE Movie set Title = ?, Year = ?, Length = ?, Description = ?, Price = ? WHERE MovieID = ?";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt3 = c.prepareStatement(query);
            preparedStmt3.setString(1, show2m3Title);
            preparedStmt3.setString(2, show2m3Year);
            preparedStmt3.setInt(3, show2m3Length);
            preparedStmt3.setString(4, show2m3Description);
            preparedStmt3.setDouble(5, 97.00);
            preparedStmt3.setInt(6, 6);
            // execute the preparedstatement
            preparedStmt3.execute();

            JOptionPane.showMessageDialog(rootPane, "Movie Changes Saved Successfully");
            c.close();

        } catch (ClassNotFoundException exp) {
            System.err.println("Could not load the JDBC driver " + jdbcDriver);
            return;
        } catch (SQLException ex) {
            Logger.getLogger(AdminMoviesScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_s2SaveChangesButtonActionPerformed

    private void s3SaveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s3SaveChangesButtonActionPerformed
        //Show 3
        try {
            show3m1Title = s3m1Title.getText();
            show3m1Year = s3m1Year.getText();
            show3m1Description = s3m1Description.getText();
            show3m1Length = Integer.parseInt(s3m1Length.getText());

            show3m2Title = s3m2Title.getText();
            show3m2Year = s3m2Year.getText();
            show3m2Description = s3m2Description.getText();
            show3m2Length = Integer.parseInt(s3m2Length.getText());

            show3m3Title = s3m3Title.getText();
            show3m3Year = s3m3Year.getText();
            show3m3Description = s3m3Description.getText();
            show3m3Length = Integer.parseInt(s3m3Length.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Enter The Length in minutes", "Length Format Error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            Class.forName(jdbcDriver);
            c = DriverManager.getConnection("jdbc:mysql://localhost:8889/MovieDay", dbUserID, dbPassword);

            // the mysql insert statement
            String query = " UPDATE Movie set Title = ?, Year = ?, Length = ?, Description = ?, Price = ? WHERE MovieID = ?";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = c.prepareStatement(query);
            preparedStmt.setString(1, show3m1Title);
            preparedStmt.setString(2, show3m1Year);
            preparedStmt.setInt(3, show3m1Length);
            preparedStmt.setString(4, show3m1Description);
            preparedStmt.setDouble(5, 97.00);
            preparedStmt.setInt(6, 7);
            // execute the preparedstatement
            preparedStmt.execute();

            //Update Movie 2
            String query2 = " UPDATE Movie set Title = ?, Year = ?, Length = ?, Description = ?, Price = ? WHERE MovieID = ?";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt2 = c.prepareStatement(query);
            preparedStmt2.setString(1, show3m2Title);
            preparedStmt2.setString(2, show3m2Year);
            preparedStmt2.setInt(3, show3m2Length);
            preparedStmt2.setString(4, show3m2Description);
            preparedStmt2.setDouble(5, 97.00);
            preparedStmt2.setInt(6, 8);
            // execute the preparedstatement
            preparedStmt2.execute();

            //Update Movie 3
            String query3 = " UPDATE Movie set Title = ?, Year = ?, Length = ?, Description = ?, Price = ? WHERE MovieID = ?";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt3 = c.prepareStatement(query);
            preparedStmt3.setString(1, show3m3Title);
            preparedStmt3.setString(2, show3m3Year);
            preparedStmt3.setInt(3, show3m3Length);
            preparedStmt3.setString(4, show3m3Description);
            preparedStmt3.setDouble(5, 97.00);
            preparedStmt3.setInt(6, 9);
            // execute the preparedstatement
            preparedStmt3.execute();

            JOptionPane.showMessageDialog(rootPane, "Movie Changes Saved Successfully");
            c.close();

        } catch (ClassNotFoundException exp) {
            System.err.println("Could not load the JDBC driver " + jdbcDriver);
            return;
        } catch (SQLException ex) {
            Logger.getLogger(AdminMoviesScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_s3SaveChangesButtonActionPerformed

    private void btnSearchReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchReservationActionPerformed
        String email = emailTxt.getText();
        // the mysql insert statement
        String query = "SELECT r.ReservationID AS `Reservation ID`,\n"
                + "u.Email AS `Email`,\n"
                + "m.Title AS `Movie`,\n"
                + "ms.ShowID AS `Show`\n"
                + "FROM Reservation r\n"
                + "LEFT JOIN Movie m\n"
                + "ON m.MovieID = r.MovieID\n"
                + "LEFT JOIN `User` u\n"
                + "ON u.UserID = r.UserID\n"
                + "LEFT JOIN MovieShow ms\n"
                + "ON ms.ShowID = r.ShowID\n"
                + "WHERE u.Email = ?";

        //Repopulate Reservations Table
        PreparedStatement statement;
        try {
            statement = c.prepareStatement(query);
            statement.setString(1, email);
            res = statement.executeQuery();
            // It creates and displays the table
            model = funct.buildTableModel(res);
            reservationsTable.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(AdminMoviesScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSearchReservationActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        //Populate Reservations Table
        PreparedStatement statement;
        try {
            statement = c.prepareStatement("SELECT r.ReservationID AS `Reservation ID`,\n"
                    + "u.Email AS `Email`,\n"
                    + "m.Title AS `Movie`,\n"
                    + "ms.ShowID AS `Show`\n"
                    + "FROM Reservation r\n"
                    + "LEFT JOIN Seat s\n"
                    + "ON s.SeatID = r.SeatID\n"
                    + "LEFT JOIN Movie m\n"
                    + "ON m.MovieID = r.MovieID\n"
                    + "LEFT JOIN `User` u\n"
                    + "ON u.UserID = r.UserID\n"
                    + "LEFT JOIN MovieShow ms\n"
                    + "ON ms.ShowID = r.ShowID\n"
                    + "GROUP BY r.ReservationID\n");
            res = statement.executeQuery();
            meta = res.getMetaData();
            // It creates and displays the table
            model = funct.buildTableModel(res);
            reservationsTable.setModel(model);
            // Closes the Connection
        } catch (SQLException ex) {
            Logger.getLogger(AdminMoviesScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnClearAllActionPerformed

    private void adminLogoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLogoutMenuMouseClicked
        new Screen1Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adminLogoutMenuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminMoviesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMoviesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMoviesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMoviesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMoviesScreen(UserID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminExitMenu;
    private javax.swing.JMenu adminHelpMenu;
    private javax.swing.JMenu adminHomeMenu;
    private javax.swing.JMenu adminLogoutMenu;
    private javax.swing.JMenu adminMoviesMenu;
    private javax.swing.JMenu adminProfileMenu;
    private javax.swing.JMenu adminReportsMenu;
    private javax.swing.JMenu adminUsersMenu;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnDeleteReservation;
    private javax.swing.JButton btnSearchReservation;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel manageReservations;
    private javax.swing.JTable reservationsTable;
    private javax.swing.JButton s1Savechanges;
    private javax.swing.JTextArea s1m1Description;
    private javax.swing.JLabel s1m1Image;
    private javax.swing.JTextField s1m1Length;
    private javax.swing.JTextField s1m1Title;
    private javax.swing.JTextField s1m1Year;
    private javax.swing.JTextArea s1m2Description;
    private javax.swing.JLabel s1m2Image;
    private javax.swing.JTextField s1m2Length;
    private javax.swing.JTextField s1m2Title;
    private javax.swing.JTextField s1m2Year;
    private javax.swing.JTextArea s1m3Description;
    private javax.swing.JLabel s1m3Image;
    private javax.swing.JTextField s1m3Length;
    private javax.swing.JTextField s1m3Title;
    private javax.swing.JTextField s1m3Year;
    private javax.swing.JButton s2SaveChangesButton;
    private javax.swing.JTextArea s2m1Description;
    private javax.swing.JTextField s2m1Length;
    private javax.swing.JTextField s2m1Title;
    private javax.swing.JTextField s2m1Year;
    private javax.swing.JTextArea s2m2Description;
    private javax.swing.JTextField s2m2Length;
    private javax.swing.JTextField s2m2Title;
    private javax.swing.JTextField s2m2Year;
    private javax.swing.JTextArea s2m3Description;
    private javax.swing.JTextField s2m3Length;
    private javax.swing.JTextField s2m3Title;
    private javax.swing.JTextField s2m3Year;
    private javax.swing.JButton s3SaveChangesButton;
    private javax.swing.JTextArea s3m1Description;
    private javax.swing.JTextField s3m1Length;
    private javax.swing.JTextField s3m1Title;
    private javax.swing.JTextField s3m1Year;
    private javax.swing.JTextArea s3m2Description;
    private javax.swing.JTextField s3m2Length;
    private javax.swing.JTextField s3m2Title;
    private javax.swing.JTextField s3m2Year;
    private javax.swing.JTextArea s3m3Description;
    private javax.swing.JTextField s3m3Length;
    private javax.swing.JTextField s3m3Title;
    private javax.swing.JTextField s3m3Year;
    private javax.swing.JPanel show1;
    private javax.swing.JPanel show2;
    private javax.swing.JPanel show3;
    // End of variables declaration//GEN-END:variables
}
