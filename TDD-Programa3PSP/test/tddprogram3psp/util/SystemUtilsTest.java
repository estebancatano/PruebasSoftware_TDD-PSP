/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram3psp.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tddprogram3psp.model.LinkedList;
import tddprogram3psp.model.Node;

/**
 * @author Mateo Noreña
 * @author Joan Morales
 * @author Esteban Cataño
 */
public class SystemUtilsTest {
    
    public SystemUtilsTest() {
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
     * Prueba: Lanzar excepción cuando archivo no existe
     * @throws IOException 
     */
    @Test(expected=FileNotFoundException.class)
    public void testReadTextNoFile() throws IOException {
        System.out.println("* Prueba: Lanzar excepción cuando archivo no existe");
        LinkedList helperList = SystemUtils.getData(new File("src/program3psp/files/noFile.txt"));
    }
    
    /**
     * Prueba: Leer los datos desde un archivo
     * @throws IOException 
     */
    @Test
    public void testData() throws IOException {
        System.out.println("* Prueba: Leer los datos desde un archivo");
        LinkedList helperList = SystemUtils.getData(new File("src/tddprogram3psp/files/testFile.txt"));
        Node p = helperList.getHead();
        assertEquals(404, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(149, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(187, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(499, p.getData(), 0.01);
    }
    
    /**
     * Prueba: Leer los datos desde un archivo con caracteres especiales
     * @throws IOException 
     */
    @Test(expected=NumberFormatException.class)
    public void testSpecialCharactersData() throws IOException {
        System.out.println("* Prueba: Leer los datos desde un archivo con caracteres especiales");
        LinkedList helperList = SystemUtils.getData(new File("src/tddprogram3psp/files/testBadFormatFile1.txt"));
        Node p = helperList.getHead();
        assertEquals(404, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(149, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(187, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(499, p.getData(), 0.01);
    }
    
    /**
     * Prueba: Archivo con líneas vacías
     * @throws IOException 
     * @throws java.io.FileNotFoundException 
     */    
    @Test
    public void testBlankLines() throws IOException, FileNotFoundException {
        System.out.println("* Prueba: Archivo con líneas vacías");
        LinkedList helperList = SystemUtils.getData(new File("src/tddprogram3psp/files/testBadFormatFile3.txt"));
    }
    
        /**
     * Prueba: Espacios al inicio y al final de los números
     * @throws IOException 
     * @throws java.io.FileNotFoundException
     */    
    @Test
    public void testTrim() throws IOException, FileNotFoundException {
        System.out.println("* Prueba: Espacios al inicio y al final de los números");
        LinkedList helperList = SystemUtils.getData(new File("src/tddprogram3psp/files/testBadFormatFile5.txt"));
        Node p = helperList.getHead();
        assertEquals(404, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(149, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(187, p.getData(), 0.01);
        p = p.getNext();
        assertEquals(499, p.getData(), 0.01);
    }
}
