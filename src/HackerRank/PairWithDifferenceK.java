package HackerRank;

import java.util.Scanner;

public class PairWithDifferenceK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            long[] arr = new long[N];
            long K = sc.nextLong();
            for (int j = 0; j < N; j++) {
                arr[j]= sc.nextLong();
            }
            mergeSort(arr ,arr.length);
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j]+" ");
//            }
            System.out.println(pairWithDifferenceK(arr ,K));
        }
    }
    public static boolean pairWithDifferenceK( long[] arr, long K){
      boolean res = false;
        long key ;
        int idx;
        for (int i = 0; i < arr.length-1; i++) {
            key = Math.abs(Math.abs(K) + Math.abs(arr[i]));
            idx = binarySearch(arr ,key ,i+1 ,arr.length-1);
            if(idx !=-1 && (arr[i]-arr[idx]==K || arr[idx]-arr[i]==K )){
                return !res;
            }
        }
      return res;
    }
    public static int binarySearch(long[] arr ,long el ,int s, int e){
        int res = -1;
        int start = 0, end = arr.length-1;
        if(s!=-1 && e!=-1){
            start=s;
            end=e;
        }
        while (start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==el){
                return mid;
            }else if(el > arr[mid]){
                start = mid + 1;
            }else if(el < arr[mid]){
                end = mid - 1;
            }
        }
        return res;
    }

    public static void mergeSort(long[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        long[] l = new long[mid];
        long[] r = new long[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(long[] a, long[] l, long[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
