package Trees.Questions;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kthSmallest {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}

        TreeNode(int val){
            this.val= val;
        }

        TreeNode(int val ,TreeNode left,TreeNode right){
            this.val= val;
            this.left=left;
            this.right=right;
        }
    }




    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        helper(root,k,minHeap);

        int result = 0;
        for(int i=0;i<k;i++){
            result = minHeap.poll();
        }
        return result;
    }

    public void helper(TreeNode node,int k ,PriorityQueue<Integer> minHeap){
        if(node == null){
            return;
        }


        helper(node.left,k,minHeap);
        minHeap.offer(node.val);
        helper(node.right,k,minHeap);
    }



    public static void main(String[] args) {

    }

}
