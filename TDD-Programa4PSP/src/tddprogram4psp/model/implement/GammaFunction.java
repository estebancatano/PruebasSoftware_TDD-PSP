/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram4psp.model.implement;

import tddprogram4psp.model.IFunction;

/**
 *
 * @author esteban.catanoe
 */
public class GammaFunction implements IFunction {

    @Override
    public double evaluate(double value) {
        System.out.println(value);
        if (value == 1.0) {
            return 1.0;
        } else if (value == 0.5) {
            return Math.sqrt(Math.PI);
        } else if (value > 0 && (value == Math.floor(value) || value*2.0 == Math.floor(value*2.0))) {
            return (value - 1.0) * evaluate(value - 1.0);
        } else {
            throw new ArithmeticException("La función no está definida para el valor dado");
        }

    }

}
