package com.example.datastructurealgorithm.datastructure.linear.linkedlistdatastructure;

public class LinkedListDataStructure {
    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(false, false);
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);

        System.out.print("Singly Linked List: ");
        linkedList.display();

        MyLinkedList<Integer> doublyLinkedList = new MyLinkedList<>(true, false);
        doublyLinkedList.insert(40);
        doublyLinkedList.insert(50);
        doublyLinkedList.insert(60);

        System.out.print("Doubly Linked List: ");
        doublyLinkedList.display();

        MyLinkedList<Integer> circularLinkedList = new MyLinkedList<>(false, true);
        circularLinkedList.insert(70);
        circularLinkedList.insert(80);
        circularLinkedList.insert(90);

        System.out.print("Circular Linked List: ");
        circularLinkedList.display();
    }
}
