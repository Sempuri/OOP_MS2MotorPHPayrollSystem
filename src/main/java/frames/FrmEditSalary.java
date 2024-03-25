/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import classes.CSVFileManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author EMAN
 */
public class FrmEditSalary extends javax.swing.JFrame {

    private FrmPayrollpage payrollPageRef;
    /**
     * Creates new form FrmEditSalary
     */
    public FrmEditSalary(FrmPayrollpage payrollPageRef) {
        initComponents();
        this.payrollPageRef = payrollPageRef;
        }

        //event handler method for close button
        private void FrameClose(java.awt.event.MouseEvent evt) {                            
            this.dispose();
        }       

        //method for populating textfields
        public void populateFields(String[] empInfo) {
            txtEmployeeID.setText(empInfo[0]);
            txtLastName.setText(empInfo[1]);
            txtFirstName.setText(empInfo[2]);

            // Assuming empInfo[3] contains a string representing the date in "MM/dd/yyyy" format
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
            try {
                Date date = dateFormat.parse(empInfo[3]); // Parse the date string
                jDCBirthday.setDate(date); // Set the date in the JDateChooser
            } catch (ParseException ex) {
                ex.printStackTrace(); // Handle parsing exception
            }


            txtAddress.setText(empInfo[4]);
            txtPhoneNum.setText(empInfo[5]);
            txtSSSNum.setText(empInfo[6]);
            txtPhilhealthNum.setText(empInfo[7]);
            txtTINNum.setText(empInfo[8]);
            txtPagibigNum.setText(empInfo[9]);
            txtStatus.setText(empInfo[10]);
            txtPosition.setText(empInfo[11]);
            txtDepartment.setText(empInfo[12]);
            txtSupervisor.setText(empInfo[13]);
            txtBasicSalary.setText(empInfo[14]);
            txtRiceSubsidy.setText(empInfo[15]);
            txtPhoneAllowance.setText(empInfo[16]);
            txtClothingAllowance.setText(empInfo[17]);
            txtGrossSemi.setText(empInfo[18]);
            txtHourlyRate.setText(empInfo[19]);

        }


        //method for clearing textfields
        private void clearTextFields() {
            txtEmployeeID.setText("");
            txtLastName.setText("");
            txtFirstName.setText("");
            jDCBirthday.setDate(null);
            txtAddress.setText("");
            txtPhoneNum.setText("");
            txtSSSNum.setText("");
            txtPhilhealthNum.setText("");
            txtTINNum.setText("");
            txtPagibigNum.setText("");
            txtStatus.setText("");
            txtPosition.setText("");
            txtDepartment.setText("");
            txtSupervisor.setText("");
            txtBasicSalary.setText("");
            txtRiceSubsidy.setText("");
            txtPhoneAllowance.setText("");
            txtClothingAllowance.setText("");
            txtGrossSemi.setText("");
            txtHourlyRate.setText("");
        }

