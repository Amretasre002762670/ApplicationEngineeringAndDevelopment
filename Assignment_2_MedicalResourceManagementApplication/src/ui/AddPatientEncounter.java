/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Encounter;
import model.PatientRecord;
import model.PatientRecordList;
import model.Person;
import model.PersonList;

/**
 *
 * @author amretasrerengarajan
 */
public class AddPatientEncounter extends javax.swing.JPanel {

    /**
     * Creates new form AddPatientEncounter
     */
    PatientRecord patientRecord;
    PatientRecordList patientList;
    PersonList personList;

    boolean isSysPresValid;
    boolean isDiaPresValid;
    boolean isDateValid;
    boolean isBreathingRateValid;
    boolean isHeartBeatValid;
    boolean isTemperatureValid;

    long patientID;
    String patientName;
    int patientSysPressure;
    int patientDiaPressure;
    int patientBreathing;
    int patientHeartRate;
    float patientTemperature;
    String patientEncounterDateTaken;
    String patientNxtAppointment;

    public AddPatientEncounter(PatientRecordList patientList, PatientRecord patientRecord, PersonList personList) {
        initComponents();

        this.patientList = patientList;
        this.patientRecord = patientRecord;
        this.personList = personList;

        lblWarningDate.setVisible(false);
        lblWarningDiaPressure.setVisible(false);
        lblWarningBreathing.setVisible(false);
        lblWarningHeartBeat.setVisible(false);
        lblWarningTemperature.setVisible(false);
        lblWarningSysPressure.setVisible(false);
        lblWarningNxtAppt.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblAddEncounterTitle = new javax.swing.JLabel();
        lblSearchType = new javax.swing.JLabel();
        rdBtnPatientId = new javax.swing.JRadioButton();
        rdBtnPatientName = new javax.swing.JRadioButton();
        lblSearchBox = new javax.swing.JLabel();
        txtSearchField = new javax.swing.JTextField();
        btnSearchPatient = new javax.swing.JButton();
        lblWarningSysPressure = new javax.swing.JLabel();
        lblWarningDate = new javax.swing.JLabel();
        lblDiaPressure = new javax.swing.JLabel();
        txtDiaPressure = new javax.swing.JTextField();
        lblWarningDiaPressure = new javax.swing.JLabel();
        lblBreathing = new javax.swing.JLabel();
        txtBreathing = new javax.swing.JTextField();
        lblWarningBreathing = new javax.swing.JLabel();
        lblHeartBeat = new javax.swing.JLabel();
        txtHeartBeat = new javax.swing.JTextField();
        lblWarningHeartBeat = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        lblWarningTemperature = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        lblSysPressure = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();
        lblDateTaken = new javax.swing.JLabel();
        txtDateTaken = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtSysPressure = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        btnAddRecord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblNewAppointment = new javax.swing.JLabel();
        txtNewAppoinment = new javax.swing.JTextField();
        lblWarningNxtAppt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 255, 204));

        lblAddEncounterTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAddEncounterTitle.setForeground(new java.awt.Color(255, 0, 204));
        lblAddEncounterTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddEncounterTitle.setText("Add Patient Encounter!");

        lblSearchType.setForeground(new java.awt.Color(255, 0, 204));
        lblSearchType.setText("Search Patient By:");

        buttonGroup1.add(rdBtnPatientId);
        rdBtnPatientId.setText("Patient Id");
        rdBtnPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnPatientIdActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdBtnPatientName);
        rdBtnPatientName.setText("Patient Name");
        rdBtnPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtnPatientNameActionPerformed(evt);
            }
        });

        lblSearchBox.setForeground(new java.awt.Color(255, 0, 204));
        lblSearchBox.setText("Search");

        btnSearchPatient.setBackground(new java.awt.Color(204, 255, 204));
        btnSearchPatient.setForeground(new java.awt.Color(0, 204, 0));
        btnSearchPatient.setText("Search Patient");
        btnSearchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPatientActionPerformed(evt);
            }
        });

        lblWarningSysPressure.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningSysPressure.setText("Invalid!");

        lblWarningDate.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningDate.setText("Invalid Date!");

        lblDiaPressure.setForeground(new java.awt.Color(255, 0, 153));
        lblDiaPressure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDiaPressure.setText("Diastolic Pressure:");

        txtDiaPressure.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaPressureFocusLost(evt);
            }
        });

        lblWarningDiaPressure.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningDiaPressure.setText("Invalid!");

        lblBreathing.setForeground(new java.awt.Color(255, 0, 153));
        lblBreathing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBreathing.setText("Breathing");

        txtBreathing.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBreathingFocusLost(evt);
            }
        });

        lblWarningBreathing.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningBreathing.setText("Invalid!");

        lblHeartBeat.setForeground(new java.awt.Color(255, 0, 153));
        lblHeartBeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeartBeat.setText("Heart Beats:");

        txtHeartBeat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHeartBeatFocusLost(evt);
            }
        });

        lblWarningHeartBeat.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningHeartBeat.setText("Invalid!");

        lblPatientId.setForeground(new java.awt.Color(255, 0, 153));
        lblPatientId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientId.setText("Patient ID:");

        lblWarningTemperature.setForeground(new java.awt.Color(255, 0, 0));
        lblWarningTemperature.setText("Invalid!");

        lblPatientName.setForeground(new java.awt.Color(255, 0, 153));
        lblPatientName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientName.setText("Patient Name:");

        txtTemperature.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTemperatureFocusLost(evt);
            }
        });

        lblSysPressure.setForeground(new java.awt.Color(255, 0, 153));
        lblSysPressure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSysPressure.setText("Systolic Pressure:");

        lblTemperature.setForeground(new java.awt.Color(255, 0, 153));
        lblTemperature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemperature.setText("Temperature:");

        lblDateTaken.setForeground(new java.awt.Color(255, 0, 153));
        lblDateTaken.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDateTaken.setText("Date Taken: ");

        txtDateTaken.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateTakenFocusLost(evt);
            }
        });
        txtDateTaken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateTakenActionPerformed(evt);
            }
        });

        txtPatientName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPatientNameFocusLost(evt);
            }
        });

        txtSysPressure.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSysPressureFocusLost(evt);
            }
        });

        txtPatientID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPatientIDFocusLost(evt);
            }
        });

        btnAddRecord.setBackground(new java.awt.Color(204, 255, 204));
        btnAddRecord.setForeground(new java.awt.Color(0, 204, 0));
        btnAddRecord.setText("Add Record");
        btnAddRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecordActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Encounter Details!");

        lblNewAppointment.setForeground(new java.awt.Color(255, 0, 153));
        lblNewAppointment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewAppointment.setText("Next Appointment:");

        txtNewAppoinment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNewAppoinmentFocusLost(evt);
            }
        });

        lblWarningNxtAppt.setForeground(new java.awt.Color(255, 0, 51));
        lblWarningNxtAppt.setText("Invalid Date!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearchType, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(rdBtnPatientId)
                        .addGap(72, 72, 72)
                        .addComponent(rdBtnPatientName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSearchBox)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSysPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBreathing, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHeartBeat, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDateTaken, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(btnAddRecord)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblWarningHeartBeat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblWarningBreathing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblWarningDiaPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblWarningSysPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWarningDate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWarningTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnSearchPatient)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAddEncounterTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblTemperature, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeartBeat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBreathing, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDiaPressure, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(lblSysPressure, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPatientName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPatientId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDateTaken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNewAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewAppoinment, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblWarningNxtAppt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblSearchBox, lblSearchType});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblAddEncounterTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchType)
                    .addComponent(rdBtnPatientId)
                    .addComponent(rdBtnPatientName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchBox)
                    .addComponent(txtSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchPatient))
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientId)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSysPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSysPressure)
                    .addComponent(lblWarningSysPressure))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiaPressure)
                    .addComponent(lblWarningDiaPressure))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBreathing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBreathing)
                    .addComponent(lblWarningBreathing))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeartBeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeartBeat)
                    .addComponent(lblWarningHeartBeat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperature)
                    .addComponent(lblWarningTemperature))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateTaken)
                    .addComponent(txtDateTaken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewAppointment)
                    .addComponent(txtNewAppoinment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWarningNxtAppt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddRecord)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

