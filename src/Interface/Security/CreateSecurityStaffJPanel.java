/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Security;

import Business.Ecosystem;
import Business.Employee.SecurityEmployee;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.Role.SecurityStaffRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ramvaghani
 */
public class CreateSecurityStaffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateSecurityStaffJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organisation organization;
    Enterprise enterprise;
    Ecosystem business;
    

    CreateSecurityStaffJPanel(JPanel userProcessContainer, UserAccount account, Organisation organization, Enterprise enterprise, Ecosystem business) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        populateLocCombobox();
        populateTimeslotCombobox();

    }
    
    public void populateLocCombobox(){
        String [] location = {"Clearway Street","Boston Harbour","NorthEnd","Washigton street","Oliver street","Aquarium","Fort Point","Stuart street","St Germaine Street"};
        locJComboBox.removeAllItems();
        for(String str:location){
            locJComboBox.addItem(str);
        }
    }
    
    public void populateTimeslotCombobox(){
        String [] timeslots= {"10 AM - 6 PM", "6 PM - 2 AM", "2 AM - 10 AM"};
        
         timeSlotJComboBox.removeAllItems();
        for(String str:timeslots){
            timeSlotJComboBox.addItem(str);
        }
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
        createAccJBtn = new javax.swing.JButton();
        backJBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameJTxtField = new javax.swing.JTextField();
        passwordJTxtField = new javax.swing.JTextField();
        userNameJTxtField = new javax.swing.JTextField();
        locJComboBox = new javax.swing.JComboBox<>();
        timeSlotJComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Create Security Staff");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        createAccJBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        createAccJBtn.setText("Create");
        createAccJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccJBtnActionPerformed(evt);
            }
        });
        add(createAccJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 248, 142, -1));

        backJBtn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        backJBtn.setText("Back");
        backJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBtnActionPerformed(evt);
            }
        });
        add(backJBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 289, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 100, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Location: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 99, 100, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("TimeSlot: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, 100, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("UserName: ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 100, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Password: ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 100, -1));
        add(nameJTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 58, 150, -1));
        add(passwordJTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 210, 150, -1));
        add(userNameJTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 172, 150, -1));

        add(locJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 96, 150, -1));

        add(timeSlotJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 134, 150, -1));
    }// </editor-fold>                        

    private void backJBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SecurityStaffAccountJPanel secAccJP = (SecurityStaffAccountJPanel) component;
        secAccJP.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }                                        

    private void createAccJBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        
        String name= nameJTxtField.getText();
        String location= (String) locJComboBox.getSelectedItem();
        String timeSlot = (String) timeSlotJComboBox.getSelectedItem();
        
        String userName = userNameJTxtField.getText();
        String password = passwordJTxtField.getText();
        
        if(name.equals("")||userName.equals("")||password.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter all the fields.","Error", JOptionPane.ERROR_MESSAGE);
                return;
        }
        
        if(!business.checkIfUsernameIsUnique(userName)){
            JOptionPane.showMessageDialog(this,"The user name already exists. Please enter another one.","Error", JOptionPane.ERROR_MESSAGE);
            return;
            
        }
        
        UserAccount ua= new UserAccount();
        ua.setUserName(userName);
        ua.setPassword(password);
        ua.setRole(new SecurityStaffRole());
        
        SecurityEmployee sec= new SecurityEmployee();
        sec.setStreetName(location);
        sec.setTimeSlot(timeSlot);
        sec.setName(name);
        sec.setRole(ua.getRole());
        
        ua.setEmployee(sec);
        sec.setEmpUserAcc(ua);
        
        organization.getUserAccountDir().getUserAccountDirectory().add(ua);
        organization.getEmpList().getEmployeeDirectory().add(sec);
        
        JOptionPane.showMessageDialog(null,"The security staff has been successfully created.","SUCCESS", JOptionPane.INFORMATION_MESSAGE);

    }                                             


    // Variables declaration - do not modify                     
    private javax.swing.JButton backJBtn;
    private javax.swing.JButton createAccJBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> locJComboBox;
    private javax.swing.JTextField nameJTxtField;
    private javax.swing.JTextField passwordJTxtField;
    private javax.swing.JComboBox<String> timeSlotJComboBox;
    private javax.swing.JTextField userNameJTxtField;
    // End of variables declaration                   
}

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
