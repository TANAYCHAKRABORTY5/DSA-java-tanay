package Trees.Questions;

public class KthSmallestbetter {


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}

        TreeNode(int val){
            this.val= val;
        }

        TreeNode(int val , TreeNode left, TreeNode right){
            this.val= val;
            this.left=left;
            this.right=right;
        }
    }


    private int k;
    private int ans;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        helper(root);

        return ans;
    }

    public void helper(TreeNode node){
        if(node == null){
            return;
        }


        helper(node.left);


        k--;
        if(k ==0 ){
            ans = node.val;
            return;
        }

        helper(node.right);
    }


    public static void main(String[] args) {
        KthSmallestbetter mm = new KthSmallestbetter();

        TreeNode root =mm.new TreeNode(10);
        root.left = mm.new TreeNode(3);
        root.right = mm.new TreeNode(6);
        root.left.left = mm.new TreeNode(2);
        root.left.right = mm.new TreeNode(4);
        root.left.left.left = mm.new TreeNode(1);

        int k =3;

        int result = mm.kthSmallest(root,k);
        System.out.println(result);
    }
}
