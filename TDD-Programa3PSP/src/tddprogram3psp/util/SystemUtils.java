/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram3psp.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import tddprogram3psp.model.LinkedList;
import tddprogram3psp.model.Node;

/**
 * @author Mateo Noreña
 * @author Joan Morales
 * @author Esteban Cataño
 */
public class SystemUtils {

    public static LinkedList getData(File file) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            double data;
            LinkedList list = new LinkedList();
            while (line != null) {
                if (!line.isEmpty()) {
                    data = Double.parseDouble(line);
                    list.addNode(new Node(data));
                }
                line = br.readLine();
            }
            return list;
        }

    }
}
