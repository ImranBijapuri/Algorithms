package Sorting;

/**
 * Created by imransay on 10/27/2015.
 */
public class QuickSort {
    public int[] arr;

    public static void main(String[] args){
        int[] arr = {2,62,3,3,4,4,5,6,6,7,7,4323,867,76,3,-2,433,43,75,65,2,4,6,72,2};
        new QuickSort().initQuickSort(arr);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public void initQuickSort(int[] arr) {
        this.arr = arr;
        sort(this.arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int low, int high) {
        if (high > low) {
            int i = low;
            int j = high;
            int pivot = low + (high - low) / 2;

            while (i < j) {
                while (arr[i] < arr[pivot]) {
                    i++;
                }

                while (arr[j] > arr[pivot]) {
                    j--;
                }

                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            if(i < high) {
             //System.out.println("i = " + i + "high = " + high);
                sort(arr, i, high);
            }
            if (j > low)
                sort(arr,low,j);
        }
    }

}
