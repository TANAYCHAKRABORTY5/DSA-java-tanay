package Trees.Questions;

public class HeightTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }


    int maxDia = 0;
    public int Diameter(TreeNode root){
        diameter(root);
        return maxDia-1;
    }
    private int diameter(TreeNode node){
        if(node == null){
            return 0;

        }

        int left = diameter(node.left);
        int right = diameter(node.right);

        int currDiameter = left +right+1;

        maxDia= Math.max(currDiameter,maxDia);

        return Math.max(left ,right) +1;
    }

    public static void main(String[] args) {

    }
}
