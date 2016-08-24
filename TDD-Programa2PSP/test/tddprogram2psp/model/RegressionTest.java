/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram2psp.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tddprogram2psp.util.exception.BadIndexException;

/**
 *
 * @author esteban.catanoe
 */
public class RegressionTest {
    
    public RegressionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Prueba calcular parámetros en una lista vacia
     */
    @Test
    public void testParametersEmptyList() {
        try {
            System.out.println("*Prueba: Calcular parámetros en una lista vacía");
            LinkedList helperList = new LinkedList();
            Regression regression = new Regression(helperList);
            double[] parameters = regression.calculateParameters();
            assertEquals(0.0, parameters[0],0.01);
            assertEquals(0.0, parameters[1],0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba calcular parámetros en una lista con datos enteros positivos
     */
    @Test
    public void testParametersIntegerDataList() {
        try {
            System.out.println("*Prueba: Calcular parámetros con datos enteros positivos");
            LinkedList helperList = new LinkedList(new Node(5,7));
            helperList.addNode(new Node(8,2));
            helperList.addNode(new Node(4,9));
            Regression regression = new Regression(helperList);
            double[] parameters = regression.calculateParameters();
            assertEquals(15.80, parameters[0],0.01);
            assertEquals(-1.73, parameters[1],0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba calcular parámetros en una lista con datos reales positivos
     */
    @Test
    public void testParametersDoubleDataList() {
        try {
            System.out.println("*Prueba: Calcular parámetros con datos reales positivos");
            LinkedList helperList = new LinkedList(new Node(5.3,7.7));
            helperList.addNode(new Node(8.4,2.6));
            helperList.addNode(new Node(4.5,9.1));
            Regression regression = new Regression(helperList);
            double[] parameters = regression.calculateParameters();
            assertEquals(16.54, parameters[0],0.01);
            assertEquals(-1.66, parameters[1],0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba calcular parámetros en una lista con datos enteros negativos
     */
    @Test
    public void testParametersNegativeIntegerDataList() {
        try {
            System.out.println("*Prueba: Calcular parámetros con datos enteros negativos");
            LinkedList helperList = new LinkedList(new Node(5,7));
            helperList.addNode(new Node(8,2));
            helperList.addNode(new Node(4,9));
            Regression regression = new Regression(helperList);
            double[] parameters = regression.calculateParameters();
            assertEquals(15.80, parameters[0],0.01);
            assertEquals(-1.73, parameters[1],0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba calcular parámetros en una lista con datos reales negativos
     */
    @Test
    public void testParametersNegativeDoubleDataList() {
        try {
            System.out.println("*Prueba: Calcular parámetros con datos reales negativos");
            LinkedList helperList = new LinkedList(new Node(5.3,7.7));
            helperList.addNode(new Node(8.4,2.6));
            helperList.addNode(new Node(4.5,9.1));
            Regression regression = new Regression(helperList);
            double[] parameters = regression.calculateParameters();
            assertEquals(16.54, parameters[0],0.01);
            assertEquals(-1.66, parameters[1],0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
}
