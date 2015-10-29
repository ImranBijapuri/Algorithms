package Array;

import java.util.HashMap;

/**
 * Created by imransay on 10/17/2015.
 */
public class Isomorphic_Strings {
    public static HashMap<Character,Character> map;
    public static void main(String[] args){
        map = new HashMap<Character,Character>();
        System.out.println(Is_Isomorphic_Strings("ab", "aa"));
    }

    public static boolean  Is_Isomorphic_Strings(String a, String b){
        for (int i = 0 ; i < a.length(); i++){
            if(map.containsKey(a.charAt(i))){
                if(map.get(a.charAt(i)) != b.charAt(i)) return false;
            }else{
                if(map.containsValue(b.charAt(i))) {
                    return false;
                }
                map.put(a.charAt(i),b.charAt(i));
            }
        }
        return true;
    }
}
