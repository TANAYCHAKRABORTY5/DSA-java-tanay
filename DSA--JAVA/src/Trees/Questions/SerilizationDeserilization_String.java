package Trees.Questions;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SerilizationDeserilization_String {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode(int val){
            this.val =val;
        }
    }

    public String serilize(TreeNode root){
        StringBuilder sb = new StringBuilder();
        helper(root , sb);
        return sb.toString();
    }

    void helper(TreeNode node, StringBuilder sb){
        if(node == null){
            sb.append("null,");
            return;
        }

        sb.append(node.val).append(",");


        helper(node.left , sb);
        helper(node.right,sb);
    }



    public TreeNode deserialize(String data){
        String[] arr = data.split(",");
        List<String> dataList = new LinkedList<>(Arrays.asList(arr)); // this convert to linked list
        return helper2(dataList);
    }

    TreeNode helper2(List<String> data){
        String value = data.remove(0);

        if(value.equals("null")){
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(value));
        node.left = helper2(data);
        node.right = helper2(data);
        return node;
    }



    public static void main(String[] args) {

    }
}
