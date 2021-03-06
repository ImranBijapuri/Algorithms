/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/
public class moveZeroes {
    public void moveZero(int[] nums) {
        int read = 0 ;
        int write = 0 ;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[read] == 0){
                read ++;
            }else{
                nums[write] = nums[read];
                read++;
                write++;
            }
        }
        for(int i = write ; i < nums.length ; i ++){
            nums[i] = 0;
        }
    }
}
