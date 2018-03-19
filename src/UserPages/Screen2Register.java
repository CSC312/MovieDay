package UserPages;

import javax.swing.JOptionPane;

public class Screen2Register extends javax.swing.JFrame {
    String name = "",surname = "",username = "",
           email="", DOB="", password = "",secQuestion = "";
    
    public Screen2Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        btnSubmit.setEnabled(false);
        btnNewPass.setEnabled(true);
        btnClear.setEnabled(true);
        
        btnLogin.setEnabled(false);
        btnDeleteRecord.setEnabled(false);
        tblUserInformation.setVisible(false);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txfName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txfSurname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnNewPass = new javax.swing.JButton();
        txfEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txfDOB = new javax.swing.JTextField();
        txfSecurityQuestion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDeleteRecord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserInformation = new javax.swing.JTable();
        btnLogin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));

        jPanel3.setForeground(new java.awt.Color(240, 240, 240));

        txfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txfName)
                .addComponent(jLabel3))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Surname:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(txfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txfSurname)
                .addComponent(jLabel6))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Password:");

        lblPassword.setText("<Password>");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14)
                .addComponent(lblPassword))
        );

        btnNewPass.setBackground(new java.awt.Color(0, 102, 0));
        btnNewPass.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnNewPass.setForeground(new java.awt.Color(255, 255, 255));
        btnNewPass.setText("Generate new password");
        btnNewPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPassActionPerformed(evt);
            }
        });

        txfEmail.setToolTipText("");
        txfEmail.setMaximumSize(new java.awt.Dimension(4, 19));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Email:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Date of Birth:");

        txfDOB.setToolTipText("");
        txfDOB.setMaximumSize(new java.awt.Dimension(4, 19));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(0, 46, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnNewPass)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txfDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewPass)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txfSecurityQuestion.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txfSecurityQuestion.setForeground(new java.awt.Color(153, 153, 153));
        txfSecurityQuestion.setMaximumSize(new java.awt.Dimension(4, 19));
        txfSecurityQuestion.setMinimumSize(new java.awt.Dimension(4, 19));
        txfSecurityQuestion.setPreferredSize(new java.awt.Dimension(4, 19));
        txfSecurityQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfSecurityQuestionMouseClicked(evt);
            }
        });
        txfSecurityQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSecurityQuestionActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Security Question:");

        btnSubmit.setBackground(new java.awt.Color(0, 102, 0));
        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 0));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 102, 0));
        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDeleteRecord.setBackground(new java.awt.Color(0, 102, 0));
        btnDeleteRecord.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDeleteRecord.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteRecord.setText("Delete");
        btnDeleteRecord.setEnabled(false);
        btnDeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRecordActionPerformed(evt);
            }
        });

        jLabel1.setText("What is your mothers maden name?");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txfSecurityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(83, 83, 83))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(114, 114, 114))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txfSecurityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnBack)
                    .addComponent(btnClear)
                    .addComponent(btnDeleteRecord))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        tblUserInformation.setBackground(new java.awt.Color(0, 153, 0));
        tblUserInformation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblUserInformation.setForeground(new java.awt.Color(255, 255, 255));
        tblUserInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Surname", "Email", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        }

        btnLogin.setBackground(new java.awt.Color(0, 102, 0));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Sign In");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Exit");
        jMenu1.add(jMenuItem3);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void txfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNameActionPerformed

    private void btnNewPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPassActionPerformed
        try{
            name = (txfName.getText().trim().toLowerCase()).trim();
            surname = (txfSurname.getText().toLowerCase()).trim();
            username = (name.substring(0,3)+surname.substring(0,3) + Math.round(Math.random()*899+100)).trim();

            password = ""+ name.charAt(0) + surname.charAt(0) + Math.round(Math.random()*89999999+1000000);
            lblPassword.setText(password.trim());
            btnSubmit.setEnabled(true);
        }
        catch(StringIndexOutOfBoundsException string){
            JOptionPane.showMessageDialog(rootPane,"Please fill in all the fields correctly", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnNewPassActionPerformed

    private void txfSecurityQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfSecurityQuestionMouseClicked
        // TODO add your handling code here:
        txfSecurityQuestion.setText("");
    }//GEN-LAST:event_txfSecurityQuestionMouseClicked

    private void txfSecurityQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSecurityQuestionActionPerformed

    }//GEN-LAST:event_txfSecurityQuestionActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        try{
            name = txfName.getText().trim().toLowerCase();
            surname = txfSurname.getText().trim().toLowerCase();
            username = name.substring(0,3)+surname.substring(0,3) + Math.round(Math.random()*899+100);
            secQuestion = txfSecurityQuestion.getText().trim();
            DOB = (txfDOB.getText()).trim();

            lblPassword.setText(password);

            if(secQuestion.equals("")){
                JOptionPane.showMessageDialog(rootPane,"Please fill in all the fields correctly", "Error", JOptionPane.ERROR_MESSAGE);
            }else{

                /*Tblallusers inputToAll  = new Tblallusers();

                inputToAll.setName(name.trim());
                inputToAll.setSurname(surname.trim());
                inputToAll.setUsername(username.trim());
                inputToAll.setPassword(password.trim());
                inputToAll.setContactno(contactNo.trim());
                inputToAll.setSecanswer(secQuestion);

                UserRegDBPUEntityManager.getTransaction().begin();
                UserRegDBPUEntityManager.persist(inputToAll);
                UserRegDBPUEntityManager.getTransaction().commit();
                UserRegDBPUEntityManager.clear();

                Query q = UserRegDBPUEntityManager.createNamedQuery ("Tblallusers.findByUsername");
                q.setParameter("username", username);
                List <Tblallusers> result = q.getResultList();
                tblallusersList.clear();
                tblallusersList.addAll(result);
                //tblallusersList.clear();
                //tblallusersList.addAll(tblallusersQuery.getResultList());
                */
                JOptionPane.showMessageDialog(rootPane, "--------YOUR DETAILS-------- \n" +
                    "Name: \t\t" + name + "\n" +
                    "Surname: \t\t" + surname + "\n" +
                    "Email: \t" + email + "\n" +
                    "DOB: \t\t"+ DOB + "\n"+
                    "Security Answer: \t" + secQuestion + "\n\n" +
                    "Username: \t\t" + username + "\n" +
                    "Password: \t\t" + password,
                    "Your details", JOptionPane.INFORMATION_MESSAGE);
                
                txfName.setEnabled(false);
                txfSurname.setEnabled(false);
                txfEmail.setEnabled(false);
                txfDOB.setEnabled(false);
                txfSecurityQuestion.setEnabled(false);

                btnClear.setEnabled(false);
                btnSubmit.setEnabled(false);

                tblUserInformation.setVisible(true);
                btnDeleteRecord.setEnabled(true);
                btnLogin.setEnabled(true);
                btnNewPass.setEnabled(false);
            }
            btnNewPass.setEnabled(false);

        }catch(StringIndexOutOfBoundsException string){
            JOptionPane.showMessageDialog(rootPane,"Please fill in all the fields correctly", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Please fill in all the fields correctly", "Error", JOptionPane.ERROR_MESSAGE);
        }
          
        //int p = JOptionPane.showConfirmDialog(rootPane, "Are you satisfied with the data you provided?", "SUBMIT", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Screen1Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txfName.setText("");
        txfSurname.setText("");
        txfEmail.setText("");
        lblPassword.setText("<Password>");

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRecordActionPerformed
        //JOptionPane.showMessageDialog(rootPane,"Only an administrator can delete your account", "ERROR", JOptionPane.ERROR_MESSAGE);
        /*try{
            Tblallusers username1= tblallusersList.get(tblUserInformation.getSelectedRow());

            int p = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete this account?", "Delete", JOptionPane.YES_NO_OPTION);
            if(p==0){
                btnClear.setEnabled(true);
                btnSubmit.setEnabled(true);
                btnBack.setEnabled(true);
                try{
                    String username = username1.getUsername();
                    Tblallusers inputToAll = UserRegDBPUEntityManager.find(Tblallusers.class,username);

                    UserRegDBPUEntityManager.getTransaction().begin();
                    UserRegDBPUEntityManager.remove(inputToAll);
                    UserRegDBPUEntityManager.getTransaction().commit();
                    UserRegDBPUEntityManager.clear();

                    tblallusersList.clear();
                    tblallusersList.addAll(tblallusersQuery.getResultList());

                    txfName.setText("");
                    txfSurname.setText("");
                    txfContactNo.setText("");
                    lblPassword.setText("<Password>");

                    txfSecurityQuestion.setText("");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(rootPane,"Please select the record in the table and then click delete", "Error", JOptionPane.ERROR_MESSAGE);
                }
                txfName.setEnabled(true);
                txfSurname.setEnabled(true);
                txfContactNo.setEnabled(true);
                txfSecurityQuestion.setEnabled(true);
                tblUserInformation.setVisible(false);
                btnDeleteRecord.setEnabled(false);
                btnLogin.setEnabled(false);
                btnClear.setEnabled(true);
                btnSubmit.setEnabled(false);
                btnNewPass.setEnabled(true);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane,"Please select the record in the table and then click delete", "Error", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_btnDeleteRecordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //JOptionPane.showMessageDialog(rootPane,"Username: " + username + "\n" + "Password: " + password, "Login details", JOptionPane.INFORMATION_MESSAGE);
        new Screen3Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Screen2Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen2Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen2Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen2Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen2Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteRecord;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNewPass;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTable tblUserInformation;
    private javax.swing.JTextField txfDOB;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfSecurityQuestion;
    private javax.swing.JTextField txfSurname;
    // End of variables declaration//GEN-END:variables
}
