/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram3psp.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tddprogram3psp.util.exception.EmptyListException;

/**
 *
 * @author Mateo Noreña
 * @author Joan Morales
 * @author Esteban Cataño
 */
public class RelativeSizeRangesTest {
    
    public RelativeSizeRangesTest() {
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
     * Prueba calcular transformación logarítmica en una lista vacía
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = EmptyListException.class)
    public void testLogarithmicTransformationEmptyList() throws EmptyListException {
        System.out.println("* Prueba calcular transformación logarítmica en una lista vacía");
        LinkedList helperList = new LinkedList();
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation();
    }
    
    /**
     * Prueba calcular transformación logarítmica
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test
    public void testLogarithmicTransformation() throws EmptyListException {
        System.out.println("* Prueba calcular transformación logarítmica");
        LinkedList helperList = new LinkedList(new Node(6));
        helperList.addNode(new Node(8.333));
        helperList.addNode(new Node(12.333));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation();
        LinkedList transformatedList = relativeSizeRanges.getTransformatedList();
        Node p = transformatedList.getHead();
        assertEquals(1.79, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(2.12, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(2.51, p.getData(), 0.01);
    }
    
    /**
     * Prueba calcular transformación logarítmica valores negativos
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = ArithmeticException.class)
    public void testLogarithmicTransformationNegative() throws EmptyListException {
        System.out.println("* Prueba calcular transformación logarítmica valores negativos");
        LinkedList helperList = new LinkedList(new Node(-6));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation();
    }
    
    /**
     * Prueba calcular transformación logarítmica valor cero
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = ArithmeticException.class)
    public void testLogarithmicTransformationZero() throws EmptyListException {
        System.out.println("* Prueba calcular transformación logarítmica valor cero");
        LinkedList helperList = new LinkedList(new Node(0));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation();
    }
    
    /**
     * Prueba calcular transformación logarítmica infinito positivo
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = ArithmeticException.class)
    public void testLogarithmicTransformationPositiveInfinity() throws EmptyListException {
        System.out.println("* Prueba calcular transformación logarítmica infinito positivo");
        LinkedList helperList = new LinkedList(new Node(Double.POSITIVE_INFINITY));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation();
    }
    
    /**
     * Prueba calcular transformación logarítmica de NaN
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = ArithmeticException.class)
    public void testLogarithmicTransformationPositiveInfinityNaN() throws EmptyListException {
        System.out.println("* Prueba calcular transformación logarítmica de NaN");
        LinkedList helperList = new LinkedList(new Node(Double.NaN));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation();
    }
    
    /**
     * Prueba calcular rangos logarítmicos lista vacía
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = EmptyListException.class)
    public void testLogarithmicRangesEmptyList() throws EmptyListException {
        System.out.println("* Prueba calcular rangos logarítmicos lista vacía");
        LinkedList helperList = new LinkedList();
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicRanges();
    }
    
    /**
     * Prueba calcular rangos logarítmicos
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test
    public void testLogarithmicRanges() throws EmptyListException {
        System.out.println("* Prueba calcular rangos logarítmicos");
        LinkedList helperList = new LinkedList(new Node(6));
        helperList.addNode(new Node(8.333));
        helperList.addNode(new Node(12.333));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation();                
        relativeSizeRanges.calculateLogarithmicRanges();
        
    } 
    
}
