package MasteringBinarySearch;

public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,5,6,7};
//        System.out.println(binarySearch(arr ,10));
//        System.out.println(binarySearch(arr ,2));
//        System.out.println(binarySearch(arr ,7));
//        System.out.println(binarySearch(arr ,1));
        System.out.println(firstAndLastOccurance(arr,4));
    }
    public static int binarySearch(int[] arr ,int el){
      int res = -1;
      int start = 0, end = arr.length-1;
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

    public static int[] firstAndLastOccurance( int[] arr,int el){
      int[] res = new int[2];
      res[0] = binarySearch(arr ,el);
      res[1] = res[0];
      int first = res[0];
      while (--first >= 0 && arr[first]==el){
          res[0]=first;
      }
        int last = res[1];
      while (++last<arr.length && arr[last]==el){
          res[1]=last;
      }
      System.out.println(res[0]+" "+res[1]);
      return res;
    }
}
