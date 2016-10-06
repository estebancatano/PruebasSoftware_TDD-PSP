/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram4psp.model;

import tddprogram4psp.model.implement.GammaFunction;
import tddprogram4psp.model.implement.TFunction;

/**
 *
 * @author esteban.catanoe
 */
public class SimpsonsRule {
    public double calculateNumericalIntegration(double x, int dof){
        int numSeg;
        double error;
        double result;
        double aux;
        double diff;
        IFunction function = new TFunction(dof, new GammaFunction());
        numSeg = 10;
        error = 0.00001;
        diff = 1;
        result = calculateIteration(x, dof, numSeg, function);
        while (diff >= error) {            
            aux = result;
            numSeg = numSeg * 2;
            result = calculateIteration(x, dof, numSeg, function);
            diff = Math.abs(result - aux);
        }
        return result;
    }
    
    public double calculateIteration(double x, int dof, int numSeg, IFunction function){
        //Sentencia #1
        double w;
        double p;
        //Sentencia #2
        if(dof <= 0){
            //Sentencia #3
            throw new ArithmeticException("El número de grados de libertad deben ser positivo");
        }
        //Sentencia #4
        if(numSeg <= 0 || (numSeg % 2 == 1)){
            //Sentencia #5
            throw new ArithmeticException("El número de segmentos debe ser positivo y par");
        }
        //Sentencia #6
        w = x / numSeg;
        p = 0;
        p = p + function.evaluate(0);
        for (int i = 1; i <= (numSeg-1); i=i+2) {
            //Sentencia #7
            p = p + (4 * function.evaluate(i*w));
        }
        //Sentencia #8
        for (int i = 2; i <= (numSeg-2); i=i+2) {
            //Sentencia #9
            p = p + (2 * function.evaluate(i*w));            
        }
        //Sentencia #10
        p = p + function.evaluate(x);
        p = p * (w/3);
        return p;
    }
}
