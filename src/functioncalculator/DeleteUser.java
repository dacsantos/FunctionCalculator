/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioncalculator;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author dacsa
 */
public class DeleteUser extends javax.swing.JFrame {

    /**
     * Creates new form DeleteUser
     */
    public DeleteUser(String username) {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
         mainMenuLabel.setText("ADMIN MENU - Connected Admin: " + username);
    }

    private DeleteUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteTitle = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        mainMenuLabel = new javax.swing.JLabel();
        deletionTextField = new javax.swing.JTextField();
        confirmRemoveButton = new javax.swing.JButton();
        warningRegistration = new javax.swing.JLabel();
        backRegister1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deleteTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteTitle.setText("Please enter the username of the account you wish to remove");

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Function Calculator");
        title.setAlignmentY(0.0F);

        mainMenuLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mainMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainMenuLabel.setText("ADMIN MENU - Current Admin:");

        deletionTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deletionTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deletionTextFieldKeyReleased(evt);
            }
        });

        confirmRemoveButton.setText("CONFIRM REMOVE");
        confirmRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmRemoveButtonActionPerformed(evt);
            }
        });

        warningRegistration.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        warningRegistration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningRegistration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                warningRegistrationKeyReleased(evt);
            }
        });

        backRegister1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backRegister1.setText("BACK");
        backRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backRegister1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deleteTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
            .addComponent(mainMenuLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(warningRegistration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deletionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(backRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainMenuLabel)
                .addGap(18, 18, 18)
                .addComponent(deleteTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warningRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(backRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmRemoveButtonActionPerformed
        // TODO add your handling code here:
        
        String username = deletionTextField.getText().trim();
      

        if (username.isEmpty()) {
            warningRegistration.setText("*Username for deletion required");
        } else {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "root");
                String check = "Select * from userlogin where username=?;";

                PreparedStatement pstCheck = con.prepareStatement(check);

                pstCheck.setString(1, username);

                ResultSet rs = pstCheck.executeQuery();

                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "\n Action Not Successful\n Username doesn't exist!");
                    deletionTextField.setText("");
                    deletionTextField.requestFocus();
                    pstCheck.close();

                } else if(rs.getString("usertype").equals("1")) {
                    JOptionPane.showMessageDialog(null, "\n Action Not Successful\n You can't remove an Admin!");
                    deletionTextField.setText("");
                    deletionTextField.requestFocus();
                    pstCheck.close();
                    
                } else{

                    String remove = "delete from userlogin where username=?;";

                    PreparedStatement pstRemove = con.prepareStatement(remove);

                    pstRemove.setString(1, username);

                    pstRemove.execute();

                    JOptionPane.showMessageDialog(null, "Action Successful\nUser "+username+" removed from database");
                    
                    deletionTextField.setText("");
                    deletionTextField.requestFocus();

                    pstRemove.close();
                    con.close();
                }
        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "\nAction Not Successful");
            }

        }
    }//GEN-LAST:event_confirmRemoveButtonActionPerformed

    private void warningRegistrationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_warningRegistrationKeyReleased
        // TODO add your handling code here:
         
    }//GEN-LAST:event_warningRegistrationKeyReleased

    private void deletionTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deletionTextFieldKeyReleased
        // TODO add your handling code here:
         warningRegistration.setText("");
    }//GEN-LAST:event_deletionTextFieldKeyReleased

    private void backRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backRegister1ActionPerformed
        // TODO add your handling code here:
        AdminMenu newInfo = new AdminMenu(mainMenuLabel.getText().substring(30).trim());
        newInfo.setVisible(true);
        dispose();
    }//GEN-LAST:event_backRegister1ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backRegister1;
    private javax.swing.JButton confirmRemoveButton;
    private javax.swing.JLabel deleteTitle;
    private javax.swing.JTextField deletionTextField;
    private javax.swing.JLabel mainMenuLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel warningRegistration;
    // End of variables declaration//GEN-END:variables
}
