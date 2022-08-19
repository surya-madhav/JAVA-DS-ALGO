//package HackerRank;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class SumOfPairsAndMergeSOrt {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for (int i = 0; i < T; i++) {
//            int N = sc.nextInt();
//            int K = sc.nextInt();
//            int[] array = new int[N];
//            for (int j = 0; j < N; j++) {
//                array[i] = sc.nextInt();
//            }
//            int[] sortedArray = (array);
//            Boolean isKSumPossible = logic(sortedArray ,N ,K);
//        }
//    }
//
//    private static void sort(int[] array ,int left, int right) {
//        if(left < right){
//            int m = (left + (right-1))/2;
//            sort(array ,left ,m);
//            sort(array ,m+1, right);
//            merge(array,left ,m ,right);
//        }
//    }
//    private static int[] merge(int[] array,int left, int middle ,int right){
//        int leftLength = middle - left + 1;
//        int rightLength = right - middle;
//
//        int[] tempLeft = new int[leftLength];
//        int[] tempRight = new int[rightLength];
//
//        for (int i = 0; i < leftLength; i++) {
//            tempLeft[i] = array[left+i];
//        }
//        for (int i = 0; i < rightLength; i++) {
//            tempRight[i] = array[middle+1+i];
//        }
//        int leftArrayIndex = 0,rightArrayIndex = 0 ,index=left;
//
//    }
//    private static boolean logic(int[] sortedArray ,int N ,int K){
//
//
//        return false;
//    }
//}
