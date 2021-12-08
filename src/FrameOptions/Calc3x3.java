/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameOptions;

import Calculations.ThreeByThree;
import Calculations.TwoByTwo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author dacsa
 */
public class Calc3x3 extends javax.swing.JFrame {

    /**
     * Creates new form Calc3x3
     */
    public Calc3x3(String username) {
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
        jLabel1 = new javax.swing.JLabel();
        welcomeLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        varD = new javax.swing.JTextField();
        varE = new javax.swing.JTextField();
        varF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        calculateButton = new javax.swing.JButton();
        varA = new javax.swing.JTextField();
        varB = new javax.swing.JTextField();
        varC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        varJ = new javax.swing.JTextField();
        varK = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        varG = new javax.swing.JTextField();
        varH = new javax.swing.JTextField();
        varI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        varL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelResult = new javax.swing.JLabel();
        varXresult = new javax.swing.JLabel();
        varYresult = new javax.swing.JLabel();
        varZresult = new javax.swing.JLabel();
        history = new javax.swing.JButton();
        saveCalcButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        clearFieldsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Equation Calculator");
        title.setAlignmentY(0.0F);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insert the numeric values for the two equations");

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Hi");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Y +");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Equation 1");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Equation 2");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("X +");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Y +");

        calculateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("X +");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Z =");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Z =");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Z =");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Equation 3");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("X +");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Y +");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("If value of Y is negative, add a minus symbol in front of the value");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("e.g. 5x +(-2)y+(-7)=2 will be 5x - 2y -7 = 2");

        labelResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelResult.setText("Result:");

        varXresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        varXresult.setText("X = ");

        varYresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        varYresult.setText("Y = ");

        varZresult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        varZresult.setText("Z = ");

        history.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        history.setText("HISTORY");
        history.setAlignmentY(0.0F);
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });

        saveCalcButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        saveCalcButton.setText("SAVE");
        saveCalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCalcButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        clearFieldsButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clearFieldsButton.setText("CLEAR");
        clearFieldsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFieldsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(welcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(varG, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varI, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(varL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(varB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(varC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(varE, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(varF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(varJ, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(calculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(labelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(varXresult)
                        .addGap(97, 97, 97)
                        .addComponent(varYresult)
                        .addGap(97, 97, 97)
                        .addComponent(varZresult))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(saveCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearFieldsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(history)
                        .addGap(18, 18, 18)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(varJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(varK, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(calculateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(varA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(varD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(varG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(varH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(varI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(labelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varXresult)
                    .addComponent(varYresult)
                    .addComponent(varZresult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveCalcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearFieldsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        double A, B, C,
                D, E, F,
                G, H, I,
                //RESULT MATRIX
                J, K, L;
//        String equation1, equation2; 
        try {
            //EQ 1
            A = Double.parseDouble(varA.getText());
            B = Double.parseDouble(varB.getText());
            C = Double.parseDouble(varC.getText());
            //EQ 2
            D = Double.parseDouble(varD.getText());
            E = Double.parseDouble(varE.getText());
            F = Double.parseDouble(varF.getText());
            //EQ 3
            G = Double.parseDouble(varG.getText());
            H = Double.parseDouble(varH.getText());
            I = Double.parseDouble(varI.getText());
            //RESULT MATRIX
            J = Double.parseDouble(varJ.getText());
            K = Double.parseDouble(varK.getText());
            L = Double.parseDouble(varL.getText());

            if (A == 0 || B == 0 || C == 0
                    || D == 0 || E == 0 || F == 0
                    || G == 0 || H == 0 || I == 0) {
                JOptionPane.showMessageDialog(null, "Values of X, Y and Z CANNOT be 0");
            } else {
                //THREEBYTHREE METHOD
                double[][] result = ThreeByThree.threeBythree(A, B, C, D, E, F, G, H, I, J, K, L);
                DecimalFormat df = new DecimalFormat("####0.00");
                if(result[0][0]==0 && result[1][0]==0 && result[2][0]==0){
                labelResult.setText("Result: indeterminate!");
                    varXresult.setText("X = 0");
                    varYresult.setText("Y = 0");
                    varZresult.setText("Y = 0");
                }else{

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 1; j++) {
                        Double d = result[i][j];
                        String str = String.valueOf(d).split("\\.")[1];
                        switch (i) {
                            case 0:
                                if (str.equals("0")) {
                                    varXresult.setText("X = " + d.longValue());
                                } else {
                                    varXresult.setText("X = " + df.format(result[0][0]));
                                }
                                break;
                            case 1:
                                if (str.equals("0")) {
                                    varYresult.setText("Y = " + d.longValue());
                                } else {
                                    varYresult.setText("Y = " + df.format(result[1][0]));

                                }
                                break;
                            case 2:
                                if (str.equals("0")) {
                                    varZresult.setText("Z = " + d.longValue());
                                } else {
                                    varZresult.setText("Z = " + df.format(result[1][0]));

                                }
                                break;
                            default:
                                break;
                        }

                    }

                }
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "\nOne or more values are not numbers or are missing!\nTry again!");
            clearVars();
        }


    }//GEN-LAST:event_calculateButtonActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
        History newList = new History(welcomeLabel.getText().substring(4).trim());
        newList.setVisible(true);
        dispose();

    }//GEN-LAST:event_historyActionPerformed

    private void saveCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCalcButtonActionPerformed

        if (varXresult.getText().length() < 5) {
            JOptionPane.showMessageDialog(null, "\nThere is nothing to save");
        } else {
            double A, B, C, D, E, F, G, H, I, J, K, L;
            int iduser = 0;
            String equation1 = null, equation2 = null, equation3 = null;
            String result = varXresult.getText() + "   " + varYresult.getText() + "   " + varZresult.getText();
            try {
                if (validateIsNotNull()) {
                    A = converter(varA.getText());
                    B = converter(varB.getText());
                    C = converter(varC.getText());

                    D = converter(varD.getText());
                    E = converter(varE.getText());
                    F = converter(varF.getText());

                    G = converter(varG.getText());
                    H = converter(varH.getText());
                    I = converter(varI.getText());

                    J = converter(varJ.getText());
                    K = converter(varK.getText());
                    L = converter(varL.getText());

                    Double[] variables = {A, B, C,
                        D, E, F,
                        G, H, I,
                        J, K, L};
                    String[] formated = new String[12];

                    for (int i = 0; i < 12; i++) {
                        Double d = variables[i];
                        String str = String.valueOf(d).split("\\.")[1];

                        if (str.equals("0")) {
                            formated[i] = " " + d.longValue();
                        } else {
                            formated[i] = " " + variables[i];
                        }
                    }

                    for (int i = 0; i < 12; i++) {
                        System.out.println(formated[i]);
                    }

                    //ALL NEGATIVE
                    if (formated[1].contains("-") && formated[2].contains("-")) {
                        equation1 = formated[0] + "x " + formated[1] + "y " + formated[2] + "z " + "= " + formated[9];
                        //NONE NEGATIVE
                    } else if (!formated[1].contains("-") && !formated[2].contains("-")) {
                        equation1 = formated[0] + "x " + "+" + formated[1] + "y " + formated[2] + "+" + "z " + "= " + formated[9];
                        //Z NEGATIVE
                    } else if (!formated[1].contains("-") && formated[2].contains("-")) {
                        equation1 = formated[0] + "x " + "+" + formated[1] + "y " + formated[2] + "z " + "= " + formated[9];
                        //Y NEGATIVE
                    } else if (formated[1].contains("-") && !formated[2].contains("-")) {
                        equation1 = formated[0] + "x " + formated[1] + "y " + "+" + formated[2] + "z " + "= " + formated[9];
                    }

                    //ALL NEGATIVE
                    if (formated[4].contains("-") && formated[5].contains("-")) {
                        equation2 = formated[3] + "x " + formated[4] + "y " + formated[5] + "z " + "= " + formated[10];
                        //NONE NEGATIVE
                    } else if (!formated[4].contains("-") && !formated[5].contains("-")) {
                        equation2 = formated[3] + "x " + "+" + formated[4] + "y " + formated[5] + "+" + "z " + "= " + formated[10];
                        //Z NEGATIVE
                    } else if (!formated[4].contains("-") && formated[5].contains("-")) {
                        equation2 = formated[3] + "x " + "+" + formated[4] + "y " + formated[5] + "z " + "= " + formated[10];
                        //Y NEGATIVE
                    } else if (formated[4].contains("-") && !formated[5].contains("-")) {
                        equation2 = formated[3] + "x " + formated[4] + "y " + "+" + formated[5] + "z " + "= " + formated[10];
                    }

                    //ALL NEGATIVE
                    if (formated[7].contains("-") && formated[8].contains("-")) {
                        equation3 = formated[6] + "x " + formated[7] + "y " + formated[8] + "z " + "= " + formated[10];
                        //NONE NEGATIVE
                    } else if (!formated[7].contains("-") && !formated[8].contains("-")) {
                        equation3 = formated[6] + "x " + "+" + formated[7] + "y " + formated[8] + "+" + "z " + "= " + formated[10];
                        //Z NEGATIVE
                    } else if (!formated[7].contains("-") && formated[8].contains("-")) {
                        equation3 = formated[6] + "x " + "+" + formated[7] + "y " + formated[8] + "z " + "= " + formated[10];
                        //Y NEGATIVE
                    } else if (formated[7].contains("-") && !formated[8].contains("-")) {
                        equation3 = formated[6] + "x " + formated[7] + "y " + "+" + formated[8] + "z " + "= " + formated[10];
                    }

                    try {
                        //Connecting to the database
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "root");

                        String check = "SELECT * FROM calculator WHERE equation1=? and equation2=? and equation3=? and results=?";
                        PreparedStatement pstCheck = con.prepareStatement(check);

                        pstCheck.setString(1, equation1);
                        pstCheck.setString(2, equation2);
                        pstCheck.setString(3, equation3);
                        pstCheck.setString(4, result);

                        ResultSet rs = pstCheck.executeQuery();

                        if (rs.next()) {
                            JOptionPane.showMessageDialog(null, "\nEquations already saved!\nCheck your history.");
                            clearVars();
                        } else {

                            String checkUser = "SELECT iduser FROM users WHERE username=?";
                            String addEquation = "INSERT INTO calculator (iduser,equation1,equation2,equation3,results) VALUES (?, ?, ?, ?, ?)";

                            PreparedStatement pst = con.prepareStatement(checkUser);

                            pst.setString(1, welcomeLabel.getText().substring(4).trim());

                            rs = pst.executeQuery();

                            if (rs.next()) {
                                iduser = rs.getInt("iduser");
                            }

                            pst = con.prepareStatement(addEquation);

                            pst.setInt(1, iduser);
                            pst.setString(2, equation1);
                            pst.setString(3, equation2);
                            pst.setString(4, equation3);
                            pst.setString(5, result);

                            if (pst.executeUpdate() != 0) {
                                JOptionPane.showMessageDialog(null, "\nEquations Saved");
                                clearVars();
                                pst.close();

                            } else {

                                JOptionPane.showMessageDialog(null, "Something went wrong");

                                pst.close();
                                con.close();
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e + "\nSaving Not Successful");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "\nOne or more values are not numbers or are missing!\nTry again!");
                clearVars();
            }
        }


    }//GEN-LAST:event_saveCalcButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        /**
         * Back button will take the user back to the Calculation menu and
         * dispose of the current menu. It will also give the name of the User
         * as a parameter to be used in the greeting label.
         */
        Calculation calcMenu = new Calculation(welcomeLabel.getText().substring(4).trim());
        calcMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearFieldsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFieldsButtonActionPerformed
        /**
         * This button clears the fields so the user can start over.
         */
        Object[] options = {"Save your result", "Clear without saving"};
        int opt = JOptionPane.showOptionDialog(Calc3x3.this, "What would you like to do?", " You are clearing the fields ",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (opt == JOptionPane.YES_OPTION) {
            //Option Save Results
            saveCalcButtonActionPerformed(null);
        } else {
            //Option clear without saving
            clearVars();
        }

    }//GEN-LAST:event_clearFieldsButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    public javax.swing.JButton calculateButton;
    private javax.swing.JButton clearFieldsButton;
    private javax.swing.JButton history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelResult;
    private javax.swing.JButton saveCalcButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField varA;
    private javax.swing.JTextField varB;
    private javax.swing.JTextField varC;
    private javax.swing.JTextField varD;
    private javax.swing.JTextField varE;
    private javax.swing.JTextField varF;
    private javax.swing.JTextField varG;
    private javax.swing.JTextField varH;
    private javax.swing.JTextField varI;
    private javax.swing.JTextField varJ;
    private javax.swing.JTextField varK;
    private javax.swing.JTextField varL;
    private javax.swing.JLabel varXresult;
    private javax.swing.JLabel varYresult;
    private javax.swing.JLabel varZresult;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
 
    private void clearVars() {
        varA.setText("");
        varB.setText("");
        varC.setText("");
        varD.setText("");
        varE.setText("");
        varF.setText("");
        varG.setText("");
        varH.setText("");
        varI.setText("");
        varJ.setText("");
        varK.setText("");
        varL.setText("");
        varXresult.setText("X = ");
        varYresult.setText("Y = ");
        varZresult.setText("Z = ");

    }

    private Double converter(String x) {
        return (x == null || x.isEmpty()) ? 0 : Double.parseDouble(x);
    }

    private boolean validateIsNotNull() {

        double A, B, C, D, E, F, G, H, I, J, K, L;

        A = Double.parseDouble(varA.getText());
        B = Double.parseDouble(varB.getText());
        C = Double.parseDouble(varC.getText());
        D = Double.parseDouble(varD.getText());
        E = Double.parseDouble(varE.getText());
        F = Double.parseDouble(varF.getText());
        G = Double.parseDouble(varG.getText());
        H = Double.parseDouble(varH.getText());
        I = Double.parseDouble(varI.getText());
        J = Double.parseDouble(varJ.getText());
        K = Double.parseDouble(varK.getText());
        L = Double.parseDouble(varL.getText());

        return !(varA.getText().isEmpty() || varB.getText().isEmpty() || varC.getText().isEmpty()
                || varD.getText().isEmpty() || varE.getText().isEmpty() || varF.getText().isEmpty()
                || varG.getText().isEmpty() || varH.getText().isEmpty() || varI.getText().isEmpty()
                || varJ.getText().isEmpty() || varK.getText().isEmpty() || varL.getText().isEmpty());

    }

}
