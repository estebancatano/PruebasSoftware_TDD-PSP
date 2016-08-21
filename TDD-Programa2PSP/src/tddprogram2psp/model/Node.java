/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tddprogram2psp.model;

/**
 * @author Mateo Noreña
 * @author Joan Morales
 * @author Esteban Cataño
 */
public class Node {
    private double data1;
    private double data2;
    private Node next;

    public Node() {
        this.data1 = 0.0;
        this.data2 = 0.0;
        this.next = null;
    }

    public Node(double data1, double data2) {
        this.data1 = data1;
        this.data2 = data2;
        this.next = null;
    }

    public double getData1() {
        return data1;
    }

    public void setData1(double data1) {
        this.data1 = data1;
    }

    public double getData2() {
        return data2;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
    
    
    
    
    
    
}
