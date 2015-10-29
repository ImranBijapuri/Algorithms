package Array;

/**
 * Created by imransay on 10/23/2015.
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the
 * product of all the elements of nums except nums[i].

 Solve it without division and in O(n).

 For example, given [1,2,3,4], return [24,12,8,6].
 */
public class Product_of_Array_Except_Self {

    public static void main(String[] args){
        new Product_of_Array_Except_Self().productExceptSelf(new int[]{1,2,3,4});
    }

    public int[] productExceptSelf(int[] nums){
        int[] fwd_mvg_arr = new int[nums.length];
        int[] bwd_mvg_arr = new int[nums.length];
        fwd_mvg_arr[0] = 1;
        bwd_mvg_arr[nums.length - 1] = 1;
        int i = 0;
        for(i = 1 ; i < nums.length ; i++){
            fwd_mvg_arr[i] = fwd_mvg_arr[i-1] * nums[i-1];
        }

        for (i = 0 ; i < nums.length ; i++){
            System.out.print(fwd_mvg_arr[i] + "  ");
        }
        System.out.println("");

        for (i = nums.length - 2; i >= 0 ;i--){
            bwd_mvg_arr[i] = bwd_mvg_arr[i+1] * nums[i+1];
        }

        for (i = 0 ; i < nums.length ; i++){
            System.out.print(bwd_mvg_arr[i] + "  ");
        }
        System.out.println("");

        for (i = 0 ; i <= nums.length-1 ; i++){
            nums[i] = fwd_mvg_arr[i] * bwd_mvg_arr[i];
        }

        for (i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + "  ");
        }

        return null;
    }
}
