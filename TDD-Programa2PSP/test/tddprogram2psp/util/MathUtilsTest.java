/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram2psp.util;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import tddprogram2psp.model.LinkedList;
import tddprogram2psp.model.Node;
import tddprogram2psp.util.exception.BadIndexException;

/**
 *
 * @author Esteban
 */
public class MathUtilsTest {
    
    public MathUtilsTest() {
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
     * Prueba calcular media en una lista vacia
     */
    @Test
    public void testMeanEmptyList() {
        try {
            System.out.println("*Prueba: Calcular la media de una lista vacía");
            LinkedList helperList = new LinkedList();
            double mean = MathUtils.calculateMean(helperList,0);
            assertEquals(0, mean, 0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }    
    /**
     * Prueba para calcular la media de una lista con datos positivos enteros
     */
    @Test
    public void testMeanIntegerDataList() {
        try {
            System.out.println("*Prueba: Calcular la media de una lista con datos positivos enteros");
            LinkedList helperList = new LinkedList(new Node(5,7));
            helperList.addNode(new Node(8,2));
            helperList.addNode(new Node(4,9));
            assertEquals(5.66, MathUtils.calculateMean(helperList,0), 0.01);
            assertEquals(6, MathUtils.calculateMean(helperList, 1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba para calcular la media de una lista con datos positivos reales
     */
    @Test
    public void testMeanDoubleDataList() {
        try {
            System.out.println("*Prueba: Calcular la media de una lista con datos positivos reales");
            LinkedList helperList = new LinkedList(new Node(40.5,17.3));
            helperList.addNode(new Node(38.3,22.8));
            helperList.addNode(new Node(56.4,39.6));
            assertEquals(45.06, MathUtils.calculateMean(helperList,0), 0.01);
            assertEquals(26.56, MathUtils.calculateMean(helperList, 1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba para calcular la media de una lista con datos negativos enteros
     */
    @Test
    public void testMeanNegativeIntegerDataList() {
        try {
            System.out.println("*Prueba: Calcular la media de una lista con datos negativos enteros");
            LinkedList helperList = new LinkedList(new Node(-5,-7));
            helperList.addNode(new Node(-8,-2));
            helperList.addNode(new Node(-4,-9));
            assertEquals(-5.66, MathUtils.calculateMean(helperList,0), 0.01);
            assertEquals(-6, MathUtils.calculateMean(helperList, 1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba para calcular la media de una lista con datos negativos reales
     */
    @Test
    public void testMeanNegativeDoubleDataList() {
        try {
            System.out.println("*Prueba: Calcular la media de una lista con datos negativos reales");
            LinkedList helperList = new LinkedList(new Node(-40.5,-17.3));
            helperList.addNode(new Node(-38.3,-22.8));
            helperList.addNode(new Node(-56.4,-39.6));
            assertEquals(-45.06, MathUtils.calculateMean(helperList,0), 0.01);
            assertEquals(-26.56, MathUtils.calculateMean(helperList, 1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    /**
     * Prueba para calcular la media de una lista con datos negativos enteros
     */
    @Test
    public void testMeanNegativeAndPostiveIntegerDataList() {
        try {
            System.out.println("*Prueba: Calcular la media de una lista con datos positivos y negativos enteros");
            LinkedList helperList = new LinkedList(new Node(-5,7));
            helperList.addNode(new Node(8,-2));
            helperList.addNode(new Node(-4,9));
            assertEquals(-0.33, MathUtils.calculateMean(helperList,0), 0.01);
            assertEquals(4.66, MathUtils.calculateMean(helperList, 1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba para calcular la media de una lista con datos negativos reales
     */
    @Test
    public void testMeanNegativeAndPositiveDoubleDataList() {
        try {
            System.out.println("*Prueba: Calcular la media de una lista con datos positivos y negativos reales");
            LinkedList helperList = new LinkedList(new Node(-40.5,17.3));
            helperList.addNode(new Node(38.3,-22.8));
            helperList.addNode(new Node(56.4,-39.6));
            assertEquals(18.06, MathUtils.calculateMean(helperList,0), 0.01);
            assertEquals(-15.03, MathUtils.calculateMean(helperList, 1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba: Calcular la media de datos que suman cero
     */
    @Test
    public void testMeanSum0() {
        try {
            System.out.println("*Calcular la media de datos que suman cero");
            LinkedList helperList = new LinkedList(new Node(2,17.3));
            helperList.addNode(new Node(3,-22.8));
            helperList.addNode(new Node(-5,5.5));
            assertEquals(0.0, MathUtils.calculateMean(helperList,0), 0.01);
            assertEquals(0.0, MathUtils.calculateMean(helperList, 1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba: Calcular la media de cuando se pasa un mal indíce
     */
    @Test
    public void testMeanBadIndex(){
        System.out.println("Prueba: Calcular la media de cuando se pasa un mal indíce");
        LinkedList helperList = new LinkedList(new Node(-40.5,17.3));
        helperList.addNode(new Node(38.3,-22.8));
        helperList.addNode(new Node(56.4,-39.6));
        try {
            MathUtils.calculateMean(helperList,3);
            assertTrue(false);
        } catch (BadIndexException ex) {
            assertTrue(true);
        }
    }
}
