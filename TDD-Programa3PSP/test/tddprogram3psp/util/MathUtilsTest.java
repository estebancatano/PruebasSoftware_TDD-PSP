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
import tddprogram3psp.util.exception.EmptyListException;

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
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test(expected = EmptyListException.class)
    public void testMeanEmptyList() throws EmptyListException {
        System.out.println("* Prueba para calcular la media de una lista vacía");
        LinkedList helperList = new LinkedList();
        MathUtils.calculateMean(helperList);
    }
    
    /**
     * Prueba para calcular la media de una lista con datos positivos enteros
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testMeanIntegerDataList() throws EmptyListException {
        System.out.println("* Prueba para calcular la media de una lista con datos positivos enteros");
        LinkedList helperList = new LinkedList(new Node(5));
        helperList.addNode(new Node(8));
        helperList.addNode(new Node(4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(5.66, mean, 0.01);
        
    }
    /**
     * Prueba para calcular la media de una lista con datos positivos reales
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testMeanDoubleDataList() throws EmptyListException{
        System.out.println("* Prueba para calcular la media de una lista con datos positivos reales");
        LinkedList helperList = new LinkedList(new Node(40.5));
        helperList.addNode(new Node(38.3));
        helperList.addNode(new Node(56.4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(45.06, mean, 0.01);
    }
    /**
     * Prueba para calcular la media de una lista con datos negativos enteros
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testMeanNegativeIntegerData() throws EmptyListException {
        System.out.println("* Prueba para calcular la media de una lista con datos negativos enteros");
        LinkedList helperList = new LinkedList(new Node(-5));
        helperList.addNode(new Node(-8));
        helperList.addNode(new Node(-4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(-5.66, mean, 0.01);
        
    }
    /**
     * Prueba para calcular la media de una lista con datos negativos reales
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testMeanNegativeDoubleData() throws EmptyListException{
        System.out.println("* Prueba para calcular la media de una lista con datos negativos reales");
        LinkedList helperList = new LinkedList(new Node(-40.5));
        helperList.addNode(new Node(-38.3));
        helperList.addNode(new Node(-56.4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(-45.06, mean, 0.01);
    }
    /**
     * Prueba para calcular la media de una lista con datos enteros negativos y positivos
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testMeanNegativeAndPositiveIntegerData() throws EmptyListException {
        System.out.println("* Prueba para calcular la media de una lista con datos enteros negativos y positivos");
        LinkedList helperList = new LinkedList(new Node(-5));
        helperList.addNode(new Node(8));
        helperList.addNode(new Node(-4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(-0.33, mean, 0.01);
    }
    /**
     * Prueba para calcular la media de una lista con datos reales negativos y positivos
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testMeanNegativeAndPositiveDoubleData() throws EmptyListException {
        System.out.println("* Prueba para calcular la media de una lista con datos enteros negativos y positivos");
        LinkedList helperList = new LinkedList(new Node(-40.5));
        helperList.addNode(new Node(38.3));
        helperList.addNode(new Node(56.4));
        double mean = MathUtils.calculateMean(helperList);
        assertEquals(18.06, mean, 0.01);
    }

    /**
     * Prueba calcular varianza en una lista vacia
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test(expected = EmptyListException.class)
    public void testVarianceEmptyList() throws EmptyListException {
        System.out.println("* Prueba para calcular la varianza de una lista vacía");
        LinkedList helperList = new LinkedList();
        MathUtils.calculateVariance(helperList);
    }
    
    /**
     * Prueba calcular varianza de un solo dato
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test(expected = ArithmeticException.class)
    public void testVarianceDatum() throws EmptyListException {
        System.out.println("* Prueba para calcular la varianza de un solo dato");
        LinkedList helperList = new LinkedList(new Node(5));
        MathUtils.calculateVariance(helperList);
    }
    
    /**
     * Prueba para calcular la varianza de una lista con datos positivos enteros
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testVarianceIntegerDataList() throws EmptyListException {
        System.out.println("* Prueba para calcular la varianza de una lista con datos positivos enteros");
        LinkedList helperList = new LinkedList(new Node(5));
        helperList.addNode(new Node(8));
        helperList.addNode(new Node(4));
        double variance = MathUtils.calculateVariance(helperList);
        assertEquals(4.33, variance, 0.01);
        
    }
    /**
     * Prueba para calcular la varianza de una lista con datos positivos reales
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testVarianceDoubleDataList() throws EmptyListException{
        System.out.println("* Prueba para calcular la varianza de una lista con datos positivos reales");
        LinkedList helperList = new LinkedList(new Node(40.5));
        helperList.addNode(new Node(38.3));
        helperList.addNode(new Node(56.4));
        double variance = MathUtils.calculateVariance(helperList);
        assertEquals(97.54, variance, 0.01);
    }
    /**
     * Prueba para calcular la varianza de una lista con datos negativos enteros
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testVarianceNegativeIntegerData() throws EmptyListException {
        System.out.println("* Prueba para calcular la varianza de una lista con datos negativos enteros");
        LinkedList helperList = new LinkedList(new Node(-5));
        helperList.addNode(new Node(-8));
        helperList.addNode(new Node(-4));
        double variance = MathUtils.calculateVariance(helperList);
        assertEquals(4.33, variance, 0.01);
        
    }
    /**
     * Prueba para calcular la varianza de una lista con datos negativos reales
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testVarianceNegativeDoubleData() throws EmptyListException{
        System.out.println("* Prueba para calcular la varianza de una lista con datos negativos reales");
        LinkedList helperList = new LinkedList(new Node(-40.5));
        helperList.addNode(new Node(-38.3));
        helperList.addNode(new Node(-56.4));
        double variance = MathUtils.calculateVariance(helperList);
        assertEquals(97.54, variance, 0.01);
    }
    /**
     * Prueba para calcular la varianza de una lista con datos enteros negativos y positivos
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testVarianceNegativeAndPositiveIntegerData() throws EmptyListException {
        System.out.println("* Prueba para calcular la varianza de una lista con datos enteros negativos y positivos");
        LinkedList helperList = new LinkedList(new Node(-5));
        helperList.addNode(new Node(8));
        helperList.addNode(new Node(-4));
        double variance = MathUtils.calculateVariance(helperList);
        assertEquals(52.33, variance, 0.01);
    }
    /**
     * Prueba para calcular la varianza de una lista con datos reales negativos y positivos
     * @throws tddprogram3psp.util.exception.EmptyListException
     */
    @Test
    public void testVarianceNegativeAndPositiveDoubleData() throws EmptyListException {
        System.out.println("* Prueba para calcular la varianza de una lista con datos enteros negativos y positivos");
        LinkedList helperList = new LinkedList(new Node(-40.5));
        helperList.addNode(new Node(38.3));
        helperList.addNode(new Node(56.4));
        double variance = MathUtils.calculateVariance(helperList);
        assertEquals(2654.44, variance, 0.01);
    }
    
    /**
     * Prueba para calcular la desviación estándar de una varianza entera positiva
     */
    @Test
    public void testStandardDeviationIntegerPositiveVariance(){
        System.out.println("* Prueba para calcular la desviación estándar de una varianza entera positiva");
        double sdtDev = MathUtils.calculateStdDev(85);
        assertEquals(9.22, sdtDev,0.01);
    }
    
    /**
     * Prueba para calcular la desviación estándar de una varianza real positiva
     */
    @Test
    public void testStandardDeviationDoublePositiveVariance(){
        System.out.println("* Prueba para calcular la desviación estándar de una varianza real positiva");
        double sdtDev = MathUtils.calculateStdDev(67.5);
        assertEquals(8.22, sdtDev,0.01);
    }
    
    /**
     * Prueba para calcular la desviación estándar de una varianza cero
     */
    @Test
    public void testStandardDeviationZeroVariance(){
        System.out.println("* Prueba para calcular la desviación estándar de una varianza cero");
        double sdtDev = MathUtils.calculateStdDev(0);
        assertEquals(0, sdtDev,0.01);
    }
    
    /**
     * Prueba para calcular la desviación estándar de una varianza entera negativa
     */
    @Test
    public void testStandardDeviationIntegerNegativeVariance() {
        System.out.println("* Prueba para calcular la desviación estándar de una varianza entera negativa");
        double sdtDev = MathUtils.calculateStdDev(-102);
        assertEquals(Double.NaN, sdtDev, 0.01);
    }
    
    /**
     * Prueba para calcular la desviación estándar de una varianza real negativa
     */
    @Test
    public void testStandardDeviationDoubleNegativeVariance() {
        System.out.println("* Prueba para calcular la desviación estándar de una varianza real negativa");
        double sdtDev = MathUtils.calculateStdDev(-102);
        assertEquals(Double.NaN, sdtDev, 0.01);
    }
}