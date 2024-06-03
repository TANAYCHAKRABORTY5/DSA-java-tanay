package LinkedList;

public class doublyLinkedList {

    private Node head;
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val= val;
            next =null;
        }

        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev=prev;
        }


    }

    //inserting first

    public void insertFirst(int val){
        Node node =new Node(val);

        node.next =head;
        node.prev =null;

        if(head != null){
            head.prev = node;
        }
        head =node;

    }


    // insert at last

    public  void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        node.next=null;

        if(head == null){
            node.prev= null;
            head = node;
            return;
        }

        while(last.next != null){
            last =last.next;

        }
        last.next = node;
        node.prev =last;


    }

    //insert at index

    public void insertBetween(int val,int position){
        Node node = new Node(val);
        if(position == 0){
            insertFirst(val);
            return;
        }
        Node temp = head;
        for (int i =1;temp != null && i<position;i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("position out of range");
            return;
        }

        node.next=temp.next;
        temp.next = node;
        node.prev = temp;
        temp.next.prev =node;
    }

    //display

    public void display(){
        Node node =head;

        while(node != null){
            System.out.print(node.val + "->");
            node = node.next;
        }

        System.out.println("null");
    }


    // print in reverse

    public void reverse(){
        Node last =head;

        while (last != null && last.next != null){
            last = last.next;
        }
//        System.out.println("Printing in reverse");
        while(last != null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.display();
        list.reverse();

        list.insertLast(5);
        list.display();

        list.insertBetween(15,3);
        list.display();


    }
}
