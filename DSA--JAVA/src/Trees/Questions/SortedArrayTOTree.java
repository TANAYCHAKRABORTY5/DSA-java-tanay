package Trees.Questions;

import com.sun.source.tree.Tree;

public class SortedArrayTOTree {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}

        TreeNode(int val){
            this.val=val;
        }

        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }


    public TreeNode sorted(int[] nums){
        if(nums == null || nums.length ==0){
            return null;

        }

        return sorted(nums,0,nums.length-1);
    }

    private TreeNode sorted(int[] nums,int start,int end){
        if(start >end){
            return null;
        }
        int mid = start + (end - start)/2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = sorted(nums,start,mid-1);
        root.right = sorted(nums,mid+1,end);

        return root;
    }

    public static void main(String[] args) {

    }
}
