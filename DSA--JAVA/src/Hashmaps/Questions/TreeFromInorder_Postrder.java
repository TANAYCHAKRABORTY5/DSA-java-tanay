package Hashmaps.Questions;

import java.util.HashMap;

public class TreeFromInorder_Postrder {


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}

        TreeNode(int val,TreeNode left ,TreeNode right){
            this.val=val;
            this.left=left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val =val;
        }
    }


    public TreeNode buildTree(int[] preorder, int[] inorder){

        if(preorder == null || inorder == null || preorder.length != inorder.length){
            return null;
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int[] index = new int[1];
        return helper(preorder,inorder,0,inorder.length-1,map,index);
    }

    public TreeNode helper(int[] preOrder, int[] inOrder, int left, int right, HashMap<Integer,Integer> map, int[] index){
        if(left >right){
            return null;
        }

        int curr = preOrder[index[0]];

        index[0]++;

        TreeNode node  = new TreeNode(curr);

        if(left == right){
            return node;
        }

        int inOrderIndex = map.get(curr);

        node.left = helper(preOrder,inOrder,left,inOrderIndex-1,map,index);
        node.right = helper(preOrder,inOrder,inOrderIndex+1,right,map,index);


        return node;
    }

    public static void main(String[] args) {

    }
}
