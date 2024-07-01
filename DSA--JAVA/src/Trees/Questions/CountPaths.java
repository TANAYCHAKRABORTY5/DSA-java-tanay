package Trees.Questions;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CountPaths {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode(int val){
            this.val =val;
        }
    }

    int countpath(TreeNode node,int sum){
        List<Integer> path = new LinkedList<>();
        return helper(node,sum,path);
    }

    int helper(TreeNode node,int sum,List<Integer> path){
        if(node == null){
            return 0;

        }
        path.add(node.val);
        int count =0;
        int s=0;

        ListIterator<Integer> itr = path.listIterator(path.size());

        while(itr.hasPrevious()){
            s += itr.previous();

            if(s == sum){
                count++;
            }
        }
        count += helper(node.left,s,path) + helper(node.right,sum,path);



        path.remove(path.size()-1);
        return count;
    }
}
