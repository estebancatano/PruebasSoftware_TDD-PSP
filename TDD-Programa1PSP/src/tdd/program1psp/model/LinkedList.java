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
public class LinkedList {
    
    private Node head;
    
    public LinkedList() {
        this.head = null;
    }
    
    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    
    /*
    Ingresa nodo al final de la lista
    */
    public void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node p = head;
            while(p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(newNode);
        }
    }
    
    /*
    Elimina el primer nodo que contiene el valor dado
    */
    public void removeNode(double data) {
        if(head != null) {
            if(head.getData() == data) {
                head = head.getNext();
            } else {
                Node p = head;
                Node q = head.getNext();
                while(q.getNext() != null) {
                    if(q.getData() == data) {
                        p.setNext(q.getNext());
                    }
                    p = q;
                    q = q.getNext();
                }
            }
        }
    }
}
