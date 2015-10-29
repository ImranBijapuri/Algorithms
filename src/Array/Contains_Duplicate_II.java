package Array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by imransay on 10/24/2015.
 */
public class Contains_Duplicate_II {
public static void main(String [] args){
    int[] arr = new int[30000];
    for (int i = 0 ; i < arr.length ; i++){
        arr[i] = i;
    }
    System.out.println(new Contains_Duplicate_II().containsNearbyDuplicate(arr, 29999));
}
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for (int i = 0 ; i < nums.length ; i++){
            Integer x = map.get(nums[i]);
            if(x == null){
                map.put(nums[i],i);
            }else{
                if(i-x <= k){
                    return true;
                }else {
                    map.put(nums[i],i);
                }
            }
        }

        return false;
    }
}
