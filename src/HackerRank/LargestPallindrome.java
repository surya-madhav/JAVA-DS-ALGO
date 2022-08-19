package HackerRank;

import java.util.Scanner;

public class LargestPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            String str = sc.next();
            logic(str ,N);
        }
    }
    public static void  logic(String str ,int N){
      int ans = 0;
//      For Odd
        for (int i = 1; i < N; i++) {
//            i is the center
            int p1=i-1,p2=i+1,count=0;
            while (p1!=0 && p2!=N && str.charAt(p1)==str.charAt(p2)){
                p1--;
                p2++;
                count++;
            }
            ans = Integer.max(ans,p2-p1-1);
        }
//        For Even
        for (int i = 0; i < N; i++) {
            int p1=i,p2=i+1,count=0;
            while (p1>=0 && p2<N && str.charAt(p1)==str.charAt(p2)){
                p1--;
                p2++;
                count++;
            }
            ans = Integer.max(ans ,p2-p1-1);
        }
        System.out.println(ans);
    }
}
