/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram2psp.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Mateo Noreña
 * @author Joan Morales
 * @author Esteban Cataño
 */
public class NodeTest {
    
    public NodeTest() {
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
     * Prueba creación de nodo sin parámetros en el constructor
     */
    @Test
    public void testNewEmptyNode() {
        System.out.println("*Prueba creación de nodo sin parámetros en el constructor");
        Node h1 = new Node();
        assertEquals(0.0, h1.getData1(), 0.01);
        assertEquals(0.0, h1.getData1(), 0.01);
    }
    
    /**
     * Prueba creacion de un nodo con parametros en el constructor
    */
    @Test
    public void testNewNode() {
        System.out.println("*Prueba creación de nodo con parámetros en el constructor");
        Node h2 = new Node(5, 7);
        assertEquals(5.0, h2.getData1(), 0.01);
        assertEquals(7.0, h2.getData2(), 0.01);
    }
    
    /**
     * Prueba para cambiar el dato de un nodo
    */
    @Test
    public void testChangeDataNode() {
        System.out.println("*Prueba para cambiar el dato de un nodo");
        Node h2 = new Node(5,8);
        h2.setData1(7);
        h2.setData2(9);
        assertEquals(7.0, h2.getData1(), 0.01);
        assertEquals(9.0, h2.getData2(), 0.01);
    }
    
    /**
     * Prueba creacion de nodo con dato de tipo double
    */
    @Test
    public void testNewNodeDoubleData() {
        System.out.println("*Prueba creacion de nodo con dato de tipo double");
        Node h3 = new Node(4.8,7.3);
        assertEquals(4.8, h3.getData1(), 0.01);
        assertEquals(7.3, h3.getData2(), 0.01);
    }
    
    /**
     * Prueba obtención de nodo siguiente cuando es nulo
    */
    @Test
    public void testNext() {
        System.out.println("*Prueba de obtención de nodo siguiente");
        Node helper = new Node(5,6.5);
        assertNull(helper.getNext());
    }   
    
    /**
     * Prueba obtencion de nodo siguiente cuando no es nulo
    */
    @Test
    public void textNextNoNull() {
        Node helper = new Node(5,6.5);
        Node helperNext = new Node(3.4,8);
        helper.setNext(helperNext);
        assertEquals(3.4, helper.getNext().getData1(), 0.01);
        assertEquals(8.0, helper.getNext().getData2(), 0.01);
    }
}
