package UserPages;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import movieday.Function;

public class Screen5Reservation extends javax.swing.JFrame {

    int seatsBooked = 0;
    int price = 0;
    static int UserID;
    static int movieID;
    static int showID;
    static String movieName;

    //Databases Variables
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost:8889/MovieDay";
    String dbUserID = "root";
    String dbPassword = "root";

    ResultSet res;
    Connection c;
    ResultSetMetaData meta;
    DefaultTableModel model;

    Function funct = new Function();

    public Screen5Reservation(int usrID, int mID, int sID, String mName) {
        initComponents();
        this.setLocationRelativeTo(null);
        UserID = usrID;
        btnClear.setBackground(Color.blue);
        btnReserveSeats.setBackground(Color.blue);
        btnBack.setBackground(Color.blue);
        btnClear.setForeground(Color.white);
        btnReserveSeats.setForeground(Color.white);
        btnBack.setForeground(Color.white);
        movieID = mID;
        showID = sID;
        movieName = mName;
        //Disable Reserved Seats
        try {

            Class.forName(jdbcDriver);
            c = funct.getConnection();
            String query = "SELECT r.SeatID\n"
                    + "FROM Reservation r\n"
                    + "Left Join Seat s\n"
                    + "On s.SeatID = r.SeatID\n"
                    + "Where r.ShowID = "
                    + showID
                    + " AND r.MovieID = "
                    + movieID
                    + " \n"
                    + "GROUP BY r.ReservationID";

            PreparedStatement stmt = c.prepareStatement(query);
            res = stmt.executeQuery(query);

            while (res.next()) {
                reserveSeat(res.getInt("SeatID"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Screen5Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void reserveSeat(int seatID) {
        switch (seatID) {
            case 1:
                btnA1.setEnabled(false);
                btnA1.setBackground(Color.red);
                break;
            case 2:
                btnA2.setEnabled(false);
                btnA2.setBackground(Color.red);
                break;
            case 3:
                btnA3.setEnabled(false);
                btnA3.setBackground(Color.red);
                break;
            case 4:
                btnA4.setEnabled(false);
                btnA4.setBackground(Color.red);
                break;
            case 5:
                btnA5.setEnabled(false);
                btnA5.setBackground(Color.red);
                break;
            case 6:
                btnB1.setEnabled(false);
                btnB1.setBackground(Color.red);
                break;
            case 7:
                btnB2.setEnabled(false);
                btnB2.setBackground(Color.red);
                break;
            case 8:
                btnB3.setEnabled(false);
                btnB3.setBackground(Color.red);
                break;
            case 9:
                btnB4.setEnabled(false);
                btnB4.setBackground(Color.red);
                break;
            case 10:
                btnB5.setEnabled(false);
                btnB5.setBackground(Color.red);
                break;
            case 11:
                btnC1.setEnabled(false);
                btnC1.setBackground(Color.red);
                break;
            case 12:
                btnC2.setEnabled(false);
                btnC2.setBackground(Color.red);
                break;
            case 13:
                btnC3.setEnabled(false);
                btnC3.setBackground(Color.red);
                break;
            case 14:
                btnC4.setEnabled(false);
                btnC4.setBackground(Color.red);
                break;
            case 15:
                btnC5.setEnabled(false);
                btnC5.setBackground(Color.red);
                break;
            case 16:
                btnD1.setEnabled(false);
                btnD1.setBackground(Color.red);
                break;
            case 17:
                btnD2.setEnabled(false);
                btnD2.setBackground(Color.red);
                break;
            case 18:
                btnD3.setEnabled(false);
                btnD3.setBackground(Color.red);
                break;
            case 19:
                btnD4.setEnabled(false);
                btnD4.setBackground(Color.red);
                break;
            case 20:
                btnD5.setEnabled(false);
                btnD5.setBackground(Color.red);
                break;
            case 21:
                btnE1.setEnabled(false);
                btnE1.setBackground(Color.red);
                break;
            case 22:
                btnE2.setEnabled(false);
                btnE2.setBackground(Color.red);
                break;
            case 23:
                btnE3.setEnabled(false);
                btnE3.setBackground(Color.red);
                break;
            case 24:
                btnE4.setEnabled(false);
                btnE4.setBackground(Color.red);
                break;
            case 25:
                btnE5.setEnabled(false);
                btnE5.setBackground(Color.red);
        }
    }

    public int getSeatID(String seatName) {
        int seat = 0;
        switch (seatName) {
            case "A1":
                seat = 1;
                break;
            case "A2":
                seat = 2;
                break;
            case "A3":
                seat = 3;
                break;
            case "A4":
                seat = 4;
                break;
            case "A5":
                seat = 5;
                break;
            case "B1":
                seat = 6;
                break;
            case "B2":
                seat = 7;
                break;
            case "B3":
                seat = 8;
                break;
            case "44":
                seat = 9;
                break;
            case "B5":
                seat = 10;
                break;
            case "C1":
                seat = 11;
                break;
            case "C2":
                seat = 12;
                break;
            case "C3":
                seat = 13;
                break;
            case "C4":
                seat = 14;
                break;
            case "C5":
                seat = 15;
                break;
            case "D1":
                seat = 16;
                break;
            case "D2":
                seat = 17;
                break;
            case "D3":
                seat = 18;
                break;
            case "D4":
                seat = 19;
                break;
            case "D5":
                seat = 20;
                break;
            case "E1":
                seat = 21;
                break;
            case "E2":
                seat = 22;
                break;
            case "E3":
                seat = 23;
                break;
            case "E4":
                seat = 24;
                break;
            case "E5":
                seat = 25;
        }
        return seat;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnA1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnD1 = new javax.swing.JButton();
        btnD2 = new javax.swing.JButton();
        btnD3 = new javax.swing.JButton();
        btnD4 = new javax.swing.JButton();
        btnD5 = new javax.swing.JButton();
        btnE1 = new javax.swing.JButton();
        btnE2 = new javax.swing.JButton();
        btnE3 = new javax.swing.JButton();
        btnE4 = new javax.swing.JButton();
        btnE5 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblUserSeats = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnReserveSeats = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblPrice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuReserve = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(607, 402));
        setMinimumSize(new java.awt.Dimension(607, 402));
        setName("Seating Arrangement"); // NOI18N
        setPreferredSize(new java.awt.Dimension(607, 402));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seating Arrangement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        btnA1.setText("A1");
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnA1);
        btnA1.setBounds(60, 70, 75, 29);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("====MOVIE SCREEN====");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 20, 333, 16);

        btnA2.setText("A2");
        btnA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnA2);
        btnA2.setBounds(120, 70, 75, 29);

        btnA3.setText("A3");
        btnA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnA3);
        btnA3.setBounds(180, 70, 75, 29);

        btnA4.setText("A4");
        btnA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnA4);
        btnA4.setBounds(240, 70, 75, 29);

