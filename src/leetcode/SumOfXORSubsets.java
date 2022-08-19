package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfXORSubsets {
    static List<List<Integer>> allSubsets = new ArrayList<List<Integer>>();
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] res = new int[arr.length];
        generateAllSubsets(arr ,res,-1,-1,arr.length);
    }
    public static void generateAllSubsets(int[] array,int[] res ,int idx,int current ,int N){
        if(idx==N){
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i]);
            }
            System.out.println();
            return;
        }
        idx++;
        generateAllSubsets(array,res,idx,current,N);
        current++;
        res[current] = array[idx];
        generateAllSubsets(array,res,idx,current,N);
    }
    public static List<Integer> getTakenArray(int[] array,boolean[] taken){
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < taken.length; i++) {
            if(taken[i]) res.add(array[i]);
        }
        return res;
    }
}
