/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL;

import Beans.UserBean;
import Services.UserMaintainceServices;
import java.util.List;

import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author User1
 */
public class ManageUserPannel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserPannel
     */
    private List<UserBean> userList=null;
    private int currentaccount;
    private int addeditflag;
    public ManageUserPannel() {
        initComponents();
        userList=UserMaintainceServices.getAllEmployees();
        this.currentaccount=0;
        this.addeditflag=0;
        btnsave.setEnabled(false);
        this.showRecord();
        
    }
    private void showRecord()
    {
        UserBean ub=userList.get(this.currentaccount);
        txtId.setText(String.valueOf(ub.getUserid()));
        txtusname.setText(ub.getUsername());
        txtname.setText(ub.getName());
        txtemail.setText(ub.getEmail());
        txtcontact.setText(ub.getContact());
        txtadd.setText(ub.getAddress());
        
        if(ub.isUserstatus())
        {
            rdactive.setSelected(true);
        }
        else
        {
           rdinactive.setSelected(true);
        }
        ddlusertype.setSelectedItem(ub.getUserType());
        this.enableAll(false);
        btnfirst.setEnabled(true);
            btnnext.setEnabled(true);
            btnlast.setEnabled(true);
            btnprev.setEnabled(true);
            
            if(this.currentaccount==0)
            {
                btnfirst.setEnabled(false);
                btnprev.setEnabled(false);
            }
            if(this.currentaccount==userList.size()-1)
            {
                btnnext.setEnabled(false);
                btnlast.setEnabled(false);
            }
            
    }

    private void enableAll(boolean flag)
    {
        txtId.setEditable(flag);
        txtusname.setEditable(flag);
        txtname.setEditable(flag);
        txtemail.setEditable(flag);
        txtcontact.setEditable(flag);
        txtadd.setEditable(flag);
        ddlusertype.setEnabled(flag);
        rdactive.setEnabled(flag);
        rdinactive.setEnabled(flag);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtusname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        rdactive = new javax.swing.JRadioButton();
        rdinactive = new javax.swing.JRadioButton();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        ddlusertype = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder("View"));

        jLabel1.setText("User Id");

        jLabel2.setText("User Name");

        jLabel3.setText("User Type");

        jLabel4.setText("Name");

        jLabel5.setText("Email Id");

        jLabel6.setText("Contact");

        jLabel7.setText("Address");

        txtadd.setColumns(20);
        txtadd.setRows(5);
        jScrollPane1.setViewportView(txtadd);

        jLabel8.setText("Status");

        buttonGroup1.add(rdactive);
        rdactive.setText("Active");

        buttonGroup1.add(rdinactive);
        rdinactive.setText("InActive");

        btnfirst.setText("First");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setText("Previous");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText("Last");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

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

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        ddlusertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "adminstartor", "user", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ddlusertype, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                        .addComponent(txtusname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtcontact, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(rdactive)
                                .addGap(42, 42, 42)
                                .addComponent(rdinactive))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnfirst)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnadd)
                                .addGap(39, 39, 39)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnedit)
                            .addComponent(btnprev))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnnext)
                                .addGap(18, 18, 18)
                                .addComponent(btnlast))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsave)
                                .addGap(18, 18, 18)
                                .addComponent(btncancel)))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtusname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ddlusertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rdactive)
                            .addComponent(rdinactive))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnfirst)
                            .addComponent(btnprev)
                            .addComponent(btnnext)
                            .addComponent(btnlast))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnedit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnadd)
                        .addComponent(btnsave)
                        .addComponent(btncancel)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        this.currentaccount=0;
       this.showRecord();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        this.currentaccount= this.currentaccount+1;
        this.showRecord();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
     this.currentaccount=userList.size()-1;
     this.showRecord();
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
        
          this.currentaccount= this.currentaccount-1;
           this.showRecord();
        
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        UserBean ub=new UserBean();
        
        ub.setUsername(txtusname.getText());
        ub.setName(txtname.getText());
        ub.setEmail(txtemail.getText());
        ub.setContact(txtcontact.getText());
        ub.setAddress(txtadd.getText());
        ub.setUserType(ddlusertype.getSelectedItem().toString());
        if(rdactive.isSelected())
            ub.setUserstatus(true);
        else
            ub.setUserstatus(false);
        if(this.addeditflag==1){
            ub.setPassword("root");
        if(UserMaintainceServices.addEmployee(ub)){
            JOptionPane.showMessageDialog(this,"Record Inserted successfully","Add Employee",JOptionPane.INFORMATION_MESSAGE);
            this.currentaccount=userList.size();
        }
            else
             JOptionPane.showMessageDialog(this,"Record Inserted successfully","Record not inserted Employee",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(this.addeditflag==-1)
        {
            ub.setUserid(Integer.parseInt(txtId.getText()));
            if(UserMaintainceServices.updateEmployee(ub))
            {
                JOptionPane.showMessageDialog(this,"Record Edited successfully","Add Employee",JOptionPane.INFORMATION_MESSAGE);
            }
             else
            {
                JOptionPane.showMessageDialog(this,"Record Inserted successfully","Record not inserted Employee",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        this.addeditflag=0;
        this.userList=UserMaintainceServices.getAllEmployees();
        btnsave.setEnabled(false);
        this.showRecord();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
        this.addeditflag=1;
        btnfirst.setEnabled(false);
            btnnext.setEnabled(false);
            btnlast.setEnabled(false);
            btnprev.setEnabled(false);
            btnadd.setEnabled(false);
            btnedit.setEnabled(false);
        btnsave.setEnabled(true);
        this.enableAll(true);
        txtId.setText("");
        txtusname.setText("");
        txtname.setText("");
        txtemail.setText("");
        txtcontact.setText("");
        txtadd.setText("");
        ddlusertype.setSelectedIndex(0);
        rdactive.setSelected(true);
    }//GEN-LAST:event_btnaddActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
      this.addeditflag=-1;
        btnfirst.setEnabled(false);
            btnnext.setEnabled(false);
            btnlast.setEnabled(false);
            btnprev.setEnabled(false);
            btnadd.setEnabled(false);
            btnedit.setEnabled(false);
        btnsave.setEnabled(true);
        this.enableAll(true);
        
    }//GEN-LAST:event_btneditActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
     if(this.addeditflag==0)
     {
         MainFrame.c.removeAll();
         MainFrame.c.setVisible(false);
         
     }
     else
     {
         this.showRecord();
     }
    }//GEN-LAST:event_btncancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> ddlusertype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdactive;
    private javax.swing.JRadioButton rdinactive;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtusname;
    // End of variables declaration//GEN-END:variables
}
