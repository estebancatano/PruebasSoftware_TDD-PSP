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
    public void testCalculateNumericalIntegration() {
        System.out.println("calculateNumericalIntegration");
        double x = 0.0;
        int dof = 0;
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = 0.0;
        double result = instance.calculateNumericalIntegration(x, dof);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateIteration method, of class SimpsonsRule.
     */
    @Test
    public void testCalculateIteration() {
        System.out.println("calculateIteration");
        double x = 0.0;
        int dof = 0;
        int numSeg = 0;
        IFunction function = null;
        SimpsonsRule instance = new SimpsonsRule();
        double expResult = 0.0;
        double result = instance.calculateIteration(x, dof, numSeg, function);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
