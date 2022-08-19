package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMissingNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            List<Integer> array = new ArrayList<Integer>();
            List<Integer> reault = new ArrayList<Integer>();
            for (int j = 0; j < N; j++) {
                array.add(sc.nextInt());
                reault.add(j+1);
            }
            Collections.sort(array);
            logic(N, array, reault);
        }
    }

    private static void logic(int N, List<Integer> array, List<Integer> reault) {
        int n=array.size();
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
            sum-=array.get(i);
        System.out.println(sum);
    }
}
