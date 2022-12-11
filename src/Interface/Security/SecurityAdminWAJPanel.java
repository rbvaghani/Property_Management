/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Security;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ankit
 */
public class SecurityAdminWAJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SecurityAdminWAJPanel
     */

JPanel userProcessContainer;
UserAccount account;
Organisation organization;
Enterprise enterprise;
Ecosystem business;
    public SecurityAdminWAJPanel(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, Ecosystem business) {
                initComponents();
                this.userProcessContainer= userProcessContainer;
                this.account=account;
                this.organization=organization;
                this.enterprise=enterprise;
                this.business=business;
                
                nameTxtField.setText(account.getEmployee().getName());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageSecReqJBtn = new javax.swing.JButton();
        ManageAccJBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Security Admin Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 11, -1, -1));

        manageSecReqJBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        manageSecReqJBtn.setText("Manage Security Requests");
        manageSecReqJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSecReqJBtnActionPerformed(evt);
            }
        });
        add(manageSecReqJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 256, -1));

        ManageAccJBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ManageAccJBtn.setText("Manage Accounts");
        ManageAccJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageAccJBtnActionPerformed(evt);
            }
        });
        add(ManageAccJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, 256, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome !");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, -1, -1));
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 21, 106, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/security.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 1000));
    }// </editor-fold>                        

    private void manageSecReqJBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        SecurityRequestsJPanel dcwh = new SecurityRequestsJPanel(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("SecurityRequestsJPanel",dcwh);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }                                                

    private void ManageAccJBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        SecurityStaffAccountJPanel dcwh = new SecurityStaffAccountJPanel(userProcessContainer,account,organization,enterprise,business);
        userProcessContainer.add("SecurityRequestsJPanel",dcwh);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }                                             


    // Variables declaration - do not modify                     
    private javax.swing.JButton ManageAccJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton manageSecReqJBtn;
    private javax.swing.JTextField nameTxtField;
    // End of variables declaration                   
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
