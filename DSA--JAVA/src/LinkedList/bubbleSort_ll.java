package LinkedList;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class bubbleSort_ll {
    static Node head;

    // Function to insert a new node at the end of linked list
    static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Function to perform bubble sort on linked list
    static void bubbleSort() {
        if (head == null || head.next == null)
            return;

        boolean swapped;
        Node ptr1;
        Node lptr = null;

        do {
            swapped = false;
            ptr1 = head;

            while (ptr1.next != lptr) {
                if (ptr1.data > ptr1.next.data) {
                    int temp = ptr1.data;
                    ptr1.data = ptr1.next.data;
                    ptr1.next.data = temp;
                    swapped = true;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
        } while (swapped);
    }

    // Function to print linked list
    static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list
        insert(64);
        insert(34);
        insert(25);
        insert(12);
        insert(22);
        insert(11);
        insert(90);

        System.out.println("Linked List before sorting:");
        display();

        // Perform Bubble Sort
        bubbleSort();

        System.out.println("Linked List after sorting:");
        display();
    }
}
