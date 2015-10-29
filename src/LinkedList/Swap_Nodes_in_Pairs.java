package LinkedList;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by imransay on 10/20/2015.
 */
public class Swap_Nodes_in_Pairs {
    public static void main(String[] args){

    }

    public void swap(TreeNode root){
        if(root == null) return;
        else if(root.next == null) return;
        else{
            Stack<TreeNode> stack = new Stack<TreeNode>();
            TreeNode current = root;
            while (current != null && current.next != null){
                if(stack.isEmpty()){
                    stack.push(current);
                    current.next = null;
                }else {
                    TreeNode temp  = current.next;
                    TreeNode s = stack.pop();
                    current.next = s;
                    s.next = temp;
                }
                current = current.next;
            }
        }
    }


    class TreeNode{
        public String word;
        public int step;
        public TreeNode left;
        public TreeNode right;
        public TreeNode next;
        public int val;
        TreeNode(String word,int step){
            this.word = word;
            this.step = step;
        }
    }
}
