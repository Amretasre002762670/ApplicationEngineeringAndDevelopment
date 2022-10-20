/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Person;
import model.PersonList;

/**
 *
 * @author amretasrerengarajan
 */
public class UserLoginWindow extends javax.swing.JPanel {

    /**
     * Creates new form UserLoginWindow
     */
    
    PersonList prsnList;
    long userID;
    boolean isEmailIDValid;
    String emailID;
    String password;
    long pincode;

    
    public UserLoginWindow(PersonList prsnList) {
        initComponents();
        this.prsnList = prsnList;
        lblWarningUserid.setVisible(false);
        lblWarningEmailId.setVisible(false);
        lblWarningPincode.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserLoginTitle = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnUserLogin = new javax.swing.JButton();
        lblWarningUserid = new javax.swing.JLabel();
        lblWarningEmailId = new javax.swing.JLabel();
        lblWarningPassword = new javax.swing.JLabel();
        lblPincode = new javax.swing.JLabel();
        txtPincode = new javax.swing.JTextField();
        lblWarningPincode = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 51));
        setForeground(new java.awt.Color(255, 0, 0));

        lblUserLoginTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblUserLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserLoginTitle.setText("Enter User Credentials");

        lblUserId.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(51, 51, 255));
        lblUserId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserId.setText("User ID:");

        lblEmailId.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblEmailId.setForeground(new java.awt.Color(51, 51, 255));
        lblEmailId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmailId.setText("Email ID:");

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 51, 255));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password:");

        txtUserId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserIdFocusLost(evt);
            }
        });
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });

        txtEmailId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailIdFocusLost(evt);
            }
        });

        btnUserLogin.setForeground(new java.awt.Color(0, 153, 51));
        btnUserLogin.setText("Add User");
        btnUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserLoginActionPerformed(evt);
            }
        });

        lblWarningUserid.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningUserid.setText("Invalid User ID!");

        lblWarningEmailId.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningEmailId.setText("Invalid Email ID!");

        lblPincode.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        lblPincode.setForeground(new java.awt.Color(51, 51, 255));
        lblPincode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPincode.setText("Pincode:");

        txtPincode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPincodeFocusLost(evt);
            }
        });
        txtPincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPincodeActionPerformed(evt);
            }
        });

        lblWarningPincode.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningPincode.setText("Invalid Pincode!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUserLoginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPincode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(txtEmailId)
                            .addComponent(txtPassword)
                            .addComponent(txtPincode))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblWarningUserid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWarningEmailId, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(lblWarningPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWarningPincode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(btnUserLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblUserLoginTitle)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserId)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningUserid))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailId)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningEmailId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningPassword))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPincode)
                    .addComponent(txtPincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningPincode))
                .addGap(49, 49, 49)
                .addComponent(btnUserLogin)
                .addContainerGap(165, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void btnUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserLoginActionPerformed
        // TODO add your handling code here:
        password = txtPassword.getText();
        
        Person person = prsnList.addPersonAddressDetails();
        
        if(userID == 0 || emailID.isEmpty() || password.isEmpty() ||  pincode == 0) {
            
            JOptionPane.showMessageDialog(this, "Every Field Should Be Filled!");
        } else {
            
            person.setPersonId(userID);
            person.setPincode(pincode);
            
            lblWarningUserid.setVisible(false);
            lblWarningEmailId.setVisible(false);
            lblWarningPincode.setVisible(false);
            
            JOptionPane.showMessageDialog(this, "User Added!");
            
            txtEmailId.setText("");
            txtPassword.setText("");
            txtPincode.setText("");
            txtUserId.setText("");
        }
        
    }//GEN-LAST:event_btnUserLoginActionPerformed

    private void txtUserIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserIdFocusLost
        // TODO add your handling code here:
        userID = checkUserID(txtUserId.getText());
        String labelUserIDText = lblUserId.getText();
        if(labelUserIDText.isEmpty()){
            lblWarningUserid.setVisible(false);
        } else {
            if(userID == 0) {
                txtUserId.setText("");
                lblWarningUserid.setVisible(true);
            } else {
                lblWarningUserid.setVisible(false);
            }
        }
        
    }//GEN-LAST:event_txtUserIdFocusLost

    private void txtEmailIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailIdFocusLost
        // TODO add your handling code here:
        String userEnteredEmail = txtEmailId.getText();
        emailID = checkEmailID(userEnteredEmail); 
        if(userEnteredEmail.isEmpty()) {
            lblWarningUserid.setVisible(false);
        } else {
            if(isEmailIDValid) {
                lblWarningUserid.setVisible(false);
            } else {
                lblWarningEmailId.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_txtEmailIdFocusLost

    private void txtPincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPincodeActionPerformed

    private void txtPincodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPincodeFocusLost
        // TODO add your handling code here:
        pincode = checkPincode(txtPincode.getText());
        String pincodeEntered = txtPincode.getText();
        if(pincodeEntered.isEmpty()) {
            lblWarningPincode.setVisible(false);
        } else {
            if(pincode == 0) {
                txtPincode.setText("");
                lblWarningPincode.setVisible(true);
            } else {
                lblWarningPincode.setVisible(false);
            }
        }  
    }//GEN-LAST:event_txtPincodeFocusLost
    public long checkUserID(String userID) {
        String regex = "\\d{5}";
        long result;
        boolean userIdValid = userID.matches(regex);
        if (userIdValid) {
            result = Long.parseLong(userID);
        } else {
            result = 0;
        }
        return result;
    }
    
    public String checkEmailID(String emailId){
        String regex = "^\\S+@\\S+\\.\\S+$";
        
        isEmailIDValid = emailId.matches(regex);
        if(isEmailIDValid) {
            return emailId;      
        } else {
            return "";  
        }        
    }
    
    
    public long checkPincode(String pincode) {
       String regex = "\\d{5}";
       long result;
       boolean pincodeValid = pincode.matches(regex);
        if (pincodeValid) {
            result = Long.parseLong(pincode);
        } else {
            result = 0;
        }
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserLogin;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPincode;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserLoginTitle;
    private javax.swing.JLabel lblWarningEmailId;
    private javax.swing.JLabel lblWarningPassword;
    private javax.swing.JLabel lblWarningPincode;
    private javax.swing.JLabel lblWarningUserid;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPincode;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
