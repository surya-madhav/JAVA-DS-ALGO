package HkContest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CeilOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            logic(sc.nextInt() ,arr);
        }
    }
    public static void logic(int q, List<Integer> arr){
        Integer ceil = null;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)>=q){
                if(ceil==null && arr.get(i)>=q){
                    ceil = arr.get(i);
                }else if(arr.get(i)>=q && arr.get(i)<ceil){
                    ceil = arr.get(i);
                }
            }
        }
        if(ceil==null) ceil=2147483647;
        System.out.println(ceil);
    }
}
