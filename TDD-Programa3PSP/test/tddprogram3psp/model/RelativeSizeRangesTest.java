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
     * Prueba calcular rangos logarítmicos de una lista con un solo valor
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = ArithmeticException.class)
    public void testLogarithmicRangesOneData() throws EmptyListException {
        System.out.println("* Prueba calcular rangos logarítmicos de una lista con un solo valor");
        LinkedList helperList = new LinkedList(new Node(6));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation();                
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
        double[] ranges = relativeSizeRanges.getRanges();
        assertEquals(1.42, ranges[0], 0.01);
        assertEquals(1.7807, ranges[1], 0.01);
        assertEquals(2.1414, ranges[2], 0.01);
        assertEquals(2.5021, ranges[3], 0.01);
        assertEquals(2.8628, ranges[4], 0.01);    
    }
    
    /**
     * Prueba calcular anti-logaritmos dada una lista vacía
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = EmptyListException.class)
    public void testAntiLogarithmEmptyList() throws EmptyListException {
        System.out.println("* Prueba calcular anti-logaritmos dada una lista vacía");
        LinkedList helperList = new LinkedList();
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation(); 
        relativeSizeRanges.calculateLogarithmicRanges();              
        relativeSizeRanges.calculateAntiLogarithm();
    }
    
    /**
     * Prueba calcular anti-logaritmos dada una lista de un solo elemento
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = ArithmeticException.class)
    public void testAntiLogarithmDatum() throws EmptyListException {
        System.out.println("* Prueba calcular anti-logaritmos dada una lista de un solo elemento");
        LinkedList helperList = new LinkedList(new Node(6));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation(); 
        relativeSizeRanges.calculateLogarithmicRanges();              
        relativeSizeRanges.calculateAntiLogarithm();
    }
    
    /**
     * Prueba calcular anti-logaritmos
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test
    public void testAntiLogarithm() throws EmptyListException {
        System.out.println("* Prueba calcular anti-logaritmos");
        LinkedList helperList = new LinkedList(new Node(6));
        helperList.addNode(new Node(8.333));
        helperList.addNode(new Node(12.333));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateLogarithmicTransformation(); 
        relativeSizeRanges.calculateLogarithmicRanges();              
        relativeSizeRanges.calculateAntiLogarithm();
        double[] ranges = relativeSizeRanges.getRanges();
        assertEquals(4.14, ranges[0], 0.01);
        assertEquals(5.93, ranges[1], 0.01);
        assertEquals(8.51, ranges[2], 0.01);
        assertEquals(12.21, ranges[3], 0.01);
        assertEquals(17.51, ranges[4], 0.01);
    }
    
    /**
     * Prueba calcular rangos de tamaño relativos de una lista vacía
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = EmptyListException.class)
    public void testRelativeSizeRangesEmptyList() throws EmptyListException {
        System.out.println("* Prueba calcular rangos de tamaño relativos de una lista vacía");
        LinkedList helperList = new LinkedList();
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateRelativeSizeRanges();
    }
    
    /**
     * Prueba calcular rangos de tamaño relativos de una lista de un solo valor
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test(expected = ArithmeticException.class)
    public void testRelativeSizeRangesDatum() throws EmptyListException {
        System.out.println("* Prueba calcular rangos de tamaño relativos de una lista de un solo valor");
        LinkedList helperList = new LinkedList(new Node(6));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        relativeSizeRanges.calculateRelativeSizeRanges();
    }
    
    /**
     * Prueba calcular rangos de tamaño relativos
     * @throws tddprogram3psp.util.exception.EmptyListException
    */
    @Test
    public void testRelativeSizeRanges() throws EmptyListException {
        System.out.println("* Prueba calcular rangos de tamaño relativos");
        LinkedList helperList = new LinkedList(new Node(6));
        helperList.addNode(new Node(8.333));
        helperList.addNode(new Node(12.333));
        RelativeSizeRanges relativeSizeRanges = new RelativeSizeRanges(helperList);
        double[] ranges = relativeSizeRanges.calculateRelativeSizeRanges();
        assertEquals(4.14, ranges[0], 0.01);
        assertEquals(5.93, ranges[1], 0.01);
        assertEquals(8.51, ranges[2], 0.01);
        assertEquals(12.21, ranges[3], 0.01);
        assertEquals(17.51, ranges[4], 0.01);
    }
}
