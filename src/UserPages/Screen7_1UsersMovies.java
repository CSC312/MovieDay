/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPages;

import java.awt.Color;

/**
 *
 * @author Nino
 */
public class Screen7_1UsersMovies extends javax.swing.JFrame {

    /**
     * Creates new form Screen7_1UsersMovies
     */
    public Screen7_1UsersMovies() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnBack.setBackground(Color.blue);
        btnCancelRes.setBackground(Color.blue);
        btnExit.setBackground(Color.blue);
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
        lblLength = new javax.swing.JLabel();
        lblMovie = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblGenre = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMovieList = new javax.swing.JList();
        btnBack = new javax.swing.JButton();
        btnCancelRes = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
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
        setMaximumSize(new java.awt.Dimension(545, 356));
        setMinimumSize(new java.awt.Dimension(545, 356));
        setPreferredSize(new java.awt.Dimension(545, 356));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "About Movie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(null);

        lblLength.setForeground(new java.awt.Color(255, 255, 255));
        lblLength.setText("Length");
        jPanel1.add(lblLength);
        lblLength.setBounds(17, 113, 280, 15);

        lblMovie.setForeground(new java.awt.Color(255, 255, 255));
        lblMovie.setText("Movie name");
        jPanel1.add(lblMovie);
        lblMovie.setBounds(17, 29, 280, 15);

        lblSeats.setForeground(new java.awt.Color(255, 255, 255));
        lblSeats.setText("Your seats");
        jPanel1.add(lblSeats);
        lblSeats.setBounds(17, 134, 280, 15);

        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText("Time(s)");
        jPanel1.add(lblTime);
        lblTime.setBounds(17, 50, 280, 15);

        lblGenre.setForeground(new java.awt.Color(255, 255, 255));
        lblGenre.setText("Genre(s)");
        jPanel1.add(lblGenre);
        lblGenre.setBounds(17, 71, 280, 15);

        lblYear.setForeground(new java.awt.Color(255, 255, 255));
        lblYear.setText("Year");
        jPanel1.add(lblYear);
        lblYear.setBounds(17, 92, 280, 15);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 20, 310, 170);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movie List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        lstMovieList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstMovieList);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(17, 29, 137, 241);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 20, 170, 287);

        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        getContentPane().add(btnBack);
        btnBack.setBounds(370, 240, 70, 25);

        btnCancelRes.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelRes.setText("Cancel Reservation");
        getContentPane().add(btnCancelRes);
        btnCancelRes.setBounds(370, 200, 150, 25);

        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        getContentPane().add(btnExit);
        btnExit.setBounds(460, 240, 60, 25);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 560, 350);

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
            java.util.logging.Logger.getLogger(Screen7_1UsersMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen7_1UsersMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen7_1UsersMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen7_1UsersMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen7_1UsersMovies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelRes;
    private javax.swing.JButton btnExit;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblGenre;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblMovie;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblYear;
    private javax.swing.JList lstMovieList;
    private javax.swing.JMenuItem mnuExit;
    // End of variables declaration//GEN-END:variables
}
