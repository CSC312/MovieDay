/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieday;

import UserPages.Screen1Home;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author johnclaude
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     *
     * @param UserID
     */
    //Databases Variables
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost:8889/MovieDay";
    String dbUserID = "root";
    String dbPassword = "root";

    ResultSet res;
    Connection c;

    static int UserID;
    static String AdminName = "";

    int totalSeatsBooked = 0;
    int totalSeatsCancelled = 0;
    int totalProfit = 0;

    public AdminHome(int UsrID) {
        initComponents();
        this.setLocationRelativeTo(null);
        UserID = UsrID;

        try {
            Class.forName(jdbcDriver);
            c = new Function().getConnection();

            String query = "SELECT * FROM `Admin` WHERE UserID = " + UserID;
            PreparedStatement preparedStmt = c.prepareStatement(query);
            ResultSet rs = preparedStmt.executeQuery(query);

            while (rs.next()) {
                AdminName = rs.getString("Name");
            }

            //Get Summary values
            String query2 = "SELECT count(r.SeatID) AS `Count`\n"
                    + "FROM Reservation r\n"
                    + "Left Join Movie m\n"
                    + "on m.MovieID = r.MovieID\n"
                    + "left join Seat s\n"
                    + "on s.SeatID = r.SeatID\n"
                    + ";";
            PreparedStatement preparedStmt2 = c.prepareStatement(query2);
            ResultSet rs2 = preparedStmt2.executeQuery(query2);

            while (rs2.next()) {
                totalSeatsBooked += rs2.getInt("Count");
            }

            seatsBookedTxt.setText("" + totalSeatsBooked);

            String query3 = "SELECT sum(m.Cancelled) AS `Count`\n"
                    + "FROM Reservation r\n"
                    + "Left Join Movie m\n"
                    + "on m.MovieID = r.MovieID\n"
                    + "left join Seat s\n"
                    + "on s.SeatID = r.SeatID\n"
                    + ";";
            
            PreparedStatement preparedStmt3 = c.prepareStatement(query3);
            ResultSet rs3 = preparedStmt3.executeQuery(query3);

            while (rs3.next()) {
                totalSeatsCancelled += rs2.getInt("Count");
            }
            
            seatsCancelledTxt.setText(""+totalSeatsCancelled);
            
            TotalSalesTxt.setText(""+(totalSeatsBooked-totalSeatsCancelled)*93);

            //c.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminHome.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (AdminName.equals("")) {
        } else {
            lblWelcome.setText("Welcome " + AdminName + "!");
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

        jPanel1 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        TotalSalesTxt = new javax.swing.JTextField();
        seatsCancelledTxt = new javax.swing.JTextField();
        seatsBookedTxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        viewMoviesButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        viewUsersButton = new javax.swing.JButton();
        viewProfileButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        adminHomeMenu = new javax.swing.JMenu();
        adminReportsMenu = new javax.swing.JMenu();
        adminMoviesMenu = new javax.swing.JMenu();
        adminUsersMenu = new javax.swing.JMenu();
        adminProfileMenu = new javax.swing.JMenu();
        adminExitMenu = new javax.swing.JMenu();
        adminLogoutMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Home");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(null);

        lblWelcome.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        lblWelcome.setText("Welcome Admin!");
        jPanel1.add(lblWelcome);
        lblWelcome.setBounds(679, 40, 270, 30);

        jLabel2.setText("Current Show");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 60, 120, 20);

        jLabel6.setText("Current Summary");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 430, 130, 30);

        jLabel8.setText("Seats Booked");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 480, 100, 30);

        jLabel9.setText("Seats Cancelled");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 520, 120, 30);

        jLabel7.setText("Total Sales (In Rands)");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 570, 150, 30);

        jButton2.setText("View Reports");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(180, 610, 160, 40);

        TotalSalesTxt.setText("R1080");
        jPanel1.add(TotalSalesTxt);
        TotalSalesTxt.setBounds(180, 570, 160, 40);

        seatsCancelledTxt.setText("12");
        seatsCancelledTxt.setToolTipText("");
        jPanel1.add(seatsCancelledTxt);
        seatsCancelledTxt.setBounds(180, 520, 160, 40);

        seatsBookedTxt.setText("120");
        seatsBookedTxt.setToolTipText("Price of the seats booked");
        jPanel1.add(seatsBookedTxt);
        seatsBookedTxt.setBounds(180, 470, 160, 40);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        viewMoviesButton.setText("View Movies");
        viewMoviesButton.setToolTipText("");
        viewMoviesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMoviesButtonActionPerformed(evt);
            }
        });
        jPanel2.add(viewMoviesButton);
        viewMoviesButton.setBounds(100, 250, 140, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/m.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(70, 40, 200, 200);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/u.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(380, 40, 200, 200);

        viewUsersButton.setText("View Users");
        viewUsersButton.setToolTipText("");
        viewUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUsersButtonActionPerformed(evt);
            }
        });
        jPanel2.add(viewUsersButton);
        viewUsersButton.setBounds(410, 250, 140, 40);

        viewProfileButton.setText("View Profile");
        viewProfileButton.setToolTipText("");
        viewProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProfileButtonActionPerformed(evt);
            }
        });
        jPanel2.add(viewProfileButton);
        viewProfileButton.setBounds(710, 250, 140, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/movieday/images/u.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(680, 40, 200, 200);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 90, 970, 330);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 660));

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

    private void viewMoviesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMoviesButtonActionPerformed
        Function.goToAdminMoviesScreen(UserID);
        this.setVisible(false);
    }//GEN-LAST:event_viewMoviesButtonActionPerformed

    private void viewUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUsersButtonActionPerformed
        Function.goToAdminUserScreen(UserID);
        this.setVisible(false);
    }//GEN-LAST:event_viewUsersButtonActionPerformed

    private void viewProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProfileButtonActionPerformed
        Function.goToAdminUserScreen(UserID);
        this.setVisible(false);
    }//GEN-LAST:event_viewProfileButtonActionPerformed

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

    private void adminExitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminExitMenuMouseClicked
        int choice = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to exit?");
        if (choice == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_adminExitMenuMouseClicked

    private void adminLogoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLogoutMenuMouseClicked
        new Screen1Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_adminLogoutMenuMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Function.goToReportScreen(UserID);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminHome(UserID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TotalSalesTxt;
    private javax.swing.JMenu adminExitMenu;
    private javax.swing.JMenu adminHomeMenu;
    private javax.swing.JMenu adminLogoutMenu;
    private javax.swing.JMenu adminMoviesMenu;
    private javax.swing.JMenu adminProfileMenu;
    private javax.swing.JMenu adminReportsMenu;
    private javax.swing.JMenu adminUsersMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField seatsBookedTxt;
    private javax.swing.JTextField seatsCancelledTxt;
    private javax.swing.JButton viewMoviesButton;
    private javax.swing.JButton viewProfileButton;
    private javax.swing.JButton viewUsersButton;
    // End of variables declaration//GEN-END:variables
}
