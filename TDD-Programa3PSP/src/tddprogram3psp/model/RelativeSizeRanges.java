/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram3psp.model;

import tddprogram3psp.util.MathUtils;
import tddprogram3psp.util.exception.EmptyListException;

/**
 *
 * @author mateo.norena
 */
public class RelativeSizeRanges {
    
    private final LinkedList list;
    private LinkedList transformatedList;
    private double[] ranges;

    public RelativeSizeRanges(LinkedList list) throws EmptyListException {
        this.list = list;
        transformatedList = new LinkedList();
    }

    public LinkedList getTransformatedList() {
        return transformatedList;
    }
    
    public double[] getRanges() {
        return ranges;
    }
    
    public double[] calculateRelativeSizeRanges() throws EmptyListException {
        
        if(list.getHead() == null) {
            throw new EmptyListException();
        }
        
        if(list.getHead().getNext() == null) {
            throw new ArithmeticException("No se pueden obtener los rangos de tamaño relativo de un solo valor");
        }
        
        calculateLogarithmicTransformation();
        calculateLogarithmicRanges();
        calculateAntiLogarithm();
        return ranges;
    }
    
    protected void calculateLogarithmicTransformation() throws EmptyListException {
        if (list.getHead() == null) {
            throw new EmptyListException();
        }
        Node p = list.getHead();
        double data;
        while (p != null) {
            data = p.getData();
            if(!(data > 0) || data == Double.POSITIVE_INFINITY) {
                throw new ArithmeticException("No es posible calcular el logaritmo natural");
            }
            transformatedList.addNode(new Node(Math.log(data)));
            p = p.getNext();
        }
    }  

    protected void calculateLogarithmicRanges() throws EmptyListException {
        if (transformatedList.getHead() == null) {
            throw new EmptyListException();
        }
        
        if (transformatedList.getHead().getNext() == null) {
            throw new ArithmeticException("No se puede obtener rangos logarítmicos de un solo dato");
        } 

        double avg = MathUtils.calculateMean(transformatedList);
        double variance = MathUtils.calculateVariance(transformatedList);
        double stdDev = MathUtils.calculateStdDev(variance);
        
        ranges = new double[5];
        ranges[0] = avg - 2*stdDev;
        ranges[1] = avg - stdDev;
        ranges[2] = avg;
        ranges[3] = avg + stdDev;
        ranges[4] = avg + 2*stdDev;
    }

    protected void calculateAntiLogarithm() {
        
        ranges[0] = Math.pow(Math.E, ranges[0]);
        ranges[1] = Math.pow(Math.E, ranges[1]);
        ranges[2] = Math.pow(Math.E, ranges[2]);
        ranges[3] = Math.pow(Math.E, ranges[3]);
        ranges[4] = Math.pow(Math.E, ranges[4]);
    }
}
