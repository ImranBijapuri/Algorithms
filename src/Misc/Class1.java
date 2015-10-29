package Misc;

import java.util.*;

/**
 * Created by imransay on 10/20/2015.
 */
public class Class1 {
    private String text;
    public static void main(String[] args){
        List<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        Set<Integer> set  = new HashSet<Integer>();
        set.add(1);set.add(2);


        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        Iterator<ArrayList<Integer>> lt = list.iterator();
        while (lt.hasNext()){
            lt.next();
        }
    }
}
