/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPages;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import movieday.Function;

/**
 *
 * @author Nino
 */
public class Screen3_1ForgotPassword extends javax.swing.JFrame {
    String name = "";
    String surname = "";
    String username = "";
    String contactNo="";
    String password = "";
    String secQuestion = "";
    
        //Databases Variables
    String jdbcDriver = "com.mysql.jdbc.Driver";
    String dbUrl = "jdbc:mysql://localhost:8889/MovieDay";
    String dbUserID = "root";
    String dbPassword = "root";

    ResultSet res;
    Connection c;
    
    public Screen3_1ForgotPassword() {
        initComponents();
        this.setLocationRelativeTo(null);
        addButtonGroup();
        txfName.setEnabled(false);
        txfSurname.setEnabled(false);
        txfPassword.setEnabled(false);
        btnSubmit2.setEnabled(false);
        txfUsername.setEnabled(false);
        txfSecQuest.setEnabled(false);
        btnSubmit1.setEnabled(false);
        btnLogin.setEnabled(false);
        
        btnSubmit1.setForeground(Color.gray);
        btnSubmit2.setForeground(Color.gray);
        btnClear.setForeground(Color.white);
        btnBack.setForeground(Color.white);
        btnLogin.setForeground(Color.gray);
        btnExit.setForeground(Color.white);
        
        btnSubmit1.setBackground(Color.blue);
        btnSubmit2.setBackground(Color.blue);
        btnClear.setBackground(Color.blue);
        btnBack.setBackground(Color.blue);
        btnLogin.setBackground(Color.blue);
        btnExit.setBackground(Color.blue);
        
        
    }
    
    private void addButtonGroup(){
        ButtonGroup group = new ButtonGroup();
        group.add(rbtnPassword);
        group.add(rbtnUsername);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPn2 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSubmit2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txfSurname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txfPassword = new javax.swing.JTextField();
        jPn1 = new javax.swing.JPanel();
        btnSubmit1 = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txfSecQuest = new javax.swing.JTextField();
        rbtnPassword = new javax.swing.JRadioButton();
        rbtnUsername = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuCreateAccount = new javax.swing.JMenuItem();
        mnuSignIn = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Recovery");
        setMaximumSize(new java.awt.Dimension(500, 369));
        setMinimumSize(new java.awt.Dimension(500, 369));
        setName("Password Recovery"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 369));
        setResizable(false);
        setSize(new java.awt.Dimension(546, 411));
        getContentPane().setLayout(null);

        jPn2.setBackground(new java.awt.Color(51, 51, 51));
        jPn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPn2.setLayout(null);

        lblUsername.setText("<Username>");
        jPn2.add(lblUsername);
        lblUsername.setBounds(12, 177, 210, 30);

        jLabel5.setText("Your username is: ");
        jPn2.add(jLabel5);
        jLabel5.setBounds(12, 162, 220, 15);

