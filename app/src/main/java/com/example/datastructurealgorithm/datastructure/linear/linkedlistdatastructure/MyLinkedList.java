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
            head = newNode; // Set the head to the new node
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the last node
            }
            current.next = newNode; // Append the new node to the end
            if (isDoubly) {
                newNode.prev = current; // For doubly linked list, set previous pointer
            }
        }

        if (isCircular) {
            newNode.next = head; // Make the new node point back to head
            if (isDoubly) {
                head.prev = newNode; // For doubly circular linked list, set previous pointer of head
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