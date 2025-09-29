package Trees.Questions;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
public class ZigZag_Order_Traversal {

    public static class TreeNode {
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

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if(root == null){
                return result;
            }

            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            boolean reverse = false;

            while(!queue.isEmpty()){
                int levelSize = queue.size();
                List<Integer> currentLevel = new ArrayList<>(levelSize);
                for(int i=0;i<levelSize;i++){
                    if(!reverse){
                        TreeNode currNode = queue.pollFirst();
                        currentLevel.add(currNode.val);
                        if(currNode.left != null){
                            queue.addLast(currNode.left);
                        }
                        if(currNode.right != null){
                            queue.addLast(currNode.right);
                        }
                    }else{
                        TreeNode currNode = queue.pollLast();
                        currentLevel.add(currNode.val);
                        if(currNode.right != null){
                            queue.addFirst(currNode.right);
                        }
                        if(currNode.left != null){
                            queue.addFirst(currNode.left);
                        }

                    }

                }
                reverse = !reverse;
                result.add(currentLevel);
            }
            return result;
         }
        public static void main(String[] args) {

        }
    }
}
