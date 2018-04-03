package UserPages;

import movieday.AdminHome;
import javax.swing.*;

public class Screen1Home extends javax.swing.JFrame {
    static int UserID;
    int counter = 0;
    ImageIcon[] image = new ImageIcon[9];
    
    public Screen1Home() {
        initComponents();
        this.setLocationRelativeTo(null);
        getImag();
        btnPrev.setEnabled(false);
    }
    
     public void getImag() {
        for (int i = 0; i < image.length; ++i) {
            image[i] = new ImageIcon("../Slideshow/src/Pictures/" + i + ".png");
        }
        lblPicture.setIcon(image[0]);
    }

    public void next() {
        if (counter != 8) {
            btnPrev.setEnabled(true);
            counter++;
            lblPicture.setIcon(image[counter]);
        }
        if(counter == 8){
            btnNext.setEnabled(false);
        }

    }

    public void previous() {
        if (counter != 0) {
            btnNext.setEnabled(true);
            counter--;
            lblPicture.setIcon(image[counter]);
        }
        if(counter == 0){
            btnPrev.setEnabled(false);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblPicture = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCreateAccount = new javax.swing.JMenuItem();
        mnuSignIn = new javax.swing.JMenuItem();
        mnnuSignInAdmin = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Screen");
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(826, 425));
        setMinimumSize(new java.awt.Dimension(826, 425));
        setName("Home"); // NOI18N
        setPreferredSize(new java.awt.Dimension(826, 425));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("WELCOME!");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(516, 19, 170, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Create account");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(586, 49, 110, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sign in");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(516, 49, 50, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("|");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(566, 49, 7, 15);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 6, 100);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 3));
        jPanel3.setLayout(null);
        jPanel3.add(lblPicture);
        lblPicture.setBounds(20, 20, 540, 220);

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel3.add(btnNext);
        btnNext.setBounds(310, 250, 100, 25);

        btnPrev.setText("Previous");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrev);
        btnPrev.setBounds(200, 250, 90, 25);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(130, 80, 580, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, 0, 840, 380);

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));

        jMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jMenu1.setText("Menu");

        mnuCreateAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuCreateAccount.setBackground(new java.awt.Color(51, 51, 51));
        mnuCreateAccount.setText("Create a new account");
        mnuCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCreateAccountActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCreateAccount);

        mnuSignIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuSignIn.setBackground(new java.awt.Color(51, 51, 51));
        mnuSignIn.setText("Sign In");
        mnuSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSignInActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSignIn);

        mnnuSignInAdmin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnnuSignInAdmin.setBackground(new java.awt.Color(51, 51, 51));
        mnnuSignInAdmin.setText("Sign In(Administrator)");
        mnnuSignInAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnnuSignInAdminActionPerformed(evt);
            }
        });
        jMenu1.add(mnnuSignInAdmin);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuExit.setBackground(new java.awt.Color(51, 51, 51));
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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Screen3Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Screen2Register().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mnuCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCreateAccountActionPerformed
        new Screen2Register().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCreateAccountActionPerformed

    private void mnuSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSignInActionPerformed
        new Screen3Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuSignInActionPerformed

    private void mnnuSignInAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnnuSignInAdminActionPerformed
        new Screen3Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnnuSignInAdminActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        previous();
    }//GEN-LAST:event_btnPrevActionPerformed

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
            java.util.logging.Logger.getLogger(Screen1Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen1Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen1Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen1Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen1Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JMenuItem mnnuSignInAdmin;
    private javax.swing.JMenuItem mnuCreateAccount;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuSignIn;
    // End of variables declaration//GEN-END:variables
}
