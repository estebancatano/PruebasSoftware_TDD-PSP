/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram2psp.util;

import tddprogram2psp.util.exception.ValuesNumberException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tddprogram2psp.model.LinkedList;
import tddprogram2psp.model.Node;

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
     * @throws tddprogram2psp.util.exception.ValuesNumberException 
     */
    @Test(expected=FileNotFoundException.class)
    public void testReadTextNoFile() throws IOException, ValuesNumberException {
        System.out.println("*Prueba: Lanzar excepción cuando archivo no existe");
        LinkedList helperList = SystemUtils.getData(new File("src/program2psp/files/noFile.txt"));
    }
    
    /**
     * Prueba: Leer los datos desde un archivo
     * @throws IOException 
     * @throws tddprogram2psp.util.exception.ValuesNumberException 
     */
    @Test
    public void testData() throws IOException, ValuesNumberException {
        System.out.println("*Prueba: Leer los datos desde un archivo");
        LinkedList helperList = SystemUtils.getData(new File("src/tddprogram2psp/files/testFile.txt"));
        Node p = helperList.getHead();
        assertEquals(404, p.getData1(), 0.01);
        assertEquals(149, p.getData2(), 0.01);
        p = p.getNext();
        assertEquals(187, p.getData1(), 0.01);
        assertEquals(499, p.getData2(), 0.01);
    }
    
    /**
     * Prueba: Leer los datos desde un archivo con caracteres especiales
     * @throws IOException 
     * @throws tddprogram2psp.util.exception.ValuesNumberException 
     */
    @Test(expected=NumberFormatException.class)
    public void testSpecialCharactersData() throws IOException, ValuesNumberException {
        System.out.println("*Prueba: Leer los datos desde un archivo con caracteres especiales");
        LinkedList helperList = SystemUtils.getData(new File("src/tddprogram2psp/files/testBadFormatFile1.txt"));
    }
    
    /**
     * Prueba: Cantidad de valores en cada línea del archivo diferente a dos
     * @throws IOException 
     * @throws java.io.FileNotFoundException 
     * @throws tddprogram2psp.util.exception.ValuesNumberException 
     */
    @Test(expected=ValuesNumberException.class)
    public void testValuesNumber() throws IOException, FileNotFoundException, ValuesNumberException {
        System.out.println("*Prueba: Cantidad de valores en cada línea del archivo diferente a dos");
        LinkedList helperList = SystemUtils.getData(new File("src/tddprogram2psp/files/testBadFormatFile2.txt"));
        LinkedList helperList2 = SystemUtils.getData(new File("src/tddprogram2psp/files/testBadFormatFile4.txt"));
    }
    
    /**
     * Prueba: Archivo con líneas vacías
     * @throws IOException 
     * @throws java.io.FileNotFoundException 
     * @throws tddprogram2psp.util.exception.ValuesNumberException 
     */    
    @Test(expected=ValuesNumberException.class)
    public void testBlankLines() throws IOException, FileNotFoundException, ValuesNumberException {
        System.out.println("*Prueba: Archivo con líneas vacías");
        LinkedList helperList = SystemUtils.getData(new File("src/tddprogram2psp/files/testBadFormatFile3.txt"));
    }
    
        /**
     * Prueba: Espacios al inicio y al final de los números
     * @throws IOException 
     * @throws java.io.FileNotFoundException 
     * @throws tddprogram2psp.util.exception.ValuesNumberException 
     */    
    @Test
    public void testTrim() throws IOException, FileNotFoundException, ValuesNumberException {
        System.out.println("*Prueba: Espacios al inicio y al final de los números");
        LinkedList helperList = SystemUtils.getData(new File("src/tddprogram2psp/files/testBadFormatFile5.txt"));
    }
}
