/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
*/
public class Missing_Number {
    public int missingNumber(int[] nums) {
        if(nums.length == 0) return 0;
        else{
            int length = nums.length;
            int actual_sum = (length*(length+1))/2 ;
            int sum = 0 ;
            for(int i = 0 ; i < length ; i ++){
                sum = sum + nums[i];
            }
            return actual_sum - sum;
        }
    }
}
