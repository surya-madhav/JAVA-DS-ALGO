package HackerRank;

import java.util.Scanner;

public class SwapBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(solve(sc.nextInt()));
        }
        sc.close();
    }
    public static int solve( int n){
      int res = 0;
        for (int i = 0; i < 32; i=i+2) {
            if((n & 1)==1){
                res += (1<<i+1);
            }
            n = n>>1;
            if((n & 1)==1){
                res += (1<<i);
            }
            n = n>>1;
        }
        return res;
    }

}
