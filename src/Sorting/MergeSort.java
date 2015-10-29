package Sorting;

/**
 * Created by imransay on 10/16/2015.
     */
public class MergeSort {
    public int[] arr;
    public int[] helper;

    public void sort(int []arr){
        this.arr = arr;
        helper = new int[this.arr.length];
        System.out.println("sa");
        mergesort(0,arr.length - 1);
    }

    public void mergesort(int low, int high){
        if (high > low){
            System.out.println("sasa");
            int mid = low + (high - low) / 2;
            mergesort(low,mid);
            mergesort(mid+1,high);
            sorter(low, mid, high);
        }
    }

    public void sorter(int low,int mid, int high){
        for(int k = low ; k <= high ; k++){
            helper[k] = arr[k];
        }

        int i = low ;
        int j = mid+1;
        int k = low;
        while(i <= mid && j <= high ){
            if(helper[i] < helper[j]){
                arr[k] = helper[i];
                i++;k++;
            }else{
                arr[k] = helper[j];
                j++;k++;
            }
        }

        while (i <= mid){
            arr[k] = helper[i];
            i++;k++;
        }
    }

    public static void main(String[] args){
        int []sortarr = new int[]{3,36,65,2,454,6,3,5,7,6};
        new MergeSort().sort(sortarr);
        for(int i = 0 ; i < sortarr.length ; i++){
            System.out.print(sortarr[i] + " ");
        }
    }


}
