package HackerRank;

import java.util.*;

public class TwoSetBits {
    static TreeMap<Long , List<Long>> hp = new TreeMap<Long ,List<Long>>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
//            System.out.println(solve(sc.nextLong()));
            solve2(sc.nextLong());
        }
    }
    public static long solve( long N){
      long res = 3;
      long left=1,right =0 ,last=1;
      if(hp.containsKey(N)){
          return hp.get(N).get(2);
      }else if(hp.lastEntry() != null && hp.lastEntry().getKey()<N){
          last = hp.lastEntry().getValue().get(0);
          left = hp.lastEntry().getValue().get(1);
          right = hp.lastEntry().getValue().get(2);
      }
      for (long i = last; i < N; i++) {
            if(left-right==1){
                left=left+1;
                right=0;
            }else{
                right=right+1;
            }
            res = (1<<left)+(1<<right);
            Long[] arr = {Long.valueOf(N),Long.valueOf(left), Long.valueOf(right)};
            hp.put(i , Arrays.asList(arr));
      }
      return res;
    }
    public static void solve2( long n){
        final long i = (((int) Math.sqrt((n << 3) - 1)) + 1) >>> 1;
        final long j =  (n - ((i*(i - 1)) >>> 1) - 1);                        // Print a long with the two bits set.
        System.out.println((1L << i) | (1L << j));
    }
}
