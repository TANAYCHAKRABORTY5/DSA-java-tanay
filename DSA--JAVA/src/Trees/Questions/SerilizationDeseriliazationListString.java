package Trees.Questions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SerilizationDeseriliazationListString {


    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode(int val){
            this.val =val;
        }
    }
    public List<String> serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root,list);
        return list;

    }

    void helper(TreeNode node,List<String> list){
        if(node == null){
            list.add("null");
            return;
        }

        list.add(String.valueOf(node.val));

        helper(node.left,list);
        helper(node.right,list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> data) {

        Collections.reverse(data);
        TreeNode node = helper2(data);
        return node;
    }

    TreeNode helper2(List<String> data){
        String value = data.remove(data.size() -1);

        if(value.charAt(0) == 'n'){
            return null;
        }

        TreeNode node =new TreeNode(Integer.parseInt(value));

        node.left = helper2(data);
        node.right = helper2(data);
        return node;
    }


    public static void main(String[] args) {
        SerilizationDeseriliazationListString s = new SerilizationDeseriliazationListString();
        TreeNode root = s.new TreeNode(1);
        root.left = s.new TreeNode(2);
        root.right = s.new TreeNode(3);
        root.right.left = s.new TreeNode(4);
        root.right.right = s.new TreeNode(5);
        List<String> serializedata = s.serialize(root);
        System.out.println("Serlized data :: " + serializedata);

        TreeNode deserilizedRoot = s.deserialize(serializedata);

        List<String> verify = s.serialize(deserilizedRoot);
        System.out.println("serilized data after deserlization :: "+ verify );
    }


}
