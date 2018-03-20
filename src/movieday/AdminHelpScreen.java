/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieday;

import javax.swing.JOptionPane;

/**
 *
 * @author johnclaude
 */
public class AdminHelpScreen extends javax.swing.JFrame {

    /**
     * Creates new form AdminHelpScreen
     */
    public AdminHelpScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        adminHomeMenu = new javax.swing.JMenu();
        adminReportsMenu = new javax.swing.JMenu();
        adminMoviesMenu = new javax.swing.JMenu();
        adminUsersMenu = new javax.swing.JMenu();
        adminProfileMenu = new javax.swing.JMenu();
        adminHelpMenu = new javax.swing.JMenu();
        adminExitMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(950, 725));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("User Stories:\n\nAs an a administrator I need to be a able to log on to the system with my own credentials.\nAs as an administrator, I need to be able to the total number of users on the system and their details.\nAs an administrator I need to be able to view the total number of seats sold per show on the system.\nAs an admin I need to be able to view the total number of seats vacant per show.\nAs an admin, I need to be able to view the overall total number of seats sold and vacant for the whole day.\nAs an admin, I need to be able to CRUD Movies.\nAs an admin I need to be able to view the number of cancellations for the day.\n\nAs an admin, I want to be able to send notifications to the user.\n\nScreens for Admin:\n\n1. Home Screen\n2. Report Screen\n3. Movies Screen\n4. Users Screen\n5. Profile Screen\n\nEntities:\n\nUser  - UserID (PK), Name, Surname, Sex, DOB, Email, Password\nAdmin - UserID (PK), Name, Surname, Email, Password\nMovie - MovieID (PK), Title, Year, Length, Description\nSeat - SeatNumber (PK), Reservation status, VenueID\n\nVenue - VenueID, isFull\nReservations - ReservationID (PK), UserID (FK), Time, SeatNumber\n\nShow - ShowID (PK), MovieID (FK), Time\n\nNext Steps:\nAdd some methods to class\nList steps to follow based on Framework.\nDesign Layouts in Netbeans\nSet Up Github Accounts for Project");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 60, 930, 620);

        jLabel1.setText("Welcome To The Help Screen");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 240, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 730);

        adminHomeMenu.setText("Home");
        adminHomeMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminHomeMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(adminHomeMenu);

        adminReportsMenu.setText("Reports");
        adminReportsMenu.setToolTipText("");
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

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminHomeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminHomeMenuMouseClicked
        Function.goToAdminHome();
    }//GEN-LAST:event_adminHomeMenuMouseClicked

    private void adminReportsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminReportsMenuMouseClicked
        Function.goToReportScreen();
    }//GEN-LAST:event_adminReportsMenuMouseClicked

    private void adminMoviesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMoviesMenuMouseClicked
        Function.goToAdminMoviesScreen();
    }//GEN-LAST:event_adminMoviesMenuMouseClicked

    private void adminUsersMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminUsersMenuMouseClicked
        Function.goToAdminUserScreen();
    }//GEN-LAST:event_adminUsersMenuMouseClicked

    private void adminProfileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminProfileMenuMouseClicked
        Function.goToAdminUserScreen();
    }//GEN-LAST:event_adminProfileMenuMouseClicked

    private void adminHelpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminHelpMenuMouseClicked
        Function.goToAdminHelpScreen();
    }//GEN-LAST:event_adminHelpMenuMouseClicked

    private void adminExitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminExitMenuMouseClicked
        int choice  = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to exit?");
        if(choice == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_adminExitMenuMouseClicked

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
            java.util.logging.Logger.getLogger(AdminHelpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHelpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHelpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHelpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHelpScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminExitMenu;
    private javax.swing.JMenu adminHelpMenu;
    private javax.swing.JMenu adminHomeMenu;
    private javax.swing.JMenu adminMoviesMenu;
    private javax.swing.JMenu adminProfileMenu;
    private javax.swing.JMenu adminReportsMenu;
    private javax.swing.JMenu adminUsersMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}