package Array;

/**
 * Created by imransay on 10/17/2015.
 * Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3,
 * the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different ways do you know to solve this problem?
 */
public class Rotate_Array_in_Java {
    public static int[] arr;
    public static void main(String[] args){
        int[] num = new int[]{1,2,3,4,5,6,7};
        arr = num;
        int k = 8;
        k = k % num.length;

        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        reversearray(0,arr.length - 1 - k);
        reversearray(arr.length - k , arr.length - 1);
        reversearray(0,arr.length - 1);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void reversearray(int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }
}
