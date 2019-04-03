package PL;

import Beans.UserBean;
import Services.ProfileMaintainceService;
import Services.UserMaintainceServices;
import java.util.List;
import javax.swing.JOptionPane;

public class ManageUserProfilePanel extends javax.swing.JPanel {

    private List<UserBean> userList=null;
    int currentaccount;
    public ManageUserProfilePanel(int currentaccount)
    {
        initComponents();
        this.currentaccount=currentaccount;
        userList=ProfileMaintainceService.getEmployees(currentaccount);
        this.showRecord();
    }
     private void showRecord()
        {
            this.enableAll(false);
        UserBean ub=userList.get(0);
        lbluserid.setText(String.valueOf(ub.getUserid()));
        txtusername.setText(ub.getUsername());
        txtname.setText(ub.getName());
        txtemail.setText(ub.getEmail());
        txtcontact.setText(ub.getContact());
        txtarea.setText(ub.getAddress());
        txtusername.setEditable(false);
        txtname.setEditable(false);
        }
     private void enableAll(boolean flag)
    {
     
        txtemail.setEditable(flag);
        txtcontact.setEditable(flag);
        txtarea.setEditable(flag);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbluserid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        btnedit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Profile"));

        lbluserid.setText("User Id");

        jLabel1.setText("User Name");

        jLabel2.setText("Name");

        jLabel3.setText("Email");

        jLabel4.setText("Contact");

        jLabel5.setText("Address");

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcontact, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusername)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lbluserid))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnedit)
                        .addGap(44, 44, 44)
                        .addComponent(btnsave)))
                .addGap(139, 274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbluserid)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit)
                    .addComponent(btnsave))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        
        this.enableAll(true);
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        UserBean ub=new UserBean();
        ub.setEmail(txtemail.getText());
        ub.setContact(txtcontact.getText());
        ub.setAddress(txtarea.getText());
        if(ProfileMaintainceService.updateEmployee(ub))
            {
                JOptionPane.showMessageDialog(this,"Record Edited successfully","Add Employee",JOptionPane.INFORMATION_MESSAGE);
            }
             else
            {
                JOptionPane.showMessageDialog(this,"Record Inserted successfully","Record not inserted Employee",JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_btnsaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbluserid;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