        btnA5.setText("A5");
        btnA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnA5);
        btnA5.setBounds(300, 70, 75, 29);

        btnB1.setText("B1");
        btnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnB1);
        btnB1.setBounds(60, 110, 75, 29);

        btnB2.setText("B2");
        btnB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnB2);
        btnB2.setBounds(120, 110, 75, 29);

        btnB3.setText("B3");
        btnB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnB3);
        btnB3.setBounds(180, 110, 75, 29);

        btnB4.setText("B4");
        btnB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnB4);
        btnB4.setBounds(240, 110, 75, 29);

        btnB5.setText("B5");
        btnB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnB5);
        btnB5.setBounds(300, 110, 75, 29);

        btnC1.setText("C1");
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC1);
        btnC1.setBounds(60, 160, 75, 29);

        btnC2.setText("C2");
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC2);
        btnC2.setBounds(120, 160, 75, 29);

        btnC3.setText("C3");
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC3);
        btnC3.setBounds(180, 160, 75, 29);

        btnC4.setText("C4");
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC4);
        btnC4.setBounds(240, 160, 75, 29);

        btnC5.setText("C5");
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnC5);
        btnC5.setBounds(300, 160, 75, 29);

        btnD1.setText("D1");
        btnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnD1);
        btnD1.setBounds(60, 200, 75, 29);

        btnD2.setText("D2");
        btnD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnD2);
        btnD2.setBounds(120, 200, 75, 29);

        btnD3.setText("D3");
        btnD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnD3);
        btnD3.setBounds(180, 200, 75, 29);

        btnD4.setText("D4");
        btnD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnD4);
        btnD4.setBounds(240, 200, 75, 29);

        btnD5.setText("D5");
        btnD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnD5);
        btnD5.setBounds(300, 200, 75, 29);

        btnE1.setText("E1");
        btnE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnE1);
        btnE1.setBounds(60, 250, 75, 29);

        btnE2.setText("E2");
        btnE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnE2);
        btnE2.setBounds(120, 250, 75, 29);

        btnE3.setText("E3");
        btnE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnE3);
        btnE3.setBounds(180, 250, 75, 29);

        btnE4.setText("E4");
        btnE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnE4);
        btnE4.setBounds(240, 250, 75, 29);

        btnE5.setText("E5");
        btnE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnE5);
        btnE5.setBounds(300, 250, 75, 29);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(17, 50, 333, 10);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("R80");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 100, 30, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("R70");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 190, 30, 16);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("R60");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(17, 255, 30, 16);
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(17, 148, 333, 10);
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(17, 234, 333, 10);

        lblUserSeats.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblUserSeats);
        lblUserSeats.setBounds(17, 295, 350, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 380, 330);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(null);

        btnReserveSeats.setBackground(new java.awt.Color(51, 102, 255));
        btnReserveSeats.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnReserveSeats.setForeground(new java.awt.Color(255, 255, 255));
        btnReserveSeats.setText("Reserve seats");
        btnReserveSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveSeatsActionPerformed(evt);
            }
        });
        jPanel4.add(btnReserveSeats);
        btnReserveSeats.setBounds(20, 90, 150, 40);

        btnClear.setBackground(new java.awt.Color(51, 102, 255));
        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel4.add(btnClear);
        btnClear.setBounds(20, 140, 70, 29);

        btnBack.setBackground(new java.awt.Color(51, 102, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack);
        btnBack.setBounds(100, 140, 70, 29);

        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setText("Price: R");
        jPanel4.add(lblPrice);
        lblPrice.setBounds(17, 29, 150, 16);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(400, 20, 190, 200);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 620, 390);

        jMenu1.setText("Menu");

        mnuReserve.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuReserve.setText("View Reservations");
        mnuReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReserveActionPerformed(evt);
            }
        });
        jMenu1.add(mnuReserve);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Log out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuExit);
        jMenu1.add(jSeparator3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help & About");

        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("FAQ");
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new Screen4_MovieReservations(UserID).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReserveSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveSeatsActionPerformed
        if (seatsBooked == 0) {
            JOptionPane.showMessageDialog(rootPane, "You need to select at least 1 seat");
        } else {

            String seatsList = lblUserSeats.getText().substring(12);
            String seatsArray[] = seatsList.split(",");
            int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to reserve these seats?");
            if (choice == 0) {
                for (int i = 0; i < seatsArray.length; i++) {
                    int SeatID = getSeatID(seatsArray[i].trim());
                    //Add Reservation to DB using UserID, MovieID, ShowID, SeatID
                    /*
            System.out.println("UserID = " + UserID + "\n"
                    + "MovieID " + movieID + "\n"
                    + "ShowID " + showID + "\n"
                    + "SeatID " + SeatID+"\n"
                    + ""+seatsArray[i]);
                     */

                    try {
                        //Database Operations
                        Class.forName(jdbcDriver);
                        c = new Function().getConnection();

                        // the mysql insert statement
                        String query = "INSERT INTO Reservation set UserID = ?, SeatID = ?, ShowID = ?, MovieID = ?";
                        // create the mysql insert preparedstatement
                        PreparedStatement preparedStmt = c.prepareStatement(query);

                        preparedStmt.setInt(1, UserID);
                        preparedStmt.setInt(2, SeatID);
                        preparedStmt.setInt(3, showID);
                        preparedStmt.setInt(4, movieID);
                        // execute the preparedstatement

                        preparedStmt.execute();

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(rootPane, "Something went wrong when trying to reserve your seats!");
                    }
                }
                //String price = lblPrice.getText();
                String time = "";
                switch (showID) {
                    case 1:
                        time = "15:00";
                        break;
                    case 2:
                        time = "17:00";
                        break;
                    case 3:
                        time = "19:00";
                }
                JOptionPane.showMessageDialog(rootPane, "Seats reserved successfully.\n"
                        + "Movie: " + movieName
                        + "Time: " + time + "\n"
                        + "Seats: " + lblUserSeats.getText() + "\n"
                        + "Total Amount: " + price);
                new Screen6Payment(price, seatsList).setVisible(true);
                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Cancelled");
            }
        }

    }//GEN-LAST:event_btnReserveSeatsActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        //call method getSeats()
        lblUserSeats.setText("Your seats: ");
        lblPrice.setText("Price: R");
        seatsBooked = 0;
        price = 0;
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("A1")) {

            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " A1");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", A1");
            }
            seatsBooked++;
            price += 80;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA2ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("A2")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " A2");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", A2");
            }
            seatsBooked++;
            price += 80;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnA2ActionPerformed

    private void btnA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA3ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("A3")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " A3");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", A3");
            }
            seatsBooked++;
            price += 80;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnA3ActionPerformed

    private void btnA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA4ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("A4")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " A4");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", A4");
            }
            seatsBooked++;
            price += 80;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnA4ActionPerformed

    private void btnA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA5ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("A5")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " A5");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", A5");
            }
            seatsBooked++;
            price += 80;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnA5ActionPerformed

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("B1")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " B1");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", B1");
            }
            seatsBooked++;
            price += 80;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnB1ActionPerformed

    private void btnB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB2ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("B2")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " B2");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", B2");
            }
            seatsBooked++;
            price += 80;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnB2ActionPerformed

    private void btnB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB3ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("B3")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " B3");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", B3");
            }
            seatsBooked++;
            price += 80;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnB3ActionPerformed

    private void btnB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB4ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("B4")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " B4");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", B4");
            }
            seatsBooked++;
            price += 80;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnB4ActionPerformed

    private void btnB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB5ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("B5")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " B5");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", B5");
            }
            seatsBooked++;
            price += 80;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnB5ActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("C1")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " C1");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", C1");
            }
            seatsBooked++;
            price += 70;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("C2")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " C2");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", C2");
            }
            seatsBooked++;
            price += 70;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("C3")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " C3");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", C3");
            }
            seatsBooked++;
            price += 70;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("C4")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " C4");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", C4");
            }
            seatsBooked++;
            price += 70;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("C5")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " C5");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", C5");
            }
            seatsBooked++;
            price += 70;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("D1")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " D1");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", D1");
            }
            seatsBooked++;
            price += 70;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnD1ActionPerformed

    private void btnD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD2ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("D2")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " D2");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", D2");
            }
            seatsBooked++;
            price += 70;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnD2ActionPerformed

    private void btnD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD3ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("D3")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " D3");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", D3");
            }
            seatsBooked++;
            price += 70;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnD3ActionPerformed

    private void btnD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD4ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("D4")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " D4");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", D4");
            }
            seatsBooked++;
            price += 70;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnD4ActionPerformed

    private void btnD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD5ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("D5")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " D5");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", D5");
            }
            seatsBooked++;
            price += 70;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnD5ActionPerformed

    private void btnE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE2ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("E2")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " E2");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", E2");
            }
            seatsBooked++;
            price += 60;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnE2ActionPerformed

    private void btnE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE3ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("E3")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " E3");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", E3");
            }
            seatsBooked++;
            price += 60;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnE3ActionPerformed

    private void btnE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE4ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("E4")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " E4");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", E4");
            }
            seatsBooked++;
            price += 60;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnE4ActionPerformed

    private void btnE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE5ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("E5")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " E5");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", E5");
            }
            seatsBooked++;
            price += 60;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnE5ActionPerformed

    private void btnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE1ActionPerformed
        if (seatsBooked > 9) {
            JOptionPane.showMessageDialog(rootPane, "You can only book a maximum of 10 seats", "Maximum amount of seats", JOptionPane.INFORMATION_MESSAGE);
        } else if (!lblUserSeats.getText().contains("E1")) {
            if (seatsBooked == 0) {
                lblUserSeats.setText(lblUserSeats.getText() + " E1");
            } else {
                lblUserSeats.setText(lblUserSeats.getText() + ", E1");
            }
            seatsBooked++;
            price += 60;
            lblPrice.setText("Price: R" + price);
        }
    }//GEN-LAST:event_btnE1ActionPerformed

    private void mnuReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReserveActionPerformed
        new Screen7_1UsersMovies().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuReserveActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Screen1Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Screen5Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen5Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen5Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen5Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen5Reservation(UserID, movieID, showID, movieName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnA3;
    private javax.swing.JButton btnA4;
    private javax.swing.JButton btnA5;
    private javax.swing.JButton btnB1;
    private javax.swing.JButton btnB2;
    private javax.swing.JButton btnB3;
    private javax.swing.JButton btnB4;
    private javax.swing.JButton btnB5;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnD1;
    private javax.swing.JButton btnD2;
    private javax.swing.JButton btnD3;
    private javax.swing.JButton btnD4;
    private javax.swing.JButton btnD5;
    private javax.swing.JButton btnE1;
    private javax.swing.JButton btnE2;
    private javax.swing.JButton btnE3;
    private javax.swing.JButton btnE4;
    private javax.swing.JButton btnE5;
    private javax.swing.JButton btnReserveSeats;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblUserSeats;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuReserve;
    // End of variables declaration//GEN-END:variables
}
