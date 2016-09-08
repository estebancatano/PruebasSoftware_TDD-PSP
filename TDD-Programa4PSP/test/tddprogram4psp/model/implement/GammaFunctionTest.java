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
public class GammaFunctionTest {

    public GammaFunctionTest() {
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
     * Test of evaluate method, of class GammaFunction.
     */
    @Test(expected = ArithmeticException.class)
    public void testEvaluateReal() {
        System.out.println("* Prueba función gamma con un valor real no entero ni con división entera entre dos");
        IFunction instance = new GammaFunction();
        instance.evaluate(1.33);
    }

    /**
     * Test of evaluate method, of class GammaFunction.
     */
    @Test
    public void testEvaluateOne() {
        System.out.println("* Prueba función gamma con el valor 1");
        IFunction instance = new GammaFunction();
        double result = instance.evaluate(1);
        double expResult = 1;
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of evaluate method, of class GammaFunction.
     */
    @Test
    public void testEvaluateOneHalf() {
        System.out.println("* Prueba función gamma con el valor 1/2");
        IFunction instance = new GammaFunction();
        double expResult = Math.sqrt(Math.PI);
        double result = instance.evaluate(0.5);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of evaluate method, of class GammaFunction.
     */
    @Test
    public void testEvaluateInteger() {
        System.out.println("* Prueba función gamma con un valor entero");
        IFunction instance = new GammaFunction();
        double expResult = 24;
        double result = instance.evaluate(5);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of evaluate method, of class GammaFunction.
     */
    @Test
    public void testEvaluateHalfInteger() {
        System.out.println("* Prueba función gamma con un valor con división entera entre dos");
        IFunction instance = new GammaFunction();
        double expResult = 0.89;
        double result = instance.evaluate(1.5);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of evaluate method, of class GammaFunction.
     */
    @Test(expected = ArithmeticException.class)
    public void testEvaluateNegative() {
        System.out.println("* Prueba función gamma con un valor negativo");
        IFunction instance = new GammaFunction();
        instance.evaluate(-0.5);
    }

    /**
     * Test of evaluate method, of class GammaFunction.
     */
    @Test(expected = ArithmeticException.class)
    public void testEvaluateZero() {
        System.out.println("* Prueba función gamma con un valor negativo");
        IFunction instance = new GammaFunction();
        instance.evaluate(0);
    }
    
    /**
     * Test of evaluate method, of class GammaFunction.
     */
    @Test
    public void testEvaluateLargeInteger() {
        System.out.println("* Prueba función gamma con un valor entero grande");
        IFunction instance = new GammaFunction();
        double expResult = 8.72e10;
        double result = instance.evaluate(15);
        assertEquals(expResult, result, 1e8);
    }
    
    /**
     * Test of evaluate method, of class GammaFunction.
     */
    @Test
    public void testEvaluateLargeHalfInteger() {
        System.out.println("* Prueba función gamma con un valor grande dividido entre dos");
        IFunction instance = new GammaFunction();
        double expResult = 3.35e11;
        double result = instance.evaluate(15.5);
        assertEquals(expResult, result, 1e9);
    }
    
    /**
     * Test of evaluate method, of class GammaFunction.
     */
    @Test(expected = ArithmeticException.class)
    public void testEvaluateLargeReal() {
        System.out.println("* Prueba función gamma con un valor real grande");
        IFunction instance = new GammaFunction();
        instance.evaluate(42.42);
    }

}
