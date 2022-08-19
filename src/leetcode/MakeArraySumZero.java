package leetcode;

import java.util.*;

public class MakeArraySumZero {
    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5 ,6,9,10};
        TreeSet<Integer> tree = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            tree.add(nums[i]);
        }
        if(tree.contains(0)){tree.remove(0);}
        List<Integer> list = new ArrayList<Integer>(tree);
        int count = 0;
        while (list.size()!=0){
            int toSub = tree.first();
            for (int i = 0; i < list.size(); i++) {
                list.set(i,list.get(i)-toSub);
            }
            count++;
            tree = new TreeSet<>();
            for (int i = 0; i < list.size(); i++) {
                tree.add(list.get(i));
            }
            if(tree.contains(0)){tree.remove(0);}
            list = new ArrayList<Integer>(tree);
        }
        System.out.println(count);
    }
    public static int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int currentMinimum = -1;
        while (sum(nums)!=0){

        }
        return 0;
    }
    public static int sum(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i]+sum;
        }
        return sum;
    }
}
