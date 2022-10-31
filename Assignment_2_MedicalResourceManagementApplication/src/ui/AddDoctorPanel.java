/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Doctor;
import model.DoctorList;
import model.Hospital;
import model.HospitalList;
import model.Login;
import model.LoginClass;

/**
 *
 * @author amretasrerengarajan
 */
public class AddDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDoctorPanel
     */
    HospitalList hspList;
    DoctorList doctorList;
    LoginClass loginList;

    long doctorID;
    String doctorName;
    String doctorDepartment;
    String doctorHospName;
    String doctorHospComm;
    long doctorPhoneNumber;

    boolean isValidId;
    boolean isValidName;
    boolean isValidCommunity;
    boolean isValidPhoneNumber;

    public AddDoctorPanel(DoctorList doctorList, HospitalList hspList, LoginClass loginList) {
        initComponents();

        this.hspList = hspList;
        this.doctorList = doctorList;
        this.loginList = loginList;

        populateHospName();
        
        lblWarnDocID.setVisible(false);
        lblWarnDocName.setVisible(false);
        lblWarnDocNumber.setVisible(false);
        lblWarnHosComm.setVisible(false);
        
        txtPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblDoctorId = new javax.swing.JLabel();
        lblDoctorName = new javax.swing.JLabel();
        lblDoctorDept = new javax.swing.JLabel();
        lblDocHospName = new javax.swing.JLabel();
        lblHospComm = new javax.swing.JLabel();
        lblDocPhoneNumber = new javax.swing.JLabel();
        txtDoctorID = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        txtHospComm = new javax.swing.JTextField();
        txtDocPhoneNum = new javax.swing.JTextField();
        lblWarnDocID = new javax.swing.JLabel();
        lblWarnDocName = new javax.swing.JLabel();
        lblWarnHosComm = new javax.swing.JLabel();
        lblWarnDocNumber = new javax.swing.JLabel();
        btnAddDetails = new javax.swing.JButton();
        btnDrpDept = new javax.swing.JComboBox<>();
        btnDrpHospName = new javax.swing.JComboBox<>();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(51, 255, 204));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Add Doctors");

        lblDoctorId.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDoctorId.setForeground(new java.awt.Color(255, 0, 102));
        lblDoctorId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoctorId.setText("Doctor ID:");

        lblDoctorName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDoctorName.setForeground(new java.awt.Color(255, 0, 102));
        lblDoctorName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoctorName.setText("Doctor Name:");

        lblDoctorDept.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDoctorDept.setForeground(new java.awt.Color(255, 0, 102));
        lblDoctorDept.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoctorDept.setText("Department:");

        lblDocHospName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDocHospName.setForeground(new java.awt.Color(255, 0, 102));
        lblDocHospName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocHospName.setText("Hospital Name:");

        lblHospComm.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblHospComm.setForeground(new java.awt.Color(255, 0, 102));
        lblHospComm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospComm.setText("Hospital Community:");

        lblDocPhoneNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDocPhoneNumber.setForeground(new java.awt.Color(255, 0, 102));
        lblDocPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocPhoneNumber.setText("Doctor Phone Number:");

        txtDoctorID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDoctorIDFocusLost(evt);
            }
        });

        txtDoctorName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDoctorNameFocusLost(evt);
            }
        });

        txtHospComm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHospCommFocusLost(evt);
            }
        });

        txtDocPhoneNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDocPhoneNumFocusLost(evt);
            }
        });

        lblWarnDocID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblWarnDocID.setForeground(new java.awt.Color(255, 0, 0));
        lblWarnDocID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarnDocID.setText("Invalid!");

        lblWarnDocName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblWarnDocName.setForeground(new java.awt.Color(255, 0, 0));
        lblWarnDocName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarnDocName.setText("Invalid!");

        lblWarnHosComm.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblWarnHosComm.setForeground(new java.awt.Color(255, 0, 0));
        lblWarnHosComm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarnHosComm.setText("Invalid!");

        lblWarnDocNumber.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblWarnDocNumber.setForeground(new java.awt.Color(255, 0, 0));
        lblWarnDocNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarnDocNumber.setText("Invalid!");

        btnAddDetails.setBackground(new java.awt.Color(204, 255, 204));
        btnAddDetails.setForeground(new java.awt.Color(0, 204, 0));
        btnAddDetails.setText("Add Details");
        btnAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetailsActionPerformed(evt);
            }
        });

        btnDrpDept.setMaximumRowCount(4);
        btnDrpDept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiology Department", "Gynecology  Depatment", "Pediatrician Department", "Dentistry", " " }));
        btnDrpDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrpDeptActionPerformed(evt);
            }
        });

        btnDrpHospName.setMaximumRowCount(4);

        lblUserName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 0, 102));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("Doctor User Name:");

        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 0, 102));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("New Password:");

        txtPassword.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDoctorId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDoctorDept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDocHospName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHospComm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDocPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddDetails)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoctorID, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoctorName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDocPhoneNum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDrpDept, javax.swing.GroupLayout.Alignment.LEADING, 0, 206, Short.MAX_VALUE)
                                    .addComponent(btnDrpHospName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHospComm, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblWarnDocID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWarnDocName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWarnHosComm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWarnDocNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                .addGap(55, 55, 55)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorId)
                    .addComponent(txtDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarnDocID))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorName)
                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarnDocName))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorDept)
                    .addComponent(btnDrpDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocHospName)
                    .addComponent(btnDrpHospName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospComm)
                    .addComponent(lblWarnHosComm)
                    .addComponent(txtHospComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocPhoneNumber)
                    .addComponent(txtDocPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarnDocNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAddDetails)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populateHospName() {
        for (Hospital hospital : hspList.getHospital()) {
            btnDrpHospName.addItem(hospital.getHosName());
        }
    }

    private void txtDoctorIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDoctorIDFocusLost
        // TODO add your handling code here:
        doctorID = checkDoctorID(txtDoctorID.getText());
        if (doctorID == 0 && !isValidId) {
            lblWarnDocID.setVisible(true);
            txtDoctorID.setText("");
        } else if (txtDoctorID.getText().equals("")) {
            lblWarnDocID.setVisible(false);
        }
    }//GEN-LAST:event_txtDoctorIDFocusLost

    private void txtDoctorNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDoctorNameFocusLost
        // TODO add your handling code here:
        doctorName = checkDoctorName(txtDoctorName.getText());
        if (!isValidName) {
            lblWarnDocName.setVisible(isValidName);
            txtDoctorName.setText("");
        } else if (txtDoctorName.getText().equals("")) {
            lblWarnDocName.setVisible(false);
        }
    }//GEN-LAST:event_txtDoctorNameFocusLost

    private void txtHospCommFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHospCommFocusLost
        // TODO add your handling code here:
        doctorHospComm = checkDoctorHospComm(txtHospComm.getText());
        if (!isValidCommunity) {
            lblWarnHosComm.setVisible(isValidCommunity);
            txtDoctorName.setText("");
        } else if (txtDoctorName.getText().equals("")) {
            lblWarnHosComm.setVisible(false);
        }
    }//GEN-LAST:event_txtHospCommFocusLost

    private void txtDocPhoneNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDocPhoneNumFocusLost
        // TODO add your handling code here:
        doctorPhoneNumber = checkDoctorID(txtDoctorID.getText());
        if (doctorPhoneNumber == 0 && !isValidPhoneNumber) {
            lblWarnDocNumber.setVisible(true);
            txtDocPhoneNum.setText("");
        } else if (txtDocPhoneNum.getText().equals("")) {
            lblWarnDocNumber.setVisible(false);
        }
    }//GEN-LAST:event_txtDocPhoneNumFocusLost

    private void btnAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailsActionPerformed
        // TODO add your handling code here:
        doctorDepartment = String.valueOf(btnDrpDept.getSelectedItem());
        doctorHospName = String.valueOf(btnDrpHospName.getSelectedItem());

        if (txtDocPhoneNum.getText().equals("") || txtDoctorID.getText().equals("")
                || txtDoctorName.getText().equals("") || txtHospComm.getText().equals("") ||
                txtUserName.getText().equals("") || txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory!");
        } else {

            Doctor newDoctor = doctorList.addDoctor();
            Login newUser = loginList.addUsers();

            newDoctor.setDoctorID(doctorID);
            newDoctor.setDoctorName(doctorName);
            newDoctor.setDoctorDept(doctorName);
            newDoctor.setDoctorHospName(doctorHospName);
            newDoctor.setDoctorHospComm(doctorHospComm);
            newDoctor.setDoctorNum(doctorPhoneNumber);
            
            newUser.setUserName(txtUserName.getText());
            newUser.setPassword(txtPassword.getText());
            newUser.setUserType("Doctor");

            JOptionPane.showMessageDialog(this, "New Doctor Details Added!");

            txtDoctorID.setText("");
            txtDoctorName.setText("");
            txtHospComm.setText("");
            txtDocPhoneNum.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
        }
    }//GEN-LAST:event_btnAddDetailsActionPerformed

    private void btnDrpDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrpDeptActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDrpDeptActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
        txtUserName.setText(txtDoctorName.getText());
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        // TODO add your handling code here:
        txtUserName.setText(txtDoctorName.getText());
    }//GEN-LAST:event_txtUserNameFocusGained
    public long checkDoctorID(String doctorID) {
        String regex = "\\d{5}";
        long result;
        isValidId = doctorID.matches(regex);
        if (isValidId && !doctorID.isEmpty()) {
            result = Long.parseLong(doctorID);
        } else {
            result = 0;
        }
        return result;
    }

    public String checkDoctorName(String doctorName) {
        String regex = "^[\\p{L} .'-]+$";
        isValidName = doctorName.matches(regex);
        if (isValidName) {
            return doctorName;
        } else {
            return "";
        }
    }

    public String checkDoctorHospComm(String doctorComm) {
        String regex = "^[\\p{L} .'-]+$";
        isValidCommunity = doctorComm.matches(regex);
        if (isValidCommunity) {
            return doctorComm;
        } else {
            return "";
        }
    }

    public long checkDoctorPhoneNumber(String doctorNum) {
        String regex = "\\d{10}";
        long result;
        isValidPhoneNumber = doctorNum.matches(regex);
        if (isValidPhoneNumber && !doctorNum.isEmpty()) {
            result = Long.parseLong(doctorNum);
        } else {
            result = 0;
        }
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDetails;
    private javax.swing.JComboBox<String> btnDrpDept;
    private javax.swing.JComboBox<String> btnDrpHospName;
    private javax.swing.JLabel lblDocHospName;
    private javax.swing.JLabel lblDocPhoneNumber;
    private javax.swing.JLabel lblDoctorDept;
    private javax.swing.JLabel lblDoctorId;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblHospComm;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblWarnDocID;
    private javax.swing.JLabel lblWarnDocName;
    private javax.swing.JLabel lblWarnDocNumber;
    private javax.swing.JLabel lblWarnHosComm;
    private javax.swing.JTextField txtDocPhoneNum;
    private javax.swing.JTextField txtDoctorID;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtHospComm;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}