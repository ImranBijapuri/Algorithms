package Array;

import java.util.Arrays;

/**
 * Created by imransay on 10/18/2015.
 * Find the kth largest element in an unsorted array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.

 For example,
 Given [3,2,1,5,6,4] and k = 2, return 5.

 Note:
 You may assume k is always valid, 1 ? k ? array's length.
 */
public class Kth_Largest_Element_in_an_Array {

    public static void main(String [] args){
        //new Kth_Largest_Element_in_an_Array().findKthLargest();
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
