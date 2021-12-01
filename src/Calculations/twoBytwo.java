/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

/**
 *
 * @author dacsa
 */
public class twoBytwo implements equationsCalc {

    int A, B, C, D, E, F;
    Integer[][] matrixA = {{A, B},
    {C, D}};
    Integer[][] matrixB = {{E},
    {F}};
    int det = A * D - B * C;
    Integer[][] inverse = {{D, -B}, 
                           {-C, A}};
    Integer[][] matrixX = new Integer[2][1];

    @Override
    public void writeMatrices() {

    }

    @Override
    public void calcInverse() {

    }

}
