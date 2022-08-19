package HackerRank;

import java.util.Scanner;

public class FlipBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(solve(a,b));
        }
    }
    public static int solve( int a,int b){
      int count = 0;
        while (a!=0 || b!=0){
            if ((a & 1) != (b & 1)) {
                count++;
            }
            a = a >> 1;
            b = b >> 1;
        }
      return count;
    }
}
