/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

import javax.swing.JOptionPane;

/**
 *
 * @author dacsa
 */
public class TwoByTwo {

    public static double[][] twoBytwo(double A0, double B0, double C0, double D0, double E0, double F0) {

        double A = A0, B = B0, C = C0, D = D0, E = E0, F = F0;

//Matrix A ja invertida (A-1)
        double[][] matrixA = new double[2][2];
        matrixA[0][0] = A;
        matrixA[0][1] = B;
        matrixA[1][0] = C;
        matrixA[1][1] = D;

        // B
        double[][] matrixB = new double[2][1];
        matrixB[0][0] = E;
        matrixB[1][0] = F;

//X
        double[][] matrixX = new double[2][1];

//(A-1*B)
        double[][] matrixAB = new double[2][1];

//    
        double sum = 0;
        double[][] inverse = new double[2][2];
        inverse[0][0] = D;
        inverse[1][1] = A;
        inverse[0][1] = B * (-1);
        inverse[1][0] = C * (-1);

        //X = A-1*B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 2; k++) {
                    sum = sum + inverse[i][k] * matrixB[k][j];
                }

                matrixAB[i][j] = sum;
                sum = 0;
            }
        }

        //For loop to print Matrix A*B
        System.out.println("MatrixAB");
        for (double i[] : matrixAB) {
            for (double j : i) {
                Double d = j;
                String x = String.valueOf(d).split("\\.")[1];

                if (x.equals("0")) {
                    System.out.println(" " + d.longValue());
                } else {
                    System.out.println(" " + j);
                }
                System.out.println();
            }
        }

        double det = (A * D) - (B * C);
        //Condition to check if the determinat is equal to zero
        if (det == 0) {
            JOptionPane.showMessageDialog(null, "Determinant is equal to zero!\nEquation cannot be computed!");
        } else {
            matrixX[0][0] = (1 / det) * matrixAB[0][0];
            matrixX[1][0] = (1 / det) * matrixAB[1][0];

            System.out.println("Result Matrix");
            for (double i[] : matrixX) {
                for (double j : i) {

                    Double d = j;
                    String str = String.valueOf(d).split("\\.")[1];

                    if (str.equals("0")) {
                        System.out.println(" " + d.longValue());

                    } else {
                        System.out.println(" " + j);

                    }
                    System.out.println();
                }
            }
        }
        return matrixX;
    }

}
