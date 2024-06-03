package LinkedList;

public class circularLinkedList {

    private Node head;
    private Node tail;
    private circularLinkedList(){
        this.head =null;
        this.tail = null;
    }
    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val= val;

        }

    }

    public void insertFirst(int val){
        Node node = new Node(val);

        if(head == null){
            head =node;
            tail =node;
            return;
        }
        tail.next =node;
        node.next =head;
        tail= node;


    }

    //delete

    public void delete(int val){

        Node node =head;
        if(node == null){
            return;
        }

        if(node.val == val){
            head= head.next;
            tail.next =head;
            return;
        }

        do{
            Node n =node.next;
            if(n.val == val){
                node.next = n.next;

                break;
            }
            node =node.next;
        }while (node != head);

    }

    public void display(){
        Node node =head;


        if(head != null){
            do{
                System.out.print(node.val + "->");
                node = node.next;
            }while (node != head );
        }
        System.out.println("head");
    }
    public static void main(String[] args) {


        circularLinkedList list =new circularLinkedList();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);

        list.display();

        list.delete(4);
        list.display();
    }
}
