/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author Harshit
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1Title = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblTelephoneNumber = new javax.swing.JLabel();
        lblFaxNumber = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblMedicalRecordNumber = new javax.swing.JLabel();
        lblBankAccountNumber = new javax.swing.JLabel();
        lblLicenseNumber = new javax.swing.JLabel();
        lblVehicleIdentifierNumber = new javax.swing.JLabel();
        lblDeviceIdentifier = new javax.swing.JLabel();
        lblLinkedin = new javax.swing.JLabel();
        lblIPAddress = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();

        lb1Title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb1Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1Title.setText("CREATE");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText("Name:");

        lblAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAddress.setText("Address:");

        lblDateOfBirth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDateOfBirth.setText("Date of Birth (MM/DD/YYYY):");

        lblTelephoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTelephoneNumber.setText("Telephone Number:");

        lblFaxNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFaxNumber.setText("Fax Number: ");

        lblEmailAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmailAddress.setText("Email Address:");

        lblSSN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSSN.setText("Social Security Number:");

        lblMedicalRecordNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMedicalRecordNumber.setText("Medical Record Number:");

        lblBankAccountNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBankAccountNumber.setText("Bank Account Number:");

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

        lblPhoto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPhoto.setText("Upload Photo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb1Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoto)
                    .addComponent(lblIPAddress)
                    .addComponent(lblLinkedin)
                    .addComponent(lblDeviceIdentifier)
                    .addComponent(lblVehicleIdentifierNumber)
                    .addComponent(lblLicenseNumber)
                    .addComponent(lblBankAccountNumber)
                    .addComponent(lblMedicalRecordNumber)
                    .addComponent(lblSSN)
                    .addComponent(lblEmailAddress)
                    .addComponent(lblFaxNumber)
                    .addComponent(lblTelephoneNumber)
                    .addComponent(lblDateOfBirth)
                    .addComponent(lblAddress)
                    .addComponent(lblName))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1Title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDateOfBirth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTelephoneNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFaxNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmailAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSSN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMedicalRecordNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBankAccountNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLicenseNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVehicleIdentifierNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeviceIdentifier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLinkedin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIPAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPhoto)
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTelephoneNumber;
    private javax.swing.JLabel lblVehicleIdentifierNumber;
    // End of variables declaration//GEN-END:variables
}