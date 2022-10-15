/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.HospitalList;
import model.PersonList;

/**
 *
 * @author amretasrerengarajan
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    PersonList prsnList;
    HospitalList hspList;
    public MainJFrame() {
        initComponents();
        this.prsnList = new PersonList();
        this.hspList = new HospitalList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        loginOptions = new javax.swing.JPanel();
        btnUserLogin = new javax.swing.JButton();
        btnDoctorLogin = new javax.swing.JButton();
        btnHospitalAdmin = new javax.swing.JButton();
        btnCommAdmin = new javax.swing.JButton();
        loginForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginOptions.setBackground(new java.awt.Color(0, 204, 204));

        btnUserLogin.setText("User");
        btnUserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserLoginActionPerformed(evt);
            }
        });

        btnDoctorLogin.setText("Doctor");

        btnHospitalAdmin.setText("Hospital Admin");

        btnCommAdmin.setText("Community Admin");
        btnCommAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginOptionsLayout = new javax.swing.GroupLayout(loginOptions);
        loginOptions.setLayout(loginOptionsLayout);
        loginOptionsLayout.setHorizontalGroup(
            loginOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUserLogin)
                    .addComponent(btnDoctorLogin)
                    .addComponent(btnHospitalAdmin)
                    .addComponent(btnCommAdmin))
                .addGap(10, 10, 10))
        );

        loginOptionsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCommAdmin, btnDoctorLogin, btnHospitalAdmin, btnUserLogin});

        loginOptionsLayout.setVerticalGroup(
            loginOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginOptionsLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnUserLogin)
                .addGap(100, 100, 100)
                .addComponent(btnDoctorLogin)
                .addGap(100, 100, 100)
                .addComponent(btnHospitalAdmin)
                .addGap(100, 100, 100)
                .addComponent(btnCommAdmin)
                .addGap(250, 250, 250))
        );

        splitPane.setTopComponent(loginOptions);

        loginForm.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout loginFormLayout = new javax.swing.GroupLayout(loginForm);
        loginForm.setLayout(loginFormLayout);
        loginFormLayout.setHorizontalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        loginFormLayout.setVerticalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(loginForm);

        jLabel1.setBackground(new java.awt.Color(153, 0, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Medical Resource Management Application");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                .addGap(9, 9, 9))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(splitPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserLoginActionPerformed
        // TODO add your handling code here:
        UserPanel userPanel = new UserPanel(prsnList, hspList);
        splitPane.setRightComponent(userPanel);
    }//GEN-LAST:event_btnUserLoginActionPerformed

    private void btnCommAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommAdminActionPerformed
        // TODO add your handling code here:
        CommuityPanel commPanel = new CommuityPanel(hspList);
        splitPane.setRightComponent(commPanel);      
    }//GEN-LAST:event_btnCommAdminActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommAdmin;
    private javax.swing.JButton btnDoctorLogin;
    private javax.swing.JButton btnHospitalAdmin;
    private javax.swing.JButton btnUserLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel loginForm;
    private javax.swing.JPanel loginOptions;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}