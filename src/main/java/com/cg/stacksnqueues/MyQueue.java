package com.cg.stacksnqueues;

public class MyQueue {
    MyLinkedList ll=new MyLinkedList();

    public void enqueue(int data)
    {
        Node node=new Node(data);
        ll.append(data);
    }
    public void printQueue()
    {
        ll.print();
    }
}
