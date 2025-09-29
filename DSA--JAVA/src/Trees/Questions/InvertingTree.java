package Trees.Questions;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertingTree {

    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){};

        TreeNode(int val){
            this.val= val;

        }

        TreeNode(int val,TreeNode left,TreeNode right){
            this.val=val;
            this.left=left;
            this.right =right;
        }
    }


    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();


        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();

            TreeNode temp = current.left;
            current.left = current.right;
            current.right =temp;

            if(current.left != null){
                queue.add(current.left);
            }

            if (current.right != null){
                queue.add(current.right);
            }
        }

        return root;
    }

    private static void printTree(TreeNode node){
        if(node == null){
            return;

        }

        printTree(node.left);
        System.out.print(node.val + " ");
        printTree(node.right);

    }

    public static void main(String[] args) {
        InvertingTree tree = new InvertingTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Original Tree");
        printTree(root);

        TreeNode inverterd = tree.invertTree(root);
        System.out.println("\nAfter Inverting the tree");

        printTree(inverterd);
    }
}
