/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.PatientRecord;
import model.PatientRecordList;
import model.PersonList;

/**
 *
 * @author amretasrerengarajan
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanel
     */
    PatientRecord patientRecord;
    PatientRecordList patientRecordList;
    PersonList personList;
//    PatientRecordList fullPatientRecord;
    public DoctorPanel(PatientRecord patientRecord, PatientRecordList patientRecordList, PersonList personList) {
        initComponents();
        this.patientRecord = patientRecord;
        this.patientRecordList = patientRecordList;
        this.personList = personList;
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
        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnAddRecord = new javax.swing.JButton();
        btnNewPatient = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 255, 204));

        lblTitle.setBackground(new java.awt.Color(255, 0, 255));
        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 0, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Doctors Panel!");

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(255, 0, 204));

        btnView.setText("View All");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnSearch.setText("Search Record");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAddRecord.setText("Add Existing Record");
        btnAddRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecordActionPerformed(evt);
            }
        });

        btnNewPatient.setText("Add New Patient Record");
        btnNewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddRecord)
                    .addComponent(btnNewPatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch)
                    .addComponent(btnView))
                .addGap(50, 50, 50))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddRecord, btnNewPatient, btnSearch, btnView});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnAddRecord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnNewPatient))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        splitPane.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(splitPane)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(splitPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecordActionPerformed
        // TODO add your handling code here:
        AddPatientEncounter addEncounterPanel = new AddPatientEncounter(patientRecordList, patientRecord, personList);
        splitPane.setBottomComponent(addEncounterPanel);
    }//GEN-LAST:event_btnAddRecordActionPerformed

    private void btnNewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPatientActionPerformed
        // TODO add your handling code here:
        AddPatientPanel addPatientPanel = new AddPatientPanel(patientRecordList, personList);
        splitPane.setBottomComponent(addPatientPanel);
    }//GEN-LAST:event_btnNewPatientActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        ViewPatientPanel viewEncounterRecord = new ViewPatientPanel(patientRecordList, patientRecord, personList);
        splitPane.setBottomComponent(viewEncounterRecord);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        ViewPersonPanel viewPersonDetails = new ViewPersonPanel(personList);
        splitPane.setBottomComponent(viewPersonDetails);
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRecord;
    private javax.swing.JButton btnNewPatient;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}