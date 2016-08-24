/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram2psp.model;

import tddprogram2psp.util.exception.ZeroDivideException;
import tddprogram2psp.util.MathUtils;
import tddprogram2psp.util.exception.BadIndexException;

/**
 * @author Mateo Noreña
 * @author Joan Morales
 * @author Esteban Cataño
 */
public class Regression {

    private LinkedList list;

    public Regression(LinkedList list) {
        this.list = list;
    }

    public double[] calculateParameters() throws BadIndexException, ZeroDivideException {
        double parameters[];
        double xAvg;
        double yAvg;
        int n;
        double num;
        double den;
        double b1;
        double b0;
        xAvg = MathUtils.calculateMean(list, 0);
        yAvg = MathUtils.calculateMean(list, 1);
        n = list.calculateLength();
        if (n == 0) {
            b1 = 0;
            b0 = 0;
        } else {
            num = MathUtils.calculateSumMult(list) - (n * xAvg * yAvg);
            den = MathUtils.calculateSum(list, 0, 2) - (n * Math.pow(xAvg, 2));
            if(den == 0){
                throw new ZeroDivideException();
            }
            b1 = num / den;
            b0 = yAvg - (b1 * xAvg);
        }
        parameters = new double[]{b0, b1};
        return parameters;
    }

    double[] calculateCorrelations() throws ZeroDivideException, BadIndexException {
        double correlations[];
        int n;
        double sumX;
        double sumY;
        double num;
        double den;
        double rXY;
        double r2;
        n = list.calculateLength();
        if (n == 0) {
            rXY = 0;
            r2 = 0;
        } else {
            sumX = MathUtils.calculateSum(list, 0, 1);
            sumY = MathUtils.calculateSum(list, 1, 1);
            num = (n*MathUtils.calculateSumMult(list)) - (sumX * sumY);
            den = ((n*MathUtils.calculateSum(list, 0, 2)) - Math.pow(sumX, 2)) 
                    * ((n*MathUtils.calculateSum(list, 1, 2)) - Math.pow(sumY, 2));
            if(den == 0){
                throw new ZeroDivideException();
            }
            rXY = num / Math.sqrt(den);
            r2 = rXY * rXY;
        }
        correlations = new double[]{rXY, r2};
        return correlations;
    }

}
