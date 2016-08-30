/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram3psp.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tddprogram3psp.model.LinkedList;
import tddprogram3psp.model.Node;

/**
 *
 * @author Mateo Noreña
 * @author Joan Morales
 * @author Esteban Cataño
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
        System.out.println("* Prueba para calcular la media de una lista vacía");
        LinkedList helperList = new LinkedList();
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(0, mean, 0.01);
    }
    
    /**
     * Prueba para calcular la media de una lista con datos positivos enteros
     */
    @Test
    public void testMeanIntegerDataList() {
        System.out.println("* Prueba para calcular la media de una lista con datos positivos enteros");
        LinkedList helperList = new LinkedList(new Node(5));
        helperList.addNode(new Node(8));
        helperList.addNode(new Node(4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(5.66, mean, 0.01);
        
    }
    /**
     * Prueba para calcular la media de una lista con datos positivos reales
     */
    @Test
    public void testMeanDoubleDataList(){
        System.out.println("* Prueba para calcular la media de una lista con datos positivos reales");
        LinkedList helperList = new LinkedList(new Node(40.5));
        helperList.addNode(new Node(38.3));
        helperList.addNode(new Node(56.4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(45.06, mean, 0.01);
    }
    /**
     * Prueba para calcular la media de una lista con datos negativos enteros
     */
    @Test
    public void testMeanNegativeIntegerData() {
        System.out.println("* Prueba para calcular la media de una lista con datos negativos enteros");
        LinkedList helperList = new LinkedList(new Node(-5));
        helperList.addNode(new Node(-8));
        helperList.addNode(new Node(-4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(-5.66, mean, 0.01);
        
    }
    /**
     * Prueba para calcular la media de una lista con datos negativos reales
     */
    @Test
    public void testMeanNegativeDoubleData(){
        System.out.println("* Prueba para calcular la media de una lista con datos negativos reales");
        LinkedList helperList = new LinkedList(new Node(-40.5));
        helperList.addNode(new Node(-38.3));
        helperList.addNode(new Node(-56.4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(-45.06, mean, 0.01);
    }
    /**
     * Prueba para calcular la media de una lista con datos enteros negativos y positivos
     */
    @Test
    public void testMeanNegativeAndPositiveIntegerData() {
        System.out.println("* Prueba para calcular la media de una lista con datos enteros negativos y positivos");
        LinkedList helperList = new LinkedList(new Node(-5));
        helperList.addNode(new Node(8));
        helperList.addNode(new Node(-4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(-0.33, mean, 0.01);
    }
    /**
     * Prueba para calcular la media de una lista con datos reales negativos y positivos
     */
    @Test
    public void testMeanNegativeAndPositiveDoubleData() {
        System.out.println("* Prueba para calcular la media de una lista con datos enteros negativos y positivos");
        LinkedList helperList = new LinkedList(new Node(-40.5));
        helperList.addNode(new Node(38.3));
        helperList.addNode(new Node(56.4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(18.06, mean, 0.01);
    }
    
    /**
     * Prueba calcular la desviacion estandar de una lista vacia
     */
    @Test
    public void testVarianceEmptyList() {
        System.out.println("* Prueba para calcular la desviación estándar de una lista vacía");
        LinkedList helperList = new LinkedList();
        double stdDev = MathUtils.calculateVariance(helperList);
        assertEquals(Double.NaN, stdDev, 0.01);
    }
    
    /**
     * Prueba para calcular la desviación estándar de una lista con datos negativos y positivos 
     */
    @Test
    public void testVariance() {
        System.out.println("* Prueba para calcular la desviación estándar de una lista con datos negativos y positivos");
        LinkedList helperList = new LinkedList(new Node(-5));
        helperList.addNode(new Node(8.0));
        helperList.addNode(new Node(-4.4));
        double variance = MathUtils.calculateVariance(helperList);
        assertEquals(53.85, variance, 0.01);
        helperList = new LinkedList(new Node(-5));
        helperList.addNode(new Node(7.0));
        helperList.addNode(new Node(-4.4));
        variance = MathUtils.calculateVariance(helperList);
        assertEquals(45.72, variance, 0.01);
        helperList = new LinkedList(new Node(5));
        helperList.addNode(new Node(8.0));
        helperList.addNode(new Node(4.4));
        variance = MathUtils.calculateVariance(helperList);
        assertEquals(3.72, variance, 0.01);
    }
}