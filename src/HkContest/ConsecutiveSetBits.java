package HkContest;

import java.util.Scanner;

public class ConsecutiveSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            logic(N);
        }
    }
    public static void logic(long N){
        int max = 0;
        int count = 0;
        while (N != 0){
            if((N & 1) == 1){
//                Set bit
                count+=1;
            }else{
//                O so reset count and compare max
                if(count>max){
                    max = count;
                }
                count = 0;
            }
            N = N>>1;
            if(N==0){
                if(count>max){
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
}
