/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import model.Profile;

/**
 *
 * @author Harshit
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    Profile profile;
    
    public ViewJPanel(Profile profile) {
        initComponents();
        
        this.profile = profile;
        displayProfile();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLicenseNumber = new javax.swing.JLabel();
        lblVehicleIdentifierNumber = new javax.swing.JLabel();
        lblDeviceIdentifier = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        lblIPAddress = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtTelephoneNumber = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtFaxNumber = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        txtBankAccountNumber = new javax.swing.JTextField();
        txtLicenseNumber = new javax.swing.JTextField();
        lblTelephoneNumber = new javax.swing.JLabel();
        txtVehicleIdentifierNumber = new javax.swing.JTextField();
        lblFaxNumber = new javax.swing.JLabel();
        txtDeviceIdentifier = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lb1Title = new javax.swing.JLabel();
        txtLinkedin = new javax.swing.JTextField();
        txtIPAddress = new javax.swing.JTextField();
        lblMedicalRecordNumber = new javax.swing.JLabel();
        lblBankAccountNumber = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblViewPhoto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblViewFingerprint = new javax.swing.JLabel();

        lblLicenseNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLicenseNumber.setText("License Number:");

        lblVehicleIdentifierNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVehicleIdentifierNumber.setText("Vehicle Identifier Number: ");

        lblDeviceIdentifier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDeviceIdentifier.setText("Device Identifier: ");

        lblLinkedin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLinkedin.setText("Linkedin URL: ");

        lblIPAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIPAddress.setText("IP Address:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        txtTelephoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneNumberActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText("Name:");

        txtFaxNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNumberActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAddress.setText("Address:");

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });

        txtMedicalRecordNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalRecordNumberActionPerformed(evt);
            }
        });

        lblDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDateOfBirth.setText("Date of Birth (MM/DD/YYYY):");

        txtBankAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankAccountNumberActionPerformed(evt);
            }
        });

        txtLicenseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseNumberActionPerformed(evt);
            }
        });

        lblTelephoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelephoneNumber.setText("Telephone Number:");

        txtVehicleIdentifierNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleIdentifierNumberActionPerformed(evt);
            }
        });

        lblFaxNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFaxNumber.setText("Fax Number: ");

        txtDeviceIdentifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeviceIdentifierActionPerformed(evt);
            }
        });

        lblEmailAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmailAddress.setText("Email Address:");

        lblSSN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSSN.setText("Social Security Number:");

        lb1Title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb1Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1Title.setText("VIEW PROFILE");

        txtLinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedinActionPerformed(evt);
            }
        });

        txtIPAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPAddressActionPerformed(evt);
            }
        });

        lblMedicalRecordNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMedicalRecordNumber.setText("Medical Record Number:");

        lblBankAccountNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBankAccountNumber.setText("Bank Account Number:");

        lblViewPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewPhoto.setText("You can view your photo here.");
        lblViewPhoto.setMaximumSize(new java.awt.Dimension(182, 14));
        lblViewPhoto.setMinimumSize(new java.awt.Dimension(182, 14));
        lblViewPhoto.setPreferredSize(new java.awt.Dimension(182, 14));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblViewPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblViewPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );

        lblViewFingerprint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewFingerprint.setText("You can view your fingerprint here.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblViewFingerprint, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblViewFingerprint, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb1Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblName)
                                        .addComponent(lblAddress))
                                    .addGap(150, 150, 150)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDateOfBirth)
                                        .addComponent(lblTelephoneNumber)
                                        .addComponent(lblFaxNumber)
                                        .addComponent(lblEmailAddress)
                                        .addComponent(lblSSN)
                                        .addComponent(lblMedicalRecordNumber)
                                        .addComponent(lblBankAccountNumber)
                                        .addComponent(lblLicenseNumber)
                                        .addComponent(lblVehicleIdentifierNumber)
                                        .addComponent(lblDeviceIdentifier)
                                        .addComponent(lblLinkedin)
                                        .addComponent(lblIPAddress))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtVehicleIdentifierNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lb1Title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAddress)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDateOfBirth)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelephoneNumber)
                        .addComponent(txtTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFaxNumber)
                        .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmailAddress)
                        .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSSN)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMedicalRecordNumber)
                        .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBankAccountNumber)
                        .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLicenseNumber)
                        .addComponent(txtLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblVehicleIdentifierNumber)
                        .addComponent(txtVehicleIdentifierNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDeviceIdentifier)
                        .addComponent(txtDeviceIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLinkedin)
                        .addComponent(txtLinkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIPAddress)
                        .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtTelephoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneNumberActionPerformed

    private void txtFaxNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNumberActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtMedicalRecordNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalRecordNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordNumberActionPerformed

    private void txtBankAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccountNumberActionPerformed

    private void txtLicenseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseNumberActionPerformed

    private void txtVehicleIdentifierNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleIdentifierNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleIdentifierNumberActionPerformed

    private void txtDeviceIdentifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeviceIdentifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeviceIdentifierActionPerformed

    private void txtLinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedinActionPerformed

    private void txtIPAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIPAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb1Title;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBankAccountNumber;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDeviceIdentifier;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblFaxNumber;
    private javax.swing.JLabel lblIPAddress;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblLinkedin;
    private javax.swing.JLabel lblMedicalRecordNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelephoneNumber;
    private javax.swing.JLabel lblVehicleIdentifierNumber;
    private javax.swing.JLabel lblViewFingerprint;
    private javax.swing.JLabel lblViewPhoto;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBankAccountNumber;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDeviceIdentifier;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtIPAddress;
    private javax.swing.JTextField txtLicenseNumber;
    private javax.swing.JTextField txtLinkedin;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelephoneNumber;
    private javax.swing.JTextField txtVehicleIdentifierNumber;
    // End of variables declaration//GEN-END:variables

    private void displayProfile() {
        
        String pattern = "MMM dd, yyyy";
        DateFormat df = new SimpleDateFormat(pattern);
        String date_string = df.format(profile.getDate_of_birth());
        
        txtName.setText(profile.getName());
        txtAddress.setText(profile.getAddress());
        
        if (profile.getDate_of_birth().compareTo(new Date(0)) == 0){
            txtDOB.setText("");
        }
        else{
            txtDOB.setText(date_string);
        }
        
        if (profile.getTelephone_number() == 0){
            txtTelephoneNumber.setText("");
        }
        else {
            txtTelephoneNumber.setText(String.valueOf(profile.getTelephone_number()));
        }
        
        if (profile.getFax_number()== 0){
            txtFaxNumber.setText("");
        }
        else {
            txtFaxNumber.setText(String.valueOf(profile.getFax_number()));
        }
        
        txtEmailAddress.setText(profile.getEmail_address());
        
        if (profile.getSsn()== 0){
            txtSSN.setText("");
        }
        else {
            txtSSN.setText(String.valueOf(profile.getSsn()));
        }
        
        if (profile.getMedical_record_number()== 0){
            txtMedicalRecordNumber.setText("");
        }
        else {
            txtMedicalRecordNumber.setText(String.valueOf(profile.getMedical_record_number()));
        }
        
        if (profile.getBank_account_number()== 0){
            txtBankAccountNumber.setText("");
        }
        else {
            txtBankAccountNumber.setText(String.valueOf(profile.getBank_account_number()));
        }

        if (profile.getLicense_number()== 0){
            txtLicenseNumber.setText("");
        }
        else {
            txtLicenseNumber.setText(String.valueOf(profile.getLicense_number()));
        }
            
        txtVehicleIdentifierNumber.setText(profile.getVehicle_identifier_number());
        txtDeviceIdentifier.setText(profile.getDevice_identifier());
        txtLinkedin.setText(profile.getLinkedin());
        txtIPAddress.setText(profile.getIp_address());
        
        if(profile.getPhoto() == null){
            lblViewPhoto.setText("You can view your photo here.");
        }
        else{
            String filename = profile.getPhoto();        
            Image im = Toolkit.getDefaultToolkit().createImage(filename);
            im = im.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
            ImageIcon ii = new ImageIcon(im);
            lblViewPhoto.setIcon(ii);
            lblViewPhoto.setText("");
            
        }
        
        

        
        if(profile.getFingerprint() == null){
            lblViewFingerprint.setText("You can view your fingerprint here.");
        }
        else{
            String filename_fingerprint = profile.getFingerprint();
            Image im1 = Toolkit.getDefaultToolkit().createImage(filename_fingerprint);
            im1 = im1.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
            ImageIcon ii2 = new ImageIcon(im1);
            lblViewFingerprint.setIcon(ii2);
            lblViewFingerprint.setText("");
        }

        

    
    }
}
