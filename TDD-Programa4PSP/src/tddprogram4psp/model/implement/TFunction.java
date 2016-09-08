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
public class TFunction implements IFunction{
    
    private double dof;
    private IFunction gammaFunction;

    public TFunction(double dof, IFunction gammaFunction) {
        this.dof = dof;
        this.gammaFunction = gammaFunction;
    }

    @Override
    public double evaluate(double value) {
        double num = gammaFunction.evaluate((dof+1.0)/2.0);
        double den = Math.sqrt(dof*Math.PI)*gammaFunction.evaluate(dof/2.0);
        double var = Math.pow(1 + (Math.pow(value,2.0)/dof), -(dof+1.0)/2.0);
        return (num/den)*var;
    }

    public double getDof() {
        return dof;
    }

    public void setDof(double dof) {
        this.dof = dof;
    }

    public IFunction getGammaFunction() {
        return gammaFunction;
    }

    public void setGammaFunction(IFunction gammaFunction) {
        this.gammaFunction = gammaFunction;
    }
    
}
