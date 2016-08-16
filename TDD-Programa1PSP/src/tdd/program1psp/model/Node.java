/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd.program1psp.model;

/**
 *
 * @author MattNP
 */
public class Node {
    
    private double data;
    private Node next;
    
    public Node() {
        this.data = 0;
        this.next = null;
    }

    public Node(double data) {
        this.data = data;
        this.next = null;
    }

    public double getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
