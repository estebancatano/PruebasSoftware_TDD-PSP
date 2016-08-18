/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.program1psp.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MattNP
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

    @Test
    public void testNewEmptyNode() {
        System.out.println("* Prueba creación de nodo, con argumentos vacíos, con getter y setter y valores enteros y de tipo double");
        Node h1 = new Node();
        assertEquals(0.0, h1.getData(), 0.01);
    }
    
    @Test
    public void testNewNode() {
        //Crear nodo con pararmetro en constructor
        Node h2 = new Node(5);
        assertEquals(5.0, h2.getData(), 0.01);
    }
    
    @Test
    public void testChangeDataNode() {
        //Cambiar dato del nodo
        Node h2 = new Node(5);
        h2.setData(6);
        assertEquals(6.0, h2.getData(), 0.01);
    }
    
    @Test
    public void testNewNodeDoubleData() {
        //Crear nodo con dato double
        Node h3 = new Node(4.8);
        assertEquals(4.8, h3.getData(), 0.01);
    }
    
    @Test
    public void testNext() {
        System.out.println("* Prueba de obtención de nodo siguiente");
        Node helper = new Node(5);
        assertNull(helper.getNext());
    }   
    
    @Test
    public void textNextNoNull() {
        //testNextNo Null
        Node helper = new Node(5);
        Node helperNext = new Node(8);
        helper.setNext(helperNext);
        assertEquals(8.0, helper.getNext().getData(), 0.01);
    }
    
}
