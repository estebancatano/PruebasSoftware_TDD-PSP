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

/**
 *
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
     * Prueba creación de nodo, con argumentos vacíos, con getters y setters y valores enteros y de tipo double
    */
    @Test
    public void testNewEmptyNode() {
        System.out.println("* Prueba creación de nodo, con argumentos vacíos, con getter y setter y valores enteros y de tipo double");
        Node h1 = new Node();
        assertEquals(0.0, h1.getData(), 0.01);
    }
    
    /**
     * Prueba creacion de un nodo con parametro en el constructor
    */
    @Test
    public void testNewNode() {
        Node h2 = new Node(5);
        assertEquals(5.0, h2.getData(), 0.01);
    }
    
    /**
     * Prueba para cambiar el dato de un nodo
    */
    @Test
    public void testChangeDataNode() {
        Node h2 = new Node(5);
        h2.setData(6);
        assertEquals(6.0, h2.getData(), 0.01);
    }
    
    /**
     * Prueba creacion de nodo con dato de tipo double
    */
    @Test
    public void testNewNodeDoubleData() {
        Node h3 = new Node(4.8);
        assertEquals(4.8, h3.getData(), 0.01);
    }
    
    /**
     * Prueba obtencion de nodo siguiente cuando es nulo
    */
    @Test
    public void testNext() {
        System.out.println("* Prueba de obtención de nodo siguiente");
        Node helper = new Node(5);
        assertNull(helper.getNext());
    }   
    
    /**
     * Prueba obtencion de nodo siguiente cuando no es nulo
    */
    @Test
    public void textNextNoNull() {
        Node helper = new Node(5);
        Node helperNext = new Node(8);
        helper.setNext(helperNext);
        assertEquals(8.0, helper.getNext().getData(), 0.01);
    }
}