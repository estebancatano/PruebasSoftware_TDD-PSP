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
public class LinkedList {
    private Node head;

    public LinkedList() {
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

    public void removeNode(Node node) {
        if(head != null) {
            if(head == node) {
                head = head.getNext();
            } else {
                Node p = head;
                Node q = head.getNext();
                while(q.getNext() != null) {
                    if(q == node) {
                        p.setNext(q.getNext());
                    }
                    p = q;
                    q = q.getNext();
                }
            }
        }
    }    

    public int calculateLength() {
        int length = 0;
        Node node = this.head;
        while (node != null) {            
            length = length + 1;
            node = node.getNext();
        }
        return length;
    }
}
