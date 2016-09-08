/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram4psp.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tddprogram4psp.model.implement.GammaFunction;
import tddprogram4psp.model.implement.TFunction;

/**
 *
 * @author esteban.catanoe
 */
public class SimpsonsRuleTest {
    
    public SimpsonsRuleTest() {
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
     * Test of calculateNumericalIntegration method, of class SimpsonsRule.
     */
    @Test
    public void testCalculateNumericalIntegrationTest1() {
        double x = 1.1;
        int dof = 9;
        System.out.println("* Integración numérica para x=" + x + " con " + dof + " grados de libertad");
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = 0.35006;
        double result = instance.calculateNumericalIntegration(x, dof);
        assertEquals(expResult, result, 0.00001);
    }
    
    
     @Test
    public void testCalculateNumericalIntegrationTest2() {
        double x = 1.1812;
        int dof = 10;
        System.out.println("* Integración numérica para x=" + x + " con " + dof + " grados de libertad");
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = 0.36757;
        double result = instance.calculateNumericalIntegration(x, dof);
        assertEquals(expResult, result, 0.00001);
    }
    
     @Test
    public void testCalculateNumericalIntegrationTest3() {
        double x = 2.750;
        int dof = 30;
        System.out.println("* Integración numérica para x=" + x + " con " + dof + " grados de libertad");
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = 0.49500;
        double result = instance.calculateNumericalIntegration(x, dof);
        assertEquals(expResult, result, 0.00001);
    }

    /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test
    public void testCalculateIterationIntegerNegativeValue() {
        System.out.println("* Prueba iteracción con x entero negativo");
        double x = -4;
        int dof = 9;
        int numSeg = 10;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = -0.49;
        double result = instance.calculateIteration(x, dof, numSeg, function);
        assertEquals(expResult, result, 0.01);
    }
    
    /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test
    public void testCalculateIterationDoubleNegativeValue() {
        System.out.println("* Prueba iteracción con x real negativo");
        double x = -15.9;
        int dof = 9;
        int numSeg = 10;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = -0.45;
        double result = instance.calculateIteration(x, dof, numSeg, function);
        assertEquals(expResult, result, 0.01);
    }
    
    /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test
    public void testCalculateIterationDZeroValue() {
        System.out.println("* Prueba iteracción con x cero");
        double x = 0;
        int dof = 9;
        int numSeg = 10;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = 0;
        double result = instance.calculateIteration(x, dof, numSeg, function);
        assertEquals(expResult, result, 0.01);
    }
    
    /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test
    public void testCalculateIterationIntegerPositiveValue() {
        System.out.println("* Prueba iteracción con x entero positivo");
        double x = 15;
        int dof = 9;
        int numSeg = 10;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = 0.46;
        double result = instance.calculateIteration(x, dof, numSeg, function);
        assertEquals(expResult, result, 0.01);
    }
    
    /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test
    public void testCalculateIterationDoublePositiveValue() {
        System.out.println("* Prueba iteracción con x real positivo");
        double x = 40;
        int dof = 9;
        int numSeg = 10;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = 0.53;
        double result = instance.calculateIteration(x, dof, numSeg, function);
        assertEquals(expResult, result, 0.1);
    }
    
    /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test
    public void testCalculateIterationDOFPositiveValue() {
        System.out.println("* Prueba iteracción con dof positivo");
        double x = 0.8;
        int dof = 9;
        int numSeg = 10;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = 0.28;
        double result = instance.calculateIteration(x, dof, numSeg, function);
        assertEquals(expResult, result, 0.01);
    }
    
     /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test(expected = ArithmeticException.class)
    public void testCalculateIterationDOFZeroValue() {
        System.out.println("* Prueba iteracción con dof cero");
        double x = 0.8;
        int dof = 0;
        int numSeg = 10;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        instance.calculateIteration(x, dof, numSeg, function);
        //assertEquals(expResult, result, 0.01);
    }
    
     /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test(expected = ArithmeticException.class)
    public void testCalculateIterationDOFNegativeValue() {
        System.out.println("* Prueba iteracción con dof negativo");
        double x = 0.8;
        int dof = -9;
        int numSeg = 10;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        instance.calculateIteration(x, dof, numSeg, function);
    }
    
    /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test
    public void testCalculateIterationNumSegPositiveValue() {
        System.out.println("* Prueba iteracción con num_seg positivo");
        double x = 0.8;
        int dof = 9;
        int numSeg = 10;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = 0.28;
        double result = instance.calculateIteration(x, dof, numSeg, function);
        assertEquals(expResult, result, 0.01);
    }
    
     /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test(expected = ArithmeticException.class)
    public void testCalculateIterationNumSegZeroValue() {
        System.out.println("* Prueba iteracción con num_seg cero");
        double x = 0.8;
        int dof = 9;
        int numSeg = 0;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        instance.calculateIteration(x, dof, numSeg, function);
        //assertEquals(expResult, result, 0.01);
    }
    
     /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test(expected = ArithmeticException.class)
    public void testCalculateIterationNumSegNegativeValue() {
        System.out.println("* Prueba iteracción con num_seg negativo");
        double x = 0.8;
        int dof = 9;
        int numSeg = -10;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        instance.calculateIteration(x, dof, numSeg, function);
    }
   
    /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test(expected = ArithmeticException.class)
    public void testCalculateIterationNumSegOddValue() {
        System.out.println("* Prueba iteracción con num_seg negativo");
        double x = 0.8;
        int dof = 9;
        int numSeg = 11;
        IFunction function = new TFunction(dof,new GammaFunction());
        SimpsonsRule instance = new SimpsonsRule();
        instance.calculateIteration(x, dof, numSeg, function);
    }
}