        btnSubmit2.setText("Submit");
        btnSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit2ActionPerformed(evt);
            }
        });
        jPn2.add(btnSubmit2);
        btnSubmit2.setBounds(150, 140, 70, 25);

        jLabel7.setText("Name:");
        jPn2.add(jLabel7);
        jLabel7.setBounds(20, 30, 46, 15);

        txfName.setBackground(new java.awt.Color(0, 0, 0));
        txfName.setForeground(new java.awt.Color(255, 255, 255));
        txfName.setMaximumSize(new java.awt.Dimension(4, 19));
        jPn2.add(txfName);
        txfName.setBounds(90, 19, 130, 30);

        jLabel8.setText("Surname:");
        jPn2.add(jLabel8);
        jLabel8.setBounds(20, 70, 60, 15);

        txfSurname.setBackground(new java.awt.Color(0, 0, 0));
        txfSurname.setForeground(new java.awt.Color(255, 255, 255));
        jPn2.add(txfSurname);
        txfSurname.setBounds(90, 59, 130, 30);

        jLabel9.setText("Password:");
        jPn2.add(jLabel9);
        jLabel9.setBounds(20, 110, 70, 15);

        txfPassword.setBackground(new java.awt.Color(0, 0, 0));
        txfPassword.setForeground(new java.awt.Color(255, 255, 255));
        jPn2.add(txfPassword);
        txfPassword.setBounds(90, 99, 130, 30);

        getContentPane().add(jPn2);
        jPn2.setBounds(260, 50, 230, 210);

        jPn1.setBackground(new java.awt.Color(51, 51, 51));
        jPn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPn1.setLayout(null);

        btnSubmit1.setText("Submit");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });
        jPn1.add(btnSubmit1);
        btnSubmit1.setBounds(140, 140, 80, 25);

        lblPassword.setText("<Password>");
        jPn1.add(lblPassword);
        lblPassword.setBounds(12, 177, 210, 30);

        jLabel10.setText("Your password is:");
        jPn1.add(jLabel10);
        jLabel10.setBounds(12, 162, 210, 15);

        jLabel3.setText("Email");
        jPn1.add(jLabel3);
        jLabel3.setBounds(10, 16, 70, 30);

        txfUsername.setBackground(new java.awt.Color(0, 0, 0));
        txfUsername.setForeground(new java.awt.Color(255, 255, 255));
        jPn1.add(txfUsername);
        txfUsername.setBounds(80, 19, 140, 30);

        jLabel4.setText("Security Question:");
        jPn1.add(jLabel4);
        jLabel4.setBounds(10, 60, 130, 15);

        jLabel1.setText("What is your mothers maden name?");
        jPn1.add(jLabel1);
        jLabel1.setBounds(10, 80, 230, 15);

        txfSecQuest.setBackground(new java.awt.Color(0, 0, 0));
        txfSecQuest.setForeground(new java.awt.Color(255, 255, 255));
        jPn1.add(txfSecQuest);
        txfSecQuest.setBounds(10, 99, 210, 30);

        getContentPane().add(jPn1);
        jPn1.setBounds(10, 50, 230, 210);

        rbtnPassword.setForeground(new java.awt.Color(255, 255, 255));
        rbtnPassword.setText("Forgot Password?");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroup1, org.jdesktop.beansbinding.ELProperty.create("${selection.selected}"), rbtnPassword, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        rbtnPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(rbtnPassword);
        rbtnPassword.setBounds(10, 10, 180, 23);

        rbtnUsername.setForeground(new java.awt.Color(255, 255, 255));
        rbtnUsername.setText("Forgot Username?");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroup1, org.jdesktop.beansbinding.ELProperty.create("${selection.selected}"), rbtnUsername, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        rbtnUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnUsernameMouseClicked(evt);
            }
        });
        getContentPane().add(rbtnUsername);
        rbtnUsername.setBounds(260, 10, 220, 23);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 369));
        jPanel3.setLayout(null);

        btnClear.setBackground(new java.awt.Color(51, 102, 255));
        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);
        btnClear.setBounds(150, 270, 80, 40);

        btnBack.setBackground(new java.awt.Color(51, 102, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack);
        btnBack.setBounds(250, 270, 60, 40);

        btnLogin.setBackground(new java.awt.Color(51, 102, 255));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogin);
        btnLogin.setBounds(419, 270, 70, 40);

        btnExit.setBackground(new java.awt.Color(51, 102, 255));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel3.add(btnExit);
        btnExit.setBounds(330, 270, 70, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 550, 390);

        jMenu1.setText("Menu");

        mnuCreateAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuCreateAccount.setText("Create a new account");
        mnuCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCreateAccountActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCreateAccount);

        mnuSignIn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuSignIn.setText("Sign In");
        mnuSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSignInActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSignIn);

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

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        try{
            username = txfUsername.getText();
            secQuestion = txfSecQuest.getText();

            if(!(username.equals("")) || !(secQuestion.equals(""))){
                
                
                
                btnLogin.setEnabled(true);
                btnSubmit1.setEnabled(false);
                btnClear.setEnabled(false);
                txfUsername.setEnabled(false);
                txfSecQuest.setEnabled(false);
                rbtnPassword.setEnabled(false);
                rbtnUsername.setEnabled(false);
                btnSubmit1.setForeground(Color.gray);
                btnSubmit2.setForeground(Color.gray);
                btnClear.setForeground(Color.gray);
                btnLogin.setForeground(Color.white);
                
                
                Class.forName(jdbcDriver);
                c = new Function().getConnection();

                String query = "SELECT * FROM `User` WHERE Email = \""
                        + username
                        + "\" AND SecQuestionAnswer = \""
                        + secQuestion
                        + "\"\n";
                PreparedStatement preparedStmt = c.prepareStatement(query);
                ResultSet rs = preparedStmt.executeQuery(query);
                // iterate through the java resultset
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(rootPane, "Email Does Not Exist!");
                    c.close();
                }else{
                    lblPassword.setText(rs.getString("Password"));
                }
                
                
            }else{
                JOptionPane.showMessageDialog(rootPane,"Please enter username and the security answer!");
            }

        }catch(StringIndexOutOfBoundsException string){
            JOptionPane.showMessageDialog(rootPane,"Please fill in all the fields correctly", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Please provide data of correct data type in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txfUsername.setText("");
        txfName.setText("");
        txfPassword.setText("");
        txfSecQuest.setText("");
        txfSurname.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Screen3Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new Screen3Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void mnuCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCreateAccountActionPerformed
        new Screen2Register().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuCreateAccountActionPerformed

    private void mnuSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSignInActionPerformed
        new Screen3Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuSignInActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit2ActionPerformed
        try{
            name = txfName.getText();
            surname = txfSurname.getText();
            password = txfPassword.getText();

            if(!(name.equals("")) || !(surname.equals("")) || !(password.equals(""))){
                
                btnLogin.setEnabled(true);
                btnSubmit1.setEnabled(false);
                btnClear.setEnabled(false);
                txfName.setEnabled(false);
                txfSurname.setEnabled(false);
                txfPassword.setEnabled(false);
                rbtnPassword.setEnabled(false);
                rbtnUsername.setEnabled(false);
                btnSubmit1.setForeground(Color.gray);
                btnSubmit2.setForeground(Color.gray);
                btnClear.setForeground(Color.gray);
                btnLogin.setForeground(Color.white);
                
                Class.forName(jdbcDriver);
                c = new Function().getConnection();

                String query = "SELECT * FROM `User` WHERE Name = \""
                        + name
                        + "\" AND Password = \""
                        + password
                        + "\"\n";
                PreparedStatement preparedStmt = c.prepareStatement(query);
                ResultSet rs = preparedStmt.executeQuery(query);
                // iterate through the java resultset
                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(rootPane, "Email Does Not Exist!");
                    c.close();
                }else{
                    lblUsername.setText(rs.getString("Email"));
                }
                
            }else{
                JOptionPane.showMessageDialog(rootPane,"Please enter username and the security answer!");
            }

        }catch(StringIndexOutOfBoundsException string){
            JOptionPane.showMessageDialog(rootPane,"Please fill in all the fields correctly", "Error", JOptionPane.ERROR_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Please provide data of correct data type in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmit2ActionPerformed

    private void rbtnUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnUsernameMouseClicked
        txfName.setEnabled(true);
        txfSurname.setEnabled(true);
        txfPassword.setEnabled(true);
        btnSubmit2.setEnabled(true);

        txfUsername.setEnabled(false);
        txfSecQuest.setEnabled(false);
        btnSubmit1.setEnabled(false);
        btnSubmit1.setForeground(Color.gray);
        btnSubmit2.setForeground(Color.white);
    }//GEN-LAST:event_rbtnUsernameMouseClicked

    private void rbtnPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnPasswordMouseClicked
        // TODO add your handling code here:
        txfName.setEnabled(false);
        txfSurname.setEnabled(false);
        txfPassword.setEnabled(false);
        btnSubmit2.setEnabled(false);

        txfUsername.setEnabled(true);
        txfSecQuest.setEnabled(true);
        btnSubmit1.setEnabled(true);

        btnSubmit1.setForeground(Color.white);
        btnSubmit2.setForeground(Color.gray);
    }//GEN-LAST:event_rbtnPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(Screen3_1ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen3_1ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen3_1ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen3_1ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen3_1ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JButton btnSubmit2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPn1;
    private javax.swing.JPanel jPn2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenuItem mnuCreateAccount;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuSignIn;
    private javax.swing.JRadioButton rbtnPassword;
    private javax.swing.JRadioButton rbtnUsername;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfPassword;
    private javax.swing.JTextField txfSecQuest;
    private javax.swing.JTextField txfSurname;
    private javax.swing.JTextField txfUsername;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
