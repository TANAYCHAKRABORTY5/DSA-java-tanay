package LinkedList.Questions;

public class MergeNodes {

    Node head;

    class Node{
        int val;
        Node next;

        Node(){}

        Node(int val){
            this.val = val;
        }

        Node(int val ,Node next){
            this.val = val;
            this.next = next;
        }
    }


    public Node mergeNodes(Node head){
        Node  dummy = new Node(0);
        Node newList = dummy;
        Node current = head.next;

        int sum =0;

        while(current != null){
            if(current.val == 0){
                newList.next = new Node(sum);
                newList = newList.next;
                sum=0;
            }else {
                sum += current.val;
            }

            current = current.next;

        }
        return dummy.next;
    }

    public void addNode(int val){
        Node newNode  = new Node(val);

        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

    }

    public void printList(Node node){
        Node current = node;

        while(current != null){
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeNodes nn = new MergeNodes();
        nn.addNode(0);
        nn.addNode(3);
        nn.addNode(1);
        nn.addNode(0);
        nn.addNode(4);
        nn.addNode(5);
        nn.addNode(2);
        nn.addNode(0);


        System.out.println("original List");
        nn.printList(nn.head);

        Node merged = nn.mergeNodes(nn.head);
        System.out.println("Merged List");
        nn.printList(merged);
    }
}
