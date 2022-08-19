package HkContest;

import java.util.Scanner;

public class NonevenInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            logic(N);
        }
    }
    public static void logic(long N){
        if(N%2==0 && N>2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
