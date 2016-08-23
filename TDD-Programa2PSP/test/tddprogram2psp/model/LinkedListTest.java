/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram2psp.model;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
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
        System.out.println("*Prueba: Crear una nueva lista sin parámetro en el constructor");
        LinkedList hl = new LinkedList();
        assertNull(hl.getHead());
    }
    
    /**
     * Prueba creacion de una nueva lista con parametro en el constructor
     */
    @Test
    public void testNewLinkedList() {
        System.out.println("*Prueba: Crear de una nueva lista con parámetro en el constructor");
        Node helperNode = new Node();
        LinkedList helperList = new LinkedList(helperNode);
        assertEquals(helperNode, helperList.getHead());
    }
    
    /**
     * Prueba para cambiar la cabeza de una lista
     */
    @Test
    public void testChangeHeadLinkedList(){
        System.out.println("*Prueba: Cambiar la cabeza de una lista");
        Node helperNode1 = new Node();
        LinkedList helperList = new LinkedList(helperNode1);
        Node helperNode2 = new Node();
        helperList.setHead(helperNode2);
        assertEquals(helperNode2, helperList.getHead());
    }
    
    /**
     * Prueba para agregar un nodo al final en una lista vacia
     */
    @Test
    public void testAddNodeEmptyList() {
        System.out.println("*Prueba: Insertar nodo al final cuando la lista está vacía");
        LinkedList helperList = new LinkedList();
        Node helperNode = new Node();
        helperList.addNode(helperNode);
        assertEquals(helperNode, helperList.getHead());
    }
    
    /**
     * Prueba para agregar un nodo al final en una lista no vacia
     */
    @Test
    public void testAddNodeNonEmptyList() {
        System.out.println("*Prueba: Insertar nodo al final cuando la lista no está vacía");
        LinkedList helperList = new LinkedList();
        Node helperNode1 = new Node();
        Node helperNode2 = new Node();
        Node helperNode3 = new Node();
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.addNode(helperNode3);
        Node helperNodeP = helperList.getHead();
        assertEquals(helperNode1, helperNodeP);
        helperNodeP = helperNodeP.getNext();
        assertEquals(helperNode2, helperNodeP);
        helperNodeP = helperNodeP.getNext();
        assertEquals(helperNode3, helperNodeP);
    }
    
    /**
     * Prueba para eliminar un nodo cuando la lista esta vacia
     */
    @Test
    public void testRemoveNodeEmptyList() {
        System.out.println("*Prueba: Eliminar nodo cuando la lista está vacía");
        LinkedList helperList = new LinkedList();
        helperList.removeNode(new Node());
    }
    
    /**
     * Prueba para eliminar un nodo cuando el dato no esta en la lista
     */
    @Test
    public void testRemoveNodeNoFound() {
        System.out.println("*Prueba: Eliminar nodo cuando este no se encuentra");
        Node helperNode = new Node();
        LinkedList helperList = new LinkedList(helperNode);
        Node helperNode1 = new Node();
        Node helperNode2 = new Node();
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.removeNode(new Node());
        Node helperNodeP = helperList.getHead();
        assertEquals(helperNode, helperNodeP);
        helperNodeP = helperNodeP.getNext();
        assertEquals(helperNode1, helperNodeP);
        helperNodeP = helperNodeP.getNext();
        assertEquals(helperNode2, helperNodeP);
    }
    
    /**
     * Prueba para eliminar un nodo cuando este se encuentra al principio(cabeza de la lista)
     */
    @Test
    public void testRemoveNodeFoundHead() {
        System.out.println("*Prueba: Eliminar nodo cuando este se encuentra al principio de la lista");
        Node helperNode = new Node();
        LinkedList helperList = new LinkedList(helperNode);
        Node helperNode1 = new Node();
        Node helperNode2 = new Node();
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.removeNode(helperNode);
        Node helperNodeP = helperList.getHead();
        assertEquals(helperNode1, helperNodeP);
    }
    
    @Test
    public void testRemoveNodeFoundOnlyHead() {
        System.out.println("*Prueba: Eliminar nodo cuando este se encuentra al principio de la lista y solo hay un nodo en la lista");
        Node helperNode = new Node();
        LinkedList helperList = new LinkedList(helperNode);
        helperList.removeNode(helperNode);
        assertNull(helperList.getHead());
    }
    
    /**
     * Prueba para eliminar un nodo cuando se encuentra en cualquier lugar
     */
    @Test
    public void testRemoveNodeDataFound() {
        System.out.println("*Prueba: Eliminar nodo cuando este se encuentra en cualquier lugar de la lista");
        Node helperNode = new Node();
        LinkedList helperList = new LinkedList(helperNode);
        Node helperNode1 = new Node();
        Node helperNode2 = new Node();
        helperList.addNode(helperNode1);
        helperList.addNode(helperNode2);
        helperList.removeNode(helperNode1);
        Node helperNodeP = helperList.getHead();
        assertEquals(helperNode, helperNodeP);
        assertEquals(helperNode2, helperNodeP.getNext());
    }
    
    /**
     * Prueba: Calcular la longitud de la lista cuando esta se encuentra vacía
     */
    @Test
    public void testCalculateLengthEmptyList(){
        System.out.println("*Prueba: Calcular la longitud de la lista cuando esta se encuentra vacía");
        LinkedList helperList = new LinkedList();
        assertEquals(0, helperList.calculateLength());
    }
    
    /**
     * Prueba: Calcular la longitud de la lista cuando esta no se encuentra vacía
     */
    @Test
    public void testCalculateLengthNoEmptyList(){
        System.out.println("*Prueba: Calcular la longitud de la lista cuando esta no se encuentra vacía");
        LinkedList helperList = new LinkedList();
        helperList.addNode(new Node());
        helperList.addNode(new Node());
        helperList.addNode(new Node());
        assertEquals(3, helperList.calculateLength());
    }
}
