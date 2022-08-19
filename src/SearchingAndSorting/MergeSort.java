package SearchingAndSorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int[] arr, int left ,int right){
        if(left < right){
            int middle = left + (right - left) / 2;
            sort(arr , left ,middle);
            sort(arr ,middle + 1 ,right);
            merge(arr ,left ,right ,middle);
        }
    }
    public static void merge(int[] arr, int left ,int right ,int middle){
        int n1 = middle - left+1, n2=right-middle,k=left;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[left+i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[middle+i+1];
        }
        int i=0,j=0;
        while (i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
