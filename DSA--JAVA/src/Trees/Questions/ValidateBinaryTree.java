package Trees.Questions;

public class ValidateBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    private boolean helper(TreeNode node,Integer low,Integer high){
        if(node == null){
            return true;
        }

        if(low!=null && node.val <= low){
            return false;
        }

        if(high != null && node.val >= high){
            return false;
        }

        boolean leftTree = helper(node.left,low,node.val);
        boolean rightTree = helper(node.right,node.val,high);

        return leftTree && rightTree;
    }

    public static void main(String[] args) {
        ValidateBinaryTree validator = new ValidateBinaryTree();
        TreeNode root = validator.new TreeNode(2);
        root.left = validator.new TreeNode(1);
        root.right = validator.new TreeNode(3);

        System.out.println(validator.isValidBST(root));
    }
}
