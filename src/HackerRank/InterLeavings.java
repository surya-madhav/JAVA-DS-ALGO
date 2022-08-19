package HackerRank;

import java.util.Scanner;

public class InterLeavings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            String output = "";
            System.out.println("Case #"+T+1+":");
            logic(s1,s2 ,output,0 ,0);
        }
    }
    public static void logic(String s1 ,String s2 ,String sb ,int idx1 ,int idx2){
        if(idx1==s1.length() && idx2==s2.length())
            System.out.println(sb);

        if(idx1<s1.length()){
            if(idx2<s2.length()){
                if(s1.charAt(idx1)<s2.charAt(idx2)){
                    logic(s1,s2,sb+(s1.charAt(idx1)),idx1+1,idx2);
                    logic(s1,s2,sb+ (s2.charAt(idx2)),idx1,idx2+1);
                }else{
                    logic(s1,s2,sb + (s2.charAt(idx2)),idx1,idx2+1);
                    logic(s1,s2,sb + (s1.charAt(idx1)),idx1+1,idx2);
                }
            }else{
                logic(s1,s2,sb + (s1.charAt(idx1)),idx1+1,idx2);
            }
        }else{
            if(idx2<s2.length()){
                logic(s1,s2,sb+ (s2.charAt(idx2)),idx1,idx2+1);
            }
        }

    }
}
