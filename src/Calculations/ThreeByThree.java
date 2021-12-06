/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

import java.text.DecimalFormat;

/**
 *
 * @author dacsa
 */
public class ThreeByThree {

    public static double[][] threeBythree(boolean valid, double A0, double B0, double C0,
            double D0, double E0, double F0,
            double G0, double H0, double I0,
            double J0, double K0, double L0) {

        double A = A0, B = B0, C = C0,
                D = D0, E = E0, F = F0,
                G = G0, H = H0, I = I0,
                J = J0, K = K0, L = L0;

//Matrix A ja invertida (A-1)
        double[][] matrixA = new double[3][3];
        matrixA[0][0] = A;
        matrixA[0][1] = B;
        matrixA[0][2] = C;

        matrixA[1][0] = D;
        matrixA[1][1] = E;
        matrixA[1][2] = F;

        matrixA[2][0] = G;
        matrixA[2][1] = H;
        matrixA[2][2] = I;

        // B
        double[][] matrixB = new double[3][1];
        matrixB[0][0] = J;
        matrixB[1][0] = K;
        matrixB[2][0] = L;

//X = (A-1*B)
        double[][] matrixXAB = new double[3][1];

        double[][] inverseCofactor = new double[3][3];
        inverseCofactor[0][0] = matrixA[1][1] * matrixA[2][2] - matrixA[1][2] * matrixA[2][1];
        inverseCofactor[0][1] = (matrixA[1][0] * matrixA[2][2] - matrixA[1][2] * matrixA[2][0]) * -1;
        inverseCofactor[0][2] = matrixA[1][0] * matrixA[2][1] - matrixA[1][1] * matrixA[2][0];

        inverseCofactor[1][0] = (matrixA[0][1] * matrixA[2][2] - matrixA[0][2] * matrixA[2][1]) * -1;
        inverseCofactor[1][1] = matrixA[0][0] * matrixA[2][2] - matrixA[0][2] * matrixA[2][0];
        inverseCofactor[1][2] = (matrixA[0][0] * matrixA[2][1] - matrixA[0][1] * matrixA[2][0]) * -1;

        inverseCofactor[2][0] = matrixA[0][1] * matrixA[1][2] - matrixA[0][2] * matrixA[1][1];
        inverseCofactor[2][1] = (matrixA[0][0] * matrixA[1][2] - matrixA[0][2] * matrixA[1][0]) * -1;
        inverseCofactor[2][2] = matrixA[0][0] * matrixA[1][1] - matrixA[0][1] * matrixA[1][0];

        double det = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                det = det + matrixA[i][j] * inverseCofactor[i][j];
            }
            System.out.println();
        }

        double cofactorTranspose[][] = new double[3][3];

        if (det == 0) {
            System.out.println("Determinat is equal to zero!\nEquation cannot be computed!");
            valid = false;
        } else {

            cofactorTranspose[0][0] = inverseCofactor[0][0] * (1 / det);
            cofactorTranspose[1][0] = inverseCofactor[0][1] * (1 / det);
            cofactorTranspose[2][0] = inverseCofactor[0][2] * (1 / det);

            cofactorTranspose[0][1] = inverseCofactor[1][0] * (1 / det);
            cofactorTranspose[1][1] = inverseCofactor[1][1] * (1 / det);
            cofactorTranspose[2][1] = inverseCofactor[1][2] * (1 / det);

            cofactorTranspose[0][2] = inverseCofactor[2][0] * (1 / det);
            cofactorTranspose[1][2] = inverseCofactor[2][1] * (1 / det);
            cofactorTranspose[2][2] = inverseCofactor[2][2] * (1 / det);
            
            valid = true;
        }

        double sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 3; k++) {
                    sum = sum + cofactorTranspose[i][k] * matrixB[k][j];
                }
                matrixXAB[i][j] = sum;
                sum = 0;
            }
        }
        
        DecimalFormat df = new DecimalFormat("####0.00");

        for (double i[] : matrixXAB) {
            for (double j : i) {

                Double d = j;
                String str = String.valueOf(d).split("\\.")[1];

                if (str.equals("0")) {
                    System.out.println(" " + d.longValue());

                } else {
                    System.out.println(" " + df.format(j));

                }
                System.out.println();
            }
        }

        return matrixXAB;
    }

}
