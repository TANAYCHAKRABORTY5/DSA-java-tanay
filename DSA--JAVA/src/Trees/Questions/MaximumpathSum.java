package Trees.Questions;

public class MaximumpathSum {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode(int val){
            this.val =val;
        }
    }


    int ans =Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root){
        helper(root);
        return ans;
    }

    int helper(TreeNode node){
        if(node == null){
            return 0;
        }


        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int sum = left + right + node.val;

        ans = Math.max(ans,sum);

        return Math.max(left,right) + node.val;
    }

    public static void main(String[] args) {
        MaximumpathSum s = new MaximumpathSum();

        TreeNode root = s.new TreeNode(1);
        root.left = s.new TreeNode(2);
        root.right = s.new TreeNode(3);
        root.right.left = s.new TreeNode(4);
        root.right.right = s.new TreeNode(5);

        int maxPathSum= s.maxPathSum(root);
        System.out.println(maxPathSum);
    }
}
