
import classes.DBO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sam
 */
public class ChangePwd extends javax.swing.JInternalFrame {

    /**
     * Creates new form ChangePwd
     */
    public ChangePwd() {
        initComponents();
        setVisible(true);
         oldpwd.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    DBO obj=new DBO();
    ArrayList al=new ArrayList();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        oldpwd = new javax.swing.JPasswordField();
        newpwd = new javax.swing.JPasswordField();
        cfmpwd = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        chngbtn = new javax.swing.JButton();
        clslbtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Change Password");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Old Password");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("New Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Confirm Password");

        cfmpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfmpwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(97, 97, 97)
                        .addComponent(oldpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(91, 91, 91)
                        .addComponent(newpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(cfmpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(oldpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(newpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cfmpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        chngbtn.setText("Change");
        chngbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chngbtnActionPerformed(evt);
            }
        });

        clslbtn.setText("Close");
        clslbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clslbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(chngbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(clslbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chngbtn)
                    .addComponent(clslbtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chngbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chngbtnActionPerformed
        try {
            String op,tblpwd,np,cp;
            op=oldpwd.getText();
            if(op!="")
            {
            al=obj.getPwd();
            tblpwd=al.get(0).toString();
            if(op.equals(tblpwd))
            {
            np=newpwd.getText();
            cp=cfmpwd.getText();
            if(np!="" && cp!="")
            {
            if(np.equals(cp))
            {
                try {
                    
         int flag=   JOptionPane.showConfirmDialog(null,"Are you sure you want to change the password ?","Warning",JOptionPane.YES_NO_OPTION);
       if(flag==0)
       {
                    String m=obj.changePw(np);
                    if(m.equals("yes"))
                    {
                        JOptionPane.showMessageDialog(null,"Password Changed Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
               oldpwd.setText("");    
            newpwd.setText("");
            cfmpwd.setText("");  
              oldpwd.requestFocusInWindow();
                    }
                    else
                    JOptionPane.showMessageDialog(null,"Error while changing password","Error",JOptionPane.ERROR_MESSAGE);     
                }
                }
                catch (Exception ex) {
                    Logger.getLogger(ChangePwd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
               
                JOptionPane.showMessageDialog(null, "Passwords do not match", "Warning", JOptionPane.WARNING_MESSAGE);
           newpwd.requestFocusInWindow();
           newpwd.selectAll(); }
            }
            else
                JOptionPane.showMessageDialog(null, "You can't leave password field blank", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
               JOptionPane.showMessageDialog(null,"Old Password is incorrect","Error",JOptionPane.ERROR_MESSAGE);
            oldpwd.requestFocusInWindow();
            oldpwd.selectAll();
            } }
            else
                JOptionPane.showMessageDialog(null, "Enter old password", "Warning", JOptionPane.WARNING_MESSAGE);
}
catch (SQLException ex) {
            Logger.getLogger(ChangePwd.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }//GEN-LAST:event_chngbtnActionPerformed

    private void cfmpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfmpwdActionPerformed
            try {
            String op,tblpwd,np,cp;
            op=oldpwd.getText();
            if(op!="")
            {
            al=obj.getPwd();
            tblpwd=al.get(0).toString();
            if(op.equals(tblpwd))
            {
            np=newpwd.getText();
            cp=cfmpwd.getText();
            if(np!="" && cp!="")
            {
            if(np.equals(cp))
            {
                try {
                    
         int flag=   JOptionPane.showConfirmDialog(null,"Are you sure you want to change the password ?","Warning",JOptionPane.YES_NO_OPTION);
       if(flag==0)
       {
                    String m=obj.changePw(np);
                    if(m.equals("yes"))
                    {
                        JOptionPane.showMessageDialog(null,"Password Changed Successfully","Done",JOptionPane.INFORMATION_MESSAGE);
               oldpwd.setText("");    
            newpwd.setText("");
            cfmpwd.setText("");  
              oldpwd.requestFocusInWindow();
                    }
                    else
                    JOptionPane.showMessageDialog(null,"Error while changing password","Error",JOptionPane.ERROR_MESSAGE);     
                }
                }
                catch (Exception ex) {
                    Logger.getLogger(ChangePwd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
               
                JOptionPane.showMessageDialog(null, "Passwords do not match", "Warning", JOptionPane.WARNING_MESSAGE);
           newpwd.requestFocusInWindow();
           newpwd.selectAll(); }
            }
            else
                JOptionPane.showMessageDialog(null, "You can't leave password field blank", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            
            else
            {
               JOptionPane.showMessageDialog(null,"Old Password is incorrect","Error",JOptionPane.ERROR_MESSAGE);
            oldpwd.requestFocusInWindow();
            oldpwd.selectAll();
            } }
            else
                JOptionPane.showMessageDialog(null, "Enter old password", "Warning", JOptionPane.WARNING_MESSAGE);
}
catch (SQLException ex) {
            Logger.getLogger(ChangePwd.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cfmpwdActionPerformed

    private void clslbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clslbtnActionPerformed
    int flag=   JOptionPane.showConfirmDialog(null,"Are you sure you want to close ?","Warning",JOptionPane.YES_NO_OPTION);
       if(flag==0)
       {
        oldpwd.setText("");    
            newpwd.setText("");
            cfmpwd.setText("");  
          setVisible(false);
       }
        
                  
        // TODO add your handling code here:
    }//GEN-LAST:event_clslbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cfmpwd;
    private javax.swing.JButton chngbtn;
    private javax.swing.JButton clslbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPasswordField newpwd;
    private javax.swing.JPasswordField oldpwd;
    // End of variables declaration//GEN-END:variables
}
