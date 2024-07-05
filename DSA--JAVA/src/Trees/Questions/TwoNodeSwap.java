package Trees.Questions;

public class TwoNodeSwap {
    class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }
    }

    public class TwoSwap{
        Node first;
        Node second;
        Node prev;

        public void helper(Node root){
            iot(root);

            int temp = first.val;
            first.val= second.val;
            second.val=temp;
        }


        private void iot(Node node){
            if(node == null){
                return;
            }

            iot(node.left);

            if(prev != null && prev.val > node.val){
                if(first == null){
                    first = prev;

                }
                second = node;
            }
            prev = node;

            iot(node.right);
        }

        public void printIot(Node node){
            if(node == null){
                return;
            }

            printIot(node.left);
            System.out.println(node.val + " ");
            printIot(node.right);
        }
    }
}
