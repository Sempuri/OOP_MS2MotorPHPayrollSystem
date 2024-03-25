/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import javax.swing.JLabel;
import javax.swing.JTable;
import classes.Employee;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.Component;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
/**
 *
 * @author EMAN
 */
public class FrmHRpage extends javax.swing.JFrame {

    /**
     * Creates new form FrmHRpage
     */
    public FrmHRpage() {
        initComponents();
        
        // Set custom renderer for the date column
        setCustomDateRenderer();
    }

 //for creation of new row -> for add new employee
    public void updateTable(String[] empInfo) {
        DefaultTableModel model = (DefaultTableModel) tblEmpInfo.getModel();
        String[] formattedEmpInfo = new String[empInfo.length];
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        // Format the date field before adding it to the array
        formattedEmpInfo[3] = dateFormat.format(new Date());
        System.out.println("Formatted Date: " + formattedEmpInfo[3]); // Debug

        // Copy other fields directly
        for (int i = 0; i < empInfo.length; i++) {
            if (i != 3) { // Skip the date field, it's already formatted
                formattedEmpInfo[i] = empInfo[i];
            }
        }

        // Add the formatted employee information to the table model
        model.addRow(formattedEmpInfo);
    }
    
    //for updating a specific row -> for edit employee info (for Employee Information)
    public void updateTableRow(int rowIndex, String[] empInfo) {
        DefaultTableModel model = (DefaultTableModel) tblEmpInfo.getModel();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        // Format the date field before updating the table
        empInfo[3] = dateFormat.format(new Date());
        System.out.println("Formatted Date: " + empInfo[3]); // Debug

        // Update the specified row in the table model
        for (int i = 0; i < empInfo.length; i++) {
            model.setValueAt(empInfo[i], rowIndex, i);
        }
    }
    
    
    //for updating a specific row -> for edit employee info (for Leave Request)
    public void updateLeaveTableRow(int rowIndex, String[] leaveInfo) {
        DefaultTableModel model = (DefaultTableModel) tblLeaveReq.getModel();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        // Format the date field before updating the table
        leaveInfo[1] = dateFormat.format(new Date());
        leaveInfo[3] = dateFormat.format(new Date());
        leaveInfo[4] = dateFormat.format(new Date());
        leaveInfo[8] = dateFormat.format(new Date());
        
        System.out.println("Formatted Date: " + leaveInfo[3]); // Debug

        // Update the specified row in the table model
        for (int i = 0; i < leaveInfo.length; i++) {
            model.setValueAt(leaveInfo[i], rowIndex, i);
        }
    }
    
    //for updating a specific row -> for edit employee info (for Overtime Request)
    public void updateOvertimeTableRow(int rowIndex, String[] overtimeInfo) {
        DefaultTableModel model = (DefaultTableModel) tblOvertimeReq.getModel();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

        // Format the date field before updating the table
        overtimeInfo[1] = dateFormat.format(new Date());
        overtimeInfo[2] = dateFormat.format(new Date());
        overtimeInfo[8] = dateFormat.format(new Date());
        
        System.out.println("Formatted Date: " + overtimeInfo[2]); // Debug

        // Update the specified row in the table model
        for (int i = 0; i < overtimeInfo.length; i++) {
            model.setValueAt(overtimeInfo[i], rowIndex, i);
        }
    }
    
    
    
    // Method to set custom renderer for the date column
    private void setCustomDateRenderer() {
        TableCellRenderer renderer = new DefaultTableCellRenderer() {
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus,
                                                           int row, int column) {
                if (value instanceof Date) {
                    value = formatter.format(value); // Format the date before rendering
                }
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        };

        // Apply the renderer to the date column (replace 3 with the actual index of the date column)
        tblEmpInfo.getColumnModel().getColumn(3).setCellRenderer(renderer);
        tblLeaveReq.getColumnModel().getColumn(1).setCellRenderer(renderer);
        tblLeaveReq.getColumnModel().getColumn(3).setCellRenderer(renderer);
        tblLeaveReq.getColumnModel().getColumn(4).setCellRenderer(renderer);
        tblLeaveReq.getColumnModel().getColumn(8).setCellRenderer(renderer);
        tblOvertimeReq.getColumnModel().getColumn(1).setCellRenderer(renderer);
        tblOvertimeReq.getColumnModel().getColumn(2).setCellRenderer(renderer);
        tblOvertimeReq.getColumnModel().getColumn(8).setCellRenderer(renderer);
    }
    