//    public int checkPatientID(String patientID) {
//        String regex = "\\d{5}";
//        int result;
//        isIdValid = patientID.matches(regex);
//        if (isIdValid && !patientID.isEmpty()) {
//            result = Integer.parseInt(patientID);
//        } else {
//            result = 0;
//        }
//        return result;
//    }
//
//    public String checkPatientName(String patientName) {
//        String regex = "^[a-zA-Z]*$";
//        isNameValid = patientName.matches(regex);
//        if (isNameValid) {
//            return patientName;
//        } else {
//            return "";
//        }
//    }
    public int checkSystolicPressure(String sysPressure) {
        String regex = "\\d{3}";
        int result;
        isSysPresValid = sysPressure.matches(regex);
        if (sysPressure.isEmpty()) {
            result = 0;
        } else {
            result = Integer.parseInt(sysPressure);
        }
        if (isSysPresValid && (result >= 120 || result <= 140)) {
            return result;
        } else {
            result = 0;
            return result;
        }
    }

    public int checkDiastolicPressure(String diaPressure) {
        String regex = "\\d{2}";
        int result;
        isDiaPresValid = diaPressure.matches(regex);
        if (diaPressure.isEmpty()) {
            result = 0;
        } else {
            result = Integer.parseInt(diaPressure);
        }
        if (isDiaPresValid && (result >= 80 || result <= 89)) {
            return result;
        } else {
            result = 0;
            return result;
        }
    }

    public int checkBreathing(String breathingRate) {
        String regex = "\\d{2}";
        int result;
        isBreathingRateValid = breathingRate.matches(regex);
        if (isBreathingRateValid && !breathingRate.isEmpty()) {
            result = Integer.parseInt(breathingRate);
        } else {
            result = 0;
        }
        return result;
    }

    public int checkHeartBeat(String heartBeat) {
        String regex = "\\d{2}";
        int result;
        isHeartBeatValid = heartBeat.matches(regex);
        if (isHeartBeatValid && !heartBeat.isEmpty()) {
            result = Integer.parseInt(heartBeat);
        } else {
            result = 0;
        }
        return result;
    }

    public float checkTemperature(String temperature) {
        String regex = "[+-]?([0-9]*[.])?[0-9]+";
        float result;
        isTemperatureValid = temperature.matches(regex);
        if (isTemperatureValid && !temperature.isEmpty()) {
            result = Float.parseFloat(temperature);
        } else {
            result = 0.0F;
        }
        return result;
    }

    public String checkDateTaken(String dateTaken) {
        String regex = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
        //Creating a pattern object
        Pattern pattern = Pattern.compile(regex);
        //Matching the compiled pattern in the String
        Matcher matcher = pattern.matcher(dateTaken);
        isDateValid = matcher.matches();
        if (isDateValid) {
            return dateTaken;
        } else {
            return "";
        }
    }

    private void rdBtnPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnPatientIdActionPerformed
        // TODO add your handling code here:
        rdBtnPatientId.setActionCommand("Patient ID");
    }//GEN-LAST:event_rdBtnPatientIdActionPerformed

    private void rdBtnPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtnPatientNameActionPerformed
        // TODO add your handling code here:
        rdBtnPatientName.setActionCommand("Patient Name");
    }//GEN-LAST:event_rdBtnPatientNameActionPerformed

    private void btnSearchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPatientActionPerformed
        // TODO add your handling code here:
        boolean searchResult;
        PatientRecord searchPatientResult = new PatientRecord();
        if (buttonGroup1.getSelection().getActionCommand().equals("Patient ID")) {
            searchResult = patientList.searchPersonByPatientID(Long.parseLong(txtSearchField.getText()));
            if (searchResult) {
                searchPatientResult = patientList.getPersonDetailsWithPatientId(Long.parseLong(txtSearchField.getText()));
                txtPatientID.setText(String.valueOf(searchPatientResult.getPersonId()));
                txtPatientName.setText(searchPatientResult.getPersonName());

                txtSearchField.setText("");

            } else if (txtSearchField.equals("")) {
                JOptionPane.showMessageDialog(this, "This field cannot be empty");
            } else {
                JOptionPane.showMessageDialog(this, "No patient records found. Create Patient Records First");
                txtSearchField.setText("");
            }
        } else if (buttonGroup1.getSelection().getActionCommand().equals("Patient Name")) {
            searchResult = patientList.searchPersonByPatientName(txtSearchField.getText());
            if (searchResult) {
                searchPatientResult = patientList.getPersonDetailsWithPatientName(txtSearchField.getText());
                txtPatientID.setText(String.valueOf(searchPatientResult.getPersonId()));
                txtPatientName.setText(searchPatientResult.getPersonName());

                txtSearchField.setText("");

            } else if (txtSearchField.equals("")) {
                JOptionPane.showMessageDialog(this, "This field cannot be empty");
            } else {
                JOptionPane.showMessageDialog(this, "No patient records found. Create Patient Record First");
                txtSearchField.setText("");
            }
        }
    }//GEN-LAST:event_btnSearchPatientActionPerformed

    private void txtDiaPressureFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaPressureFocusLost
        // TODO add your handling code here:
        patientDiaPressure = checkDiastolicPressure(txtDiaPressure.getText());
        if (txtDiaPressure.getText().isEmpty()) {
            lblWarningDiaPressure.setVisible(false);
        } else {
            if (patientDiaPressure == 0) {
                txtPatientID.setText("");
                lblWarningDiaPressure.setVisible(true);
            } else {
                lblWarningDiaPressure.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtDiaPressureFocusLost

    private void txtBreathingFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBreathingFocusLost
        // TODO add your handling code here:
        patientBreathing = checkBreathing(txtBreathing.getText());
        if (txtBreathing.getText().isEmpty()) {
            lblWarningBreathing.setVisible(false);
        } else {
            if (patientBreathing == 0) {
                txtBreathing.setText("");
                lblWarningBreathing.setVisible(true);
            } else {
                lblWarningBreathing.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtBreathingFocusLost

    private void txtHeartBeatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHeartBeatFocusLost
        // TODO add your handling code here:
        patientHeartRate = checkHeartBeat(txtHeartBeat.getText());
        if (txtHeartBeat.getText().isEmpty()) {
            lblWarningHeartBeat.setVisible(false);
        } else {
            if (patientHeartRate == 0) {
                txtHeartBeat.setText("");
                lblWarningHeartBeat.setVisible(true);
            } else {
                lblWarningHeartBeat.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtHeartBeatFocusLost

    private void txtTemperatureFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTemperatureFocusLost
        // TODO add your handling code here:
        patientTemperature = checkTemperature(txtTemperature.getText());
        if (txtTemperature.getText().isEmpty()) {
            lblWarningTemperature.setVisible(false);
        } else {
            if (patientTemperature == 0.0) {
                txtTemperature.setText(String.valueOf(patientTemperature));
                lblWarningTemperature.setVisible(true);
            } else {
                lblWarningTemperature.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtTemperatureFocusLost

    private void txtDateTakenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateTakenFocusLost
        // TODO add your handling code here:
        String typedEncounterDate = txtDateTaken.getText();
        patientEncounterDateTaken = checkDateTaken(typedEncounterDate);
        if (typedEncounterDate.isEmpty()) {
            lblWarningDate.setVisible(false);
        } else {
            if (isDateValid) {
                lblWarningDate.setVisible(false);
            } else {
                //                txtDateTaken.setText("");
                lblWarningDate.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtDateTakenFocusLost

    private void txtDateTakenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateTakenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateTakenActionPerformed

    private void txtPatientNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPatientNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameFocusLost

    private void txtSysPressureFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSysPressureFocusLost
        // TODO add your handling code here:
        patientSysPressure = checkSystolicPressure(txtSysPressure.getText());
        if (txtSysPressure.getText().isEmpty()) {
            lblWarningSysPressure.setVisible(false);
        } else {
            if (patientSysPressure == 0) {
                txtSysPressure.setText("");
                lblWarningSysPressure.setVisible(true);
            } else {
                lblWarningSysPressure.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtSysPressureFocusLost

    private void txtPatientIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPatientIDFocusLost
        // TODO add your handling code here
    }//GEN-LAST:event_txtPatientIDFocusLost

    private void btnAddRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecordActionPerformed
        // TODO add your handling code here:

        if (txtBreathing.getText().isEmpty() || txtDateTaken.getText().isEmpty() || txtDiaPressure.getText().isEmpty()
                || txtHeartBeat.getText().isEmpty()
                || txtSysPressure.getText().isEmpty() || txtTemperature.getText().isEmpty() || txtNewAppoinment.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "All fields are mandatory");

        } else {

            patientID = Long.parseLong(txtPatientID.getText());
            patientName = txtPatientName.getText();

            PatientRecord patient = patientList.getPersonDetailsWithPatientId(patientID);

            Encounter newEncounter = patient.addEncounters();

            newEncounter.setBeats(patientHeartRate);
            newEncounter.setBreathing(patientBreathing);
            newEncounter.setDateTaken(patientEncounterDateTaken);
            newEncounter.setDiastolicPressure(patientDiaPressure);
            newEncounter.setSystolicPressure(patientSysPressure);
            newEncounter.setTemperature(patientTemperature);
            newEncounter.setNextAppointment(patientNxtAppointment);

            JOptionPane.showMessageDialog(this, "Added encounter to existing patient");

            lblWarningDate.setVisible(false);
            lblWarningDiaPressure.setVisible(false);
            lblWarningBreathing.setVisible(false);
            lblWarningHeartBeat.setVisible(false);
            lblWarningTemperature.setVisible(false);
            lblWarningSysPressure.setVisible(false);
            lblWarningNxtAppt.setVisible(false);

            txtBreathing.setText("");
            txtDateTaken.setText("");
            txtDiaPressure.setText("");
            txtHeartBeat.setText("");
            txtPatientID.setText("");
            txtPatientName.setText("");
            txtSysPressure.setText("");
            txtTemperature.setText("");

        }
    }//GEN-LAST:event_btnAddRecordActionPerformed

    private void txtNewAppoinmentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNewAppoinmentFocusLost
        // TODO add your handling code here:
        String typedDate = txtNewAppoinment.getText();
        patientNxtAppointment = checkDateTaken(typedDate);
        if (typedDate.isEmpty()) {
            lblWarningDate.setVisible(false);
        } else {
            if (isDateValid) {
                lblWarningNxtAppt.setVisible(false);

            } else {
                lblWarningNxtAppt.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtNewAppoinmentFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRecord;
    private javax.swing.JButton btnSearchPatient;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddEncounterTitle;
    private javax.swing.JLabel lblBreathing;
    private javax.swing.JLabel lblDateTaken;
    private javax.swing.JLabel lblDiaPressure;
    private javax.swing.JLabel lblHeartBeat;
    private javax.swing.JLabel lblNewAppointment;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblSearchBox;
    private javax.swing.JLabel lblSearchType;
    private javax.swing.JLabel lblSysPressure;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblWarningBreathing;
    private javax.swing.JLabel lblWarningDate;
    private javax.swing.JLabel lblWarningDiaPressure;
    private javax.swing.JLabel lblWarningHeartBeat;
    private javax.swing.JLabel lblWarningNxtAppt;
    private javax.swing.JLabel lblWarningSysPressure;
    private javax.swing.JLabel lblWarningTemperature;
    private javax.swing.JRadioButton rdBtnPatientId;
    private javax.swing.JRadioButton rdBtnPatientName;
    private javax.swing.JTextField txtBreathing;
    private javax.swing.JTextField txtDateTaken;
    private javax.swing.JTextField txtDiaPressure;
    private javax.swing.JTextField txtHeartBeat;
    private javax.swing.JTextField txtNewAppoinment;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtSearchField;
    private javax.swing.JTextField txtSysPressure;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
