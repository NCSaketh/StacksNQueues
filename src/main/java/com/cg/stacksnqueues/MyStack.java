package com.cg.stacksnqueues;

public class MyStack {
    MyLinkedList ll=new MyLinkedList();

    public void push(int data)
    {
        Node node=new Node(data);
        ll.add(data);
    }

    public void printStack() {
        ll.print();
    }
    public void peak()
    {
        System.out.println(ll.head.data);
    }
    public void pop()
    {
        ll.pop();
    }


}
