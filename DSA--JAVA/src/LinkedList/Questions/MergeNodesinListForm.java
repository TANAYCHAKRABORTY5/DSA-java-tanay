package LinkedList.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeNodesinListForm {

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

    public void LinkedListFromList(List<Integer> inputList){
        if(inputList == null || inputList.isEmpty()){
            return;
        }

        head = new Node(inputList.get(0));

        Node current = head;

        for(int i= 1;i<inputList.size() ;i++){
            current.next = new Node(inputList.get(i));
            current=current.next;
        }
    }


    //from LinkedlIst to List

    public List<Integer> ListFromLinkedList(Node node){
        List<Integer> resultList = new ArrayList<>();
        Node current = node;

        while(current != null){
            resultList.add(current.val);
            current = current.next;
        }
        return resultList;
    }



    public static void main(String[] args) {
        MergeNodesinListForm nn = new MergeNodesinListForm();
        List<Integer> inputList = List.of(0,3,1,0,4,5,2,0);

        nn.LinkedListFromList(inputList);

        Node mergedHead = nn.mergeNodes(nn.head);

        List<Integer> output = nn.ListFromLinkedList(mergedHead);

        System.out.println("Output List :::: " + output);
        

    }
}
