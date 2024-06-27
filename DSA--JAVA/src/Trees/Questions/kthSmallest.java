package Trees.Questions;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

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

    int count =0;


    public int kth(TreeNode root , int k){
        return helper(root,k).val;
    }

    public TreeNode helper(TreeNode node,int k){
        if(node == null){
            return null;
        }


        TreeNode left = helper(node.left,k);

        if(left != null){
            return left;
        }

        count++;

        if(count ==k){
            return node;
        }

        return helper(node.right,k);
    }



    public static void main(String[] args) {

    }

}
