/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import classes.CSVFileManager;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author EMAN
 */
public class FrmEditLeave extends javax.swing.JFrame {

    private FrmHRpage hrPageRef;
    /**
     * Creates new form FrmEditLeave
     */
    public FrmEditLeave(FrmHRpage hrPageRef) {
        initComponents();
        this.hrPageRef = hrPageRef;
        showDate();
    }

    
    
    
    //event handler method for close button
    private void FrameClose(java.awt.event.MouseEvent evt) {                            
        this.dispose();
    }    

    //for showing of date
    public void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat ("MM/dd/yyyy");
        String date = s.format(d);
        lblDate.setText(date);
    }
    
    //method for populating textfields and jDCchooser
    public void populateFields(String[] leaveInfo) {
        txtEmployeeID.setText(leaveInfo[0]);
        txtLeaveType.setText(leaveInfo[2]);
        txtReason.setText(leaveInfo[5]);
        txtApprover.setText(hrPageRef.getLblFName().getText());
        txtDateResponded.setText(getLblDate().getText());

        // Parse and set the date fields if the date strings are not empty
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        try {
            if (!leaveInfo[1].isEmpty()) {
                Date date = dateFormat.parse(leaveInfo[1]); // Parse the date string
                txtReqDate.setText(new SimpleDateFormat("MM/dd/yyyy").format(date)); // Set the date in the text field
            }
            if (!leaveInfo[3].isEmpty()) {
                Date date1 = dateFormat.parse(leaveInfo[3]);
                txtStartDate.setText(new SimpleDateFormat("MM/dd/yyyy").format(date1)); // Set the date in the text field
            }
            if (!leaveInfo[4].isEmpty()) {
                Date date2 = dateFormat.parse(leaveInfo[4]);
                txtEndDate.setText(new SimpleDateFormat("MM/dd/yyyy").format(date2)); // Set the date in the text field
            }
          
        } catch (ParseException ex) {
            ex.printStackTrace(); // Handle parsing exception
        }
       
    }
    
    //method for clearing textfields
    private void clearTextFields() {
        txtEmployeeID.setText("");
        txtReqDate.setText("");
        txtLeaveType.setText("");
        txtStartDate.setText("");
        txtEndDate.setText("");
        txtReason.setText("");
        jCBStatus.setSelectedItem(null);
        txtApprover.setText("");
        txtDateResponded.setText("");
    }

    
    //getter
    public JLabel getLblDate() {
        return lblDate;
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
        jLabel1 = new javax.swing.JLabel();
        lblEmployeeID = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblRequestDate = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtLeaveType = new javax.swing.JTextField();
        lblBirthday = new javax.swing.JLabel();
        lblAddress1 = new javax.swing.JLabel();
        lblPhoneNum = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();
        lblSSS = new javax.swing.JLabel();
        lblPhilhealth = new javax.swing.JLabel();
        txtApprover = new javax.swing.JTextField();
        lblTIN = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblDateToday = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jCBStatus = new javax.swing.JComboBox<>();
        txtReqDate = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        txtDateResponded = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 224, 234));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 99, 140));
        jLabel1.setText("Respond to Leave Request");

        lblEmployeeID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblEmployeeID.setForeground(new java.awt.Color(78, 99, 140));
        lblEmployeeID.setText("Employee ID:");

        txtEmployeeID.setEditable(false);
        txtEmployeeID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblRequestDate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblRequestDate.setForeground(new java.awt.Color(78, 99, 140));
        lblRequestDate.setText("Request Date:");

        lblFirstName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(78, 99, 140));
        lblFirstName.setText("Leave Type:");

        txtLeaveType.setEditable(false);
        txtLeaveType.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblBirthday.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBirthday.setForeground(new java.awt.Color(78, 99, 140));
        lblBirthday.setText("Start Date:");

        lblAddress1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAddress1.setForeground(new java.awt.Color(78, 99, 140));
        lblAddress1.setText("End Date:");

        lblPhoneNum.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPhoneNum.setForeground(new java.awt.Color(78, 99, 140));
        lblPhoneNum.setText("Reason:");

        txtReason.setEditable(false);
        txtReason.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblSSS.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSSS.setForeground(new java.awt.Color(78, 99, 140));
        lblSSS.setText("Status:");

        lblPhilhealth.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPhilhealth.setForeground(new java.awt.Color(78, 99, 140));
        lblPhilhealth.setText("Approver:");

        txtApprover.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtApprover.setEnabled(false);

        lblTIN.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTIN.setForeground(new java.awt.Color(78, 99, 140));
        lblTIN.setText("Date Responded:");

        btnSave.setBackground(new java.awt.Color(78, 99, 140));
        btnSave.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(78, 99, 140));
        btnCancel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblDateToday.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblDateToday.setForeground(new java.awt.Color(78, 99, 140));
        lblDateToday.setText("Date Today:");

        lblDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(78, 99, 140));
        lblDate.setText("02/21/2024");

        jCBStatus.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jCBStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Rejected" }));

        txtReqDate.setEditable(false);
        txtReqDate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        txtStartDate.setEditable(false);
        txtStartDate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        txtEndDate.setEditable(false);
        txtEndDate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        txtDateResponded.setEditable(false);
        txtDateResponded.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFirstName)
                                        .addComponent(lblBirthday)
                                        .addComponent(lblRequestDate)
                                        .addComponent(lblAddress1)
                                        .addComponent(lblPhoneNum)
                                        .addComponent(lblSSS)
                                        .addComponent(lblPhilhealth)
                                        .addComponent(lblTIN)
                                        .addComponent(lblEmployeeID))
                                    .addGap(59, 59, 59)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtReason)
                                        .addComponent(txtApprover)
                                        .addComponent(txtEmployeeID)
                                        .addComponent(txtLeaveType)
                                        .addComponent(jCBStatus, 0, 195, Short.MAX_VALUE)
                                        .addComponent(txtReqDate)
                                        .addComponent(txtStartDate)
                                        .addComponent(txtEndDate)
                                        .addComponent(txtDateResponded, javax.swing.GroupLayout.Alignment.TRAILING))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblDateToday)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDate)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(lblDateToday))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeID)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestDate)
                    .addComponent(txtReqDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtLeaveType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBirthday)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress1)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoneNum)
                    .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSSS)
                    .addComponent(jCBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhilhealth)
                    .addComponent(txtApprover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTIN)
                    .addComponent(txtDateResponded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        // Get the selected row index
        int selectedRowIndex = hrPageRef.getTblLeaveReq().getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a leave request to respond.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prepare leaveInfo array with updated leave information
        String[] leaveInfo = {
            txtEmployeeID.getText(),                // Employee ID
            txtReqDate.getText(),                   // Request Date
            txtLeaveType.getText(),                 // Type of Leave
            txtStartDate.getText(),                 // Start Date
            txtEndDate.getText(),                   // End Date
            txtReason.getText(),                    // Reason
            jCBStatus.getSelectedItem().toString(), // Status
            txtApprover.getText(),     // Approver from lblFName in FrmHRpage
            txtDateResponded.getText(), // Date from lblDate in FrmEditLeave
        };


        // Update table in FrmHRpage with the edited leave record
        hrPageRef.updateLeaveTableRow(selectedRowIndex, leaveInfo);

        // Update CSV file with data from the table in FrmHRpage
        String csvFilePath = "src\\main\\java\\files\\Request.csv";
        JTable table = hrPageRef.getTblLeaveReq(); // Assuming getTable() returns the JTable instance in FrmHRpage
        CSVFileManager.updateCSVFile(csvFilePath, table);

        // Show success message
        JOptionPane.showMessageDialog(this, "Selected Leave Request responded successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Clear text fields after saving
        clearTextFields();


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEditLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditLeave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FrmEditLeave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jCBStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateToday;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblPhilhealth;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblRequestDate;
    private javax.swing.JLabel lblSSS;
    private javax.swing.JLabel lblTIN;
    private javax.swing.JTextField txtApprover;
    private javax.swing.JTextField txtDateResponded;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtLeaveType;
    private javax.swing.JTextField txtReason;
    private javax.swing.JTextField txtReqDate;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
