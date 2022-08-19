package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            long q = sc.nextLong();
            solve(arr ,q);
        }
        sc.close();
    }
    public static void  solve( long[] arr ,long q){
      int start = 0, end = arr.length-1;
      if(arr[0]>q){
          System.out.println(Integer.MIN_VALUE);
          return;
      }else if(arr[0]==q){
          System.out.println(arr[0]);
          return;
      }else if(arr[arr.length-1]<=q){
          System.out.println(arr[arr.length-1]);
          return;
      }
      while (start <= end){
          int mid = (start + end)/2;
          if(arr[mid]<=q && (mid+1==arr.length || arr[mid+1]>q)){
              System.out.println(arr[mid]);
              return;
          }else if(q < arr[mid]){
              end = mid-1;
          }else if(q > arr[mid]){
              start = mid+1;
          }
      }
      System.out.println("---");
    }
}
