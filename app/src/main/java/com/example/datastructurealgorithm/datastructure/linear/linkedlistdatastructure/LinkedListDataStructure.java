package com.example.datastructurealgorithm.datastructure.linear.linkedlistdatastructure;

public class LinkedListDataStructure {
    public static void main(String[] args) {

    }

    private void singlyLinkedList(){
        MyLinkedList linkedList = new MyLinkedList();

        // Assign value values
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Connect nodes
        linkedList.head.next = second;
        second.next = third;

        // printing node-value
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }

    private void doublyLinkedList(){
        MyLinkedList linkedList = new MyLinkedList();

        // Assign value values
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Connect nodes
        linkedList.head.next = second;
        linkedList.head.prev = null;

        second.next = third;
        second.prev = linkedList.head;

        third.next = null;
        third.prev = second;

        // printing node-value
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }

    private void circularLinkedList(){
        MyLinkedList linkedList = new MyLinkedList();

        // Assign value values
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        // Connect nodes
        linkedList.head.next = second;
        second.next = third;
        third.next = linkedList.head;

        // printing node-value
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}
