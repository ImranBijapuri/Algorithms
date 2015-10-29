package Tree;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by imransay on 10/19/2015.
 */
public class Symmetric_Tree {

    public void Symmetric_Tree_X(TreeNode root){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        while(!list1.isEmpty() && !list2.isEmpty()){
            ArrayList<Integer> arr1 = new ArrayList<Integer>();
            ArrayList<Integer> arr2 = new ArrayList<Integer>();

            while (!list1.isEmpty()){
                arr1.add(list1.remove());
            }

            while (!list2.isEmpty()){
                arr2.add(list2.remove());
            }


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
