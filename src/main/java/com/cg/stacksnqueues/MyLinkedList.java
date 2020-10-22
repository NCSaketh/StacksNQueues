package com.cg.stacksnqueues;

public class MyLinkedList {
    Node head;
    Node tail;

    public void add(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
        }
        else
        {
            node.nextNode=head;
            head=node;
        }
    }

    public void append(int data)
    {
        Node node=new Node(data);
        if(tail==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            tail.nextNode=node;
            tail=node;
        }
    }

    public void Insert(int prev,int data)
    {
        Node node=new Node(data);
        Node temp=head;
        while(temp.data!=prev)
        {
            if(temp.nextNode==null)
            {
                System.out.println("Previous value is not present");
                return;
            }
            temp=temp.nextNode;
        }

        Node n1 = temp.nextNode;
        temp.nextNode = node;
        node.nextNode = n1;
    }

    public void pop()
    {
        head=head.nextNode;
    }

    public void popLast()
    {
        Node temp=head;
        while(temp.nextNode.nextNode!=null)
        {
            temp=temp.nextNode;
        }
        temp.nextNode=null;
        temp=tail;

    }

    public boolean search(int data)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                System.out.println("Searched and the node is found");
                return true;
            }
            temp=temp.nextNode;
        }
        System.out.println("Searched but node not found");
        return false;
    }

    public boolean delete(int data) {
        if (!search(data))
        {
            return false;
        }

        Node temp = head;
        while (temp.nextNode.data != data)
        {
            temp = temp.nextNode;
        }

        temp.nextNode = temp.nextNode.nextNode;
        return true;
    }

    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.nextNode;
        }
        return count;
    }


    public void addWithSort(int data) {
        Node newNode = new Node(data);
        Node presentNode = head;
        Node beforeNode = null;
        while(presentNode != null && data > presentNode.data)
        {
            beforeNode = presentNode;
            presentNode = presentNode.nextNode;
        }
        // Insertion at starting of the LinkedList
        if(beforeNode == null){
            head = newNode;
        }else{
            beforeNode.nextNode = newNode;
        }

        newNode.nextNode = presentNode;
    }


    public void print()
    {
        Node head= this.head;
        while(head!=null)
        {
            System.out.print(head.data+ " -> ");
            head=head.nextNode;
        }
    }
}
