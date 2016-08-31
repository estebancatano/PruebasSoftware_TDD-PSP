/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram3psp.model;

import tddprogram3psp.util.exception.EmptyListException;

/**
 *
 * @author mateo.norena
 */
public class RelativeSizeRanges {
    
    private LinkedList list;
    private LinkedList transformatedList;
    private Double[] ranges;

    public RelativeSizeRanges(LinkedList list) throws EmptyListException {
        this.list = list;
    }

    public LinkedList getTransformatedList() {
        return transformatedList;
    }
    
    protected void calculateLogarithmicTransformation() throws EmptyListException {
        if (list.getHead() == null) {
            throw new EmptyListException();
        }
        transformatedList = new LinkedList();
        Node p = list.getHead();
        double data = p.getData();
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
        if (list.getHead() == null) {
            throw new EmptyListException();
        }        
    }
    
    
}
