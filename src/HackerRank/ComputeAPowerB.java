package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComputeAPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = 0,b=0;
        for (int i = 0; i < T; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println((int)Math.pow(a,b)%1000000007);
        }
    }
    public static void logic(int a,int n){
        int ans = 1;
        while (n > 0)
        {
            int last_bit = (n & 1);
            // Check if current LSB
            // is set
            if (last_bit > 0)
            {
                ans = ans * a;
            }
            a = a * a;
            // Right shift
            n = n >> 1;
        }
        System.out.println(ans%1000000007);
    }

}
