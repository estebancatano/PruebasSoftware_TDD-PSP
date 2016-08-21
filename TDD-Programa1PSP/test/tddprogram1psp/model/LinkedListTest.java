/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram1psp.model;

import tddProgram1PSP.model.LinkedList;
import tddProgram1PSP.model.Node;
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
public class LinkedListTest {
    
    public LinkedListTest() {
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
     * Prueba creacion de lista vacia, sin parametros en el constructor, ademas de los getters y setters
     */
    @Test
    public void testNewEmptyLinkedList() {
        System.out.println("*Prueba creacion de una nueva lista sin parametro en el constructor");
        LinkedList hl = new LinkedList();
        assertNull(hl.getHead());
    }
    /**
     * Prueba creacion de una nueva lista con parametro en el constructor
     */
    @Test
    public void testNewLinkedList() {
        Node helperNode1 = new Node(5);
        LinkedList helperList = new LinkedList(helperNode1);
        assertEquals(5.0, helperList.getHead().getData(), 0.01);
    }
    
    /**
     * Prueba para cambiar la cabeza de una lista
     */
    @Test
    public void testChangeHeadLinkedList(){
        Node helperNode1 = new Node(5);
        LinkedList helperList = new LinkedList(helperNode1);
        Node helperNode2 = new Node(8);
        helperList.setHead(helperNode2);
        assertEquals(8.0, helperList.getHead().getData(), 0.01);
    }
    
    /**
     * Prueba para agregar un nodo al final en una lista vacia
     */
    @Test
    public void testAddNodeEmptyList() {
        System.out.println("* Prueba insertar nodo al final cuando la lista está vacía");
        LinkedList helperList = new LinkedList();
        Node helperNode = new Node(8);
        helperList.addNode(helperNode);
        assertEquals(8.0, helperList.getHead().getData(), 0.01);
    }
    
    /**
     * Prueba para agregar un nodo al final en una lista no vacia
     */
    @Test
    public void testAddNodeNonEmptyList() {
        System.out.println("* Prueba insertar nodo al final cuando la lista no está vacía");
        LinkedList helperList = new LinkedList();
        Node helperNode1 = new Node(8);
        Node helperNode2 = new Node(5);
        Node helperNode3 = new Node(6);
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.addNode(helperNode3);
        Node helperNodeP = helperList.getHead();
        assertEquals(8.0, helperNodeP.getData(), 0.01);
        helperNodeP = helperNodeP.getNext();
        assertEquals(5.0, helperNodeP.getData(), 0.01);
        helperNodeP = helperNodeP.getNext();
        assertEquals(6.0, helperNodeP.getData(), 0.01);
    }
    
    
    /**
     * Prueba para eliminar un nodo cuando la lista esta vacia
     */
    @Test
    public void testRemoveNodeNoData() {
        System.out.println("* Prueba eliminar nodo cuando la lista está vacía");
        LinkedList helperList = new LinkedList();
        helperList.removeNode(8);
    }
    
    /**
     * Prueba para eliminar un nodo cuando el dato no esta en la lista
     */
    @Test
    public void testRemoveNodeNoDataFound() {
        System.out.println("* Prueba eliminar nodo cuando el dato no se encuentra");
        LinkedList helperList = new LinkedList(new Node(8));
        Node helperNode1 = new Node(5);
        Node helperNode2 = new Node(6);
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.removeNode(7);
        Node helperNodeP = helperList.getHead();
        assertEquals(8, helperNodeP.getData(), 0.01);
        helperNodeP = helperNodeP.getNext();
        assertEquals(5, helperNodeP.getData(), 0.01);
        helperNodeP = helperNodeP.getNext();
        assertEquals(6, helperNodeP.getData(), 0.01);
    }
    
    /**
     * Prueba para eliminar un nodo cuando este se encuentra al principio(cabeza de la lista)
     */
    @Test
    public void testRemoveNodeDataFoundHead() {
        System.out.println("* Prueba eliminar nodo cuando el dato se encuentra al principio de la lista");
        LinkedList helperList = new LinkedList(new Node(8));
        Node helperNode1 = new Node(5);
        Node helperNode2 = new Node(6);
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.removeNode(8);
        Node helperNodeP = helperList.getHead();
        assertEquals(5, helperNodeP.getData(), 0.01);
    }
    
    /**
     * Prueba para eliminar un nodo cuando se encuentra al principio 
     * y solo hay un nodo en la lista
     */
    @Test
    public void testRemoveNodeDataFoundOnlyHead() {
        System.out.println("* Prueba eliminar nodo cuando el dato se encuentra al principio de la lista y solo hay un nodo en la lista");
        LinkedList helperList = new LinkedList(new Node(8));
        helperList.removeNode(8);
        Node helperNodeP = helperList.getHead();
        assertNull(helperNodeP);
    }
    
    /**
     * Prueba para eliminar un nodo cuando se encuentra en cualquier lugar
     */
    @Test
    public void testRemoveNodeDataFound() {
        System.out.println("* Prueba eliminar nodo cuando el dato se encuentra en cualquier lugar de la lista");
        LinkedList helperList = new LinkedList(new Node(8));
        Node helperNode1 = new Node(5);
        Node helperNode2 = new Node(6);
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.removeNode(5);
        Node helperNodeP = helperList.getHead();
        assertEquals(8.0, helperNodeP.getData(), 0.01);
        assertEquals(6.0, helperNodeP.getNext().getData(), 0.01);
    }
    
}
