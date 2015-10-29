package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

/**
 * Created by imransay on 10/19/2015.
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.

 For example, given binary tree {3,9,20,#,#,15,7},

  3
 / \
 9  20
   /  \
  15   7
 return its level order traversal as [[15,7], [9,20],[3]]
 */
public class Binary_Tree_Level_Order_Traversal_II {

    public static void levelOrderBottom(TreeNode root){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(root == null) return ;
        else {
            queue.add(root);
            while (!queue.isEmpty()){
                ArrayList<Integer> array = new ArrayList<Integer>();
                ArrayList<TreeNode> arr = new ArrayList<TreeNode>();
                while (!queue.isEmpty()){
                    array.add(queue.poll().val);
                    arr.add(queue.poll());
                }
                list.add(array);

                for (TreeNode t : arr){
                    if (t.left!=null)
                        queue.add(t.left);
                    if (t.right!=null)
                        queue.add(t.right);
                }
            }
        }

        for (int i = list.size()-1; i >= 0 ; i--){
            result.add(list.get(i));
        }



    }

    class TreeNode{
        public String word;
        public int step;
        public TreeNode left;
        public TreeNode right;
        public int val;
        TreeNode(String word,int step){
            this.word = word;
            this.step = step;
        }
    }
}

