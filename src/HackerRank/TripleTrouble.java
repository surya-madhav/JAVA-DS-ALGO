package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class TripleTrouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                array.add(sc.nextInt());
            }
            logic(array ,n);
        }
    }
    public static void logic(ArrayList<Integer> array ,int n){

    }
}
