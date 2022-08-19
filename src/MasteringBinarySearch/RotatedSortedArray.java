package MasteringBinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};
        int[] arr2 = {1};
        int[] arr3 = {2,3,4,5,1};
        int[] arr4 = {2,1};
        System.out.println(findMinimum(arr ,arr.length));
        System.out.println(findMinimum(arr2 ,arr2.length));
        System.out.println(findMinimum(arr3 ,arr3.length));
        System.out.println(findMinimum(arr4 ,arr4.length));
    }
    public static int findMinimum( int[] arr ,int N){
      if(arr.length<=1 || arr[0]<=arr[arr.length-1]){
          return 0;
      }
      int res = 0;
      int start = 0,end=N-1 ,mid ,left ,right;
      while (start<=end){
          mid = (start+end)/2;
          left = (mid -1 + N)% N;
          right = (mid+1)%N;
          if(arr[mid]<arr[left] && arr[mid]<arr[right]){
              res = mid;
              return res;
          }else if(arr[mid]<arr[0]){
              end = mid - 1;
          }else if(arr[mid]>arr[N-1]){
              start = mid +1;
          }
      }
      return res;
    }
}