        // Method to validate input
        private boolean validateInput() {
            try {
                // Validate numeric fields
                Integer.parseInt(txtEmployeeID.getText());
                Double.parseDouble(txtBasicSalary.getText());
                Double.parseDouble(txtRiceSubsidy.getText());
                Double.parseDouble(txtPhoneAllowance.getText());
                Double.parseDouble(txtClothingAllowance.getText());
                Double.parseDouble(txtGrossSemi.getText());
                Double.parseDouble(txtHourlyRate.getText());

            return true; // Return true if all fields pass validation
        } catch (NumberFormatException | NullPointerException ex) {
            return false; // Return false if any field fails validation
        }
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
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblBirthday = new javax.swing.JLabel();
        lblAddress1 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNum = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        lblSSS = new javax.swing.JLabel();
        txtSSSNum = new javax.swing.JTextField();
        lblPhilhealth = new javax.swing.JLabel();
        txtPhilhealthNum = new javax.swing.JTextField();
        lblTIN = new javax.swing.JLabel();
        txtTINNum = new javax.swing.JTextField();
        lblPagibig = new javax.swing.JLabel();
        txtPagibigNum = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblPosition = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblDepartment = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        lblSupervisor = new javax.swing.JLabel();
        txtSupervisor = new javax.swing.JTextField();
        lblBSalary = new javax.swing.JLabel();
        txtBasicSalary = new javax.swing.JTextField();
        lblRiceSub = new javax.swing.JLabel();
        txtRiceSubsidy = new javax.swing.JTextField();
        lblPhoneAllowance = new javax.swing.JLabel();
        txtPhoneAllowance = new javax.swing.JTextField();
        lblClothingAllowance = new javax.swing.JLabel();
        txtClothingAllowance = new javax.swing.JTextField();
        lblGrossSemi = new javax.swing.JLabel();
        txtGrossSemi = new javax.swing.JTextField();
        lblHourlyRate = new javax.swing.JLabel();
        txtHourlyRate = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jDCBirthday = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(218, 224, 234));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(78, 99, 140));
        jLabel1.setText("Edit Salary Information");

        lblEmployeeID.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblEmployeeID.setForeground(new java.awt.Color(78, 99, 140));
        lblEmployeeID.setText("Employee ID:");

        txtEmployeeID.setEditable(false);
        txtEmployeeID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblLastName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(78, 99, 140));
        lblLastName.setText("Last Name:");

        txtLastName.setEditable(false);
        txtLastName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblFirstName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(78, 99, 140));
        lblFirstName.setText("First Name:");

        txtFirstName.setEditable(false);
        txtFirstName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblBirthday.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBirthday.setForeground(new java.awt.Color(78, 99, 140));
        lblBirthday.setText("Birthday:");

        lblAddress1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblAddress1.setForeground(new java.awt.Color(78, 99, 140));
        lblAddress1.setText("Address:");

        txtAddress.setEditable(false);
        txtAddress.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblPhoneNum.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPhoneNum.setForeground(new java.awt.Color(78, 99, 140));
        lblPhoneNum.setText("Phone #:");

        txtPhoneNum.setEditable(false);
        txtPhoneNum.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblSSS.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSSS.setForeground(new java.awt.Color(78, 99, 140));
        lblSSS.setText("SSS #:");

        txtSSSNum.setEditable(false);
        txtSSSNum.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblPhilhealth.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPhilhealth.setForeground(new java.awt.Color(78, 99, 140));
        lblPhilhealth.setText("Philhealth #:");

        txtPhilhealthNum.setEditable(false);
        txtPhilhealthNum.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblTIN.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblTIN.setForeground(new java.awt.Color(78, 99, 140));
        lblTIN.setText("TIN #:");

        txtTINNum.setEditable(false);
        txtTINNum.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblPagibig.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPagibig.setForeground(new java.awt.Color(78, 99, 140));
        lblPagibig.setText("Pag-ibig #:");

        txtPagibigNum.setEditable(false);
        txtPagibigNum.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblStatus.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(78, 99, 140));
        lblStatus.setText("Status:");

        txtStatus.setEditable(false);
        txtStatus.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblPosition.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPosition.setForeground(new java.awt.Color(78, 99, 140));
        lblPosition.setText("Position:");

        txtPosition.setEditable(false);
        txtPosition.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblDepartment.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblDepartment.setForeground(new java.awt.Color(78, 99, 140));
        lblDepartment.setText("Department:");

        txtDepartment.setEditable(false);
        txtDepartment.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblSupervisor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblSupervisor.setForeground(new java.awt.Color(78, 99, 140));
        lblSupervisor.setText("Supervisor:");

        txtSupervisor.setEditable(false);
        txtSupervisor.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblBSalary.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBSalary.setForeground(new java.awt.Color(78, 99, 140));
        lblBSalary.setText("Basic Salary:");

        txtBasicSalary.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblRiceSub.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblRiceSub.setForeground(new java.awt.Color(78, 99, 140));
        lblRiceSub.setText("Rice Subsidy:");

        txtRiceSubsidy.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblPhoneAllowance.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPhoneAllowance.setForeground(new java.awt.Color(78, 99, 140));
        lblPhoneAllowance.setText("Phone Allowance:");

        txtPhoneAllowance.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblClothingAllowance.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblClothingAllowance.setForeground(new java.awt.Color(78, 99, 140));
        lblClothingAllowance.setText("Clothing Allowance:");

        txtClothingAllowance.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblGrossSemi.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblGrossSemi.setForeground(new java.awt.Color(78, 99, 140));
        lblGrossSemi.setText("Gross Semi-Monthly Rate:");

        txtGrossSemi.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblHourlyRate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblHourlyRate.setForeground(new java.awt.Color(78, 99, 140));
        lblHourlyRate.setText("Hourly Rate:");

        txtHourlyRate.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

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

        jDCBirthday.setDateFormatString("MM/dd/yyyy");
        jDCBirthday.setEnabled(false);
        jDCBirthday.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAddress1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPhoneNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSSS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSSSNum, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPhilhealth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPhilhealthNum, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTIN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTINNum, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPagibig)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPagibigNum, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmployeeID)
                                .addGap(50, 50, 50)
                                .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblBirthday))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(jDCBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHourlyRate)
                            .addComponent(lblGrossSemi)
                            .addComponent(lblClothingAllowance)
                            .addComponent(lblPhoneAllowance)
                            .addComponent(lblRiceSub)
                            .addComponent(lblBSalary)
                            .addComponent(lblSupervisor)
                            .addComponent(lblDepartment)
                            .addComponent(lblPosition)
                            .addComponent(lblStatus))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRiceSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClothingAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrossSemi, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(310, 310, 310))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRiceSubsidy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtClothingAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGrossSemi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeID)
                            .addComponent(lblStatus)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(lblPosition)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepartment)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFirstName)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBirthday)
                                .addComponent(lblSupervisor))
                            .addComponent(jDCBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBSalary)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAddress1)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhoneNum)
                            .addComponent(lblRiceSub)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSSS)
                            .addComponent(lblPhoneAllowance)
                            .addComponent(txtSSSNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhilhealth)
                            .addComponent(lblClothingAllowance)
                            .addComponent(txtPhilhealthNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTIN)
                            .addComponent(lblGrossSemi)
                            .addComponent(txtTINNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPagibig)
                            .addComponent(lblHourlyRate)
                            .addComponent(txtPagibigNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(35, 35, 35))
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

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        // Validate input before saving
        if (!validateInput()) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please check the fields and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Get the selected row index
        int selectedRowIndex = payrollPageRef.getTblEmpInfo().getSelectedRow();
        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select an employee to edit.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Prepare empInfo array with updated employee information
        String[] empInfo = {
            txtEmployeeID.getText(),                // Employee ID
            txtLastName.getText(),                  // Last Name
            txtFirstName.getText(),                 // First Name
            new SimpleDateFormat("MM/dd/yyyy").format(jDCBirthday.getDate()), // Birthday
            txtAddress.getText(),                   // Address
            txtPhoneNum.getText(),                  // Phone Number
            txtSSSNum.getText(),                    // SSS Number
            txtPhilhealthNum.getText(),             // Philhealth Number
            txtTINNum.getText(),                    // TIN Number
            txtPagibigNum.getText(),                // Pagibig Number
            txtStatus.getText(),                    // Status
            txtPosition.getText(),                  // Position
            txtDepartment.getText(),                // Department
            txtSupervisor.getText(),                // Supervisor
            txtBasicSalary.getText(),               // Basic Salary
            txtRiceSubsidy.getText(),               // Rice Subsidy
            txtPhoneAllowance.getText(),            // Phone Allowance
            txtClothingAllowance.getText(),         // Clothing Allowance
            txtGrossSemi.getText(),                 // Gross Semi
            txtHourlyRate.getText()                 // Hourly Rate
        };

        // Update table in FrmHRpage with the edited employee record
        payrollPageRef.updateTableRow(selectedRowIndex, empInfo);

        // Update CSV file with data from the table in FrmHRpage
        String csvFilePath = "src\\main\\java\\files\\Employee.csv";
        JTable table = payrollPageRef.getTblEmpInfo(); // Assuming getTable() returns the JTable instance in FrmHRpage
        CSVFileManager.updateCSVFile(csvFilePath, table);

        // Show success message
        JOptionPane.showMessageDialog(this, "Employee record updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

        // Clear text fields after saving
        clearTextFields();
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEditSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FrmEditSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private com.toedter.calendar.JDateChooser jDCBirthday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress1;
    private javax.swing.JLabel lblBSalary;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblClothingAllowance;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGrossSemi;
    private javax.swing.JLabel lblHourlyRate;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPagibig;
    private javax.swing.JLabel lblPhilhealth;
    private javax.swing.JLabel lblPhoneAllowance;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblRiceSub;
    private javax.swing.JLabel lblSSS;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSupervisor;
    private javax.swing.JLabel lblTIN;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBasicSalary;
    private javax.swing.JTextField txtClothingAllowance;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGrossSemi;
    private javax.swing.JTextField txtHourlyRate;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPagibigNum;
    private javax.swing.JTextField txtPhilhealthNum;
    private javax.swing.JTextField txtPhoneAllowance;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtRiceSubsidy;
    private javax.swing.JTextField txtSSSNum;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtSupervisor;
    private javax.swing.JTextField txtTINNum;
    // End of variables declaration//GEN-END:variables
}
