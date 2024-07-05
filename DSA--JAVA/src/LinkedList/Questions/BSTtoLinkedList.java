package LinkedList.Questions;

import com.sun.source.tree.Tree;

import java.util.LinkedList;

public class BSTtoLinkedList {

    class LLNode{
        int val;
        LLNode prev;
        LLNode next;

        public LLNode(int val){
            this.val= val;
        }
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val= val;
        }
    }



    LLNode head;
    LLNode tail;


    public LLNode convert(TreeNode root){
        if(root == null){
            return null;
        }
        helper(root);
        return head;
    }


    private void helper(TreeNode node){
        if(node == null){
            return;
        }
        helper(node.left);

        LLNode newNode = new LLNode(node.val);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        helper(node.right);
    }


    public static void main(String[] args) {
        BSTtoLinkedList converter = new BSTtoLinkedList();
        TreeNode root = converter.new TreeNode(10);
        root.left = converter.new TreeNode(5);
        root.right = converter.new TreeNode(15);
        root.left.left = converter.new TreeNode(2);
        root.left.right = converter.new TreeNode(7);
        root.right.left = converter.new TreeNode(12);
        root.right.right = converter.new TreeNode(18);

        LLNode head = converter.convert(root);
        LLNode current = head;

        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }



}
