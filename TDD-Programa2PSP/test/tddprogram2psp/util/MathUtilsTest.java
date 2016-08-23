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
            System.out.println("*Prueba: Calcular la media de datos que suman cero");
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
        System.out.println("*Prueba: Calcular la media de cuando se pasa un mal indíce");
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
    
    /**
     * Prueba calcular la sumatoria en una lista vacia
     */
    @Test
    public void testSumEmptyList() {
        try {
            System.out.println("*Prueba: Calcular la sumatoria de una lista vacía");
            LinkedList helperList = new LinkedList();
            double sum = MathUtils.calculateSum(helperList,0,1);
            assertEquals(0, sum, 0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba para calcular la sumatoria de una lista con datos positivos enteros
     */
    @Test
    public void testSumIntegerDataList() {
        try {
            System.out.println("*Prueba: Calcular la sumatoria de una lista con datos positivos enteros");
            LinkedList helperList = new LinkedList(new Node(5,7));
            helperList.addNode(new Node(8,2));
            helperList.addNode(new Node(4,9));
            assertEquals(17, MathUtils.calculateSum(helperList,0,1), 0.01);
            assertEquals(18, MathUtils.calculateSum(helperList, 1,1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba para calcular la sumatoria de una lista con datos positivos reales
     */
    @Test
    public void testSumDoubleDataList() {
        try {
            System.out.println("*Prueba: Calcular la sumatoria de una lista con datos positivos reales");
            LinkedList helperList = new LinkedList(new Node(40.5,17.3));
            helperList.addNode(new Node(38.3,22.8));
            helperList.addNode(new Node(56.4,39.6));
            assertEquals(135.2, MathUtils.calculateSum(helperList,0,1), 0.01);
            assertEquals(79.7, MathUtils.calculateSum(helperList, 1,1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba para calcular la sumatoria de una lista con datos negativos enteros
     */
    @Test
    public void testSumNegativeIntegerDataList() {
        try {
            System.out.println("*Prueba: Calcular la sumatoria de una lista con datos negativos enteros");
            LinkedList helperList = new LinkedList(new Node(-5,-7));
            helperList.addNode(new Node(-8,-2));
            helperList.addNode(new Node(-4,-9));
            assertEquals(-17, MathUtils.calculateSum(helperList,0,1), 0.01);
            assertEquals(-18, MathUtils.calculateSum(helperList, 1,1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba para calcular la sumatoria de una lista con datos negativos reales
     */
    @Test
    public void testSumNegativeDoubleDataList() {
        try {
            System.out.println("*Prueba: Calcular la sumatoria de una lista con datos negativos reales");
            LinkedList helperList = new LinkedList(new Node(-40.5,-17.3));
            helperList.addNode(new Node(-38.3,-22.8));
            helperList.addNode(new Node(-56.4,-39.6));
            assertEquals(-135.2, MathUtils.calculateSum(helperList,0,1), 0.01);
            assertEquals(-79.7, MathUtils.calculateSum(helperList,1,1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    /**
     * Prueba para calcular la sumatoria de una lista con datos negativos enteros
     */
    @Test
    public void testSumNegativeAndPostiveIntegerDataList() {
        try {
            System.out.println("*Prueba: Calcular la sumatoria de una lista con datos positivos y negativos enteros");
            LinkedList helperList = new LinkedList(new Node(-5,7));
            helperList.addNode(new Node(8,-2));
            helperList.addNode(new Node(-4,9));
            assertEquals(-1, MathUtils.calculateSum(helperList,0,1), 0.01);
            assertEquals(14, MathUtils.calculateSum(helperList,1,1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba para calcular la sumatoria de una lista con datos negativos reales
     */
    @Test
    public void testSumNegativeAndPositiveDoubleDataList() {
        try {
            System.out.println("*Prueba: Calcular la sumatoria de una lista con datos positivos y negativos reales");
            LinkedList helperList = new LinkedList(new Node(-40.5,17.3));
            helperList.addNode(new Node(38.3,-22.8));
            helperList.addNode(new Node(56.4,-39.6));
            assertEquals(54.2, MathUtils.calculateSum(helperList,0,1), 0.01);
            assertEquals(-45.1, MathUtils.calculateSum(helperList,1,1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba: Calcular la sumatoria de datos que suman cero
     */
    @Test
    public void testSumSum0() {
        try {
            System.out.println("*Prueba: Calcular la sumatoria de datos que suman cero");
            LinkedList helperList = new LinkedList(new Node(2,17.3));
            helperList.addNode(new Node(3,-22.8));
            helperList.addNode(new Node(-5,5.5));
            assertEquals(0.0, MathUtils.calculateSum(helperList,0,1), 0.01);
            assertEquals(0.0, MathUtils.calculateSum(helperList,1,1),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba: Calcular la sumatoria de cuando se pasa un mal indíce
     */
    @Test
    public void testSumBadIndex(){
        System.out.println("*Prueba: Calcular la sumatoria de cuando se pasa un mal indíce");
        LinkedList helperList = new LinkedList(new Node(-40.5,17.3));
        helperList.addNode(new Node(38.3,-22.8));
        helperList.addNode(new Node(56.4,-39.6));
        try {
            MathUtils.calculateSum(helperList,3,1);
            assertTrue(false);
        } catch (BadIndexException ex) {
            assertTrue(true);
        }
    }
    
    /**
     * Prueba: Calcular la sumatoria de una potencia positiva
     */
    @Test
    public void testSumPositivePower(){
        try{
            System.out.println("*Prueba: Calcular la sumatoria de una potencia positiva");
            LinkedList helperList = new LinkedList(new Node(5,1));
            helperList.addNode(new Node(7,3));
            helperList.addNode(new Node(4,6));
            assertEquals(90, MathUtils.calculateSum(helperList,0,2), 0.01);
            assertEquals(244, MathUtils.calculateSum(helperList,1,3),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba: Calcular la sumatoria de una potencia negativa
     */
    @Test
    public void testSumNegativePower(){
        try{
            System.out.println("*Prueba: Calcular la sumatoria de una potencia negativa");
            LinkedList helperList = new LinkedList(new Node(5,1));
            helperList.addNode(new Node(7,3));
            helperList.addNode(new Node(4,6));
            assertEquals(0.12, MathUtils.calculateSum(helperList,0,-2), 0.01);
            assertEquals(1.04, MathUtils.calculateSum(helperList,1,-3),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba: Calcular la sumatoria de una potencia cero
     */
    @Test
    public void testSumZeroPower(){
        try{
            System.out.println("*Prueba: Calcular la sumatoria de una potencia cero");
            LinkedList helperList = new LinkedList(new Node(5,1));
            helperList.addNode(new Node(7,3));
            helperList.addNode(new Node(4,6));
            assertEquals(3, MathUtils.calculateSum(helperList,0,0), 0.01);
            assertEquals(3, MathUtils.calculateSum(helperList,1,0),0.01);
        } catch (BadIndexException ex) {
            assertTrue(false);
        }
    }
    
    /**
     * Prueba calcular la sumatoria de una multiplicación en una lista vacia
     */
    @Test
    public void testSumMultEmptyList() {
        System.out.println("*Prueba: Calcular la sumatoria de una multiplicación en una lista vacía");
        LinkedList helperList = new LinkedList();
        double sum = MathUtils.calculateSumMult(helperList);
        assertEquals(0, sum, 0.01);
    }
    
    /**
     * Prueba para calcular la sumatoria de una multiplicación en una lista con datos positivos enteros
     */
    @Test
    public void testSumMultIntegerDataList() {
        System.out.println("*Prueba: Calcular la sumatoria de una multiplicación en una lista con datos positivos enteros");
        LinkedList helperList = new LinkedList(new Node(5,7));
        helperList.addNode(new Node(8,2));
        helperList.addNode(new Node(4,9));
        assertEquals(87, MathUtils.calculateSumMult(helperList), 0.01);
    }
    
    /**
     * Prueba para calcular la sumatoria de una multiplicación en una lista con datos positivos reales
     */
    @Test
    public void testSumMultDoubleDataList() {
        System.out.println("*Prueba: Calcular la sumatoria de una multiplicación en una lista con datos positivos reales");
        LinkedList helperList = new LinkedList(new Node(40.5,17.3));
        helperList.addNode(new Node(38.3,22.8));
        helperList.addNode(new Node(56.4,39.6));
        assertEquals(3807.33, MathUtils.calculateSumMult(helperList), 0.01);
    }
    
    /**
     * Prueba para calcular la sumatoria de una multiplicación en una lista con datos negativos enteros
     */
    @Test
    public void testSumMultNegativeIntegerDataList() {
        System.out.println("*Prueba: Calcular la sumatoria de una multiplicación en una lista con datos negativos enteros");
        LinkedList helperList = new LinkedList(new Node(-5,-7));
        helperList.addNode(new Node(-8,-2));
        helperList.addNode(new Node(-4,-9));
        assertEquals(87, MathUtils.calculateSumMult(helperList), 0.01);
    }
    
    /**
     * Prueba para calcular la sumatoria de una multiplicación en una lista con datos negativos reales
     */
    @Test
    public void testSumMultNegativeDoubleDataList() {
        System.out.println("*Prueba: Calcular la sumatoria de una multiplicación en una lista con datos negativos reales");
        LinkedList helperList = new LinkedList(new Node(-40.5,-17.3));
        helperList.addNode(new Node(-38.3,-22.8));
        helperList.addNode(new Node(-56.4,-39.6));
        assertEquals(3807.33, MathUtils.calculateSumMult(helperList), 0.01);
    }
    /**
     * Prueba para calcular la sumatoria de una multiplicación en una lista con datos negativos enteros
     */
    @Test
    public void testSumMultNegativeAndPostiveIntegerDataList() {
        System.out.println("*Prueba: Calcular la sumatoria de una multiplicación en una lista con datos positivos y negativos enteros");
        LinkedList helperList = new LinkedList(new Node(-5,7));
        helperList.addNode(new Node(8,-2));
        helperList.addNode(new Node(-4,9));
        assertEquals(-87, MathUtils.calculateSumMult(helperList), 0.01);
        ;
    }
    
    /**
     * Prueba para calcular la sumatoria de una multiplicación en una lista con datos negativos reales
     */
    @Test
    public void testSumMultNegativeAndPositiveDoubleDataList() {
        System.out.println("*Prueba: Calcular la sumatoria de una multiplicación en una lista con datos positivos y negativos reales");
        LinkedList helperList = new LinkedList(new Node(-40.5,17.3));
        helperList.addNode(new Node(38.3,-22.8));
        helperList.addNode(new Node(56.4,-39.6));
        assertEquals(-3807.33, MathUtils.calculateSumMult(helperList), 0.01);
    }
    
    /**
     * Prueba: Calcular la sumatoria con datos en cero
     */
    @Test
    public void testSumZeroNumber() {
        System.out.println("*Prueba: Calcular la sumatoria con datos en cero");
        LinkedList helperList = new LinkedList(new Node(0,17.3));
        helperList.addNode(new Node(3,0));
        helperList.addNode(new Node(-5,5.5));
        assertEquals(-27.5, MathUtils.calculateSumMult(helperList), 0.01);
    }
}
