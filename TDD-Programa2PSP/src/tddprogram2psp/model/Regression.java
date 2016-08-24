/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram2psp.model;

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

    public double[] calculateParameters() throws BadIndexException {
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
            b1 = num / den;
            b0 = yAvg - (b1 * xAvg);
        }
        parameters = new double[]{b0, b1};
        return parameters;
    }

}
