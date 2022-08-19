package HkContest;

import java.util.Scanner;

public class SumXor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            logic(N);
        }
    }
    public static void logic(long N){
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if((i+N)==(i^N)){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