    //getter
    public JLabel getLblEid() {

        return lblEid;
    }

    public JLabel getLblFName() {    
        return lblFName;
    }

    public JTable getTblEmpInfo() {
        return tblEmpInfo;
    }

    public JTable getTblLeaveReq() {
        return tblLeaveReq;
    }

    public JTable getTblOvertimeReq() {
        return tblOvertimeReq;
    }

    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(value = "unchecked")

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpInfo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLeaveReq = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOvertimeReq = new javax.swing.JTable();
        lblEmpInfoTable = new javax.swing.JLabel();
        lblLeaveRequestTable = new javax.swing.JLabel();
        lblOvertimeRequestTable = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRespondOvertime = new javax.swing.JButton();
        btnRespondLeave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 224, 234));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(78, 99, 140));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblWelcomeMsg.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        lblWelcomeMsg.setForeground(new java.awt.Color(208, 228, 230));
        lblWelcomeMsg.setText("Welcome, HR");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWelcomeMsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFName)
                .addGap(224, 224, 224)
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

        tblEmpInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpID", "Last Name", "First Name", "Birthday", "Address", "Phone #", "SSS #", "Philhealth #", "TIN #", "Pag-ibig #", "Status", "Position", "Department", "Supervisor", "B. Salary", "Rice Subsidy", "Phone Allowance", "Clothing Allowance", "Gross Semi MR", "Houry Rate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmpInfo);

        tblLeaveReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpID", "Date of Request", "Leave Type", "Start Date", "End Date", "Reason", "Status", "Approver", "Approved Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLeaveReq);

        tblOvertimeReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpID", "Date of Request", "Date of OT", "Time In", "Time Out", "Tot Worked Hrs", "Status", "Approver", "Date Responded"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblOvertimeReq);

        lblEmpInfoTable.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblEmpInfoTable.setForeground(new java.awt.Color(78, 99, 140));
        lblEmpInfoTable.setText("Employee Information Table:");

        lblLeaveRequestTable.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblLeaveRequestTable.setForeground(new java.awt.Color(78, 99, 140));
        lblLeaveRequestTable.setText("Leave Request Table:");

        lblOvertimeRequestTable.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblOvertimeRequestTable.setForeground(new java.awt.Color(78, 99, 140));
        lblOvertimeRequestTable.setText("Overtime Request Table:");

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

        btnRespondOvertime.setBackground(new java.awt.Color(78, 99, 140));
        btnRespondOvertime.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnRespondOvertime.setForeground(new java.awt.Color(255, 255, 255));
        btnRespondOvertime.setText("Respond");
        btnRespondOvertime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespondOvertimeActionPerformed(evt);
            }
        });

        btnRespondLeave.setBackground(new java.awt.Color(78, 99, 140));
        btnRespondLeave.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnRespondLeave.setForeground(new java.awt.Color(255, 255, 255));
        btnRespondLeave.setText("Respond");
        btnRespondLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespondLeaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEmpInfoTable)
                .addGap(546, 546, 546))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(lblOvertimeRequestTable))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(btnRespondOvertime)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRespondLeave)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLeaveRequestTable)
                        .addGap(221, 221, 221))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(36, 36, 36)
                        .addComponent(btnEdit)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(552, 552, 552))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lblEmpInfoTable)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLeaveRequestTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblOvertimeRequestTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRespondOvertime)
                            .addComponent(btnRespondLeave))))
                .addGap(14, 14, 14))
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
        FrmNewEmployee _addEmployee = new FrmNewEmployee(this);
        _addEmployee.setVisible(true);
        _addEmployee.setLocationRelativeTo(null); // Center the frame
    
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
      // Get the selected row index
        int selectedRowIndex = tblEmpInfo.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve the data from the selected row
        DefaultTableModel model = (DefaultTableModel) tblEmpInfo.getModel();
        String[] empInfo = new String[model.getColumnCount()];
        for (int i = 0; i < model.getColumnCount(); i++) {
            empInfo[i] = model.getValueAt(selectedRowIndex, i).toString();
        }

        // Pass the reference to the existing FrmHRpage instance to FrmEditEmployee
        FrmEditEmployee editEmployeeForm = new FrmEditEmployee(this); // Pass the reference
        editEmployeeForm.populateFields(empInfo);
        editEmployeeForm.setVisible(true);
        editEmployeeForm.setLocationRelativeTo(null); // Center the frame
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        // Get the selected row index
        int selectedRowIndex = tblEmpInfo.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve the data from the selected row
        DefaultTableModel model = (DefaultTableModel) tblEmpInfo.getModel();
        String[] empInfo = new String[model.getColumnCount()];
        for (int i = 0; i < model.getColumnCount(); i++) {
            empInfo[i] = model.getValueAt(selectedRowIndex, i).toString();
        }

        // Pass the reference to the existing FrmHRpage instance to FrmEditEmployee
        FrmDeleteEmployee deleteEmployeeForm = new FrmDeleteEmployee(this); // Pass the reference
        deleteEmployeeForm.populateFields(empInfo);
        deleteEmployeeForm.setVisible(true);
        deleteEmployeeForm.setLocationRelativeTo(null); // Center the frame
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRespondOvertimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespondOvertimeActionPerformed
        // TODO add your handling code here:
        // Get the selected row index
        int selectedRowIndex = tblOvertimeReq.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to respond.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve the data from the selected row
        DefaultTableModel model = (DefaultTableModel) tblOvertimeReq.getModel();
        String[] overtimeInfo = new String[model.getColumnCount()];
        for (int i = 0; i < model.getColumnCount(); i++) {
            Object value = model.getValueAt(selectedRowIndex, i);
            overtimeInfo[i] = (value != null) ? value.toString() : ""; // Handle null values gracefully
        }

        // Pass the reference to the existing FrmHRpage instance to FrmEditOvertime
        FrmEditOvertime editOvertimeRequest = new FrmEditOvertime(this); // Pass the reference
        editOvertimeRequest.populateFields(overtimeInfo);
        editOvertimeRequest.setVisible(true);
        editOvertimeRequest.setLocationRelativeTo(null); // Center the frame
    }//GEN-LAST:event_btnRespondOvertimeActionPerformed

    private void btnRespondLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespondLeaveActionPerformed
        // TODO add your handling code here:
        // Get the selected row index
        int selectedRowIndex = tblLeaveReq.getSelectedRow();

        // Check if a row is selected
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to respond.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve the data from the selected row
        DefaultTableModel model = (DefaultTableModel) tblLeaveReq.getModel();
        String[] leaveInfo = new String[model.getColumnCount()];
        for (int i = 0; i < model.getColumnCount(); i++) {
            Object value = model.getValueAt(selectedRowIndex, i);
            leaveInfo[i] = (value != null) ? value.toString() : ""; // Handle null values gracefully
        }

        // Pass the reference to the existing FrmHRpage instance to FrmEditLeave
        FrmEditLeave editLeaveRequest = new FrmEditLeave(this); // Pass the reference
        editLeaveRequest.populateFields(leaveInfo);
        editLeaveRequest.setVisible(true);
        editLeaveRequest.setLocationRelativeTo(null); // Center the frame
    }//GEN-LAST:event_btnRespondLeaveActionPerformed

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
            java.util.logging.Logger.getLogger(FrmHRpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHRpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHRpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHRpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHRpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRespondLeave;
    private javax.swing.JButton btnRespondOvertime;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblEid;
    private javax.swing.JLabel lblEmpInfoTable;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblIDniEmployee;
    private javax.swing.JLabel lblLeaveRequestTable;
    private javax.swing.JLabel lblLogoMotorPH;
    private javax.swing.JLabel lblOvertimeRequestTable;
    private javax.swing.JLabel lblWelcomeMsg;
    private javax.swing.JButton logOut_button;
    private javax.swing.JTable tblEmpInfo;
    private javax.swing.JTable tblLeaveReq;
    private javax.swing.JTable tblOvertimeReq;
    // End of variables declaration//GEN-END:variables
}
