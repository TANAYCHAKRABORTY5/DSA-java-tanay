package Trees.Questions;

import com.sun.source.tree.Tree;

public class LowestCommonAncestor {


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode(){}

        TreeNode(int val){
            this.val = val;
        }

        TreeNode(int val,TreeNode left,TreeNode right){
            this.val =val;
            this.left= left;
            this.right = right;
        }
    }

    public TreeNode lowest(TreeNode root,TreeNode p,TreeNode q){
        if(root == null){
            return null;

        }

        if(root == p|| root == q){
            return root;
        }

        TreeNode left = lowest(root.left,p,q);
        TreeNode right = lowest(root.right,p,q);

        if(left != null && right != null){
            return root;
        }

        return left == null ?right:left;
    }

    public static void main(String[] args) {

    }
}
