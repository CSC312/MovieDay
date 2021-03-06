package UserPages;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import movieday.Function;

public class Screen4_MovieReservations extends javax.swing.JFrame {

    static int UserID;
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

    public Screen4_MovieReservations(int usrID) {

        initComponents();
        this.setLocationRelativeTo(null);
        UserID = usrID;
        btnReservation.setBackground(Color.BLUE);
        btnExit.setBackground(Color.BLUE);

        btnReservation.setForeground(Color.white);
        btnExit.setForeground(Color.white);

        try {
            Class.forName(jdbcDriver);
            c = funct.getConnection();
            //Populate Movies Table
            PreparedStatement statement = c.prepareStatement("SELECT MovieID, Title, `Year`, `Length`, `Description`  FROM Movie;");
            res = statement.executeQuery();
            meta = res.getMetaData();
            // It creates and displays the table
            model = Function.buildTableModel(res);
            tblMovies.setModel(model);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Oops. Something went wrong. Please contact the systems developer.");
            System.out.println("Screen 4 Error: " + ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovies = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescription = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnReservation = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        tblMovies.setBackground(new java.awt.Color(51, 102, 255));
        tblMovies.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblMovies.setForeground(new java.awt.Color(255, 255, 255));
        tblMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Time(s)", "Genre(s)", "Year", "Length", "Price", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMovies.getTableHeader().setReorderingAllowed(false);
        tblMovies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMoviesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMovies);
        if (tblMovies.getColumnModel().getColumnCount() > 0) {
            tblMovies.getColumnModel().getColumn(0).setResizable(false);
            tblMovies.getColumnModel().getColumn(1).setResizable(false);
            tblMovies.getColumnModel().getColumn(2).setResizable(false);
            tblMovies.getColumnModel().getColumn(3).setResizable(false);
            tblMovies.getColumnModel().getColumn(4).setResizable(false);
            tblMovies.getColumnModel().getColumn(5).setResizable(false);
            tblMovies.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 780, 165);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 20, 810, 210);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movie Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        txaDescription.setEditable(false);
        txaDescription.setBackground(new java.awt.Color(0, 0, 0));
        txaDescription.setColumns(20);
        txaDescription.setForeground(new java.awt.Color(255, 255, 255));
        txaDescription.setRows(5);
        jScrollPane2.setViewportView(txaDescription);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 560, 99);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 240, 600, 150);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(null);

        btnExit.setBackground(new java.awt.Color(51, 102, 255));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.setToolTipText("Exit the program");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel4.add(btnExit);
        btnExit.setBounds(670, 300, 140, 40);

        btnReservation.setBackground(new java.awt.Color(51, 102, 255));
        btnReservation.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnReservation.setForeground(new java.awt.Color(255, 255, 255));
        btnReservation.setText("Make Reservation");
        btnReservation.setToolTipText("Make reservation for the selected movies");
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });
        jPanel4.add(btnReservation);
        btnReservation.setBounds(670, 250, 140, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 840, 430);

        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("View Reservations");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

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

        jMenu2.setText("Help");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem5.setText("Help");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);
        jMenu2.add(jSeparator2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
        int row = tblMovies.getSelectedRow();
        int selectedMovieID = Integer.parseInt(model.getValueAt(row, 0).toString());
        int selectedSelectedShowID = 0;
       
        try {
            switch (selectedMovieID) {
                case 1:
                case 2:
                case 3:
                    selectedSelectedShowID = 1;
                    break;
                case 4:
                case 5:
                case 6:
                    selectedSelectedShowID = 2;
                    break;
                default:
                    selectedSelectedShowID = 3;
                    break;
            }
            new Screen5Reservation(UserID, selectedMovieID, selectedSelectedShowID, model.getValueAt(row, 1).toString()).setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnReservationActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        new AboutScreen().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Screen1Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Screen7_1UsersMovies(UserID).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tblMoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMoviesMouseClicked
        int row = tblMovies.getSelectedRow();
        txaDescription.setText(model.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblMoviesMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new HelpScreen().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(Screen4_MovieReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen4_MovieReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen4_MovieReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen4_MovieReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen4_MovieReservations(UserID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReservation;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JTable tblMovies;
    private javax.swing.JTextArea txaDescription;
    // End of variables declaration//GEN-END:variables
}
