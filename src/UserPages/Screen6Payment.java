/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPages;

import javax.swing.JOptionPane;

/**
 *
 * @author Nino
 */
public class Screen6Payment extends javax.swing.JFrame {

    static int price;
    static String seats;
    static int UserID;
    
    public Screen6Payment(int p, String seat, int usrID) {
        initComponents();
        this.setLocationRelativeTo(null);
         price = p;
        seats = seat;
        UserID = usrID;
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
        jPanel2 = new javax.swing.JPanel();
        cbxCardType = new javax.swing.JComboBox<>();
        txfCardNumber = new javax.swing.JTextField();
        txfExpiration = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        txfCSC = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuReserve = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(345, 370));
        setSize(new java.awt.Dimension(430, 230));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        cbxCardType.setBackground(new java.awt.Color(51, 102, 255));
        cbxCardType.setForeground(new java.awt.Color(255, 255, 255));
        cbxCardType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Card type", "Visa", "Mastercard", "Discover", "American Express" }));
        cbxCardType.setToolTipText("Choose your card type");
        jPanel2.add(cbxCardType);
        cbxCardType.setBounds(20, 30, 140, 24);

        txfCardNumber.setBackground(new java.awt.Color(0, 0, 0));
        txfCardNumber.setForeground(new java.awt.Color(255, 255, 255));
        txfCardNumber.setText("Card Number");
        txfCardNumber.setToolTipText("Your card number");
        txfCardNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCardNumberFocusLost(evt);
            }
        });
        txfCardNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfCardNumberMouseClicked(evt);
            }
        });
        jPanel2.add(txfCardNumber);
        txfCardNumber.setBounds(20, 70, 140, 30);

        txfExpiration.setBackground(new java.awt.Color(0, 0, 0));
        txfExpiration.setForeground(new java.awt.Color(255, 255, 255));
        txfExpiration.setText("Expiration MM-YY");
        txfExpiration.setToolTipText("Your card expiry date(e.g MM-YY(10-20))");
        txfExpiration.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfExpirationFocusLost(evt);
            }
        });
        txfExpiration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfExpirationMouseClicked(evt);
            }
        });
        jPanel2.add(txfExpiration);
        txfExpiration.setBounds(20, 120, 140, 30);

        btnConfirm.setBackground(new java.awt.Color(51, 102, 255));
        btnConfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirm.setText("Confirm");
        btnConfirm.setToolTipText("Proceed");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfirm);
        btnConfirm.setBounds(20, 170, 110, 25);

        txfCSC.setBackground(new java.awt.Color(0, 0, 0));
        txfCSC.setForeground(new java.awt.Color(255, 255, 255));
        txfCSC.setText("CSC (3 digits)");
        txfCSC.setToolTipText("Your card CSC");
        txfCSC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCSCFocusLost(evt);
            }
        });
        txfCSC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfCSCMouseClicked(evt);
            }
        });
        jPanel2.add(txfCSC);
        txfCSC.setBounds(180, 120, 110, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 50, 310, 230);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 340, 350);

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

        jMenu2.setText("Help ");

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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new Screen1Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        new AboutScreen().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnuReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReserveActionPerformed
        new Screen7_1UsersMovies(UserID).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuReserveActionPerformed

    private void txfCardNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCardNumberFocusLost
        String text = txfCardNumber.getText().trim();
        if (text.isEmpty()) {
            txfCardNumber.setText("Card Number");
        }
    }//GEN-LAST:event_txfCardNumberFocusLost

    private void txfCardNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCardNumberMouseClicked
        String text = txfCardNumber.getText().trim();
        if (text.equals("Card Number")) {
            txfCardNumber.setText("");
        }
    }//GEN-LAST:event_txfCardNumberMouseClicked

    private void txfExpirationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfExpirationFocusLost
        String text = txfExpiration.getText().trim();
        if (text.isEmpty()) {
            txfExpiration.setText("Expiration MM/YY");
        }
    }//GEN-LAST:event_txfExpirationFocusLost

    private void txfExpirationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfExpirationMouseClicked
        String text = txfExpiration.getText().trim();
        if (text.equals("Expiration MM-YY")) {
            txfExpiration.setText("");
        }
    }//GEN-LAST:event_txfExpirationMouseClicked

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        if (cbxCardType.getSelectedItem().equals("Card type") || txfCSC.getText().equals("CSC (3 digits)") || txfCardNumber.getText().equals("Card Number") || txfExpiration.getText().equals("Expiration MM-YY")) {
            JOptionPane.showMessageDialog(rootPane, "Please fill in all the textfields");
        } else {
            int choice = JOptionPane.showConfirmDialog(rootPane, "Confirm payment of:\n"
                + "Seat(s): " + seats + "\n"
                + "Price: R" + price);
            if (choice == 0) {
                JOptionPane.showMessageDialog(rootPane, "Payment was successful! View more movies?");
                new Screen4_MovieReservations(ERROR).setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Payment was cancelled");
            }
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txfCSCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCSCFocusLost
        String text = txfCSC.getText().trim();
        if (text.isEmpty()) {
            txfCSC.setText("CSC (3 digits)");
        }
    }//GEN-LAST:event_txfCSCFocusLost

    private void txfCSCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCSCMouseClicked
        String text = txfCSC.getText().trim();
        if (text.equals("CSC (3 digits)")) {
            txfCSC.setText("");
        }
    }//GEN-LAST:event_txfCSCMouseClicked

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
            java.util.logging.Logger.getLogger(Screen6Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen6Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen6Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen6Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen6Payment(price, seats, UserID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbxCardType;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuReserve;
    private javax.swing.JTextField txfCSC;
    private javax.swing.JTextField txfCardNumber;
    private javax.swing.JTextField txfExpiration;
    // End of variables declaration//GEN-END:variables
}
