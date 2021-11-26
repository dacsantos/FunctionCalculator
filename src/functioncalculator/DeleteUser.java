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
     * Creates new form DeleteUser -and apply dimensions to set the window in
     * the middle of the screen
     * 
     * @param admin - name of the current connected Admin for greeting and
     * tracking purposes
     */
    public DeleteUser(String admin) {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
         mainMenuLabel.setText("ADMIN MENU - Connected Admin: " + admin);
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
        backRegister = new javax.swing.JButton();

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

        backRegister.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backRegister.setText("BACK");
        backRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backRegisterActionPerformed(evt);
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
                        .addComponent(backRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(backRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmRemoveButtonActionPerformed
        //This string will hold the username to be deleted.
        String username = deletionTextField.getText().trim();
      
        //Condition to check if the field is not empty.
        if (username.isEmpty()) {
            warningRegistration.setText("*Username for deletion required");
        } else {

            try {
                //connecting to the database
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "root");
                /**
                 * This query will check if the user exists.
                 */
                String check = "Select * from userlogin where username=?;";

                PreparedStatement pstCheck = con.prepareStatement(check);

                pstCheck.setString(1, username);

                ResultSet rs = pstCheck.executeQuery();
                /**
                 * Condition and error message in case the user does not exist.
                 * It will also bring the focus back to the field so the user
                 * can type again.
                 */
                if (!rs.next()) {
                    JOptionPane.showMessageDialog(null, "\n Action Not Successful\nUsername doesn't exist!");
                    deletionTextField.setText("");
                    deletionTextField.requestFocus();
                    pstCheck.close();
                /**
                 * Condition if user to be deleted is an Admin.
                 * It will show the error message and bring the focus back
                 * to the field so the user can type again.
                 */    
                } else if(rs.getString("userAdmin").equals("YES")) {
                    JOptionPane.showMessageDialog(null, "\n Action Not Successful\nYou can't remove an Admin!");
                    deletionTextField.setText("");
                    deletionTextField.requestFocus();
                    pstCheck.close();
                    
                } else{
                    /**
                     * In case the user exists and it is not an Admin.
                     * We will create another query to remove the user from the
                     * database.
                     */
                    String remove = "delete from userlogin where username=?;";
                    //Passing the query to the statement.
                    PreparedStatement pstRemove = con.prepareStatement(remove);
                    //Passing the username as a parameter to complete the query.
                    pstRemove.setString(1, username);
                    //Executing the query.
                    pstRemove.execute();
                    
                    /**
                     * Message of success.
                     * Clearing and bringing focus back to the field in case
                     * the Admin wants to remove another user.
                     */
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
    /**
     *  /**
     * When the user starts typing in the fieldtext again, it will erase its
     * empty data warning.
     *
     * @param evt - Typing
     */
    private void deletionTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deletionTextFieldKeyReleased
        // TODO add your handling code here:
         warningRegistration.setText("");
    }//GEN-LAST:event_deletionTextFieldKeyReleased

    private void backRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backRegisterActionPerformed
       /**
         * Back button will take the admin back to its menu and dispose of the
         * Listing menu. It will also give the name of the Admin as a parameter
         * to be used in the greeting label.
         */
        AdminMenu newInfo = new AdminMenu(mainMenuLabel.getText().substring(30).trim());
        newInfo.setVisible(true);
        dispose();
    }//GEN-LAST:event_backRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backRegister;
    private javax.swing.JButton confirmRemoveButton;
    private javax.swing.JLabel deleteTitle;
    private javax.swing.JTextField deletionTextField;
    private javax.swing.JLabel mainMenuLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel warningRegistration;
    // End of variables declaration//GEN-END:variables
}
