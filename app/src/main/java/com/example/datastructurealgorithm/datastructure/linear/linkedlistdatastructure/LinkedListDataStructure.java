package com.example.datastructurealgorithm.datastructure.linear.linkedlistdatastructure;

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

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
}
