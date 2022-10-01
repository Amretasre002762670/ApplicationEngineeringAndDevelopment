/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.EmpDetail;
import model.EmpDetailsList;

/**
 *
 * @author amretasrerengarajan
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    EmpDetailsList empList;
    boolean backButton;
    
    public ViewJPanel(EmpDetailsList empList) {
        initComponents();
        
        // creating reference for the employee array list
        this.empList = empList;
        
        //to update the table when the class in initialised
        addTableRows();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpDetails1 = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEmpDetails = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        tblEmpDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Joining Date", "Skills", "Deployed Team", "Position ", "Email ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEmpDetails1);

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Employee Details");

        tblEmpDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Joining Date", "Skills", "Deployed Team", "Position ", "Email ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblEmpDetails);

        btnUpdate.setText("Update Details");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Details");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                .addGap(350, 350, 350))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(150, 150, 150))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        int empInd = tblEmpDetails.getSelectedRow();
        
        //checking if the user has chosen any row that is to be updated
        if(empInd < 0 ) {
            //if there is no row selected then a dialog is displayed
            JOptionPane.showMessageDialog(this, "Select the Employee to be Updated.");
            return;
        }
        
        DefaultTableModel empTable = (DefaultTableModel) tblEmpDetails.getModel();

        //getting the employee details that is to be deleted
        EmpDetail selectedEmp = (EmpDetail) empTable.getValueAt(empInd, 1);
        
        UpdatePanel updatePanel = new UpdatePanel(selectedEmp, empList, empInd);
//        boolean isBackButtonPressed = backButton;
//        if(isBackButtonPressed) {
//            jScrollPane3.setViewport(JTable tblEmpDetails);
//        } else {
//            jScrollPane3.setViewportView(updatePanel);
//        }
        btnUpdate.setVisible(false);
        btnDelete.setVisible(false);
        jScrollPane3.setViewportView(updatePanel);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
         //getting  the row selected by the user
        int empInd = tblEmpDetails.getSelectedRow();

        //checking if the user has chosen any row that is to be deleted
        if(empInd < 0 ) {
            //if there is no row selected then a dialog is displayed
            JOptionPane.showMessageDialog(this, "Select the Employee to be deleted.");
            return;
        }

        DefaultTableModel empTable = (DefaultTableModel) tblEmpDetails.getModel();

        //getting the employee details that is to be deleted
        EmpDetail selectedEmp = (EmpDetail) empTable.getValueAt(empInd, 1);

        //calling the remove employee method from employee details list class
        empList.removeEmpDetails(selectedEmp);

        //showing success message
        JOptionPane.showMessageDialog(this, "Deleted the Details");

        //refreshing the table with updated values
        addTableRows();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void addTableRows() {
        
        //creating the table model using DefaultTableModel
        DefaultTableModel empTable = (DefaultTableModel) tblEmpDetails.getModel();
        empTable.setRowCount(0);
        
        for(EmpDetail empDet: empList.getEmpList()) {
            
            //creating the row array and adding the required information in the respective column(index)
            Object[] row = new Object[7];
            row[0] = empDet.getEmpId();
            row[1] = empDet;
            row[2] = empDet.getStartDate();
            row[3] = empDet.getLevel();
            row[4] = empDet.getTeamInfo();
            row[5] = empDet.getPositionTitle();
            row[6] = empDet.getEmailId();
            
            //adding the row array to the table
            empTable.addRow(row);
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEmpDetails;
    private javax.swing.JTable tblEmpDetails1;
    // End of variables declaration//GEN-END:variables
}
