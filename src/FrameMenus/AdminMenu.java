/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameMenus;

import FrameOptions.DeleteUser;
import FrameOptions.EditAdminInfo;
import FrameOptions.HistoryOfAllUsers;
import FrameOptions.ListOfUsers;
import FrameOptions.LoginPage;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author dacsa
 */
public class AdminMenu extends javax.swing.JFrame {

    /**
     * Creates new form AdminMenu - and apply dimensions to set the window in
     * the middle of the screen
     *
     * @param admin - name of the current connected Admin for greeting and
     * tracking purposes
     */
    public AdminMenu(String admin) {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        mainMenuLabel.setText("ADMIN MENU - Connected Admin: " + admin);
        welcomeLabel.setText("Welcome, " + admin);
        Image icon = Toolkit.getDefaultToolkit().getImage("DK1.png");  
        this.setIconImage(icon); 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        editInfoButton = new javax.swing.JButton();
        listOfUsersButton = new javax.swing.JButton();
        removeUserButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        HistoryOfCalculations = new javax.swing.JButton();
        mainMenuLabel = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Admin");

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome, Admin! ");

        editInfoButton.setText("EDIT ADMIN INFO");
        editInfoButton.setAlignmentY(0.0F);
        editInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInfoButtonActionPerformed(evt);
            }
        });

        listOfUsersButton.setText("LIST OF USERS");
        listOfUsersButton.setAlignmentY(0.0F);
        listOfUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOfUsersButtonActionPerformed(evt);
            }
        });

        removeUserButton.setText("REMOVE USER");
        removeUserButton.setAlignmentY(0.0F);
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("LOG OUT");
        logOutButton.setAlignmentY(0.0F);
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        HistoryOfCalculations.setText("ALL PAST CALCULATIONS");
        HistoryOfCalculations.setAlignmentY(0.0F);
        HistoryOfCalculations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryOfCalculationsActionPerformed(evt);
            }
        });

        mainMenuLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mainMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainMenuLabel.setText("ADMIN MENU - Connected Admin:");

        title.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Equation Calculator");
        title.setAlignmentY(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HistoryOfCalculations, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(logOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editInfoButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(listOfUsersButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
            .addComponent(mainMenuLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenuLabel)
                .addGap(18, 18, 18)
                .addComponent(welcomeLabel)
                .addGap(41, 41, 41)
                .addComponent(editInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(listOfUsersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HistoryOfCalculations, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        /**
         * Logout button will take the user back to the Login page and dispose
         * of the Admin Menu.
         */
        LoginPage newLogin = new LoginPage();
        newLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void editInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInfoButtonActionPerformed
        /**
         * Edit Info button will take the Admin to the Edition page and dispose
         * of the Admin Menu. It will also give the name of the Admin as a
         * parameter to be used in the greeting label.
         */
        EditAdminInfo EditInfo = new EditAdminInfo(welcomeLabel.getText().substring(8).trim());
        EditInfo.setVisible(true);
        dispose();
    }//GEN-LAST:event_editInfoButtonActionPerformed
    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        /**
         * Remove User button will take the Admin to the Deletion page and
         * dispose of the Admin Menu. It will also give the name of the Admin as
         * a parameter to be used in the greeting label.
         */
        DeleteUser Remove = new DeleteUser(welcomeLabel.getText().substring(8).trim());
        Remove.setVisible(true);
        dispose();
    }//GEN-LAST:event_removeUserButtonActionPerformed

    private void listOfUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOfUsersButtonActionPerformed
        /**
         * Lisf of Users button will take the Admin to the Listing page and
         * dispose of the Admin Menu. It will also give the name of the Admin as
         * a parameter to be used in the greeting label.
         */
        ListOfUsers List = new ListOfUsers(welcomeLabel.getText().substring(8).trim());
        List.setVisible(true);
        dispose();
    }//GEN-LAST:event_listOfUsersButtonActionPerformed

    private void HistoryOfCalculationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryOfCalculationsActionPerformed
        // TODO add your handling code here:
        HistoryOfAllUsers newList = new HistoryOfAllUsers(welcomeLabel.getText().substring(8).trim());
        newList.setVisible(true);
        dispose();
    }//GEN-LAST:event_HistoryOfCalculationsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HistoryOfCalculations;
    private javax.swing.JButton editInfoButton;
    private javax.swing.JButton listOfUsersButton;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel mainMenuLabel;
    private javax.swing.JButton removeUserButton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}