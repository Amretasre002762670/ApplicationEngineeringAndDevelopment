/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.PatientRecordList;
import model.Person;
import model.PersonList;

/**
 *
 * @author amretasrerengarajan
 */
public class AddPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPatientPanel
     */
    boolean isValidId;
    boolean isValidName;
    boolean isValidComm;
    boolean isValidCity;
    boolean isValidPincode;

    int patientID;
    String patientName;
    String patientComm;
    String patientCity;
    long patientPincode;

    PatientRecordList patientList;
    PersonList personList;

    public AddPatientPanel(PatientRecordList patientList, PersonList personList) {
        initComponents();

        this.patientList = patientList;
        this.personList = personList;

        lblWarningCity.setVisible(false);
        lblWarningComm.setVisible(false);
        lblWarningPatID.setVisible(false);
        lblWarningPatName.setVisible(false);
        lblWarningPincode.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the
     * form.WARNING: Do NOT modify this code.The content of this method is
     * always regenerated by the Form Editor.
     *
     * @param patientID
     * @return
     */
    @SuppressWarnings("unchecked")

    public int checkPatientID(String patientID) {
        String regex = "\\d{5}";
        int result;
        isValidId = patientID.matches(regex);
        if (isValidId && !patientID.isEmpty()) {
            result = Integer.parseInt(patientID);
        } else {
            result = 0;
        }
        return result;
    }

    public String checkPatientName(String patientName) {
        String regex = "^[a-zA-Z]*$";
        isValidName = patientName.matches(regex);
        if (isValidName) {
            return patientName;
        } else {
            return "";
        }
    }

    public String checkPatientComm(String patientComm) {
        String regex = "^[\\p{L} .'-]+$";
        isValidComm = patientComm.matches(regex);
        if (isValidComm) {
            return patientComm;
        } else {
            return "";
        }
    }

    public String checkPatientCity(String patientCity) {
        String regex = "^[a-zA-Z]*$";
        isValidCity = patientCity.matches(regex);
        if (isValidCity && (patientCity.equals("Boston") || patientCity.equals("boston"))) {
            return patientCity;
        } else {
            return "";
        }
    }

    public long checkPincode(String patientPincode) {
        String regex = "\\d{5}";
        long result;
        isValidPincode = patientPincode.matches(regex);
        if (isValidPincode && !patientPincode.isEmpty()) {
            result = Long.parseLong(patientPincode);
        } else {
            result = 0;
        }
        return result;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPatientCity = new javax.swing.JTextField();
        lblWarningCity = new javax.swing.JLabel();
        lblPatientPincode = new javax.swing.JLabel();
        txtPatientPincode = new javax.swing.JTextField();
        lblWarningPincode = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblPatientComm = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientComm = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        btnAddPatient = new javax.swing.JButton();
        lblWarningPatID = new javax.swing.JLabel();
        lblWarningPatName = new javax.swing.JLabel();
        lblWarningComm = new javax.swing.JLabel();
        lblPatienCity = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Patient Details!");

        txtPatientCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPatientCityFocusLost(evt);
            }
        });

        lblWarningCity.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningCity.setText("Boston or boston!");

        lblPatientPincode.setText("Pincode:");

        txtPatientPincode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPatientPincodeFocusLost(evt);
            }
        });

        lblWarningPincode.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningPincode.setText("Invalid!");

        lblPatientId.setText("Patient ID:");

        lblPatientName.setText("Patient Name:");

        lblPatientComm.setText("Community:");

        txtPatientName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPatientNameFocusLost(evt);
            }
        });

        txtPatientComm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPatientCommFocusLost(evt);
            }
        });

        txtPatientID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPatientIDFocusLost(evt);
            }
        });

        btnAddPatient.setText("Add Patient Record");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        lblWarningPatID.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningPatID.setText("Invalid ID!");

        lblWarningPatName.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningPatName.setText("Invalid Text!");

        lblWarningComm.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningComm.setText("Invalid!");

        lblPatienCity.setText("City:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPatientPincode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPatienCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPatientComm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPatientName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(lblPatientId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPatientPincode, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblWarningPincode, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPatientName)
                                    .addComponent(txtPatientComm, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblWarningPatName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblWarningComm, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblWarningPatID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAddPatient)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblWarningCity, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblWarningCity, lblWarningComm, lblWarningPatID, lblWarningPatName, lblWarningPincode});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningPatID)
                    .addComponent(lblPatientId))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningPatName)
                    .addComponent(lblPatientName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningComm)
                    .addComponent(lblPatientComm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningCity)
                    .addComponent(lblPatienCity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientPincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningPincode)
                    .addComponent(lblPatientPincode))
                .addGap(29, 29, 29)
                .addComponent(btnAddPatient)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblPatienCity, lblPatientComm, lblPatientId, lblPatientName, lblPatientPincode});

    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPatientCityFocusLost
        // TODO add your handling code here:
        String typedPatientCity = txtPatientCity.getText();
        patientCity = checkPatientCity(typedPatientCity);
        if (typedPatientCity.isEmpty()) {
            lblWarningCity.setVisible(false);
        } else {
            if (isValidCity) {
                lblWarningCity.setVisible(false);
            } else {
                lblWarningCity.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtPatientCityFocusLost

    private void txtPatientPincodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPatientPincodeFocusLost
        // TODO add your handling code here:
        patientPincode = checkPincode(txtPatientPincode.getText());
        if (txtPatientPincode.getText().isEmpty()) {
            lblWarningPincode.setVisible(false);
        } else {
            if (patientPincode == 0) {
                txtPatientPincode.setText("");
                lblWarningPincode.setVisible(true);
            } else {
                lblWarningPincode.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtPatientPincodeFocusLost

    private void txtPatientNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPatientNameFocusLost
        // TODO add your handling code here:
        String typedPatientName = txtPatientName.getText();
        patientName = checkPatientName(typedPatientName);
        if (typedPatientName.isEmpty()) {
            lblWarningPatName.setVisible(false);
        } else {
            if (isValidName) {
                lblWarningPatName.setVisible(false);
            } else {
                lblWarningPatName.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtPatientNameFocusLost

    private void txtPatientCommFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPatientCommFocusLost
        // TODO add your handling code here:
        String typedPatientComm = txtPatientComm.getText();
        patientComm = checkPatientComm(typedPatientComm);
        if (typedPatientComm.isEmpty()) {
            lblWarningComm.setVisible(false);
        } else {
            if (isValidComm) {
                lblWarningComm.setVisible(false);
            } else {
                lblWarningComm.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtPatientCommFocusLost

    private void txtPatientIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPatientIDFocusLost
        // TODO add your handling code here:
        patientID = checkPatientID(txtPatientID.getText());
        if (txtPatientID.getText().isEmpty()) {
            lblWarningPatID.setVisible(false);
        } else {
            if (patientID == 0) {
                txtPatientID.setText("");
                lblWarningPatID.setVisible(true);
            } else {
                lblWarningPatID.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtPatientIDFocusLost

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        boolean checkPatientExistsInPerson = personList.checkPersonDetailsExist(patientID, patientName);
        
        if (txtPatientCity.getText().isEmpty() || txtPatientComm.getText().isEmpty() || txtPatientID.getText().isEmpty()
                || txtPatientName.getText().isEmpty() || txtPatientPincode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory");
        } else {
            if (checkPatientExistsInPerson) {
                JOptionPane.showMessageDialog(this, "This patient already exists! Add in Patient Record");
                txtPatientCity.setText("");
                txtPatientComm.setText("");
                txtPatientID.setText("");
                txtPatientName.setText("");
                txtPatientPincode.setText("");
            } else {
                Person newPerson = personList.addPersonAddressDetails();

                newPerson.setPersonId(patientID);
                newPerson.setPersonName(patientName);
                newPerson.setPersonCommunity(patientComm);
                newPerson.setPersonCity(patientCity);
                newPerson.setPincode(patientPincode);

                lblWarningCity.setVisible(false);
                lblWarningComm.setVisible(false);
                lblWarningPatID.setVisible(false);
                lblWarningPatName.setVisible(false);
                lblWarningPincode.setVisible(false);

                JOptionPane.showMessageDialog(this, "New Patient Records Added");

                txtPatientCity.setText("");
                txtPatientComm.setText("");
                txtPatientID.setText("");
                txtPatientName.setText("");
                txtPatientPincode.setText("");
                
                
            }
        }
    }//GEN-LAST:event_btnAddPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPatienCity;
    private javax.swing.JLabel lblPatientComm;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientPincode;
    private javax.swing.JLabel lblWarningCity;
    private javax.swing.JLabel lblWarningComm;
    private javax.swing.JLabel lblWarningPatID;
    private javax.swing.JLabel lblWarningPatName;
    private javax.swing.JLabel lblWarningPincode;
    private javax.swing.JTextField txtPatientCity;
    private javax.swing.JTextField txtPatientComm;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientPincode;
    // End of variables declaration//GEN-END:variables
}
