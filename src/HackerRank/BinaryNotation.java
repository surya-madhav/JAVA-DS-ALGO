package HackerRank;

import java.util.Scanner;

public class BinaryNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            printBinaryNotation(n);
        }
    }
    public static void printBinaryNotation(int n){
        if(n==0){
            System.out.println("0");
        }
        StringBuilder s = new StringBuilder();
        while (n!=0){
            if((n&1) == 0){
                s.insert(0, "0");
            }else{
                s.insert(0, "1");
            }
            n = n>>1;
        }
        System.out.println(s);
    }
}
