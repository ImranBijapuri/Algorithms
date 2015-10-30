/*
Given a sorted array and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.
Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
*/


public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
            int left = 0 ;
            int right = nums.length - 1;
            int mid = 0;
            while(right > left){
                mid = left + (right - left) / 2 ;
                if(target == nums[mid]) return mid;
                if(target < nums[left]) return left;
                else if(target > nums[right]) return right+1;
                else if(target < nums[mid]) right = mid;
                else if(target > nums[mid]) left = mid + 1;
            }
            
            if(target > nums[mid]) return mid+1;
            else return mid;
        
    }
}
