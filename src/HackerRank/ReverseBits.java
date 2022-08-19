package HackerRank;

import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
        sc.close();
    }
    public static long  solve( int num){
      long res = 0;
      int idx = 0;
      while (num!=0){
          if((num&1)==1){
              res+=1l<<(31-idx);
          }
          idx++;
          num=num>>1;
      }
      return res;
    }
}
