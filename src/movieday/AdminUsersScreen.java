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
public class AdminUsersScreen extends javax.swing.JFrame {

    /**
     * Creates new form AdminUsersScreen
     */
    public AdminUsersScreen() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        adminHomeMenu = new javax.swing.JMenu();
        adminReportsMenu = new javax.swing.JMenu();
        adminMoviesMenu = new javax.swing.JMenu();
        adminUsersMenu = new javax.swing.JMenu();
        adminProfileMenu = new javax.swing.JMenu();
        adminExitMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 960, 725));
        setMinimumSize(new java.awt.Dimension(960, 725));
        setResizable(false);
        setSize(new java.awt.Dimension(960, 725));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setText("My Profile");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 30, 100, 30);

        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 70, 20);

        jLabel3.setText("First Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 70, 70, 20);

        jLabel4.setText("D.O.B");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 150, 60, 20);

        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 190, 70, 20);

        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 230, 110, 30);

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setToolTipText("Enter a password");
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(130, 230, 160, 30);

        jTextField1.setText("mail@mailman.com");
        jTextField1.setToolTipText("Enter mail account");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(130, 190, 160, 30);

        jTextField2.setText("John");
        jTextField2.setToolTipText("Enter name");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(130, 70, 160, 30);

        jTextField3.setText("12/12/2012");
        jTextField3.setToolTipText("Enter date of birth");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(130, 150, 160, 30);

        jTextField4.setText("Doe");
        jTextField4.setToolTipText("Enter surname");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(130, 110, 160, 30);

        jLabel7.setText("Registered Users");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 340, 200, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Kamo", "Matjila", "F", "1996", "kamo@uwc.ac.za", "1234", "IDK"},
                {"Sive", "Mbiza", "M", "1996", "sive@yahoo.com", "1243", "IDK"},
                {"", null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Surname", "Sex", "D.O.B", "Email", "Password", "Security Question Answer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(20, 390, 680, 270);

        jButton1.setText("Save Details");
        jButton1.setToolTipText("Save Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 280, 160, 40);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 950, 690);

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

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         System.out.println("Menu Clicked"); 
        new AdminHome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void adminHomeMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminHomeMenuMouseClicked
        Function.goToAdminHome();
        this.setVisible(false);
    }//GEN-LAST:event_adminHomeMenuMouseClicked

    private void adminReportsMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminReportsMenuMouseClicked
        Function.goToReportScreen();
        this.setVisible(false);
    }//GEN-LAST:event_adminReportsMenuMouseClicked

    private void adminMoviesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMoviesMenuMouseClicked
        Function.goToAdminMoviesScreen();
        this.setVisible(false);
    }//GEN-LAST:event_adminMoviesMenuMouseClicked

    private void adminUsersMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminUsersMenuMouseClicked
        Function.goToAdminUserScreen();
        this.setVisible(false);
    }//GEN-LAST:event_adminUsersMenuMouseClicked

    private void adminProfileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminProfileMenuMouseClicked
        Function.goToAdminUserScreen();
        this.setVisible(false);
    }//GEN-LAST:event_adminProfileMenuMouseClicked

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
            java.util.logging.Logger.getLogger(AdminUsersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUsersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUsersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUsersScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUsersScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminExitMenu;
    private javax.swing.JMenu adminHomeMenu;
    private javax.swing.JMenu adminMoviesMenu;
    private javax.swing.JMenu adminProfileMenu;
    private javax.swing.JMenu adminReportsMenu;
    private javax.swing.JMenu adminUsersMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
