/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram1psp.util;

import tddProgram1PSP.model.LinkedList;
import tddProgram1PSP.model.Node;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mateo Noreña
 * @author Joan Morales
 * @author Esteban Cataño
 */
public class Utils {
    
    public static double calculateMean(LinkedList list) {
        if(list.getHead() == null) {
            return 0;
        } else {
            double sum, mean, n;
            sum = 0;
            n = 0;
            Node p = list.getHead();
            while(p != null) {
                sum += p.getData();
                n++;
                p = p.getNext();
            }
            mean = sum/n;
            return mean;
        }
    }
    
    public static double calculateStdDev(LinkedList list) {
        if(list.getHead() == null) {
            return Double.NaN;
        } else {
            double stdDev, sum, n, mean;
            sum = 0;
            n = 0;
            mean = calculateMean(list);
            Node p = list.getHead();
            while(p != null) {
                n++;
                p = p.getNext();
            }
            p = list.getHead();
            while(p != null) {
                sum += Math.pow(p.getData()-mean, 2);
                p = p.getNext();
            }
            stdDev = Math.sqrt(sum/(n-1));
            return stdDev;
        }
    }
    
    public static LinkedList getData(File file) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            double data;
            LinkedList list = new LinkedList();

            while (line != null) {
                data = Double.parseDouble(line);
                list.addNode(new Node(data));
                line = br.readLine();                
            }
            return list;
        }
    }
    
}
