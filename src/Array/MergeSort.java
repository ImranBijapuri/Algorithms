package Array;

/**
 * Created by imransay on 10/24/2015.
 */
public class MergeSort {
    public int[] arr;
    public int[] helper;

    public static void main(String[] args){
        int[] nums = new int[]{4,3,6,5,4,3,2,9};
        new MergeSort().initsort(nums);
        for (int i : nums){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public void initsort(int[] nums){
        this.arr = nums;
        helper = new int[nums.length];
        startsort(0,nums.length-1);
    }

    public void startsort(int left,int right){
        if(right > left){
            int mid = left + (right - left) / 2 ;
            startsort(left,mid);
            startsort(mid+1,right);
            mergersort(left,mid,right);
        }
    }

    public void mergersort(int left,int mid,int right){
        for(int k = left ; k <= right ; k++){
            helper[k] = arr[k];
        }

        int i = left;
        int p = mid+1;
        int q = left;
        //System.out.println("");
        while (i <= mid && p <= right){
            //System.out.println("sa " + q);
            if(helper[i] > helper[p]){
                arr[q] = helper[p];
                p++;
            }else {
                arr[q] = helper[i];
                i++;
            }
            q++;
        }

        while (i <= mid){
            arr[q] = helper[i];
            q++;i++;
        }

        for (int g : arr){
            System.out.print(g + " ");
        }
        System.out.println("");
    }
}
