package LinkedList;

public class RecursionLinkedList {
    private Node head;

    private int size;
    private Node tail;

    public RecursionLinkedList() {
        this.head = null;
        this.size = 0;
    }
    private class Node{
        int val;
        Node next;


        public Node(int val){
            this.val= val;
            this.next =null;
        }
        public Node(int val,Node next){
            this.val =val;
            this.next = next;
        }

    }
    //inserting using recursion

    public void insertrec(int val,int index){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        head = insertrec(val,index,head);
    }

    private Node insertrec(int val , int index , Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertrec(val,index-1,node.next);

        return node;
    }


    //reverse

    public void reverse(){
        if(head != null){
            reverse(null,head);
        }
    }

    private void reverse(Node prev , Node curr){
        if(curr.next == null){
            head= curr;
            curr.next = prev;
            return;
        }
        Node temp = curr.next;
        curr.next = prev;
        reverse(curr,temp);
    }






    public void displayList(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        RecursionLinkedList list = new RecursionLinkedList();
        list.insertrec(1, 0); // Insert 1 at index 0
        list.insertrec(2, 1); // Insert 2 at index 1
        list.insertrec(3, 2); // Insert 3 at index 2
        list.insertrec(88, 2); // Insert 88 at index 2

        list.displayList();

        list.reverse();

        list.displayList();
    }
}
