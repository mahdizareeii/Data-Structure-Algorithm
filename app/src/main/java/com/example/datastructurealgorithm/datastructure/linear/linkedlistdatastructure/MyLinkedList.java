package com.example.datastructurealgorithm.datastructure.linear.linkedlistdatastructure;// Linked list implementation in Java

class MyLinkedList<T> {

    private final boolean isDoubly;
    private final boolean isCircular;
    Node<T> head;

    public MyLinkedList(boolean isDoubly, boolean isCircular) {
        this.head = null;
        this.isDoubly = isDoubly;
        this.isCircular = isCircular;
    }

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            if (isDoubly) {
                newNode.prev = current;
            }
        }

        if (isCircular) {
            newNode.next = head;
            if (isDoubly) {
                head.prev = newNode;
            }
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}