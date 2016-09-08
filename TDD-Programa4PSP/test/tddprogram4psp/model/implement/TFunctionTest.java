/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram4psp.model.implement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tddprogram4psp.model.IFunction;

/**
 *
 * @author esteban.catanoe
 */
public class TFunctionTest {
    
    public TFunctionTest() {
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
     * Test of evaluate method, of class TFunction.
     */
    @Test
    public void testEvaluateZero() {
        System.out.println("* Prueba función t con el valor 0");
        IFunction gammaFunction = new GammaFunction();
        IFunction instance = new TFunction(9, gammaFunction);
        double expResult = 0.39;
        double result = instance.evaluate(0);
        assertEquals(expResult, result, 0.01);
    }
    
    /**
     * Test of evaluate method, of class TFunction.
     */
    @Test
    public void testEvaluateInteger() {
        System.out.println("* Prueba función t con un valor entero");
        IFunction gammaFunction = new GammaFunction();
        IFunction instance = new TFunction(9, gammaFunction);
        double expResult = 0.000504;
        double result = instance.evaluate(5);
        assertEquals(expResult, result, 0.000001);
    }

    /**
     * Test of evaluate method, of class TFunction.
     */
    @Test
    public void testEvaluateReal() {
        System.out.println("* Prueba función t con un valor real");
        IFunction gammaFunction = new GammaFunction();
        IFunction instance = new TFunction(9, gammaFunction);
        double expResult = 0.0049;
        double result = instance.evaluate(3.54);
        assertEquals(expResult, result, 0.0001);
    }
    
    /**
     * Test of evaluate method, of class TFunction.
     */
    @Test
    public void testEvaluateAnotherDof() {
        System.out.println("* Prueba función t con un valor diferente para los grados de libertad");
        IFunction gammaFunction = new GammaFunction();
        IFunction instance = new TFunction(20, gammaFunction);
        double expResult = 7.9e-5;
        double result = instance.evaluate(5);
        assertEquals(expResult, result, 1e-5);
    }
    
}
