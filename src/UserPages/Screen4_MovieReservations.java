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
        btnMovieName.setBackground(Color.BLUE);
        btnTime.setBackground(Color.BLUE);
        btnGenre.setBackground(Color.BLUE);
        btnReservation.setBackground(Color.BLUE);
        btnExit.setBackground(Color.BLUE);

        btnMovieName.setForeground(Color.white);
        btnReservation.setForeground(Color.white);
        btnTime.setForeground(Color.white);
        btnGenre.setForeground(Color.white);
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

        jPanel1 = new javax.swing.JPanel();
        btnMovieName = new javax.swing.JButton();
        btnTime = new javax.swing.JButton();
        btnGenre = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovies = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnReservation = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(830, 440));
        setMinimumSize(new java.awt.Dimension(830, 440));
        setPreferredSize(new java.awt.Dimension(830, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sort By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        btnMovieName.setText("Movie name (A-z)");
        btnMovieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovieNameActionPerformed(evt);
            }
        });
        jPanel1.add(btnMovieName);
        btnMovieName.setBounds(20, 30, 130, 40);

        btnTime.setText("Time");
        btnTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimeActionPerformed(evt);
            }
        });
        jPanel1.add(btnTime);
        btnTime.setBounds(20, 70, 130, 40);

        btnGenre.setText("Genre");
        btnGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenreActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenre);
        btnGenre.setBounds(20, 110, 130, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 160, 160);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        tblMovies.setBackground(new java.awt.Color(0, 153, 0));
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
        jScrollPane1.setBounds(20, 30, 601, 165);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 20, 640, 210);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movie Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Movie x is about bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla \nbla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla \n");
        jScrollPane2.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 30, 560, 99);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 240, 600, 150);

        btnReservation.setText("Make Reservation");
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });
        getContentPane().add(btnReservation);
        btnReservation.setBounds(670, 315, 140, 40);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(null);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel4.add(btnExit);
        btnExit.setBounds(670, 350, 140, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 840, 430);

        jMenu1.setText("Menu");

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

        jMenuItem4.setText("About UWC Movies");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("FAQ");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Not sure what to do?");
        jMenu2.add(jMenuItem6);
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
            new Screen5Reservation(UserID, selectedMovieID, selectedSelectedShowID).setVisible(true);
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
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Screen1Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnMovieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovieNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMovieNameActionPerformed

    private void btnTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimeActionPerformed

    private void btnGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenreActionPerformed

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
    private javax.swing.JButton btnGenre;
    private javax.swing.JButton btnMovieName;
    private javax.swing.JButton btnReservation;
    private javax.swing.JButton btnTime;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JTable tblMovies;
    // End of variables declaration//GEN-END:variables
}
