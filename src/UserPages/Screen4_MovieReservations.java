package UserPages;

import java.awt.Color;
import movieday.AdminHelpScreen;

public class Screen4_MovieReservations extends javax.swing.JFrame {

    public Screen4_MovieReservations() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        tblUserInformation = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnReservation = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(830, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sort By", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        btnMovieName.setText("Movie name (A-Z)");
        btnMovieName.setToolTipText("View by name in alphabetical order");
        jPanel1.add(btnMovieName);
        btnMovieName.setBounds(20, 30, 130, 25);

        btnTime.setText("Time");
        btnTime.setToolTipText("View by time ");
        jPanel1.add(btnTime);
        btnTime.setBounds(20, 70, 130, 25);

        btnGenre.setText("Genre");
        btnGenre.setToolTipText("View by genre");
        jPanel1.add(btnGenre);
        btnGenre.setBounds(20, 110, 130, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 20, 160, 160);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movies", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        tblUserInformation.setBackground(new java.awt.Color(0, 153, 0));
        tblUserInformation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblUserInformation.setForeground(new java.awt.Color(255, 255, 255));
        tblUserInformation.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUserInformation.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblUserInformation);
        if (tblUserInformation.getColumnModel().getColumnCount() > 0) {
            tblUserInformation.getColumnModel().getColumn(0).setResizable(false);
            tblUserInformation.getColumnModel().getColumn(1).setResizable(false);
            tblUserInformation.getColumnModel().getColumn(2).setResizable(false);
            tblUserInformation.getColumnModel().getColumn(3).setResizable(false);
            tblUserInformation.getColumnModel().getColumn(4).setResizable(false);
            tblUserInformation.getColumnModel().getColumn(5).setResizable(false);
            tblUserInformation.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 601, 165);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 20, 640, 210);

        btnExit.setText("Exit");
        btnExit.setToolTipText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(760, 360, 59, 25);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movie Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
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
        btnReservation.setToolTipText("Book a movie");
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });
        getContentPane().add(btnReservation);
        btnReservation.setBounds(670, 315, 140, 30);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
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

        jMenu2.setText("Help ");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem6.setText("Help");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
        new Screen5Reservation().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReservationActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Screen1Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new AdminHelpScreen().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new AboutScreen().setVisible(true);
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
                new Screen4_MovieReservations().setVisible(true);
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
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JTable tblUserInformation;
    // End of variables declaration//GEN-END:variables
}
