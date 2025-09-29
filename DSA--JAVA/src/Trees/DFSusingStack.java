package Trees;

import java.util.Stack;

public class DFSusingStack {

    class Node{
        int val;
        Node left;
        Node right;
    }

    void dfsStack(Node node){
        if(node == null){
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push((node));

        while(!stack.isEmpty()){
            Node removed  =stack.pop();
            System.out.println(removed.val + " ");
            if(removed.left != null){
                stack.push(removed.left);
            }
        }
    }
}
