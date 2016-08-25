/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram2psp.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import tddprogram2psp.model.LinkedList;
import tddprogram2psp.model.Node;
import tddprogram2psp.util.exception.ValuesNumberException;

/**
 * @author Mateo Noreña
 * @author Joan Morales
 * @author Esteban Cataño
 */
public class SystemUtils {
    
        public static LinkedList getData(File file) throws FileNotFoundException, IOException, ValuesNumberException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            double data1, data2;
            LinkedList list = new LinkedList();
            while (line != null) {
                String[] lineArray = line.split(",");
                if(lineArray.length != 2) {
                    throw new ValuesNumberException();
                }
                data1 = Double.parseDouble(lineArray[0].trim());
                data2 = Double.parseDouble(lineArray[1].trim());
                list.addNode(new Node(data1, data2));
                line = br.readLine();
            }
            return list;
        }
    }
    
}
