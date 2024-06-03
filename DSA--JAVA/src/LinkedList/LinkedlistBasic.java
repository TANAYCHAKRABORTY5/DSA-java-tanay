package LinkedList;

import org.w3c.dom.Node;

import java.util.List;

public class LinkedlistBasic {

    Node head;
    class Node{
        int data;
        Node next;

        Node(int d){
            data= d;
            next =null;
        }
    }

    //inserting at first

    public void insertatFirst(int newData){
        Node newNode =new Node(newData);
        newNode.next = head;
        head =newNode;
    }


    //inserting in last
    public void insertatlast(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = newNode;
            return;
        }
        Node last =head;
        while(last.next != null){
            last = last.next;
        }
        last.next =newNode;
    }


    //inserting at the middle

    public void insertatMiddle(int newData,int position){
        Node newNode = new Node(newData);

        if(position == 0){
            insertatFirst(newData);
            return;
        }

        Node temp =head;

        for (int i =1;temp != null && i<position;i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("position out of range");
            return;
        }
        newNode.next =temp.next;
        temp.next = newNode;
    }


    //Delete firsst

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is already empty");
            return;

        }
        head = head.next;
    }

    //delete Last

    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(head.next == null){
            head=null;
            return;
        }

        Node SecondLast = head;

        while(SecondLast.next.next != null){
            SecondLast = SecondLast.next;
        }

        SecondLast.next =null;
    }

    //Delete any value

    public void deletevalue(int key){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.data == key){
            head = head.next;
            return;
        }
        Node temp =head;

        while(temp.next != null && temp.next.data != key){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Value not found");
            return;
        }

        temp.next = temp.next.next;
    }


    //Display

    public void displayList(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedlistBasic list =new LinkedlistBasic();
        list.insertatFirst(1);
        list.insertatFirst(2);
        list.insertatFirst(3);
        list.insertatlast(12);
        list.insertatMiddle(15,3);
        list.displayList();

        list.deleteFirst();
        list.displayList();

        list.deleteLast();
        list.displayList();

        list.deletevalue(1);
        list.displayList();
    }
}
