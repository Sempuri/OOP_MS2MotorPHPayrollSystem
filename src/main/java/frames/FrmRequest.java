/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import classes.Employee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raya
 */
public class FrmRequest extends javax.swing.JFrame {
private Employee[] employee1;
    
    /**
     * Creates new form FrmRequest
     */
    public FrmRequest() {
        initComponents();
        employee1 = Employee.readEmployee("src\\main\\java\\files\\Employee.csv");
        showDate();
    
    }
 public void setEmployeeId(String employeeId) {
    lblReqEid.setText(employeeId);
}
//getter
    public JLabel getLblReqEid() {
        return lblReqEid;
    }

   
    public JLabel getLblReqFName() {    
        return lblReqFName;
    }

 
    
    //for showing of date
    public void showDate(){
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat ("MM/dd/yyyy");
        String date = s.format(d);
        lblDate.setText(date);

        // Set the minimum selectable date for start date
        jDCStartDate.setMinSelectableDate(d);

        // Set the minimum selectable date for end date
        jDCEndDate.setMinSelectableDate(d);
    }
    
    // Helper method to format Date to String
    private String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return date != null ? dateFormat.format(date) : "";
} 
    
    private void clearInputFields() {
    // Clear input fields
    txtLeavetype.setSelectedIndex(0);
    jDCStartDate.setDate(null); // Clear start date selection
    jDCEndDate.setDate(null);   // Clear end date selection
    txtReasonOfRequest.setText("");

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFName = new javax.swing.JLabel();
        lblEid = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogoMotorPH = new javax.swing.JLabel();
        logOut_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblReqFName = new javax.swing.JLabel();
        lblReqEid = new javax.swing.JLabel();
        lblWelcomeMsg1 = new javax.swing.JLabel();
        lblIDniEmployee = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblRequestPortal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblFileForRequest = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblTypeOfLeave = new javax.swing.JLabel();
        lblStartdate = new javax.swing.JLabel();
        lblEnddate = new javax.swing.JLabel();
        lblReasonOfRequest = new javax.swing.JLabel();
        txtReasonOfRequest = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        txtLeavetype = new javax.swing.JComboBox<>();
        lblDate = new javax.swing.JLabel();
        lblDateToday = new javax.swing.JLabel();
        jDCStartDate = new com.toedter.calendar.JDateChooser();
        jDCEndDate = new com.toedter.calendar.JDateChooser();
        btnLeaveLog = new javax.swing.JButton();
        profile_button = new javax.swing.JButton();
        attendance_button = new javax.swing.JButton();
        salary_button = new javax.swing.JButton();

        lblFName.setForeground(new java.awt.Color(255, 255, 255));
        lblFName.setText("firstname");

        lblEid.setForeground(new java.awt.Color(255, 255, 255));
        lblEid.setText("EmployeeID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 226, 227));

        jPanel2.setBackground(new java.awt.Color(53, 66, 68));

        lblLogoMotorPH.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        lblLogoMotorPH.setForeground(new java.awt.Color(208, 228, 230));
        lblLogoMotorPH.setText("MotorPH");

        logOut_button.setBackground(new java.awt.Color(53, 66, 68));
        logOut_button.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        logOut_button.setForeground(new java.awt.Color(255, 255, 255));
        logOut_button.setText("Log out");
        logOut_button.setAutoscrolls(true);
        logOut_button.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        logOut_button.setBorderPainted(false);
        logOut_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_buttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(210, 214, 214));
        jLabel3.setText("|");

        lblReqFName.setFont(new java.awt.Font("Verdana", 1, 25)); // NOI18N
        lblReqFName.setForeground(new java.awt.Color(255, 255, 255));
        lblReqFName.setText("firstname");

        lblReqEid.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblReqEid.setForeground(new java.awt.Color(255, 255, 255));
        lblReqEid.setText("###");

        lblWelcomeMsg1.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        lblWelcomeMsg1.setForeground(new java.awt.Color(208, 228, 230));
        lblWelcomeMsg1.setText("Welcome,");

        lblIDniEmployee.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblIDniEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblIDniEmployee.setText("Employee ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblLogoMotorPH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(lblWelcomeMsg1)
                .addGap(18, 18, 18)
                .addComponent(lblReqFName)
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIDniEmployee)
                .addGap(12, 12, 12)
                .addComponent(lblReqEid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(logOut_button, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLogoMotorPH)
                        .addComponent(logOut_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(lblWelcomeMsg1)
                        .addComponent(lblReqFName)
                        .addComponent(lblReqEid)
                        .addComponent(lblIDniEmployee)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(108, 133, 136));

        lblRequestPortal.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblRequestPortal.setForeground(new java.awt.Color(255, 255, 255));
        lblRequestPortal.setText("Request Portal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(lblRequestPortal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRequestPortal, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(140, 172, 177));

        lblFileForRequest.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblFileForRequest.setForeground(new java.awt.Color(255, 255, 255));
        lblFileForRequest.setText("File for Leave Request");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFileForRequest)
                .addGap(385, 385, 385))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFileForRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(173, 202, 206));

        lblTypeOfLeave.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        lblTypeOfLeave.setForeground(new java.awt.Color(255, 255, 255));
        lblTypeOfLeave.setText("Type of Leave:");

        lblStartdate.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        lblStartdate.setForeground(new java.awt.Color(255, 255, 255));
        lblStartdate.setText("Start date:");

        lblEnddate.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        lblEnddate.setForeground(new java.awt.Color(255, 255, 255));
        lblEnddate.setText("End date:");

        lblReasonOfRequest.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        lblReasonOfRequest.setForeground(new java.awt.Color(255, 255, 255));
        lblReasonOfRequest.setText("Reason for Request:");

        txtReasonOfRequest.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnSubmit.setBackground(new java.awt.Color(108, 133, 136));
        btnSubmit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        txtLeavetype.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtLeavetype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sick Leave", "Emergency Leave", "Vacation Leave", "Bereavement Leave", "Single Parent Leave", "Maternity Leave" }));
        txtLeavetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeavetypeActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("02/21/2024");

        lblDateToday.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblDateToday.setForeground(new java.awt.Color(255, 255, 255));
        lblDateToday.setText("Date Today:");

        jDCStartDate.setDateFormatString("MM/dd/yyyy");
        jDCStartDate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jDCEndDate.setDateFormatString("MM/dd/yyyy");
        jDCEndDate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        btnLeaveLog.setBackground(new java.awt.Color(108, 133, 136));
        btnLeaveLog.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnLeaveLog.setForeground(new java.awt.Color(255, 255, 255));
        btnLeaveLog.setText("View Leave Request Log");
        btnLeaveLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLeavetype, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDCStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jDCEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                        .addComponent(btnLeaveLog, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblTypeOfLeave)
                            .addComponent(lblStartdate)
                            .addComponent(lblEnddate)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(lblReasonOfRequest)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtReasonOfRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lblDateToday)
                        .addGap(18, 18, 18)
                        .addComponent(lblDate)))
                .addGap(70, 70, 70))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(lblDateToday))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypeOfLeave)
                    .addComponent(txtLeavetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartdate)
                            .addComponent(jDCStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEnddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDCEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnLeaveLog, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReasonOfRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReasonOfRequest))
                .addGap(40, 40, 40)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        profile_button.setBackground(new java.awt.Color(53, 66, 68));
        profile_button.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        profile_button.setForeground(new java.awt.Color(255, 255, 255));
        profile_button.setText("Profile");
        profile_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_buttonActionPerformed(evt);
            }
        });

        attendance_button.setBackground(new java.awt.Color(53, 66, 68));
        attendance_button.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        attendance_button.setForeground(new java.awt.Color(255, 255, 255));
        attendance_button.setText("Attendance");
        attendance_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendance_buttonActionPerformed(evt);
            }
        });

        salary_button.setBackground(new java.awt.Color(53, 66, 68));
        salary_button.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        salary_button.setForeground(new java.awt.Color(255, 255, 255));
        salary_button.setText("Salary");
        salary_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salary_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profile_button, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(attendance_button, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(salary_button, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profile_button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendance_button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salary_button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:                                                                          
        // TODO add your handling code here:                                                                          
        // Get the values from text fields
        String employeeId = lblReqEid.getText();
        String date = lblDate.getText();
        String leaveType = (String) txtLeavetype.getSelectedItem();

        // Get the selected start and end dates from JDateChooser components
        Date startDate = jDCStartDate.getDate();
        Date endDate = jDCEndDate.getDate();

        // Convert dates to string format
        String startDateStr = formatDate(startDate); // Implement formatDate method to convert Date to String
        String endDateStr = formatDate(endDate);     // Implement formatDate method to convert Date to String

        String reasonOfRequest = txtReasonOfRequest.getText();

        // Check if any of the fields are empty
        if (employeeId.isEmpty() || date.isEmpty() || leaveType == null || leaveType.isEmpty() || startDate == null || endDate == null || reasonOfRequest.isEmpty()) {
            // Display an error message or handle the empty fields appropriately
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method without proceeding further
        }

        // Specify the full path to the CSV file
        String filePath = "src\\main\\java\\files\\Request.csv";

        // Save the values to a CSV file
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            // Check if the file is empty (i.e., if this is the first entry)
            File file = new File(filePath);
            if (file.length() == 0) { // If the file is empty, write the header row
                writer.println("Employee ID,Request Date,Leave Type,Start Date,End Date,Reason,Status,Approver,Date Responded");
            }

            // Get the last row index
            int lastRowIndex = getLastRowIndex(filePath);

            // Write the current entry as a new line
            writer.println(employeeId + "," + date + "," + leaveType + "," + startDateStr + "," + endDateStr + "," + reasonOfRequest + ",Pending,,");

            // Display a confirmation message
            JOptionPane.showMessageDialog(this, "Request submitted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }

        // Clear input fields after submission
        clearInputFields();
    }              

    // Method to get the last row index in the CSV file
    private int getLastRowIndex(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int rowCount = 0;
            while (reader.readLine() != null) {
                rowCount++;
            }
            return rowCount;
        } catch (IOException e) {
            e.printStackTrace();
            return -1; // Error occurred while reading the file
        }
    
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void profile_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_buttonActionPerformed
        // TODO add your handling code here:
        FrmEmployee_Information _profile = new FrmEmployee_Information();
        _profile.setVisible(true);
        _profile.setLocationRelativeTo(null); // Center the frame
          
            
            for (Employee infoemp: employee1){
                if (infoemp.GetEmployeeID() == Integer.parseInt(lblReqEid.getText())) {
                    _profile.setVisible(true);
                    _profile.getLblEmpStatus().setText(infoemp.GetStatus());
                    _profile.getTxtEmployeeID().setText(String.valueOf(infoemp.GetEmployeeID()));
                    _profile.getTxtFirstName().setText(infoemp.GetFirstName());
                    _profile.getTxtLastName().setText(infoemp.GetLastName());
                    _profile.getTxtRole().setText(infoemp.GetRole());
                    _profile.getTxtDepartment().setText(infoemp.GetDepartment());
                    _profile.getTxtSupervisor().setText(infoemp.GetSupervisor());
                    _profile.getTxtSSS_number().setText(infoemp.GetSSSNumber());
                    _profile.getTxtPagibig_number().setText(infoemp.GetPagibigNumber());
                    _profile.getTxtPhilhealth_number().setText(infoemp.GetPhilhealthNumber());
                    _profile.getTxtTin_number().setText(infoemp.GetTinNumber());
                    _profile.getLblEid().setText(String.valueOf(infoemp.GetEmployeeID()));
                    _profile.getLblFName().setText(infoemp.GetFirstName());
                            
                    System.out.println("sss" + infoemp.GetSSSNumber()+ infoemp.GetBirthday() + infoemp.GetDepartment() + infoemp.GetFirstName() +infoemp.GetLastName() +infoemp.GetPhilhealthNumber() +
                    infoemp.GetRole() + infoemp.GetStatus() +infoemp.GetSupervisor() + infoemp.GetTinNumber());
                    
                    
                    
                    
                    break;
                }
                else{
                    
                }
            }
            
            dispose();
    }//GEN-LAST:event_profile_buttonActionPerformed

    private void attendance_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendance_buttonActionPerformed
        // TODO add your handling code here:
       // Get the logged-in employee's ID and name
            String employeeId = lblReqEid.getText();
            String employeeName = lblReqFName.getText();

            // Open the attendance frame
            FrmAttendance attendance = new FrmAttendance();
            attendance.getLblAttEid().setText(employeeId);
            attendance.getLblAttFName().setText(employeeName);
            attendance.setVisible(true);
            attendance.setLocationRelativeTo(null); // Center the frame

            // Display attendance data for the logged-in employee
            attendance.displayTimeTrackerFromCSV(employeeId);

            // Close the current frame
            dispose();
    }//GEN-LAST:event_attendance_buttonActionPerformed

    private void salary_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salary_buttonActionPerformed
        // TODO add your handling code here:
        FrmSalary salary = new FrmSalary();
        FrmEmployee_Information _profile = new FrmEmployee_Information();
        salary.getLblSalEid().setText(lblReqEid.getText());
        salary.getLblSalFName().setText(lblReqFName.getText());
        salary.show();
        salary.setLocationRelativeTo(null); // Center the frame
            
            dispose();
    }//GEN-LAST:event_salary_buttonActionPerformed

    private void txtLeavetypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLeavetypeActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_txtLeavetypeActionPerformed

    private void btnLeaveLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveLogActionPerformed
        // TODO add your handling code here:
        
        FrmLeaveHistory history = new FrmLeaveHistory(this);
        history.getLblReqEid().setText(lblReqEid.getText());
         
        history.show();
        history.setLocationRelativeTo(null); // Center the frame
        
        String employeeId = lblReqEid.getText();
        history.displayDataForEmployee(employeeId); // Pass the employee ID 
    }//GEN-LAST:event_btnLeaveLogActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendance_button;
    private javax.swing.JButton btnLeaveLog;
    private javax.swing.JButton btnSubmit;
    private com.toedter.calendar.JDateChooser jDCEndDate;
    private com.toedter.calendar.JDateChooser jDCStartDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateToday;
    private javax.swing.JLabel lblEid;
    private javax.swing.JLabel lblEnddate;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblFileForRequest;
    private javax.swing.JLabel lblIDniEmployee;
    private javax.swing.JLabel lblLogoMotorPH;
    private javax.swing.JLabel lblReasonOfRequest;
    private javax.swing.JLabel lblReqEid;
    private javax.swing.JLabel lblReqFName;
    private javax.swing.JLabel lblRequestPortal;
    private javax.swing.JLabel lblStartdate;
    private javax.swing.JLabel lblTypeOfLeave;
    private javax.swing.JLabel lblWelcomeMsg1;
    private javax.swing.JButton logOut_button;
    private javax.swing.JButton profile_button;
    private javax.swing.JButton salary_button;
    private javax.swing.JComboBox<String> txtLeavetype;
    private javax.swing.JTextField txtReasonOfRequest;
    // End of variables declaration//GEN-END:variables
}
