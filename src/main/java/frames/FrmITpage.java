/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EMAN
 */
public class FrmITpage extends javax.swing.JFrame {

    
    /**
     * Creates new form FrmITpage
     */
    public FrmITpage() {
        initComponents();
    }

    //for creation of new row -> for add new account
    public void updateTable(String[] accountInfo) {
        DefaultTableModel model = (DefaultTableModel) tblAccounts.getModel();
        String[] formattedAccountInfo = new String[accountInfo.length];
        

        // Copy other fields directly
        for (int i = 0; i < accountInfo.length; i++) {  
                formattedAccountInfo[i] = accountInfo[i];
            
        }

        // Add the formatted employee information to the table model
        model.addRow(formattedAccountInfo);
    }
    
    //for updating a specific row -> for edit account info 
    public void updateTableRow(int rowIndex, String[] accountInfo) {
        DefaultTableModel model = (DefaultTableModel) tblAccounts.getModel();
        

        // Update the specified row in the table model
        for (int i = 0; i < accountInfo.length; i++) {
            model.setValueAt(accountInfo[i], rowIndex, i);
        }
    }
    
    //getter
    public JTable getTblAccounts() {
        return tblAccounts;
    }

    public JLabel getLblEid() {
        return lblEid;
    }

    public JLabel getLblFName() {
        return lblFName;
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
        lblWelcomeMsg = new javax.swing.JLabel();
        logOut_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblLogoMotorPH = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFName = new javax.swing.JLabel();
        lblEid = new javax.swing.JLabel();
        lblIDniEmployee = new javax.swing.JLabel();
        lblEmpInfoTable = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAccounts = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 224, 234));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(78, 99, 140));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblWelcomeMsg.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        lblWelcomeMsg.setForeground(new java.awt.Color(208, 228, 230));
        lblWelcomeMsg.setText("Welcome, IT");

        logOut_button.setBackground(new java.awt.Color(78, 99, 140));
        logOut_button.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        logOut_button.setForeground(new java.awt.Color(255, 255, 255));
        logOut_button.setText("Log out");
        logOut_button.setToolTipText("");
        logOut_button.setAutoscrolls(true);
        logOut_button.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logOut_button.setBorderPainted(false);
        logOut_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_buttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(210, 214, 214));
        jLabel3.setText("|");

        lblLogoMotorPH.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        lblLogoMotorPH.setForeground(new java.awt.Color(208, 228, 230));
        lblLogoMotorPH.setText("MotorPH");

        lblFName.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        lblFName.setForeground(new java.awt.Color(255, 255, 255));
        lblFName.setText("firstname");

        lblEid.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblEid.setForeground(new java.awt.Color(255, 255, 255));
        lblEid.setText("###");

        lblIDniEmployee.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblIDniEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblIDniEmployee.setText("Employee ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblLogoMotorPH, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(lblWelcomeMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFName)
                .addGap(109, 109, 109)
                .addComponent(lblIDniEmployee)
                .addGap(18, 18, 18)
                .addComponent(lblEid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(logOut_button, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOut_button, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblWelcomeMsg)
                        .addComponent(lblLogoMotorPH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFName)
                        .addComponent(lblEid)
                        .addComponent(lblIDniEmployee)))
                .addGap(13, 13, 13))
        );

        lblEmpInfoTable.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblEmpInfoTable.setForeground(new java.awt.Color(78, 99, 140));
        lblEmpInfoTable.setText("Employee Accounts Table:");

        tblAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblAccounts);

        btnAdd.setBackground(new java.awt.Color(78, 99, 140));
        btnAdd.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(78, 99, 140));
        btnEdit.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(78, 99, 140));
        btnDelete.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(lblEmpInfoTable))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(btnAdd)
                        .addGap(35, 35, 35)
                        .addComponent(btnEdit)
                        .addGap(33, 33, 33)
                        .addComponent(btnDelete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblEmpInfoTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOut_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_buttonActionPerformed
        // TODO add your handling code here:
        FrmLogin logOut = new FrmLogin();
        logOut.show();
        logOut.setLocationRelativeTo(null); // Center the frame

        dispose();
    }//GEN-LAST:event_logOut_buttonActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        // Open the form to input new employee data
        FrmNewAccount _addAccount = new FrmNewAccount(this);
        _addAccount.setVisible(true);
        _addAccount.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        // Get the selected row index
        int selectedRowIndex = tblAccounts.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve the data from the selected row
        DefaultTableModel model = (DefaultTableModel) tblAccounts.getModel();
        String[] accountInfo = new String[model.getColumnCount()];
        for (int i = 0; i < model.getColumnCount(); i++) {
            accountInfo[i] = model.getValueAt(selectedRowIndex, i).toString();
        }

        // Pass the reference to the existing FrmHRpage instance to FrmEditEmployee
        FrmEditAccount editAccountForm = new FrmEditAccount(this); // Pass the reference
        editAccountForm.populateFields(accountInfo);
        editAccountForm.setVisible(true);
        editAccountForm.setLocationRelativeTo(null); // Center the frame
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        // Get the selected row index
        int selectedRowIndex = tblAccounts.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve the data from the selected row
        DefaultTableModel model = (DefaultTableModel) tblAccounts.getModel();
        String[] accountInfo = new String[model.getColumnCount()];
        for (int i = 0; i < model.getColumnCount(); i++) {
            accountInfo[i] = model.getValueAt(selectedRowIndex, i).toString();
        }

        // Pass the reference to the existing FrmHRpage instance to FrmEditEmployee
        FrmDeleteAccount deleteAccountForm = new FrmDeleteAccount(this); // Pass the reference
        deleteAccountForm.populateFields(accountInfo);
        deleteAccountForm.setVisible(true);
        deleteAccountForm.setLocationRelativeTo(null); // Center the frame
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmITpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmITpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmITpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmITpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmITpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblEid;
    private javax.swing.JLabel lblEmpInfoTable;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblIDniEmployee;
    private javax.swing.JLabel lblLogoMotorPH;
    private javax.swing.JLabel lblWelcomeMsg;
    private javax.swing.JButton logOut_button;
    private javax.swing.JTable tblAccounts;
    // End of variables declaration//GEN-END:variables
}