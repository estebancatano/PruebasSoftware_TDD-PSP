/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram2psp.util;

import tddprogram2psp.model.LinkedList;
import tddprogram2psp.model.Node;
import tddprogram2psp.util.exception.*;

/**
 * @author Mateo Noreña
 * @author Joan Morales
 * @author Esteban Cataño
 */
public class MathUtils {

    public static double calculateMean(LinkedList list, int index) throws BadIndexException {
        if(index < 0 || index > 1){
            throw new BadIndexException();
        }
        if(list.getHead() == null) {
            return 0;
        } else {
            double sum, mean, n;
            sum = 0;
            n = 0;
            Node p = list.getHead();
            while(p != null) {
                sum += (index == 0)?p.getData1():p.getData2();
                n++;
                p = p.getNext();
            }
            mean = sum/n;
            return mean;
        }
    }

    
}
