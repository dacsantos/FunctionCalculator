/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equationCalculator;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author dacsa
 */
public class Calculation extends javax.swing.JFrame {

    /**
     * Creates new form Calculation - and apply dimensions to set the window in
     * the middle of the screen
     *
     * @param username - name of the current connected User for greeting and
     * tracking purposes
     */
    public Calculation(String username) {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        welcomeLabel.setText("Hi, " + username);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        calculationMenuLabel = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        twobytwo = new javax.swing.JButton();
        threebythree = new javax.swing.JButton();
        backRegister1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Equation Calculator");
        title.setAlignmentY(0.0F);

        calculationMenuLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        calculationMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculationMenuLabel.setText("CHOOSE YOUR FUNCTION TYPE");

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Hi");

        twobytwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        twobytwo.setText("Linear equation with  2 variables (2x2 Matrix)");
        twobytwo.setActionCommand("Linear equation with 3 variables (3x3 Matrix)");
        twobytwo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        twobytwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twobytwoActionPerformed(evt);
            }
        });

        threebythree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        threebythree.setText("Linear equation with \n3 variables (3x3 Matrix)");
        threebythree.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        backRegister1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backRegister1.setText("BACK");
        backRegister1.setAlignmentY(0.0F);
        backRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backRegister1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addComponent(calculationMenuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(backRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(threebythree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twobytwo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(180, 180, 180))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {threebythree, twobytwo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(calculationMenuLabel)
                .addGap(40, 40, 40)
                .addComponent(twobytwo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(threebythree, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(backRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {threebythree, twobytwo});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backRegister1ActionPerformed
        /**
         * Back button will take the user back to its menu and dispose of the
         * Calculation menu. It will also give the name of the User as a
         * parameter to be used in the greeting label.
         */
        MainMenu menu = new MainMenu(welcomeLabel.getText().substring(4).trim());
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backRegister1ActionPerformed

    private void twobytwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twobytwoActionPerformed
        /**
         * This button will take the user to the Calculation of a two
         * variable-equation. It will also give the name of the User as a
         * parameter to be used in the greeting label.
         */
        Calc2x2 newCalc = new Calc2x2(welcomeLabel.getText().substring(4).trim());
        newCalc.setVisible(true);
        dispose();
    }//GEN-LAST:event_twobytwoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backRegister1;
    private javax.swing.JLabel calculationMenuLabel;
    private javax.swing.JButton threebythree;
    private javax.swing.JLabel title;
    private javax.swing.JButton twobytwo;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
